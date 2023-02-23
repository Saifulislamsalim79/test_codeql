package ai.kudi.agent.transfer.domain.sources.remote;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionLookUpRemoteSource_Factory implements InterfaceC9468d<TransactionLookUpRemoteSource> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public TransactionLookUpRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionLookUpRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        TransactionLookUpRemoteSource_Factory $r1 = new TransactionLookUpRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionLookUpRemoteSource newInstance(NetworkService networkService) {
        TransactionLookUpRemoteSource $r1 = new TransactionLookUpRemoteSource(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionLookUpRemoteSource multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        TransactionLookUpRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41315multiply() {
        TransactionLookUpRemoteSource $r1 = multiply();
        return $r1;
    }
}
