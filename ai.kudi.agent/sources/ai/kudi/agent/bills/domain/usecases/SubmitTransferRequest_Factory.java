package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitTransferRequest_Factory implements InterfaceC9468d<SubmitTransferRequest> {
    private final InterfaceC11700a<DeviceInformation> deviceInformationProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public SubmitTransferRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.networkServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
        this.deviceInformationProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitTransferRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SubmitTransferRequest_Factory $r3 = new SubmitTransferRequest_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitTransferRequest newInstance(NetworkService networkService, UserRepository userRepository, DeviceInformation deviceInformation) {
        SubmitTransferRequest $r3 = new SubmitTransferRequest(networkService, userRepository, deviceInformation);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitTransferRequest multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        InterfaceC11700a $r13 = this.deviceInformationProvider;
        Object $r23 = $r13.get();
        DeviceInformation $r5 = (DeviceInformation) $r23;
        SubmitTransferRequest $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39039multiply() {
        SubmitTransferRequest $r1 = multiply();
        return $r1;
    }
}
