package ai.kudi.agent.withdrawal.p041ui;

import ai.kudi.agent.bills.adapters.PaymentVendorAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OthersWithdrawalFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/bills/adapters/PaymentVendorAdapter;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdrawal.ui.OthersWithdrawalFragment$paymentVendorAdapter$2 */
/* loaded from: classes.dex */
public final class OthersWithdrawalFragment$paymentVendorAdapter$2 extends AbstractC11802m implements InterfaceC11756a<PaymentVendorAdapter> {
    final /* synthetic */ OthersWithdrawalFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OthersWithdrawalFragment$paymentVendorAdapter$2(OthersWithdrawalFragment othersWithdrawalFragment) {
        super(0);
        this.this$0 = othersWithdrawalFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final PaymentVendorAdapter invoke() {
        Fragment $r3 = this.this$0;
        Fragment r5 = $r3;
        FragmentActivity $r2 = r5.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        PaymentVendorAdapter r4 = new PaymentVendorAdapter($r2);
        return r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ PaymentVendorAdapter invoke() {
        PaymentVendorAdapter $r1 = invoke();
        return $r1;
    }
}
