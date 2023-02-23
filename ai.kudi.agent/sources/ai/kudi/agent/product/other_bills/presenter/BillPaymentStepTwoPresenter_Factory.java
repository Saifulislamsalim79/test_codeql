package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BillPaymentStepTwoPresenter_Factory implements InterfaceC9468d<BillPaymentStepTwoPresenter> {
    private final InterfaceC11700a<PerformServiceFeeLookup> feesLookupProvider;
    private final InterfaceC11700a<BillPaymentNavigator> navigatorProvider;

    public BillPaymentStepTwoPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.feesLookupProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillPaymentStepTwoPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BillPaymentStepTwoPresenter_Factory $r2 = new BillPaymentStepTwoPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillPaymentStepTwoPresenter newInstance(PerformServiceFeeLookup performServiceFeeLookup, BillPaymentNavigator billPaymentNavigator) {
        BillPaymentStepTwoPresenter $r2 = new BillPaymentStepTwoPresenter(performServiceFeeLookup, billPaymentNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillPaymentStepTwoPresenter multiply() {
        InterfaceC11700a $r1 = this.feesLookupProvider;
        Object $r2 = $r1.get();
        PerformServiceFeeLookup $r3 = (PerformServiceFeeLookup) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        BillPaymentNavigator $r4 = (BillPaymentNavigator) $r22;
        BillPaymentStepTwoPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40195multiply() {
        BillPaymentStepTwoPresenter $r1 = multiply();
        return $r1;
    }
}
