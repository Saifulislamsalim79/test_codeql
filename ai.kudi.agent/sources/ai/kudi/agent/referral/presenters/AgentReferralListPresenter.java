package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.ReferralAnalytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.referral.AgentReferralModel;
import ai.kudi.agent.referral.domain.usecase.BuzzReferredAgent;
import ai.kudi.agent.referral.domain.usecase.FetchReferrals;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.views.AgentReferralListView;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
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
/* compiled from: AgentReferralListPresenter.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u0007\u001a\u00020(2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020 J\b\u0010+\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010-\u001a\u00020(J\u0016\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020 J\u0016\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020 J\u0010\u00102\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00103\u001a\u00020(2\b\b\u0002\u0010\u001f\u001a\u00020 R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u00064"}, m10421d2 = {"Lai/kudi/agent/referral/presenters/AgentReferralListPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/referral/views/AgentReferralListView;", "fetchReferrals", "Lai/kudi/agent/referral/domain/usecase/FetchReferrals;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "buzzReferredAgent", "Lai/kudi/agent/referral/domain/usecase/BuzzReferredAgent;", "referralNavigator", "Lai/kudi/agent/referral/navigators/ReferralNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/referral/domain/usecase/FetchReferrals;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/referral/domain/usecase/BuzzReferredAgent;Lai/kudi/agent/referral/navigators/ReferralNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "", "()Z", "setLoading", "(Z)V", "page", "", "getPage", "()I", "setPage", "(I)V", "referralList", "", "Lai/kudi/agent/referral/AgentReferralModel;", "shouldLoadNext", TransactionField.STATUS, "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "userPhoneNumber", "getUserPhoneNumber", "setUserPhoneNumber", "", "referralId", "phoneNumber", "destroy", "hideLoading", "loadNext", "openAgentSummary", "showAlertDialog", MetricTracker.Object.MESSAGE, "buttonText", "showLoading", OpsMetricTracker.START, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralListPresenter extends C9410b<AgentReferralListView> {
    private final Analytics analytics;
    private final BuzzReferredAgent buzzReferredAgent;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchReferrals fetchReferrals;
    private boolean isLoading;
    private int page;
    private List<AgentReferralModel> referralList;
    private final ReferralNavigator referralNavigator;
    private boolean shouldLoadNext;
    private String status;
    private String userPhoneNumber;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralListPresenter(FetchReferrals fetchReferrals, FetchCurrentUser fetchCurrentUser, BuzzReferredAgent buzzReferredAgent, ReferralNavigator referralNavigator, Analytics analytics) {
        List $r5;
        Log_OC.getArray(fetchReferrals, "fetchReferrals");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(buzzReferredAgent, "buzzReferredAgent");
        Log_OC.getArray(referralNavigator, "referralNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.fetchReferrals = fetchReferrals;
        this.fetchCurrentUser = fetchCurrentUser;
        this.buzzReferredAgent = buzzReferredAgent;
        this.referralNavigator = referralNavigator;
        this.analytics = analytics;
        this.status = "";
        this.userPhoneNumber = "";
        $r5 = C13726r.m3891e();
        this.referralList = $r5;
        C11280b $r7 = new C11280b();
        this.compositeDisposable = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buzzReferredAgent$lambda-8 */
    public static final void m40278buzzReferredAgent$lambda8(AgentReferralListPresenter agentReferralListPresenter, final String str, AgentReferralModel agentReferralModel) {
        Log_OC.getArray(agentReferralListPresenter, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Analytics $r2 = agentReferralListPresenter.analytics;
        String $r3 = agentReferralListPresenter.getUserPhoneNumber();
        ReferralAnalytics.DefaultImpls.buzzReferredAgentClicked$default($r2, $r3, str, true, null, 8, null);
        agentReferralListPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.Server
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void filter(Object obj) {
                String $r1 = str;
                AgentReferralListView $r32 = (AgentReferralListView) obj;
                AgentReferralListPresenter.m40279buzzReferredAgent$lambda8$lambda7($r1, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buzzReferredAgent$lambda-8$lambda-7 */
    public static final void m40279buzzReferredAgent$lambda8$lambda7(String str, AgentReferralListView agentReferralListView) {
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(agentReferralListView, "it");
        String $r1 = "A reminder has been sent to " + str + '.';
        agentReferralListView.showInfoSuccessMessage($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buzzReferredAgent$lambda-9 */
    public static final void m40280buzzReferredAgent$lambda9(AgentReferralListPresenter agentReferralListPresenter, String str, Throwable th) {
        Log_OC.getArray(agentReferralListPresenter, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        th.printStackTrace();
        Analytics $r3 = agentReferralListPresenter.analytics;
        String $r4 = agentReferralListPresenter.getUserPhoneNumber();
        String $r5 = th.getMessage();
        $r3.buzzReferredAgentClicked($r4, str, false, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideLoading(final int i) {
        this.isLoading = false;
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.ModulusCheckDigit
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void calculate(Object obj) {
                int $i0 = i;
                AgentReferralListView $r2 = (AgentReferralListView) obj;
                AgentReferralListPresenter.m40281hideLoading$lambda5($i0, $r2);
            }
        });
    }

    /* renamed from: hideLoading$lambda-5 */
    public static final void m40281hideLoading$lambda5(int i, AgentReferralListView agentReferralListView) {
        Log_OC.getArray(agentReferralListView, "view");
        if (i == 0) {
            agentReferralListView.hideLoading();
        } else {
            agentReferralListView.hideNextLoading();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-0 */
    public static final InterfaceC11692s m40282loadNext$lambda0(AgentReferralListPresenter agentReferralListPresenter, User user) {
        Log_OC.getArray(agentReferralListPresenter, "this$0");
        Log_OC.getArray(user, "it");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        agentReferralListPresenter.setUserPhoneNumber($r2);
        FetchReferrals $r3 = agentReferralListPresenter.fetchReferrals;
        String $r22 = user.getSessionId();
        Log_OC.loadImage($r22, "it.sessionId");
        int $i0 = agentReferralListPresenter.getPage();
        String $r4 = agentReferralListPresenter.getStatus();
        AbstractC11688p $r5 = $r3.execute($r22, $i0, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-2 */
    public static final void m40283loadNext$lambda2(AgentReferralListPresenter agentReferralListPresenter, List list) {
        List $r1;
        Log_OC.getArray(agentReferralListPresenter, "this$0");
        int $i0 = agentReferralListPresenter.getPage();
        agentReferralListPresenter.hideLoading($i0);
        boolean $z0 = list.isEmpty();
        if ($z0) {
            agentReferralListPresenter.shouldLoadNext = false;
        }
        int $i02 = agentReferralListPresenter.getPage();
        if ($i02 == 0) {
            Analytics $r2 = agentReferralListPresenter.analytics;
            String $r3 = agentReferralListPresenter.getUserPhoneNumber();
            ReferralAnalytics.DefaultImpls.listOfReferredAgentsClicked$default($r2, $r3, true, null, 4, null);
        }
        List $r4 = agentReferralListPresenter.referralList;
        Log_OC.loadImage(list, AttributeType.LIST);
        $r1 = C13742z.m3784n0($r4, list);
        agentReferralListPresenter.referralList = $r1;
        agentReferralListPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                AgentReferralListPresenter $r12 = AgentReferralListPresenter.this;
                AgentReferralListView $r32 = (AgentReferralListView) obj;
                AgentReferralListPresenter.m40284loadNext$lambda2$lambda1($r12, $r32);
            }
        });
        int $i03 = agentReferralListPresenter.getPage();
        agentReferralListPresenter.setPage($i03 + 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-2$lambda-1 */
    public static final void m40284loadNext$lambda2$lambda1(AgentReferralListPresenter agentReferralListPresenter, AgentReferralListView agentReferralListView) {
        Log_OC.getArray(agentReferralListPresenter, "this$0");
        Log_OC.getArray(agentReferralListView, "view");
        List $r2 = agentReferralListPresenter.referralList;
        boolean $z0 = $r2.isEmpty();
        if ($z0) {
            agentReferralListView.showEmptyReferralMessage();
            return;
        }
        List $r22 = agentReferralListPresenter.referralList;
        agentReferralListView.showAgentReferral($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-4 */
    public static final void m40285loadNext$lambda4(AgentReferralListPresenter agentReferralListPresenter, Throwable th) {
        Log_OC.getArray(agentReferralListPresenter, "this$0");
        th.printStackTrace();
        Analytics $r2 = agentReferralListPresenter.analytics;
        String $r3 = agentReferralListPresenter.getUserPhoneNumber();
        String $r4 = th.getMessage();
        $r2.listOfReferredAgentsClicked($r3, false, $r4);
        Direction $r5 = Direction.f972W;
        agentReferralListPresenter.ifViewAttached($r5);
    }

    /* renamed from: loadNext$lambda-4$lambda-3 */
    public static final void m40286loadNext$lambda4$lambda3(AgentReferralListView agentReferralListView) {
        Log_OC.getArray(agentReferralListView, "view");
        agentReferralListView.hideLoading();
        agentReferralListView.showError("Something went wrong. Please check your connection and refresh");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showLoading(final int i) {
        this.isLoading = true;
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.referral.presenters.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                int $i0 = i;
                AgentReferralListView $r2 = (AgentReferralListView) obj;
                AgentReferralListPresenter.m40287showLoading$lambda6($i0, $r2);
            }
        });
    }

    /* renamed from: showLoading$lambda-6 */
    public static final void m40287showLoading$lambda6(int i, AgentReferralListView agentReferralListView) {
        Log_OC.getArray(agentReferralListView, "view");
        if (i == 0) {
            agentReferralListView.showLoading();
        } else {
            agentReferralListView.showNextLoading();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void start$default(AgentReferralListPresenter agentReferralListPresenter, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "";
        }
        agentReferralListPresenter.start($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void buzzReferredAgent(String str, final String str2) {
        Log_OC.getArray(str, "referralId");
        Log_OC.getArray(str2, "phoneNumber");
        BuzzReferredAgent $r4 = this.buzzReferredAgent;
        AgentReferralModel $r1 = new AgentReferralModel(str, str2, null, null, 4, null);
        AbstractC11688p $r5 = $r4.execute($r1);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.referral.presenters.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralListPresenter $r12 = AgentReferralListPresenter.this;
                String $r2 = str2;
                AgentReferralModel $r42 = (AgentReferralModel) obj;
                AgentReferralListPresenter.m40278buzzReferredAgent$lambda8($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.referral.presenters.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AgentReferralListPresenter $r12 = AgentReferralListPresenter.this;
                String $r2 = str2;
                Throwable $r42 = (Throwable) obj;
                AgentReferralListPresenter.m40280buzzReferredAgent$lambda9($r12, $r2, $r42);
            }
        });
        Log_OC.loadImage($r8, "buzzReferredAgent.execute(\n            AgentReferralModel(\n                id = referralId, referredPhone = phoneNumber,\n                status = null\n            )\n        ).subscribe(\n            {\n                analytics.buzzReferredAgentClicked(userPhoneNumber, phoneNumber, true)\n                ifViewAttached {\n                    it.showInfoSuccessMessage(\"A reminder has been sent to $phoneNumber.\")\n                }\n            },\n            {\n                it.printStackTrace()\n                analytics.buzzReferredAgentClicked(\n                    userPhoneNumber, phoneNumber, false,\n                    it.message\n                )\n            }\n        )");
        C11280b $r9 = this.compositeDisposable;
        RxExtKt.addTo($r8, $r9);
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
    public final int getPage() {
        int i0 = this.page;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatus() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUserPhoneNumber() {
        String r1 = this.userPhoneNumber;
        return r1;
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
    public final void loadNext() {
        boolean $z0 = this.shouldLoadNext;
        if ($z0) {
            boolean $z02 = this.isLoading;
            if ($z02) {
                return;
            }
            int $i0 = this.page;
            showLoading($i0);
            FetchCurrentUser $r1 = this.fetchCurrentUser;
            AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
            AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.referral.presenters.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    AgentReferralListPresenter $r12 = AgentReferralListPresenter.this;
                    User $r42 = (User) obj;
                    InterfaceC11692s $r22 = AgentReferralListPresenter.m40282loadNext$lambda0($r12, $r42);
                    return $r22;
                }
            });
            FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.referral.presenters.SubjectSubscriptionManager$SubjectObserver
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AgentReferralListPresenter $r12 = AgentReferralListPresenter.this;
                    List $r3 = (List) obj;
                    AgentReferralListPresenter.m40283loadNext$lambda2($r12, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.referral.presenters.IOUtils$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AgentReferralListPresenter $r12 = AgentReferralListPresenter.this;
                    Throwable $r3 = (Throwable) obj;
                    AgentReferralListPresenter.m40285loadNext$lambda4($r12, $r3);
                }
            });
            Log_OC.loadImage($r7, "fetchCurrentUser.execute()\n            .flatMapObservable {\n                userPhoneNumber = it.phoneNumber\n                fetchReferrals.execute(it.sessionId, page, status)\n            }\n            .subscribe({ list ->\n                hideLoading(page)\n                if (list.isEmpty()) {\n                    shouldLoadNext = false\n                }\n                if (page == 0) {\n                    analytics.listOfReferredAgentsClicked(userPhoneNumber, true)\n                }\n                referralList = referralList.plus(list)\n\n                ifViewAttached { view ->\n                    if (referralList.isEmpty()) {\n                        view.showEmptyReferralMessage()\n                    } else {\n                        view.showAgentReferral(referralList)\n                    }\n                }\n                page = page.inc()\n\n            }, {\n                it.printStackTrace()\n                analytics.listOfReferredAgentsClicked(\n                    userPhoneNumber, false,\n                    it.message\n                )\n                ifViewAttached { view ->\n                    view.hideLoading()\n                    view.showError(\n                        \"Something went wrong. Please check your connection and refresh\"\n                    )\n                }\n            })");
            C11280b $r8 = this.compositeDisposable;
            RxExtKt.addTo($r7, $r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void openAgentSummary(String str, String str2) {
        Log_OC.getArray(str, "referralId");
        Log_OC.getArray(str2, "phoneNumber");
        ReferralNavigator $r3 = this.referralNavigator;
        $r3.navigateToViewAgentSummary(str2, str);
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setStatus(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.status = str;
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
    public final void start(String str) {
        List $r1;
        Log_OC.getArray(str, TransactionField.STATUS);
        $r1 = C13726r.m3891e();
        this.referralList = $r1;
        this.page = 0;
        this.status = str;
        this.shouldLoadNext = true;
        loadNext();
    }
}
