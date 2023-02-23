package ai.kudi.agent.p036v2.productHome.adapter;

import ai.kudi.agent.collections.databinding.LayoutProductItemBinding;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener;
import ai.kudi.agent.p036v2.common.view.adapter.BaseMarketplaceRecyclerViewAdapter;
import ai.kudi.agent.p036v2.productList.viewHolder.ProductListViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* compiled from: ProductHomeAdapter.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/adapter/ProductHomeAdapter;", "Lai/kudi/agent/v2/common/view/adapter/BaseMarketplaceRecyclerViewAdapter;", "Lai/kudi/agent/v2/productList/viewHolder/ProductListViewHolder;", "onItemClickListener", "Lai/kudi/agent/v2/common/utils/ProductItemOnClickListener;", "(Lai/kudi/agent/v2/common/utils/ProductItemOnClickListener;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "addItems", "", "moreList", "", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.adapter.ProductHomeAdapter */
/* loaded from: classes.dex */
public final class ProductHomeAdapter extends BaseMarketplaceRecyclerViewAdapter<ProductListViewHolder> {
    private final C1681d<MarketplaceProductModel> mDiffer;
    private final ProductItemOnClickListener onItemClickListener;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductHomeAdapter(ProductItemOnClickListener productItemOnClickListener) {
        Log_OC.getArray(productItemOnClickListener, "onItemClickListener");
        this.onItemClickListener = productItemOnClickListener;
        C1713j.AbstractC1719f $r1 = getDIFF_CALLBACK();
        C1681d $r3 = new C1681d(this, $r1);
        this.mDiffer = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m41628onBindViewHolder$lambda0(ProductHomeAdapter productHomeAdapter, C11812w c11812w, ProductListViewHolder productListViewHolder, View view) {
        Log_OC.getArray(productHomeAdapter, "this$0");
        Log_OC.getArray(c11812w, "$currentItem");
        Log_OC.getArray(productListViewHolder, "$holder");
        ProductItemOnClickListener $r4 = productHomeAdapter.onItemClickListener;
        Object $r5 = c11812w.f26499c;
        Log_OC.loadImage($r5, "currentItem");
        MarketplaceProductModel $r6 = (MarketplaceProductModel) $r5;
        int $i0 = productListViewHolder.getAdapterPosition();
        $r4.onClick($r6, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addItems(List list) {
        List $r1;
        Log_OC.getArray(list, "moreList");
        ArrayList $r2 = getDataList();
        boolean $z0 = $r2.containsAll(list);
        if (!$z0) {
            ArrayList $r22 = getDataList();
            $r1 = C13742z.m3823D0(list);
            $r22.addAll($r1);
        }
        C1681d $r3 = this.mDiffer;
        ArrayList $r23 = getDataList();
        $r3.m34818e($r23);
        C1681d $r32 = this.mDiffer;
        List $r12 = $r32.m34821b();
        int $i0 = $r12.size();
        ArrayList $r24 = getDataList();
        int $i1 = $r24.size();
        notifyItemRangeInserted($i0, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clearData() {
        ArrayList $r1 = getDataList();
        boolean $z0 = $r1.isEmpty();
        if (!$z0) {
            ArrayList $r12 = getDataList();
            $r12.clear();
        }
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
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public void onBindViewHolder(final ProductListViewHolder productListViewHolder, int i) {
        Log_OC.getArray(productListViewHolder, "holder");
        final C11812w $r2 = new C11812w();
        C1681d $r3 = this.mDiffer;
        List $r4 = $r3.m34821b();
        int $i0 = productListViewHolder.getAdapterPosition();
        ?? r4 = $r4.get($i0);
        $r2.f26499c = r4;
        Log_OC.loadImage(r4, "currentItem");
        MarketplaceProductModel $r6 = (MarketplaceProductModel) r4;
        productListViewHolder.bind($r6);
        View $r7 = productListViewHolder.itemView;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.adapter.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeAdapter $r22 = ProductHomeAdapter.this;
                C11812w $r32 = $r2;
                ProductListViewHolder $r42 = productListViewHolder;
                ProductHomeAdapter.m41628onBindViewHolder$lambda0($r22, $r32, $r42, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        ProductListViewHolder $r2 = (ProductListViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ProductListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutProductItemBinding $r5 = LayoutProductItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        ProductListViewHolder $r2 = new ProductListViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductListViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewRecycled(ProductListViewHolder productListViewHolder) {
        Log_OC.getArray(productListViewHolder, "holder");
        super.onViewRecycled((ProductHomeAdapter) productListViewHolder);
        View $r2 = productListViewHolder.itemView;
        Log_OC.loadImage($r2, "holder.itemView");
        productListViewHolder.setEntryAnimation($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        ProductListViewHolder $r2 = (ProductListViewHolder) abstractC1620e0;
        onViewRecycled($r2);
    }
}
