package ai.kudi.agent.network.mods;

import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p565l.InterfaceC14233u;
/* loaded from: classes.dex */
public final class MarketplaceServiceModule_AuthInterceptorFactory implements InterfaceC9468d<InterfaceC14233u> {
    private final MarketplaceServiceModule module;

    public MarketplaceServiceModule_AuthInterceptorFactory(MarketplaceServiceModule marketplaceServiceModule) {
        this.module = marketplaceServiceModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC14233u authInterceptor(MarketplaceServiceModule marketplaceServiceModule) {
        InterfaceC14233u $r0 = marketplaceServiceModule.authInterceptor();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceServiceModule_AuthInterceptorFactory create(MarketplaceServiceModule marketplaceServiceModule) {
        MarketplaceServiceModule_AuthInterceptorFactory $r1 = new MarketplaceServiceModule_AuthInterceptorFactory(marketplaceServiceModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object cbrt() {
        InterfaceC14233u $r1 = m39827cbrt();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public InterfaceC14233u m39827cbrt() {
        MarketplaceServiceModule $r2 = this.module;
        InterfaceC14233u $r1 = authInterceptor($r2);
        return $r1;
    }
}
