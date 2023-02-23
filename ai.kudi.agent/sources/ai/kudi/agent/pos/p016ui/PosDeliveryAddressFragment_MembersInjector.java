package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.viewModels.PosDeliveryAddressViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.PosDeliveryAddressFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosDeliveryAddressFragment_MembersInjector implements InterfaceC9463a<PosDeliveryAddressFragment> {
    private final InterfaceC11700a<PosDeliveryAddressViewModel> posDeliveryAddressViewModelProvider;

    public PosDeliveryAddressFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.posDeliveryAddressViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosDeliveryAddressFragment_MembersInjector $r1 = new PosDeliveryAddressFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectPosDeliveryAddressViewModel(PosDeliveryAddressFragment posDeliveryAddressFragment, PosDeliveryAddressViewModel posDeliveryAddressViewModel) {
        posDeliveryAddressFragment.posDeliveryAddressViewModel = posDeliveryAddressViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosDeliveryAddressFragment posDeliveryAddressFragment) {
        InterfaceC11700a $r3 = this.posDeliveryAddressViewModelProvider;
        Object $r2 = $r3.get();
        PosDeliveryAddressViewModel $r4 = (PosDeliveryAddressViewModel) $r2;
        injectPosDeliveryAddressViewModel(posDeliveryAddressFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosDeliveryAddressFragment $r2 = (PosDeliveryAddressFragment) obj;
        injectMembers($r2);
    }
}
