package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.product.other_bills.presenter.BillsListPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.other_bills.ui.PayBillsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PayBillsFragment_MembersInjector implements InterfaceC9463a<PayBillsFragment> {
    private final InterfaceC11700a<BillsListPresenter> thisPresenterProvider;

    public PayBillsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PayBillsFragment_MembersInjector $r1 = new PayBillsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(PayBillsFragment payBillsFragment, BillsListPresenter billsListPresenter) {
        payBillsFragment.thisPresenter = billsListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PayBillsFragment payBillsFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        BillsListPresenter $r4 = (BillsListPresenter) $r2;
        injectThisPresenter(payBillsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PayBillsFragment $r2 = (PayBillsFragment) obj;
        injectMembers($r2);
    }
}
