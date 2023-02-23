package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.PosTerminalIssuesViewModel_Factory */
/* loaded from: classes.dex */
public final class PosTerminalIssuesViewModel_Factory implements InterfaceC9468d<PosTerminalIssuesViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CreateTicket> createTicketProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;

    public PosTerminalIssuesViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.createTicketProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.issueTypeNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosTerminalIssuesViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        PosTerminalIssuesViewModel_Factory $r4 = new PosTerminalIssuesViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosTerminalIssuesViewModel newInstance(FetchCurrentUser fetchCurrentUser, CreateTicket createTicket, Analytics analytics, IssueTypeNavigator issueTypeNavigator) {
        PosTerminalIssuesViewModel $r4 = new PosTerminalIssuesViewModel(fetchCurrentUser, createTicket, analytics, issueTypeNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosTerminalIssuesViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.createTicketProvider;
        Object $r22 = $r12.get();
        CreateTicket $r4 = (CreateTicket) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.issueTypeNavigatorProvider;
        Object $r24 = $r14.get();
        IssueTypeNavigator $r6 = (IssueTypeNavigator) $r24;
        PosTerminalIssuesViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39547multiply() {
        PosTerminalIssuesViewModel $r1 = multiply();
        return $r1;
    }
}
