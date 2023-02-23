package ai.kudi.agent.pos.p016ui.widget;

import ai.kudi.agent.databinding.ViewPosSummaryItemBinding;
import ai.kudi.agent.pos.p016ui.data.PosSummaryUiData;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosSummaryViewHolder.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/pos/ui/widget/PosSummaryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/ViewPosSummaryItemBinding;", "(Lai/kudi/agent/databinding/ViewPosSummaryItemBinding;)V", "bind", "", "posSummaryUiData", "Lai/kudi/agent/pos/ui/data/PosSummaryUiData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.widget.PosSummaryViewHolder */
/* loaded from: classes.dex */
public final class PosSummaryViewHolder extends RecyclerView.AbstractC1620e0 {
    private final ViewPosSummaryItemBinding binding;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PosSummaryViewHolder(ai.kudi.agent.databinding.ViewPosSummaryItemBinding r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
            android.widget.LinearLayout r1 = r3.getRoot()
            r2.<init>(r1)
            r2.binding = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.widget.PosSummaryViewHolder.<init>(ai.kudi.agent.databinding.ViewPosSummaryItemBinding):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(PosSummaryUiData posSummaryUiData) {
        Log_OC.getArray(posSummaryUiData, "posSummaryUiData");
        ViewPosSummaryItemBinding $r2 = this.binding;
        ImageView $r3 = $r2.icon;
        int $i0 = posSummaryUiData.getIcon();
        $r3.setImageResource($i0);
        ViewPosSummaryItemBinding $r22 = this.binding;
        TextView $r4 = $r22.titleView;
        String $r5 = posSummaryUiData.getTitle();
        $r4.setText($r5);
        ViewPosSummaryItemBinding $r23 = this.binding;
        TextView $r42 = $r23.labelView;
        String $r52 = posSummaryUiData.getLabel();
        $r42.setText($r52);
    }
}
