package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.ConnectivityUtil;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.referral.AgentReferralModel;
import ai.kudi.agent.referral.domain.usecase.CreateAgentReferral;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.views.AgentReferralInviteView;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: AgentReferralInvitePresenter.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0016H\u0016J,\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0002J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0018J\u0016\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/referral/presenters/AgentReferralInvitePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/referral/views/AgentReferralInviteView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "createAgentReferral", "Lai/kudi/agent/referral/domain/usecase/CreateAgentReferral;", "referralNavigator", "Lai/kudi/agent/referral/navigators/ReferralNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/referral/domain/usecase/CreateAgentReferral;Lai/kudi/agent/referral/navigators/ReferralNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "", "()Z", "setLoading", "(Z)V", "referralList", "", "Lai/kudi/agent/referral/AgentReferralModel;", "", "phoneNumber", "", "firstName", "lastName", "destroy", "logEventOnAgentReferralCreation", "referredPhoneNumber", TransactionField.STATUS, "errorMessage", "openReferredAgentsList", "customerType", "showAlertDialog", MetricTracker.Object.MESSAGE, "buttonText", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralInvitePresenter extends C9410b<AgentReferralInviteView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final CreateAgentReferral createAgentReferral;
    private final FetchCurrentUser fetchCurrentUser;
    private boolean isLoading;
    private List<AgentReferralModel> referralList;
    private final ReferralNavigator referralNavigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralInvitePresenter(FetchCurrentUser fetchCurrentUser, CreateAgentReferral createAgentReferral, ReferralNavigator referralNavigator, Analytics analytics) {
        List $r4;
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(createAgentReferral, "createAgentReferral");
        Log_OC.getArray(referralNavigator, "referralNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.createAgentReferral = createAgentReferral;
        this.referralNavigator = referralNavigator;
        this.analytics = analytics;
        $r4 = C13726r.m3891e();
        this.referralList = $r4;
        C11280b $r6 = new C11280b();
        this.compositeDisposable = $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAgentReferral$lambda-0  reason: not valid java name */
    public static final void m40268createAgentReferral$lambda0(AgentReferralInviteView agentReferralInviteView) {
        Log_OC.getArray(agentReferralInviteView, "it");
        agentReferralInviteView.showError("Please enter your referred agent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAgentReferral$lambda-1  reason: not valid java name */
    public static final void m40269createAgentReferral$lambda1(AgentReferralInviteView agentReferralInviteView) {
        Log_OC.getArray(agentReferralInviteView, "it");
        agentReferralInviteView.showError("Please enter a valid phone number");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAgentReferral$lambda-2  reason: not valid java name */
    public static final void m40270createAgentReferral$lambda2(AgentReferralInviteView agentReferralInviteView) {
        Log_OC.getArray(agentReferralInviteView, "it");
        agentReferralInviteView.showError("Please provide a name");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAgentReferral$lambda-3  reason: not valid java name */
    public static final void m40271createAgentReferral$lambda3(AgentReferralInviteView agentReferralInviteView) {
        Log_OC.getArray(agentReferralInviteView, "it");
        agentReferralInviteView.createReferralLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: createAgentReferral$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m40272createAgentReferral$lambda4(C11812w c11812w, AgentReferralInvitePresenter agentReferralInvitePresenter, AgentReferralModel agentReferralModel, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(agentReferralInvitePresenter, "this$0");
        Log_OC.getArray(agentReferralModel, "$agentReferralModel");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        CreateAgentReferral $r4 = agentReferralInvitePresenter.createAgentReferral;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.execute($r5, agentReferralModel);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createAgentReferral$lambda-6  reason: not valid java name */
    public static final void m40273createAgentReferral$lambda6(AgentReferralInvitePresenter agentReferralInvitePresenter, C11812w c11812w, final String str, AgentReferralModel agentReferralModel) {
        ArrayList $r9;
        List $r10;
        Log_OC.getArray(agentReferralInvitePresenter, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$phoneNumber");
        Object $r4 = c11812w.f26499c;
        Log_OC.append($r4);
        User $r5 = (User) $r4;
        String $r6 = $r5.getPhoneNumber();
        Log_OC.loadImage($r6, "user!!.phoneNumber");
        logEventOnAgentReferralCreation$default(agentReferralInvitePresenter, $r6, str, true, null, 8, null);
        agentReferralInvitePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.ViewTarget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                String $r1 = str;
                AgentReferralInviteView $r3 = (AgentReferralInviteView) obj;
                AgentReferralInvitePresenter.m40274createAgentReferral$lambda6$lambda5($r1, $r3);
            }
        });
        AgentReferralModel[] $r8 = {agentReferralModel};
        $r9 = C13726r.m3893c($r8);
        List $r102 = agentReferralInvitePresenter.referralList;
        $r10 = C13742z.m3784n0($r9, $r102);
        agentReferralInvitePresenter.referralList = $r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createAgentReferral$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40274createAgentReferral$lambda6$lambda5(String str, AgentReferralInviteView agentReferralInviteView) {
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(agentReferralInviteView, "view");
        agentReferralInviteView.hideReferralLoading();
        String $r1 = Log_OC.m10359a("You have successfully invited\n", (Object) str);
        agentReferralInviteView.showSuccessMessage($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createAgentReferral$lambda-8  reason: not valid java name */
    public static final void m40275createAgentReferral$lambda8(final AgentReferralInvitePresenter agentReferralInvitePresenter, C11812w c11812w, String str, final Throwable th) {
        Log_OC.getArray(agentReferralInvitePresenter, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$phoneNumber");
        th.printStackTrace();
        Object $r4 = c11812w.f26499c;
        Log_OC.append($r4);
        User $r5 = (User) $r4;
        String $r6 = $r5.getPhoneNumber();
        Log_OC.loadImage($r6, "user!!.phoneNumber");
        String $r7 = th.getMessage();
        agentReferralInvitePresenter.logEventOnAgentReferralCreation($r6, str, false, $r7);
        agentReferralInvitePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setCheckable(Object obj) {
                Throwable $r1 = th;
                AgentReferralInvitePresenter $r2 = agentReferralInvitePresenter;
                AgentReferralInviteView $r42 = (AgentReferralInviteView) obj;
                AgentReferralInvitePresenter.m40276createAgentReferral$lambda8$lambda7($r1, $r2, $r42);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createAgentReferral$lambda-8$lambda-7  reason: not valid java name */
    public static final void m40276createAgentReferral$lambda8$lambda7(Throwable th, AgentReferralInvitePresenter agentReferralInvitePresenter, AgentReferralInviteView agentReferralInviteView) {
        Log_OC.getArray(agentReferralInvitePresenter, "this$0");
        Log_OC.getArray(agentReferralInviteView, "view");
        agentReferralInviteView.hideReferralLoading();
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            agentReferralInviteView.showError("Kindly check your connection and try again");
            return;
        }
        boolean $z02 = th instanceof HttpException;
        if (!$z02) {
            InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again or contact support", null, 2, null);
            Log_OC.loadImage(th, "it");
            Object $r6 = $r5.invoke(th);
            String $r7 = (String) $r6;
            agentReferralInviteView.showError($r7);
            return;
        }
        HttpException $r3 = (HttpException) th;
        int $i0 = $r3.m352a();
        if ($i0 == 409) {
            ReferralNavigator $r4 = agentReferralInvitePresenter.referralNavigator;
            ReferralNavigator.DefaultImpls.showAlertDialog$default($r4, "This phone number is a registered agent on Kudi.", "Continue", null, 4, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnAgentReferralCreation(String str, String str2, boolean z, String str3) {
        Analytics $r4 = this.analytics;
        $r4.onAgentReferralCreation(str, str2, z, str3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void logEventOnAgentReferralCreation$default(AgentReferralInvitePresenter agentReferralInvitePresenter, String str, String str2, boolean z, String $r4, int i, Object obj) {
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r4 = null;
        }
        agentReferralInvitePresenter.logEventOnAgentReferralCreation(str, str2, z, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createAgentReferral(final String str, String str2, String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "firstName");
        Log_OC.getArray(str3, "lastName");
        final C11812w $r4 = new C11812w();
        int $i0 = str.length();
        boolean $z1 = $i0 == 0;
        if ($z1) {
            Comment $r5 = Comment.files;
            ifViewAttached($r5);
            return;
        }
        boolean $z12 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z12) {
            boolean $z13 = StringExtKt.isNigerianPhoneNumberWithCountryCode(str);
            if (!$z13) {
                Session $r6 = Session.current;
                ifViewAttached($r6);
                return;
            }
        }
        int $i02 = str2.length();
        boolean $z0 = $i02 == 0;
        if ($z0) {
            Preferences $r7 = Preferences.prefs;
            ifViewAttached($r7);
            return;
        }
        String $r2 = str2 + ' ' + str3;
        final AgentReferralModel $r8 = new AgentReferralModel(null, str, $r2, null);
        Type $r10 = Type.ROW;
        ifViewAttached($r10);
        FetchCurrentUser $r11 = this.fetchCurrentUser;
        AbstractC11696w $r12 = FetchCurrentUser.execute$default($r11, null, null, 3, null);
        AbstractC11688p $r14 = $r12.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.referral.presenters.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                AgentReferralInvitePresenter $r22 = this;
                AgentReferralModel $r3 = $r8;
                User $r62 = (User) obj;
                InterfaceC11692s $r42 = AgentReferralInvitePresenter.m40272createAgentReferral$lambda4($r1, $r22, $r3, $r62);
                return $r42;
            }
        });
        FavoritesArrayAdapter $r17 = $r14.e0(new Object() { // from class: ai.kudi.agent.referral.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralInvitePresenter $r1 = AgentReferralInvitePresenter.this;
                C11812w $r22 = $r4;
                String $r3 = str;
                AgentReferralModel $r52 = (AgentReferralModel) obj;
                AgentReferralInvitePresenter.m40273createAgentReferral$lambda6($r1, $r22, $r3, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.referral.presenters.LayoutManager
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralInvitePresenter $r1 = AgentReferralInvitePresenter.this;
                C11812w $r22 = $r4;
                String $r3 = str;
                Throwable $r52 = (Throwable) obj;
                AgentReferralInvitePresenter.m40275createAgentReferral$lambda8($r1, $r22, $r3, $r52);
            }
        });
        Log_OC.loadImage($r17, "fetchCurrentUser.execute()\n                .flatMapObservable {\n                    user = it\n                    createAgentReferral.execute(it.sessionId, agentReferralModel)\n                }\n                .subscribe(\n                    { agentReferral ->\n\n                        logEventOnAgentReferralCreation(\n                            user!!.phoneNumber, phoneNumber,\n                            true\n                        )\n\n                        ifViewAttached { view ->\n                            view.hideReferralLoading()\n                            view.showSuccessMessage(\n                                \"You have successfully invited\\n$phoneNumber\"\n                            )\n                        }\n                        referralList = arrayListOf(agentReferral).plus(this.referralList)\n                    },\n                    {\n                        it.printStackTrace()\n                        logEventOnAgentReferralCreation(\n                            user!!.phoneNumber,\n                            phoneNumber,\n                            false,\n                            it.message\n                        )\n                        ifViewAttached { view ->\n                            view.hideReferralLoading()\n                            when {\n                                isNoConnectivity(it) -> view.showError(\n                                    \"Kindly check your connection and try again\"\n                                )\n                                it is HttpException -> when (it.code()) {\n                                    409 -> referralNavigator.showAlertDialog(\n                                        \"This phone number is a registered agent on Kudi.\",\n                                        \"Continue\"\n                                    )\n                                }\n                                else -> {\n                                    view.showError(\n                                        parseHttpError2(\n                                            \"Something went wrong. Please try again or contact support\"\n                                        )(\n                                            it\n                                        )\n                                    )\n                                }\n                            }\n                        }\n                    }\n                )");
        C11280b $r18 = this.compositeDisposable;
        RxExtKt.addTo($r17, $r18);
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
    public final boolean isLoading() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void openReferredAgentsList(String str) {
        Log_OC.getArray(str, "customerType");
        ReferralNavigator $r2 = this.referralNavigator;
        $r2.navigateToReferredAgentList(str);
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
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
}
