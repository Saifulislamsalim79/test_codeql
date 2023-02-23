package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.users.data.network.UserService;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesLocationModuleFactory */
/* loaded from: classes.dex */
public final class MarketplaceProductModule_ProvidesLocationModuleFactory implements InterfaceC9468d<FetchLocation> {
    private final MarketplaceProductModule module;
    private final InterfaceC11700a<UserService> userServiceProvider;

    public MarketplaceProductModule_ProvidesLocationModuleFactory(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductModule;
        this.userServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductModule_ProvidesLocationModuleFactory create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        MarketplaceProductModule_ProvidesLocationModuleFactory $r2 = new MarketplaceProductModule_ProvidesLocationModuleFactory(marketplaceProductModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchLocation providesLocationModule(MarketplaceProductModule marketplaceProductModule, UserService userService) {
        FetchLocation $r1 = marketplaceProductModule.providesLocationModule(userService);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchLocation getItemForId() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.userServiceProvider;
        Object $r3 = $r2.get();
        UserService $r4 = (UserService) $r3;
        FetchLocation $r5 = providesLocationModule($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getItemForId  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41495getItemForId() {
        FetchLocation $r1 = getItemForId();
        return $r1;
    }
}
