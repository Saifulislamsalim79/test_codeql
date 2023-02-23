package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.product.other_bills.presenter.BillPaymentStepTwoPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentCustomerDetailsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BillPaymentCustomerDetailsFragment_MembersInjector implements InterfaceC9463a<BillPaymentCustomerDetailsFragment> {
    private final InterfaceC11700a<BillPaymentStepTwoPresenter> stepTwoPresenterProvider;

    public BillPaymentCustomerDetailsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.stepTwoPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BillPaymentCustomerDetailsFragment_MembersInjector $r1 = new BillPaymentCustomerDetailsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectStepTwoPresenter(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment, BillPaymentStepTwoPresenter billPaymentStepTwoPresenter) {
        billPaymentCustomerDetailsFragment.stepTwoPresenter = billPaymentStepTwoPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment) {
        InterfaceC11700a $r3 = this.stepTwoPresenterProvider;
        Object $r2 = $r3.get();
        BillPaymentStepTwoPresenter $r4 = (BillPaymentStepTwoPresenter) $r2;
        injectStepTwoPresenter(billPaymentCustomerDetailsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BillPaymentCustomerDetailsFragment $r2 = (BillPaymentCustomerDetailsFragment) obj;
        injectMembers($r2);
    }
}
