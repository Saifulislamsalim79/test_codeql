package ai.kudi.agent.settings.insurance.domain;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DeactivateInsuranceUseCase_Factory implements InterfaceC9468d<DeactivateInsuranceUseCase> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public DeactivateInsuranceUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.rxSchedulersProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
        this.networkServiceProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DeactivateInsuranceUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        DeactivateInsuranceUseCase_Factory $r3 = new DeactivateInsuranceUseCase_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DeactivateInsuranceUseCase newInstance(RxSchedulers rxSchedulers, UserRepository userRepository, NetworkService networkService) {
        DeactivateInsuranceUseCase $r3 = new DeactivateInsuranceUseCase(rxSchedulers, userRepository, networkService);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DeactivateInsuranceUseCase multiply() {
        InterfaceC11700a $r1 = this.rxSchedulersProvider;
        Object $r2 = $r1.get();
        RxSchedulers $r3 = (RxSchedulers) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        InterfaceC11700a $r13 = this.networkServiceProvider;
        Object $r23 = $r13.get();
        NetworkService $r5 = (NetworkService) $r23;
        DeactivateInsuranceUseCase $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40772multiply() {
        DeactivateInsuranceUseCase $r1 = multiply();
        return $r1;
    }
}
