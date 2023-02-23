package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductDataSourceModule_ProvidesCoreAppDatabaseFactory */
/* loaded from: classes.dex */
public final class C0681xd3901349 implements InterfaceC9468d<CoreAppDatabase> {
    private final InterfaceC11700a<Context> contextProvider;
    private final MarketplaceProductDataSourceModule module;

    public C0681xd3901349(MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductDataSourceModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C0681xd3901349 create(MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, InterfaceC11700a interfaceC11700a) {
        C0681xd3901349 $r2 = new C0681xd3901349(marketplaceProductDataSourceModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CoreAppDatabase providesCoreAppDatabase(MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, Context context) {
        CoreAppDatabase $r1 = marketplaceProductDataSourceModule.providesCoreAppDatabase(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public CoreAppDatabase get() {
        MarketplaceProductDataSourceModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        CoreAppDatabase $r5 = providesCoreAppDatabase($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        CoreAppDatabase $r1 = get();
        return $r1;
    }
}
