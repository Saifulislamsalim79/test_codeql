package ai.kudi.agent.p036v2.productLookupDetails.adapter;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13287o;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductLookupDetailsAdapter.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J \u0010\u0014\u001a\u00020\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0016R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/v2/productLookupDetails/adapter/ProductLookupDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/v2/productLookupDetails/adapter/ProductLookupDetailsAdapter$ProductLookupDetailsViewHolder;", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lkotlin/Pair;", "", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "lookupSummary", "", "ProductLookupDetailsViewHolder", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookupDetails.adapter.ProductLookupDetailsAdapter */
/* loaded from: classes.dex */
public final class ProductLookupDetailsAdapter extends RecyclerView.AbstractC1623h<ProductLookupDetailsViewHolder> {
    private final C1713j.AbstractC1719f<C13287o<String, String>> DIFF_CALLBACK = new C1713j.AbstractC1719f<C13287o<? extends String, ? extends String>>() { // from class: ai.kudi.agent.v2.productLookupDetails.adapter.ProductLookupDetailsAdapter$DIFF_CALLBACK$1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(C13287o<? extends String, ? extends String> c13287o, C13287o<? extends String, ? extends String> c13287o2) {
            C13287o<? extends String, ? extends String> $r3 = c13287o;
            C13287o<? extends String, ? extends String> $r4 = c13287o2;
            boolean $z0 = areContentsTheSame2((C13287o) $r3, (C13287o) $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
        public boolean areContentsTheSame2(C13287o c13287o, C13287o c13287o2) {
            Log_OC.getArray(c13287o, "oldItem");
            Log_OC.getArray(c13287o2, "newItem");
            boolean $z0 = c13287o.equals(c13287o2);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(C13287o<? extends String, ? extends String> c13287o, C13287o<? extends String, ? extends String> c13287o2) {
            C13287o<? extends String, ? extends String> $r3 = c13287o;
            C13287o<? extends String, ? extends String> $r4 = c13287o2;
            boolean $z0 = areItemsTheSame2((C13287o) $r3, (C13287o) $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
        public boolean areItemsTheSame2(C13287o c13287o, C13287o c13287o2) {
            Log_OC.getArray(c13287o, "oldItem");
            Log_OC.getArray(c13287o2, "newItem");
            Object $r3 = c13287o.m5364c();
            Object $r4 = c13287o2.m5364c();
            boolean $z0 = Log_OC.append($r3, $r4);
            if ($z0) {
                boolean $z02 = Log_OC.append(c13287o, c13287o2);
                if ($z02) {
                    Object $r32 = c13287o.m5363d();
                    Object $r42 = c13287o2.m5363d();
                    boolean $z03 = Log_OC.append($r32, $r42);
                    return $z03;
                }
                return false;
            }
            return false;
        }
    };
    private final C1681d<C13287o<String, String>> mDiffer;

    /* compiled from: ProductLookupDetailsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productLookupDetails/adapter/ProductLookupDetailsAdapter$ProductLookupDetailsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "marketplaceLookupSummary", "Lkotlin/Pair;", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productLookupDetails.adapter.ProductLookupDetailsAdapter$ProductLookupDetailsViewHolder */
    /* loaded from: classes.dex */
    public static final class ProductLookupDetailsViewHolder extends RecyclerView.AbstractC1620e0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductLookupDetailsViewHolder(View view) {
            super(view);
            Log_OC.getArray(view, "itemView");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(C13287o c13287o) {
            Log_OC.getArray(c13287o, "marketplaceLookupSummary");
            View $r2 = this.itemView;
            int $i0 = R$id.tv_details_hint;
            TextView $r3 = (TextView) $r2.findViewById($i0);
            View $r22 = this.itemView;
            int $i02 = R$id.tv_details_value;
            TextView $r4 = (TextView) $r22.findViewById($i02);
            Object $r5 = c13287o.m5364c();
            CharSequence $r6 = (CharSequence) $r5;
            $r3.setText($r6);
            Object $r52 = c13287o.m5363d();
            CharSequence $r62 = (CharSequence) $r52;
            $r4.setText($r62);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductLookupDetailsAdapter() {
        C1713j.AbstractC1719f $r1 = this.DIFF_CALLBACK;
        C1681d $r3 = new C1681d(this, $r1);
        this.mDiffer = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        C1681d $r1 = this.mDiffer;
        List $r2 = $r1.m34821b();
        int $i0 = $r2.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ProductLookupDetailsViewHolder productLookupDetailsViewHolder, int i) {
        Log_OC.getArray(productLookupDetailsViewHolder, "holder");
        C1681d $r2 = this.mDiffer;
        List $r3 = $r2.m34821b();
        int $i0 = productLookupDetailsViewHolder.getAdapterPosition();
        Object $r4 = $r3.get($i0);
        C13287o $r5 = (C13287o) $r4;
        Log_OC.loadImage($r5, "currentItem");
        productLookupDetailsViewHolder.bind($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ProductLookupDetailsViewHolder productLookupDetailsViewHolder, int i) {
        ProductLookupDetailsViewHolder $r2 = productLookupDetailsViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ProductLookupDetailsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        int $i0 = R$layout.layout_lookup_details_item;
        View $r5 = $r4.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context)\n            .inflate(R.layout.layout_lookup_details_item, parent, false)");
        ProductLookupDetailsViewHolder $r2 = new ProductLookupDetailsViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ProductLookupDetailsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductLookupDetailsViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitList(List list) {
        Log_OC.getArray(list, "lookupSummary");
        C1681d $r2 = this.mDiffer;
        $r2.m34818e(list);
    }
}
