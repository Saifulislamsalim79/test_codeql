package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.SafeViewPager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityTransactionCommissionsBinding implements InterfaceC8209a {
    public final ConstraintLayout fullScreenLoader;
    private final CoordinatorLayout rootView;
    public final ConstraintLayout screenContent;
    public final TabLayout tabLayout;
    public final Toolbar toolbar;
    public final SafeViewPager viewPager;

    private ActivityTransactionCommissionsBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TabLayout tabLayout, Toolbar toolbar, SafeViewPager safeViewPager) {
        this.rootView = coordinatorLayout;
        this.fullScreenLoader = constraintLayout;
        this.screenContent = constraintLayout2;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
        this.viewPager = safeViewPager;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionCommissionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.full_screen_loader;
        View $r1 = view.findViewById(C0001R.C0003id.full_screen_loader);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.screen_content;
            View $r12 = view.findViewById(C0001R.C0003id.screen_content);
            ConstraintLayout $r3 = (ConstraintLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.tab_layout;
                View $r13 = view.findViewById(C0001R.C0003id.tab_layout);
                TabLayout $r4 = (TabLayout) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.toolbar;
                    View $r14 = view.findViewById(C0001R.C0003id.toolbar);
                    Toolbar toolbar = (Toolbar) $r14;
                    if (toolbar != null) {
                        $i0 = C0001R.C0003id.view_pager;
                        View $r15 = view.findViewById(C0001R.C0003id.view_pager);
                        SafeViewPager safeViewPager = (SafeViewPager) $r15;
                        if (safeViewPager != null) {
                            CoordinatorLayout $r8 = (CoordinatorLayout) view;
                            ActivityTransactionCommissionsBinding $r7 = new ActivityTransactionCommissionsBinding($r8, $r2, $r3, $r4, toolbar, safeViewPager);
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
    public static ActivityTransactionCommissionsBinding inflate(LayoutInflater layoutInflater) {
        ActivityTransactionCommissionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionCommissionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_transaction_commissions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityTransactionCommissionsBinding $r3 = bind($r2);
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
