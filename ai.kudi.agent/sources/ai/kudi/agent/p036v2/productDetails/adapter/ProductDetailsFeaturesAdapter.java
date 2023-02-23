package ai.kudi.agent.p036v2.productDetails.adapter;

import ai.kudi.agent.collections.databinding.LayoutFeatureItemBinding;
import ai.kudi.agent.p036v2.productDetails.viewHolder.ProductDetailsFeatureViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11837e;
import kotlin.p549l0.C13277t;
/* compiled from: ProductDetailsFeaturesAdapter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0014\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/ProductDetailsFeaturesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/v2/productDetails/viewHolder/ProductDetailsFeatureViewHolder;", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "features", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.adapter.ProductDetailsFeaturesAdapter */
/* loaded from: classes.dex */
public final class ProductDetailsFeaturesAdapter extends RecyclerView.AbstractC1623h<ProductDetailsFeatureViewHolder> {
    private final C1713j.AbstractC1719f<String> DIFF_CALLBACK = new C1713j.AbstractC1719f<String>() { // from class: ai.kudi.agent.v2.productDetails.adapter.ProductDetailsFeaturesAdapter$DIFF_CALLBACK$1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(String str, String str2) {
            String $r3 = str;
            String $r4 = str2;
            boolean $z0 = areContentsTheSame2($r3, $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
        public boolean areContentsTheSame2(String str, String str2) {
            Log_OC.getArray(str, "oldItem");
            Log_OC.getArray(str2, "newItem");
            boolean $z0 = str.equals(str2);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(String str, String str2) {
            String $r3 = str;
            String $r4 = str2;
            boolean $z0 = areItemsTheSame2($r3, $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
        public boolean areItemsTheSame2(String str, String str2) {
            C11837e $r3;
            C11837e $r4;
            Log_OC.getArray(str, "oldItem");
            Log_OC.getArray(str2, "newItem");
            int $i0 = str.length();
            int $i1 = str2.length();
            if ($i0 == $i1) {
                boolean $z0 = Log_OC.append(str, str2);
                if ($z0) {
                    $r3 = C13277t.m5411P(str);
                    $r4 = C13277t.m5411P(str2);
                    boolean $z02 = Log_OC.append($r3, $r4);
                    return $z02;
                }
                return false;
            }
            return false;
        }
    };
    private final C1681d<String> mDiffer;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductDetailsFeaturesAdapter() {
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
    public void onBindViewHolder2(ProductDetailsFeatureViewHolder productDetailsFeatureViewHolder, int i) {
        Log_OC.getArray(productDetailsFeatureViewHolder, "holder");
        C1681d $r2 = this.mDiffer;
        List $r3 = $r2.m34821b();
        int $i0 = productDetailsFeatureViewHolder.getAdapterPosition();
        Object $r4 = $r3.get($i0);
        String $r5 = (String) $r4;
        Log_OC.loadImage($r5, "currentItem");
        productDetailsFeatureViewHolder.bind($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ProductDetailsFeatureViewHolder productDetailsFeatureViewHolder, int i, List list) {
        Log_OC.getArray(productDetailsFeatureViewHolder, "holder");
        Log_OC.getArray(list, "payloads");
        boolean $z0 = list.isEmpty();
        if ($z0) {
            onBindViewHolder2(productDetailsFeatureViewHolder, i);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ProductDetailsFeatureViewHolder productDetailsFeatureViewHolder, int i) {
        ProductDetailsFeatureViewHolder $r2 = productDetailsFeatureViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ProductDetailsFeatureViewHolder productDetailsFeatureViewHolder, int i, List list) {
        ProductDetailsFeatureViewHolder $r3 = productDetailsFeatureViewHolder;
        onBindViewHolder2($r3, i, list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ProductDetailsFeatureViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutFeatureItemBinding $r5 = LayoutFeatureItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n            LayoutInflater.from(parent.context), parent, false\n        )");
        ProductDetailsFeatureViewHolder $r2 = new ProductDetailsFeatureViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ProductDetailsFeatureViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductDetailsFeatureViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitList(List list) {
        Log_OC.getArray(list, "features");
        C1681d $r2 = this.mDiffer;
        $r2.m34818e(list);
    }
}
