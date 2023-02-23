package ai.kudi.agent.transactioncommissions.domain;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RequestCommissionsCashoutUseCase_Factory implements InterfaceC9468d<RequestCommissionsCashoutUseCase> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public RequestCommissionsCashoutUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.rxSchedulersProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
        this.networkServiceProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestCommissionsCashoutUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        RequestCommissionsCashoutUseCase_Factory $r3 = new RequestCommissionsCashoutUseCase_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestCommissionsCashoutUseCase newInstance(RxSchedulers rxSchedulers, UserRepository userRepository, NetworkService networkService) {
        RequestCommissionsCashoutUseCase $r3 = new RequestCommissionsCashoutUseCase(rxSchedulers, userRepository, networkService);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestCommissionsCashoutUseCase multiply() {
        InterfaceC11700a $r1 = this.rxSchedulersProvider;
        Object $r2 = $r1.get();
        RxSchedulers $r3 = (RxSchedulers) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        InterfaceC11700a $r13 = this.networkServiceProvider;
        Object $r23 = $r13.get();
        NetworkService $r5 = (NetworkService) $r23;
        RequestCommissionsCashoutUseCase $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40953multiply() {
        RequestCommissionsCashoutUseCase $r1 = multiply();
        return $r1;
    }
}
