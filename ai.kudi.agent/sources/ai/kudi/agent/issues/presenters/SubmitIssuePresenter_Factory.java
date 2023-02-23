package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.usecases.MultiPartFileHandling;
import ai.kudi.agent.issues.domain.AttachImage;
import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitIssuePresenter_Factory implements InterfaceC9468d<SubmitIssuePresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<AttachImage> attachImageProvider;
    private final InterfaceC11700a<CreateTicket> createTicketProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<MultiPartFileHandling> fileHandlingProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;

    public SubmitIssuePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.issueTypeNavigatorProvider = interfaceC11700a;
        this.createTicketProvider = interfaceC11700a2;
        this.attachImageProvider = interfaceC11700a3;
        this.currentUserProvider = interfaceC11700a4;
        this.fileHandlingProvider = interfaceC11700a5;
        this.analyticsProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitIssuePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        SubmitIssuePresenter_Factory $r6 = new SubmitIssuePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitIssuePresenter newInstance(IssueTypeNavigator issueTypeNavigator, CreateTicket createTicket, AttachImage attachImage, FetchCurrentUser fetchCurrentUser, MultiPartFileHandling multiPartFileHandling, Analytics analytics) {
        SubmitIssuePresenter $r6 = new SubmitIssuePresenter(issueTypeNavigator, createTicket, attachImage, fetchCurrentUser, multiPartFileHandling, analytics);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitIssuePresenter multiply() {
        InterfaceC11700a $r1 = this.issueTypeNavigatorProvider;
        Object $r2 = $r1.get();
        IssueTypeNavigator $r3 = (IssueTypeNavigator) $r2;
        InterfaceC11700a $r12 = this.createTicketProvider;
        Object $r22 = $r12.get();
        CreateTicket $r4 = (CreateTicket) $r22;
        InterfaceC11700a $r13 = this.attachImageProvider;
        Object $r23 = $r13.get();
        AttachImage $r5 = (AttachImage) $r23;
        InterfaceC11700a $r14 = this.currentUserProvider;
        Object $r24 = $r14.get();
        FetchCurrentUser $r6 = (FetchCurrentUser) $r24;
        InterfaceC11700a $r15 = this.fileHandlingProvider;
        Object $r25 = $r15.get();
        MultiPartFileHandling multiPartFileHandling = (MultiPartFileHandling) $r25;
        InterfaceC11700a $r16 = this.analyticsProvider;
        Object $r26 = $r16.get();
        SubmitIssuePresenter $r9 = newInstance($r3, $r4, $r5, $r6, multiPartFileHandling, (Analytics) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39433multiply() {
        SubmitIssuePresenter $r1 = multiply();
        return $r1;
    }
}
