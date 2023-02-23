package ai.kudi.agent.wallettopup.labs;

import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.fragments.BankTransferFragment;
import ai.kudi.agent.wallettopup.fragments.CardPaymentFragment;
import ai.kudi.agent.wallettopup.fragments.CardTopUpAmountFragment;
import ai.kudi.agent.wallettopup.fragments.CashDepositFragment;
import ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment;
import ai.kudi.agent.wallettopup.navigators.WalletTopupNavigator;
import kotlin.Metadata;
/* compiled from: WalletTopupSubcomponent.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent;", "", "inject", "", "activity", "Lai/kudi/agent/wallettopup/WalletTopUpActivity;", "fragment", "Lai/kudi/agent/wallettopup/fragments/BankTransferFragment;", "Lai/kudi/agent/wallettopup/fragments/CardPaymentFragment;", "cardTopAmtFragment", "Lai/kudi/agent/wallettopup/fragments/CardTopUpAmountFragment;", "cashDepositFragment", "Lai/kudi/agent/wallettopup/fragments/CashDepositFragment;", "ussdTopUpBottomSheetFragment", "Lai/kudi/agent/wallettopup/fragments/UssdTopUpBottomSheetFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface WalletTopupSubcomponent {

    /* compiled from: WalletTopupSubcomponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent$Factory;", "", "create", "Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent;", "walletTopupNavigator", "Lai/kudi/agent/wallettopup/navigators/WalletTopupNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        WalletTopupSubcomponent create(WalletTopupNavigator walletTopupNavigator);
    }

    void inject(WalletTopUpActivity walletTopUpActivity);

    void inject(BankTransferFragment bankTransferFragment);

    void inject(CardPaymentFragment cardPaymentFragment);

    void inject(CardTopUpAmountFragment cardTopUpAmountFragment);

    void inject(CashDepositFragment cashDepositFragment);

    void inject(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment);
}
