package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.SafeViewPager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentIssueResolutionHostBinding implements InterfaceC8209a {
    public final ListLoaderViewBinding loadingState;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;
    public final SafeViewPager viewPager;

    private FragmentIssueResolutionHostBinding(ConstraintLayout constraintLayout, ListLoaderViewBinding listLoaderViewBinding, TabLayout tabLayout, SafeViewPager safeViewPager) {
        this.rootView = constraintLayout;
        this.loadingState = listLoaderViewBinding;
        this.tabLayout = tabLayout;
        this.viewPager = safeViewPager;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueResolutionHostBinding bind(View view) {
        int $i0 = C0214R.C0216id.loadingState;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            ListLoaderViewBinding $r2 = ListLoaderViewBinding.bind($r1);
            $i0 = C0214R.C0216id.tabLayout;
            TabLayout $r3 = (TabLayout) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = C0214R.C0216id.viewPager;
                SafeViewPager $r4 = (SafeViewPager) view.findViewById($i0);
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentIssueResolutionHostBinding $r5 = new FragmentIssueResolutionHostBinding($r6, $r2, $r3, $r4);
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
    public static FragmentIssueResolutionHostBinding inflate(LayoutInflater layoutInflater) {
        FragmentIssueResolutionHostBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueResolutionHostBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_issue_resolution_host;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentIssueResolutionHostBinding $r3 = bind($r2);
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
