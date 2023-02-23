package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.referral.presenters.AgentReferralInvitePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.referral.ui.AgentReferredInvitationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AgentReferredInvitationFragment_MembersInjector implements InterfaceC9463a<AgentReferredInvitationFragment> {
    private final InterfaceC11700a<AgentReferralInvitePresenter> agentListPresenterProvider;

    public AgentReferredInvitationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.agentListPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AgentReferredInvitationFragment_MembersInjector $r1 = new AgentReferredInvitationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAgentListPresenter(AgentReferredInvitationFragment agentReferredInvitationFragment, AgentReferralInvitePresenter agentReferralInvitePresenter) {
        agentReferredInvitationFragment.agentListPresenter = agentReferralInvitePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AgentReferredInvitationFragment agentReferredInvitationFragment) {
        InterfaceC11700a $r3 = this.agentListPresenterProvider;
        Object $r2 = $r3.get();
        AgentReferralInvitePresenter $r4 = (AgentReferralInvitePresenter) $r2;
        injectAgentListPresenter(agentReferredInvitationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AgentReferredInvitationFragment $r2 = (AgentReferredInvitationFragment) obj;
        injectMembers($r2);
    }
}
