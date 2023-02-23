package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.SubmitWidthrawalIssueViewModel_Factory */
/* loaded from: classes.dex */
public final class SubmitWidthrawalIssueViewModel_Factory implements InterfaceC9468d<SubmitWidthrawalIssueViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;
    private final InterfaceC11700a<CreateTicket> submitTicketProvider;

    public SubmitWidthrawalIssueViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.submitTicketProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.issueTypeNavigatorProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitWidthrawalIssueViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SubmitWidthrawalIssueViewModel_Factory $r3 = new SubmitWidthrawalIssueViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitWidthrawalIssueViewModel newInstance(CreateTicket createTicket, FetchCurrentUser fetchCurrentUser, IssueTypeNavigator issueTypeNavigator) {
        SubmitWidthrawalIssueViewModel $r3 = new SubmitWidthrawalIssueViewModel(createTicket, fetchCurrentUser, issueTypeNavigator);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitWidthrawalIssueViewModel multiply() {
        InterfaceC11700a $r1 = this.submitTicketProvider;
        Object $r2 = $r1.get();
        CreateTicket $r3 = (CreateTicket) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.issueTypeNavigatorProvider;
        Object $r23 = $r13.get();
        IssueTypeNavigator $r5 = (IssueTypeNavigator) $r23;
        SubmitWidthrawalIssueViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39556multiply() {
        SubmitWidthrawalIssueViewModel $r1 = multiply();
        return $r1;
    }
}
