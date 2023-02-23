package ai.kudi.agent.withdraw_cash.p040ui.adapters;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.LayoutOptionBinding;
import ai.kudi.agent.withdraw_cash.utils.Option;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KudiOptionListAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$ViewHolder;", "listener", "Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$OnOptionClick;", "optionsArray", "", "Lai/kudi/agent/withdraw_cash/utils/Option;", "(Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$OnOptionClick;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "options", "OnOptionClick", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.adapters.KudiOptionListAdapter */
/* loaded from: classes.dex */
public final class KudiOptionListAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    private final OnOptionClick listener;
    private List<? extends Option> optionsArray;

    /* compiled from: KudiOptionListAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$OnOptionClick;", "", "onClick", "", "option", "Lai/kudi/agent/withdraw_cash/utils/Option;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.adapters.KudiOptionListAdapter$OnOptionClick */
    /* loaded from: classes.dex */
    public interface OnOptionClick {
        void onClick(Option option);
    }

    /* compiled from: KudiOptionListAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/LayoutOptionBinding;", "(Lai/kudi/agent/databinding/LayoutOptionBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/LayoutOptionBinding;", "bindData", "", "option", "Lai/kudi/agent/withdraw_cash/utils/Option;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.adapters.KudiOptionListAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public static final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final LayoutOptionBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(ai.kudi.agent.databinding.LayoutOptionBinding r5) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                androidx.cardview.widget.CardView r1 = r5.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter.ViewHolder.<init>(ai.kudi.agent.databinding.LayoutOptionBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bindData(Option option) {
            Log_OC.getArray(option, "option");
            LayoutOptionBinding $r2 = this.binding;
            ImageView $r3 = $r2.ivIcon;
            int $i0 = option.getIconId();
            $r3.setImageResource($i0);
            LayoutOptionBinding $r22 = this.binding;
            TextView $r4 = $r22.tvDesc;
            String $r5 = option.getDesc();
            $r4.setText($r5);
            boolean $z0 = option.isNewlyAdded();
            if ($z0) {
                LayoutOptionBinding $r23 = this.binding;
                TextView $r42 = $r23.tvBadge;
                Log_OC.loadImage($r42, "binding.tvBadge");
                ViewExtKt.show($r42);
            } else {
                LayoutOptionBinding $r24 = this.binding;
                TextView $r43 = $r24.tvBadge;
                Log_OC.loadImage($r43, "binding.tvBadge");
                ViewExtKt.hide$default($r43, false, 1, null);
            }
            String $r52 = option.getLabel();
            boolean $z02 = Log_OC.append($r52, "KudiVoucherTM");
            if (!$z02) {
                LayoutOptionBinding $r25 = this.binding;
                TextView $r44 = $r25.tvLabel;
                String $r53 = option.getLabel();
                $r44.setText($r53);
                return;
            }
            LayoutOptionBinding $r26 = this.binding;
            TextView $r45 = $r26.tvLabel;
            String $r54 = option.getLabel();
            SpannableStringBuilder $r6 = StringExtKt.superscript($r54, "TM");
            $r45.setText($r6);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final LayoutOptionBinding getBinding() {
            LayoutOptionBinding r1 = this.binding;
            return r1;
        }
    }

    public KudiOptionListAdapter(OnOptionClick onOptionClick, List list) {
        Log_OC.getArray(onOptionClick, "listener");
        Log_OC.getArray(list, "optionsArray");
        this.listener = onOptionClick;
        this.optionsArray = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ KudiOptionListAdapter(ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter.OnOptionClick r1, java.util.List r2, int r3, kotlin.p483e0.p485d.DBUtils$1 r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            java.util.List r2 = kotlin.p557z.C13722p.m3941e()
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter.<init>(ai.kudi.agent.withdraw_cash.ui.adapters.KudiOptionListAdapter$OnOptionClick, java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m41805onBindViewHolder$lambda0(KudiOptionListAdapter kudiOptionListAdapter, Option option, View view) {
        Log_OC.getArray(kudiOptionListAdapter, "this$0");
        Log_OC.getArray(option, "$currentOption");
        OnOptionClick $r3 = kudiOptionListAdapter.listener;
        $r3.onClick(option);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.optionsArray;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r2 = this.optionsArray;
        int $i0 = viewHolder.getAdapterPosition();
        Object $r3 = $r2.get($i0);
        final Option $r4 = (Option) $r3;
        viewHolder.bindData($r4);
        LayoutOptionBinding $r5 = viewHolder.getBinding();
        FrameLayout $r6 = $r5.getRoot();
        FrameLayout r9 = $r6;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.adapters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KudiOptionListAdapter $r22 = KudiOptionListAdapter.this;
                Option $r32 = $r4;
                KudiOptionListAdapter.m41805onBindViewHolder$lambda0($r22, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder $r2 = viewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutOptionBinding $r5 = LayoutOptionBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        ViewHolder $r2 = new ViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void swapData(List list) {
        Log_OC.getArray(list, "options");
        boolean $z0 = list.isEmpty();
        if ($z0) {
            return;
        }
        this.optionsArray = list;
        notifyDataSetChanged();
    }
}
