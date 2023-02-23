package ai.kudi.agent.kshock.p009ui.adapter;

import ai.kudi.agent.feature_kshock.databinding.LayoutOverdueLoanStatusItemBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OverdueLoansAdapter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R5\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lai/kudi/agent/kshock/data/model/Loan;", "Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter$OverdueLoansViewHolder;", "()V", "onActionButtonClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", KshockOverdueLoansDetailFragment.KEY_LOAN, "", "getOnActionButtonClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnActionButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OverdueLoansViewHolder", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter */
/* loaded from: classes.dex */
public final class OverdueLoansAdapter extends AbstractC1736q<Loan, OverdueLoansViewHolder> {
    public static final Companion Companion;
    private static final OverdueLoansAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK;
    private InterfaceC11767l<? super Loan, C13666w> onActionButtonClickListener;
    private final RecyclerView.C1645v viewPool;

    /* compiled from: OverdueLoansAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "ai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter$Companion$DIFF_CALLBACK$1", "Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter$Companion$DIFF_CALLBACK$1;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: OverdueLoansAdapter.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter$OverdueLoansViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/feature_kshock/databinding/LayoutOverdueLoanStatusItemBinding;", "(Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter;Lai/kudi/agent/feature_kshock/databinding/LayoutOverdueLoanStatusItemBinding;)V", "bind", "", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "calculateTotalLoanDue", "", "(Lai/kudi/agent/kshock/data/model/Loan;)Ljava/lang/Double;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$OverdueLoansViewHolder */
    /* loaded from: classes.dex */
    public final class OverdueLoansViewHolder extends RecyclerView.AbstractC1620e0 {
        private final LayoutOverdueLoanStatusItemBinding binding;
        final /* synthetic */ OverdueLoansAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public OverdueLoansViewHolder(ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter r5, ai.kudi.agent.feature_kshock.databinding.LayoutOverdueLoanStatusItemBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.recyclerview.widget.RecyclerView r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter.OverdueLoansViewHolder.<init>(ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter, ai.kudi.agent.feature_kshock.databinding.LayoutOverdueLoanStatusItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0093, code lost:
            r26 = kotlin.p549l0.C13276s.m5451A(r26, "_", " ", false, 4, null);
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0169  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(ai.kudi.agent.kshock.data.model.Loan r46) {
            /*
                Method dump skipped, instructions count: 449
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter.OverdueLoansViewHolder.bind(ai.kudi.agent.kshock.data.model.Loan):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Double calculateTotalLoanDue(Loan loan) {
            Double $r2;
            if (loan == null || ($r2 = loan.getAmountDisbursed()) == null) {
                return null;
            }
            double $d0 = $r2.doubleValue();
            Double $r22 = loan.getInitialInterest();
            double $d2 = $r22 == null ? 0.0d : $r22.doubleValue();
            double $d02 = $d0 + $d2;
            Double $r23 = loan.getAccruedOverdueInterest();
            double $d22 = $r23 == null ? 0.0d : $r23.doubleValue();
            double $d03 = $d02 + $d22;
            Double $r24 = loan.getAmountPaidBack();
            double $d1 = $r24 != null ? $r24.doubleValue() : 0.0d;
            return Double.valueOf($d03 - $d1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$Companion$DIFF_CALLBACK$1] */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DIFF_CALLBACK = new C1713j.AbstractC1719f<Loan>() { // from class: ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$Companion$DIFF_CALLBACK$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
            public boolean areContentsTheSame2(Loan loan, Loan loan2) {
                Log_OC.getArray(loan, "oldItem");
                Log_OC.getArray(loan2, "newItem");
                boolean $z0 = Log_OC.append(loan, loan2);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(Loan loan, Loan loan2) {
                Loan $r3 = loan;
                Loan $r4 = loan2;
                boolean $z0 = areContentsTheSame2($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
            public boolean areItemsTheSame2(Loan loan, Loan loan2) {
                Log_OC.getArray(loan, "oldItem");
                Log_OC.getArray(loan2, "newItem");
                String $r3 = loan.getId();
                String $r4 = loan2.getId();
                boolean $z0 = Log_OC.append($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(Loan loan, Loan loan2) {
                Loan $r3 = loan;
                Loan $r4 = loan2;
                boolean $z0 = areItemsTheSame2($r3, $r4);
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
    public OverdueLoansAdapter() {
        /*
            r3 = this;
            ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$Companion$DIFF_CALLBACK$1 r0 = ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter.DIFF_CALLBACK
            r3.<init>(r0)
            ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$onActionButtonClickListener$1 r1 = ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter$onActionButtonClickListener$1.INSTANCE
            r3.onActionButtonClickListener = r1
            androidx.recyclerview.widget.RecyclerView$v r2 = new androidx.recyclerview.widget.RecyclerView$v
            r2.<init>()
            r3.viewPool = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnActionButtonClickListener() {
        InterfaceC11767l r1 = this.onActionButtonClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(OverdueLoansViewHolder overdueLoansViewHolder, int i) {
        Log_OC.getArray(overdueLoansViewHolder, "holder");
        Object $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        Loan $r3 = (Loan) $r2;
        overdueLoansViewHolder.bind($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        OverdueLoansViewHolder $r2 = (OverdueLoansViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public OverdueLoansViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutOverdueLoanStatusItemBinding $r5 = LayoutOverdueLoanStatusItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        OverdueLoansViewHolder $r2 = new OverdueLoansViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        OverdueLoansViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setOnActionButtonClickListener(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onActionButtonClickListener = interfaceC11767l;
    }
}
