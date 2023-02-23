package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.EventType;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.issues.views.TransactionListView;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactions.domain.usecases.FetchTransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.FetchTransactions;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import p272h.p364d.p365a.p366c.C9410b;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: TransactionListPresenter.kt */
@Metadata(m10422d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010'\u001a\u00020(H\u0016J^\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u001b2\u001c\u0010.\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001c0\u00192\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\u001bH\u0004J\u0010\u00102\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0012H\u0004JV\u00103\u001a\u00020(2\b\b\u0002\u00101\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\r2\b\b\u0002\u00100\u001a\u00020\r2\b\b\u0002\u0010/\u001a\u00020\r2\b\b\u0002\u00104\u001a\u000205J \u00106\u001a\u00020(2\u0006\u0010+\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0002J \u00109\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001c2\u0006\u0010:\u001a\u00020\u001bH\u0002J\u000e\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020(H\u0002JD\u0010?\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001c0\u00192\u001c\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001c0\u00192\u0006\u0010@\u001a\u00020\u0012H\u0002J\u0006\u0010A\u001a\u00020(J\u0010\u0010B\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0012H\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001c0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/TransactionListPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/TransactionListView;", "fetchTransactions", "Lai/kudi/agent/transactions/domain/usecases/FetchTransactions;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/transactions/domain/usecases/FetchTransactions;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "", "()Z", "setLoading", "(Z)V", "page", "", "getPage", "()I", "setPage", "(I)V", "shouldLoadNext", "transactions", "", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "getTransactions", "()Ljava/util/List;", "setTransactions", "(Ljava/util/List;)V", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "handleTransactionsList", "isCurrentPageOnFilteredPage", "type", "from", "to", "it", "resetLastIdx", "isOnFragmentPage", TransactionField.STATUS, "hideLoading", "loadNext", "scope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "logOnClickedTransactionFilterSubmissionEvent", "timeFrom", "timeTo", "makeDateMap", TransactionField.TIME, "navigateToTransactionBreakDownPage", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "onDateFilterViewClicked", "preProcessTransactions", "lastIdx", "showDialog", "showLoading", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionListPresenter extends C9410b<TransactionListView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchTransactions fetchTransactions;
    private boolean isLoading;
    private int page;
    private boolean shouldLoadNext;
    private List<? extends HashMap<String, String>> transactions;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionListPresenter(FetchTransactions fetchTransactions, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        List $r3;
        Log_OC.getArray(fetchTransactions, "fetchTransactions");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchTransactions = fetchTransactions;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        $r3 = C13726r.m3891e();
        this.transactions = $r3;
        this.shouldLoadNext = true;
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleTransactionsList$lambda-2  reason: not valid java name */
    public static final void m39439handleTransactionsList$lambda2(TransactionListPresenter transactionListPresenter, String str, String str2, boolean z, String str3, String str4, TransactionListView transactionListView) {
        boolean $z0;
        boolean $z02;
        boolean $z1;
        boolean $z12;
        Log_OC.getArray(transactionListPresenter, "this$0");
        Log_OC.getArray(str, "$from");
        Log_OC.getArray(str2, "$to");
        Log_OC.getArray(str3, "$type");
        Log_OC.getArray(str4, "$status");
        Log_OC.getArray(transactionListView, "view");
        List $r6 = transactionListPresenter.getTransactions();
        boolean $z13 = $r6.isEmpty();
        if ($z13) {
            $z1 = C13276s.m5440u(str);
            if (!$z1) {
                $z12 = C13276s.m5440u(str2);
                if ((!$z12) && !z) {
                    transactionListView.showFeedbackMsg("Transaction not found with filtered values");
                    return;
                }
            }
        }
        List $r62 = transactionListPresenter.getTransactions();
        boolean $z03 = $r62.isEmpty();
        if ($z03) {
            transactionListView.hideLoading();
            transactionListView.hideNextLoading();
            transactionListView.showEmptyTransactionView();
            return;
        }
        $z0 = C13276s.m5440u(str3);
        if (!$z0) {
            $z02 = C13276s.m5440u(str4);
            if (!$z02) {
                return;
            }
        }
        List $r63 = transactionListPresenter.getTransactions();
        transactionListView.showTransactions($r63);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-3  reason: not valid java name */
    public static final void m39440hideLoading$lambda3(TransactionListView transactionListView) {
        Log_OC.getArray(transactionListView, "it");
        transactionListView.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-4  reason: not valid java name */
    public static final void m39441hideLoading$lambda4(TransactionListView transactionListView) {
        Log_OC.getArray(transactionListView, "it");
        transactionListView.hideNextLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void loadNext$default(TransactionListPresenter transactionListPresenter, String $r1, String $r2, String $r3, String $r4, boolean $z0, boolean $z1, boolean $z2, TransactionHistoryScope $r5, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = "";
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = "all";
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r3 = "";
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r4 = "";
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $z0 = false;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $z1 = false;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z2 = false;
        }
        int $i0 = i & 128;
        if ($i0 != 0) {
            $r5 = TransactionHistoryScope.AllTransactions.INSTANCE;
        }
        transactionListPresenter.loadNext($r1, $r2, $r3, $r4, $z0, $z1, $z2, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-0  reason: not valid java name */
    public static final void m39442loadNext$lambda0(TransactionListPresenter transactionListPresenter, boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4, List list) {
        Log_OC.getArray(transactionListPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(str2, "$from");
        Log_OC.getArray(str3, "$to");
        Log_OC.getArray(str4, "$status");
        Log_OC.loadImage(list, "it");
        transactionListPresenter.handleTransactionsList(z, str, str2, str3, list, z2, z3, str4);
        int $i0 = transactionListPresenter.getPage();
        transactionListPresenter.hideLoading($i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-1  reason: not valid java name */
    public static final void m39443loadNext$lambda1(TransactionListPresenter transactionListPresenter, Throwable th) {
        Log_OC.getArray(transactionListPresenter, "this$0");
        th.printStackTrace();
        int $i0 = transactionListPresenter.getPage();
        transactionListPresenter.hideLoading($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logOnClickedTransactionFilterSubmissionEvent(final String str, final String str2, final String str3) {
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r52 = $r5.u($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11696w $r53 = $r52.n($r62);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionListPresenter $r1 = TransactionListPresenter.this;
                String $r2 = str;
                String $r3 = str2;
                String $r42 = str3;
                User $r63 = (User) obj;
                TransactionListPresenter.m39444logOnClickedTransactionFilterSubmissionEvent$lambda5($r1, $r2, $r3, $r42, $r63);
            }
        };
        C0260k $r8 = C0260k.f454a;
        FavoritesArrayAdapter $r9 = $r53.s(object, $r8);
        Log_OC.loadImage($r9, "fetchCurrentUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onTransactionFilterSubmitButtonClickedEvent(type, timeFrom, timeTo, it)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r10 = this.compositeDisposable;
        $r10.b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logOnClickedTransactionFilterSubmissionEvent$lambda-5  reason: not valid java name */
    public static final void m39444logOnClickedTransactionFilterSubmissionEvent$lambda5(TransactionListPresenter transactionListPresenter, String str, String str2, String str3, User user) {
        Log_OC.getArray(transactionListPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(str2, "$timeFrom");
        Log_OC.getArray(str3, "$timeTo");
        Analytics $r5 = transactionListPresenter.analytics;
        $r5.onTransactionFilterSubmitButtonClickedEvent(str, str2, str3, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final HashMap makeDateMap(String str) {
        HashMap $r4;
        C13287o $r3 = C13664u.m4227a(TransactionField.TIME, str);
        C13287o $r32 = C13664u.m4227a("isDateView", "true");
        C13287o[] $r2 = {$r3, $r32};
        $r4 = C13727r0.m3879m($r2);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToTransactionBreakDownPage$lambda-8  reason: not valid java name */
    public static final void m39446navigateToTransactionBreakDownPage$lambda8(FilteredDate filteredDate, TransactionListView transactionListView) {
        Log_OC.getArray(filteredDate, "$filteredDate");
        Log_OC.getArray(transactionListView, "view");
        transactionListView.navigateToTransactionBreakDownPage(filteredDate);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onDateFilterViewClicked() {
        Analytics $r1 = this.analytics;
        EventType.DashboardParameters $r4 = EventType.DashboardParameters.DATE_TO_FILTER_CLICKED;
        String $r3 = String.valueOf($r4);
        User $r2 = this.user;
        $r1.onDashboardEvent($r3, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final List preProcessTransactions(List list, int i) {
        int $i1;
        String $r4;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            return list;
        }
        ArrayList $r2 = new ArrayList();
        List $r3 = list.subList(0, Math.max(0, i));
        $r2.addAll($r3);
        $i1 = C13726r.m3889g(list);
        if (i > $i1) {
            return $r2;
        }
        while (true) {
            int $i2 = i + 1;
            if (i == 0) {
                Object $r5 = list.get(i);
                HashMap $r6 = (HashMap) $r5;
                Object $r52 = $r6.get(TransactionField.TIME);
                String $r7 = (String) $r52;
                $r4 = $r7 != null ? $r7 : "24/07/2018";
                HashMap $r62 = makeDateMap($r4);
                $r2.add($r62);
            } else {
                int $i3 = i - 1;
                Object $r53 = list.get($i3);
                HashMap $r63 = (HashMap) $r53;
                Object $r54 = $r63.get(TransactionField.TIME);
                String $r72 = (String) $r54;
                Date $r8 = StringExtKt.formatKudiDate($r72);
                Object $r55 = list.get(i);
                HashMap $r64 = (HashMap) $r55;
                Object $r56 = $r64.get(TransactionField.TIME);
                String $r73 = (String) $r56;
                Date $r9 = StringExtKt.formatKudiDate($r73);
                boolean $z02 = DateExtKt.areDifferentDays($r8, $r9);
                if ($z02) {
                    Object $r57 = list.get(i);
                    HashMap $r65 = (HashMap) $r57;
                    Object $r58 = $r65.get(TransactionField.TIME);
                    String $r74 = (String) $r58;
                    $r4 = $r74 != null ? $r74 : "24/07/2018";
                    HashMap $r66 = makeDateMap($r4);
                    $r2.add($r66);
                }
            }
            Object $r59 = list.get(i);
            $r2.add($r59);
            if (i == $i1) {
                return $r2;
            }
            i = $i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-7  reason: not valid java name */
    public static final void m39447showDialog$lambda7(TransactionListView transactionListView) {
        Log_OC.getArray(transactionListView, "view");
        transactionListView.showFilterDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11214d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getPage() {
        int i0 = this.page;
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
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final void handleTransactionsList(boolean z, final String str, final String str2, final String str3, List $r5, boolean z2, final boolean z3, final String str4) {
        List $r6;
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, "from");
        Log_OC.getArray(str3, "to");
        Log_OC.getArray($r5, "it");
        Log_OC.getArray(str4, TransactionField.STATUS);
        if (z) {
            logOnClickedTransactionFilterSubmissionEvent(str, str2, str3);
        }
        boolean $z3 = $r5.isEmpty();
        int $i0 = 0;
        if ($z3) {
            this.shouldLoadNext = false;
        }
        if (z2) {
            $r6 = C13726r.m3891e();
            this.transactions = $r6;
        } else {
            List $r62 = this.transactions;
            $i0 = $r62.size();
        }
        if (!z) {
            List $r63 = this.transactions;
            $r5 = C13742z.m3784n0($r63, $r5);
        }
        this.transactions = preProcessTransactions($r5, $i0);
        int $i02 = this.page;
        hideLoading($i02);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                TransactionListPresenter $r2 = TransactionListPresenter.this;
                String $r3 = str2;
                String $r4 = str3;
                boolean $z0 = z3;
                String $r52 = str;
                String $r64 = str4;
                TransactionListView $r7 = (TransactionListView) obj;
                TransactionListPresenter.m39439handleTransactionsList$lambda2($r2, $r3, $r4, $z0, $r52, $r64, $r7);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final void hideLoading(int i) {
        this.isLoading = false;
        if (i == 1) {
            Device $r1 = Device.settings;
            ifViewAttached($r1);
            return;
        }
        Settings $r2 = Settings.settings;
        ifViewAttached($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoading() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadNext(final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2, final boolean z3, TransactionHistoryScope transactionHistoryScope) {
        int $i0;
        boolean $z3;
        boolean $z32;
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "type");
        Log_OC.getArray(str3, "from");
        Log_OC.getArray(str4, "to");
        Log_OC.getArray(transactionHistoryScope, "scope");
        boolean $z33 = this.shouldLoadNext;
        if (!$z33) {
            $z3 = C13276s.m5440u(str3);
            if ($z3) {
                $z32 = C13276s.m5440u(str4);
                if ($z32) {
                    return;
                }
            }
        }
        boolean $z34 = this.isLoading;
        if ($z34) {
            return;
        }
        if (z || z3) {
            this.page = 0;
            $i0 = 0;
        } else {
            $i0 = this.page;
            int $i1 = $i0 + 1;
            this.page = $i1;
        }
        int $i12 = this.page;
        showLoading($i12);
        FetchTransactions.Companion $r6 = FetchTransactions.Companion;
        int $i13 = $r6.getCOMPLETED();
        String $r7 = transactionHistoryScope.scopeId();
        FetchTransactionRequest $r8 = new FetchTransactionRequest($i13, $i0, str2, str, str3, str4, null, $r7, 64, null);
        FetchTransactions $r9 = this.fetchTransactions;
        AbstractC11688p $r10 = $r9.execute($r8);
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.PlotStatistics
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionListPresenter $r2 = TransactionListPresenter.this;
                boolean $z0 = z;
                String $r3 = str2;
                String $r4 = str3;
                String $r5 = str4;
                boolean $z1 = z3;
                boolean $z2 = z2;
                String $r62 = str;
                List $r72 = (List) obj;
                TransactionListPresenter.m39442loadNext$lambda0($r2, $z0, $r3, $r4, $r5, $z1, $z2, $r62, $r72);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionListPresenter $r1 = TransactionListPresenter.this;
                Throwable $r3 = (Throwable) obj;
                TransactionListPresenter.m39443loadNext$lambda1($r1, $r3);
            }
        });
        C11280b $r14 = this.compositeDisposable;
        $r14.b($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToTransactionBreakDownPage(final FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "filteredDate");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                FilteredDate $r1 = FilteredDate.this;
                TransactionListView $r3 = (TransactionListView) obj;
                TransactionListPresenter.m39446navigateToTransactionBreakDownPage$lambda8($r1, $r3);
            }
        });
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setTransactions(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.transactions = list;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDialog() {
        onDateFilterViewClicked();
        Format $r1 = Format.TAG;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final void showLoading(int i) {
        this.isLoading = true;
        if (i == 0) {
            LoginListener $r1 = getView();
            TransactionListView $r2 = (TransactionListView) $r1;
            $r2.showLoading();
            return;
        }
        LoginListener $r12 = getView();
        TransactionListView $r22 = (TransactionListView) $r12;
        $r22.showNextLoading();
    }
}
