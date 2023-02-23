package ai.kudi.agent.p036v2.common.view.viewHolder;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.databinding.LayoutSectorItemBinding;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductBusinessSectorViewHolder.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/viewHolder/ProductBusinessSectorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lai/kudi/agent/collections/databinding/LayoutSectorItemBinding;", "(Lai/kudi/agent/collections/databinding/LayoutSectorItemBinding;)V", "productSector", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "getProductSector", "()Lai/kudi/agent/core/domain/data/ProductSectorModel;", "setProductSector", "(Lai/kudi/agent/core/domain/data/ProductSectorModel;)V", "bind", "", "sector", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder */
/* loaded from: classes.dex */
public final class ProductBusinessSectorViewHolder extends RecyclerView.AbstractC1620e0 {
    private final LayoutSectorItemBinding itemBinding;
    private ProductSectorModel productSector;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProductBusinessSectorViewHolder(ai.kudi.agent.collections.databinding.LayoutSectorItemBinding r3) {
        /*
            r2 = this;
            java.lang.String r0 = "itemBinding"
            kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
            android.widget.LinearLayout r1 = r3.getRoot()
            r2.<init>(r1)
            r2.itemBinding = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.viewHolder.ProductBusinessSectorViewHolder.<init>(ai.kudi.agent.collections.databinding.LayoutSectorItemBinding):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(ProductSectorModel productSectorModel) {
        Log_OC.getArray(productSectorModel, "sector");
        this.productSector = productSectorModel;
        LayoutSectorItemBinding $r2 = this.itemBinding;
        TextView $r3 = $r2.textViewGenre;
        String $r4 = productSectorModel.getName();
        $r3.setText($r4);
        boolean $z0 = productSectorModel.isSelected();
        if ($z0) {
            View $r5 = this.itemView;
            Context $r6 = $r5.getContext();
            int $i0 = R$drawable.drawable_selected_gradient;
            Drawable $r7 = C1335a.m36322f($r6, $i0);
            $r5.setBackground($r7);
            return;
        }
        View $r52 = this.itemView;
        Context $r62 = $r52.getContext();
        int $i02 = R$drawable.drawable_unselected_gradient;
        Drawable $r72 = C1335a.m36322f($r62, $i02);
        $r52.setBackground($r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSectorModel getProductSector() {
        ProductSectorModel r1 = this.productSector;
        return r1;
    }

    public final void setProductSector(ProductSectorModel productSectorModel) {
        this.productSector = productSectorModel;
    }
}
