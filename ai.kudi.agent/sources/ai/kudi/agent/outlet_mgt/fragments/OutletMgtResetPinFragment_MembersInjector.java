package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletResetPinViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtResetPinFragment_MembersInjector implements InterfaceC9463a<OutletMgtResetPinFragment> {
    private final InterfaceC11700a<OutletResetPinViewModel> outletResetPinViewModelProvider;

    public OutletMgtResetPinFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.outletResetPinViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletMgtResetPinFragment_MembersInjector $r1 = new OutletMgtResetPinFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectOutletResetPinViewModel(OutletMgtResetPinFragment outletMgtResetPinFragment, OutletResetPinViewModel outletResetPinViewModel) {
        outletMgtResetPinFragment.outletResetPinViewModel = outletResetPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtResetPinFragment outletMgtResetPinFragment) {
        InterfaceC11700a $r3 = this.outletResetPinViewModelProvider;
        Object $r2 = $r3.get();
        OutletResetPinViewModel $r4 = (OutletResetPinViewModel) $r2;
        injectOutletResetPinViewModel(outletMgtResetPinFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtResetPinFragment $r2 = (OutletMgtResetPinFragment) obj;
        injectMembers($r2);
    }
}
