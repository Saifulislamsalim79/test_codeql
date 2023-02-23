package ai.kudi.agent.p036v2.productDetails.adapter;

import ai.kudi.agent.collections.databinding.LayoutAmountTypePlanBinding;
import ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter;
import ai.kudi.dip.library.bottomSheets.models.Field;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductPlansAdapter.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\b\u0012\u00060\u0002R\u00020\u00000\fj\f\u0012\b\u0012\u00060\u0002R\u00020\u0000`\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/ProductPlansAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/v2/productDetails/adapter/ProductPlansAdapter$ProductPlansViewHolder;", "onClickListener", "Lai/kudi/agent/v2/productDetails/adapter/PlanItemOnClickListener;", "(Lai/kudi/agent/v2/productDetails/adapter/PlanItemOnClickListener;)V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lai/kudi/dip/library/bottomSheets/models/Field;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "wrapperViews", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "selectionFields", "", "ProductPlansViewHolder", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.adapter.ProductPlansAdapter */
/* loaded from: classes.dex */
public final class ProductPlansAdapter extends RecyclerView.AbstractC1623h<ProductPlansViewHolder> {
    private final C1713j.AbstractC1719f<Field> DIFF_CALLBACK;
    private final C1681d<Field> mDiffer;
    private final PlanItemOnClickListener onClickListener;
    private ArrayList<ProductPlansViewHolder> wrapperViews;

    /* compiled from: ProductPlansAdapter.kt */
    @Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/ProductPlansAdapter$ProductPlansViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/collections/databinding/LayoutAmountTypePlanBinding;", "(Lai/kudi/agent/v2/productDetails/adapter/ProductPlansAdapter;Lai/kudi/agent/collections/databinding/LayoutAmountTypePlanBinding;)V", "getBinding", "()Lai/kudi/agent/collections/databinding/LayoutAmountTypePlanBinding;", "categoryAdapter", "Lai/kudi/agent/v2/productDetails/adapter/PlanCategoryAdapter;", "field", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getField", "()Lai/kudi/dip/library/bottomSheets/models/Field;", "setField", "(Lai/kudi/dip/library/bottomSheets/models/Field;)V", "multiplePlanCategoriesAdapter", "Lai/kudi/agent/v2/productDetails/adapter/MultiplePlanCategoriesAdapter;", "selectedCategories", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "bind", "", "plan", "getPlanButton", "Landroid/widget/TextView;", "getSelection", "handleSelectionListener", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productDetails.adapter.ProductPlansAdapter$ProductPlansViewHolder */
    /* loaded from: classes.dex */
    public final class ProductPlansViewHolder extends RecyclerView.AbstractC1620e0 {
        private final LayoutAmountTypePlanBinding binding;
        private PlanCategoryAdapter categoryAdapter;
        private Field field;
        private MultiplePlanCategoriesAdapter multiplePlanCategoriesAdapter;
        private ArrayList<String> selectedCategories;
        final /* synthetic */ ProductPlansAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ProductPlansViewHolder(ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter r8, ai.kudi.agent.collections.databinding.LayoutAmountTypePlanBinding r9) {
            /*
                r7 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
                r7.this$0 = r8
                androidx.constraintlayout.widget.ConstraintLayout r1 = r9.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r7.<init>(r2)
                r7.binding = r9
                ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter r4 = new ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter
                r4.<init>()
                r7.categoryAdapter = r4
                ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter r5 = new ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter
                r5.<init>()
                r7.multiplePlanCategoriesAdapter = r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r7.selectedCategories = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter.ProductPlansViewHolder.<init>(ai.kudi.agent.v2.productDetails.adapter.ProductPlansAdapter, ai.kudi.agent.collections.databinding.LayoutAmountTypePlanBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(ai.kudi.dip.library.bottomSheets.models.Field r21) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter.ProductPlansViewHolder.bind(ai.kudi.dip.library.bottomSheets.models.Field):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final LayoutAmountTypePlanBinding getBinding() {
            LayoutAmountTypePlanBinding r1 = this.binding;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Field getField() {
            Field r1 = this.field;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getPlanButton() {
            LayoutAmountTypePlanBinding $r1 = this.binding;
            TextView $r2 = $r1.tvSelectButton;
            Log_OC.loadImage($r2, "binding.tvSelectButton");
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ArrayList getSelection() {
            ArrayList r1 = this.selectedCategories;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Incorrect condition in loop: B:14:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleSelectionListener(ai.kudi.dip.library.bottomSheets.models.Field r11) {
            /*
                r10 = this;
                java.lang.String r0 = "plan"
                kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
                boolean r1 = r11.getAllowMultiSelect()
                if (r1 == 0) goto L46
                ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter r2 = r10.multiplePlanCategoriesAdapter
                java.util.List r3 = r2.getCheckItems()
                if (r3 == 0) goto L1c
                boolean r1 = r3.isEmpty()
                if (r1 == 0) goto L1a
                goto L1c
            L1a:
                r1 = 0
                goto L1d
            L1c:
                r1 = 1
            L1d:
                if (r1 != 0) goto L69
                java.util.ArrayList<java.lang.String> r4 = r10.selectedCategories
                r4.clear()
                ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter r2 = r10.multiplePlanCategoriesAdapter
                java.util.List r3 = r2.getCheckItems()
                java.util.Iterator r5 = r3.iterator()
            L2e:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L69
                java.lang.Object r6 = r5.next()
                r7 = r6
                ai.kudi.dip.library.bottomSheets.models.Field r7 = (ai.kudi.dip.library.bottomSheets.models.Field) r7
                r11 = r7
                java.util.ArrayList<java.lang.String> r4 = r10.selectedCategories
                java.lang.String r8 = r11.getKey()
                r4.add(r8)
                goto L2e
            L46:
                ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter r9 = r10.categoryAdapter
                ai.kudi.dip.library.bottomSheets.models.Field r11 = r9.getSelectedItem()
                if (r11 == 0) goto L69
                java.util.ArrayList<java.lang.String> r4 = r10.selectedCategories
                r4.clear()
                java.util.ArrayList<java.lang.String> r4 = r10.selectedCategories
                ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter r9 = r10.categoryAdapter
                ai.kudi.dip.library.bottomSheets.models.Field r11 = r9.getSelectedItem()
                if (r11 != 0) goto L5f
                r8 = 0
                goto L63
            L5f:
                java.lang.String r8 = r11.getKey()
            L63:
                kotlin.p483e0.p485d.Log_OC.append(r8)
                r4.add(r8)
            L69:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter.ProductPlansViewHolder.handleSelectionListener(ai.kudi.dip.library.bottomSheets.models.Field):void");
        }

        public final void setField(Field field) {
            this.field = field;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductPlansAdapter(PlanItemOnClickListener planItemOnClickListener) {
        Log_OC.getArray(planItemOnClickListener, "onClickListener");
        this.onClickListener = planItemOnClickListener;
        ArrayList $r2 = new ArrayList();
        this.wrapperViews = $r2;
        this.DIFF_CALLBACK = new C1713j.AbstractC1719f<Field>() { // from class: ai.kudi.agent.v2.productDetails.adapter.ProductPlansAdapter$DIFF_CALLBACK$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
            public boolean areContentsTheSame2(Field field, Field field2) {
                Log_OC.getArray(field, "oldItem");
                Log_OC.getArray(field2, "newItem");
                boolean $z0 = field.equals(field2);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(Field field, Field field2) {
                Field $r3 = field;
                Field $r4 = field2;
                boolean $z0 = areContentsTheSame2($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
            public boolean areItemsTheSame2(Field field, Field field2) {
                Log_OC.getArray(field, "oldItem");
                Log_OC.getArray(field2, "newItem");
                int $i0 = field.getId();
                int $i1 = field2.getId();
                if ($i0 == $i1) {
                    String $r3 = field.getName();
                    String $r4 = field2.getName();
                    boolean $z0 = Log_OC.append($r3, $r4);
                    if ($z0) {
                        String $r32 = field.getValue();
                        String $r42 = field2.getValue();
                        boolean $z02 = Log_OC.append($r32, $r42);
                        if ($z02) {
                            String $r33 = field.getKey();
                            String $r43 = field2.getKey();
                            boolean $z03 = Log_OC.append($r33, $r43);
                            return $z03;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(Field field, Field field2) {
                Field $r3 = field;
                Field $r4 = field2;
                boolean $z0 = areItemsTheSame2($r3, $r4);
                return $z0;
            }
        };
        C1713j.AbstractC1719f $r5 = this.DIFF_CALLBACK;
        C1681d $r4 = new C1681d(this, $r5);
        this.mDiffer = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001a */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41619onBindViewHolder$lambda0(ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter r24, ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter.ProductPlansViewHolder r25, ai.kudi.dip.library.bottomSheets.models.Field r26, android.view.View r27) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter.m41619onBindViewHolder$lambda0(ai.kudi.agent.v2.productDetails.adapter.ProductPlansAdapter, ai.kudi.agent.v2.productDetails.adapter.ProductPlansAdapter$ProductPlansViewHolder, ai.kudi.dip.library.bottomSheets.models.Field, android.view.View):void");
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
    public void onBindViewHolder2(final ProductPlansViewHolder productPlansViewHolder, int i) {
        Log_OC.getArray(productPlansViewHolder, "holder");
        C1681d $r3 = this.mDiffer;
        List $r4 = $r3.m34821b();
        int $i0 = productPlansViewHolder.getAdapterPosition();
        Object $r5 = $r4.get($i0);
        final Field $r6 = (Field) $r5;
        Log_OC.loadImage($r6, "currentItem");
        productPlansViewHolder.bind($r6);
        ArrayList $r7 = this.wrapperViews;
        boolean $z0 = $r7.contains(productPlansViewHolder);
        if (!$z0) {
            ArrayList $r72 = this.wrapperViews;
            $r72.add(productPlansViewHolder);
        }
        TextView $r8 = productPlansViewHolder.getPlanButton();
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productDetails.adapter.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductPlansAdapter $r2 = ProductPlansAdapter.this;
                ProductPlansAdapter.ProductPlansViewHolder $r32 = productPlansViewHolder;
                Field $r42 = $r6;
                ProductPlansAdapter.m41619onBindViewHolder$lambda0($r2, $r32, $r42, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ProductPlansViewHolder productPlansViewHolder, int i) {
        ProductPlansViewHolder $r2 = productPlansViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ProductPlansViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutAmountTypePlanBinding $r5 = LayoutAmountTypePlanBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        ProductPlansViewHolder $r2 = new ProductPlansViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ProductPlansViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductPlansViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitList(List list) {
        Log_OC.getArray(list, "selectionFields");
        C1681d $r2 = this.mDiffer;
        $r2.m34818e(list);
    }
}
