package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ContactUsViewModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel$ContactUsViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/issues/navigators/IssueTypeNavigator;)V", "initialData", "onCallSupportClicked", "", "onCheckAppBuildClicked", "onContactUsReached", "onReviewOurAppClicked", "onSocialsClicked", "socialNetwork", "", "onVisitWebsiteClicked", "toTermsFragment", "ContactUsViewData", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.ContactUsViewModel */
/* loaded from: classes.dex */
public final class ContactUsViewModel extends BaseViewModel<ContactUsViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final IssueTypeNavigator issueTypeNavigator;

    /* compiled from: ContactUsViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/ContactUsViewModel$ContactUsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.viewModels.ContactUsViewModel$ContactUsViewData */
    /* loaded from: classes.dex */
    public static final class ContactUsViewData implements ViewData {
    }

    public ContactUsViewModel(FetchCurrentUser fetchCurrentUser, Analytics analytics, IssueTypeNavigator issueTypeNavigator) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.issueTypeNavigator = issueTypeNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCallSupportClicked$lambda-0  reason: not valid java name */
    public static final void m39512onCallSupportClicked$lambda0(ContactUsViewModel contactUsViewModel, User user) {
        Log_OC.getArray(contactUsViewModel, "this$0");
        Analytics $r3 = contactUsViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onCallUsClicked($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCheckAppBuildClicked$lambda-4  reason: not valid java name */
    public static final void m39514onCheckAppBuildClicked$lambda4(ContactUsViewModel contactUsViewModel, User user) {
        Log_OC.getArray(contactUsViewModel, "this$0");
        Analytics $r3 = contactUsViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onCheckAppBuildClicked($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onContactUsReached$lambda-2  reason: not valid java name */
    public static final void m39516onContactUsReached$lambda2(ContactUsViewModel contactUsViewModel, User user) {
        Log_OC.getArray(contactUsViewModel, "this$0");
        Analytics $r3 = contactUsViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onContactUsReached($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onReviewOurAppClicked$lambda-6  reason: not valid java name */
    public static final void m39518onReviewOurAppClicked$lambda6(ContactUsViewModel contactUsViewModel, User user) {
        Log_OC.getArray(contactUsViewModel, "this$0");
        Analytics $r3 = contactUsViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.reviewOurAppClicked($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onSocialsClicked$lambda-10  reason: not valid java name */
    public static final void m39520onSocialsClicked$lambda10(ContactUsViewModel contactUsViewModel, String str, User user) {
        Log_OC.getArray(contactUsViewModel, "this$0");
        Log_OC.getArray(str, "$socialNetwork");
        Analytics $r4 = contactUsViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onSocialNetworkClicked($r1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onVisitWebsiteClicked$lambda-8  reason: not valid java name */
    public static final void m39522onVisitWebsiteClicked$lambda8(ContactUsViewModel contactUsViewModel, User user) {
        Log_OC.getArray(contactUsViewModel, "this$0");
        Analytics $r3 = contactUsViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onVisitWebsiteClicked($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ContactUsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ContactUsViewData initialData() {
        ContactUsViewData $r1 = new ContactUsViewData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCallSupportClicked() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContactUsViewModel $r12 = ContactUsViewModel.this;
                User $r3 = (User) obj;
                ContactUsViewModel.m39512onCallSupportClicked$lambda0($r12, $r3);
            }
        };
        Chunk $r4 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onCallUsClicked(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCheckAppBuildClicked() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContactUsViewModel $r12 = ContactUsViewModel.this;
                User $r3 = (User) obj;
                ContactUsViewModel.m39514onCheckAppBuildClicked$lambda4($r12, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onCheckAppBuildClicked(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onContactUsReached() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContactUsViewModel $r12 = ContactUsViewModel.this;
                User $r3 = (User) obj;
                ContactUsViewModel.m39516onContactUsReached$lambda2($r12, $r3);
            }
        };
        HttpStatus $r4 = HttpStatus.SYNCHRONIZED;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onContactUsReached(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onReviewOurAppClicked() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContactUsViewModel $r12 = ContactUsViewModel.this;
                User $r3 = (User) obj;
                ContactUsViewModel.m39518onReviewOurAppClicked$lambda6($r12, $r3);
            }
        };
        C0282c $r4 = C0282c.f526d;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.reviewOurAppClicked(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onSocialsClicked(final String str) {
        Log_OC.getArray(str, "socialNetwork");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContactUsViewModel $r1 = ContactUsViewModel.this;
                String $r22 = str;
                User $r4 = (User) obj;
                ContactUsViewModel.m39520onSocialsClicked$lambda10($r1, $r22, $r4);
            }
        };
        Function $r5 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onSocialNetworkClicked(it.phoneNumber, socialNetwork)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onVisitWebsiteClicked() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContactUsViewModel $r12 = ContactUsViewModel.this;
                User $r3 = (User) obj;
                ContactUsViewModel.m39522onVisitWebsiteClicked$lambda8($r12, $r3);
            }
        };
        Subscription $r4 = Subscription.subscribed;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onVisitWebsiteClicked(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toTermsFragment() {
        IssueTypeNavigator $r1 = this.issueTypeNavigator;
        $r1.navigateToTermsAndConditionsFragment();
    }
}
