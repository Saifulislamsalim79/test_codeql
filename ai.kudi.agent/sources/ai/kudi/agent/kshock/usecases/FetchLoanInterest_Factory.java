package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchLoanInterest_Factory implements InterfaceC9468d<FetchLoanInterest> {
    private final InterfaceC11700a<KshockApi> kshockApiProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public FetchLoanInterest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.kshockApiProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchLoanInterest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        FetchLoanInterest_Factory $r2 = new FetchLoanInterest_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchLoanInterest newInstance(ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi, RxSchedulers rxSchedulers) {
        FetchLoanInterest $r2 = new FetchLoanInterest(kshockApi, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchLoanInterest multiply() {
        InterfaceC11700a $r1 = this.kshockApiProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        FetchLoanInterest $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39684multiply() {
        FetchLoanInterest $r1 = multiply();
        return $r1;
    }
}
