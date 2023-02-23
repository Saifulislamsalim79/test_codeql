package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UnsuspendOutlet_Factory implements InterfaceC9468d<UnsuspendOutlet> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public UnsuspendOutlet_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnsuspendOutlet_Factory create(InterfaceC11700a interfaceC11700a) {
        UnsuspendOutlet_Factory $r1 = new UnsuspendOutlet_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnsuspendOutlet newInstance(NetworkService networkService) {
        UnsuspendOutlet $r1 = new UnsuspendOutlet(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UnsuspendOutlet multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        UnsuspendOutlet $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39918multiply() {
        UnsuspendOutlet $r1 = multiply();
        return $r1;
    }
}
