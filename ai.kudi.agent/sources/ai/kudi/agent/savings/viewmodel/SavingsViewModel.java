package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.SavingsBalance;
import ai.kudi.agent.savings.data.repository.SavingsRepository;
import ai.kudi.agent.savings.data.viewdata.SavingsViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import androidx.lifecycle.C1552e0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlinx.coroutines.InterfaceC13932m0;
import p201g.p259r.C8013r0;
import p201g.p259r.C8036u0;
import p201g.p259r.p260o1.C7991a;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: SavingsViewModel.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0012J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0002J(\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u001fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "savingsRepository", "Lai/kudi/agent/savings/data/repository/SavingsRepository;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/savings/data/repository/SavingsRepository;Lai/kudi/agent/core/util/ResourceDelegate;Lai/kudi/agent/savings/navigator/SavingsNavigator;)V", "existingDays", "", "", "getNavigator", "()Lai/kudi/agent/savings/navigator/SavingsNavigator;", "getSavingBalance", "", "getSavingsTransaction", "planId", "initialData", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Initial;", "map", MetricTracker.Object.INPUT, "Ljava/util/Date;", "retrieveSavings", "shouldAddHeader", "", AttributeType.DATE, "transformation", "Lio/reactivex/Flowable;", "Landroidx/paging/PagingData;", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "flowable", "Lai/kudi/agent/savings/data/model/SavingTransactionItem;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsViewModel extends BaseViewModel<SavingsViewData> {
    private final FetchCurrentUser currentUser;
    private final Set<String> existingDays;
    private final SavingsNavigator navigator;
    private final ResourceDelegate resource;
    private final SavingsRepository savingsRepository;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingsViewModel(FetchCurrentUser fetchCurrentUser, SavingsRepository savingsRepository, ResourceDelegate resourceDelegate, SavingsNavigator savingsNavigator) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(savingsRepository, "savingsRepository");
        Log_OC.getArray(resourceDelegate, "resource");
        Log_OC.getArray(savingsNavigator, "navigator");
        this.currentUser = fetchCurrentUser;
        this.savingsRepository = savingsRepository;
        this.resource = resourceDelegate;
        this.navigator = savingsNavigator;
        LinkedHashSet $r5 = new LinkedHashSet();
        this.existingDays = $r5;
        retrieveSavings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String formatDate(Date date) {
        boolean $z0 = DateExtKt.isToday(date);
        if ($z0) {
            ResourceDelegate $r2 = this.resource;
            int $i0 = C0456R.string.today;
            String $r3 = $r2.getString($i0);
            return $r3;
        }
        boolean $z02 = DateExtKt.isYesterday(date);
        if ($z02) {
            ResourceDelegate $r22 = this.resource;
            int $i02 = C0456R.string.yesterday;
            String $r32 = $r22.getString($i02);
            return $r32;
        }
        TimeZone $r4 = TimeZone.getDefault();
        Log_OC.loadImage($r4, "getDefault()");
        String $r33 = DateExtKt.formatWithStyle(date, "EEEE, dd MMM, yyyy", $r4);
        return $r33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getSavingBalance$lambda-2  reason: not valid java name */
    public static final void m40641getSavingBalance$lambda2(SavingsViewModel savingsViewModel, SavingsBalance savingsBalance) {
        Log_OC.getArray(savingsViewModel, "this$0");
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(false);
        savingsViewModel.publish($r2);
        int $i0 = savingsBalance.getTotalSavings();
        SavingsViewData.TotalBalance $r3 = new SavingsViewData.TotalBalance($i0);
        savingsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getSavingBalance$lambda-3  reason: not valid java name */
    public static final void m40642getSavingBalance$lambda3(SavingsViewModel savingsViewModel, Throwable th) {
        Log_OC.getArray(savingsViewModel, "this$0");
        th.printStackTrace();
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(false);
        savingsViewModel.publish($r2);
        SavingsViewData.Error $r3 = SavingsViewData.Error.INSTANCE;
        savingsViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void getSavingsTransaction$default(SavingsViewModel savingsViewModel, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        savingsViewModel.getSavingsTransaction($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getSavingsTransaction$lambda-5  reason: not valid java name */
    public static final void m40643getSavingsTransaction$lambda5(SavingsViewModel savingsViewModel, String str, User user) {
        AbstractC11293f $r4;
        Log_OC.getArray(savingsViewModel, "this$0");
        SavingsViewData.ShowProgress $r3 = new SavingsViewData.ShowProgress(false);
        savingsViewModel.publish($r3);
        if (str == null) {
            $r4 = null;
        } else {
            SavingsRepository $r5 = savingsViewModel.savingsRepository;
            String $r6 = user.getSessionId();
            Log_OC.loadImage($r6, "user.sessionId");
            AbstractC11293f $r42 = $r5.getSavingsTransactionById($r6, str);
            $r4 = savingsViewModel.transformation($r42);
        }
        if ($r4 == null) {
            SavingsRepository $r52 = savingsViewModel.savingsRepository;
            String $r1 = user.getSessionId();
            Log_OC.loadImage($r1, "user.sessionId");
            AbstractC11293f $r43 = $r52.getSavingsTransaction($r1);
            $r4 = savingsViewModel.transformation($r43);
        }
        SavingsViewData.SavingTransactions $r7 = new SavingsViewData.SavingTransactions($r4);
        savingsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getSavingsTransaction$lambda-6  reason: not valid java name */
    public static final void m40644getSavingsTransaction$lambda6(SavingsViewModel savingsViewModel, Throwable th) {
        Log_OC.getArray(savingsViewModel, "this$0");
        th.printStackTrace();
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(false);
        savingsViewModel.publish($r2);
        SavingsViewData.Error $r3 = SavingsViewData.Error.INSTANCE;
        savingsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavings$lambda-0  reason: not valid java name */
    public static final void m40645retrieveSavings$lambda0(SavingsViewModel savingsViewModel, List list) {
        Log_OC.getArray(savingsViewModel, "this$0");
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(false);
        savingsViewModel.publish($r2);
        Log_OC.loadImage(list, "it");
        boolean $z0 = list.isEmpty();
        SavingsViewData.Success $r3 = new SavingsViewData.Success(!$z0);
        savingsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavings$lambda-1  reason: not valid java name */
    public static final void m40646retrieveSavings$lambda1(SavingsViewModel savingsViewModel, Throwable th) {
        Log_OC.getArray(savingsViewModel, "this$0");
        th.printStackTrace();
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(false);
        savingsViewModel.publish($r2);
        SavingsViewData.Error $r3 = SavingsViewData.Error.INSTANCE;
        savingsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean shouldAddHeader(String str) {
        if (str == null) {
            return false;
        }
        Date $r3 = StringExtKt.formatKudiDateAlt2(str);
        Object $r2 = formatDate($r3);
        Set $r1 = this.existingDays;
        boolean $z0 = $r1.contains($r2);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11293f transformation(AbstractC11293f abstractC11293f) {
        InterfaceC13932m0 $r2 = C1552e0.a(this);
        AbstractC11293f $r1 = C7991a.m16921a(abstractC11293f, $r2);
        C0493DD $r3 = C0493DD.ONE;
        AbstractC11293f $r12 = $r1.m11162w($r3).m11162w(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsViewModel $r13 = SavingsViewModel.this;
                C8013r0 $r22 = (C8013r0) obj;
                return SavingsViewModel.m40648transformation$lambda8($r13, $r22);
            }
        });
        Log_OC.loadImage($r12, "flowable.cachedIn(viewModelScope)\n            .map { pagingData ->\n                pagingData.map { item ->\n                    SavingsItemModel.SavingsTransaction(item.toSavingItemModel())\n                }\n            }\n            .map { pagingData ->\n                pagingData.insertSeparators { _, s2 ->\n                    when {\n                        shouldAddHeader(s2?.transaction?.transactionDate) -> {\n                            val header = map(formatKudiDateAlt2(s2?.transaction?.transactionDate!!))\n                            existingDays.add(header)\n                            SavingsTransactionDate(header)\n                        }\n                        else -> null\n                    }\n                }\n            }");
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transformation$lambda-7  reason: not valid java name */
    public static final C8013r0 m40647transformation$lambda7(C8013r0 c8013r0) {
        Log_OC.getArray(c8013r0, "pagingData");
        SavingsViewModel$transformation$1$1 $r1 = new SavingsViewModel$transformation$1$1(null);
        C8013r0 $r0 = C8036u0.m16836c(c8013r0, $r1);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transformation$lambda-8  reason: not valid java name */
    public static final C8013r0 m40648transformation$lambda8(SavingsViewModel savingsViewModel, C8013r0 c8013r0) {
        Log_OC.getArray(savingsViewModel, "this$0");
        Log_OC.getArray(c8013r0, "pagingData");
        SavingsViewModel$transformation$2$1 $r2 = new SavingsViewModel$transformation$2$1(savingsViewModel, null);
        C8013r0 $r0 = C8036u0.m16837b(c8013r0, null, $r2, 1, null);
        return $r0;
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
    public final void getSavingBalance() {
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(true);
        publish($r2);
        SavingsRepository $r3 = this.savingsRepository;
        AbstractC11688p $r4 = $r3.getBalance();
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.PacketExtensionFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsViewModel $r1 = SavingsViewModel.this;
                SavingsBalance $r32 = (SavingsBalance) obj;
                SavingsViewModel.m40641getSavingBalance$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.PacketTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsViewModel $r1 = SavingsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingsViewModel.m40642getSavingBalance$lambda3($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "savingsRepository.getBalance().subscribe(\n            {\n                publish(SavingsViewData.ShowProgress(false))\n                publish(SavingsViewData.TotalBalance(it.totalSavings))\n            },\n            {\n                it.printStackTrace()\n                publish(SavingsViewData.ShowProgress(false))\n                publish(SavingsViewData.Error)\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getSavingsTransaction(final String str) {
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        FavoritesArrayAdapter $r7 = $r4.s(new Object() { // from class: ai.kudi.agent.savings.viewmodel.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsViewModel $r1 = SavingsViewModel.this;
                String $r22 = str;
                User $r42 = (User) obj;
                SavingsViewModel.m40643getSavingsTransaction$lambda5($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.Track
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsViewModel $r1 = SavingsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingsViewModel.m40644getSavingsTransaction$lambda6($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "currentUser.execute().subscribe(\n            { user ->\n                publish(SavingsViewData.ShowProgress(false))\n                val data = planId?.let {\n                    transformation(\n                        savingsRepository.getSavingsTransactionById(user.sessionId, it)\n                    )\n                } ?: transformation(\n                    savingsRepository.getSavingsTransaction(user.sessionId)\n                )\n                publish(SavingsViewData.SavingTransactions(data))\n            },\n            {\n                it.printStackTrace()\n                publish(SavingsViewData.ShowProgress(false))\n                publish(SavingsViewData.Error)\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SavingsViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SavingsViewData.Initial initialData() {
        SavingsViewData.Initial r1 = SavingsViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void retrieveSavings() {
        SavingsViewData.ShowProgress $r2 = new SavingsViewData.ShowProgress(true);
        publish($r2);
        SavingsRepository $r3 = this.savingsRepository;
        AbstractC11688p $r4 = $r3.fetchAllSavings();
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.FromContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsViewModel $r1 = SavingsViewModel.this;
                List $r32 = (List) obj;
                SavingsViewModel.m40645retrieveSavings$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsViewModel $r1 = SavingsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingsViewModel.m40646retrieveSavings$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "savingsRepository.fetchAllSavings().subscribe(\n            {\n                publish(SavingsViewData.ShowProgress(false))\n                publish(SavingsViewData.Success(it.isNotEmpty()))\n            },\n            {\n                it.printStackTrace()\n                publish(SavingsViewData.ShowProgress(false))\n                publish(SavingsViewData.Error)\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }
}
