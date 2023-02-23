package ai.kudi.agent.product.other_bills.p018ui;

import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PayBillsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, m10421d2 = {"<anonymous>", "", "searchText", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "searchView", "Landroid/widget/EditText;", "emptyState", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.PayBillsFragment$showBillers$3 */
/* loaded from: classes.dex */
final class PayBillsFragment$showBillers$3 extends AbstractC11802m implements InterfaceC11773r<String, RecyclerView, EditText, View, C13666w> {
    final /* synthetic */ PayBillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayBillsFragment$showBillers$3(PayBillsFragment payBillsFragment) {
        super(4);
        this.this$0 = payBillsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11773r
    public /* bridge */ /* synthetic */ C13666w invoke(String str, RecyclerView recyclerView, EditText editText, View view) {
        String $r5 = str;
        RecyclerView $r6 = recyclerView;
        EditText $r7 = editText;
        View $r8 = view;
        invoke2($r5, $r6, $r7, $r8);
        C13666w r9 = C13666w.f30112a;
        return r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, RecyclerView recyclerView, EditText editText, View view) {
        Log_OC.getArray(str, "searchText");
        Log_OC.getArray(recyclerView, "rv");
        Log_OC.getArray(editText, "searchView");
        Log_OC.getArray(view, "emptyState");
        PayBillsFragment $r5 = this.this$0;
        $r5.performSearch(str, recyclerView, editText, view);
    }
}
