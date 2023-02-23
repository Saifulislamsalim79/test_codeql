package ai.kudi.agent.network.mods;

import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p565l.p574h0.C14207a;
/* loaded from: classes.dex */
public final class MarketplaceServiceModule_LoggingterceptorFactory implements InterfaceC9468d<C14207a> {
    private final MarketplaceServiceModule module;

    public MarketplaceServiceModule_LoggingterceptorFactory(MarketplaceServiceModule marketplaceServiceModule) {
        this.module = marketplaceServiceModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceServiceModule_LoggingterceptorFactory create(MarketplaceServiceModule marketplaceServiceModule) {
        MarketplaceServiceModule_LoggingterceptorFactory $r1 = new MarketplaceServiceModule_LoggingterceptorFactory(marketplaceServiceModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C14207a loggingterceptor(MarketplaceServiceModule marketplaceServiceModule) {
        C14207a $r0 = marketplaceServiceModule.loggingterceptor();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object cbrt() {
        C14207a $r1 = m39828cbrt();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public C14207a m39828cbrt() {
        MarketplaceServiceModule $r2 = this.module;
        C14207a $r1 = loggingterceptor($r2);
        return $r1;
    }
}
