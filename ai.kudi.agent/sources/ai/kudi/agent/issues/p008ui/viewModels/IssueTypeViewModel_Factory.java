package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.FetchIssueCategories;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.IssueTypeViewModel_Factory */
/* loaded from: classes.dex */
public final class IssueTypeViewModel_Factory implements InterfaceC9468d<IssueTypeViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchIssueCategories> fetchIssueCategoriesProvider;
    private final InterfaceC11700a<IssueTypeHomeNavigator> issueTypeNavigatorProvider;

    public IssueTypeViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.issueTypeNavigatorProvider = interfaceC11700a;
        this.fetchIssueCategoriesProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueTypeViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        IssueTypeViewModel_Factory $r4 = new IssueTypeViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueTypeViewModel newInstance(IssueTypeHomeNavigator issueTypeHomeNavigator, FetchIssueCategories fetchIssueCategories, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        IssueTypeViewModel $r4 = new IssueTypeViewModel(issueTypeHomeNavigator, fetchIssueCategories, fetchCurrentUser, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueTypeViewModel multiply() {
        InterfaceC11700a $r1 = this.issueTypeNavigatorProvider;
        Object $r2 = $r1.get();
        IssueTypeHomeNavigator $r3 = (IssueTypeHomeNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchIssueCategoriesProvider;
        Object $r22 = $r12.get();
        FetchIssueCategories $r4 = (FetchIssueCategories) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        IssueTypeViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39543multiply() {
        IssueTypeViewModel $r1 = multiply();
        return $r1;
    }
}
