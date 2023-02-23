package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SupportIssuePresenter_Factory implements InterfaceC9468d<SupportIssuePresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;

    public SupportIssuePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.issueTypeNavigatorProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.currentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SupportIssuePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SupportIssuePresenter_Factory $r3 = new SupportIssuePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SupportIssuePresenter newInstance(IssueTypeNavigator issueTypeNavigator, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        SupportIssuePresenter $r3 = new SupportIssuePresenter(issueTypeNavigator, analytics, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SupportIssuePresenter multiply() {
        InterfaceC11700a $r1 = this.issueTypeNavigatorProvider;
        Object $r2 = $r1.get();
        IssueTypeNavigator $r3 = (IssueTypeNavigator) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.currentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        SupportIssuePresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39438multiply() {
        SupportIssuePresenter $r1 = multiply();
        return $r1;
    }
}
