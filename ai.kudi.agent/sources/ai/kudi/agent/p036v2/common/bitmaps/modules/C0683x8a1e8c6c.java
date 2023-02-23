package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesProductSectorLocalSourceModuleFactory */
/* loaded from: classes.dex */
public final class C0683x8a1e8c6c implements InterfaceC9468d<ProductSectorLocalSource> {
    private final InterfaceC11700a<CoreAppDatabase> appCoreAppDatabaseProvider;
    private final MarketplaceProductModule module;

    public C0683x8a1e8c6c(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductModule;
        this.appCoreAppDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C0683x8a1e8c6c create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        C0683x8a1e8c6c $r2 = new C0683x8a1e8c6c(marketplaceProductModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorLocalSource providesProductSectorLocalSourceModule(MarketplaceProductModule marketplaceProductModule, CoreAppDatabase coreAppDatabase) {
        ProductSectorLocalSource $r1 = marketplaceProductModule.providesProductSectorLocalSourceModule(coreAppDatabase);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSectorLocalSource remainder() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.appCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        ProductSectorLocalSource $r5 = providesProductSectorLocalSourceModule($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41496remainder() {
        ProductSectorLocalSource $r1 = remainder();
        return $r1;
    }
}
