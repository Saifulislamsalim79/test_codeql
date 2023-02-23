package ai.kudi.agent.inbox.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.issues.domain.FetchTickets;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class InboxListPresenter_Factory implements InterfaceC9468d<InboxListPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchTickets> fetchTicketsProvider;
    private final InterfaceC11700a<InboxNavigator> inboxNavigatorProvider;

    public InboxListPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.fetchTicketsProvider = interfaceC11700a2;
        this.inboxNavigatorProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InboxListPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        InboxListPresenter_Factory $r4 = new InboxListPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InboxListPresenter newInstance(FetchCurrentUser fetchCurrentUser, FetchTickets fetchTickets, InboxNavigator inboxNavigator, Analytics analytics) {
        InboxListPresenter $r4 = new InboxListPresenter(fetchCurrentUser, fetchTickets, inboxNavigator, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InboxListPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchTicketsProvider;
        Object $r22 = $r12.get();
        FetchTickets $r4 = (FetchTickets) $r22;
        InterfaceC11700a $r13 = this.inboxNavigatorProvider;
        Object $r23 = $r13.get();
        InboxNavigator $r5 = (InboxNavigator) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InboxListPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39339multiply() {
        InboxListPresenter $r1 = multiply();
        return $r1;
    }
}
