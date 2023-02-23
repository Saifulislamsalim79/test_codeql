package ai.kudi.agent.kshock.p009ui.adapter;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.LayoutLoanStatusItemBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
/* compiled from: PendingLoansAdapter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R5\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lai/kudi/agent/kshock/data/model/Loan;", "Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter$PendingLoansViewHolder;", "()V", "onActionButtonClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", KshockOverdueLoansDetailFragment.KEY_LOAN, "", "getOnActionButtonClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnActionButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "PendingLoansViewHolder", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter */
/* loaded from: classes.dex */
public final class PendingLoansAdapter extends AbstractC1736q<Loan, PendingLoansViewHolder> {
    public static final Companion Companion;
    private static final PendingLoansAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK;
    private InterfaceC11767l<? super Loan, C13666w> onActionButtonClickListener;
    private final RecyclerView.C1645v viewPool;

    /* compiled from: PendingLoansAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "ai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter$Companion$DIFF_CALLBACK$1", "Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter$Companion$DIFF_CALLBACK$1;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: PendingLoansAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter$PendingLoansViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/feature_kshock/databinding/LayoutLoanStatusItemBinding;", "(Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter;Lai/kudi/agent/feature_kshock/databinding/LayoutLoanStatusItemBinding;)V", "bind", "", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter$PendingLoansViewHolder */
    /* loaded from: classes.dex */
    public final class PendingLoansViewHolder extends RecyclerView.AbstractC1620e0 {
        private final LayoutLoanStatusItemBinding binding;
        final /* synthetic */ PendingLoansAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PendingLoansViewHolder(ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter r5, ai.kudi.agent.feature_kshock.databinding.LayoutLoanStatusItemBinding r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter.PendingLoansViewHolder.<init>(ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter, ai.kudi.agent.feature_kshock.databinding.LayoutLoanStatusItemBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-1  reason: not valid java name */
        public static final void m39636bind$lambda1(PendingLoansAdapter pendingLoansAdapter, Loan loan, View view) {
            Log_OC.getArray(pendingLoansAdapter, "this$0");
            Log_OC.getArray(loan, "$loan");
            InterfaceC11767l $r1 = pendingLoansAdapter.getOnActionButtonClickListener();
            $r1.invoke(loan);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final Loan loan) {
            String $r12;
            List $r13;
            List $r132;
            Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
            LayoutLoanStatusItemBinding $r3 = this.binding;
            ViewGroup r24 = $r3.loanStatusRv;
            Context $r5 = r24.getContext();
            LinearLayoutManager r20 = new LinearLayoutManager($r5, 1, false);
            LayoutLoanStatusItemBinding $r32 = this.binding;
            RecyclerView $r4 = $r32.loanStatusRv;
            PendingLoansAdapter $r6 = this.this$0;
            TwoColumnTableAdapter r21 = new TwoColumnTableAdapter();
            $r4.setLayoutManager(r20);
            $r4.setAdapter(r21);
            TwoColumnItem.SimpleItem[] $r8 = new TwoColumnItem.SimpleItem[4];
            RecyclerView r242 = $r4;
            Context $r52 = r242.getContext();
            int $i0 = C0220R.string.loan_amount;
            String $r10 = $r52.getString($i0);
            Double $r11 = loan.getAmountOwed();
            String $r122 = $r11 == null ? null : StringExtKt.formatAmount($r11);
            TwoColumnItem.SimpleItem r22 = new TwoColumnItem.SimpleItem($r10, $r122);
            $r8[0] = r22;
            RecyclerView r243 = $r4;
            Context $r53 = r243.getContext();
            int $i02 = C0220R.string.charge;
            String $r102 = $r53.getString($i02);
            Double $r112 = loan.getInitialInterest();
            String $r123 = $r112 == null ? null : StringExtKt.formatAmount($r112);
            TwoColumnItem.SimpleItem r222 = new TwoColumnItem.SimpleItem($r102, $r123);
            $r8[1] = r222;
            RecyclerView r244 = $r4;
            Context $r54 = r244.getContext();
            int $i03 = C0220R.string.payback_amount;
            String $r103 = $r54.getString($i03);
            Double $r113 = loan.getAmountPaidBack();
            if ($r113 == null) {
                $r12 = null;
            } else {
                double $d0 = $r113.doubleValue();
                Double $r114 = loan.getAmountOwed();
                double $d1 = $r114 == null ? 0.0d : $r114.doubleValue();
                $r12 = StringExtKt.formatAmount(Double.valueOf($d0 + $d1));
            }
            TwoColumnItem.SimpleItem r223 = new TwoColumnItem.SimpleItem($r103, $r12);
            $r8[2] = r223;
            RecyclerView r245 = $r4;
            Context $r55 = r245.getContext();
            int $i04 = C0220R.string.due_date;
            String $r104 = $r55.getString($i04);
            String $r124 = loan.getDueDate();
            TwoColumnItem.SimpleItem r224 = new TwoColumnItem.SimpleItem($r104, $r124 == null ? null : StringExtKt.formatDateWithTime($r124, "T"));
            $r8[3] = r224;
            $r13 = C13726r.m3888h($r8);
            $r132 = C13742z.m3823D0($r13);
            r21.setData($r132);
            RecyclerView.C1645v $r14 = $r6.viewPool;
            $r4.setRecycledViewPool($r14);
            LayoutLoanStatusItemBinding $r33 = this.binding;
            TextView $r15 = $r33.loanStatus;
            Log_OC.loadImage($r15, "binding.loanStatus");
            LayoutLoanStatusItemBinding $r34 = this.binding;
            LinearLayout $r16 = $r34.actionView;
            Log_OC.loadImage($r16, "binding.actionView");
            LayoutLoanStatusItemBinding $r35 = this.binding;
            ViewGroup $r17 = $r35.getRoot();
            ViewGroup r246 = $r17;
            Context $r56 = r246.getContext();
            int $i05 = C0220R.string.pending_payback;
            String $r105 = $r56.getString($i05);
            $r15.setText($r105);
            Log_OC.loadImage($r56, "context");
            int $i06 = C0220R.color.kudiBadgeLightBlue;
            $r15.setBackgroundColor(ContextExtKt.getKudiColor($r56, $i06));
            int $i07 = C0220R.color.kudiBadgeDarkBlue;
            $r15.setTextColor(ContextExtKt.getKudiColor($r56, $i07));
            ViewExtKt.show($r16);
            final PendingLoansAdapter $r62 = this.this$0;
            $r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.adapter.EditActivity$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PendingLoansAdapter $r2 = PendingLoansAdapter.this;
                    Loan $r36 = loan;
                    PendingLoansAdapter.PendingLoansViewHolder.m39636bind$lambda1($r2, $r36, view);
                }
            });
            LayoutLoanStatusItemBinding $r36 = this.binding;
            TextView $r152 = $r36.actionTextView;
            int $i08 = C0220R.string.payback_manually;
            String $r106 = $r56.getString($i08);
            $r152.setText($r106);
            LayoutLoanStatusItemBinding $r37 = this.binding;
            View $r19 = $r37.cancelImage;
            Log_OC.loadImage($r19, "binding.cancelImage");
            View r25 = $r19;
            ViewExtKt.hide$default(r25, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter$Companion$DIFF_CALLBACK$1] */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DIFF_CALLBACK = new C1713j.AbstractC1719f<Loan>() { // from class: ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter$Companion$DIFF_CALLBACK$1
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
    public PendingLoansAdapter() {
        /*
            r3 = this;
            ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter$Companion$DIFF_CALLBACK$1 r0 = ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter.DIFF_CALLBACK
            r3.<init>(r0)
            ai.kudi.agent.kshock.ui.adapter.PendingLoansAdapter$onActionButtonClickListener$1 r1 = ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter$onActionButtonClickListener$1.INSTANCE
            r3.onActionButtonClickListener = r1
            androidx.recyclerview.widget.RecyclerView$v r2 = new androidx.recyclerview.widget.RecyclerView$v
            r2.<init>()
            r3.viewPool = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter.<init>():void");
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
    public void onBindViewHolder(PendingLoansViewHolder pendingLoansViewHolder, int i) {
        Log_OC.getArray(pendingLoansViewHolder, "holder");
        Object $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        Loan $r3 = (Loan) $r2;
        pendingLoansViewHolder.bind($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        PendingLoansViewHolder $r2 = (PendingLoansViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public PendingLoansViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutLoanStatusItemBinding $r5 = LayoutLoanStatusItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        PendingLoansViewHolder $r2 = new PendingLoansViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        PendingLoansViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setOnActionButtonClickListener(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onActionButtonClickListener = interfaceC11767l;
    }
}
