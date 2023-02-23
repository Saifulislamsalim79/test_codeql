package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentKShockEligibilityCriteriaBinding implements InterfaceC8209a {
    public final RecyclerView eligibilityCriteriaList;
    public final FrameLayout progressBar;
    private final FrameLayout rootView;

    private FragmentKShockEligibilityCriteriaBinding(FrameLayout frameLayout, RecyclerView recyclerView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.eligibilityCriteriaList = recyclerView;
        this.progressBar = frameLayout2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockEligibilityCriteriaBinding bind(View view) {
        int $i0 = C0220R.C0222id.eligibility_criteria_list;
        View $r1 = view.findViewById($i0);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.progress_bar;
            View $r12 = view.findViewById($i0);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                FrameLayout $r5 = (FrameLayout) view;
                FragmentKShockEligibilityCriteriaBinding $r4 = new FragmentKShockEligibilityCriteriaBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockEligibilityCriteriaBinding inflate(LayoutInflater layoutInflater) {
        FragmentKShockEligibilityCriteriaBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockEligibilityCriteriaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_k_shock_eligibility_criteria;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentKShockEligibilityCriteriaBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
