package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvidesUserRepositoryFactory implements InterfaceC9468d<UserRepository> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;
    private final RepositoryModule module;
    private final InterfaceC11700a<UserService> serviceProvider;

    public RepositoryModule_ProvidesUserRepositoryFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.module = repositoryModule;
        this.appRoomDatabaseProvider = interfaceC11700a;
        this.serviceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvidesUserRepositoryFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RepositoryModule_ProvidesUserRepositoryFactory $r3 = new RepositoryModule_ProvidesUserRepositoryFactory(repositoryModule, interfaceC11700a, interfaceC11700a2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UserRepository providesUserRepository(RepositoryModule repositoryModule, CoreAppDatabase coreAppDatabase, UserService userService) {
        UserRepository $r2 = repositoryModule.providesUserRepository(coreAppDatabase, userService);
        C9473g.m14647e($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UserRepository remainder() {
        RepositoryModule $r1 = this.module;
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
    public /* bridge */ /* synthetic */ Object m41494remainder() {
        UserRepository $r1 = remainder();
        return $r1;
    }
}
