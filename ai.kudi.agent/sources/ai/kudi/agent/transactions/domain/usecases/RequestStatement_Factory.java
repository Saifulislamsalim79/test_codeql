package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RequestStatement_Factory implements InterfaceC9468d<RequestStatement> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public RequestStatement_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestStatement_Factory create(InterfaceC11700a interfaceC11700a) {
        RequestStatement_Factory $r1 = new RequestStatement_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestStatement newInstance(NetworkService networkService) {
        RequestStatement $r1 = new RequestStatement(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestStatement multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        RequestStatement $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41115multiply() {
        RequestStatement $r1 = multiply();
        return $r1;
    }
}
