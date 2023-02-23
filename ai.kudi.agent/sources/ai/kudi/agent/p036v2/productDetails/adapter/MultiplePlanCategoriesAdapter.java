package ai.kudi.agent.p036v2.productDetails.adapter;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.p036v2.productDetails.adapter.MultiplePlanCategoriesAdapter;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import ai.kudi.dip.library.bottomSheets.models.Field;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
/* compiled from: MultiplePlanCategoriesAdapter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\nj\b\u0012\u0004\u0012\u00020\u0006`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/MultiplePlanCategoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/v2/productDetails/adapter/MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder;", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lai/kudi/dip/library/bottomSheets/models/Field;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "selectedFields", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "viewHolders", "getCheckItems", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", TransactionBreakDownItemType.DATA, "MultiplePlanCategoriesViewHolder", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter */
/* loaded from: classes.dex */
public final class MultiplePlanCategoriesAdapter extends RecyclerView.AbstractC1623h<MultiplePlanCategoriesViewHolder> {
    private final C1713j.AbstractC1719f<Field> DIFF_CALLBACK = new C1713j.AbstractC1719f<Field>() { // from class: ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$DIFF_CALLBACK$1
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
            boolean $z0 = Log_OC.append(field, field2);
            if ($z0) {
                boolean $z02 = field.isChecked();
                boolean $z1 = field2.isChecked();
                return $z02 == $z1;
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
    private final C1681d<Field> mDiffer;
    private ArrayList<Field> selectedFields;
    private ArrayList<MultiplePlanCategoriesViewHolder> viewHolders;

    /* compiled from: MultiplePlanCategoriesAdapter.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/adapter/MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "itemAmount", "Landroid/widget/TextView;", "multiSelectCheckBox", "Landroid/widget/CheckBox;", "subField", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getSubField", "()Lai/kudi/dip/library/bottomSheets/models/Field;", "setSubField", "(Lai/kudi/dip/library/bottomSheets/models/Field;)V", "bind", "", "multipleOptionsItem", "getCheckBox", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder */
    /* loaded from: classes.dex */
    public static final class MultiplePlanCategoriesViewHolder extends RecyclerView.AbstractC1620e0 {
        private final TextView itemAmount;
        private final CheckBox multiSelectCheckBox;
        private Field subField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public MultiplePlanCategoriesViewHolder(View view) {
            super(view);
            Log_OC.getArray(view, "itemView");
            int $i0 = C0785d.iv_option_check;
            View $r2 = view.findViewById($i0);
            Log_OC.loadImage($r2, "itemView.findViewById(R.id.iv_option_check)");
            CheckBox $r3 = (CheckBox) $r2;
            this.multiSelectCheckBox = $r3;
            int $i02 = C0785d.tv_item_value;
            View $r1 = view.findViewById($i02);
            Log_OC.loadImage($r1, "itemView.findViewById(R.id.tv_item_value)");
            TextView $r4 = (TextView) $r1;
            this.itemAmount = $r4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bind$lambda-0  reason: not valid java name */
        public static final void m41617bind$lambda0(Field field, CompoundButton compoundButton, boolean z) {
            Log_OC.getArray(field, "$multipleOptionsItem");
            field.setChecked(z);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final Field field) {
            Log_OC.getArray(field, "multipleOptionsItem");
            this.subField = field;
            CheckBox $r2 = this.multiSelectCheckBox;
            View $r3 = this.itemView;
            Context $r4 = $r3.getContext();
            int $i0 = C0756b.drawable_square_box;
            Drawable $r5 = C1335a.m36322f($r4, $i0);
            $r2.setButtonDrawable($r5);
            CheckBox $r22 = this.multiSelectCheckBox;
            $r22.setText(field.getName());
            C13262h $r7 = new C13262h("[0-9]+");
            String $r6 = field.getValue();
            boolean $z0 = $r6 == null ? true : $r7.m5522e($r6);
            if ($z0) {
                TextView $r8 = this.itemAmount;
                String $r62 = field.getValue();
                $r8.setText($r62 == null ? null : StringExtKt.formatDecimalAmount($r62));
            } else {
                TextView $r82 = this.itemAmount;
                $r82.setText(field.getValue());
            }
            CheckBox $r23 = this.multiSelectCheckBox;
            $r23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.v2.productDetails.adapter.ImportActivity$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Field $r24 = Field.this;
                    MultiplePlanCategoriesAdapter.MultiplePlanCategoriesViewHolder.m41617bind$lambda0($r24, compoundButton, z);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CheckBox getCheckBox() {
            CheckBox r1 = this.multiSelectCheckBox;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Field getSubField() {
            Field r1 = this.subField;
            return r1;
        }

        public final void setSubField(Field field) {
            this.subField = field;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MultiplePlanCategoriesAdapter() {
        C1713j.AbstractC1719f $r1 = this.DIFF_CALLBACK;
        C1681d $r3 = new C1681d(this, $r1);
        this.mDiffer = $r3;
        ArrayList $r4 = new ArrayList();
        this.selectedFields = $r4;
        ArrayList $r42 = new ArrayList();
        this.viewHolders = $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getCheckItems() {
        /*
            r7 = this;
            java.util.ArrayList<ai.kudi.dip.library.bottomSheets.models.Field> r0 = r7.selectedFields
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r4 = r2.next()
            r6 = r4
            ai.kudi.dip.library.bottomSheets.models.Field r6 = (ai.kudi.dip.library.bottomSheets.models.Field) r6
            r5 = r6
            boolean r3 = r5.isChecked()
            if (r3 == 0) goto Lb
            r1.add(r4)
            goto Lb
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.MultiplePlanCategoriesAdapter.getCheckItems():java.util.List");
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
    /* JADX WARN: Incorrect condition in loop: B:10:0x0043 */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder2(ai.kudi.agent.p036v2.productDetails.adapter.MultiplePlanCategoriesAdapter.MultiplePlanCategoriesViewHolder r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "holder"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            androidx.recyclerview.widget.d<ai.kudi.dip.library.bottomSheets.models.Field> r1 = r13.mDiffer
            java.util.List r2 = r1.m34821b()
            int r15 = r14.getAdapterPosition()
            java.lang.Object r3 = r2.get(r15)
            r5 = r3
            ai.kudi.dip.library.bottomSheets.models.Field r5 = (ai.kudi.dip.library.bottomSheets.models.Field) r5
            r4 = r5
            java.lang.String r0 = "currentItem"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
            r14.bind(r4)
            java.util.ArrayList<ai.kudi.dip.library.bottomSheets.models.Field> r6 = r13.selectedFields
            boolean r7 = r6.contains(r4)
            if (r7 != 0) goto L2c
            java.util.ArrayList<ai.kudi.dip.library.bottomSheets.models.Field> r6 = r13.selectedFields
            r6.add(r4)
        L2c:
            java.util.ArrayList<ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder> r6 = r13.viewHolders
            boolean r7 = r6.add(r14)
            if (r7 != 0) goto L39
            java.util.ArrayList<ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder> r6 = r13.viewHolders
            r6.add(r14)
        L39:
            java.util.ArrayList<ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder> r6 = r13.viewHolders
            java.util.Iterator r8 = r6.iterator()
        L3f:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L65
            java.lang.Object r3 = r8.next()
            r9 = r3
            ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder r9 = (ai.kudi.agent.p036v2.productDetails.adapter.MultiplePlanCategoriesAdapter.MultiplePlanCategoriesViewHolder) r9
            r14 = r9
            android.widget.CheckBox r10 = r14.getCheckBox()
            ai.kudi.dip.library.bottomSheets.models.Field r4 = r14.getSubField()
            r7 = 0
            if (r4 != 0) goto L59
            goto L61
        L59:
            boolean r11 = r4.isChecked()
            r12 = 1
            if (r11 != r12) goto L61
            r7 = 1
        L61:
            r10.setChecked(r7)
            goto L3f
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.adapter.MultiplePlanCategoriesAdapter.onBindViewHolder2(ai.kudi.agent.v2.productDetails.adapter.MultiplePlanCategoriesAdapter$MultiplePlanCategoriesViewHolder, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(MultiplePlanCategoriesViewHolder multiplePlanCategoriesViewHolder, int i) {
        MultiplePlanCategoriesViewHolder $r2 = multiplePlanCategoriesViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public MultiplePlanCategoriesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        int $i0 = C0786e.layout_multiple_check_item;
        View $r5 = $r4.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context)\n                .inflate(R.layout.layout_multiple_check_item, parent, false)");
        MultiplePlanCategoriesViewHolder $r2 = new MultiplePlanCategoriesViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ MultiplePlanCategoriesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MultiplePlanCategoriesViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitList(List list) {
        Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
        C1681d $r2 = this.mDiffer;
        $r2.m34818e(list);
    }
}
