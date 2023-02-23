package p201g.p259r;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1620e0;
import kotlin.e0.d.l;
import p201g.p259r.AbstractC8061y;
/* compiled from: LoadStateAdapter.kt */
/* renamed from: g.r.z */
/* loaded from: classes2.dex */
public abstract class AbstractC8082z<VH extends RecyclerView.AbstractC1620e0> extends RecyclerView.AbstractC1623h<VH> {
    private AbstractC8061y loadState = new AbstractC8061y.C8064c(false);

    public boolean displayLoadStateAsItem(AbstractC8061y abstractC8061y) {
        l.f(abstractC8061y, "loadState");
        return (abstractC8061y instanceof AbstractC8061y.C8063b) || (abstractC8061y instanceof AbstractC8061y.C8062a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final int getItemCount() {
        return displayLoadStateAsItem(this.loadState) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final int getItemViewType(int i) {
        return getStateViewType(this.loadState);
    }

    public final AbstractC8061y getLoadState() {
        return this.loadState;
    }

    public int getStateViewType(AbstractC8061y abstractC8061y) {
        l.f(abstractC8061y, "loadState");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final void onBindViewHolder(VH vh, int i) {
        l.f(vh, "holder");
        onBindViewHolder((AbstractC8082z<VH>) vh, this.loadState);
    }

    public abstract void onBindViewHolder(VH vh, AbstractC8061y abstractC8061y);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        return onCreateViewHolder(viewGroup, this.loadState);
    }

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, AbstractC8061y abstractC8061y);

    public final void setLoadState(AbstractC8061y abstractC8061y) {
        l.f(abstractC8061y, "loadState");
        if (l.b(this.loadState, abstractC8061y)) {
            return;
        }
        boolean displayLoadStateAsItem = displayLoadStateAsItem(this.loadState);
        boolean displayLoadStateAsItem2 = displayLoadStateAsItem(abstractC8061y);
        if (displayLoadStateAsItem && !displayLoadStateAsItem2) {
            notifyItemRemoved(0);
        } else if (displayLoadStateAsItem2 && !displayLoadStateAsItem) {
            notifyItemInserted(0);
        } else if (displayLoadStateAsItem && displayLoadStateAsItem2) {
            notifyItemChanged(0);
        }
        this.loadState = abstractC8061y;
    }
}
