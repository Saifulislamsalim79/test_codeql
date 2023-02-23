package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitWithdrawalRequest_Factory implements InterfaceC9468d<SubmitWithdrawalRequest> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public SubmitWithdrawalRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitWithdrawalRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SubmitWithdrawalRequest_Factory $r2 = new SubmitWithdrawalRequest_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitWithdrawalRequest newInstance(NetworkService networkService, UserRepository userRepository) {
        SubmitWithdrawalRequest $r2 = new SubmitWithdrawalRequest(networkService, userRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitWithdrawalRequest multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        SubmitWithdrawalRequest $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39041multiply() {
        SubmitWithdrawalRequest $r1 = multiply();
        return $r1;
    }
}
