package ai.kudi.agent.savings.adapter;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.savings.data.model.SavingTransactionUIModel;
import ai.kudi.agent.savings.data.model.SavingsItemModel;
import ai.kudi.agent.savings.databinding.ItemSavingsDateBinding;
import ai.kudi.agent.savings.databinding.ItemSavingsTransactionBinding;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.AbstractC8016s0;
/* compiled from: SavingsAdapter.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004\u000f\u0010\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "Lai/kudi/agent/savings/adapter/SavingsAdapter$ViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "SavingDateViewHolder", "SavingItemViewHolder", "ViewHolder", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsAdapter extends AbstractC8016s0<SavingsItemModel, ViewHolder> {
    public static final Companion Companion;
    public static final int DATE_VIEW = 0;
    public static final String HEADER_FORMAT = "EEEE, d MMM, yyyy";
    public static final String SERVER_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final int TRANSACTION_VIEW = 1;

    /* compiled from: SavingsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsAdapter$Companion;", "", "()V", "DATE_VIEW", "", "HEADER_FORMAT", "", "SERVER_FORMAT", "TRANSACTION_VIEW", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: SavingsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsAdapter$SavingDateViewHolder;", "Lai/kudi/agent/savings/adapter/SavingsAdapter$ViewHolder;", "Lai/kudi/agent/savings/adapter/SavingsAdapter;", "binding", "Lai/kudi/agent/savings/databinding/ItemSavingsDateBinding;", "(Lai/kudi/agent/savings/adapter/SavingsAdapter;Lai/kudi/agent/savings/databinding/ItemSavingsDateBinding;)V", "getBinding", "()Lai/kudi/agent/savings/databinding/ItemSavingsDateBinding;", "bindData", "", "transaction", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class SavingDateViewHolder extends ViewHolder {
        private final ItemSavingsDateBinding binding;
        final /* synthetic */ SavingsAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SavingDateViewHolder(ai.kudi.agent.savings.adapter.SavingsAdapter r5, ai.kudi.agent.savings.databinding.ItemSavingsDateBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r5, r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.adapter.SavingsAdapter.SavingDateViewHolder.<init>(ai.kudi.agent.savings.adapter.SavingsAdapter, ai.kudi.agent.savings.databinding.ItemSavingsDateBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.savings.adapter.SavingsAdapter.ViewHolder
        public void bindData(SavingsItemModel savingsItemModel) {
            Log_OC.getArray(savingsItemModel, "transaction");
            SavingsItemModel.SavingsTransactionDate $r3 = (SavingsItemModel.SavingsTransactionDate) savingsItemModel;
            ItemSavingsDateBinding $r4 = this.binding;
            TextView $r5 = $r4.dateTextView;
            String $r1 = $r3.getDate();
            $r5.setText($r1);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemSavingsDateBinding getBinding() {
            ItemSavingsDateBinding r1 = this.binding;
            return r1;
        }
    }

    /* compiled from: SavingsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsAdapter$SavingItemViewHolder;", "Lai/kudi/agent/savings/adapter/SavingsAdapter$ViewHolder;", "Lai/kudi/agent/savings/adapter/SavingsAdapter;", "binding", "Lai/kudi/agent/savings/databinding/ItemSavingsTransactionBinding;", "(Lai/kudi/agent/savings/adapter/SavingsAdapter;Lai/kudi/agent/savings/databinding/ItemSavingsTransactionBinding;)V", "getBinding", "()Lai/kudi/agent/savings/databinding/ItemSavingsTransactionBinding;", "bindData", "", "transaction", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class SavingItemViewHolder extends ViewHolder {
        private final ItemSavingsTransactionBinding binding;
        final /* synthetic */ SavingsAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SavingItemViewHolder(ai.kudi.agent.savings.adapter.SavingsAdapter r5, ai.kudi.agent.savings.databinding.ItemSavingsTransactionBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r5, r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.adapter.SavingsAdapter.SavingItemViewHolder.<init>(ai.kudi.agent.savings.adapter.SavingsAdapter, ai.kudi.agent.savings.databinding.ItemSavingsTransactionBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.savings.adapter.SavingsAdapter.ViewHolder
        public void bindData(SavingsItemModel savingsItemModel) {
            Log_OC.getArray(savingsItemModel, "transaction");
            SavingsItemModel.SavingsTransaction $r2 = (SavingsItemModel.SavingsTransaction) savingsItemModel;
            SavingTransactionUIModel $r3 = $r2.getTransaction();
            String $r4 = $r3.getTransactionType();
            boolean $z0 = Log_OC.append($r4, SavingTransactionItem.SAVINGS_WITHDRAW);
            int $i0 = $z0 ? C0456R.string.saving_withdraw : C0456R.string.saving_deposit;
            ItemSavingsTransactionBinding $r5 = this.binding;
            TextView $r6 = $r5.transactionTypeText;
            SavingTransactionUIModel $r32 = $r2.getTransaction();
            String $r42 = $r32.getTransactionType();
            $r6.setText($r42);
            TextView $r62 = $r5.timeText;
            SavingTransactionUIModel $r33 = $r2.getTransaction();
            String $r43 = $r33.getTransactionDate();
            $r62.setText(StringExtKt.convertDateFormat($r43, SavingsAdapter.SERVER_FORMAT, SavingTransactionItem.TIME_FORMAT));
            TextView $r63 = $r5.amountText;
            ViewGroup $r7 = $r5.getRoot();
            ViewGroup r10 = $r7;
            Context $r8 = r10.getContext();
            SavingTransactionUIModel $r34 = $r2.getTransaction();
            int $i1 = $r34.getAmount();
            String $r44 = StringExtKt.getFormatAmount($i1);
            Object[] $r9 = {$r44};
            String $r45 = $r8.getString($i0, $r9);
            $r63.setText($r45);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemSavingsTransactionBinding getBinding() {
            ItemSavingsTransactionBinding r1 = this.binding;
            return r1;
        }
    }

    /* compiled from: SavingsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/savings/adapter/SavingsAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindData", "", "transaction", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ SavingsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(SavingsAdapter savingsAdapter, View view) {
            super(view);
            Log_OC.getArray(savingsAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = savingsAdapter;
            this.container = view;
        }

        public abstract void bindData(SavingsItemModel savingsItemModel);

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
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SavingsAdapter() {
        /*
            r11 = this;
            ai.kudi.agent.savings.adapter.DiffCallback r6 = ai.kudi.agent.savings.adapter.DiffCallback.INSTANCE
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r0 = r11
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.adapter.SavingsAdapter.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        Object $r1 = getItem(i);
        SavingsItemModel $r2 = (SavingsItemModel) $r1;
        boolean $z0 = $r2 instanceof SavingsItemModel.SavingsTransactionDate;
        if ($z0) {
            return 0;
        }
        boolean $z02 = $r2 instanceof SavingsItemModel.SavingsTransaction;
        if ($z02) {
            return 1;
        }
        IllegalStateException $r3 = new IllegalStateException("Invalid ViewType");
        throw $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        Object $r2 = getItem(i);
        SavingsItemModel $r3 = (SavingsItemModel) $r2;
        if ($r3 == null) {
            return;
        }
        viewHolder.bindData($r3);
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
        Object $r6;
        Log_OC.getArray(viewGroup, "parent");
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        if (i == 0) {
            $r6 = $r4;
            ItemSavingsDateBinding $r5 = ItemSavingsDateBinding.inflate($r3, viewGroup, false);
            Log_OC.loadImage($r5, "inflate(inflater, parent, false)");
            Object $r4 = new SavingDateViewHolder(this, $r5);
        } else if (i != 1) {
            ItemSavingsDateBinding $r52 = ItemSavingsDateBinding.inflate($r3);
            Log_OC.loadImage($r52, "inflate(inflater)");
            SavingDateViewHolder r8 = new SavingDateViewHolder(this, $r52);
            return r8;
        } else {
            $r6 = r9;
            ItemSavingsTransactionBinding $r7 = ItemSavingsTransactionBinding.inflate($r3, viewGroup, false);
            Log_OC.loadImage($r7, "inflate(inflater, parent, false)");
            Object r9 = new SavingItemViewHolder(this, $r7);
        }
        ViewHolder r10 = (ViewHolder) $r6;
        return r10;
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
