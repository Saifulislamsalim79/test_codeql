package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IssueResolutionFragmentPresenter_Factory implements InterfaceC9468d<IssueResolutionFragmentPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<CheckPermission> hasStoragePermissionProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;

    public IssueResolutionFragmentPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.hasStoragePermissionProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.issueTypeNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueResolutionFragmentPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        IssueResolutionFragmentPresenter_Factory $r4 = new IssueResolutionFragmentPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueResolutionFragmentPresenter newInstance(CheckPermission checkPermission, FetchCurrentUser fetchCurrentUser, Analytics analytics, IssueTypeNavigator issueTypeNavigator) {
        IssueResolutionFragmentPresenter $r4 = new IssueResolutionFragmentPresenter(checkPermission, fetchCurrentUser, analytics, issueTypeNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueResolutionFragmentPresenter multiply() {
        InterfaceC11700a $r1 = this.hasStoragePermissionProvider;
        Object $r2 = $r1.get();
        CheckPermission $r3 = (CheckPermission) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.issueTypeNavigatorProvider;
        Object $r24 = $r14.get();
        IssueTypeNavigator $r6 = (IssueTypeNavigator) $r24;
        IssueResolutionFragmentPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39407multiply() {
        IssueResolutionFragmentPresenter $r1 = multiply();
        return $r1;
    }
}
