package ai.kudi.agent.core.network;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class NetworkService_Factory implements InterfaceC9468d<NetworkService> {
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public NetworkService_Factory(InterfaceC11700a interfaceC11700a) {
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkService_Factory create(InterfaceC11700a interfaceC11700a) {
        NetworkService_Factory $r1 = new NetworkService_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkService newInstance(C14841m c14841m) {
        NetworkService $r1 = new NetworkService(c14841m);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public NetworkService m38933b() {
        InterfaceC11700a $r1 = this.retrofitProvider;
        Object $r2 = $r1.get();
        C14841m $r3 = (C14841m) $r2;
        NetworkService $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38932b() {
        NetworkService $r1 = m38933b();
        return $r1;
    }
}
