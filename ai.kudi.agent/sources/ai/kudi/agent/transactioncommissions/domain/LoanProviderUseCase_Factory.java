package ai.kudi.agent.transactioncommissions.domain;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LoanProviderUseCase_Factory implements InterfaceC9468d<LoanProviderUseCase> {
    private final InterfaceC11700a<KshockApi> kshockApiProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public LoanProviderUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.rxSchedulersProvider = interfaceC11700a;
        this.kshockApiProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoanProviderUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        LoanProviderUseCase_Factory $r2 = new LoanProviderUseCase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoanProviderUseCase newInstance(RxSchedulers rxSchedulers, ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi) {
        LoanProviderUseCase $r2 = new LoanProviderUseCase(rxSchedulers, kshockApi);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoanProviderUseCase multiply() {
        InterfaceC11700a $r1 = this.rxSchedulersProvider;
        Object $r2 = $r1.get();
        RxSchedulers $r3 = (RxSchedulers) $r2;
        InterfaceC11700a $r12 = this.kshockApiProvider;
        Object $r22 = $r12.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r22;
        LoanProviderUseCase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40950multiply() {
        LoanProviderUseCase $r1 = multiply();
        return $r1;
    }
}
