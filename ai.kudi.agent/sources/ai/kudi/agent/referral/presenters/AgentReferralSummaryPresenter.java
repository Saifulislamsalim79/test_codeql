package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.ReferralAnalytics;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.referral.AgentReferralSummary;
import ai.kudi.agent.referral.domain.usecase.FetchAgentSummary;
import ai.kudi.agent.referral.views.ReferralSummaryView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: AgentReferralSummaryPresenter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/referral/presenters/AgentReferralSummaryPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/referral/views/ReferralSummaryView;", "fetchAgentSummary", "Lai/kudi/agent/referral/domain/usecase/FetchAgentSummary;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/referral/domain/usecase/FetchAgentSummary;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "userPhoneNumber", "", "destroy", "", "fetchSummary", "phoneNumber", "referralId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralSummaryPresenter extends C9410b<ReferralSummaryView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchAgentSummary fetchAgentSummary;
    private final FetchCurrentUser fetchCurrentUser;
    private String userPhoneNumber;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralSummaryPresenter(FetchAgentSummary fetchAgentSummary, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(fetchAgentSummary, "fetchAgentSummary");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchAgentSummary = fetchAgentSummary;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.userPhoneNumber = "";
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchSummary$lambda-0  reason: not valid java name */
    public static final void m40290fetchSummary$lambda0(ReferralSummaryView referralSummaryView) {
        Log_OC.getArray(referralSummaryView, "it");
        referralSummaryView.showErrorMessage("Phone number supplied is invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchSummary$lambda-1  reason: not valid java name */
    public static final void m40291fetchSummary$lambda1(ReferralSummaryView referralSummaryView) {
        Log_OC.getArray(referralSummaryView, "it");
        referralSummaryView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchSummary$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40292fetchSummary$lambda2(AgentReferralSummaryPresenter agentReferralSummaryPresenter, String str, User user) {
        Log_OC.getArray(agentReferralSummaryPresenter, "this$0");
        Log_OC.getArray(user, "it");
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        agentReferralSummaryPresenter.userPhoneNumber = $r3;
        FetchAgentSummary $r4 = agentReferralSummaryPresenter.fetchAgentSummary;
        String $r32 = user.getSessionId();
        Log_OC.loadImage($r32, "it.sessionId");
        AbstractC11688p $r5 = $r4.execute($r32, str);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchSummary$lambda-4  reason: not valid java name */
    public static final void m40293fetchSummary$lambda4(AgentReferralSummaryPresenter agentReferralSummaryPresenter, String str, final AgentReferralSummary agentReferralSummary) {
        Log_OC.getArray(agentReferralSummaryPresenter, "this$0");
        Analytics $r2 = agentReferralSummaryPresenter.analytics;
        String $r3 = agentReferralSummaryPresenter.userPhoneNumber;
        Log_OC.append(str);
        ReferralAnalytics.DefaultImpls.viewReferredAgentSummaryClicked$default($r2, $r3, str, true, null, 8, null);
        agentReferralSummaryPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.EntryGuards$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void filter(Object obj) {
                AgentReferralSummary $r1 = AgentReferralSummary.this;
                ReferralSummaryView $r32 = (ReferralSummaryView) obj;
                AgentReferralSummaryPresenter.m40294fetchSummary$lambda4$lambda3($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchSummary$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40294fetchSummary$lambda4$lambda3(AgentReferralSummary agentReferralSummary, ReferralSummaryView referralSummaryView) {
        Log_OC.getArray(referralSummaryView, "view");
        referralSummaryView.hideLoading();
        Log_OC.loadImage(agentReferralSummary, "it");
        referralSummaryView.showSummary(agentReferralSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchSummary$lambda-6  reason: not valid java name */
    public static final void m40295fetchSummary$lambda6(AgentReferralSummaryPresenter agentReferralSummaryPresenter, String str, final Throwable th) {
        Log_OC.getArray(agentReferralSummaryPresenter, "this$0");
        Analytics $r5 = agentReferralSummaryPresenter.analytics;
        String $r1 = agentReferralSummaryPresenter.userPhoneNumber;
        Log_OC.append(str);
        String $r2 = th.getMessage();
        $r5.viewReferredAgentSummaryClicked($r1, str, false, $r2);
        agentReferralSummaryPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void accept(Object obj) {
                Throwable $r12 = th;
                ReferralSummaryView $r3 = (ReferralSummaryView) obj;
                AgentReferralSummaryPresenter.m40296fetchSummary$lambda6$lambda5($r12, $r3);
            }
        });
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchSummary$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40296fetchSummary$lambda6$lambda5(Throwable th, ReferralSummaryView referralSummaryView) {
        Log_OC.getArray(referralSummaryView, "view");
        referralSummaryView.hideLoading();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        referralSummaryView.showErrorMessage($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchSummary(final String str, final String str2) {
        if (str2 != null) {
            int $i0 = str2.length();
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                Compression $r3 = Compression.METADATA;
                ifViewAttached($r3);
                FetchCurrentUser $r4 = this.fetchCurrentUser;
                AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
                AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.referral.presenters.ByteVector
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.InterfaceC11291f
                    /* renamed from: a */
                    public final Object mo10663a(Object obj) {
                        AgentReferralSummaryPresenter $r1 = AgentReferralSummaryPresenter.this;
                        String $r2 = str2;
                        User $r52 = (User) obj;
                        InterfaceC11692s $r32 = AgentReferralSummaryPresenter.m40292fetchSummary$lambda2($r1, $r2, $r52);
                        return $r32;
                    }
                });
                FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.referral.presenters.ClassWriter
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        AgentReferralSummaryPresenter $r1 = AgentReferralSummaryPresenter.this;
                        String $r2 = str;
                        AgentReferralSummary $r42 = (AgentReferralSummary) obj;
                        AgentReferralSummaryPresenter.m40293fetchSummary$lambda4($r1, $r2, $r42);
                    }
                }, new Object() { // from class: ai.kudi.agent.referral.presenters.Cubic
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        AgentReferralSummaryPresenter $r1 = AgentReferralSummaryPresenter.this;
                        String $r2 = str;
                        Throwable $r42 = (Throwable) obj;
                        AgentReferralSummaryPresenter.m40295fetchSummary$lambda6($r1, $r2, $r42);
                    }
                });
                Log_OC.loadImage($r10, "fetchCurrentUser.execute().flatMapObservable {\n            userPhoneNumber = it.phoneNumber\n            fetchAgentSummary.execute(it.sessionId, referralId)\n        }.subscribe(\n            {\n                analytics.viewReferredAgentSummaryClicked(userPhoneNumber, phoneNumber!!, true)\n                ifViewAttached { view ->\n                    view.hideLoading()\n                    view.showSummary(it)\n                }\n            },\n            {\n                analytics.viewReferredAgentSummaryClicked(userPhoneNumber, phoneNumber!!, false, it.message)\n                ifViewAttached { view ->\n                    view.hideLoading()\n                    view.showErrorMessage(parseHttpError2(\"Something went wrong. Please try again\")(it))\n                }\n                CrashlyticsReport.logException(it)\n                it.printStackTrace()\n            }\n        )");
                C11280b $r11 = this.compositeDisposable;
                RxExtKt.addTo($r10, $r11);
                return;
            }
        }
        Logger $r12 = Logger.logger;
        ifViewAttached($r12);
        CrashlyticsReport.logMessage("Phone number supplied while trying to view referral summary is invalid");
    }
}
