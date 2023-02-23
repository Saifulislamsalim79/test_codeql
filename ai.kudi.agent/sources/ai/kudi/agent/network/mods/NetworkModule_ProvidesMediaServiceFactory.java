package ai.kudi.agent.network.mods;

import ai.kudi.mediaservice.DrakeClient;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class NetworkModule_ProvidesMediaServiceFactory implements InterfaceC9468d<DrakeClient> {
    private final NetworkModule module;

    public NetworkModule_ProvidesMediaServiceFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkModule_ProvidesMediaServiceFactory create(NetworkModule networkModule) {
        NetworkModule_ProvidesMediaServiceFactory $r1 = new NetworkModule_ProvidesMediaServiceFactory(networkModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DrakeClient providesMediaService(NetworkModule networkModule) {
        DrakeClient $r0 = networkModule.providesMediaService();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DrakeClient cbrt() {
        NetworkModule $r2 = this.module;
        DrakeClient $r1 = providesMediaService($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39835cbrt() {
        DrakeClient $r1 = cbrt();
        return $r1;
    }
}
