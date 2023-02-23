package ai.kudi.agent.transactionhistory.p031ui.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionsAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: TransactionsAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001a\u001b\u001c\u001dB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$ViewHolder;", "onItemClicked", "Lkotlin/Function1;", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TransactionDateViewHolder", "TransactionItemViewHolder", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsAdapter */
/* loaded from: classes.dex */
public final class TransactionsAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final int VIEW_DATE = 0;
    private static final int VIEW_TRANSACTION = 1;
    private List<? extends TransactionItemUiModel> items;
    private final InterfaceC11767l<TransactionItemUiModel.Transaction, C13666w> onItemClicked;

    /* compiled from: TransactionsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$Companion;", "", "()V", "VIEW_DATE", "", "VIEW_TRANSACTION", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: TransactionsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$TransactionDateViewHolder;", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$ViewHolder;", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;", "itemView", "Landroid/view/View;", "(Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;Landroid/view/View;)V", "dateTextView", "Landroid/widget/TextView;", "getDateTextView", "()Landroid/widget/TextView;", "setDateTextView", "(Landroid/widget/TextView;)V", "bindData", "", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsAdapter$TransactionDateViewHolder */
    /* loaded from: classes.dex */
    public final class TransactionDateViewHolder extends ViewHolder {
        private TextView dateTextView;
        final /* synthetic */ TransactionsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public TransactionDateViewHolder(TransactionsAdapter transactionsAdapter, View view) {
            super(transactionsAdapter, view);
            Log_OC.getArray(transactionsAdapter, "this$0");
            Log_OC.getArray(view, "itemView");
            this.this$0 = transactionsAdapter;
            View $r2 = getContainer().findViewById(C0001R.C0003id.dateTextView);
            Log_OC.loadImage($r2, "container.findViewById(R.id.dateTextView)");
            TextView $r3 = (TextView) $r2;
            this.dateTextView = $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionsAdapter.ViewHolder
        public void bindData(TransactionItemUiModel transactionItemUiModel) {
            Log_OC.getArray(transactionItemUiModel, "transaction");
            TextView $r3 = this.dateTextView;
            TransactionItemUiModel.TransactionDate $r4 = (TransactionItemUiModel.TransactionDate) transactionItemUiModel;
            String $r1 = $r4.getDateText();
            $r3.setText($r1);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getDateTextView() {
            TextView r1 = this.dateTextView;
            return r1;
        }

        public final void setDateTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.dateTextView = textView;
        }
    }

    /* compiled from: TransactionsAdapter.kt */
    @Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$TransactionItemViewHolder;", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$ViewHolder;", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;", "itemView", "Landroid/view/View;", "(Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "balanceTextView", "icon", "Landroid/widget/ImageView;", "timeTextView", "typeTextView", "bindData", "", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsAdapter$TransactionItemViewHolder */
    /* loaded from: classes.dex */
    public final class TransactionItemViewHolder extends ViewHolder {
        private final TextView amountTextView;
        private final TextView balanceTextView;
        private final ImageView icon;
        final /* synthetic */ TransactionsAdapter this$0;
        private final TextView timeTextView;
        private final TextView typeTextView;

        /* compiled from: TransactionsAdapter.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsAdapter$TransactionItemViewHolder$WhenMappings */
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            static {
                TransactionKind[] $r0 = TransactionKind.values();
                int $i0 = $r0.length;
                int[] $r1 = new int[$i0];
                TransactionKind $r2 = TransactionKind.DEBIT;
                int $i02 = $r2.ordinal();
                $r1[$i02] = 1;
                TransactionKind $r22 = TransactionKind.CREDIT;
                int $i03 = $r22.ordinal();
                $r1[$i03] = 2;
                $EnumSwitchMapping$0 = $r1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public TransactionItemViewHolder(TransactionsAdapter transactionsAdapter, View view) {
            super(transactionsAdapter, view);
            Log_OC.getArray(transactionsAdapter, "this$0");
            Log_OC.getArray(view, "itemView");
            this.this$0 = transactionsAdapter;
            View $r2 = getContainer().findViewById(C0001R.C0003id.transaction_icon);
            Log_OC.loadImage($r2, "container.findViewById(R.id.transaction_icon)");
            ImageView $r3 = (ImageView) $r2;
            this.icon = $r3;
            View $r22 = getContainer().findViewById(C0001R.C0003id.transaction_type_text);
            Log_OC.loadImage($r22, "container.findViewById(R.id.transaction_type_text)");
            TextView $r4 = (TextView) $r22;
            this.typeTextView = $r4;
            View $r23 = getContainer().findViewById(C0001R.C0003id.amount_text);
            Log_OC.loadImage($r23, "container.findViewById(R.id.amount_text)");
            TextView $r42 = (TextView) $r23;
            this.amountTextView = $r42;
            View $r24 = getContainer().findViewById(C0001R.C0003id.time_text);
            Log_OC.loadImage($r24, "container.findViewById(R.id.time_text)");
            TextView $r43 = (TextView) $r24;
            this.timeTextView = $r43;
            View $r25 = getContainer().findViewById(C0001R.C0003id.balance_text);
            Log_OC.loadImage($r25, "container.findViewById(R.id.balance_text)");
            TextView $r44 = (TextView) $r25;
            this.balanceTextView = $r44;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-0  reason: not valid java name */
        public static final void m41062bindData$lambda0(TransactionsAdapter transactionsAdapter, TransactionItemUiModel transactionItemUiModel, View view) {
            Log_OC.getArray(transactionsAdapter, "this$0");
            Log_OC.getArray(transactionItemUiModel, "$transaction");
            InterfaceC11767l $r1 = transactionsAdapter.onItemClicked;
            $r1.invoke(transactionItemUiModel);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionsAdapter.ViewHolder
        public void bindData(final TransactionItemUiModel transactionItemUiModel) {
            int $i0;
            Log_OC.getArray(transactionItemUiModel, "transaction");
            View $r2 = this.itemView;
            Context $r3 = $r2.getContext();
            TransactionItemUiModel.Transaction $r4 = (TransactionItemUiModel.Transaction) transactionItemUiModel;
            TransactionType $r5 = $r4.getTransactionType();
            int $i02 = $r5.getIconRes();
            TransactionType $r52 = $r4.getTransactionType();
            int $i1 = $r52.getLabelRes();
            ImageView $r6 = this.icon;
            $r6.setImageResource($i02);
            TextView $r7 = this.typeTextView;
            View $r22 = this.itemView;
            Context $r8 = $r22.getContext();
            String $r9 = $r8.getString($i1);
            $r7.setText($r9);
            TextView $r72 = this.timeTextView;
            String $r92 = $r4.getTime();
            $r72.setText($r92);
            TextView $r73 = this.balanceTextView;
            C11780a0 c11780a0 = C11780a0.f26475a;
            String $r93 = $r3.getString(C0001R.string.balance);
            String $r94 = $r4.getAccountBalance();
            Object[] $r11 = {$r93, $r94};
            String $r95 = String.format("%s: %s", Arrays.copyOf($r11, 2));
            Log_OC.loadImage($r95, "java.lang.String.format(format, *args)");
            $r73.setText($r95);
            TransactionKind $r12 = $r4.getKind();
            if ($r12 == null) {
                $i0 = -1;
            } else {
                int[] $r13 = WhenMappings.$EnumSwitchMapping$0;
                int $i03 = $r12.ordinal();
                $i0 = $r13[$i03];
            }
            String $r96 = $i0 != 1 ? $i0 != 2 ? "" : "+" : "-";
            TextView $r74 = this.amountTextView;
            C11780a0 $r10 = C11780a0.f26475a;
            String $r97 = $r4.getAmount();
            Object[] $r112 = {$r96, $r97};
            String $r98 = String.format("%s %s", Arrays.copyOf($r112, 2));
            Log_OC.loadImage($r98, "java.lang.String.format(format, *args)");
            $r74.setText($r98);
            View $r23 = this.itemView;
            final TransactionsAdapter $r14 = this.this$0;
            $r23.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.adapter.TestActivity$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionsAdapter $r24 = TransactionsAdapter.this;
                    TransactionItemUiModel $r32 = transactionItemUiModel;
                    TransactionsAdapter.TransactionItemViewHolder.m41062bindData$lambda0($r24, $r32, view);
                }
            });
        }
    }

    /* compiled from: TransactionsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindData", "", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ TransactionsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(TransactionsAdapter transactionsAdapter, View view) {
            super(view);
            Log_OC.getArray(transactionsAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = transactionsAdapter;
            this.container = view;
        }

        public abstract void bindData(TransactionItemUiModel transactionItemUiModel);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsAdapter(InterfaceC11767l interfaceC11767l) {
        List $r1;
        Log_OC.getArray(interfaceC11767l, "onItemClicked");
        this.onItemClicked = interfaceC11767l;
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
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        List $r1 = this.items;
        Object $r2 = $r1.get(i);
        boolean $z0 = $r2 instanceof TransactionItemUiModel.TransactionDate;
        return !$z0 ? 1 : 0;
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
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.items;
        Object $r2 = $r3.get(i);
        TransactionItemUiModel $r4 = (TransactionItemUiModel) $r2;
        viewHolder.bindData($r4);
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
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        if (i == 1) {
            View $r5 = $r3.inflate(C0001R.C0004layout.list_item_transaction_history, viewGroup, false);
            Log_OC.loadImage($r5, "inflater.inflate(R.layout.list_item_transaction_history, parent, false)");
            TransactionItemViewHolder $r4 = new TransactionItemViewHolder(this, $r5);
            return $r4;
        }
        View $r52 = $r3.inflate(C0001R.C0004layout.transaction_item_header, viewGroup, false);
        Log_OC.loadImage($r52, "inflater.inflate(R.layout.transaction_item_header, parent, false)");
        TransactionDateViewHolder $r6 = new TransactionDateViewHolder(this, $r52);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setItems(List list) {
        Log_OC.getArray(list, "value");
        this.items = list;
        notifyDataSetChanged();
    }
}
