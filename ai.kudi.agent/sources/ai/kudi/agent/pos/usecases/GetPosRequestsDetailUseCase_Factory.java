package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class GetPosRequestsDetailUseCase_Factory implements InterfaceC9468d<GetPosRequestsDetailUseCase> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> schedulersProvider;

    public GetPosRequestsDetailUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.networkServiceProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.schedulersProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetPosRequestsDetailUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        GetPosRequestsDetailUseCase_Factory $r3 = new GetPosRequestsDetailUseCase_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetPosRequestsDetailUseCase newInstance(NetworkService networkService, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        GetPosRequestsDetailUseCase $r3 = new GetPosRequestsDetailUseCase(networkService, fetchCurrentUser, rxSchedulers);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GetPosRequestsDetailUseCase multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.schedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        GetPosRequestsDetailUseCase $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40121multiply() {
        GetPosRequestsDetailUseCase $r1 = multiply();
        return $r1;
    }
}
