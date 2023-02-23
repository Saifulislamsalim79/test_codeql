package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class GetPosDiscount_Factory implements InterfaceC9468d<GetPosDiscount> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public GetPosDiscount_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetPosDiscount_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        GetPosDiscount_Factory $r2 = new GetPosDiscount_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetPosDiscount newInstance(NetworkService networkService, RxSchedulers rxSchedulers) {
        GetPosDiscount $r2 = new GetPosDiscount(networkService, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GetPosDiscount multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        GetPosDiscount $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40118multiply() {
        GetPosDiscount $r1 = multiply();
        return $r1;
    }
}
