package ai.kudi.agent.pos.p016ui.widget;

import ai.kudi.agent.databinding.ViewPosSummaryItemBinding;
import ai.kudi.agent.pos.p016ui.data.PosSummaryUiData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosSummaryAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/pos/ui/widget/PosSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/pos/ui/widget/PosSummaryViewHolder;", "items", "", "Lai/kudi/agent/pos/ui/data/PosSummaryUiData;", "(Ljava/util/List;)V", "onSummaryItemClicked", "Lkotlin/Function1;", "", "getOnSummaryItemClicked", "()Lkotlin/jvm/functions/Function1;", "setOnSummaryItemClicked", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.widget.PosSummaryAdapter */
/* loaded from: classes.dex */
public final class PosSummaryAdapter extends RecyclerView.AbstractC1623h<PosSummaryViewHolder> {
    private final List<PosSummaryUiData> items;
    private InterfaceC11767l<? super PosSummaryUiData, C13666w> onSummaryItemClicked;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosSummaryAdapter(List list) {
        Log_OC.getArray(list, "items");
        this.items = list;
        PosSummaryAdapter$onSummaryItemClicked$1 $r2 = PosSummaryAdapter$onSummaryItemClicked$1.INSTANCE;
        this.onSummaryItemClicked = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m40112onBindViewHolder$lambda0(PosSummaryAdapter posSummaryAdapter, PosSummaryUiData posSummaryUiData, View view) {
        Log_OC.getArray(posSummaryAdapter, "this$0");
        Log_OC.getArray(posSummaryUiData, "$posSummaryUiData");
        InterfaceC11767l $r1 = posSummaryAdapter.getOnSummaryItemClicked();
        $r1.invoke(posSummaryUiData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnSummaryItemClicked() {
        InterfaceC11767l r1 = this.onSummaryItemClicked;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(PosSummaryViewHolder posSummaryViewHolder, int i) {
        Log_OC.getArray(posSummaryViewHolder, "holder");
        List $r3 = this.items;
        Object $r1 = $r3.get(i);
        final PosSummaryUiData $r4 = (PosSummaryUiData) $r1;
        posSummaryViewHolder.bind($r4);
        View $r5 = posSummaryViewHolder.itemView;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.widget.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PosSummaryAdapter $r2 = PosSummaryAdapter.this;
                PosSummaryUiData $r32 = $r4;
                PosSummaryAdapter.m40112onBindViewHolder$lambda0($r2, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(PosSummaryViewHolder posSummaryViewHolder, int i) {
        PosSummaryViewHolder $r2 = posSummaryViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public PosSummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ViewPosSummaryItemBinding $r5 = ViewPosSummaryItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        PosSummaryViewHolder $r2 = new PosSummaryViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ PosSummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PosSummaryViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setOnSummaryItemClicked(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onSummaryItemClicked = interfaceC11767l;
    }
}
