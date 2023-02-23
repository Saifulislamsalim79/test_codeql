package ai.kudi.agent.p036v2.productSearch.adapter;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.databinding.LayoutProductItemBinding;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener;
import ai.kudi.agent.p036v2.common.view.adapter.BaseMarketplaceRecyclerViewAdapter;
import ai.kudi.agent.p036v2.productSearch.viewHolder.ProductSearchViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* compiled from: ProductSearchAdapter.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/adapter/ProductSearchAdapter;", "Lai/kudi/agent/v2/common/view/adapter/BaseMarketplaceRecyclerViewAdapter;", "Lai/kudi/agent/v2/productSearch/viewHolder/ProductSearchViewHolder;", "onClickListener", "Lai/kudi/agent/v2/common/utils/ProductItemOnClickListener;", "(Lai/kudi/agent/v2/common/utils/ProductItemOnClickListener;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "addItems", "", "moreList", "", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.adapter.ProductSearchAdapter */
/* loaded from: classes.dex */
public final class ProductSearchAdapter extends BaseMarketplaceRecyclerViewAdapter<ProductSearchViewHolder> {
    private final C1681d<MarketplaceProductModel> mDiffer;
    private final ProductItemOnClickListener onClickListener;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSearchAdapter(ProductItemOnClickListener productItemOnClickListener) {
        Log_OC.getArray(productItemOnClickListener, "onClickListener");
        this.onClickListener = productItemOnClickListener;
        C1713j.AbstractC1719f $r1 = getDIFF_CALLBACK();
        C1681d $r3 = new C1681d(this, $r1);
        this.mDiffer = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m41680onBindViewHolder$lambda0(ProductSearchAdapter productSearchAdapter, MarketplaceProductModel marketplaceProductModel, ProductSearchViewHolder productSearchViewHolder, View view) {
        Log_OC.getArray(productSearchAdapter, "this$0");
        Log_OC.getArray(productSearchViewHolder, "$holder");
        ProductItemOnClickListener $r4 = productSearchAdapter.onClickListener;
        Log_OC.loadImage(marketplaceProductModel, "currentItem");
        int $i0 = productSearchViewHolder.getAdapterPosition();
        $r4.onClick(marketplaceProductModel, $i0);
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
        notifyDataSetChanged();
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
    public void onBindViewHolder(final ProductSearchViewHolder productSearchViewHolder, int i) {
        Log_OC.getArray(productSearchViewHolder, "holder");
        C1681d $r4 = this.mDiffer;
        List $r5 = $r4.m34821b();
        Object $r6 = $r5.get(productSearchViewHolder.getAdapterPosition());
        final MarketplaceProductModel $r7 = (MarketplaceProductModel) $r6;
        LayoutProductItemBinding $r8 = productSearchViewHolder.bind();
        TextView $r9 = $r8.textViewProductsTitle;
        String $r10 = $r7.getTitle();
        $r9.setText($r10);
        TextView $r92 = $r8.textViewProductsSubtitle;
        String $r102 = $r7.getDescription();
        $r92.setText($r102);
        ImageUtil.Companion $r2 = ImageUtil.Companion;
        View $r11 = productSearchViewHolder.itemView;
        Context $r12 = $r11.getContext();
        Log_OC.loadImage($r12, "holder.itemView.context");
        String $r103 = $r7.getImageUrl();
        ImageView $r3 = $r8.imgProductImage;
        Log_OC.loadImage($r3, "binding.imgProductImage");
        int $i0 = R$drawable.im_rounded_rectangle;
        $r2.load($r12, $r103, $r3, $i0, $i0);
        View $r112 = productSearchViewHolder.itemView;
        $r112.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productSearch.adapter.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductSearchAdapter $r22 = ProductSearchAdapter.this;
                MarketplaceProductModel $r32 = $r7;
                ProductSearchViewHolder $r42 = productSearchViewHolder;
                ProductSearchAdapter.m41680onBindViewHolder$lambda0($r22, $r32, $r42, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        ProductSearchViewHolder $r2 = (ProductSearchViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ProductSearchViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutProductItemBinding $r5 = LayoutProductItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        ProductSearchViewHolder $r2 = new ProductSearchViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductSearchViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
