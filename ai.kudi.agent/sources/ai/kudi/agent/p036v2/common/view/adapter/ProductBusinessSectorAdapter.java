package ai.kudi.agent.p036v2.common.view.adapter;

import ai.kudi.agent.collections.databinding.LayoutSectorItemBinding;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.p036v2.common.utils.ProductBusinessSectorOnClickListener;
import ai.kudi.agent.p036v2.common.view.viewHolder.ProductBusinessSectorViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductBusinessSectorAdapter.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0006\u0010\u0014\u001a\u00020\nJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\nJ\u0014\u0010\u001e\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\fj\b\u0012\u0004\u0012\u00020\u0002`\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/adapter/ProductBusinessSectorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/v2/common/view/viewHolder/ProductBusinessSectorViewHolder;", "onClickListener", "Lai/kudi/agent/v2/common/utils/ProductBusinessSectorOnClickListener;", "(Lai/kudi/agent/v2/common/utils/ProductBusinessSectorOnClickListener;)V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "categoryId", "", "holders", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "wrapperViews", "clearList", "", "getItemCount", "getSelectedCategoryId", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSelectedCategoryId", "id", "submitList", "sectors", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.adapter.ProductBusinessSectorAdapter */
/* loaded from: classes.dex */
public final class ProductBusinessSectorAdapter extends RecyclerView.AbstractC1623h<ProductBusinessSectorViewHolder> {
    private final C1713j.AbstractC1719f<ProductSectorModel> DIFF_CALLBACK;
    private int categoryId;
    private ArrayList<ProductSectorModel> holders;
    private final C1681d<ProductSectorModel> mDiffer;
    private final ProductBusinessSectorOnClickListener onClickListener;
    private ArrayList<ProductBusinessSectorViewHolder> wrapperViews;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductBusinessSectorAdapter(ProductBusinessSectorOnClickListener productBusinessSectorOnClickListener) {
        Log_OC.getArray(productBusinessSectorOnClickListener, "onClickListener");
        this.onClickListener = productBusinessSectorOnClickListener;
        this.DIFF_CALLBACK = new C1713j.AbstractC1719f<ProductSectorModel>() { // from class: ai.kudi.agent.v2.common.view.adapter.ProductBusinessSectorAdapter$DIFF_CALLBACK$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
            public boolean areContentsTheSame2(ProductSectorModel productSectorModel, ProductSectorModel productSectorModel2) {
                Log_OC.getArray(productSectorModel, "oldItem");
                Log_OC.getArray(productSectorModel2, "newItem");
                boolean $z0 = Log_OC.append(productSectorModel, productSectorModel2);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(ProductSectorModel productSectorModel, ProductSectorModel productSectorModel2) {
                ProductSectorModel $r3 = productSectorModel;
                ProductSectorModel $r4 = productSectorModel2;
                boolean $z0 = areContentsTheSame2($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
            public boolean areItemsTheSame2(ProductSectorModel productSectorModel, ProductSectorModel productSectorModel2) {
                Log_OC.getArray(productSectorModel, "oldItem");
                Log_OC.getArray(productSectorModel2, "newItem");
                Integer $r3 = productSectorModel.getId();
                Integer $r4 = productSectorModel2.getId();
                boolean $z0 = Log_OC.append($r3, $r4);
                if ($z0) {
                    String $r5 = productSectorModel.getName();
                    String $r6 = productSectorModel2.getName();
                    boolean $z02 = Log_OC.append($r5, $r6);
                    if ($z02) {
                        String $r52 = productSectorModel.getNameSlugified();
                        String $r62 = productSectorModel2.getNameSlugified();
                        boolean $z03 = Log_OC.append($r52, $r62);
                        return $z03;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(ProductSectorModel productSectorModel, ProductSectorModel productSectorModel2) {
                ProductSectorModel $r3 = productSectorModel;
                ProductSectorModel $r4 = productSectorModel2;
                boolean $z0 = areItemsTheSame2($r3, $r4);
                return $z0;
            }
        };
        C1713j.AbstractC1719f $r4 = this.DIFF_CALLBACK;
        C1681d $r3 = new C1681d(this, $r4);
        this.mDiffer = $r3;
        this.categoryId = -1;
        ArrayList $r5 = new ArrayList();
        this.wrapperViews = $r5;
        ArrayList $r52 = new ArrayList();
        this.holders = $r52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002f */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41542onBindViewHolder$lambda0(ai.kudi.agent.p036v2.common.view.adapter.ProductBusinessSectorAdapter r12, ai.kudi.agent.core.domain.data.ProductSectorModel r13, ai.kudi.agent.p036v2.common.view.viewHolder.ProductBusinessSectorViewHolder r14, android.view.View r15) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            java.lang.String r0 = "$holder"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            ai.kudi.agent.v2.common.utils.ProductBusinessSectorOnClickListener r1 = r12.onClickListener
            java.lang.String r0 = "currentItem"
            kotlin.p483e0.p485d.Log_OC.loadImage(r13, r0)
            int r2 = r14.getAdapterPosition()
            r1.onClick(r13, r2)
            java.lang.Integer r3 = r13.getId()
            kotlin.p483e0.p485d.Log_OC.append(r3)
            int r2 = r3.intValue()
            r12.categoryId = r2
            java.util.ArrayList<ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder> r4 = r12.wrapperViews
            java.util.Iterator r5 = r4.iterator()
        L2b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder r9 = (ai.kudi.agent.p036v2.common.view.viewHolder.ProductBusinessSectorViewHolder) r9
            r8 = r9
            android.view.View r15 = r8.itemView
            android.content.Context r10 = r15.getContext()
            int r2 = ai.kudi.agent.collections.R$drawable.drawable_unselected_gradient
            android.graphics.drawable.Drawable r11 = androidx.core.content.C1335a.m36322f(r10, r2)
            r15.setBackground(r11)
            android.view.View r15 = r14.itemView
            android.content.Context r10 = r15.getContext()
            int r2 = ai.kudi.agent.collections.R$drawable.drawable_selected_gradient
            android.graphics.drawable.Drawable r11 = androidx.core.content.C1335a.m36322f(r10, r2)
            r15.setBackground(r11)
            goto L2b
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.adapter.ProductBusinessSectorAdapter.m41542onBindViewHolder$lambda0(ai.kudi.agent.v2.common.view.adapter.ProductBusinessSectorAdapter, ai.kudi.agent.core.domain.data.ProductSectorModel, ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder, android.view.View):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clearList() {
        C1681d $r2 = this.mDiffer;
        List $r1 = $r2.m34821b();
        $r1.clear();
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
    public final int getSelectedCategoryId() {
        int i0 = this.categoryId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0061 */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder2(final ai.kudi.agent.p036v2.common.view.viewHolder.ProductBusinessSectorViewHolder r18, int r19) {
        /*
            r17 = this;
            java.lang.String r2 = "holder"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r17
            androidx.recyclerview.widget.d<ai.kudi.agent.core.domain.data.ProductSectorModel> r3 = r0.mDiffer
            java.util.List r4 = r3.m34821b()
            r0 = r18
            int r19 = r0.getAdapterPosition()
            r0 = r19
            java.lang.Object r5 = r4.get(r0)
            r7 = r5
            ai.kudi.agent.core.domain.data.ProductSectorModel r7 = (ai.kudi.agent.core.domain.data.ProductSectorModel) r7
            r6 = r7
            r0 = r17
            java.util.ArrayList<ai.kudi.agent.core.domain.data.ProductSectorModel> r8 = r0.holders
            boolean r9 = r8.contains(r6)
            if (r9 != 0) goto L30
            r0 = r17
            java.util.ArrayList<ai.kudi.agent.core.domain.data.ProductSectorModel> r8 = r0.holders
            r8.add(r6)
        L30:
            r0 = r17
            java.util.ArrayList<ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder> r8 = r0.wrapperViews
            r0 = r18
            boolean r9 = r8.contains(r0)
            if (r9 != 0) goto L45
            r0 = r17
            java.util.ArrayList<ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder> r8 = r0.wrapperViews
            r0 = r18
            r8.add(r0)
        L45:
            r0 = r18
            android.view.View r10 = r0.itemView
            ai.kudi.agent.v2.common.view.adapter.h r11 = new ai.kudi.agent.v2.common.view.adapter.h
            r0 = r17
            r1 = r18
            r11.<init>()
            r10.setOnClickListener(r11)
            r0 = r17
            java.util.ArrayList<ai.kudi.agent.core.domain.data.ProductSectorModel> r8 = r0.holders
            java.util.Iterator r12 = r8.iterator()
        L5d:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L89
            java.lang.Object r5 = r12.next()
            r14 = r5
            ai.kudi.agent.core.domain.data.ProductSectorModel r14 = (ai.kudi.agent.core.domain.data.ProductSectorModel) r14
            r13 = r14
            java.lang.Integer r15 = r13.getId()
            r0 = r17
            int r0 = r0.categoryId
            r19 = r0
            if (r15 != 0) goto L78
            goto L84
        L78:
            int r16 = r15.intValue()
            r0 = r16
            r1 = r19
            if (r0 != r1) goto L84
            r9 = 1
            goto L85
        L84:
            r9 = 0
        L85:
            r13.setSelected(r9)
            goto L5d
        L89:
            java.lang.String r2 = "currentItem"
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r2)
            r0 = r18
            r0.bind(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.adapter.ProductBusinessSectorAdapter.onBindViewHolder2(ai.kudi.agent.v2.common.view.viewHolder.ProductBusinessSectorViewHolder, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ProductBusinessSectorViewHolder productBusinessSectorViewHolder, int i) {
        ProductBusinessSectorViewHolder $r2 = productBusinessSectorViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ProductBusinessSectorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutSectorItemBinding $r5 = LayoutSectorItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        ProductBusinessSectorViewHolder $r2 = new ProductBusinessSectorViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ProductBusinessSectorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductBusinessSectorViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setSelectedCategoryId(int i) {
        this.categoryId = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitList(List list) {
        Log_OC.getArray(list, "sectors");
        C1681d $r2 = this.mDiffer;
        $r2.m34818e(list);
    }
}
