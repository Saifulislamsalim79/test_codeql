package ai.kudi.agent.common_screens.amount_input.p003ui.fragments;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseAmountInputFragment.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "VD", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/BaseAmountInputViewData;", TransactionField.AMOUNT, "", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.common_screens.amount_input.ui.fragments.BaseAmountInputFragment$adapter$1$1 */
/* loaded from: classes.dex */
public final class BaseAmountInputFragment$adapter$1$1 extends AbstractC11802m implements InterfaceC11772q<Long, View, Integer, C13666w> {
    final /* synthetic */ BaseAmountInputFragment<VM, VD> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAmountInputFragment$adapter$1$1(BaseAmountInputFragment baseAmountInputFragment) {
        super(3);
        this.this$0 = baseAmountInputFragment;
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
        BaseAmountInputFragment $r2 = this.this$0;
        $r2.onSuggestedAmountClick(j);
    }
}
