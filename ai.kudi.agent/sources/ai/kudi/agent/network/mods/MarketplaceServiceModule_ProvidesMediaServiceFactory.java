package ai.kudi.agent.network.mods;

import ai.kudi.mediaservice.marketplaceCollection.FileStorageClient;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class MarketplaceServiceModule_ProvidesMediaServiceFactory implements InterfaceC9468d<FileStorageClient> {
    private final MarketplaceServiceModule module;

    public MarketplaceServiceModule_ProvidesMediaServiceFactory(MarketplaceServiceModule marketplaceServiceModule) {
        this.module = marketplaceServiceModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceServiceModule_ProvidesMediaServiceFactory create(MarketplaceServiceModule marketplaceServiceModule) {
        MarketplaceServiceModule_ProvidesMediaServiceFactory $r1 = new MarketplaceServiceModule_ProvidesMediaServiceFactory(marketplaceServiceModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FileStorageClient providesMediaService(MarketplaceServiceModule marketplaceServiceModule) {
        FileStorageClient $r0 = marketplaceServiceModule.providesMediaService();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FileStorageClient cbrt() {
        MarketplaceServiceModule $r2 = this.module;
        FileStorageClient $r1 = providesMediaService($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39829cbrt() {
        FileStorageClient $r1 = cbrt();
        return $r1;
    }
}
