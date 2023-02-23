package ai.kudi.agent.network.mods;

import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p565l.p574h0.C14207a;
/* loaded from: classes.dex */
public final class NetworkModule_ProvidesLoginInterceptorFactory implements InterfaceC9468d<C14207a> {
    private final NetworkModule module;

    public NetworkModule_ProvidesLoginInterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NetworkModule_ProvidesLoginInterceptorFactory create(NetworkModule networkModule) {
        NetworkModule_ProvidesLoginInterceptorFactory $r1 = new NetworkModule_ProvidesLoginInterceptorFactory(networkModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C14207a providesLoginInterceptor(NetworkModule networkModule) {
        C14207a $r0 = networkModule.providesLoginInterceptor();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object cbrt() {
        C14207a $r1 = m39834cbrt();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public C14207a m39834cbrt() {
        NetworkModule $r2 = this.module;
        C14207a $r1 = providesLoginInterceptor($r2);
        return $r1;
    }
}
