package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.FetchTickets;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IssueHistoryPresenter_Factory implements InterfaceC9468d<IssueHistoryPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchTickets> fetchTicketsProvider;
    private final InterfaceC11700a<IssueTypeHomeNavigator> issueTypeHomeNavigatorProvider;

    public IssueHistoryPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.fetchTicketsProvider = interfaceC11700a2;
        this.issueTypeHomeNavigatorProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueHistoryPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        IssueHistoryPresenter_Factory $r4 = new IssueHistoryPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueHistoryPresenter newInstance(FetchCurrentUser fetchCurrentUser, FetchTickets fetchTickets, IssueTypeHomeNavigator issueTypeHomeNavigator, Analytics analytics) {
        IssueHistoryPresenter $r4 = new IssueHistoryPresenter(fetchCurrentUser, fetchTickets, issueTypeHomeNavigator, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueHistoryPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchTicketsProvider;
        Object $r22 = $r12.get();
        FetchTickets $r4 = (FetchTickets) $r22;
        InterfaceC11700a $r13 = this.issueTypeHomeNavigatorProvider;
        Object $r23 = $r13.get();
        IssueTypeHomeNavigator $r5 = (IssueTypeHomeNavigator) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        IssueHistoryPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39397multiply() {
        IssueHistoryPresenter $r1 = multiply();
        return $r1;
    }
}
