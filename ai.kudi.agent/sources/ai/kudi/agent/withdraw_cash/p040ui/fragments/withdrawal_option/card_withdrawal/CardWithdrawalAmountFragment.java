package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.card_withdrawal;

import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewModel;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CardWithdrawalAmountFragment.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/card_withdrawal/CardWithdrawalAmountFragment;", "Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/card_withdrawal/CardWithdrawalAmountViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/card_withdrawal/CardWithdrawalAmountViewData;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "applyViewData", "", "viewData", "getMaximumAmount", "", "getMinimumAmount", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onNextBtnClick", TransactionField.AMOUNT, "openCardWithdrawalScreen", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.card_withdrawal.CardWithdrawalAmountFragment */
/* loaded from: classes.dex */
public final class CardWithdrawalAmountFragment extends BaseAmountInputFragment<CardWithdrawalAmountViewModel, CardWithdrawalAmountViewData> {
    public static final Companion Companion;
    private CashWithdrawalOptionActivity cashWithdrawalActivity;

    /* compiled from: CardWithdrawalAmountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/card_withdrawal/CardWithdrawalAmountFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/card_withdrawal/CardWithdrawalAmountFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.card_withdrawal.CardWithdrawalAmountFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CardWithdrawalAmountFragment newInstance() {
            CardWithdrawalAmountFragment $r1 = new CardWithdrawalAmountFragment();
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openCardWithdrawalScreen(WithdrawalRequest withdrawalRequest) {
        Context $r3 = requireContext();
        Intent $r1 = new Intent($r3, PerformPaymentActivity.class);
        $r1.putExtra(WithdrawalRequest.PARCEL_NAME, withdrawalRequest);
        FragmentActivity $r4 = requireActivity();
        $r4.finish();
        startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CardWithdrawalAmountViewData $r2 = (CardWithdrawalAmountViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewData r7) {
        /*
            r6 = this;
            java.lang.String r0 = "viewData"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            java.lang.String r1 = r7.getToastMsg()
            r2 = 0
            if (r1 == 0) goto L15
            int r3 = r1.length()
            if (r3 != 0) goto L13
            goto L15
        L13:
            r4 = 0
            goto L16
        L15:
            r4 = 1
        L16:
            if (r4 != 0) goto L1f
            java.lang.String r1 = r7.getToastMsg()
            r6.toast(r1)
        L1f:
            java.lang.String r1 = r7.getServiceFee()
            if (r1 == 0) goto L46
            java.lang.String r1 = r7.getServiceFee()
            int r3 = r1.length()
            if (r3 != 0) goto L30
            r2 = 1
        L30:
            if (r2 == 0) goto L35
            java.lang.String r1 = ""
            goto L43
        L35:
            java.lang.String r1 = r7.getServiceFee()
            java.lang.String r1 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount(r1)
            java.lang.String r0 = "Service Charge: "
            java.lang.String r1 = kotlin.p483e0.p485d.Log_OC.m10359a(r0, r1)
        L43:
            r6.setMessageText(r1)
        L46:
            ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest r5 = r7.getRequest()
            if (r5 == 0) goto L53
            ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest r5 = r7.getRequest()
            r6.openCardWithdrawalScreen(r5)
        L53:
            boolean r2 = r7.getShowLoader()
            r6.toggleLoader(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.card_withdrawal.CardWithdrawalAmountFragment.applyViewData(ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewData):void");
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMaximumAmount() {
        return 20000;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMinimumAmount() {
        return 500;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CardWithdrawalAmountViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof CashWithdrawalOptionActivity;
        if ($z0) {
            this.cashWithdrawalActivity = (CashWithdrawalOptionActivity) context;
        }
        CashWithdrawalOptionActivity $r3 = this.cashWithdrawalActivity;
        if ($r3 != null) {
            CashWithdrawalOptionComponent $r1 = $r3.getCashWithdrawalOptionComponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public void onNextBtnClick(int i) {
        BaseAmountInputViewModel $r1 = getScreenViewModel();
        CardWithdrawalAmountViewModel $r2 = (CardWithdrawalAmountViewModel) $r1;
        $r2.onNextButtonClicked(i);
    }
}
