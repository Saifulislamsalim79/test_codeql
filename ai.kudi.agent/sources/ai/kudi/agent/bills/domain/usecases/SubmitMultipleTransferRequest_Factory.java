package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitMultipleTransferRequest_Factory implements InterfaceC9468d<SubmitMultipleTransferRequest> {
    private final InterfaceC11700a<DeviceInformation> deviceInformationProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public SubmitMultipleTransferRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.networkServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
        this.rxSchedulersProvider = interfaceC11700a3;
        this.deviceInformationProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitMultipleTransferRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        SubmitMultipleTransferRequest_Factory $r4 = new SubmitMultipleTransferRequest_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitMultipleTransferRequest newInstance(NetworkService networkService, UserRepository userRepository, RxSchedulers rxSchedulers, DeviceInformation deviceInformation) {
        SubmitMultipleTransferRequest $r4 = new SubmitMultipleTransferRequest(networkService, userRepository, rxSchedulers, deviceInformation);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitMultipleTransferRequest multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        InterfaceC11700a $r13 = this.rxSchedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        InterfaceC11700a $r14 = this.deviceInformationProvider;
        Object $r24 = $r14.get();
        DeviceInformation $r6 = (DeviceInformation) $r24;
        SubmitMultipleTransferRequest $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39037multiply() {
        SubmitMultipleTransferRequest $r1 = multiply();
        return $r1;
    }
}
