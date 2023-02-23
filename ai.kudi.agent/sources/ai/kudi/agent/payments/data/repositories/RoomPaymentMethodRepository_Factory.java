package ai.kudi.agent.payments.data.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RoomPaymentMethodRepository_Factory implements InterfaceC9468d<RoomPaymentMethodRepository> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public RoomPaymentMethodRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.appRoomDatabaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RoomPaymentMethodRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RoomPaymentMethodRepository_Factory $r2 = new RoomPaymentMethodRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RoomPaymentMethodRepository newInstance(NetworkService networkService, CoreAppDatabase coreAppDatabase) {
        RoomPaymentMethodRepository $r2 = new RoomPaymentMethodRepository(networkService, coreAppDatabase);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RoomPaymentMethodRepository multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.appRoomDatabaseProvider;
        Object $r22 = $r12.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r22;
        RoomPaymentMethodRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40005multiply() {
        RoomPaymentMethodRepository $r1 = multiply();
        return $r1;
    }
}
