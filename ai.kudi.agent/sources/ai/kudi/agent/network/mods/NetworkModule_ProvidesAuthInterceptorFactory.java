package ai.kudi.agent.network.mods;

import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p565l.InterfaceC14233u;
/* loaded from: classes.dex */
public final class NetworkModule_ProvidesAuthInterceptorFactory implements InterfaceC9468d<InterfaceC14233u> {
    private final NetworkModule module;

    public NetworkModule_ProvidesAuthInterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkModule_ProvidesAuthInterceptorFactory create(NetworkModule networkModule) {
        NetworkModule_ProvidesAuthInterceptorFactory $r1 = new NetworkModule_ProvidesAuthInterceptorFactory(networkModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC14233u providesAuthInterceptor(NetworkModule networkModule) {
        InterfaceC14233u $r0 = networkModule.providesAuthInterceptor();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object cbrt() {
        InterfaceC14233u $r1 = m39833cbrt();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public InterfaceC14233u m39833cbrt() {
        NetworkModule $r2 = this.module;
        InterfaceC14233u $r1 = providesAuthInterceptor($r2);
        return $r1;
    }
}
