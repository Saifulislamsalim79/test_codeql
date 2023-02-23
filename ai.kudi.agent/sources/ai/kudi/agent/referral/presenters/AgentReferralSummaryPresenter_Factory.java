package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.referral.domain.usecase.FetchAgentSummary;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AgentReferralSummaryPresenter_Factory implements InterfaceC9468d<AgentReferralSummaryPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchAgentSummary> fetchAgentSummaryProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public AgentReferralSummaryPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchAgentSummaryProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralSummaryPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        AgentReferralSummaryPresenter_Factory $r3 = new AgentReferralSummaryPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralSummaryPresenter newInstance(FetchAgentSummary fetchAgentSummary, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        AgentReferralSummaryPresenter $r3 = new AgentReferralSummaryPresenter(fetchAgentSummary, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralSummaryPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchAgentSummaryProvider;
        Object $r2 = $r1.get();
        FetchAgentSummary $r3 = (FetchAgentSummary) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        AgentReferralSummaryPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40297multiply() {
        AgentReferralSummaryPresenter $r1 = multiply();
        return $r1;
    }
}
