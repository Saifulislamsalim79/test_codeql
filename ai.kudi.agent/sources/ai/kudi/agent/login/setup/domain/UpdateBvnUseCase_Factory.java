package ai.kudi.agent.login.setup.domain;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UpdateBvnUseCase_Factory implements InterfaceC9468d<UpdateBvnUseCase> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public UpdateBvnUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateBvnUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UpdateBvnUseCase_Factory $r2 = new UpdateBvnUseCase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateBvnUseCase newInstance(NetworkService networkService, RxSchedulers rxSchedulers) {
        UpdateBvnUseCase $r2 = new UpdateBvnUseCase(networkService, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpdateBvnUseCase multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        UpdateBvnUseCase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39740multiply() {
        UpdateBvnUseCase $r1 = multiply();
        return $r1;
    }
}
