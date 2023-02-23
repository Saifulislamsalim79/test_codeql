package ai.kudi.agent.p036v2.productDetails.adapter;

import ai.kudi.agent.collections.databinding.LayoutCheckItemBinding;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.bottomSheets.models.Field;
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
import kotlin.p549l0.C13262h;
/* compiled from: PlanCategoryAdapter.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\b\u0012\u00060\u0002R\u00020\u00000\u000bj\f\u0012\b\u0012\u00060\u0002R\u00020\u0000`\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/PlanCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/v2/productDetails/adapter/PlanCategoryAdapter$PlanCategoryItemViewHolder;", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lai/kudi/dip/library/bottomSheets/models/Field;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "selectedItem", "viewHolders", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "getSelectedItem", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemList", "items", "", "PlanCategoryItemViewHolder", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter */
/* loaded from: classes.dex */
public final class PlanCategoryAdapter extends RecyclerView.AbstractC1623h<PlanCategoryItemViewHolder> {
    private final C1713j.AbstractC1719f<Field> DIFF_CALLBACK;
    private final C1681d<Field> mDiffer;
    private Field selectedItem;
    private ArrayList<PlanCategoryItemViewHolder> viewHolders;

    /* compiled from: PlanCategoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/PlanCategoryAdapter$PlanCategoryItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/collections/databinding/LayoutCheckItemBinding;", "(Lai/kudi/agent/v2/productDetails/adapter/PlanCategoryAdapter;Lai/kudi/agent/collections/databinding/LayoutCheckItemBinding;)V", "getBinding", "()Lai/kudi/agent/collections/databinding/LayoutCheckItemBinding;", "bind", "", "subField", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getCheckBox", "Landroid/widget/ImageView;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter$PlanCategoryItemViewHolder */
    /* loaded from: classes.dex */
    public final class PlanCategoryItemViewHolder extends RecyclerView.AbstractC1620e0 {
        private final LayoutCheckItemBinding binding;
        final /* synthetic */ PlanCategoryAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PlanCategoryItemViewHolder(ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter r3, ai.kudi.agent.collections.databinding.LayoutCheckItemBinding r4) {
            /*
                r2 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
                r2.this$0 = r3
                android.widget.LinearLayout r1 = r4.getRoot()
                r2.<init>(r1)
                r2.binding = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter.PlanCategoryItemViewHolder.<init>(ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter, ai.kudi.agent.collections.databinding.LayoutCheckItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(Field field) {
            Log_OC.getArray(field, "subField");
            LayoutCheckItemBinding $r2 = this.binding;
            TextView $r3 = $r2.tvItemName;
            $r3.setText(field.getName());
            C13262h $r5 = new C13262h("[0-9]+");
            String $r4 = field.getValue();
            boolean $z0 = $r4 == null ? true : $r5.m5522e($r4);
            if (!$z0) {
                LayoutCheckItemBinding $r22 = this.binding;
                TextView $r32 = $r22.tvItemValue;
                $r32.setText(field.getValue());
                return;
            }
            LayoutCheckItemBinding $r23 = this.binding;
            TextView $r33 = $r23.tvItemValue;
            String $r42 = field.getValue();
            $r33.setText($r42 == null ? null : StringExtKt.formatDecimalAmount($r42));
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final LayoutCheckItemBinding getBinding() {
            LayoutCheckItemBinding r1 = this.binding;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ImageView getCheckBox() {
            LayoutCheckItemBinding $r1 = this.binding;
            ImageView $r2 = $r1.ivCheckIcon;
            Log_OC.loadImage($r2, "binding.ivCheckIcon");
            return $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PlanCategoryAdapter() {
        ArrayList $r2 = new ArrayList();
        this.viewHolders = $r2;
        this.DIFF_CALLBACK = new C1713j.AbstractC1719f<Field>() { // from class: ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter$DIFF_CALLBACK$1
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
                String $r3 = field.getName();
                String $r4 = field2.getName();
                boolean $z0 = Log_OC.append($r3, $r4);
                if ($z0) {
                    boolean $z02 = Log_OC.append(field, field2);
                    if ($z02) {
                        int $i0 = field.getId();
                        int $i1 = field2.getId();
                        return $i0 == $i1;
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
        C1713j.AbstractC1719f $r1 = this.DIFF_CALLBACK;
        C1681d $r4 = new C1681d(this, $r1);
        this.mDiffer = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /* renamed from: onBindViewHolder$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41618onBindViewHolder$lambda1(ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter r9, ai.kudi.dip.library.bottomSheets.models.Field r10, ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter.PlanCategoryItemViewHolder r11, android.view.View r12) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
            java.lang.String r0 = "$holder"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            r9.selectedItem = r10
            java.util.ArrayList<ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter$PlanCategoryItemViewHolder> r1 = r9.viewHolders
            java.util.Iterator r2 = r1.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r4 = r2.next()
            r6 = r4
            ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter$PlanCategoryItemViewHolder r6 = (ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter.PlanCategoryItemViewHolder) r6
            r5 = r6
            android.widget.ImageView r7 = r5.getCheckBox()
            int r8 = ai.kudi.dip.library.C0756b.ic_unselected
            r7.setImageResource(r8)
            android.widget.ImageView r7 = r11.getCheckBox()
            int r8 = ai.kudi.dip.library.C0756b.ic_sqare_selected
            r7.setImageResource(r8)
            goto L12
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.PlanCategoryAdapter.m41618onBindViewHolder$lambda1(ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter, ai.kudi.dip.library.bottomSheets.models.Field, ai.kudi.agent.v2.productDetails.adapter.PlanCategoryAdapter$PlanCategoryItemViewHolder, android.view.View):void");
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
    public final Field getSelectedItem() {
        Field r1 = this.selectedItem;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(final PlanCategoryItemViewHolder planCategoryItemViewHolder, int i) {
        Log_OC.getArray(planCategoryItemViewHolder, "holder");
        C1681d $r3 = this.mDiffer;
        List $r4 = $r3.m34821b();
        int $i0 = planCategoryItemViewHolder.getAdapterPosition();
        Object $r5 = $r4.get($i0);
        final Field $r6 = (Field) $r5;
        ArrayList $r7 = this.viewHolders;
        boolean $z0 = $r7.contains(planCategoryItemViewHolder);
        if (!$z0) {
            ArrayList $r72 = this.viewHolders;
            $r72.add(planCategoryItemViewHolder);
        }
        Log_OC.loadImage($r6, "currentItem");
        planCategoryItemViewHolder.bind($r6);
        View $r8 = planCategoryItemViewHolder.itemView;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productDetails.adapter.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlanCategoryAdapter $r2 = PlanCategoryAdapter.this;
                Field $r32 = $r6;
                PlanCategoryAdapter.PlanCategoryItemViewHolder $r42 = planCategoryItemViewHolder;
                PlanCategoryAdapter.m41618onBindViewHolder$lambda1($r2, $r32, $r42, view);
            }
        });
        Field $r9 = this.selectedItem;
        boolean $z02 = Log_OC.append($r9, $r6);
        if ($z02) {
            ImageView $r10 = planCategoryItemViewHolder.getCheckBox();
            int $i02 = C0756b.ic_sqare_selected;
            $r10.setImageResource($i02);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(PlanCategoryItemViewHolder planCategoryItemViewHolder, int i) {
        PlanCategoryItemViewHolder $r2 = planCategoryItemViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public PlanCategoryItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutCheckItemBinding $r5 = LayoutCheckItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        PlanCategoryItemViewHolder $r2 = new PlanCategoryItemViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ PlanCategoryItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PlanCategoryItemViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setItemList(List list) {
        Log_OC.getArray(list, "items");
        C1681d $r2 = this.mDiffer;
        $r2.m34818e(list);
    }
}
