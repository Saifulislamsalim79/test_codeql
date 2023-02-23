package ai.kudi.agent.network.mods;

import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p565l.InterfaceC14233u;
/* loaded from: classes.dex */
public final class MarketplaceServiceModule_VersionInterceptorFactory implements InterfaceC9468d<InterfaceC14233u> {
    private final MarketplaceServiceModule module;

    public MarketplaceServiceModule_VersionInterceptorFactory(MarketplaceServiceModule marketplaceServiceModule) {
        this.module = marketplaceServiceModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceServiceModule_VersionInterceptorFactory create(MarketplaceServiceModule marketplaceServiceModule) {
        MarketplaceServiceModule_VersionInterceptorFactory $r1 = new MarketplaceServiceModule_VersionInterceptorFactory(marketplaceServiceModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC14233u versionInterceptor(MarketplaceServiceModule marketplaceServiceModule) {
        InterfaceC14233u $r0 = marketplaceServiceModule.versionInterceptor();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object cbrt() {
        InterfaceC14233u $r1 = m39830cbrt();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public InterfaceC14233u m39830cbrt() {
        MarketplaceServiceModule $r2 = this.module;
        InterfaceC14233u $r1 = versionInterceptor($r2);
        return $r1;
    }
}
