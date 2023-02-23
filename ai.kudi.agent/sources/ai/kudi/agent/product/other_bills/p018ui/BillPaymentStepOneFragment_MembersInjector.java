package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.product.other_bills.presenter.BillPaymentStepOnePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BillPaymentStepOneFragment_MembersInjector implements InterfaceC9463a<BillPaymentStepOneFragment> {
    private final InterfaceC11700a<BillPaymentStepOnePresenter> thisPresenterProvider;

    public BillPaymentStepOneFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BillPaymentStepOneFragment_MembersInjector $r1 = new BillPaymentStepOneFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(BillPaymentStepOneFragment billPaymentStepOneFragment, BillPaymentStepOnePresenter billPaymentStepOnePresenter) {
        billPaymentStepOneFragment.thisPresenter = billPaymentStepOnePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BillPaymentStepOneFragment billPaymentStepOneFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        BillPaymentStepOnePresenter $r4 = (BillPaymentStepOnePresenter) $r2;
        injectThisPresenter(billPaymentStepOneFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BillPaymentStepOneFragment $r2 = (BillPaymentStepOneFragment) obj;
        injectMembers($r2);
    }
}
