package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos;

import android.content.Context;
import com.paypad.impl.Paypad;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: MPosActivationFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Lcom/paypad/impl/Paypad;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosActivationFragment$payPad$2 */
/* loaded from: classes.dex */
final class MPosActivationFragment$payPad$2 extends AbstractC11802m implements InterfaceC11756a<Paypad> {
    final /* synthetic */ MPosActivationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPosActivationFragment$payPad$2(MPosActivationFragment mPosActivationFragment) {
        super(0);
        this.this$0 = mPosActivationFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final Paypad invoke() {
        MPosActivationFragment $r3 = this.this$0;
        Context $r2 = $r3.getContext();
        Paypad $r1 = new Paypad($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Paypad invoke() {
        Paypad $r1 = invoke();
        return $r1;
    }
}
