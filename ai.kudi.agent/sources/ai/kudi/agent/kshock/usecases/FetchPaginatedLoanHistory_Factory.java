package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchPaginatedLoanHistory_Factory implements InterfaceC9468d<FetchPaginatedLoanHistory> {
    private final InterfaceC11700a<KshockApi> kshockApiProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public FetchPaginatedLoanHistory_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.rxSchedulersProvider = interfaceC11700a;
        this.kshockApiProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchPaginatedLoanHistory_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        FetchPaginatedLoanHistory_Factory $r2 = new FetchPaginatedLoanHistory_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchPaginatedLoanHistory newInstance(RxSchedulers rxSchedulers, ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi) {
        FetchPaginatedLoanHistory $r2 = new FetchPaginatedLoanHistory(rxSchedulers, kshockApi);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchPaginatedLoanHistory multiply() {
        InterfaceC11700a $r1 = this.rxSchedulersProvider;
        Object $r2 = $r1.get();
        RxSchedulers $r3 = (RxSchedulers) $r2;
        InterfaceC11700a $r12 = this.kshockApiProvider;
        Object $r22 = $r12.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r22;
        FetchPaginatedLoanHistory $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39689multiply() {
        FetchPaginatedLoanHistory $r1 = multiply();
        return $r1;
    }
}
