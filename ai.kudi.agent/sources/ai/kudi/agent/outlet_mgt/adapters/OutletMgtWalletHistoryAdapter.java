package ai.kudi.agent.outlet_mgt.adapters;

import ai.kudi.agent.C0001R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OutletMgtWalletHistoryAdapter.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/adapters/OutletMgtWalletHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/outlet_mgt/adapters/OutletMgtWalletHistoryAdapter$VH;", "onItemClick", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "VH", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtWalletHistoryAdapter extends RecyclerView.AbstractC1623h<C0334VH> {
    private final InterfaceC11756a<C13666w> onItemClick;

    /* compiled from: OutletMgtWalletHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/adapters/OutletMgtWalletHistoryAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lai/kudi/agent/outlet_mgt/adapters/OutletMgtWalletHistoryAdapter;Landroid/view/View;)V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.outlet_mgt.adapters.OutletMgtWalletHistoryAdapter$VH */
    /* loaded from: classes.dex */
    public final class C0334VH extends RecyclerView.AbstractC1620e0 {
        final /* synthetic */ OutletMgtWalletHistoryAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0334VH(OutletMgtWalletHistoryAdapter outletMgtWalletHistoryAdapter, View view) {
            super(view);
            Log_OC.getArray(outletMgtWalletHistoryAdapter, "this$0");
            Log_OC.getArray(view, "itemView");
            this.this$0 = outletMgtWalletHistoryAdapter;
        }
    }

    public OutletMgtWalletHistoryAdapter(InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11756a, "onItemClick");
        this.onItemClick = interfaceC11756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m39865onBindViewHolder$lambda0(OutletMgtWalletHistoryAdapter outletMgtWalletHistoryAdapter, View view) {
        Log_OC.getArray(outletMgtWalletHistoryAdapter, "this$0");
        InterfaceC11756a $r0 = outletMgtWalletHistoryAdapter.getOnItemClick();
        $r0.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return 15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getOnItemClick() {
        InterfaceC11756a r1 = this.onItemClick;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(C0334VH c0334vh, int i) {
        Log_OC.getArray(c0334vh, "holder");
        View $r3 = c0334vh.itemView;
        AdapterColorUtil $r1 = AdapterColorUtil.INSTANCE;
        Context $r4 = $r3.getContext();
        Log_OC.loadImage($r4, "holder.itemView.context");
        int $i0 = i % 2;
        $r3.setBackgroundColor($r1.getViewHolderBackgroundColor($r4, $i0));
        c0334vh.itemView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.adapters.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutletMgtWalletHistoryAdapter $r2 = OutletMgtWalletHistoryAdapter.this;
                OutletMgtWalletHistoryAdapter.m39865onBindViewHolder$lambda0($r2, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(C0334VH c0334vh, int i) {
        C0334VH $r2 = c0334vh;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public C0334VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        View $r5 = $r4.inflate(C0001R.C0004layout.outlet_mgt_wallet_history_item, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context).inflate(R.layout.outlet_mgt_wallet_history_item, parent, false)");
        C0334VH $r2 = new C0334VH(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ C0334VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0334VH $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
