package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.referral.domain.usecase.CreateAgentReferral;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AgentReferralInvitePresenter_Factory implements InterfaceC9468d<AgentReferralInvitePresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CreateAgentReferral> createAgentReferralProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ReferralNavigator> referralNavigatorProvider;

    public AgentReferralInvitePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.createAgentReferralProvider = interfaceC11700a2;
        this.referralNavigatorProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralInvitePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        AgentReferralInvitePresenter_Factory $r4 = new AgentReferralInvitePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralInvitePresenter newInstance(FetchCurrentUser fetchCurrentUser, CreateAgentReferral createAgentReferral, ReferralNavigator referralNavigator, Analytics analytics) {
        AgentReferralInvitePresenter $r4 = new AgentReferralInvitePresenter(fetchCurrentUser, createAgentReferral, referralNavigator, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralInvitePresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.createAgentReferralProvider;
        Object $r22 = $r12.get();
        CreateAgentReferral $r4 = (CreateAgentReferral) $r22;
        InterfaceC11700a $r13 = this.referralNavigatorProvider;
        Object $r23 = $r13.get();
        ReferralNavigator $r5 = (ReferralNavigator) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        AgentReferralInvitePresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40277multiply() {
        AgentReferralInvitePresenter $r1 = multiply();
        return $r1;
    }
}
