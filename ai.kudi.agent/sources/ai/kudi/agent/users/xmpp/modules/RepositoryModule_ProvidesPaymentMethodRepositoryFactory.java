package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.payments.data.repositories.PaymentMethodRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvidesPaymentMethodRepositoryFactory implements InterfaceC9468d<PaymentMethodRepository> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;
    private final RepositoryModule module;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public RepositoryModule_ProvidesPaymentMethodRepositoryFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.module = repositoryModule;
        this.networkServiceProvider = interfaceC11700a;
        this.appRoomDatabaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvidesPaymentMethodRepositoryFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RepositoryModule_ProvidesPaymentMethodRepositoryFactory $r3 = new RepositoryModule_ProvidesPaymentMethodRepositoryFactory(repositoryModule, interfaceC11700a, interfaceC11700a2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PaymentMethodRepository providesPaymentMethodRepository(RepositoryModule repositoryModule, NetworkService networkService, CoreAppDatabase coreAppDatabase) {
        PaymentMethodRepository $r2 = repositoryModule.providesPaymentMethodRepository(networkService, coreAppDatabase);
        C9473g.m14647e($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PaymentMethodRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.networkServiceProvider;
        Object $r3 = $r2.get();
        NetworkService $r4 = (NetworkService) $r3;
        InterfaceC11700a $r22 = this.appRoomDatabaseProvider;
        Object $r32 = $r22.get();
        CoreAppDatabase $r5 = (CoreAppDatabase) $r32;
        PaymentMethodRepository $r6 = providesPaymentMethodRepository($r1, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41489remainder() {
        PaymentMethodRepository $r1 = remainder();
        return $r1;
    }
}
