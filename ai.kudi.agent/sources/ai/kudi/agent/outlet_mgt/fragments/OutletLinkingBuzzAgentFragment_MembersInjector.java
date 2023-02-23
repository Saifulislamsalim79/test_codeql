package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingBuzzAgentViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletLinkingBuzzAgentFragment_MembersInjector implements InterfaceC9463a<OutletLinkingBuzzAgentFragment> {
    private final InterfaceC11700a<OutletLinkingBuzzAgentViewModel> screenViewModelProvider;

    public OutletLinkingBuzzAgentFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletLinkingBuzzAgentFragment_MembersInjector $r1 = new OutletLinkingBuzzAgentFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment, OutletLinkingBuzzAgentViewModel outletLinkingBuzzAgentViewModel) {
        outletLinkingBuzzAgentFragment.screenViewModel = outletLinkingBuzzAgentViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        OutletLinkingBuzzAgentViewModel $r4 = (OutletLinkingBuzzAgentViewModel) $r2;
        injectScreenViewModel(outletLinkingBuzzAgentFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletLinkingBuzzAgentFragment $r2 = (OutletLinkingBuzzAgentFragment) obj;
        injectMembers($r2);
    }
}
