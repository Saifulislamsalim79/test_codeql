package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.core.util.ContextExtKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransferToMultipleBankFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment$observerViewModel$1$10$1 */
/* loaded from: classes.dex */
public final class TransferToMultipleBankFragment$observerViewModel$1$10$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ TransferToMultipleBankFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToMultipleBankFragment$observerViewModel$1$10$1(TransferToMultipleBankFragment transferToMultipleBankFragment) {
        super(0);
        this.this$0 = transferToMultipleBankFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TransferToMultipleBankFragment $r2 = this.this$0;
        ContextExtKt.launchActivity$default((Fragment) $r2, false, TransferActivity.class, (InterfaceC11767l) null, 5, (Object) null);
        TransferToMultipleBankFragment $r22 = this.this$0;
        FragmentActivity $r1 = $r22.requireActivity();
        $r1.finish();
    }
}
