package ai.kudi.agent.dashboard.adapter;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownDomain;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.TransactionBreakdownContentListingBinding;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: TransactionBreakDownAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/dashboard/adapter/TransactionBreakDownAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/dashboard/adapter/TransactionBreakDownAdapter$TransactionBreakDownViewHolder;", "breakdownType", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", "(Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;)V", "value", "", "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", "breakdowns", "getBreakdowns", "()Ljava/util/List;", "setBreakdowns", "(Ljava/util/List;)V", "colors", "", "getColors", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TransactionBreakDownViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionBreakDownAdapter extends RecyclerView.AbstractC1623h<TransactionBreakDownViewHolder> {
    private final TransactionSummaryItemType breakdownType;
    private List<TransactionBreakDownDomain> breakdowns;
    private final List<Integer> colors;

    /* compiled from: TransactionBreakDownAdapter.kt */
    @Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/dashboard/adapter/TransactionBreakDownAdapter$TransactionBreakDownViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/TransactionBreakdownContentListingBinding;", "(Lai/kudi/agent/dashboard/adapter/TransactionBreakDownAdapter;Lai/kudi/agent/databinding/TransactionBreakdownContentListingBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/TransactionBreakdownContentListingBinding;", "icon", "Landroidx/appcompat/widget/AppCompatImageView;", "labelText", "Landroid/widget/TextView;", "valueText", "bind", "", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", "position", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class TransactionBreakDownViewHolder extends RecyclerView.AbstractC1620e0 {
        private final TransactionBreakdownContentListingBinding binding;
        private final AppCompatImageView icon;
        private final TextView labelText;
        final /* synthetic */ TransactionBreakDownAdapter this$0;
        private final TextView valueText;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TransactionBreakDownViewHolder(ai.kudi.agent.dashboard.adapter.TransactionBreakDownAdapter r7, ai.kudi.agent.databinding.TransactionBreakdownContentListingBinding r8) {
            /*
                r6 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
                r6.this$0 = r7
                androidx.constraintlayout.widget.ConstraintLayout r1 = r8.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r6.<init>(r2)
                r6.binding = r8
                android.widget.TextView r4 = r8.breakdownLabel
                java.lang.String r0 = "binding.breakdownLabel"
                kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
                r6.labelText = r4
                ai.kudi.agent.databinding.TransactionBreakdownContentListingBinding r8 = r6.binding
                androidx.appcompat.widget.AppCompatImageView r5 = r8.breakdownIcon
                java.lang.String r0 = "binding.breakdownIcon"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
                r6.icon = r5
                ai.kudi.agent.databinding.TransactionBreakdownContentListingBinding r8 = r6.binding
                android.widget.TextView r4 = r8.breakdownValue
                java.lang.String r0 = "binding.breakdownValue"
                kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
                r6.valueText = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.dashboard.adapter.TransactionBreakDownAdapter.TransactionBreakDownViewHolder.<init>(ai.kudi.agent.dashboard.adapter.TransactionBreakDownAdapter, ai.kudi.agent.databinding.TransactionBreakdownContentListingBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(ai.kudi.agent.dashboard.domain.model.TransactionBreakDownDomain r31, int r32) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.dashboard.adapter.TransactionBreakDownAdapter.TransactionBreakDownViewHolder.bind(ai.kudi.agent.dashboard.domain.model.TransactionBreakDownDomain, int):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionBreakdownContentListingBinding getBinding() {
            TransactionBreakdownContentListingBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionBreakDownAdapter(TransactionSummaryItemType transactionSummaryItemType) {
        List $r2;
        List $r22;
        Log_OC.getArray(transactionSummaryItemType, "breakdownType");
        this.breakdownType = transactionSummaryItemType;
        $r2 = C13726r.m3891e();
        this.breakdowns = $r2;
        int $i0 = Color.parseColor("#F0E6B2");
        Integer $r4 = Integer.valueOf($i0);
        int $i02 = Color.parseColor("#C3D1F6");
        Integer $r42 = Integer.valueOf($i02);
        int $i03 = Color.parseColor("#AAF0DF");
        Integer $r43 = Integer.valueOf($i03);
        int $i04 = Color.parseColor("#F6DDD5");
        Integer $r44 = Integer.valueOf($i04);
        Integer[] $r3 = {$r4, $r42, $r43, $r44};
        $r22 = C13726r.m3888h($r3);
        this.colors = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBreakdowns() {
        List r1 = this.breakdowns;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getColors() {
        List r1 = this.colors;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.breakdowns;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(TransactionBreakDownViewHolder transactionBreakDownViewHolder, int i) {
        Log_OC.getArray(transactionBreakDownViewHolder, "holder");
        List $r3 = this.breakdowns;
        Object $r2 = $r3.get(i);
        TransactionBreakDownDomain $r4 = (TransactionBreakDownDomain) $r2;
        transactionBreakDownViewHolder.bind($r4, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(TransactionBreakDownViewHolder transactionBreakDownViewHolder, int i) {
        TransactionBreakDownViewHolder $r2 = transactionBreakDownViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public TransactionBreakDownViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        TransactionBreakdownContentListingBinding $r4 = TransactionBreakdownContentListingBinding.inflate($r3, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n            LayoutInflater.from(parent.context),\n            parent,\n            false\n        )");
        TransactionBreakDownViewHolder $r5 = new TransactionBreakDownViewHolder(this, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ TransactionBreakDownViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        TransactionBreakDownViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setBreakdowns(List list) {
        Log_OC.getArray(list, "value");
        this.breakdowns = list;
        notifyDataSetChanged();
    }
}
