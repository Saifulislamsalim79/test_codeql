package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentLoansListFragmentBinding implements InterfaceC8209a {
    public final FrameLayout container;
    public final Guideline guideline;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;

    private FragmentLoansListFragmentBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, TabLayout tabLayout) {
        this.rootView = constraintLayout;
        this.container = frameLayout;
        this.guideline = guideline;
        this.tabLayout = tabLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoansListFragmentBinding bind(View view) {
        int $i0 = C0220R.C0222id.container;
        View $r1 = view.findViewById($i0);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.guideline;
            View $r12 = view.findViewById($i0);
            Guideline $r3 = (Guideline) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.tabLayout;
                View $r13 = view.findViewById($i0);
                TabLayout $r4 = (TabLayout) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentLoansListFragmentBinding $r5 = new FragmentLoansListFragmentBinding($r6, $r2, $r3, $r4);
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
    public static FragmentLoansListFragmentBinding inflate(LayoutInflater layoutInflater) {
        FragmentLoansListFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoansListFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_loans_list_fragment;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentLoansListFragmentBinding $r3 = bind($r2);
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
