package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.bills.domain.usecases.PerformBillerLookup;
import ai.kudi.agent.product.repository.BillerRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BillPaymentStepOnePresenter_Factory implements InterfaceC9468d<BillPaymentStepOnePresenter> {
    private final InterfaceC11700a<PerformBillerLookup> billerLookupProvider;
    private final InterfaceC11700a<BillerRepository> billerRepositoryProvider;

    public BillPaymentStepOnePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.billerLookupProvider = interfaceC11700a;
        this.billerRepositoryProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillPaymentStepOnePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BillPaymentStepOnePresenter_Factory $r2 = new BillPaymentStepOnePresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillPaymentStepOnePresenter newInstance(PerformBillerLookup performBillerLookup, BillerRepository billerRepository) {
        BillPaymentStepOnePresenter $r2 = new BillPaymentStepOnePresenter(performBillerLookup, billerRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillPaymentStepOnePresenter multiply() {
        InterfaceC11700a $r1 = this.billerLookupProvider;
        Object $r2 = $r1.get();
        PerformBillerLookup $r3 = (PerformBillerLookup) $r2;
        InterfaceC11700a $r12 = this.billerRepositoryProvider;
        Object $r22 = $r12.get();
        BillerRepository $r4 = (BillerRepository) $r22;
        BillPaymentStepOnePresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40187multiply() {
        BillPaymentStepOnePresenter $r1 = multiply();
        return $r1;
    }
}
