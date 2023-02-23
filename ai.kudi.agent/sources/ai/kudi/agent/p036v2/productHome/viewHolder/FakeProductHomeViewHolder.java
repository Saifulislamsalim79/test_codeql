package ai.kudi.agent.p036v2.productHome.viewHolder;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.util.image.ImageUtil;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: FakeProductHomeViewHolder.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/viewHolder/FakeProductHomeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "ivProductImage", "Landroid/widget/ImageView;", "tvProductDescription", "Landroid/widget/TextView;", "tvProductTitle", "bind", "", "marketplaceProduct", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.viewHolder.FakeProductHomeViewHolder */
/* loaded from: classes.dex */
public final class FakeProductHomeViewHolder extends RecyclerView.AbstractC1620e0 {
    private final Context context;
    private ImageView ivProductImage;
    private TextView tvProductDescription;
    private TextView tvProductTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FakeProductHomeViewHolder(View view) {
        super(view);
        Log_OC.getArray(view, "itemView");
        Context $r2 = view.getContext();
        Log_OC.loadImage($r2, "itemView.context");
        this.context = $r2;
        int $i0 = R$id.img_product_image;
        View $r3 = view.findViewById($i0);
        ImageView $r4 = (ImageView) $r3;
        this.ivProductImage = $r4;
        int $i02 = R$id.textView_products_title;
        View $r32 = view.findViewById($i02);
        TextView $r5 = (TextView) $r32;
        this.tvProductTitle = $r5;
        int $i03 = R$id.textView_products_subtitle;
        View $r1 = view.findViewById($i03);
        TextView $r52 = (TextView) $r1;
        this.tvProductDescription = $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(MarketplaceProductModel marketplaceProductModel) {
        Log_OC.getArray(marketplaceProductModel, "marketplaceProduct");
        TextView $r5 = this.tvProductTitle;
        if ($r5 != null) {
            String $r6 = marketplaceProductModel.getTitle();
            $r5.setText($r6);
        }
        TextView $r52 = this.tvProductDescription;
        if ($r52 != null) {
            String $r62 = marketplaceProductModel.getDescription();
            $r52.setText($r62);
        }
        ImageView $r4 = this.ivProductImage;
        if ($r4 == null) {
            return;
        }
        ImageUtil.Companion $r2 = ImageUtil.Companion;
        Context $r3 = this.context;
        String $r63 = marketplaceProductModel.getImageUrl();
        int $i0 = R$drawable.im_rounded_rectangle;
        $r2.load($r3, $r63, $r4, $i0, $i0);
    }
}
