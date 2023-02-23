package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.card_withdrawal;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.payments.domain.wiki.PaymentVendors;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewData;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: CardWithdrawalAmountViewModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/card_withdrawal/CardWithdrawalAmountViewModel;", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/card_withdrawal/CardWithdrawalAmountViewData;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "(Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;)V", TransactionField.AMOUNT, "", "getFeeLookup", "()Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "serviceFee", "", "fetchServiceFee", "", "initialData", "onNextButtonClicked", "performCardWithdrawal", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewModel */
/* loaded from: classes.dex */
public final class CardWithdrawalAmountViewModel extends BaseAmountInputViewModel<CardWithdrawalAmountViewData> {
    private int amount;
    private final PerformServiceFeeLookup feeLookup;
    private String serviceFee;

    public CardWithdrawalAmountViewModel(PerformServiceFeeLookup performServiceFeeLookup) {
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        this.feeLookup = performServiceFeeLookup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-0  reason: not valid java name */
    public static final void m41822fetchServiceFee$lambda0(CardWithdrawalAmountViewModel cardWithdrawalAmountViewModel, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(cardWithdrawalAmountViewModel, "this$0");
        String $r2 = feesLookupResponse.getServiceFee();
        cardWithdrawalAmountViewModel.serviceFee = $r2;
        ViewData $r3 = cardWithdrawalAmountViewModel.getState();
        CardWithdrawalAmountViewData $r4 = (CardWithdrawalAmountViewData) $r3;
        cardWithdrawalAmountViewModel.publish($r4.copy(false, null, $r2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-1  reason: not valid java name */
    public static final void m41823fetchServiceFee$lambda1(CardWithdrawalAmountViewModel cardWithdrawalAmountViewModel, Throwable th) {
        Log_OC.getArray(cardWithdrawalAmountViewModel, "this$0");
        cardWithdrawalAmountViewModel.serviceFee = null;
        ViewData $r2 = cardWithdrawalAmountViewModel.getState();
        CardWithdrawalAmountViewData $r3 = (CardWithdrawalAmountViewData) $r2;
        cardWithdrawalAmountViewModel.publish($r3.copy(false, "An error occurred while fetching fees. Try again", null, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchServiceFee(int i) {
        ViewData $r1 = getState();
        CardWithdrawalAmountViewData $r2 = (CardWithdrawalAmountViewData) $r1;
        publish(CardWithdrawalAmountViewData.copy$default($r2, true, null, "", null, 10, null));
        PerformServiceFeeLookup $r3 = this.feeLookup;
        String $r5 = String.valueOf(i);
        FeesLookupRequest $r4 = new FeesLookupRequest(TransactionBreakDownItemType.WITHDRAWAL, $r5, TransactionBreakDownItemType.WITHDRAWAL);
        AbstractC11688p $r6 = $r3.execute($r4);
        $r6.e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.card_withdrawal.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CardWithdrawalAmountViewModel $r12 = CardWithdrawalAmountViewModel.this;
                FeesLookupResponse $r32 = (FeesLookupResponse) obj;
                CardWithdrawalAmountViewModel.m41822fetchServiceFee$lambda0($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.card_withdrawal.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CardWithdrawalAmountViewModel $r12 = CardWithdrawalAmountViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CardWithdrawalAmountViewModel.m41823fetchServiceFee$lambda1($r12, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PerformServiceFeeLookup getFeeLookup() {
        PerformServiceFeeLookup r1 = this.feeLookup;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CardWithdrawalAmountViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CardWithdrawalAmountViewData initialData() {
        CardWithdrawalAmountViewData $r1 = new CardWithdrawalAmountViewData(false, null, null, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onNextButtonClicked(int i) {
        int $i1 = this.amount;
        if ($i1 == i) {
            String $r2 = this.serviceFee;
            if ($r2 != null) {
                MPOSPaymentMethod.Companion $r4 = MPOSPaymentMethod.Companion;
                MPOSPaymentMethod $r1 = $r4.success();
                WithdrawalRequest $r3 = new WithdrawalRequest("09037393891", i, PaymentVendors.DEBIT_CARD, false, $r1);
                performCardWithdrawal($r3);
                this.amount = i;
            }
        }
        fetchServiceFee(i);
        this.amount = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performCardWithdrawal(WithdrawalRequest withdrawalRequest) {
        Log_OC.getArray(withdrawalRequest, TransactionRequest.TYPE_REQUEST);
        ViewData $r2 = getState();
        CardWithdrawalAmountViewData $r3 = (CardWithdrawalAmountViewData) $r2;
        publish(CardWithdrawalAmountViewData.copy$default($r3, false, null, null, withdrawalRequest, 7, null));
    }
}
