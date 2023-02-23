package ai.kudi.agent.product.airtime_data.p017ui;

import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentAirtimeAmountBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* compiled from: AirtimeAmountFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.AMOUNT, "", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeAmountFragment$setAmountSuggestionAdapter$1$1 */
/* loaded from: classes.dex */
final class AirtimeAmountFragment$setAmountSuggestionAdapter$1$1 extends AbstractC11802m implements InterfaceC11772q<Long, View, Integer, C13666w> {
    final /* synthetic */ FragmentAirtimeAmountBinding $this_apply;
    final /* synthetic */ AirtimeAmountFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirtimeAmountFragment$setAmountSuggestionAdapter$1$1(FragmentAirtimeAmountBinding fragmentAirtimeAmountBinding, AirtimeAmountFragment airtimeAmountFragment) {
        super(3);
        this.$this_apply = fragmentAirtimeAmountBinding;
        this.this$0 = airtimeAmountFragment;
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
        CharSequence $r11;
        Log_OC.getArray(view, "$noName_1");
        FragmentAirtimeAmountBinding $r3 = this.$this_apply;
        TextView $r4 = $r3.amountEditText;
        C11780a0 c11780a0 = C11780a0.f26475a;
        Fragment $r6 = this.this$0;
        int $i1 = R$string.total_amount_processed;
        Fragment r14 = $r6;
        String $r7 = r14.getString($i1);
        Log_OC.loadImage($r7, "getString(R.string.total_amount_processed)");
        Locale $r8 = Locale.US;
        NumberFormat $r9 = NumberFormat.getNumberInstance($r8);
        String $r10 = $r9.format(j);
        Object[] $r1 = {$r10};
        String $r72 = String.format($r7, Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r72, "java.lang.String.format(format, *args)");
        if ($r72 == null) {
            NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw r13;
        }
        String $r73 = $r72.substring(1);
        Log_OC.loadImage($r73, "(this as java.lang.String).substring(startIndex)");
        if ($r73 == null) {
            NullPointerException r132 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r132;
        }
        $r11 = C13277t.m5414M0($r73);
        TextView r15 = $r4;
        r15.setText($r11.toString());
    }
}
