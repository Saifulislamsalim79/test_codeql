package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.SavingsBalance;
import ai.kudi.agent.savings.data.viewdata.SavingsPlanViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.SavingsPlan;
import ai.kudi.agent.savings.viewmodel.SavingsPlanViewModel;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: SavingsPlanViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u000fJ\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u000fJ\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "savingsPlan", "Lai/kudi/agent/savings/usecase/SavingsPlan;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/savings/usecase/SavingsPlan;Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "getNavigator", "()Lai/kudi/agent/savings/navigator/SavingsNavigator;", "filterSavingsPlan", "", AttributeType.DATE, "Lai/kudi/agent/filter/domain/FilteredDate;", "initialData", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Initial;", "navigateToCreateSavings", "navigateToSavingHistory", "savingHistory", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "navigateToSavingsDetails", "savingResponse", "navigateToSavingsTransactions", "retrieveSavingPlan", "showProgress", "isVisible", "", "Companion", "TransactionsAndBalance", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsPlanViewModel extends BaseViewModel<SavingsPlanViewData> {
    public static final Companion Companion;
    private static final String FORMAT = "yyyy/MM/dd";
    private final Analytics analytics;
    private final SavingsNavigator navigator;
    private final SavingsPlan savingsPlan;

    /* compiled from: SavingsPlanViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel$Companion;", "", "()V", "FORMAT", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: SavingsPlanViewModel.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel$TransactionsAndBalance;", "", "balance", "", "transactions", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "(ILjava/util/List;)V", "getBalance", "()I", "getTransactions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransactionsAndBalance {
        private final int balance;
        private final List<SavingResponse> transactions;

        public TransactionsAndBalance(int i, List list) {
            Log_OC.getArray(list, "transactions");
            this.balance = i;
            this.transactions = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ TransactionsAndBalance copy$default(TransactionsAndBalance transactionsAndBalance, int $i0, List $r1, int i, Object obj) {
            int $i2 = i & 1;
            if ($i2 != 0) {
                $i0 = transactionsAndBalance.balance;
            }
            int $i1 = i & 2;
            if ($i1 != 0) {
                $r1 = transactionsAndBalance.transactions;
            }
            TransactionsAndBalance $r0 = transactionsAndBalance.copy($i0, $r1);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component1() {
            int i0 = this.balance;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component2() {
            List r1 = this.transactions;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionsAndBalance copy(int i, List list) {
            Log_OC.getArray(list, "transactions");
            TransactionsAndBalance $r0 = new TransactionsAndBalance(i, list);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof TransactionsAndBalance;
            if ($z0) {
                TransactionsAndBalance $r2 = (TransactionsAndBalance) obj;
                int $i1 = this.balance;
                int $i0 = $r2.balance;
                if ($i1 != $i0) {
                    return false;
                }
                List $r3 = this.transactions;
                List $r4 = $r2.transactions;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getBalance() {
            int i0 = this.balance;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getTransactions() {
            List r1 = this.transactions;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            int $i0 = this.balance;
            int $i1 = $i0 * 31;
            List $r1 = this.transactions;
            int $i02 = $r1.hashCode();
            return $i1 + $i02;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("TransactionsAndBalance(balance=");
            int $i0 = this.balance;
            $r2.append($i0);
            $r2.append(", transactions=");
            List $r3 = this.transactions;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public SavingsPlanViewModel(SavingsPlan savingsPlan, SavingsNavigator savingsNavigator, Analytics analytics) {
        Log_OC.getArray(savingsPlan, "savingsPlan");
        Log_OC.getArray(savingsNavigator, "navigator");
        Log_OC.getArray(analytics, "analytics");
        this.savingsPlan = savingsPlan;
        this.navigator = savingsNavigator;
        this.analytics = analytics;
        retrieveSavingPlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: filterSavingsPlan$lambda-0  reason: not valid java name */
    public static final void m40628filterSavingsPlan$lambda0(SavingsPlanViewModel savingsPlanViewModel, List list) {
        Log_OC.getArray(savingsPlanViewModel, "this$0");
        SavingsPlanViewData.ShowProgress $r2 = new SavingsPlanViewData.ShowProgress(false);
        savingsPlanViewModel.publish($r2);
        Log_OC.loadImage(list, "it");
        SavingsPlanViewData.Success $r3 = new SavingsPlanViewData.Success(list);
        savingsPlanViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: filterSavingsPlan$lambda-1  reason: not valid java name */
    public static final void m40629filterSavingsPlan$lambda1(SavingsPlanViewModel savingsPlanViewModel, Throwable th) {
        Log_OC.getArray(savingsPlanViewModel, "this$0");
        SavingsPlanViewData.ShowProgress $r2 = new SavingsPlanViewData.ShowProgress(false);
        savingsPlanViewModel.publish($r2);
        SavingsPlanViewData.Error $r3 = SavingsPlanViewData.Error.INSTANCE;
        savingsPlanViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void retrieveSavingPlan() {
        SavingsPlan $r1 = this.savingsPlan;
        AbstractC11688p $r2 = $r1.getBalance();
        SavingsPlan $r12 = this.savingsPlan;
        AbstractC11688p $r3 = $r12.fetchAllSavings();
        C0495c $r4 = C0495c.f1307d;
        FavoritesArrayAdapter $r7 = AbstractC11688p.m10491r0($r2, $r3, $r4).e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsPlanViewModel $r13 = SavingsPlanViewModel.this;
                SavingsPlanViewModel.TransactionsAndBalance $r32 = (SavingsPlanViewModel.TransactionsAndBalance) obj;
                SavingsPlanViewModel.m40631retrieveSavingPlan$lambda3($r13, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsPlanViewModel $r13 = SavingsPlanViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingsPlanViewModel.m40632retrieveSavingPlan$lambda4($r13, $r32);
            }
        });
        Log_OC.loadImage($r7, "zip(\n            savingsPlan.getBalance(), savingsPlan.fetchAllSavings()\n        ) { balanceResponse, savingResponse ->\n            TransactionsAndBalance(balanceResponse.totalSavings, savingResponse)\n        }.subscribe(\n            {\n                publish(SavingsPlanViewData.Plans(it))\n            },\n            {\n                publish(SavingsPlanViewData.Error)\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavingPlan$lambda-2  reason: not valid java name */
    public static final TransactionsAndBalance m40630retrieveSavingPlan$lambda2(SavingsBalance savingsBalance, List list) {
        Log_OC.getArray(savingsBalance, "balanceResponse");
        Log_OC.getArray(list, "savingResponse");
        int $i0 = savingsBalance.getTotalSavings();
        TransactionsAndBalance $r2 = new TransactionsAndBalance($i0, list);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavingPlan$lambda-3  reason: not valid java name */
    public static final void m40631retrieveSavingPlan$lambda3(SavingsPlanViewModel savingsPlanViewModel, TransactionsAndBalance transactionsAndBalance) {
        Log_OC.getArray(savingsPlanViewModel, "this$0");
        Log_OC.loadImage(transactionsAndBalance, "it");
        SavingsPlanViewData.Plans $r2 = new SavingsPlanViewData.Plans(transactionsAndBalance);
        savingsPlanViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavingPlan$lambda-4  reason: not valid java name */
    public static final void m40632retrieveSavingPlan$lambda4(SavingsPlanViewModel savingsPlanViewModel, Throwable th) {
        Log_OC.getArray(savingsPlanViewModel, "this$0");
        SavingsPlanViewData.Error $r2 = SavingsPlanViewData.Error.INSTANCE;
        savingsPlanViewModel.publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void filterSavingsPlan(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, AttributeType.DATE);
        SavingsPlanViewData.ShowProgress $r2 = new SavingsPlanViewData.ShowProgress(true);
        publish($r2);
        SavingsPlan $r3 = this.savingsPlan;
        Date $r4 = filteredDate.getFrom();
        String $r5 = DateExtKt.formatWithStyle$default($r4, FORMAT, null, 2, null);
        Date $r42 = filteredDate.getTo();
        String $r6 = DateExtKt.formatWithStyle$default($r42, FORMAT, null, 2, null);
        AbstractC11688p $r7 = $r3.fetchSavingByDate($r5, $r6);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.AndFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsPlanViewModel $r1 = SavingsPlanViewModel.this;
                List $r32 = (List) obj;
                SavingsPlanViewModel.m40628filterSavingsPlan$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.Call
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsPlanViewModel $r1 = SavingsPlanViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingsPlanViewModel.m40629filterSavingsPlan$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "savingsPlan.fetchSavingByDate(\n            date.from.formatWithStyle(FORMAT), date.to.formatWithStyle(FORMAT)\n        ).subscribe(\n            {\n                publish(SavingsPlanViewData.ShowProgress(false))\n                publish(SavingsPlanViewData.Success(it))\n            },\n            {\n                publish(SavingsPlanViewData.ShowProgress(false))\n                publish(SavingsPlanViewData.Error)\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsNavigator getNavigator() {
        SavingsNavigator r1 = this.navigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SavingsPlanViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SavingsPlanViewData.Initial initialData() {
        SavingsPlanViewData.Initial r1 = SavingsPlanViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToCreateSavings() {
        Analytics $r1 = this.analytics;
        $r1.launchCreateSavingScreen();
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToCreateSaving();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingHistory(List list) {
        Log_OC.getArray(list, "savingHistory");
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToSavingsHistory(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingsDetails(SavingResponse savingResponse) {
        Log_OC.getArray(savingResponse, "savingResponse");
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToSavingsDetail(savingResponse);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingsTransactions() {
        SavingsNavigator $r1 = this.navigator;
        $r1.navigateToSavings();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showProgress(boolean z) {
        SavingsNavigator $r1 = this.navigator;
        $r1.displayProgressBar(z);
    }
}
