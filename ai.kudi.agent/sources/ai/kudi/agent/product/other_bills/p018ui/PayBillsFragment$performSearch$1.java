package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.adapters.BillersAdapter;
import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.core.util.ViewExtKt;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PayBillsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m10421d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "Lai/kudi/agent/bills/data/Biller;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.PayBillsFragment$performSearch$1 */
/* loaded from: classes.dex */
public final class PayBillsFragment$performSearch$1 extends AbstractC11802m implements InterfaceC11767l<List<? extends Biller>, C13666w> {
    final /* synthetic */ View $emptyState;
    final /* synthetic */ PayBillsFragment this$0;
    final /* synthetic */ RecyclerView val$date;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayBillsFragment$performSearch$1(PayBillsFragment payBillsFragment, RecyclerView recyclerView, View view) {
        super(1);
        this.this$0 = payBillsFragment;
        this.val$date = recyclerView;
        this.$emptyState = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m40210invoke$lambda0(RecyclerView recyclerView, View view, PayBillsFragment payBillsFragment) {
        Log_OC.getArray(recyclerView, "$rv");
        Log_OC.getArray(view, "$emptyState");
        Log_OC.getArray(payBillsFragment, "this$0");
        RecyclerView r4 = recyclerView;
        ViewExtKt.show(r4);
        ViewExtKt.hide$default(view, false, 1, null);
        BillersAdapter $r2 = payBillsFragment.billersListSearchAdapter;
        if ($r2 == null) {
            return;
        }
        $r2.notifyDataSetChanged();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(List<? extends Biller> list) {
        List<? extends Biller> $r2 = list;
        invoke2((List) $r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List list) {
        Log_OC.getArray(list, "$noName_0");
        Fragment $r2 = this.this$0;
        Fragment r8 = $r2;
        FragmentActivity $r4 = r8.getActivity();
        if ($r4 == null) {
            return;
        }
        final RecyclerView $r6 = this.val$date;
        final View $r1 = this.$emptyState;
        final PayBillsFragment $r22 = this.this$0;
        $r4.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.product.other_bills.ui.AsyncHttpClient$7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView $r12 = RecyclerView.this;
                View $r23 = $r1;
                PayBillsFragment $r3 = $r22;
                PayBillsFragment$performSearch$1.m40210invoke$lambda0($r12, $r23, $r3);
            }
        });
    }
}
