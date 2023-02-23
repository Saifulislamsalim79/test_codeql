package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtCreatePinViewModel;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtCreatePinFragment_MembersInjector implements InterfaceC9463a<OutletMgtCreatePinFragment> {
    private final InterfaceC11700a<OutletMgtCreatePinViewModel> outletMgtCreatePinViewModelProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;

    public OutletMgtCreatePinFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.outletMgtCreatePinViewModelProvider = interfaceC11700a;
        this.remoteConfigProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OutletMgtCreatePinFragment_MembersInjector $r2 = new OutletMgtCreatePinFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectOutletMgtCreatePinViewModel(OutletMgtCreatePinFragment outletMgtCreatePinFragment, OutletMgtCreatePinViewModel outletMgtCreatePinViewModel) {
        outletMgtCreatePinFragment.outletMgtCreatePinViewModel = outletMgtCreatePinViewModel;
    }

    public static void injectRemoteConfig(OutletMgtCreatePinFragment outletMgtCreatePinFragment, Frame frame) {
        outletMgtCreatePinFragment.remoteConfig = frame;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtCreatePinFragment outletMgtCreatePinFragment) {
        InterfaceC11700a $r2 = this.outletMgtCreatePinViewModelProvider;
        Object $r3 = $r2.get();
        OutletMgtCreatePinViewModel $r4 = (OutletMgtCreatePinViewModel) $r3;
        injectOutletMgtCreatePinViewModel(outletMgtCreatePinFragment, $r4);
        InterfaceC11700a $r22 = this.remoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectRemoteConfig(outletMgtCreatePinFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtCreatePinFragment $r2 = (OutletMgtCreatePinFragment) obj;
        injectMembers($r2);
    }
}
