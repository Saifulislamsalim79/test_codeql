package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPendingLoansListFragmentBinding implements InterfaceC8209a {
    public final LinearLayout emptyView;
    public final RecyclerView pendingLoansListRv;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final TextView subHeaderText;
    public final KudiButton topUpLoanButton;

    private FragmentPendingLoansListFragmentBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, ProgressBar progressBar, TextView textView, KudiButton kudiButton) {
        this.rootView = constraintLayout;
        this.emptyView = linearLayout;
        this.pendingLoansListRv = recyclerView;
        this.progressBar = progressBar;
        this.subHeaderText = textView;
        this.topUpLoanButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingLoansListFragmentBinding bind(View view) {
        int $i0 = C0220R.C0222id.empty_view;
        View $r1 = view.findViewById($i0);
        LinearLayout $r2 = (LinearLayout) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.pending_loans_list_rv;
            View $r12 = view.findViewById($i0);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.progress_bar;
                View $r13 = view.findViewById($i0);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.sub_header_text;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0220R.C0222id.top_up_loan_button;
                        View $r15 = view.findViewById($i0);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            FragmentPendingLoansListFragmentBinding $r7 = new FragmentPendingLoansListFragmentBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, kudiButton);
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
    public static FragmentPendingLoansListFragmentBinding inflate(LayoutInflater layoutInflater) {
        FragmentPendingLoansListFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingLoansListFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_pending_loans_list_fragment;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPendingLoansListFragmentBinding $r3 = bind($r2);
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
