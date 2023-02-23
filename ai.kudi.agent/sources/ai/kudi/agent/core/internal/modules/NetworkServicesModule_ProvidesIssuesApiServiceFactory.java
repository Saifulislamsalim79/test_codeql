package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.data.remote.IssuesApiService;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class NetworkServicesModule_ProvidesIssuesApiServiceFactory implements InterfaceC9468d<IssuesApiService> {
    private final NetworkServicesModule module;
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public NetworkServicesModule_ProvidesIssuesApiServiceFactory(NetworkServicesModule networkServicesModule, InterfaceC11700a interfaceC11700a) {
        this.module = networkServicesModule;
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkServicesModule_ProvidesIssuesApiServiceFactory create(NetworkServicesModule networkServicesModule, InterfaceC11700a interfaceC11700a) {
        NetworkServicesModule_ProvidesIssuesApiServiceFactory $r2 = new NetworkServicesModule_ProvidesIssuesApiServiceFactory(networkServicesModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssuesApiService providesIssuesApiService(NetworkServicesModule networkServicesModule, C14841m c14841m) {
        IssuesApiService $r1 = networkServicesModule.providesIssuesApiService(c14841m);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public IssuesApiService m38941b() {
        NetworkServicesModule $r1 = this.module;
        InterfaceC11700a $r2 = this.retrofitProvider;
        Object $r3 = $r2.get();
        C14841m $r4 = (C14841m) $r3;
        IssuesApiService $r5 = providesIssuesApiService($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38940b() {
        IssuesApiService $r1 = m38941b();
        return $r1;
    }
}
