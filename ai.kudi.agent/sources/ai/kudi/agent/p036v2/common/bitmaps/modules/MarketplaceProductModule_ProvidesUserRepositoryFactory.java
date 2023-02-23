package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesUserRepositoryFactory */
/* loaded from: classes.dex */
public final class MarketplaceProductModule_ProvidesUserRepositoryFactory implements InterfaceC9468d<UserRepository> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;
    private final MarketplaceProductModule module;
    private final InterfaceC11700a<UserService> serviceProvider;

    public MarketplaceProductModule_ProvidesUserRepositoryFactory(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.module = marketplaceProductModule;
        this.appRoomDatabaseProvider = interfaceC11700a;
        this.serviceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductModule_ProvidesUserRepositoryFactory create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        MarketplaceProductModule_ProvidesUserRepositoryFactory $r3 = new MarketplaceProductModule_ProvidesUserRepositoryFactory(marketplaceProductModule, interfaceC11700a, interfaceC11700a2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UserRepository providesUserRepository(MarketplaceProductModule marketplaceProductModule, CoreAppDatabase coreAppDatabase, UserService userService) {
        UserRepository $r2 = marketplaceProductModule.providesUserRepository(coreAppDatabase, userService);
        C9473g.m14647e($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UserRepository remainder() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.appRoomDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        InterfaceC11700a $r22 = this.serviceProvider;
        Object $r32 = $r22.get();
        UserService $r5 = (UserService) $r32;
        UserRepository $r6 = providesUserRepository($r1, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41498remainder() {
        UserRepository $r1 = remainder();
        return $r1;
    }
}
