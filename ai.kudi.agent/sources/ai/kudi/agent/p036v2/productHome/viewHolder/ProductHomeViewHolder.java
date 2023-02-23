package ai.kudi.agent.p036v2.productHome.viewHolder;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.p036v2.common.utils.MarketplaceProductViewType;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductHomeViewHolder.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/viewHolder/ProductHomeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "ivProductImage", "Landroid/widget/ImageView;", "tvProductDescription", "Landroid/widget/TextView;", "tvProductTitle", "tvSectorHeader", "tvSectorSeeAllBtn", "bind", "", "marketplaceProduct", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "viewType", "Lai/kudi/agent/v2/common/utils/MarketplaceProductViewType;", "seeAllButton", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.viewHolder.ProductHomeViewHolder */
/* loaded from: classes.dex */
public final class ProductHomeViewHolder extends RecyclerView.AbstractC1620e0 {
    private final Context context;
    private ImageView ivProductImage;
    private TextView tvProductDescription;
    private TextView tvProductTitle;
    private TextView tvSectorHeader;
    private TextView tvSectorSeeAllBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductHomeViewHolder(View view) {
        super(view);
        Log_OC.getArray(view, "itemView");
        Context $r1 = view.getContext();
        Log_OC.loadImage($r1, "itemView.context");
        this.context = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(MarketplaceProductModel marketplaceProductModel, MarketplaceProductViewType marketplaceProductViewType) {
        Log_OC.getArray(marketplaceProductViewType, "viewType");
        MarketplaceProductViewType $r5 = MarketplaceProductViewType.PRODUCT_VIEW;
        if (marketplaceProductViewType == $r5) {
            View $r6 = this.itemView;
            int $i0 = R$id.img_product_image;
            this.ivProductImage = (ImageView) $r6.findViewById($i0);
            View $r62 = this.itemView;
            int $i02 = R$id.textView_products_title;
            TextView $r7 = (TextView) $r62.findViewById($i02);
            this.tvProductTitle = $r7;
            View $r63 = this.itemView;
            int $i03 = R$id.textView_products_subtitle;
            TextView $r72 = (TextView) $r63.findViewById($i03);
            this.tvProductDescription = $r72;
        } else {
            View $r64 = this.itemView;
            int $i04 = R$id.list_header_title;
            TextView $r73 = (TextView) $r64.findViewById($i04);
            this.tvSectorHeader = $r73;
            View $r65 = this.itemView;
            int $i05 = R$id.list_header_see_all_btn;
            TextView $r74 = (TextView) $r65.findViewById($i05);
            this.tvSectorSeeAllBtn = $r74;
        }
        MarketplaceProductViewType $r52 = MarketplaceProductViewType.PRODUCT_VIEW;
        if (marketplaceProductViewType != $r52) {
            TextView $r75 = this.tvSectorHeader;
            if ($r75 == null) {
                return;
            }
            String $r8 = marketplaceProductViewType.getText();
            $r75.setText($r8);
        } else if (marketplaceProductModel == null) {
        } else {
            TextView $r76 = this.tvProductTitle;
            if ($r76 != null) {
                String $r82 = marketplaceProductModel.getTitle();
                $r76.setText($r82);
            }
            TextView $r77 = this.tvProductDescription;
            if ($r77 != null) {
                String $r83 = marketplaceProductModel.getDescription();
                $r77.setText($r83);
            }
            ImageView $r2 = this.ivProductImage;
            if ($r2 == null) {
                return;
            }
            ImageUtil.Companion $r9 = ImageUtil.Companion;
            Context $r1 = this.context;
            String $r84 = marketplaceProductModel.getImageUrl();
            int $i06 = R$drawable.im_rounded_rectangle;
            $r9.load($r1, $r84, $r2, $i06, $i06);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TextView seeAllButton() {
        TextView r1 = this.tvSectorSeeAllBtn;
        return r1;
    }
}
