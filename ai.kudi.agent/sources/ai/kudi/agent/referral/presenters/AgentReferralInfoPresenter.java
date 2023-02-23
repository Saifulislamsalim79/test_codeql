package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.views.AgentReferralInfoView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: AgentReferralInfoPresenter.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/referral/presenters/AgentReferralInfoPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/referral/views/AgentReferralInfoView;", "referralNavigator", "Lai/kudi/agent/referral/navigators/ReferralNavigator;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/referral/navigators/ReferralNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "displayUserInfo", "", "logIntiatingAgentReferralEvent", "navigateToAgentReferredList", "customerType", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralInfoPresenter extends C9410b<AgentReferralInfoView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final ReferralNavigator referralNavigator;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralInfoPresenter(ReferralNavigator referralNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(referralNavigator, "referralNavigator");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        this.referralNavigator = referralNavigator;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayUserInfo$lambda-1  reason: not valid java name */
    public static final void m40264displayUserInfo$lambda1(AgentReferralInfoPresenter agentReferralInfoPresenter, final User user) {
        Log_OC.getArray(agentReferralInfoPresenter, "this$0");
        agentReferralInfoPresenter.setUser(user);
        agentReferralInfoPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.Sequence
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTarget(Object obj) {
                User $r1 = User.this;
                AgentReferralInfoView $r3 = (AgentReferralInfoView) obj;
                AgentReferralInfoPresenter.m40265displayUserInfo$lambda1$lambda0($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayUserInfo$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40265displayUserInfo$lambda1$lambda0(User user, AgentReferralInfoView agentReferralInfoView) {
        Log_OC.getArray(agentReferralInfoView, "view");
        Log_OC.loadImage(user, "it");
        agentReferralInfoView.displayInfoToAgent(user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logIntiatingAgentReferralEvent(User user) {
        Analytics $r2 = this.analytics;
        $r2.onAgentReferralInfoEvent(user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displayUserInfo() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.referral.presenters.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralInfoPresenter $r12 = AgentReferralInfoPresenter.this;
                User $r3 = (User) obj;
                AgentReferralInfoPresenter.m40264displayUserInfo$lambda1($r12, $r3);
            }
        };
        Token $r4 = Token.BOOL;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute()\n            .subscribe(\n                {\n                    user = it\n                    ifViewAttached { view -> view.displayInfoToAgent(it) }\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToAgentReferredList(String str) {
        Log_OC.getArray(str, "customerType");
        User $r2 = this.user;
        logIntiatingAgentReferralEvent($r2);
        ReferralNavigator $r3 = this.referralNavigator;
        $r3.navigateToInviteAgent(str);
    }

    public final void setUser(User user) {
        this.user = user;
    }
}
