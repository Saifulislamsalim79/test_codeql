package ai.kudi.agent.network.mods;

import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p565l.InterfaceC14233u;
/* loaded from: classes.dex */
public final class NetworkModule_ProvidesVersionInterceptorFactory implements InterfaceC9468d<InterfaceC14233u> {
    private final NetworkModule module;

    public NetworkModule_ProvidesVersionInterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkModule_ProvidesVersionInterceptorFactory create(NetworkModule networkModule) {
        NetworkModule_ProvidesVersionInterceptorFactory $r1 = new NetworkModule_ProvidesVersionInterceptorFactory(networkModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC14233u providesVersionInterceptor(NetworkModule networkModule) {
        InterfaceC14233u $r0 = networkModule.providesVersionInterceptor();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object cbrt() {
        InterfaceC14233u $r1 = m39836cbrt();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public InterfaceC14233u m39836cbrt() {
        NetworkModule $r2 = this.module;
        InterfaceC14233u $r1 = providesVersionInterceptor($r2);
        return $r1;
    }
}
