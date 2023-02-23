package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOverdueLoansDetailsBinding implements InterfaceC8209a {
    public final TextView headerText;
    public final TextView insufficientTextView;
    public final RecyclerView overdueLoanDetailsRv;
    public final KudiButton paybackLoanButton;
    private final NestedScrollView rootView;

    private FragmentOverdueLoansDetailsBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2, RecyclerView recyclerView, KudiButton kudiButton) {
        this.rootView = nestedScrollView;
        this.headerText = textView;
        this.insufficientTextView = textView2;
        this.overdueLoanDetailsRv = recyclerView;
        this.paybackLoanButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOverdueLoansDetailsBinding bind(View view) {
        int $i0 = C0220R.C0222id.header_text;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.insufficient_text_view;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.overdue_loan_details_rv;
                View $r13 = view.findViewById($i0);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.payback_loan_button;
                    View $r14 = view.findViewById($i0);
                    KudiButton $r5 = (KudiButton) $r14;
                    if ($r5 != null) {
                        FragmentOverdueLoansDetailsBinding $r6 = new FragmentOverdueLoansDetailsBinding((NestedScrollView) view, $r2, $r3, $r4, $r5);
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
    public static FragmentOverdueLoansDetailsBinding inflate(LayoutInflater layoutInflater) {
        FragmentOverdueLoansDetailsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOverdueLoansDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_overdue_loans_details;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOverdueLoansDetailsBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
