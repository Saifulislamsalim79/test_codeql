package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductSectorRemoteSource;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesProductSectorRemoteSourceModuleFactory */
/* loaded from: classes.dex */
public final class C0684xd6e263c9 implements InterfaceC9468d<ProductSectorRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> marketplaceApiProvider;
    private final MarketplaceProductModule module;

    public C0684xd6e263c9(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductModule;
        this.marketplaceApiProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C0684xd6e263c9 create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        C0684xd6e263c9 $r2 = new C0684xd6e263c9(marketplaceProductModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorRemoteSource providesProductSectorRemoteSourceModule(MarketplaceProductModule marketplaceProductModule, MarketPlaceApi marketPlaceApi) {
        ProductSectorRemoteSource $r1 = marketplaceProductModule.providesProductSectorRemoteSourceModule(marketPlaceApi);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSectorRemoteSource remainder() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.marketplaceApiProvider;
        Object $r3 = $r2.get();
        MarketPlaceApi $r4 = (MarketPlaceApi) $r3;
        ProductSectorRemoteSource $r5 = providesProductSectorRemoteSourceModule($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41497remainder() {
        ProductSectorRemoteSource $r1 = remainder();
        return $r1;
    }
}
