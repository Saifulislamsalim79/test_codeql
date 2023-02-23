package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.FetchIssueCategories;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.IssueDetailsViewModel_Factory */
/* loaded from: classes.dex */
public final class IssueDetailsViewModel_Factory implements InterfaceC9468d<IssueDetailsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchIssueCategories> fetchIssueCategoriesProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigtorProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;

    public IssueDetailsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.issueTypeNavigtorProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.fetchIssueCategoriesProvider = interfaceC11700a4;
        this.remoteConfigProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueDetailsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        IssueDetailsViewModel_Factory $r5 = new IssueDetailsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueDetailsViewModel newInstance(IssueTypeNavigator issueTypeNavigator, Analytics analytics, FetchCurrentUser fetchCurrentUser, FetchIssueCategories fetchIssueCategories, Frame frame) {
        IssueDetailsViewModel $r5 = new IssueDetailsViewModel(issueTypeNavigator, analytics, fetchCurrentUser, fetchIssueCategories, frame);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueDetailsViewModel multiply() {
        InterfaceC11700a $r1 = this.issueTypeNavigtorProvider;
        Object $r2 = $r1.get();
        IssueTypeNavigator $r3 = (IssueTypeNavigator) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.fetchIssueCategoriesProvider;
        Object $r24 = $r14.get();
        FetchIssueCategories $r6 = (FetchIssueCategories) $r24;
        InterfaceC11700a $r15 = this.remoteConfigProvider;
        Object $r25 = $r15.get();
        Frame $r7 = (Frame) $r25;
        IssueDetailsViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39536multiply() {
        IssueDetailsViewModel $r1 = multiply();
        return $r1;
    }
}
