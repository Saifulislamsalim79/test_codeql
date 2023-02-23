package ai.kudi.agent.withdraw_cash.p040ui.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.withdraw_cash.domain.model.UssdWithdrawalVoucherModel;
import ai.kudi.agent.withdraw_cash.p040ui.adapters.VoucherSummaryAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: VoucherSummaryAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter$VoucherSummaryViewHolder;", "listener", "Lai/kudi/agent/withdraw_cash/ui/adapters/OnVoucherSummaryItemClick;", "(Lai/kudi/agent/withdraw_cash/ui/adapters/OnVoucherSummaryItemClick;)V", "voucherSummaryItemList", "", "Lai/kudi/agent/withdraw_cash/domain/model/UssdWithdrawalVoucherModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapVoucherItem", "newItemList", "ViewHolder", "VoucherSummaryViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.adapters.VoucherSummaryAdapter */
/* loaded from: classes.dex */
public final class VoucherSummaryAdapter extends RecyclerView.AbstractC1623h<VoucherSummaryViewHolder> {
    private final OnVoucherSummaryItemClick listener;
    private List<UssdWithdrawalVoucherModel> voucherSummaryItemList;

    /* compiled from: VoucherSummaryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J)\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bind", "", "item", "Lai/kudi/agent/withdraw_cash/domain/model/UssdWithdrawalVoucherModel;", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.adapters.VoucherSummaryAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ VoucherSummaryAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(VoucherSummaryAdapter voucherSummaryAdapter, View view) {
            super(view);
            Log_OC.getArray(voucherSummaryAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = voucherSummaryAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m41807setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bind(UssdWithdrawalVoucherModel ussdWithdrawalVoucherModel);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final View getContainer() {
            View r1 = this.container;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setOnClickListener(final InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "listener");
            View $r3 = this.container;
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.adapters.FloatingActionButton$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    VoucherSummaryAdapter.ViewHolder.m41807setOnClickListener$lambda0($r2, view);
                }
            });
        }
    }

    /* compiled from: VoucherSummaryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter$VoucherSummaryViewHolder;", "Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter$ViewHolder;", "Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/withdraw_cash/ui/adapters/VoucherSummaryAdapter;Landroid/view/View;)V", "tvEdit", "Landroid/widget/TextView;", "getTvEdit", "()Landroid/widget/TextView;", "tvLabel", "tvValue", "bind", "", "item", "Lai/kudi/agent/withdraw_cash/domain/model/UssdWithdrawalVoucherModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.adapters.VoucherSummaryAdapter$VoucherSummaryViewHolder */
    /* loaded from: classes.dex */
    public final class VoucherSummaryViewHolder extends ViewHolder {
        final /* synthetic */ VoucherSummaryAdapter this$0;
        private final TextView tvEdit;
        private final TextView tvLabel;
        private final TextView tvValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public VoucherSummaryViewHolder(VoucherSummaryAdapter voucherSummaryAdapter, View view) {
            super(voucherSummaryAdapter, view);
            Log_OC.getArray(voucherSummaryAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = voucherSummaryAdapter;
            View $r3 = view.findViewById(C0001R.C0003id.tv_label);
            Log_OC.loadImage($r3, "container.findViewById(R.id.tv_label)");
            TextView $r4 = (TextView) $r3;
            this.tvLabel = $r4;
            View $r32 = view.findViewById(C0001R.C0003id.tv_value);
            Log_OC.loadImage($r32, "container.findViewById(R.id.tv_value)");
            TextView $r42 = (TextView) $r32;
            this.tvValue = $r42;
            View $r2 = view.findViewById(C0001R.C0003id.tv_edit);
            Log_OC.loadImage($r2, "container.findViewById(R.id.tv_edit)");
            TextView $r43 = (TextView) $r2;
            this.tvEdit = $r43;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.withdraw_cash.p040ui.adapters.VoucherSummaryAdapter.ViewHolder
        public void bind(UssdWithdrawalVoucherModel ussdWithdrawalVoucherModel) {
            Log_OC.getArray(ussdWithdrawalVoucherModel, "item");
            TextView $r2 = this.tvLabel;
            String $r3 = ussdWithdrawalVoucherModel.getLabel();
            $r2.setText($r3);
            TextView $r22 = this.tvValue;
            String $r32 = ussdWithdrawalVoucherModel.getValue();
            $r22.setText($r32);
            TextView $r23 = this.tvEdit;
            boolean $z0 = ussdWithdrawalVoucherModel.isEditable();
            byte $b0 = $z0 ? (byte) 0 : (byte) 4;
            $r23.setVisibility($b0);
            TextView $r24 = this.tvEdit;
            ViewExtKt.addClickEffect$default($r24, 0, 0, 3, null);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getTvEdit() {
            TextView r1 = this.tvEdit;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VoucherSummaryAdapter(OnVoucherSummaryItemClick onVoucherSummaryItemClick) {
        List $r1;
        this.listener = onVoucherSummaryItemClick;
        $r1 = C13726r.m3891e();
        this.voucherSummaryItemList = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m41806onBindViewHolder$lambda0(VoucherSummaryAdapter voucherSummaryAdapter, UssdWithdrawalVoucherModel ussdWithdrawalVoucherModel, View view) {
        Log_OC.getArray(voucherSummaryAdapter, "this$0");
        Log_OC.getArray(ussdWithdrawalVoucherModel, "$currentItem");
        OnVoucherSummaryItemClick $r3 = voucherSummaryAdapter.listener;
        if ($r3 == null) {
            return;
        }
        $r3.onClick(ussdWithdrawalVoucherModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.voucherSummaryItemList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(VoucherSummaryViewHolder voucherSummaryViewHolder, int i) {
        Log_OC.getArray(voucherSummaryViewHolder, "holder");
        List $r2 = this.voucherSummaryItemList;
        int $i0 = voucherSummaryViewHolder.getAdapterPosition();
        Object $r3 = $r2.get($i0);
        final UssdWithdrawalVoucherModel $r4 = (UssdWithdrawalVoucherModel) $r3;
        voucherSummaryViewHolder.bind($r4);
        TextView $r5 = voucherSummaryViewHolder.getTvEdit();
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.adapters.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoucherSummaryAdapter $r22 = VoucherSummaryAdapter.this;
                UssdWithdrawalVoucherModel $r32 = $r4;
                VoucherSummaryAdapter.m41806onBindViewHolder$lambda0($r22, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(VoucherSummaryViewHolder voucherSummaryViewHolder, int i) {
        VoucherSummaryViewHolder $r2 = voucherSummaryViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public VoucherSummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        View $r5 = $r4.inflate(C0001R.C0004layout.layout_voucher_item, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context)\n                        .inflate(R.layout.layout_voucher_item, parent, false)");
        VoucherSummaryViewHolder $r2 = new VoucherSummaryViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ VoucherSummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        VoucherSummaryViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void swapVoucherItem(List list) {
        Log_OC.getArray(list, "newItemList");
        boolean $z0 = list.isEmpty();
        if ($z0) {
            return;
        }
        this.voucherSummaryItemList = list;
        notifyDataSetChanged();
    }
}
