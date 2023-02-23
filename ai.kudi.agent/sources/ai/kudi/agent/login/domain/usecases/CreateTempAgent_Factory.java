package ai.kudi.agent.login.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateTempAgent_Factory implements InterfaceC9468d<CreateTempAgent> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public CreateTempAgent_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateTempAgent_Factory create(InterfaceC11700a interfaceC11700a) {
        CreateTempAgent_Factory $r1 = new CreateTempAgent_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateTempAgent newInstance(NetworkService networkService) {
        CreateTempAgent $r1 = new CreateTempAgent(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateTempAgent multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        CreateTempAgent $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39708multiply() {
        CreateTempAgent $r1 = multiply();
        return $r1;
    }
}
