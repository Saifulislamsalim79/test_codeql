package ai.kudi.agent.payments.adapter;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AmountSuggestionAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0019\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001c\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0014\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter$AmountViewHolder;", "()V", "amountList", "", "onClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function3;", "setOnClickListener", "(Lkotlin/jvm/functions/Function3;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAmount", "ranges", "AmountViewHolder", "Companion", "ViewHolder", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AmountSuggestionAdapter extends AbstractC1736q<Long, AmountViewHolder> {
    public static final Companion Companion;
    private static final AmountSuggestionAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK;
    private List<Long> amountList;
    private InterfaceC11772q<? super Long, ? super View, ? super Integer, C13666w> onClickListener;

    /* compiled from: AmountSuggestionAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter$AmountViewHolder;", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter$ViewHolder;", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "getAmountTextView", "()Landroid/widget/TextView;", "bindAmount", "", TransactionField.AMOUNT, "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class AmountViewHolder extends ViewHolder {
        private final TextView amountTextView;
        final /* synthetic */ AmountSuggestionAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public AmountViewHolder(AmountSuggestionAdapter amountSuggestionAdapter, View view) {
            super(amountSuggestionAdapter, view);
            Log_OC.getArray(amountSuggestionAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = amountSuggestionAdapter;
            int $i0 = C0038R.C0040id.amount;
            View $r1 = view.findViewById($i0);
            Log_OC.loadImage($r1, "container.findViewById(R.id.amount)");
            TextView $r3 = (TextView) $r1;
            this.amountTextView = $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.payments.adapter.AmountSuggestionAdapter.ViewHolder
        public void bindAmount(long j) {
            TextView $r1 = this.amountTextView;
            C11780a0 c11780a0 = C11780a0.f26475a;
            View $r4 = getContainer();
            Context $r5 = $r4.getContext();
            Resources $r6 = $r5.getResources();
            int $i1 = C0038R.string.total_amount_processed;
            String $r7 = $r6.getString($i1);
            Log_OC.loadImage($r7, "container.context.resources.getString(R.string.total_amount_processed)");
            Locale $r8 = Locale.US;
            NumberFormat $r9 = NumberFormat.getNumberInstance($r8);
            String $r10 = $r9.format(j);
            Object[] $r2 = {$r10};
            String $r72 = String.format($r7, Arrays.copyOf($r2, 1));
            Log_OC.loadImage($r72, "java.lang.String.format(format, *args)");
            $r1.setText($r72);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getAmountTextView() {
            TextView r1 = this.amountTextView;
            return r1;
        }
    }

    /* compiled from: AmountSuggestionAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "ai/kudi/agent/payments/adapter/AmountSuggestionAdapter$Companion$DIFF_CALLBACK$1", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter$Companion$DIFF_CALLBACK$1;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: AmountSuggestionAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J)\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindAmount", "", TransactionField.AMOUNT, "", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ AmountSuggestionAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(AmountSuggestionAdapter amountSuggestionAdapter, View view) {
            super(view);
            Log_OC.getArray(amountSuggestionAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = amountSuggestionAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m40003setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bindAmount(long j);

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
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.payments.adapter.FloatingActionButton$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    AmountSuggestionAdapter.ViewHolder.m40003setOnClickListener$lambda0($r2, view);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.payments.adapter.AmountSuggestionAdapter$Companion$DIFF_CALLBACK$1] */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DIFF_CALLBACK = new C1713j.AbstractC1719f<Long>() { // from class: ai.kudi.agent.payments.adapter.AmountSuggestionAdapter$Companion$DIFF_CALLBACK$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public boolean areContentsTheSame(long j, long j2) {
                return j == j2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(Long l, Long l2) {
                Long $r3 = l;
                long $l0 = $r3.longValue();
                Long $r32 = l2;
                long $l1 = $r32.longValue();
                boolean $z0 = areContentsTheSame($l0, $l1);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public boolean areItemsTheSame(long j, long j2) {
                return j == j2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(Long l, Long l2) {
                Long $r3 = l;
                long $l0 = $r3.longValue();
                Long $r32 = l2;
                long $l1 = $r32.longValue();
                boolean $z0 = areItemsTheSame($l0, $l1);
                return $z0;
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AmountSuggestionAdapter() {
        /*
            r2 = this;
            ai.kudi.agent.payments.adapter.AmountSuggestionAdapter$Companion$DIFF_CALLBACK$1 r0 = ai.kudi.agent.payments.adapter.AmountSuggestionAdapter.DIFF_CALLBACK
            r2.<init>(r0)
            java.util.List r1 = kotlin.p557z.C13722p.m3941e()
            r2.amountList = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.payments.adapter.AmountSuggestionAdapter.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ Long access$getItem(AmountSuggestionAdapter amountSuggestionAdapter, int i) {
        Object $r0 = amountSuggestionAdapter.getItem(i);
        Long $r2 = (Long) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getOnClickListener() {
        InterfaceC11772q r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(AmountViewHolder amountViewHolder, int i) {
        Log_OC.getArray(amountViewHolder, "holder");
        Number $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        Number $r3 = $r2;
        long $l1 = $r3.longValue();
        amountViewHolder.bindAmount($l1);
        AmountSuggestionAdapter$onBindViewHolder$1 $r4 = new AmountSuggestionAdapter$onBindViewHolder$1(this, amountViewHolder);
        amountViewHolder.setOnClickListener($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        AmountViewHolder $r2 = (AmountViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public AmountViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        int $i0 = C0038R.C0041layout.custom_amount_suggestion;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r4, "view");
        AmountViewHolder $r5 = new AmountViewHolder(this, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AmountViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setAmount(List list) {
        Log_OC.getArray(list, "ranges");
        this.amountList = list;
        submitList(list);
    }

    public final void setOnClickListener(InterfaceC11772q interfaceC11772q) {
        this.onClickListener = interfaceC11772q;
    }
}
