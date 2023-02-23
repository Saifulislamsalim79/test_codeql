package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.card_withdrawal;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewModel_Factory */
/* loaded from: classes.dex */
public final class CardWithdrawalAmountViewModel_Factory implements InterfaceC9468d<CardWithdrawalAmountViewModel> {
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;

    public CardWithdrawalAmountViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.feeLookupProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardWithdrawalAmountViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        CardWithdrawalAmountViewModel_Factory $r1 = new CardWithdrawalAmountViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardWithdrawalAmountViewModel newInstance(PerformServiceFeeLookup performServiceFeeLookup) {
        CardWithdrawalAmountViewModel $r1 = new CardWithdrawalAmountViewModel(performServiceFeeLookup);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CardWithdrawalAmountViewModel multiply() {
        InterfaceC11700a $r1 = this.feeLookupProvider;
        Object $r2 = $r1.get();
        PerformServiceFeeLookup $r3 = (PerformServiceFeeLookup) $r2;
        CardWithdrawalAmountViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41824multiply() {
        CardWithdrawalAmountViewModel $r1 = multiply();
        return $r1;
    }
}
