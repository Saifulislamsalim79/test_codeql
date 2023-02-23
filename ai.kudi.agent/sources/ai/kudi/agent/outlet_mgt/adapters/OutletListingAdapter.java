package ai.kudi.agent.outlet_mgt.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ItemListOutletRequestBinding;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: OutletListingAdapter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J\"\u0010\u0016\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter$Holder;", "listener", "Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter$ActionLister;", "(Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter$ActionLister;)V", "outletList", "", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "signatureBackgroundList", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "setDataAfterInvalidating", "actionIfEmpty", "Lkotlin/Function0;", "ActionLister", "Holder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletListingAdapter extends RecyclerView.AbstractC1623h<Holder> {
    private final ActionLister listener;
    private List<Outlet> outletList;
    private List<Integer> signatureBackgroundList;

    /* compiled from: OutletListingAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter$ActionLister;", "", "onClick", "", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface ActionLister {
        void onClick(Outlet outlet);
    }

    /* compiled from: OutletListingAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/ItemListOutletRequestBinding;", "(Lai/kudi/agent/databinding/ItemListOutletRequestBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/ItemListOutletRequestBinding;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Holder extends RecyclerView.AbstractC1620e0 {
        private final ItemListOutletRequestBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Holder(ai.kudi.agent.databinding.ItemListOutletRequestBinding r5) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r5.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.adapters.OutletListingAdapter.Holder.<init>(ai.kudi.agent.databinding.ItemListOutletRequestBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemListOutletRequestBinding getBinding() {
            ItemListOutletRequestBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletListingAdapter(ActionLister actionLister) {
        List $r5;
        Log_OC.getArray(actionLister, "listener");
        this.listener = actionLister;
        ArrayList $r2 = new ArrayList();
        this.outletList = $r2;
        Integer $r4 = Integer.valueOf((int) C0001R.C0002drawable.bg_signature_dac7f9);
        Integer $r42 = Integer.valueOf((int) C0001R.C0002drawable.bg_signature_f0e6b2);
        Integer $r43 = Integer.valueOf((int) C0001R.C0002drawable.bg_signature_f9c7c7);
        Integer[] $r3 = {$r4, $r42, $r43};
        $r5 = C13726r.m3885k($r3);
        this.signatureBackgroundList = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-2  reason: not valid java name */
    public static final void m39864onBindViewHolder$lambda2(OutletListingAdapter outletListingAdapter, Outlet outlet, View view) {
        Log_OC.getArray(outletListingAdapter, "this$0");
        Log_OC.getArray(outlet, "$outlet");
        ActionLister $r3 = outletListingAdapter.listener;
        $r3.onClick(outlet);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.outletList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:28:0x01d7 */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder2(ai.kudi.agent.outlet_mgt.adapters.OutletListingAdapter.Holder r66, int r67) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.adapters.OutletListingAdapter.onBindViewHolder2(ai.kudi.agent.outlet_mgt.adapters.OutletListingAdapter$Holder, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(Holder holder, int i) {
        Holder $r2 = holder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ItemListOutletRequestBinding $r5 = ItemListOutletRequestBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        Holder $r2 = new Holder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Holder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, "outletList");
        List $r2 = this.outletList;
        $r2.addAll(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setDataAfterInvalidating(List list, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(list, "outletList");
        Log_OC.getArray(interfaceC11756a, "actionIfEmpty");
        List $r3 = this.outletList;
        $r3.clear();
        List $r32 = this.outletList;
        $r32.addAll(list);
        List $r2 = this.outletList;
        boolean $z0 = $r2.isEmpty();
        if ($z0) {
            interfaceC11756a.invoke();
        }
        notifyDataSetChanged();
    }
}
