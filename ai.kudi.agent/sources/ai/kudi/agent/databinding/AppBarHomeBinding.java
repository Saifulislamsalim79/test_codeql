package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class AppBarHomeBinding implements InterfaceC8209a {
    public final AppBarLayout appBar;
    public final ContentHomeBinding defaultView;
    public final ViewLoaderBinding loaderView;
    private final CoordinatorLayout rootView;
    public final FragmentTodoListBinding todoListView;
    public final ProgressBar todoProgressBar;
    public final Toolbar toolbar;

    private AppBarHomeBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ContentHomeBinding contentHomeBinding, ViewLoaderBinding viewLoaderBinding, FragmentTodoListBinding fragmentTodoListBinding, ProgressBar progressBar, Toolbar toolbar) {
        this.rootView = coordinatorLayout;
        this.appBar = appBarLayout;
        this.defaultView = contentHomeBinding;
        this.loaderView = viewLoaderBinding;
        this.todoListView = fragmentTodoListBinding;
        this.todoProgressBar = progressBar;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppBarHomeBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar;
        AppBarLayout $r2 = (AppBarLayout) view.findViewById(C0001R.C0003id.app_bar);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.default_view;
            View $r1 = view.findViewById(C0001R.C0003id.default_view);
            if ($r1 != null) {
                ContentHomeBinding $r3 = ContentHomeBinding.bind($r1);
                $i0 = C0001R.C0003id.loader_view;
                View $r12 = view.findViewById(C0001R.C0003id.loader_view);
                if ($r12 != null) {
                    ViewLoaderBinding $r4 = ViewLoaderBinding.bind($r12);
                    $i0 = C0001R.C0003id.todoListView;
                    View $r13 = view.findViewById(C0001R.C0003id.todoListView);
                    if ($r13 != null) {
                        FragmentTodoListBinding $r5 = FragmentTodoListBinding.bind($r13);
                        $i0 = C0001R.C0003id.todoProgressBar;
                        ProgressBar progressBar = (ProgressBar) view.findViewById(C0001R.C0003id.todoProgressBar);
                        if (progressBar != null) {
                            $i0 = C0001R.C0003id.toolbar;
                            Toolbar toolbar = (Toolbar) view.findViewById(C0001R.C0003id.toolbar);
                            if (toolbar != null) {
                                AppBarHomeBinding $r8 = new AppBarHomeBinding((CoordinatorLayout) view, $r2, $r3, $r4, $r5, progressBar, toolbar);
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
    public static AppBarHomeBinding inflate(LayoutInflater layoutInflater) {
        AppBarHomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppBarHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.app_bar_home, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        AppBarHomeBinding $r3 = bind($r2);
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
