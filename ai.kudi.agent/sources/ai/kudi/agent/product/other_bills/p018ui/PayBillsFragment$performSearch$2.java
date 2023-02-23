package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.core.util.ViewExtKt;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PayBillsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.PayBillsFragment$performSearch$2 */
/* loaded from: classes.dex */
final class PayBillsFragment$performSearch$2 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ View $emptyState;
    final /* synthetic */ PayBillsFragment this$0;
    final /* synthetic */ RecyclerView val$date;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayBillsFragment$performSearch$2(PayBillsFragment payBillsFragment, RecyclerView recyclerView, View view) {
        super(0);
        this.this$0 = payBillsFragment;
        this.val$date = recyclerView;
        this.$emptyState = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m40211invoke$lambda0(RecyclerView recyclerView, View view) {
        Log_OC.getArray(recyclerView, "$rv");
        Log_OC.getArray(view, "$emptyState");
        RecyclerView r2 = recyclerView;
        ViewExtKt.hide$default(r2, false, 1, null);
        ViewExtKt.show(view);
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
        Fragment $r5 = this.this$0;
        Fragment r7 = $r5;
        FragmentActivity $r4 = r7.getActivity();
        if ($r4 == null) {
            return;
        }
        final RecyclerView $r1 = this.val$date;
        final View $r2 = this.$emptyState;
        $r4.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.product.other_bills.ui.MonthByWeekFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView $r12 = RecyclerView.this;
                View $r22 = $r2;
                PayBillsFragment$performSearch$2.m40211invoke$lambda0($r12, $r22);
            }
        });
    }
}
