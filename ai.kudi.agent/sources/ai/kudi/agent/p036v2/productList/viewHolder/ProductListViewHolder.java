package ai.kudi.agent.p036v2.productList.viewHolder;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.databinding.LayoutProductItemBinding;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.util.image.ImageUtil;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductListViewHolder.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/v2/productList/viewHolder/ProductListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lai/kudi/agent/collections/databinding/LayoutProductItemBinding;", "(Lai/kudi/agent/collections/databinding/LayoutProductItemBinding;)V", "context", "Landroid/content/Context;", "bind", "", "marketplaceProduct", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "setEntryAnimation", "viewToAnimate", "Landroid/view/View;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productList.viewHolder.ProductListViewHolder */
/* loaded from: classes.dex */
public final class ProductListViewHolder extends RecyclerView.AbstractC1620e0 {
    private final Context context;
    private final LayoutProductItemBinding itemBinding;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProductListViewHolder(ai.kudi.agent.collections.databinding.LayoutProductItemBinding r6) {
        /*
            r5 = this;
            java.lang.String r0 = "itemBinding"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r2 = r3
            r5.<init>(r2)
            r5.itemBinding = r6
            android.view.View r2 = r5.itemView
            android.content.Context r4 = r2.getContext()
            java.lang.String r0 = "itemView.context"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
            r5.context = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productList.viewHolder.ProductListViewHolder.<init>(ai.kudi.agent.collections.databinding.LayoutProductItemBinding):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(MarketplaceProductModel marketplaceProductModel) {
        Log_OC.getArray(marketplaceProductModel, "marketplaceProduct");
        LayoutProductItemBinding $r5 = this.itemBinding;
        TextView $r6 = $r5.textViewProductsTitle;
        String $r7 = marketplaceProductModel.getTitle();
        $r6.setText($r7);
        LayoutProductItemBinding $r52 = this.itemBinding;
        TextView $r62 = $r52.textViewProductsSubtitle;
        String $r72 = marketplaceProductModel.getDescription();
        $r62.setText($r72);
        ImageUtil.Companion $r1 = ImageUtil.Companion;
        Context $r2 = this.context;
        String $r73 = marketplaceProductModel.getImageUrl();
        LayoutProductItemBinding $r53 = this.itemBinding;
        ImageView $r3 = $r53.imgProductImage;
        Log_OC.loadImage($r3, "itemBinding.imgProductImage");
        int $i0 = R$drawable.im_rounded_rectangle;
        $r1.load($r2, $r73, $r3, $i0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setEntryAnimation(View view) {
        Log_OC.getArray(view, "viewToAnimate");
        Context $r2 = view.getContext();
        Animation $r3 = AnimationUtils.loadAnimation($r2, 17432576);
        view.startAnimation($r3);
    }
}
