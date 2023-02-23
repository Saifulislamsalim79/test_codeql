package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitTransactionRequest_Factory implements InterfaceC9468d<SubmitTransactionRequest> {
    private final InterfaceC11700a<KshockApi> kshockApiProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public SubmitTransactionRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.kshockApiProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitTransactionRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SubmitTransactionRequest_Factory $r2 = new SubmitTransactionRequest_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitTransactionRequest newInstance(ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi, UserRepository userRepository) {
        SubmitTransactionRequest $r2 = new SubmitTransactionRequest(kshockApi, userRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitTransactionRequest multiply() {
        InterfaceC11700a $r1 = this.kshockApiProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        SubmitTransactionRequest $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39704multiply() {
        SubmitTransactionRequest $r1 = multiply();
        return $r1;
    }
}
