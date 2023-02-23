package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.api.SavingsApi;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class Withdraw_Factory implements InterfaceC9468d<Withdraw> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<SavingsApi> serviceProvider;

    public Withdraw_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.serviceProvider = interfaceC11700a2;
        this.rxSchedulersProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Withdraw_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        Withdraw_Factory $r3 = new Withdraw_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Withdraw newInstance(FetchCurrentUser fetchCurrentUser, ai.kudi.agent.savings.data.worker.SavingsApi savingsApi, RxSchedulers rxSchedulers) {
        Withdraw $r3 = new Withdraw(fetchCurrentUser, savingsApi, rxSchedulers);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Withdraw multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.serviceProvider;
        Object $r22 = $r12.get();
        ai.kudi.agent.savings.data.worker.SavingsApi $r4 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r22;
        InterfaceC11700a $r13 = this.rxSchedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        Withdraw $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40588multiply() {
        Withdraw $r1 = multiply();
        return $r1;
    }
}
