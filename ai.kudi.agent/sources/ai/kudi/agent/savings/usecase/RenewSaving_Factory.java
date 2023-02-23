package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.api.SavingsApi;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RenewSaving_Factory implements InterfaceC9468d<RenewSaving> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<SavingsApi> serviceProvider;

    public RenewSaving_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.serviceProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.rxSchedulersProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RenewSaving_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        RenewSaving_Factory $r3 = new RenewSaving_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RenewSaving newInstance(ai.kudi.agent.savings.data.worker.SavingsApi savingsApi, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        RenewSaving $r3 = new RenewSaving(savingsApi, fetchCurrentUser, rxSchedulers);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RenewSaving multiply() {
        InterfaceC11700a $r1 = this.serviceProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.savings.data.worker.SavingsApi $r3 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.rxSchedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        RenewSaving $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40578multiply() {
        RenewSaving $r1 = multiply();
        return $r1;
    }
}
