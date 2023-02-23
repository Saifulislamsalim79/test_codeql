package ai.kudi.agent.dashboard.presenter;

import ai.kudi.agent.dashboard.domain.usecases.TransactionBreakDownSummary;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionBreakDownPresenter_Factory implements InterfaceC9468d<TransactionBreakDownPresenter> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<TransactionBreakDownSummary> transactionBreakDownSummaryProvider;

    public TransactionBreakDownPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.transactionBreakDownSummaryProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionBreakDownPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransactionBreakDownPresenter_Factory $r2 = new TransactionBreakDownPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionBreakDownPresenter newInstance(FetchCurrentUser fetchCurrentUser, TransactionBreakDownSummary transactionBreakDownSummary) {
        TransactionBreakDownPresenter $r2 = new TransactionBreakDownPresenter(fetchCurrentUser, transactionBreakDownSummary);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionBreakDownPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.transactionBreakDownSummaryProvider;
        Object $r22 = $r12.get();
        TransactionBreakDownSummary $r4 = (TransactionBreakDownSummary) $r22;
        TransactionBreakDownPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39230multiply() {
        TransactionBreakDownPresenter $r1 = multiply();
        return $r1;
    }
}
