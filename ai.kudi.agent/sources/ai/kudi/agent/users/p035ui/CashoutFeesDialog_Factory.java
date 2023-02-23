package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.users.ui.CashoutFeesDialog_Factory */
/* loaded from: classes.dex */
public final class CashoutFeesDialog_Factory implements InterfaceC9468d<CashoutFeesDialog> {
    private final InterfaceC11700a<PerformServiceFeeLookup> feesLookupProvider;

    public CashoutFeesDialog_Factory(InterfaceC11700a interfaceC11700a) {
        this.feesLookupProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashoutFeesDialog_Factory create(InterfaceC11700a interfaceC11700a) {
        CashoutFeesDialog_Factory $r1 = new CashoutFeesDialog_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashoutFeesDialog newInstance(PerformServiceFeeLookup performServiceFeeLookup) {
        CashoutFeesDialog $r1 = new CashoutFeesDialog(performServiceFeeLookup);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashoutFeesDialog multiply() {
        InterfaceC11700a $r1 = this.feesLookupProvider;
        Object $r2 = $r1.get();
        PerformServiceFeeLookup $r3 = (PerformServiceFeeLookup) $r2;
        CashoutFeesDialog $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41478multiply() {
        CashoutFeesDialog $r1 = multiply();
        return $r1;
    }
}
