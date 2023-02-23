package ai.kudi.agent.transfer.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.transfer.adapter.RecentTransfersAdapter;
import ai.kudi.agent.transfer.domain.models.TransactionRecipient;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: RecentTransfersAdapter.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB:\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u001c\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R.\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/RecentTransfersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/transfer/adapter/RecentTransfersAdapter$ViewHolder;", "transferTxnListRecipient", "", "Lai/kudi/agent/transfer/domain/models/TransactionRecipient;", "onTransferItemClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transferItem", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getOnTransferItemClicked", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "newData", "Companion", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RecentTransfersAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final int VIEW_HEADER = 0;
    private static final int VIEW_TRANSACTION_LIST = 1;
    private final InterfaceC11767l<TransactionRecipient, C13666w> onTransferItemClicked;
    private List<TransactionRecipient> transferTxnListRecipient;

    /* compiled from: RecentTransfersAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/RecentTransfersAdapter$Companion;", "", "()V", "VIEW_HEADER", "", "VIEW_TRANSACTION_LIST", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: RecentTransfersAdapter.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/RecentTransfersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "root", "Landroid/view/View;", "(Lai/kudi/agent/transfer/adapter/RecentTransfersAdapter;Landroid/view/View;)V", "accountNameField", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "bankDetailsField", "header", "indicator", "getRoot", "()Landroid/view/View;", "bindTransaction", "", "item", "Lai/kudi/agent/transfer/domain/models/TransactionRecipient;", "viewType", "", "getCurrentItem", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final TextView accountNameField;
        private final TextView bankDetailsField;
        private final TextView header;
        private final View indicator;
        private final View root;
        final /* synthetic */ RecentTransfersAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ViewHolder(RecentTransfersAdapter recentTransfersAdapter, View view) {
            super(view);
            Log_OC.getArray(recentTransfersAdapter, "this$0");
            Log_OC.getArray(view, "root");
            this.this$0 = recentTransfersAdapter;
            this.root = view;
            View $r2 = this.itemView;
            TextView $r3 = (TextView) $r2.findViewById(C0001R.C0003id.accountName);
            this.accountNameField = $r3;
            View $r22 = this.itemView;
            TextView $r32 = (TextView) $r22.findViewById(C0001R.C0003id.bankDetails);
            this.bankDetailsField = $r32;
            View $r23 = this.itemView;
            this.indicator = $r23.findViewById(C0001R.C0003id.side_image);
            View $r24 = this.itemView;
            TextView $r33 = (TextView) $r24.findViewById(C0001R.C0003id.header);
            this.header = $r33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bindTransaction$lambda-0  reason: not valid java name */
        public static final void m41311bindTransaction$lambda0(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindTransaction$lambda-1  reason: not valid java name */
        public static final void m41312bindTransaction$lambda1(RecentTransfersAdapter recentTransfersAdapter, TransactionRecipient transactionRecipient, View view) {
            Log_OC.getArray(recentTransfersAdapter, "this$0");
            Log_OC.getArray(transactionRecipient, "$item");
            InterfaceC11767l $r1 = recentTransfersAdapter.getOnTransferItemClicked();
            if ($r1 == null) {
                return;
            }
            $r1.invoke(transactionRecipient);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bindTransaction(final TransactionRecipient transactionRecipient, int i) {
            Log_OC.getArray(transactionRecipient, "item");
            if (i == 0) {
                TextView $r5 = this.header;
                String $r2 = transactionRecipient.getAccountName();
                $r5.setText($r2);
                TextView $r52 = this.header;
                Log_OC.loadImage($r52, "header");
                ViewExtKt.show($r52);
                View $r6 = this.indicator;
                Log_OC.loadImage($r6, "indicator");
                ViewExtKt.hide$default($r6, false, 1, null);
                TextView $r53 = this.bankDetailsField;
                Log_OC.loadImage($r53, "bankDetailsField");
                ViewExtKt.hide$default($r53, false, 1, null);
                TextView $r54 = this.accountNameField;
                Log_OC.loadImage($r54, "accountNameField");
                ViewExtKt.hide$default($r54, false, 1, null);
                View $r62 = this.root;
                View$OnClickListenerC0651c $r11 = View$OnClickListenerC0651c.f1783c;
                $r62.setOnClickListener($r11);
            } else if (i != 1) {
            } else {
                String $r22 = transactionRecipient.getAccountName();
                String $r3 = transactionRecipient.getAccountNumber();
                String $r4 = transactionRecipient.getBank();
                TextView $r55 = this.header;
                Log_OC.loadImage($r55, "header");
                ViewExtKt.hide$default($r55, false, 1, null);
                TextView $r56 = this.accountNameField;
                $r56.setText($r22);
                TextView $r57 = this.bankDetailsField;
                Context $r7 = this.root.getContext();
                Object[] $r8 = {$r3, $r4};
                String $r23 = $r7.getString(C0001R.string.bank_details, $r8);
                Log_OC.loadImage($r23, "root.context.getString(R.string.bank_details,\n                                                                   accountNumber,\n                                                                   bankName)");
                $r57.setText(StringExtKt.getCapitalizeAllWords($r23));
                View $r63 = this.indicator;
                Log_OC.loadImage($r63, "indicator");
                ViewExtKt.show($r63);
                TextView $r58 = this.bankDetailsField;
                Log_OC.loadImage($r58, "bankDetailsField");
                ViewExtKt.show($r58);
                TextView $r59 = this.accountNameField;
                Log_OC.loadImage($r59, "accountNameField");
                ViewExtKt.show($r59);
                View $r64 = this.root;
                final RecentTransfersAdapter $r9 = this.this$0;
                $r64.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.adapter.b
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RecentTransfersAdapter $r24 = RecentTransfersAdapter.this;
                        TransactionRecipient $r32 = transactionRecipient;
                        RecentTransfersAdapter.ViewHolder.m41312bindTransaction$lambda1($r24, $r32, view);
                    }
                });
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionRecipient getCurrentItem() {
            RecentTransfersAdapter $r1 = this.this$0;
            List $r2 = $r1.transferTxnListRecipient;
            int $i0 = getAdapterPosition();
            Object $r3 = $r2.get($i0);
            TransactionRecipient $r4 = (TransactionRecipient) $r3;
            return $r4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final View getRoot() {
            View r1 = this.root;
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

    public RecentTransfersAdapter(List list, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(list, "transferTxnListRecipient");
        this.transferTxnListRecipient = list;
        this.onTransferItemClicked = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RecentTransfersAdapter(java.util.List r1, kotlin.p483e0.p484c.InterfaceC11767l r2, int r3, kotlin.p483e0.p485d.DBUtils$1 r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L8
            java.util.List r1 = kotlin.p557z.C13722p.m3941e()
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.adapter.RecentTransfersAdapter.<init>(java.util.List, kotlin.e0.c.l, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.transferTxnListRecipient;
        int $i0 = $r1.size();
        return $i0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnTransferItemClicked() {
        InterfaceC11767l r1 = this.onTransferItemClicked;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        TransactionRecipient $r2 = viewHolder.getCurrentItem();
        int $i0 = getItemViewType(i);
        viewHolder.bindTransaction($r2, $i0);
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
        View $r5 = $r4.inflate(C0001R.C0004layout.layout_recent_transfers_list_item, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context)\n                                  .inflate(R.layout.layout_recent_transfers_list_item, parent,\n                                           false)");
        ViewHolder $r2 = new ViewHolder(this, $r5);
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

    public final void swapData(List list) {
        Log_OC.getArray(list, "newData");
        this.transferTxnListRecipient = list;
        notifyDataSetChanged();
    }
}
