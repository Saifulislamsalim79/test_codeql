package ai.kudi.agent.pos.p016ui.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.ItemPosTypeBinding;
import ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapter;
import ai.kudi.agent.pos.p016ui.model.SelectPosType;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SelectPosAdapter.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B+\u0012$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u001c\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R/\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lai/kudi/agent/pos/ui/model/SelectPosType;", "Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter$ViewHolder;", "clickListener", "Lkotlin/Function3;", "", "", "", "(Lkotlin/jvm/functions/Function3;)V", "getClickListener", "()Lkotlin/jvm/functions/Function3;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.adapter.SelectPosAdapter */
/* loaded from: classes.dex */
public final class SelectPosAdapter extends AbstractC1736q<SelectPosType, ViewHolder> {
    private final InterfaceC11772q<SelectPosType, List<SelectPosType>, Integer, C13666w> clickListener;

    /* compiled from: SelectPosAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/ItemPosTypeBinding;", "(Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter;Lai/kudi/agent/databinding/ItemPosTypeBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/ItemPosTypeBinding;", "bind", "", "posType", "Lai/kudi/agent/pos/ui/model/SelectPosType;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.adapter.SelectPosAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ItemPosTypeBinding binding;
        final /* synthetic */ SelectPosAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapter r5, ai.kudi.agent.databinding.ItemPosTypeBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.cardview.widget.CardView r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapter.ViewHolder.<init>(ai.kudi.agent.pos.ui.adapter.SelectPosAdapter, ai.kudi.agent.databinding.ItemPosTypeBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-1$lambda-0  reason: not valid java name */
        public static final void m40078bind$lambda1$lambda0(SelectPosAdapter selectPosAdapter, SelectPosType selectPosType, ViewHolder viewHolder, View view) {
            Log_OC.getArray(selectPosAdapter, "this$0");
            Log_OC.getArray(selectPosType, "$posType");
            Log_OC.getArray(viewHolder, "this$1");
            InterfaceC11772q $r4 = selectPosAdapter.getClickListener();
            List $r5 = selectPosAdapter.getCurrentList();
            Log_OC.loadImage($r5, "currentList");
            int $i0 = viewHolder.getBindingAdapterPosition();
            Integer $r6 = Integer.valueOf($i0);
            $r4.invoke(selectPosType, $r5, $r6);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final SelectPosType selectPosType) {
            Log_OC.getArray(selectPosType, "posType");
            ItemPosTypeBinding $r3 = this.binding;
            final SelectPosAdapter $r2 = this.this$0;
            TextView $r4 = $r3.tvPosType;
            String $r5 = selectPosType.getName();
            $r4.setText($r5);
            TextView $r42 = $r3.tvPosDesc;
            String $r52 = selectPosType.getDesc();
            $r42.setText($r52);
            AppCompatImageView $r6 = $r3.ivPosType;
            int $i0 = selectPosType.getPosImage();
            $r6.setBackgroundResource($i0);
            boolean $z0 = selectPosType.isSelected();
            if ($z0) {
                ImageView $r62 = $r3.ivChecked;
                FrameLayout $r7 = $r3.getRoot();
                FrameLayout r12 = $r7;
                Context $r8 = r12.getContext();
                Log_OC.loadImage($r8, "root.context");
                Drawable $r9 = ContextExtKt.getKudiDrawable($r8, C0001R.C0002drawable.state_checked);
                ImageView r13 = $r62;
                r13.setBackground($r9);
                FrameLayout $r72 = $r3.cvPosType;
                FrameLayout r122 = $r72;
                r122.setBackgroundResource(C0001R.C0002drawable.selected_terminal_background);
            } else {
                ImageView $r63 = $r3.ivChecked;
                FrameLayout $r73 = $r3.getRoot();
                FrameLayout r123 = $r73;
                Context $r82 = r123.getContext();
                Log_OC.loadImage($r82, "root.context");
                Drawable $r92 = ContextExtKt.getKudiDrawable($r82, C0001R.C0002drawable.state_unchecked);
                ImageView r132 = $r63;
                r132.setBackground($r92);
                FrameLayout $r74 = $r3.cvPosType;
                FrameLayout r124 = $r74;
                r124.setBackgroundResource(C0001R.C0002drawable.unselected_terminal_background);
            }
            FrameLayout $r75 = $r3.getRoot();
            FrameLayout r125 = $r75;
            r125.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.adapter.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectPosAdapter $r22 = SelectPosAdapter.this;
                    SelectPosType $r32 = selectPosType;
                    SelectPosAdapter.ViewHolder $r43 = this;
                    SelectPosAdapter.ViewHolder.m40078bind$lambda1$lambda0($r22, $r32, $r43, view);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemPosTypeBinding getBinding() {
            ItemPosTypeBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SelectPosAdapter(kotlin.p483e0.p484c.InterfaceC11772q r3) {
        /*
            r2 = this;
            java.lang.String r0 = "clickListener"
            kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
            ai.kudi.agent.pos.ui.adapter.SelectPosAdapterKt$diffUtil$1 r1 = ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapterKt.access$getDiffUtil$p()
            r2.<init>(r1)
            r2.clickListener = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapter.<init>(kotlin.e0.c.q):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getClickListener() {
        InterfaceC11772q r1 = this.clickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        Object $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        SelectPosType $r3 = (SelectPosType) $r2;
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
        ItemPosTypeBinding $r5 = ItemPosTypeBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        ViewHolder $r2 = new ViewHolder(this, $r5);
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
