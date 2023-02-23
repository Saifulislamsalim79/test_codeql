package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DeleteDevice_Factory implements InterfaceC9468d<DeleteDevice> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public DeleteDevice_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DeleteDevice_Factory create(InterfaceC11700a interfaceC11700a) {
        DeleteDevice_Factory $r1 = new DeleteDevice_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DeleteDevice newInstance(NetworkService networkService) {
        DeleteDevice $r1 = new DeleteDevice(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DeleteDevice multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        DeleteDevice $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40746multiply() {
        DeleteDevice $r1 = multiply();
        return $r1;
    }
}
