package ai.kudi.agent.savings.adapter;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.AbstractC8061y;
import p201g.p259r.AbstractC8082z;
/* compiled from: SavingStateAdapter.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingStateAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lai/kudi/agent/savings/adapter/SavingStateAdapter$LoadStateViewHolder;", "()V", "onBindViewHolder", "", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoadStateViewHolder", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingStateAdapter extends AbstractC8082z<LoadStateViewHolder> {

    /* compiled from: SavingStateAdapter.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingStateAdapter$LoadStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "nextProgress", "Landroid/widget/ProgressBar;", "bind", "", "loadState", "Landroidx/paging/LoadState;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LoadStateViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ProgressBar nextProgress;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LoadStateViewHolder(android.view.ViewGroup r9) {
            /*
                r8 = this;
                java.lang.String r0 = "parent"
                kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
                android.content.Context r1 = r9.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
                int r3 = ai.kudi.agent.savings.C0456R.C0459layout.item_load_state
                r5 = 0
                android.view.View r4 = r2.inflate(r3, r9, r5)
                r8.<init>(r4)
                android.view.View r4 = r8.itemView
                ai.kudi.agent.savings.databinding.ItemLoadStateBinding r6 = ai.kudi.agent.savings.databinding.ItemLoadStateBinding.bind(r4)
                java.lang.String r0 = "bind(itemView)"
                kotlin.p483e0.p485d.Log_OC.loadImage(r6, r0)
                android.widget.ProgressBar r7 = r6.pbNextTransaction
                java.lang.String r0 = "binding.pbNextTransaction"
                kotlin.p483e0.p485d.Log_OC.loadImage(r7, r0)
                r8.nextProgress = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.adapter.SavingStateAdapter.LoadStateViewHolder.<init>(android.view.ViewGroup):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(AbstractC8061y abstractC8061y) {
            Log_OC.getArray(abstractC8061y, "loadState");
            boolean $z0 = abstractC8061y instanceof AbstractC8061y.C8062a;
            if ($z0) {
                AbstractC8061y.C8062a $r3 = (AbstractC8061y.C8062a) abstractC8061y;
                Throwable $r1 = $r3.m16804b();
                $r1.getLocalizedMessage();
            }
            ProgressBar $r4 = this.nextProgress;
            boolean $z02 = abstractC8061y instanceof AbstractC8061y.C8063b;
            byte $b0 = $z02 ? (byte) 0 : (byte) 8;
            $r4.setVisibility($b0);
        }
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(LoadStateViewHolder loadStateViewHolder, AbstractC8061y abstractC8061y) {
        Log_OC.getArray(loadStateViewHolder, "holder");
        Log_OC.getArray(abstractC8061y, "loadState");
        loadStateViewHolder.bind(abstractC8061y);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p259r.AbstractC8082z
    public /* bridge */ /* synthetic */ void onBindViewHolder(LoadStateViewHolder loadStateViewHolder, AbstractC8061y abstractC8061y) {
        LoadStateViewHolder $r3 = loadStateViewHolder;
        onBindViewHolder2($r3, abstractC8061y);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p201g.p259r.AbstractC8082z
    public LoadStateViewHolder onCreateViewHolder(ViewGroup viewGroup, AbstractC8061y abstractC8061y) {
        Log_OC.getArray(viewGroup, "parent");
        Log_OC.getArray(abstractC8061y, "loadState");
        LoadStateViewHolder $r3 = new LoadStateViewHolder(viewGroup);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p259r.AbstractC8082z
    public /* bridge */ /* synthetic */ LoadStateViewHolder onCreateViewHolder(ViewGroup viewGroup, AbstractC8061y abstractC8061y) {
        LoadStateViewHolder $r2 = onCreateViewHolder(viewGroup, abstractC8061y);
        return $r2;
    }
}
