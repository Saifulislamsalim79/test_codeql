package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentTransferToMultipleBankBinding;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransferToMultipleBankFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "isChecked", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment$observerViewModel$1$1 */
/* loaded from: classes.dex */
public final class TransferToMultipleBankFragment$observerViewModel$1$1 extends AbstractC11802m implements InterfaceC11767l<Boolean, C13666w> {
    final /* synthetic */ FragmentTransferToMultipleBankBinding $this_apply;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToMultipleBankFragment$observerViewModel$1$1(FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding) {
        super(1);
        this.$this_apply = fragmentTransferToMultipleBankBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Boolean bool) {
        Boolean $r2 = bool;
        boolean $z0 = $r2.booleanValue();
        invoke($z0);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(boolean z) {
        if (z) {
            return;
        }
        FragmentTransferToMultipleBankBinding $r1 = this.$this_apply;
        View $r2 = $r1.amountEditText;
        Log_OC.loadImage($r2, "amountEditText");
        View r4 = $r2;
        ViewExtKt.show(r4);
        FragmentTransferToMultipleBankBinding $r12 = this.$this_apply;
        View $r3 = $r12.transferReasonEditText;
        Log_OC.loadImage($r3, "transferReasonEditText");
        View r42 = $r3;
        ViewExtKt.show(r42);
        FragmentTransferToMultipleBankBinding $r13 = this.$this_apply;
        $r13.amountEditText.setText("");
        FragmentTransferToMultipleBankBinding $r14 = this.$this_apply;
        $r14.transferReasonEditText.setText("");
    }
}
