package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.filter.KudiDateAndTypeFilterView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentIssueHistoryBinding implements InterfaceC8209a {
    public final KudiDateAndTypeFilterView issueHistoryDateAndTypeFilterView;
    public final EmptyHistoryBinding issueHistoryEmptyState;
    public final ProgressBar issueHistoryNextLoadingView;
    public final RecyclerView issueHistoryRecyclerView;
    public final FrameLayout issueHistoryloadingStateView;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout shimmerLoaderList;

    private FragmentIssueHistoryBinding(ConstraintLayout constraintLayout, KudiDateAndTypeFilterView kudiDateAndTypeFilterView, EmptyHistoryBinding emptyHistoryBinding, ProgressBar progressBar, RecyclerView recyclerView, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = constraintLayout;
        this.issueHistoryDateAndTypeFilterView = kudiDateAndTypeFilterView;
        this.issueHistoryEmptyState = emptyHistoryBinding;
        this.issueHistoryNextLoadingView = progressBar;
        this.issueHistoryRecyclerView = recyclerView;
        this.issueHistoryloadingStateView = frameLayout;
        this.shimmerLoaderList = shimmerFrameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueHistoryBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.issueHistoryDateAndTypeFilterView;
        KudiDateAndTypeFilterView $r2 = (KudiDateAndTypeFilterView) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.issueHistoryEmptyState))) != null) {
            EmptyHistoryBinding $r3 = EmptyHistoryBinding.bind($r1);
            $i0 = C0214R.C0216id.issueHistoryNextLoadingView;
            ProgressBar $r4 = (ProgressBar) view.findViewById($i0);
            if ($r4 != null) {
                $i0 = C0214R.C0216id.issueHistoryRecyclerView;
                RecyclerView recyclerView = (RecyclerView) view.findViewById($i0);
                if (recyclerView != null) {
                    $i0 = C0214R.C0216id.issueHistoryloadingStateView;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById($i0);
                    if (frameLayout != null) {
                        $i0 = C0214R.C0216id.shimmerLoaderList;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById($i0);
                        if (shimmerFrameLayout != null) {
                            ConstraintLayout $r9 = (ConstraintLayout) view;
                            FragmentIssueHistoryBinding $r8 = new FragmentIssueHistoryBinding($r9, $r2, $r3, $r4, recyclerView, frameLayout, shimmerFrameLayout);
                            return $r8;
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueHistoryBinding inflate(LayoutInflater layoutInflater) {
        FragmentIssueHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_issue_history;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentIssueHistoryBinding $r3 = bind($r2);
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
