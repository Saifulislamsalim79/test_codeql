package ai.kudi.agent.register.adapter;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.ItemDropDownListBinding;
import ai.kudi.agent.register.data.models.DropDownModel;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: DropDownListAdapterUpdated.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/register/adapter/DropDownListAdapterUpdated;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter;", "Lai/kudi/agent/register/data/models/DropDownModel;", "dropDownList", "", "showIcon", "", "(Ljava/util/List;Z)V", "layoutResourceId", "", "getLayoutResourceId", "()I", "getItemCount", "onBindViewHolder", "", "holder", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DropDownViewHolder", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DropDownListAdapterUpdated extends DynamicSearchAdapter<DropDownModel> {
    public static final Companion Companion;
    private static InterfaceC11767l<? super DropDownModel, C13666w> clickedListener;
    private List<DropDownModel> dropDownList;
    private final boolean showIcon;

    /* compiled from: DropDownListAdapterUpdated.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/register/adapter/DropDownListAdapterUpdated$Companion;", "", "()V", "clickedListener", "Lkotlin/Function1;", "Lai/kudi/agent/register/data/models/DropDownModel;", "", "getClickedListener", "()Lkotlin/jvm/functions/Function1;", "setClickedListener", "(Lkotlin/jvm/functions/Function1;)V", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final InterfaceC11767l getClickedListener() {
            InterfaceC11767l $r1 = DropDownListAdapterUpdated.clickedListener;
            return $r1;
        }

        public final void setClickedListener(InterfaceC11767l interfaceC11767l) {
            DropDownListAdapterUpdated.clickedListener = interfaceC11767l;
        }
    }

    /* compiled from: DropDownListAdapterUpdated.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/register/adapter/DropDownListAdapterUpdated$DropDownViewHolder;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "binding", "Lai/kudi/agent/core/databinding/ItemDropDownListBinding;", "(Lai/kudi/agent/core/databinding/ItemDropDownListBinding;)V", "getBinding", "()Lai/kudi/agent/core/databinding/ItemDropDownListBinding;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DropDownViewHolder extends BaseViewHolder {
        private final ItemDropDownListBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DropDownViewHolder(ai.kudi.agent.core.databinding.ItemDropDownListBinding r5) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                ai.kudi.dip.library.button.KudiTextView r1 = r5.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.adapter.DropDownListAdapterUpdated.DropDownViewHolder.<init>(ai.kudi.agent.core.databinding.ItemDropDownListBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemDropDownListBinding getBinding() {
            ItemDropDownListBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownListAdapterUpdated(List list, boolean z) {
        super(list);
        Log_OC.getArray(list, "dropDownList");
        this.dropDownList = list;
        this.showIcon = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DropDownListAdapterUpdated(java.util.List r1, boolean r2, int r3, kotlin.p483e0.p485d.DBUtils$1 r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.adapter.DropDownListAdapterUpdated.<init>(java.util.List, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m40305onBindViewHolder$lambda0(DropDownListAdapterUpdated dropDownListAdapterUpdated, int i, View view) {
        Log_OC.getArray(dropDownListAdapterUpdated, "this$0");
        InterfaceC11767l $r3 = clickedListener;
        if ($r3 == null) {
            return;
        }
        List $r4 = dropDownListAdapterUpdated.dropDownList;
        $r3.invoke($r4.get(i));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.dropDownList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter
    protected int getLayoutResourceId() {
        int i0 = C0038R.C0041layout.item_drop_down_list;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(BaseViewHolder baseViewHolder, final int i) {
        Log_OC.getArray(baseViewHolder, "holder");
        DropDownViewHolder $r2 = (DropDownViewHolder) baseViewHolder;
        ItemDropDownListBinding $r3 = $r2.getBinding();
        TextView $r4 = $r3.dropDownText;
        Log_OC.loadImage($r4, "holder as DropDownViewHolder).binding.dropDownText");
        List $r5 = this.dropDownList;
        Object $r6 = $r5.get(i);
        DropDownModel $r7 = (DropDownModel) $r6;
        CharSequence $r8 = $r7.getData();
        TextView r14 = $r4;
        r14.setText($r8);
        TextView r142 = $r4;
        r142.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.adapter.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DropDownListAdapterUpdated $r22 = DropDownListAdapterUpdated.this;
                int $i0 = i;
                DropDownListAdapterUpdated.m40305onBindViewHolder$lambda0($r22, $i0, view);
            }
        });
        boolean $z0 = this.showIcon;
        if ($z0) {
            int $i0 = C0038R.C0039drawable.ic_check_blue;
            $r4.setCompoundDrawablesRelativeWithIntrinsicBounds($i0, 0, 0, 0);
            View $r10 = baseViewHolder.itemView;
            Context $r11 = $r10.getContext();
            Resources $r12 = $r11.getResources();
            int $i02 = C0038R.dimen.dimen_10dp;
            float $f0 = $r12.getDimension($i02);
            int $i03 = (int) $f0;
            TextView r143 = $r4;
            r143.setCompoundDrawablePadding($i03);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        BaseViewHolder $r2 = baseViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ItemDropDownListBinding $r5 = ItemDropDownListBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        DropDownViewHolder $r2 = new DropDownViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
