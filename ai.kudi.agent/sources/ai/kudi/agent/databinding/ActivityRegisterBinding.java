package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityRegisterBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final FrameLayout container;
    public final ViewLoaderBinding loaderView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private ActivityRegisterBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, ViewLoaderBinding viewLoaderBinding, ProgressBar progressBar, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.container = frameLayout;
        this.loaderView = viewLoaderBinding;
        this.progressBar = progressBar;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityRegisterBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar_layout);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.container;
            View $r12 = view.findViewById(C0001R.C0003id.container);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loader_view;
                View $r13 = view.findViewById(C0001R.C0003id.loader_view);
                if ($r13 != null) {
                    ViewLoaderBinding $r4 = ViewLoaderBinding.bind($r13);
                    $i0 = C0001R.C0003id.progressBar;
                    View $r14 = view.findViewById(C0001R.C0003id.progressBar);
                    ProgressBar progressBar = (ProgressBar) $r14;
                    if (progressBar != null) {
                        $i0 = C0001R.C0003id.toolbar;
                        View $r15 = view.findViewById(C0001R.C0003id.toolbar);
                        Toolbar toolbar = (Toolbar) $r15;
                        if (toolbar != null) {
                            ActivityRegisterBinding $r7 = new ActivityRegisterBinding((ConstraintLayout) view, $r2, $r3, $r4, progressBar, toolbar);
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
    public static ActivityRegisterBinding inflate(LayoutInflater layoutInflater) {
        ActivityRegisterBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityRegisterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_register, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityRegisterBinding $r3 = bind($r2);
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
