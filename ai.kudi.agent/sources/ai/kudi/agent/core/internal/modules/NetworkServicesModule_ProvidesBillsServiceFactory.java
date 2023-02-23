package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.bills.data.remote.BillsService;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class NetworkServicesModule_ProvidesBillsServiceFactory implements InterfaceC9468d<BillsService> {
    private final NetworkServicesModule module;
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public NetworkServicesModule_ProvidesBillsServiceFactory(NetworkServicesModule networkServicesModule, InterfaceC11700a interfaceC11700a) {
        this.module = networkServicesModule;
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkServicesModule_ProvidesBillsServiceFactory create(NetworkServicesModule networkServicesModule, InterfaceC11700a interfaceC11700a) {
        NetworkServicesModule_ProvidesBillsServiceFactory $r2 = new NetworkServicesModule_ProvidesBillsServiceFactory(networkServicesModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillsService providesBillsService(NetworkServicesModule networkServicesModule, C14841m c14841m) {
        BillsService $r1 = networkServicesModule.providesBillsService(c14841m);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public BillsService m38945b() {
        NetworkServicesModule $r1 = this.module;
        InterfaceC11700a $r2 = this.retrofitProvider;
        Object $r3 = $r2.get();
        C14841m $r4 = (C14841m) $r3;
        BillsService $r5 = providesBillsService($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38944b() {
        BillsService $r1 = m38945b();
        return $r1;
    }
}
