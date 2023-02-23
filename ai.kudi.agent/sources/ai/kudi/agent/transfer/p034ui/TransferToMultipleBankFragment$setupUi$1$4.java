package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.databinding.FragmentTransferToMultipleBankBinding;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.widget.TextView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransferToMultipleBankFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "pos", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment$setupUi$1$4 */
/* loaded from: classes.dex */
public final class TransferToMultipleBankFragment$setupUi$1$4 extends AbstractC11802m implements InterfaceC11771p<TransferToBankPayload, Integer, C13666w> {
    final /* synthetic */ FragmentTransferToMultipleBankBinding $this_apply;
    final /* synthetic */ TransferToMultipleBankFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToMultipleBankFragment$setupUi$1$4(TransferToMultipleBankFragment transferToMultipleBankFragment, FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding) {
        super(2);
        this.this$0 = transferToMultipleBankFragment;
        this.$this_apply = fragmentTransferToMultipleBankBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(TransferToBankPayload transferToBankPayload, Integer num) {
        TransferToBankPayload $r3 = transferToBankPayload;
        Integer $r4 = num;
        int $i0 = $r4.intValue();
        invoke($r3, $i0);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(TransferToBankPayload transferToBankPayload, int i) {
        Log_OC.getArray(transferToBankPayload, "payload");
        TransferToMultipleBankFragment $r2 = this.this$0;
        TransferToMultipleViewModel $r3 = $r2.getViewModel();
        $r3.editIndex(i);
        TransferToMultipleBankFragment $r22 = this.this$0;
        Bank.BanksList $r4 = new Bank.BanksList();
        List $r5 = $r4.getListOfBanks();
        Bank.BanksList $r42 = new Bank.BanksList();
        String $r6 = transferToBankPayload.getBankCode();
        int $i0 = $r42.locateBank($r6);
        Object $r7 = $r5.get($i0);
        $r22.selectedBank = (Bank) $r7;
        FragmentTransferToMultipleBankBinding $r9 = this.$this_apply;
        TextView $r10 = $r9.accountNameField;
        String $r62 = transferToBankPayload.getAccountName();
        $r10.setText($r62);
        FragmentTransferToMultipleBankBinding $r92 = this.$this_apply;
        TextView $r102 = $r92.accountNameField;
        String $r63 = transferToBankPayload.getAccountNumber();
        $r102.setText($r63);
        FragmentTransferToMultipleBankBinding $r93 = this.$this_apply;
        KudiNairaInputField $r11 = $r93.amountEditText;
        Integer $r12 = transferToBankPayload.getAmount();
        String $r64 = String.valueOf($r12);
        $r11.setText($r64);
        FragmentTransferToMultipleBankBinding $r94 = this.$this_apply;
        KudiInputField $r13 = $r94.bankField;
        TransferToMultipleBankFragment $r23 = this.this$0;
        Bank $r8 = $r23.selectedBank;
        String $r65 = $r8 == null ? null : $r8.getName();
        $r13.setText($r65);
        FragmentTransferToMultipleBankBinding $r95 = this.$this_apply;
        KudiInputField $r132 = $r95.transferReasonEditText;
        String $r66 = transferToBankPayload.getReason();
        $r132.setText($r66);
    }
}
