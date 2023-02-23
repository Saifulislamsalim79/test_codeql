package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentFilterCommissionsBinding implements InterfaceC8209a {
    public final TransactionsView commissionsTransactionView;
    public final AppCompatTextView dateFilterView;
    public final LinearLayout filterView;
    private final LinearLayout rootView;
    public final AppCompatTextView typeFilterView;

    private FragmentFilterCommissionsBinding(LinearLayout linearLayout, TransactionsView transactionsView, AppCompatTextView appCompatTextView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayout;
        this.commissionsTransactionView = transactionsView;
        this.dateFilterView = appCompatTextView;
        this.filterView = linearLayout2;
        this.typeFilterView = appCompatTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterCommissionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.commissions_transaction_view;
        View $r1 = view.findViewById(C0001R.C0003id.commissions_transaction_view);
        TransactionsView $r2 = (TransactionsView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.date_filter_view;
            View $r12 = view.findViewById(C0001R.C0003id.date_filter_view);
            AppCompatTextView $r3 = (AppCompatTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.filter_view;
                View $r13 = view.findViewById(C0001R.C0003id.filter_view);
                LinearLayout $r4 = (LinearLayout) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.type_filter_view;
                    View $r14 = view.findViewById(C0001R.C0003id.type_filter_view);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) $r14;
                    if (appCompatTextView != null) {
                        FragmentFilterCommissionsBinding $r6 = new FragmentFilterCommissionsBinding((LinearLayout) view, $r2, $r3, $r4, appCompatTextView);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterCommissionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentFilterCommissionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterCommissionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_filter_commissions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentFilterCommissionsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
