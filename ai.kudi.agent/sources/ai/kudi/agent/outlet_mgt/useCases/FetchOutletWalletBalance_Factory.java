package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchOutletWalletBalance_Factory implements InterfaceC9468d<FetchOutletWalletBalance> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public FetchOutletWalletBalance_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchOutletWalletBalance_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchOutletWalletBalance_Factory $r1 = new FetchOutletWalletBalance_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchOutletWalletBalance newInstance(NetworkService networkService) {
        FetchOutletWalletBalance $r1 = new FetchOutletWalletBalance(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchOutletWalletBalance multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        FetchOutletWalletBalance $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39909multiply() {
        FetchOutletWalletBalance $r1 = multiply();
        return $r1;
    }
}
