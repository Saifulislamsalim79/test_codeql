package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.wallettopup.viewmodels.CardPaymentViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardPaymentFragment_MembersInjector implements InterfaceC9463a<CardPaymentFragment> {
    private final InterfaceC11700a<CardPaymentViewModel> viewModelProvider;

    public CardPaymentFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CardPaymentFragment_MembersInjector $r1 = new CardPaymentFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(CardPaymentFragment cardPaymentFragment, CardPaymentViewModel cardPaymentViewModel) {
        cardPaymentFragment.viewModel = cardPaymentViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CardPaymentFragment cardPaymentFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        CardPaymentViewModel $r4 = (CardPaymentViewModel) $r2;
        injectViewModel(cardPaymentFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CardPaymentFragment $r2 = (CardPaymentFragment) obj;
        injectMembers($r2);
    }
}
