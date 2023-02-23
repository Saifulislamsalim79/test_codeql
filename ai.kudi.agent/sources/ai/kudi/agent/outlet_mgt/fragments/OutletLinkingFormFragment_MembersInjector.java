package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletLinkingFormFragment_MembersInjector implements InterfaceC9463a<OutletLinkingFormFragment> {
    private final InterfaceC11700a<OutletLinkingFormViewModel> screenViewModelProvider;

    public OutletLinkingFormFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletLinkingFormFragment_MembersInjector $r1 = new OutletLinkingFormFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(OutletLinkingFormFragment outletLinkingFormFragment, OutletLinkingFormViewModel outletLinkingFormViewModel) {
        outletLinkingFormFragment.screenViewModel = outletLinkingFormViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletLinkingFormFragment outletLinkingFormFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        OutletLinkingFormViewModel $r4 = (OutletLinkingFormViewModel) $r2;
        injectScreenViewModel(outletLinkingFormFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletLinkingFormFragment $r2 = (OutletLinkingFormFragment) obj;
        injectMembers($r2);
    }
}
