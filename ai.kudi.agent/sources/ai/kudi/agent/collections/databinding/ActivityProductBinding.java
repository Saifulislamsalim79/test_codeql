package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityProductBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final FrameLayout flContainer;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;
    public final Toolbar toolbar;

    private ActivityProductBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, TabLayout tabLayout, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.flContainer = frameLayout;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityProductBinding bind(View view) {
        int $i0 = R$id.app_bar_layout;
        View $r1 = view.findViewById($i0);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = R$id.fl_container;
            View $r12 = view.findViewById($i0);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = R$id.tabLayout;
                View $r13 = view.findViewById($i0);
                TabLayout $r4 = (TabLayout) $r13;
                if ($r4 != null) {
                    $i0 = R$id.toolbar;
                    View $r14 = view.findViewById($i0);
                    Toolbar $r5 = (Toolbar) $r14;
                    if ($r5 != null) {
                        ActivityProductBinding $r6 = new ActivityProductBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static ActivityProductBinding inflate(LayoutInflater layoutInflater) {
        ActivityProductBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityProductBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.activity_product;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityProductBinding $r3 = bind($r2);
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
