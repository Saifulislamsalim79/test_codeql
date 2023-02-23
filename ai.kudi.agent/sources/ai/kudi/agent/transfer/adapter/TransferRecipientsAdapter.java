package ai.kudi.agent.transfer.adapter;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.databinding.ListItemMultipleTransferRecipientsBinding;
import ai.kudi.agent.transfer.adapter.TransferRecipientsAdapter;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: TransferRecipientsAdapter.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u001c\u0010\u0011\u001a\u00020\u00072\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/TransferRecipientsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/transfer/adapter/TransferRecipientsAdapter$SubscriptionPlanViewHolder;", "onEditClicked", "Lkotlin/Function2;", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SubscriptionPlanViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferRecipientsAdapter extends RecyclerView.AbstractC1623h<SubscriptionPlanViewHolder> {
    private List<TransferToBankPayload> items;
    private final InterfaceC11771p<TransferToBankPayload, Integer, C13666w> onEditClicked;

    /* compiled from: TransferRecipientsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/TransferRecipientsAdapter$SubscriptionPlanViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/ListItemMultipleTransferRecipientsBinding;", "(Lai/kudi/agent/transfer/adapter/TransferRecipientsAdapter;Lai/kudi/agent/databinding/ListItemMultipleTransferRecipientsBinding;)V", "bindData", "", "item", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "position", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class SubscriptionPlanViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ListItemMultipleTransferRecipientsBinding binding;
        final /* synthetic */ TransferRecipientsAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SubscriptionPlanViewHolder(ai.kudi.agent.transfer.adapter.TransferRecipientsAdapter r5, ai.kudi.agent.databinding.ListItemMultipleTransferRecipientsBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.adapter.TransferRecipientsAdapter.SubscriptionPlanViewHolder.<init>(ai.kudi.agent.transfer.adapter.TransferRecipientsAdapter, ai.kudi.agent.databinding.ListItemMultipleTransferRecipientsBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-0  reason: not valid java name */
        public static final void m41313bindData$lambda0(TransferRecipientsAdapter transferRecipientsAdapter, TransferToBankPayload transferToBankPayload, int i, View view) {
            Log_OC.getArray(transferRecipientsAdapter, "this$0");
            Log_OC.getArray(transferToBankPayload, "$item");
            InterfaceC11771p $r3 = transferRecipientsAdapter.onEditClicked;
            Integer $r4 = Integer.valueOf(i);
            $r3.invoke(transferToBankPayload, $r4);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bindData(final TransferToBankPayload transferToBankPayload, final int i) {
            Log_OC.getArray(transferToBankPayload, "item");
            ListItemMultipleTransferRecipientsBinding $r2 = this.binding;
            TextView $r3 = $r2.accountNameText;
            String $r4 = transferToBankPayload.getAccountName();
            $r3.setText($r4);
            ListItemMultipleTransferRecipientsBinding $r22 = this.binding;
            TextView $r32 = $r22.bankDetailText;
            C11780a0 c11780a0 = C11780a0.f26475a;
            String $r42 = transferToBankPayload.getAccountNumber();
            String $r43 = transferToBankPayload.getBankName();
            Object[] $r6 = {$r42, $r43};
            String $r44 = String.format("%s - %s", Arrays.copyOf($r6, 2));
            Log_OC.loadImage($r44, "java.lang.String.format(format, *args)");
            $r32.setText($r44);
            ListItemMultipleTransferRecipientsBinding $r23 = this.binding;
            TextView $r33 = $r23.paymentDetailText;
            C11780a0 $r5 = C11780a0.f26475a;
            Integer $r7 = transferToBankPayload.getAmount();
            String $r45 = String.valueOf($r7);
            String $r46 = transferToBankPayload.getReason();
            Object[] $r62 = {StringExtKt.getFormatAmount($r45), $r46};
            String $r47 = String.format("%s | %s", Arrays.copyOf($r62, 2));
            Log_OC.loadImage($r47, "java.lang.String.format(format, *args)");
            $r33.setText($r47);
            ListItemMultipleTransferRecipientsBinding $r24 = this.binding;
            Button $r8 = $r24.editButton;
            final TransferRecipientsAdapter $r9 = this.this$0;
            Button r12 = $r8;
            r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.adapter.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferRecipientsAdapter $r25 = TransferRecipientsAdapter.this;
                    TransferToBankPayload $r34 = transferToBankPayload;
                    int $i0 = i;
                    TransferRecipientsAdapter.SubscriptionPlanViewHolder.m41313bindData$lambda0($r25, $r34, $i0, view);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferRecipientsAdapter(InterfaceC11771p interfaceC11771p) {
        List $r1;
        Log_OC.getArray(interfaceC11771p, "onEditClicked");
        this.onEditClicked = interfaceC11771p;
        $r1 = C13726r.m3891e();
        this.items = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getItems() {
        List r1 = this.items;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(SubscriptionPlanViewHolder subscriptionPlanViewHolder, int i) {
        Log_OC.getArray(subscriptionPlanViewHolder, "holder");
        List $r3 = this.items;
        Object $r2 = $r3.get(i);
        TransferToBankPayload $r4 = (TransferToBankPayload) $r2;
        subscriptionPlanViewHolder.bindData($r4, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(SubscriptionPlanViewHolder subscriptionPlanViewHolder, int i) {
        SubscriptionPlanViewHolder $r2 = subscriptionPlanViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public SubscriptionPlanViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ListItemMultipleTransferRecipientsBinding $r5 = ListItemMultipleTransferRecipientsBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        SubscriptionPlanViewHolder $r2 = new SubscriptionPlanViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ SubscriptionPlanViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SubscriptionPlanViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setItems(List list) {
        Log_OC.getArray(list, "value");
        this.items = list;
        notifyDataSetChanged();
    }
}
