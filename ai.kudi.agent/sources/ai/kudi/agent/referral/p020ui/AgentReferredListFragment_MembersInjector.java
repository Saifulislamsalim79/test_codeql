package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.referral.presenters.AgentReferralListPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.referral.ui.AgentReferredListFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AgentReferredListFragment_MembersInjector implements InterfaceC9463a<AgentReferredListFragment> {
    private final InterfaceC11700a<AgentReferralListPresenter> agentListPresenterProvider;

    public AgentReferredListFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.agentListPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AgentReferredListFragment_MembersInjector $r1 = new AgentReferredListFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAgentListPresenter(AgentReferredListFragment agentReferredListFragment, AgentReferralListPresenter agentReferralListPresenter) {
        agentReferredListFragment.agentListPresenter = agentReferralListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AgentReferredListFragment agentReferredListFragment) {
        InterfaceC11700a $r3 = this.agentListPresenterProvider;
        Object $r2 = $r3.get();
        AgentReferralListPresenter $r4 = (AgentReferralListPresenter) $r2;
        injectAgentListPresenter(agentReferredListFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AgentReferredListFragment $r2 = (AgentReferredListFragment) obj;
        injectMembers($r2);
    }
}
