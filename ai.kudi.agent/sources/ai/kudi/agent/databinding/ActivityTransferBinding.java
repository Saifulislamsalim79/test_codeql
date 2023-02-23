package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
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
public final class ActivityTransferBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;
    public final Toolbar toolbar;
    public final FrameLayout transferContainerLayout;

    private ActivityTransferBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, TabLayout tabLayout, Toolbar toolbar, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
        this.transferContainerLayout = frameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransferBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar_layout);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.tabLayout;
            View $r12 = view.findViewById(C0001R.C0003id.tabLayout);
            TabLayout $r3 = (TabLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.toolbar;
                View $r13 = view.findViewById(C0001R.C0003id.toolbar);
                Toolbar $r4 = (Toolbar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.transferContainerLayout;
                    View $r14 = view.findViewById(C0001R.C0003id.transferContainerLayout);
                    FrameLayout frameLayout = (FrameLayout) $r14;
                    if (frameLayout != null) {
                        ActivityTransferBinding $r6 = new ActivityTransferBinding((ConstraintLayout) view, $r2, $r3, $r4, frameLayout);
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
    public static ActivityTransferBinding inflate(LayoutInflater layoutInflater) {
        ActivityTransferBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_transfer, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityTransferBinding $r3 = bind($r2);
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
