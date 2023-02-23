package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.referral.presenters.AgentReferralInfoPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.referral.ui.AgentReferralInfoFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AgentReferralInfoFragment_MembersInjector implements InterfaceC9463a<AgentReferralInfoFragment> {
    private final InterfaceC11700a<AgentReferralInfoPresenter> agentReferralInfoPresenterProvider;

    public AgentReferralInfoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.agentReferralInfoPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AgentReferralInfoFragment_MembersInjector $r1 = new AgentReferralInfoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAgentReferralInfoPresenter(AgentReferralInfoFragment agentReferralInfoFragment, AgentReferralInfoPresenter agentReferralInfoPresenter) {
        agentReferralInfoFragment.agentReferralInfoPresenter = agentReferralInfoPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AgentReferralInfoFragment agentReferralInfoFragment) {
        InterfaceC11700a $r3 = this.agentReferralInfoPresenterProvider;
        Object $r2 = $r3.get();
        AgentReferralInfoPresenter $r4 = (AgentReferralInfoPresenter) $r2;
        injectAgentReferralInfoPresenter(agentReferralInfoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AgentReferralInfoFragment $r2 = (AgentReferralInfoFragment) obj;
        injectMembers($r2);
    }
}
