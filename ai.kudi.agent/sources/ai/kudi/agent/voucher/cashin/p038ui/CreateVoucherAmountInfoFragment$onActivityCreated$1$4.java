package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.databinding.FragmentCreateVoucherAmountInfoBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.view.View;
import android.widget.EditText;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CreateVoucherAmountInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.AMOUNT, "", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherAmountInfoFragment$onActivityCreated$1$4 */
/* loaded from: classes.dex */
final class CreateVoucherAmountInfoFragment$onActivityCreated$1$4 extends AbstractC11802m implements InterfaceC11772q<Long, View, Integer, C13666w> {
    final /* synthetic */ FragmentCreateVoucherAmountInfoBinding $this_apply;
    final /* synthetic */ CreateVoucherAmountInfoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateVoucherAmountInfoFragment$onActivityCreated$1$4(FragmentCreateVoucherAmountInfoBinding fragmentCreateVoucherAmountInfoBinding, CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment) {
        super(3);
        this.$this_apply = fragmentCreateVoucherAmountInfoBinding;
        this.this$0 = createVoucherAmountInfoFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(Long l, View view, Integer num) {
        Long $r4 = l;
        long $l0 = $r4.longValue();
        View $r5 = view;
        Integer $r42 = num;
        int $i1 = $r42.intValue();
        invoke($l0, $r5, $i1);
        C13666w r6 = C13666w.f30112a;
        return r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(long j, View view, int i) {
        Log_OC.getArray(view, "$noName_1");
        FragmentCreateVoucherAmountInfoBinding $r3 = this.$this_apply;
        EditText $r4 = $r3.amountEditText;
        if ($r4 != null) {
            String $r1 = String.valueOf(j);
            $r4.setText($r1);
        }
        CreateVoucherAmountInfoFragment $r5 = this.this$0;
        $r5.toggleNairaColor(true);
    }
}
