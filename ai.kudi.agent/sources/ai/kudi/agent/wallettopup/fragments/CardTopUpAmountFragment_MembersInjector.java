package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment_MembersInjector;
import ai.kudi.agent.wallettopup.viewmodels.CardTopUpAmtViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardTopUpAmountFragment_MembersInjector implements InterfaceC9463a<CardTopUpAmountFragment> {
    private final InterfaceC11700a<CardTopUpAmtViewModel> cardTopUpAmtViewModelProvider;
    private final InterfaceC11700a<CardTopUpAmtViewModel> screenViewModelProvider;

    public CardTopUpAmountFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.screenViewModelProvider = interfaceC11700a;
        this.cardTopUpAmtViewModelProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CardTopUpAmountFragment_MembersInjector $r2 = new CardTopUpAmountFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectCardTopUpAmtViewModel(CardTopUpAmountFragment cardTopUpAmountFragment, CardTopUpAmtViewModel cardTopUpAmtViewModel) {
        cardTopUpAmountFragment.cardTopUpAmtViewModel = cardTopUpAmtViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CardTopUpAmountFragment cardTopUpAmountFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        CardTopUpAmtViewModel $r4 = (CardTopUpAmtViewModel) $r3;
        BaseAmountInputFragment_MembersInjector.injectScreenViewModel(cardTopUpAmountFragment, $r4);
        InterfaceC11700a $r22 = this.cardTopUpAmtViewModelProvider;
        Object $r32 = $r22.get();
        CardTopUpAmtViewModel $r42 = (CardTopUpAmtViewModel) $r32;
        injectCardTopUpAmtViewModel(cardTopUpAmountFragment, $r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CardTopUpAmountFragment $r2 = (CardTopUpAmountFragment) obj;
        injectMembers($r2);
    }
}
