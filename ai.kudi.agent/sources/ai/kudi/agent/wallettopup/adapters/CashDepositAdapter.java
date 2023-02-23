package ai.kudi.agent.wallettopup.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.ItemCashDepositBinding;
import ai.kudi.agent.wallettopup.adapters.CashDepositAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CashDepositAdapter.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Item;", "Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "Item", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CashDepositAdapter extends AbstractC1736q<Item, ViewHolder> {
    public static final Companion Companion;
    private static final CashDepositAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK;

    /* compiled from: CashDepositAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "ai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Companion$DIFF_CALLBACK$1", "Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Companion$DIFF_CALLBACK$1;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: CashDepositAdapter.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Item;", "", "id", "", "imageRef", "descriptionRef", "(III)V", "getDescriptionRef", "()I", "getId", "getImageRef", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Item {
        private final int descriptionRef;
        private final int imageRef;
        private final int rootName;

        public Item(int i, int i2, int i3) {
            this.rootName = i;
            this.imageRef = i2;
            this.descriptionRef = i3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Item copy$default(Item item, int $i0, int $i1, int $i2, int i, Object obj) {
            int $i4 = i & 1;
            if ($i4 != 0) {
                $i0 = item.rootName;
            }
            int $i42 = i & 2;
            if ($i42 != 0) {
                $i1 = item.imageRef;
            }
            int $i3 = i & 4;
            if ($i3 != 0) {
                $i2 = item.descriptionRef;
            }
            Item $r0 = item.copy($i0, $i1, $i2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component1() {
            int i0 = this.rootName;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component2() {
            int i0 = this.imageRef;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component3() {
            int i0 = this.descriptionRef;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Item copy(int i, int i2, int i3) {
            Item $r0 = new Item(i, i2, i3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Item;
            if ($z0) {
                Item $r2 = (Item) obj;
                int $i0 = this.rootName;
                int $i1 = $r2.rootName;
                if ($i0 != $i1) {
                    return false;
                }
                int $i02 = this.imageRef;
                int $i12 = $r2.imageRef;
                if ($i02 != $i12) {
                    return false;
                }
                int $i03 = this.descriptionRef;
                int $i13 = $r2.descriptionRef;
                return $i03 == $i13;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getDescriptionRef() {
            int i0 = this.descriptionRef;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getId() {
            int i0 = this.rootName;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getImageRef() {
            int i0 = this.imageRef;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            int $i0 = this.rootName;
            int $i1 = this.imageRef;
            int $i12 = this.descriptionRef;
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Item(id=");
            int $i0 = this.rootName;
            $r2.append($i0);
            $r2.append(", imageRef=");
            int $i02 = this.imageRef;
            $r2.append($i02);
            $r2.append(", descriptionRef=");
            int $i03 = this.descriptionRef;
            $r2.append($i03);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: CashDepositAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/ItemCashDepositBinding;", "(Lai/kudi/agent/databinding/ItemCashDepositBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/ItemCashDepositBinding;", "bind", "", "item", "Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Item;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ItemCashDepositBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(ai.kudi.agent.databinding.ItemCashDepositBinding r5) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r5.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.adapters.CashDepositAdapter.ViewHolder.<init>(ai.kudi.agent.databinding.ItemCashDepositBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(Item item) {
            Log_OC.getArray(item, "item");
            ItemCashDepositBinding $r2 = this.binding;
            TextView $r3 = $r2.stepTextView;
            ViewGroup $r4 = $r2.getRoot();
            ViewGroup r11 = $r4;
            Context $r5 = r11.getContext();
            int $i0 = item.getId();
            Integer $r7 = Integer.valueOf($i0);
            Object[] $r6 = {$r7};
            String $r8 = $r5.getString(C0001R.string.step, $r6);
            $r3.setText($r8);
            ImageView $r9 = this.binding.icon;
            int $i02 = item.getImageRef();
            $r9.setImageResource($i02);
            ItemCashDepositBinding $r22 = this.binding;
            TextView $r10 = $r22.descriptionTextView;
            ViewGroup $r42 = $r22.getRoot();
            ViewGroup r112 = $r42;
            Context $r52 = r112.getContext();
            int $i03 = item.getDescriptionRef();
            CharSequence $r82 = $r52.getString($i03);
            TextView $r32 = $r10;
            $r32.setText($r82);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemCashDepositBinding getBinding() {
            ItemCashDepositBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.wallettopup.adapters.CashDepositAdapter$Companion$DIFF_CALLBACK$1] */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DIFF_CALLBACK = new C1713j.AbstractC1719f<Item>() { // from class: ai.kudi.agent.wallettopup.adapters.CashDepositAdapter$Companion$DIFF_CALLBACK$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
            public boolean areContentsTheSame2(CashDepositAdapter.Item item, CashDepositAdapter.Item item2) {
                Log_OC.getArray(item, "oldItem");
                Log_OC.getArray(item2, "newItem");
                boolean $z0 = Log_OC.append(item, item2);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(CashDepositAdapter.Item item, CashDepositAdapter.Item item2) {
                CashDepositAdapter.Item $r3 = item;
                CashDepositAdapter.Item $r4 = item2;
                boolean $z0 = areContentsTheSame2($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
            public boolean areItemsTheSame2(CashDepositAdapter.Item item, CashDepositAdapter.Item item2) {
                Log_OC.getArray(item, "oldItem");
                Log_OC.getArray(item2, "newItem");
                int $i0 = item.getId();
                int $i1 = item2.getId();
                return $i0 == $i1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(CashDepositAdapter.Item item, CashDepositAdapter.Item item2) {
                CashDepositAdapter.Item $r3 = item;
                CashDepositAdapter.Item $r4 = item2;
                boolean $z0 = areItemsTheSame2($r3, $r4);
                return $z0;
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CashDepositAdapter() {
        /*
            r1 = this;
            ai.kudi.agent.wallettopup.adapters.CashDepositAdapter$Companion$DIFF_CALLBACK$1 r0 = ai.kudi.agent.wallettopup.adapters.CashDepositAdapter.DIFF_CALLBACK
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.adapters.CashDepositAdapter.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        Object $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        Item $r3 = (Item) $r2;
        viewHolder.bind($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        ViewHolder $r2 = (ViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ItemCashDepositBinding $r5 = ItemCashDepositBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        ViewHolder $r2 = new ViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
