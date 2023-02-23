package ai.kudi.agent.payments.adapter;

import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AmountSuggestionAdapter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "v", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AmountSuggestionAdapter$onBindViewHolder$1 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ AmountSuggestionAdapter.AmountViewHolder $holder;
    final /* synthetic */ AmountSuggestionAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountSuggestionAdapter$onBindViewHolder$1(AmountSuggestionAdapter amountSuggestionAdapter, AmountSuggestionAdapter.AmountViewHolder amountViewHolder) {
        super(1);
        this.this$0 = amountSuggestionAdapter;
        this.$holder = amountViewHolder;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "v");
        AmountSuggestionAdapter $r3 = this.this$0;
        try {
            InterfaceC11772q $r4 = $r3.getOnClickListener();
            if ($r4 == null) {
                return;
            }
            AmountSuggestionAdapter $r32 = this.this$0;
            AmountSuggestionAdapter.AmountViewHolder $r5 = this.$holder;
            int $i0 = $r5.getAdapterPosition();
            Long $r6 = AmountSuggestionAdapter.access$getItem($r32, $i0);
            Log_OC.loadImage($r6, "getItem(holder.adapterPosition)");
            AmountSuggestionAdapter.AmountViewHolder $r52 = this.$holder;
            int $i02 = $r52.getAdapterPosition();
            Integer $r7 = Integer.valueOf($i02);
            $r4.invoke($r6, view, $r7);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}
