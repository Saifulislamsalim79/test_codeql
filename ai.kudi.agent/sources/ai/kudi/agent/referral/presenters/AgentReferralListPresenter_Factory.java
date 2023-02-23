package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.referral.domain.usecase.BuzzReferredAgent;
import ai.kudi.agent.referral.domain.usecase.FetchReferrals;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AgentReferralListPresenter_Factory implements InterfaceC9468d<AgentReferralListPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BuzzReferredAgent> buzzReferredAgentProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchReferrals> fetchReferralsProvider;
    private final InterfaceC11700a<ReferralNavigator> referralNavigatorProvider;

    public AgentReferralListPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.fetchReferralsProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.buzzReferredAgentProvider = interfaceC11700a3;
        this.referralNavigatorProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralListPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        AgentReferralListPresenter_Factory $r5 = new AgentReferralListPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralListPresenter newInstance(FetchReferrals fetchReferrals, FetchCurrentUser fetchCurrentUser, BuzzReferredAgent buzzReferredAgent, ReferralNavigator referralNavigator, Analytics analytics) {
        AgentReferralListPresenter $r5 = new AgentReferralListPresenter(fetchReferrals, fetchCurrentUser, buzzReferredAgent, referralNavigator, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralListPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchReferralsProvider;
        Object $r2 = $r1.get();
        FetchReferrals $r3 = (FetchReferrals) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.buzzReferredAgentProvider;
        Object $r23 = $r13.get();
        BuzzReferredAgent $r5 = (BuzzReferredAgent) $r23;
        InterfaceC11700a $r14 = this.referralNavigatorProvider;
        Object $r24 = $r14.get();
        ReferralNavigator $r6 = (ReferralNavigator) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        AgentReferralListPresenter $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40288multiply() {
        AgentReferralListPresenter $r1 = multiply();
        return $r1;
    }
}
