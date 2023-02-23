package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.FetchTicket;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DisputePresenter_Factory implements InterfaceC9468d<DisputePresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchTicket> fetchTicketProvider;
    private final InterfaceC11700a<FetchTransaction> fetchTransactionProvider;

    public DisputePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchTransactionProvider = interfaceC11700a;
        this.fetchTicketProvider = interfaceC11700a2;
        this.currentUserProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DisputePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        DisputePresenter_Factory $r4 = new DisputePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DisputePresenter newInstance(FetchTransaction fetchTransaction, FetchTicket fetchTicket, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        DisputePresenter $r4 = new DisputePresenter(fetchTransaction, fetchTicket, fetchCurrentUser, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DisputePresenter multiply() {
        InterfaceC11700a $r1 = this.fetchTransactionProvider;
        Object $r2 = $r1.get();
        FetchTransaction $r3 = (FetchTransaction) $r2;
        InterfaceC11700a $r12 = this.fetchTicketProvider;
        Object $r22 = $r12.get();
        FetchTicket $r4 = (FetchTicket) $r22;
        InterfaceC11700a $r13 = this.currentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        DisputePresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39380multiply() {
        DisputePresenter $r1 = multiply();
        return $r1;
    }
}
