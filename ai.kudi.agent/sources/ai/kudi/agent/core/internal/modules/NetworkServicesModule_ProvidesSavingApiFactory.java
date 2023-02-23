package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.data.api.SavingsApi;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class NetworkServicesModule_ProvidesSavingApiFactory implements InterfaceC9468d<SavingsApi> {
    private final NetworkServicesModule module;
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public NetworkServicesModule_ProvidesSavingApiFactory(NetworkServicesModule networkServicesModule, InterfaceC11700a interfaceC11700a) {
        this.module = networkServicesModule;
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkServicesModule_ProvidesSavingApiFactory create(NetworkServicesModule networkServicesModule, InterfaceC11700a interfaceC11700a) {
        NetworkServicesModule_ProvidesSavingApiFactory $r2 = new NetworkServicesModule_ProvidesSavingApiFactory(networkServicesModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ai.kudi.agent.savings.data.worker.SavingsApi providesSavingApi(NetworkServicesModule networkServicesModule, C14841m c14841m) {
        ai.kudi.agent.savings.data.worker.SavingsApi $r1 = networkServicesModule.providesSavingApi(c14841m);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public ai.kudi.agent.savings.data.worker.SavingsApi m38939b() {
        NetworkServicesModule $r1 = this.module;
        InterfaceC11700a $r2 = this.retrofitProvider;
        Object $r3 = $r2.get();
        C14841m $r4 = (C14841m) $r3;
        ai.kudi.agent.savings.data.worker.SavingsApi $r5 = providesSavingApi($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38938b() {
        ai.kudi.agent.savings.data.worker.SavingsApi $r1 = m38939b();
        return $r1;
    }
}
