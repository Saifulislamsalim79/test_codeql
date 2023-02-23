package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesUserRepositoryModuleFactory */
/* loaded from: classes.dex */
public final class MarketplaceProductModule_ProvidesUserRepositoryModuleFactory implements InterfaceC9468d<FetchCurrentUser> {
    private final MarketplaceProductModule module;
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public MarketplaceProductModule_ProvidesUserRepositoryModuleFactory(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductModule;
        this.userRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductModule_ProvidesUserRepositoryModuleFactory create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        MarketplaceProductModule_ProvidesUserRepositoryModuleFactory $r2 = new MarketplaceProductModule_ProvidesUserRepositoryModuleFactory(marketplaceProductModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCurrentUser providesUserRepositoryModule(MarketplaceProductModule marketplaceProductModule, UserRepository userRepository) {
        FetchCurrentUser $r1 = marketplaceProductModule.providesUserRepositoryModule(userRepository);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchCurrentUser remainder() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.userRepositoryProvider;
        Object $r3 = $r2.get();
        UserRepository $r4 = (UserRepository) $r3;
        FetchCurrentUser $r5 = providesUserRepositoryModule($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41499remainder() {
        FetchCurrentUser $r1 = remainder();
        return $r1;
    }
}
