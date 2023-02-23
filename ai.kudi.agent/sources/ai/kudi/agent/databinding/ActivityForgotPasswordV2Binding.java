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
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityForgotPasswordV2Binding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final FrameLayout containerFrameLayout;
    public final ViewLoaderBinding loaderView;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private ActivityForgotPasswordV2Binding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, ViewLoaderBinding viewLoaderBinding, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.containerFrameLayout = frameLayout;
        this.loaderView = viewLoaderBinding;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityForgotPasswordV2Binding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar_layout);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.containerFrameLayout;
            View $r12 = view.findViewById(C0001R.C0003id.containerFrameLayout);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loader_view;
                View $r13 = view.findViewById(C0001R.C0003id.loader_view);
                if ($r13 != null) {
                    ViewLoaderBinding $r4 = ViewLoaderBinding.bind($r13);
                    $i0 = C0001R.C0003id.toolbar;
                    View $r14 = view.findViewById(C0001R.C0003id.toolbar);
                    Toolbar $r5 = (Toolbar) $r14;
                    if ($r5 != null) {
                        ActivityForgotPasswordV2Binding $r6 = new ActivityForgotPasswordV2Binding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static ActivityForgotPasswordV2Binding inflate(LayoutInflater layoutInflater) {
        ActivityForgotPasswordV2Binding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityForgotPasswordV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_forgot_password_v2, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityForgotPasswordV2Binding $r3 = bind($r2);
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
