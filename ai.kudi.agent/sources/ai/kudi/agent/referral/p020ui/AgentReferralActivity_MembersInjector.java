package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.referral.presenters.AgentReferralPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.referral.ui.AgentReferralActivity_MembersInjector */
/* loaded from: classes.dex */
public final class AgentReferralActivity_MembersInjector implements InterfaceC9463a<AgentReferralActivity> {
    private final InterfaceC11700a<AgentReferralPresenter> agentReferralPresenterProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public AgentReferralActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.agentReferralPresenterProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        AgentReferralActivity_MembersInjector $r2 = new AgentReferralActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAgentReferralPresenter(AgentReferralActivity agentReferralActivity, AgentReferralPresenter agentReferralPresenter) {
        agentReferralActivity.agentReferralPresenter = agentReferralPresenter;
    }

    public static void injectSmartLookAnalytics(AgentReferralActivity agentReferralActivity, SmartLookAnalytics smartLookAnalytics) {
        agentReferralActivity.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AgentReferralActivity agentReferralActivity) {
        InterfaceC11700a $r2 = this.agentReferralPresenterProvider;
        Object $r3 = $r2.get();
        AgentReferralPresenter $r4 = (AgentReferralPresenter) $r3;
        injectAgentReferralPresenter(agentReferralActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(agentReferralActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AgentReferralActivity $r2 = (AgentReferralActivity) obj;
        injectMembers($r2);
    }
}
