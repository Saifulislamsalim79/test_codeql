package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.filter.KudiDateAndTypeFilterView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentLoanHistoryBinding implements InterfaceC8209a {
    public final AppCompatImageView backButton;
    public final TextView emptyStateText;
    public final TextView emptyStateTitle;
    public final LinearLayout emptyStateView;
    public final KudiDateAndTypeFilterView filterView;
    public final RecyclerView loanList;
    public final ProgressBar nextLoadingProgressBar;
    private final CoordinatorLayout rootView;
    public final ShimmerFrameLayout shimmerLoader;

    private FragmentLoanHistoryBinding(CoordinatorLayout coordinatorLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, LinearLayout linearLayout, KudiDateAndTypeFilterView kudiDateAndTypeFilterView, RecyclerView recyclerView, ProgressBar progressBar, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = coordinatorLayout;
        this.backButton = appCompatImageView;
        this.emptyStateText = textView;
        this.emptyStateTitle = textView2;
        this.emptyStateView = linearLayout;
        this.filterView = kudiDateAndTypeFilterView;
        this.loanList = recyclerView;
        this.nextLoadingProgressBar = progressBar;
        this.shimmerLoader = shimmerFrameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanHistoryBinding bind(View view) {
        int $i0 = C0220R.C0222id.back_button;
        View $r1 = view.findViewById($i0);
        AppCompatImageView $r2 = (AppCompatImageView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.empty_state_text;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.empty_state_title;
                View $r13 = view.findViewById($i0);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0220R.C0222id.empty_state_view;
                    View $r14 = view.findViewById($i0);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = C0220R.C0222id.filter_view;
                        View $r15 = view.findViewById($i0);
                        KudiDateAndTypeFilterView kudiDateAndTypeFilterView = (KudiDateAndTypeFilterView) $r15;
                        if (kudiDateAndTypeFilterView != null) {
                            $i0 = C0220R.C0222id.loan_list;
                            View $r16 = view.findViewById($i0);
                            RecyclerView recyclerView = (RecyclerView) $r16;
                            if (recyclerView != null) {
                                $i0 = C0220R.C0222id.nextLoadingProgressBar;
                                View $r17 = view.findViewById($i0);
                                ProgressBar $r8 = (ProgressBar) $r17;
                                if ($r8 != null) {
                                    $i0 = C0220R.C0222id.shimmer_loader;
                                    View $r18 = view.findViewById($i0);
                                    ShimmerFrameLayout $r9 = (ShimmerFrameLayout) $r18;
                                    if ($r9 != null) {
                                        CoordinatorLayout $r11 = (CoordinatorLayout) view;
                                        FragmentLoanHistoryBinding $r10 = new FragmentLoanHistoryBinding($r11, $r2, $r3, textView, linearLayout, kudiDateAndTypeFilterView, recyclerView, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanHistoryBinding inflate(LayoutInflater layoutInflater) {
        FragmentLoanHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_loan_history;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentLoanHistoryBinding $r3 = bind($r2);
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
    public CoordinatorLayout getRoot() {
        CoordinatorLayout r1 = this.rootView;
        return r1;
    }
}
