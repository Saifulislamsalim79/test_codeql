package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.databinding.ItemDropDownListBinding;
import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.register.adapter.BaseViewHolder;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IdTypesAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/IdTypesAdapter;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter;", "Lai/kudi/agent/core/domain/room_entities/IdType;", "idTypes", "", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "Companion", "IdTypesViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.IdTypesAdapter */
/* loaded from: classes.dex */
public final class IdTypesAdapter extends DynamicSearchAdapter<IdType> {
    public static final Companion Companion;
    private static InterfaceC11767l<? super IdType, C13666w> clickedListener;
    private final List<IdType> idTypes;

    /* compiled from: IdTypesAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/IdTypesAdapter$Companion;", "", "()V", "clickedListener", "Lkotlin/Function1;", "Lai/kudi/agent/core/domain/room_entities/IdType;", "", "getClickedListener", "()Lkotlin/jvm/functions/Function1;", "setClickedListener", "(Lkotlin/jvm/functions/Function1;)V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.IdTypesAdapter$Companion */
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
            InterfaceC11767l $r1 = IdTypesAdapter.clickedListener;
            return $r1;
        }

        public final void setClickedListener(InterfaceC11767l interfaceC11767l) {
            IdTypesAdapter.clickedListener = interfaceC11767l;
        }
    }

    /* compiled from: IdTypesAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/IdTypesAdapter$IdTypesViewHolder;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "binding", "Lai/kudi/agent/core/databinding/ItemDropDownListBinding;", "(Lai/kudi/agent/settings/personal/ui/IdTypesAdapter;Lai/kudi/agent/core/databinding/ItemDropDownListBinding;)V", "getBinding", "()Lai/kudi/agent/core/databinding/ItemDropDownListBinding;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.IdTypesAdapter$IdTypesViewHolder */
    /* loaded from: classes.dex */
    public final class IdTypesViewHolder extends BaseViewHolder {
        private final ItemDropDownListBinding binding;
        final /* synthetic */ IdTypesAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public IdTypesViewHolder(ai.kudi.agent.settings.personal.p027ui.IdTypesAdapter r5, ai.kudi.agent.core.databinding.ItemDropDownListBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                ai.kudi.dip.library.button.KudiTextView r1 = r6.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.IdTypesAdapter.IdTypesViewHolder.<init>(ai.kudi.agent.settings.personal.ui.IdTypesAdapter, ai.kudi.agent.core.databinding.ItemDropDownListBinding):void");
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

    public IdTypesAdapter() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdTypesAdapter(List list) {
        super(list);
        Log_OC.getArray(list, "idTypes");
        this.idTypes = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IdTypesAdapter(java.util.List r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r3 = this;
            r5 = r5 & 1
            if (r5 == 0) goto La
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = r0
            r0.<init>()
        La:
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r1 = r2
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.IdTypesAdapter.<init>(java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m40809onBindViewHolder$lambda0(IdType idType, View view) {
        Log_OC.getArray(idType, "$type");
        InterfaceC11767l $r2 = clickedListener;
        if ($r2 == null) {
            return;
        }
        $r2.invoke(idType);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.idTypes;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(BaseViewHolder baseViewHolder, int i) {
        Log_OC.getArray(baseViewHolder, "holder");
        List $r2 = this.idTypes;
        Object $r3 = $r2.get(i);
        final IdType $r4 = (IdType) $r3;
        boolean $z0 = baseViewHolder instanceof IdTypesViewHolder;
        if ($z0) {
            IdTypesViewHolder $r5 = (IdTypesViewHolder) baseViewHolder;
            ItemDropDownListBinding $r6 = $r5.getBinding();
            TextView $r7 = $r6.dropDownText;
            CharSequence $r8 = $r4.getName();
            TextView r11 = $r7;
            r11.setText($r8);
            ItemDropDownListBinding $r62 = $r5.getBinding();
            TextView $r72 = $r62.dropDownText;
            TextView r112 = $r72;
            r112.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.LibsRecyclerViewAdapter$8
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IdType $r22 = IdType.this;
                    IdTypesAdapter.m40809onBindViewHolder$lambda0($r22, view);
                }
            });
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
        IdTypesViewHolder $r2 = new IdTypesViewHolder(this, $r5);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, "idTypes");
        List $r2 = this.idTypes;
        $r2.clear();
        List $r22 = this.idTypes;
        $r22.addAll(list);
        ArrayList $r3 = getOriginalList();
        $r3.clear();
        ArrayList $r32 = getOriginalList();
        $r32.addAll(list);
        notifyDataSetChanged();
    }
}
