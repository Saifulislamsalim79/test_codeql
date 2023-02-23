package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.databinding.FragmentTransferToMultipleBankBinding;
import ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransferToMultipleBankFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/core/domain/room_entities/Bank;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment$showBankOptions$1$1 */
/* loaded from: classes.dex */
public final class TransferToMultipleBankFragment$showBankOptions$1$1 extends AbstractC11802m implements InterfaceC11767l<Bank, C13666w> {
    final /* synthetic */ BanksFragment $bankFragment;
    final /* synthetic */ FragmentTransferToMultipleBankBinding $this_apply;
    final /* synthetic */ TransferToMultipleBankFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToMultipleBankFragment$showBankOptions$1$1(BanksFragment banksFragment, TransferToMultipleBankFragment transferToMultipleBankFragment, FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding) {
        super(1);
        this.$bankFragment = banksFragment;
        this.this$0 = transferToMultipleBankFragment;
        this.$this_apply = fragmentTransferToMultipleBankBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Bank bank) {
        Bank $r2 = bank;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bank bank) {
        Log_OC.getArray(bank, "it");
        BanksFragment $r2 = this.$bankFragment;
        $r2.dismiss();
        TransferToMultipleBankFragment $r3 = this.this$0;
        $r3.selectedBank = bank;
        FragmentTransferToMultipleBankBinding $r4 = this.$this_apply;
        KudiInputField $r5 = $r4.bankField;
        String $r6 = bank.getName();
        $r5.setText($r6);
        FragmentTransferToMultipleBankBinding $r42 = this.$this_apply;
        KudiInputField $r52 = $r42.accountNumberField;
        String $r62 = $r52.getText();
        TransferToMultipleBankFragment $r32 = this.this$0;
        TransferToMultipleViewModel $r7 = $r32.getViewModel();
        TransferToMultipleBankFragment $r33 = this.this$0;
        Bank $r1 = $r33.selectedBank;
        $r7.performLookup($r62, $r1);
    }
}
