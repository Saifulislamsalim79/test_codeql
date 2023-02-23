package ai.kudi.agent.kshock.p009ui.adapter;

import ai.kudi.agent.feature_kshock.databinding.ListItemLoanHistoryBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.AbstractC8016s0;
/* compiled from: LoanHistoryAdapter.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\u00020\u00072\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lai/kudi/agent/kshock/data/model/Loan;", "Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter$ViewHolder;", "()V", "onLoanSelectedListener", "Lkotlin/Function1;", "", "getOnLoanSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setOnLoanSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter */
/* loaded from: classes.dex */
public final class LoanHistoryAdapter extends AbstractC8016s0<Loan, ViewHolder> {
    public static final Companion Companion;
    private static final LoanHistoryAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK;
    private InterfaceC11767l<? super Loan, C13666w> onLoanSelectedListener;

    /* compiled from: LoanHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "ai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter$Companion$DIFF_CALLBACK$1", "Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter$Companion$DIFF_CALLBACK$1;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: LoanHistoryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/feature_kshock/databinding/ListItemLoanHistoryBinding;", "(Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter;Lai/kudi/agent/feature_kshock/databinding/ListItemLoanHistoryBinding;)V", "bindData", "", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ListItemLoanHistoryBinding binding;
        final /* synthetic */ LoanHistoryAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter r5, ai.kudi.agent.feature_kshock.databinding.ListItemLoanHistoryBinding r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter.ViewHolder.<init>(ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter, ai.kudi.agent.feature_kshock.databinding.ListItemLoanHistoryBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-2  reason: not valid java name */
        public static final void m39635bindData$lambda2(LoanHistoryAdapter loanHistoryAdapter, Loan loan, View view) {
            Log_OC.getArray(loanHistoryAdapter, "this$0");
            Log_OC.getArray(loan, "$loan");
            InterfaceC11767l $r1 = loanHistoryAdapter.getOnLoanSelectedListener();
            if ($r1 == null) {
                return;
            }
            $r1.invoke(loan);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
            if (r11 == null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
            r13 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
            r13 = ai.kudi.agent.core.util.StringExtKt.formatAmount(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
            if (r11 == null) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bindData(final ai.kudi.agent.kshock.data.model.Loan r32) {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter.ViewHolder.bindData(ai.kudi.agent.kshock.data.model.Loan):void");
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter$Companion$DIFF_CALLBACK$1] */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DIFF_CALLBACK = new C1713j.AbstractC1719f<Loan>() { // from class: ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter$Companion$DIFF_CALLBACK$1
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
    public LoanHistoryAdapter() {
        /*
            r11 = this;
            ai.kudi.agent.kshock.ui.adapter.LoanHistoryAdapter$Companion$DIFF_CALLBACK$1 r6 = ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter.DIFF_CALLBACK
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnLoanSelectedListener() {
        InterfaceC11767l r1 = this.onLoanSelectedListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        Object $r2 = getItem(i);
        Loan $r3 = (Loan) $r2;
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
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ListItemLoanHistoryBinding $r5 = ListItemLoanHistoryBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(inflater, parent, false)");
        ViewHolder $r1 = new ViewHolder(this, $r5);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setOnLoanSelectedListener(InterfaceC11767l interfaceC11767l) {
        this.onLoanSelectedListener = interfaceC11767l;
    }
}
