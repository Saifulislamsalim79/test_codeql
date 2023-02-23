package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.ReferralAnalytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.referral.AgentReferralEarnings;
import ai.kudi.agent.referral.AgentWithdrawalResponse;
import ai.kudi.agent.referral.domain.usecase.FetchAgentEarningsSummary;
import ai.kudi.agent.referral.domain.usecase.WithdrawFunds;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.views.ReferralEarningsView;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
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
/* compiled from: AgentReferralEarningsPresenter.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/referral/presenters/AgentReferralEarningsPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/referral/views/ReferralEarningsView;", "referralNavigator", "Lai/kudi/agent/referral/navigators/ReferralNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchEarnings", "Lai/kudi/agent/referral/domain/usecase/FetchAgentEarningsSummary;", "withdrawFunds", "Lai/kudi/agent/referral/domain/usecase/WithdrawFunds;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/referral/navigators/ReferralNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/referral/domain/usecase/FetchAgentEarningsSummary;Lai/kudi/agent/referral/domain/usecase/WithdrawFunds;Lai/kudi/agent/core/analytics/Analytics;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "userPhoneNumber", "", "getUserPhoneNumber", "()Ljava/lang/String;", "setUserPhoneNumber", "(Ljava/lang/String;)V", "destroy", "", "fetchEarningsBreakdown", "showAlertDialog", MetricTracker.Object.MESSAGE, "buttonText", "withdrawFundsToWallet", TransactionField.AMOUNT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralEarningsPresenter extends C9410b<ReferralEarningsView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchAgentEarningsSummary fetchEarnings;
    private final ReferralNavigator referralNavigator;
    private String userPhoneNumber;
    private final WithdrawFunds withdrawFunds;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralEarningsPresenter(ReferralNavigator referralNavigator, FetchCurrentUser fetchCurrentUser, FetchAgentEarningsSummary fetchAgentEarningsSummary, WithdrawFunds withdrawFunds, Analytics analytics) {
        Log_OC.getArray(referralNavigator, "referralNavigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchAgentEarningsSummary, "fetchEarnings");
        Log_OC.getArray(withdrawFunds, "withdrawFunds");
        Log_OC.getArray(analytics, "analytics");
        this.referralNavigator = referralNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchEarnings = fetchAgentEarningsSummary;
        this.withdrawFunds = withdrawFunds;
        this.analytics = analytics;
        this.userPhoneNumber = "";
        C11280b $r6 = new C11280b();
        this.compositeDisposable = $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchEarningsBreakdown$lambda-0  reason: not valid java name */
    public static final void m40252fetchEarningsBreakdown$lambda0(ReferralEarningsView referralEarningsView) {
        Log_OC.getArray(referralEarningsView, "it");
        referralEarningsView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchEarningsBreakdown$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40253fetchEarningsBreakdown$lambda1(AgentReferralEarningsPresenter agentReferralEarningsPresenter, User user) {
        Log_OC.getArray(agentReferralEarningsPresenter, "this$0");
        Log_OC.getArray(user, "user");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "user.phoneNumber");
        agentReferralEarningsPresenter.setUserPhoneNumber($r2);
        FetchAgentEarningsSummary $r3 = agentReferralEarningsPresenter.fetchEarnings;
        String $r22 = user.getSessionId();
        Log_OC.loadImage($r22, "user.sessionId");
        AbstractC11688p $r4 = $r3.execute($r22);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchEarningsBreakdown$lambda-3  reason: not valid java name */
    public static final void m40254fetchEarningsBreakdown$lambda3(AgentReferralEarningsPresenter agentReferralEarningsPresenter, final AgentReferralEarnings agentReferralEarnings) {
        Log_OC.getArray(agentReferralEarningsPresenter, "this$0");
        Analytics $r2 = agentReferralEarningsPresenter.getAnalytics();
        String $r3 = agentReferralEarningsPresenter.getUserPhoneNumber();
        ReferralAnalytics.DefaultImpls.viewEarningsClicked$default($r2, $r3, true, null, 4, null);
        agentReferralEarningsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.NavigationMenuPresenter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38577e(Object obj) {
                AgentReferralEarnings $r1 = AgentReferralEarnings.this;
                ReferralEarningsView $r32 = (ReferralEarningsView) obj;
                AgentReferralEarningsPresenter.m40255fetchEarningsBreakdown$lambda3$lambda2($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchEarningsBreakdown$lambda-3$lambda-2  reason: not valid java name */
    public static final void m40255fetchEarningsBreakdown$lambda3$lambda2(AgentReferralEarnings agentReferralEarnings, ReferralEarningsView referralEarningsView) {
        Log_OC.getArray(referralEarningsView, "it");
        referralEarningsView.hideLoading();
        Log_OC.loadImage(agentReferralEarnings, "earnings");
        referralEarningsView.showEarnings(agentReferralEarnings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchEarningsBreakdown$lambda-5  reason: not valid java name */
    public static final void m40256fetchEarningsBreakdown$lambda5(AgentReferralEarningsPresenter agentReferralEarningsPresenter, final Throwable th) {
        Log_OC.getArray(agentReferralEarningsPresenter, "this$0");
        Analytics $r2 = agentReferralEarningsPresenter.getAnalytics();
        String $r3 = agentReferralEarningsPresenter.getUserPhoneNumber();
        String $r4 = th.getMessage();
        $r2.viewEarningsClicked($r3, false, $r4);
        agentReferralEarningsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                ReferralEarningsView $r32 = (ReferralEarningsView) obj;
                AgentReferralEarningsPresenter.m40257fetchEarningsBreakdown$lambda5$lambda4($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchEarningsBreakdown$lambda-5$lambda-4  reason: not valid java name */
    public static final void m40257fetchEarningsBreakdown$lambda5$lambda4(Throwable th, ReferralEarningsView referralEarningsView) {
        Log_OC.getArray(referralEarningsView, "view");
        referralEarningsView.hideLoading();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        referralEarningsView.showWithdrawalError($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawFundsToWallet$lambda-10  reason: not valid java name */
    public static final void m40258withdrawFundsToWallet$lambda10(AgentReferralEarningsPresenter agentReferralEarningsPresenter, double d, final Throwable th) {
        Log_OC.getArray(agentReferralEarningsPresenter, "this$0");
        Analytics $r2 = agentReferralEarningsPresenter.getAnalytics();
        String $r3 = agentReferralEarningsPresenter.getUserPhoneNumber();
        String $r4 = th.getMessage();
        $r2.withdrawAvailableFundsClicked($r3, d, false, $r4);
        agentReferralEarningsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                ReferralEarningsView $r32 = (ReferralEarningsView) obj;
                AgentReferralEarningsPresenter.m40259withdrawFundsToWallet$lambda10$lambda9($r1, $r32);
            }
        });
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawFundsToWallet$lambda-10$lambda-9  reason: not valid java name */
    public static final void m40259withdrawFundsToWallet$lambda10$lambda9(Throwable th, ReferralEarningsView referralEarningsView) {
        Log_OC.getArray(referralEarningsView, "view");
        referralEarningsView.hideLoading();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        referralEarningsView.showWithdrawalError($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: withdrawFundsToWallet$lambda-6  reason: not valid java name */
    public static final void m40260withdrawFundsToWallet$lambda6(ReferralEarningsView referralEarningsView) {
        Log_OC.getArray(referralEarningsView, "it");
        referralEarningsView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawFundsToWallet$lambda-8  reason: not valid java name */
    public static final void m40261withdrawFundsToWallet$lambda8(AgentReferralEarningsPresenter agentReferralEarningsPresenter, double d, final AgentWithdrawalResponse agentWithdrawalResponse) {
        Log_OC.getArray(agentReferralEarningsPresenter, "this$0");
        Analytics $r2 = agentReferralEarningsPresenter.getAnalytics();
        String $r3 = agentReferralEarningsPresenter.getUserPhoneNumber();
        ReferralAnalytics.DefaultImpls.withdrawAvailableFundsClicked$default($r2, $r3, d, true, null, 8, null);
        agentReferralEarningsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                AgentWithdrawalResponse $r1 = AgentWithdrawalResponse.this;
                ReferralEarningsView $r32 = (ReferralEarningsView) obj;
                AgentReferralEarningsPresenter.m40262withdrawFundsToWallet$lambda8$lambda7($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawFundsToWallet$lambda-8$lambda-7  reason: not valid java name */
    public static final void m40262withdrawFundsToWallet$lambda8$lambda7(AgentWithdrawalResponse agentWithdrawalResponse, ReferralEarningsView referralEarningsView) {
        Log_OC.getArray(referralEarningsView, "it");
        referralEarningsView.hideLoading();
        double $d0 = agentWithdrawalResponse.getCommissionWalletBalance();
        referralEarningsView.showWithdrawalSuccess($d0, "Your funds have been withdrawn to your Kudi Wallet");
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
    public final void fetchEarningsBreakdown() {
        Target $r1 = Target.NONE;
        ifViewAttached($r1);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.referral.presenters.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AgentReferralEarningsPresenter $r12 = AgentReferralEarningsPresenter.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = AgentReferralEarningsPresenter.m40253fetchEarningsBreakdown$lambda1($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.referral.presenters.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralEarningsPresenter $r12 = AgentReferralEarningsPresenter.this;
                AgentReferralEarnings $r32 = (AgentReferralEarnings) obj;
                AgentReferralEarningsPresenter.m40254fetchEarningsBreakdown$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.referral.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralEarningsPresenter $r12 = AgentReferralEarningsPresenter.this;
                Throwable $r32 = (Throwable) obj;
                AgentReferralEarningsPresenter.m40256fetchEarningsBreakdown$lambda5($r12, $r32);
            }
        });
        Log_OC.loadImage($r8, "fetchCurrentUser.execute().flatMapObservable { user ->\n            userPhoneNumber = user.phoneNumber\n            fetchEarnings.execute(user.sessionId)\n        }.subscribe({ earnings ->\n            analytics.viewEarningsClicked(userPhoneNumber, true)\n            ifViewAttached {\n                it.hideLoading()\n                it.showEarnings(earnings)\n            }\n        }, {\n            analytics.viewEarningsClicked(userPhoneNumber, false, it.message)\n            ifViewAttached { view ->\n                view.hideLoading()\n                view.showWithdrawalError(parseHttpError2(\"Something went wrong.\")(it))\n            }\n        }\n        )");
        C11280b $r9 = this.compositeDisposable;
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUserPhoneNumber() {
        String r1 = this.userPhoneNumber;
        return r1;
    }

    public final void setUserPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.userPhoneNumber = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showAlertDialog(String str, String str2) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "buttonText");
        ReferralNavigator $r3 = this.referralNavigator;
        ReferralNavigator.DefaultImpls.showAlertDialog$default($r3, str, str2, null, 4, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void withdrawFundsToWallet(final double d) {
        InputMethod $r3 = InputMethod.inputMethod;
        ifViewAttached($r3);
        WithdrawFunds $r4 = this.withdrawFunds;
        AbstractC11688p $r5 = $r4.execute(d);
        FavoritesArrayAdapter $r6 = $r5.e0(new Object() { // from class: ai.kudi.agent.referral.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralEarningsPresenter $r1 = AgentReferralEarningsPresenter.this;
                double $d0 = d;
                AgentWithdrawalResponse $r32 = (AgentWithdrawalResponse) obj;
                AgentReferralEarningsPresenter.m40261withdrawFundsToWallet$lambda8($r1, $d0, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.referral.presenters.StandardShowcaseDrawer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralEarningsPresenter $r1 = AgentReferralEarningsPresenter.this;
                double $d0 = d;
                Throwable $r32 = (Throwable) obj;
                AgentReferralEarningsPresenter.m40258withdrawFundsToWallet$lambda10($r1, $d0, $r32);
            }
        });
        Log_OC.loadImage($r6, "withdrawFunds.execute(amount).subscribe({ data ->\n            analytics.withdrawAvailableFundsClicked(\n                userPhoneNumber, amount, true\n            )\n            ifViewAttached {\n                it.hideLoading()\n                it.showWithdrawalSuccess(\n                    data.commissionWalletBalance,\n                    \"Your funds have been withdrawn to your Kudi Wallet\"\n                )\n            }\n        }, {\n            analytics.withdrawAvailableFundsClicked(\n                userPhoneNumber, amount, false,\n                it.message\n            )\n            ifViewAttached { view ->\n                view.hideLoading()\n                view.showWithdrawalError(\n                    parseHttpError2(\n                        \"Something went wrong.\"\n                    )(it)\n                )\n            }\n            it.printStackTrace()\n        })");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }
}
