package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.api.SavingsApi;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ConfirmOtp_Factory implements InterfaceC9468d<ConfirmOtp> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<SavingsApi> savingsApiProvider;

    public ConfirmOtp_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
        this.savingsApiProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConfirmOtp_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ConfirmOtp_Factory $r3 = new ConfirmOtp_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConfirmOtp newInstance(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers, ai.kudi.agent.savings.data.worker.SavingsApi savingsApi) {
        ConfirmOtp $r3 = new ConfirmOtp(fetchCurrentUser, rxSchedulers, savingsApi);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConfirmOtp multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        InterfaceC11700a $r13 = this.savingsApiProvider;
        Object $r23 = $r13.get();
        ai.kudi.agent.savings.data.worker.SavingsApi $r5 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r23;
        ConfirmOtp $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40563multiply() {
        ConfirmOtp $r1 = multiply();
        return $r1;
    }
}
