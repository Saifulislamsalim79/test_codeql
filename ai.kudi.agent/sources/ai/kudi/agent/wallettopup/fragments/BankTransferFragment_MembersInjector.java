package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.wallettopup.viewmodels.PaymentMethodViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BankTransferFragment_MembersInjector implements InterfaceC9463a<BankTransferFragment> {
    private final InterfaceC11700a<PaymentMethodViewModel> viewModelProvider;

    public BankTransferFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BankTransferFragment_MembersInjector $r1 = new BankTransferFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(BankTransferFragment bankTransferFragment, PaymentMethodViewModel paymentMethodViewModel) {
        bankTransferFragment.viewModel = paymentMethodViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BankTransferFragment bankTransferFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        PaymentMethodViewModel $r4 = (PaymentMethodViewModel) $r2;
        injectViewModel(bankTransferFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BankTransferFragment $r2 = (BankTransferFragment) obj;
        injectMembers($r2);
    }
}
