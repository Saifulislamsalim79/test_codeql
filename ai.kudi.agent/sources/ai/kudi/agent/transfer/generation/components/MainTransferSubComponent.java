package ai.kudi.agent.transfer.generation.components;

import ai.kudi.agent.p2p.fragments.P2pEnterAmtFragment;
import ai.kudi.agent.p2p.fragments.P2pNameAndPhoneNoFragment;
import ai.kudi.agent.p2p.fragments.P2pSummaryFragment;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankCustomersFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment;
import ai.kudi.agent.transfer.p034ui.TransferToMultipleBankFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherAmountInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherRecipientInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherSenderInfoFragment;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.Metadata;
/* compiled from: MainTransferSubComponent.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0010H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/transfer/di/components/MainTransferSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/p2p/fragments/P2pEnterAmtFragment;", "Lai/kudi/agent/p2p/fragments/P2pNameAndPhoneNoFragment;", "Lai/kudi/agent/p2p/fragments/P2pSummaryFragment;", "Lai/kudi/agent/transactionstatus/summary/ui/TransferSummaryFragment;", "activity", "Lai/kudi/agent/transfer/ui/TransferActivity;", "Lai/kudi/agent/transfer/ui/TransferToBankAmountFragment;", "Lai/kudi/agent/transfer/ui/TransferToBankCustomersFragment;", "Lai/kudi/agent/transfer/ui/TransferToBankFragment;", "Lai/kudi/agent/transfer/ui/TransferToMultipleBankFragment;", "Lai/kudi/agent/voucher/cashin/ui/CreateVoucherAmountInfoFragment;", "Lai/kudi/agent/voucher/cashin/ui/CreateVoucherRecipientInfoFragment;", "Lai/kudi/agent/voucher/cashin/ui/CreateVoucherSenderInfoFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface MainTransferSubComponent {

    /* compiled from: MainTransferSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transfer/di/components/MainTransferSubComponent$Factory;", "", "create", "Lai/kudi/agent/transfer/di/components/MainTransferSubComponent;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        MainTransferSubComponent create(MainTransferView mainTransferView);
    }

    void inject(P2pEnterAmtFragment p2pEnterAmtFragment);

    void inject(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment);

    void inject(P2pSummaryFragment p2pSummaryFragment);

    void inject(TransferSummaryFragment transferSummaryFragment);

    void inject(TransferActivity transferActivity);

    void inject(TransferToBankAmountFragment transferToBankAmountFragment);

    void inject(TransferToBankCustomersFragment transferToBankCustomersFragment);

    void inject(TransferToBankFragment transferToBankFragment);

    void inject(TransferToMultipleBankFragment transferToMultipleBankFragment);

    void inject(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment);

    void inject(CreateVoucherRecipientInfoFragment createVoucherRecipientInfoFragment);

    void inject(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment);
}
