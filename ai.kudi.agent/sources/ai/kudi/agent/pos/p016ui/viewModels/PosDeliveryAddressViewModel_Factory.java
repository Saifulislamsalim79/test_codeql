package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.viewModels.PosDeliveryAddressViewModel_Factory */
/* loaded from: classes.dex */
public final class PosDeliveryAddressViewModel_Factory implements InterfaceC9468d<PosDeliveryAddressViewModel> {
    private final InterfaceC11700a<FetchLocation> fetchLocationProvider;
    private final InterfaceC11700a<TerminalRequestNavigator> terminalRequestNavigatorProvider;

    public PosDeliveryAddressViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.terminalRequestNavigatorProvider = interfaceC11700a;
        this.fetchLocationProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosDeliveryAddressViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PosDeliveryAddressViewModel_Factory $r2 = new PosDeliveryAddressViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosDeliveryAddressViewModel newInstance(TerminalRequestNavigator terminalRequestNavigator, FetchLocation fetchLocation) {
        PosDeliveryAddressViewModel $r2 = new PosDeliveryAddressViewModel(terminalRequestNavigator, fetchLocation);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosDeliveryAddressViewModel multiply() {
        InterfaceC11700a $r1 = this.terminalRequestNavigatorProvider;
        Object $r2 = $r1.get();
        TerminalRequestNavigator $r3 = (TerminalRequestNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchLocationProvider;
        Object $r22 = $r12.get();
        FetchLocation $r4 = (FetchLocation) $r22;
        PosDeliveryAddressViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40092multiply() {
        PosDeliveryAddressViewModel $r1 = multiply();
        return $r1;
    }
}
