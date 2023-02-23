package ai.kudi.agent.users.data.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.users.data.network.UserService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RoomUserRepository_Factory implements InterfaceC9468d<RoomUserRepository> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;
    private final InterfaceC11700a<UserService> networkServiceProvider;

    public RoomUserRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.appRoomDatabaseProvider = interfaceC11700a;
        this.networkServiceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RoomUserRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RoomUserRepository_Factory $r2 = new RoomUserRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RoomUserRepository newInstance(CoreAppDatabase coreAppDatabase, UserService userService) {
        RoomUserRepository $r2 = new RoomUserRepository(coreAppDatabase, userService);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RoomUserRepository multiply() {
        InterfaceC11700a $r1 = this.appRoomDatabaseProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        InterfaceC11700a $r12 = this.networkServiceProvider;
        Object $r22 = $r12.get();
        UserService $r4 = (UserService) $r22;
        RoomUserRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41421multiply() {
        RoomUserRepository $r1 = multiply();
        return $r1;
    }
}
