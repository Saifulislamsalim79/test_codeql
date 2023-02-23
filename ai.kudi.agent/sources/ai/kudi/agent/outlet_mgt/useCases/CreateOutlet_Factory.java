package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateOutlet_Factory implements InterfaceC9468d<CreateOutlet> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public CreateOutlet_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateOutlet_Factory create(InterfaceC11700a interfaceC11700a) {
        CreateOutlet_Factory $r1 = new CreateOutlet_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateOutlet newInstance(NetworkService networkService) {
        CreateOutlet $r1 = new CreateOutlet(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateOutlet multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        CreateOutlet $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39899multiply() {
        CreateOutlet $r1 = multiply();
        return $r1;
    }
}
