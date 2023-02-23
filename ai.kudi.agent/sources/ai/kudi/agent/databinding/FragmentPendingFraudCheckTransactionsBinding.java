package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPendingFraudCheckTransactionsBinding implements InterfaceC8209a {
    public final EmptyHistoryBinding emptyHistoryView;
    public final AppCompatTextView filterView;
    public final TextView headNote;
    public final FrameLayout nextProgressBar;
    private final ConstraintLayout rootView;
    public final RecyclerView transactionList;

    private FragmentPendingFraudCheckTransactionsBinding(ConstraintLayout constraintLayout, EmptyHistoryBinding emptyHistoryBinding, AppCompatTextView appCompatTextView, TextView textView, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.emptyHistoryView = emptyHistoryBinding;
        this.filterView = appCompatTextView;
        this.headNote = textView;
        this.nextProgressBar = frameLayout;
        this.transactionList = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingFraudCheckTransactionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.empty_history_view;
        View $r1 = view.findViewById(C0001R.C0003id.empty_history_view);
        if ($r1 != null) {
            EmptyHistoryBinding $r2 = EmptyHistoryBinding.bind($r1);
            $i0 = C0001R.C0003id.filter_view;
            AppCompatTextView $r3 = (AppCompatTextView) view.findViewById(C0001R.C0003id.filter_view);
            if ($r3 != null) {
                $i0 = C0001R.C0003id.head_note;
                TextView $r4 = (TextView) view.findViewById(C0001R.C0003id.head_note);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.next_progress_bar;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(C0001R.C0003id.next_progress_bar);
                    if (frameLayout != null) {
                        $i0 = C0001R.C0003id.transaction_list;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0001R.C0003id.transaction_list);
                        if (recyclerView != null) {
                            FragmentPendingFraudCheckTransactionsBinding $r7 = new FragmentPendingFraudCheckTransactionsBinding((ConstraintLayout) view, $r2, $r3, $r4, frameLayout, recyclerView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingFraudCheckTransactionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentPendingFraudCheckTransactionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingFraudCheckTransactionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pending_fraud_check_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPendingFraudCheckTransactionsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
