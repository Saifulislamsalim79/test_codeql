package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.users.data.network.UserService;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductDataSourceModule_ProvideUserServiceFactory */
/* loaded from: classes.dex */
public final class MarketplaceProductDataSourceModule_ProvideUserServiceFactory implements InterfaceC9468d<UserService> {
    private final MarketplaceProductDataSourceModule module;
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public MarketplaceProductDataSourceModule_ProvideUserServiceFactory(MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductDataSourceModule;
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductDataSourceModule_ProvideUserServiceFactory create(MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, InterfaceC11700a interfaceC11700a) {
        MarketplaceProductDataSourceModule_ProvideUserServiceFactory $r2 = new MarketplaceProductDataSourceModule_ProvideUserServiceFactory(marketplaceProductDataSourceModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UserService provideUserService(MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, C14841m c14841m) {
        UserService $r1 = marketplaceProductDataSourceModule.provideUserService(c14841m);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public UserService m38156b() {
        MarketplaceProductDataSourceModule $r1 = this.module;
        InterfaceC11700a $r2 = this.retrofitProvider;
        Object $r3 = $r2.get();
        C14841m $r4 = (C14841m) $r3;
        UserService $r5 = provideUserService($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38155b() {
        UserService $r1 = m38156b();
        return $r1;
    }
}
