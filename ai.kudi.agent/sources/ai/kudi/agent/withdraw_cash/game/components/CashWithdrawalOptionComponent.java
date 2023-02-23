package ai.kudi.agent.withdraw_cash.game.components;

import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.card_withdrawal.CardWithdrawalAmountFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos.MPosActivationFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment;
import ai.kudi.agent.withdrawal.p041ui.OthersWithdrawalFragment;
import kotlin.Metadata;
/* compiled from: CashWithdrawalOptionComponent.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0012H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent;", "", "inject", "", "cashWithdrawalOptionActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "cardWithdrawalAmountFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/card_withdrawal/CardWithdrawalAmountFragment;", "mPosActivationFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosActivationFragment;", "mPosAmountInputFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosAmountInputFragment;", "ussdWithdrawalAmountInputFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputFragment;", "ussdWithdrawalCodeReferenceFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceFragment;", "ussdWithdrawalVoucherInputFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputFragment;", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryFragment;", "othersWithdrawalFragment", "Lai/kudi/agent/withdrawal/ui/OthersWithdrawalFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CashWithdrawalOptionComponent {

    /* compiled from: CashWithdrawalOptionComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent$Factory;", "", "create", "Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        CashWithdrawalOptionComponent create();
    }

    void inject(CashWithdrawalOptionActivity cashWithdrawalOptionActivity);

    void inject(CardWithdrawalAmountFragment cardWithdrawalAmountFragment);

    void inject(MPosActivationFragment mPosActivationFragment);

    void inject(MPosAmountInputFragment mPosAmountInputFragment);

    void inject(UssdWithdrawalAmountInputFragment ussdWithdrawalAmountInputFragment);

    void inject(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment);

    void inject(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment);

    void inject(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment);

    void inject(OthersWithdrawalFragment othersWithdrawalFragment);
}
