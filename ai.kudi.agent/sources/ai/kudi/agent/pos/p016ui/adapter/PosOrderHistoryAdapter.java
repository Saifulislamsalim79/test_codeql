package ai.kudi.agent.pos.p016ui.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.pos.p016ui.adapter.PosOrderHistoryAdapter;
import ai.kudi.agent.pos.p016ui.model.PosOrderUiModel;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
/* compiled from: PosOrderHistoryAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001a\u001b\u001c\u001dB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$ViewHolder;", "onItemClicked", "Lkotlin/Function1;", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel$Order;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TransactionDateViewHolder", "TransactionItemViewHolder", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.adapter.PosOrderHistoryAdapter */
/* loaded from: classes.dex */
public final class PosOrderHistoryAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final int VIEW_DATE = 0;
    private static final int VIEW_TRANSACTION = 1;
    private List<? extends PosOrderUiModel> items;
    private final InterfaceC11767l<PosOrderUiModel.Order, C13666w> onItemClicked;

    /* compiled from: PosOrderHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$Companion;", "", "()V", "VIEW_DATE", "", "VIEW_TRANSACTION", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.adapter.PosOrderHistoryAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: PosOrderHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$TransactionDateViewHolder;", "Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$ViewHolder;", "Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;", "itemView", "Landroid/view/View;", "(Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;Landroid/view/View;)V", "dateTextView", "Landroid/widget/TextView;", "getDateTextView", "()Landroid/widget/TextView;", "setDateTextView", "(Landroid/widget/TextView;)V", "bindData", "", "order", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.adapter.PosOrderHistoryAdapter$TransactionDateViewHolder */
    /* loaded from: classes.dex */
    public final class TransactionDateViewHolder extends ViewHolder {
        private TextView dateTextView;
        final /* synthetic */ PosOrderHistoryAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public TransactionDateViewHolder(PosOrderHistoryAdapter posOrderHistoryAdapter, View view) {
            super(posOrderHistoryAdapter, view);
            Log_OC.getArray(posOrderHistoryAdapter, "this$0");
            Log_OC.getArray(view, "itemView");
            this.this$0 = posOrderHistoryAdapter;
            View $r2 = getContainer().findViewById(C0001R.C0003id.dateTextView);
            Log_OC.loadImage($r2, "container.findViewById(R.id.dateTextView)");
            TextView $r3 = (TextView) $r2;
            this.dateTextView = $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.pos.p016ui.adapter.PosOrderHistoryAdapter.ViewHolder
        public void bindData(PosOrderUiModel posOrderUiModel) {
            Log_OC.getArray(posOrderUiModel, "order");
            TextView $r3 = this.dateTextView;
            PosOrderUiModel.OrderDate $r4 = (PosOrderUiModel.OrderDate) posOrderUiModel;
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

    /* compiled from: PosOrderHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$TransactionItemViewHolder;", "Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$ViewHolder;", "Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;", "itemView", "Landroid/view/View;", "(Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "getAmountTextView", "()Landroid/widget/TextView;", "setAmountTextView", "(Landroid/widget/TextView;)V", "timeTextView", "getTimeTextView", "setTimeTextView", "bindData", "", "order", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.adapter.PosOrderHistoryAdapter$TransactionItemViewHolder */
    /* loaded from: classes.dex */
    public final class TransactionItemViewHolder extends ViewHolder {
        private TextView amountTextView;
        final /* synthetic */ PosOrderHistoryAdapter this$0;
        private TextView timeTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public TransactionItemViewHolder(PosOrderHistoryAdapter posOrderHistoryAdapter, View view) {
            super(posOrderHistoryAdapter, view);
            Log_OC.getArray(posOrderHistoryAdapter, "this$0");
            Log_OC.getArray(view, "itemView");
            this.this$0 = posOrderHistoryAdapter;
            View $r2 = getContainer().findViewById(C0001R.C0003id.pos_amount_text);
            Log_OC.loadImage($r2, "container.findViewById(R.id.pos_amount_text)");
            TextView $r3 = (TextView) $r2;
            this.amountTextView = $r3;
            View $r22 = getContainer().findViewById(C0001R.C0003id.pos_order_time_text);
            Log_OC.loadImage($r22, "container.findViewById(R.id.pos_order_time_text)");
            TextView $r32 = (TextView) $r22;
            this.timeTextView = $r32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-0  reason: not valid java name */
        public static final void m40077bindData$lambda0(PosOrderHistoryAdapter posOrderHistoryAdapter, PosOrderUiModel posOrderUiModel, View view) {
            Log_OC.getArray(posOrderHistoryAdapter, "this$0");
            Log_OC.getArray(posOrderUiModel, "$order");
            InterfaceC11767l $r1 = posOrderHistoryAdapter.onItemClicked;
            $r1.invoke(posOrderUiModel);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.pos.p016ui.adapter.PosOrderHistoryAdapter.ViewHolder
        public void bindData(final PosOrderUiModel posOrderUiModel) {
            Log_OC.getArray(posOrderUiModel, "order");
            PosOrderUiModel.Order $r3 = (PosOrderUiModel.Order) posOrderUiModel;
            TextView $r4 = this.timeTextView;
            String $r5 = $r3.getTime();
            $r4.setText($r5);
            TextView $r42 = this.amountTextView;
            C11780a0 c11780a0 = C11780a0.f26475a;
            String $r52 = $r3.getAmount();
            Object[] $r2 = {"-", $r52};
            String $r53 = String.format("%s %s", Arrays.copyOf($r2, 2));
            Log_OC.loadImage($r53, "java.lang.String.format(format, *args)");
            $r42.setText($r53);
            View $r7 = this.itemView;
            final PosOrderHistoryAdapter $r8 = this.this$0;
            $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.adapter.h
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PosOrderHistoryAdapter $r22 = PosOrderHistoryAdapter.this;
                    PosOrderUiModel $r32 = posOrderUiModel;
                    PosOrderHistoryAdapter.TransactionItemViewHolder.m40077bindData$lambda0($r22, $r32, view);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getAmountTextView() {
            TextView r1 = this.amountTextView;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getTimeTextView() {
            TextView r1 = this.timeTextView;
            return r1;
        }

        public final void setAmountTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.amountTextView = textView;
        }

        public final void setTimeTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.timeTextView = textView;
        }
    }

    /* compiled from: PosOrderHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindData", "", "order", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.adapter.PosOrderHistoryAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ PosOrderHistoryAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(PosOrderHistoryAdapter posOrderHistoryAdapter, View view) {
            super(view);
            Log_OC.getArray(posOrderHistoryAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = posOrderHistoryAdapter;
            this.container = view;
        }

        public abstract void bindData(PosOrderUiModel posOrderUiModel);

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
    public PosOrderHistoryAdapter(InterfaceC11767l interfaceC11767l) {
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
        boolean $z0 = $r2 instanceof PosOrderUiModel.OrderDate;
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
        PosOrderUiModel $r4 = (PosOrderUiModel) $r2;
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
            View $r5 = $r3.inflate(C0001R.C0004layout.list_item_pos_order, viewGroup, false);
            Log_OC.loadImage($r5, "inflater.inflate(R.layout.list_item_pos_order, parent, false)");
            TransactionItemViewHolder $r4 = new TransactionItemViewHolder(this, $r5);
            return $r4;
        }
        View $r52 = $r3.inflate(C0001R.C0004layout.pos_order_item_header, viewGroup, false);
        Log_OC.loadImage($r52, "inflater.inflate(R.layout.pos_order_item_header, parent, false)");
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
