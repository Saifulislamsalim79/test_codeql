package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransactionsBinding implements InterfaceC8209a {
    public final AppCompatTextView filterView;
    private final ConstraintLayout rootView;
    public final SwipeRefreshLayout transactionsSwipeRefreshView;
    public final TransactionsView transactionsView;

    private FragmentTransactionsBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, SwipeRefreshLayout swipeRefreshLayout, TransactionsView transactionsView) {
        this.rootView = constraintLayout;
        this.filterView = appCompatTextView;
        this.transactionsSwipeRefreshView = swipeRefreshLayout;
        this.transactionsView = transactionsView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.filter_view;
        View $r1 = view.findViewById(C0001R.C0003id.filter_view);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.transactions_swipe_refresh_view;
            View $r12 = view.findViewById(C0001R.C0003id.transactions_swipe_refresh_view);
            SwipeRefreshLayout $r3 = (SwipeRefreshLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.transactions_view;
                View $r13 = view.findViewById(C0001R.C0003id.transactions_view);
                TransactionsView $r4 = (TransactionsView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentTransactionsBinding $r5 = new FragmentTransactionsBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransactionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransactionsBinding $r3 = bind($r2);
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
