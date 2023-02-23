package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.wallettopup.viewmodels.PaymentMethodViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CashDepositFragment_MembersInjector implements InterfaceC9463a<CashDepositFragment> {
    private final InterfaceC11700a<PaymentMethodViewModel> viewModelProvider;

    public CashDepositFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CashDepositFragment_MembersInjector $r1 = new CashDepositFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(CashDepositFragment cashDepositFragment, PaymentMethodViewModel paymentMethodViewModel) {
        cashDepositFragment.viewModel = paymentMethodViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CashDepositFragment cashDepositFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        PaymentMethodViewModel $r4 = (PaymentMethodViewModel) $r2;
        injectViewModel(cashDepositFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CashDepositFragment $r2 = (CashDepositFragment) obj;
        injectMembers($r2);
    }
}
