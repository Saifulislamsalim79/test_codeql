package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAgentReferralTabBinding implements InterfaceC8209a {
    public final FrameLayout referralContainer;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;
    public final ViewPager viewPager;

    private FragmentAgentReferralTabBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, TabLayout tabLayout, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.referralContainer = frameLayout;
        this.tabLayout = tabLayout;
        this.viewPager = viewPager;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferralTabBinding bind(View view) {
        int $i0 = C0001R.C0003id.referral_container;
        View $r1 = view.findViewById(C0001R.C0003id.referral_container);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.tabLayout;
            View $r12 = view.findViewById(C0001R.C0003id.tabLayout);
            TabLayout $r3 = (TabLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.viewPager;
                View $r13 = view.findViewById(C0001R.C0003id.viewPager);
                ViewPager $r4 = (ViewPager) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentAgentReferralTabBinding $r5 = new FragmentAgentReferralTabBinding($r6, $r2, $r3, $r4);
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
    public static FragmentAgentReferralTabBinding inflate(LayoutInflater layoutInflater) {
        FragmentAgentReferralTabBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferralTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_agent_referral_tab, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAgentReferralTabBinding $r3 = bind($r2);
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
