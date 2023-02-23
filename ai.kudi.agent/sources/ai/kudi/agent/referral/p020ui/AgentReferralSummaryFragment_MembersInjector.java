package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.referral.presenters.AgentReferralSummaryPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.referral.ui.AgentReferralSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AgentReferralSummaryFragment_MembersInjector implements InterfaceC9463a<AgentReferralSummaryFragment> {
    private final InterfaceC11700a<AgentReferralSummaryPresenter> thisPresenterProvider;

    public AgentReferralSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AgentReferralSummaryFragment_MembersInjector $r1 = new AgentReferralSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(AgentReferralSummaryFragment agentReferralSummaryFragment, AgentReferralSummaryPresenter agentReferralSummaryPresenter) {
        agentReferralSummaryFragment.thisPresenter = agentReferralSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AgentReferralSummaryFragment agentReferralSummaryFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        AgentReferralSummaryPresenter $r4 = (AgentReferralSummaryPresenter) $r2;
        injectThisPresenter(agentReferralSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AgentReferralSummaryFragment $r2 = (AgentReferralSummaryFragment) obj;
        injectMembers($r2);
    }
}
