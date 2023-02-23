package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.api.SavingsApi;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavingsPlan_Factory implements InterfaceC9468d<SavingsPlan> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<SavingsApi> savingsServiceProvider;

    public SavingsPlan_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.savingsServiceProvider = interfaceC11700a2;
        this.rxSchedulersProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsPlan_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SavingsPlan_Factory $r3 = new SavingsPlan_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsPlan newInstance(FetchCurrentUser fetchCurrentUser, ai.kudi.agent.savings.data.worker.SavingsApi savingsApi, RxSchedulers rxSchedulers) {
        SavingsPlan $r3 = new SavingsPlan(fetchCurrentUser, savingsApi, rxSchedulers);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingsPlan multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.savingsServiceProvider;
        Object $r22 = $r12.get();
        ai.kudi.agent.savings.data.worker.SavingsApi $r4 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r22;
        InterfaceC11700a $r13 = this.rxSchedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        SavingsPlan $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40585multiply() {
        SavingsPlan $r1 = multiply();
        return $r1;
    }
}
