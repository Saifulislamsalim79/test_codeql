package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class InitializeTerminalRequest_Factory implements InterfaceC9468d<InitializeTerminalRequest> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public InitializeTerminalRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InitializeTerminalRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        InitializeTerminalRequest_Factory $r2 = new InitializeTerminalRequest_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InitializeTerminalRequest newInstance(NetworkService networkService, RxSchedulers rxSchedulers) {
        InitializeTerminalRequest $r2 = new InitializeTerminalRequest(networkService, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InitializeTerminalRequest multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        InitializeTerminalRequest $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41113multiply() {
        InitializeTerminalRequest $r1 = multiply();
        return $r1;
    }
}
