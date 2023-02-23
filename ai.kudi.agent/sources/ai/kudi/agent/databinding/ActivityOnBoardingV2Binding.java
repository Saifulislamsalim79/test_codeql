package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityOnBoardingV2Binding implements InterfaceC8209a {
    public final KudiButton getStartedButton;
    public final Guideline guideline7;
    private final ConstraintLayout rootView;
    public final View view5;
    public final View view6;
    public final View view7;
    public final ViewPager viewPager;

    private ActivityOnBoardingV2Binding(ConstraintLayout constraintLayout, KudiButton kudiButton, Guideline guideline, View view, View view2, View view3, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.getStartedButton = kudiButton;
        this.guideline7 = guideline;
        this.view5 = view;
        this.view6 = view2;
        this.view7 = view3;
        this.viewPager = viewPager;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOnBoardingV2Binding bind(View view) {
        int $i0 = C0001R.C0003id.getStartedButton;
        View $r1 = view.findViewById(C0001R.C0003id.getStartedButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.guideline7;
            View $r12 = view.findViewById(C0001R.C0003id.guideline7);
            Guideline $r3 = (Guideline) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.view5;
                View $r13 = view.findViewById(C0001R.C0003id.view5);
                if ($r13 != null) {
                    $i0 = C0001R.C0003id.view6;
                    View $r4 = view.findViewById(C0001R.C0003id.view6);
                    if ($r4 != null) {
                        $i0 = C0001R.C0003id.view7;
                        View $r5 = view.findViewById(C0001R.C0003id.view7);
                        if ($r5 != null) {
                            $i0 = C0001R.C0003id.viewPager;
                            View $r6 = view.findViewById(C0001R.C0003id.viewPager);
                            ViewPager viewPager = (ViewPager) $r6;
                            if (viewPager != null) {
                                ActivityOnBoardingV2Binding $r8 = new ActivityOnBoardingV2Binding((ConstraintLayout) view, $r2, $r3, $r13, $r4, $r5, viewPager);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOnBoardingV2Binding inflate(LayoutInflater layoutInflater) {
        ActivityOnBoardingV2Binding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOnBoardingV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_on_boarding_v2, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityOnBoardingV2Binding $r3 = bind($r2);
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
