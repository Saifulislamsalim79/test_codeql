package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PaybackLoan_Factory implements InterfaceC9468d<PaybackLoan> {
    private final InterfaceC11700a<KshockApi> kshockApiProvider;

    public PaybackLoan_Factory(InterfaceC11700a interfaceC11700a) {
        this.kshockApiProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PaybackLoan_Factory create(InterfaceC11700a interfaceC11700a) {
        PaybackLoan_Factory $r1 = new PaybackLoan_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PaybackLoan newInstance(ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi) {
        PaybackLoan $r1 = new PaybackLoan(kshockApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PaybackLoan multiply() {
        InterfaceC11700a $r1 = this.kshockApiProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r2;
        PaybackLoan $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39698multiply() {
        PaybackLoan $r1 = multiply();
        return $r1;
    }
}
