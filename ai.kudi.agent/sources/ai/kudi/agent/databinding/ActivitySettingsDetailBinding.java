package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivitySettingsDetailBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final FrameLayout frame;
    public final LinearLayout linearLayout3;
    public final ViewLoaderBinding loaderView;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private ActivitySettingsDetailBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, LinearLayout linearLayout, ViewLoaderBinding viewLoaderBinding, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.frame = frameLayout;
        this.linearLayout3 = linearLayout;
        this.loaderView = viewLoaderBinding;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivitySettingsDetailBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar_layout);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.frame;
            View $r12 = view.findViewById(C0001R.C0003id.frame);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.linearLayout3;
                View $r13 = view.findViewById(C0001R.C0003id.linearLayout3);
                LinearLayout $r4 = (LinearLayout) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.loader_view;
                    View $r14 = view.findViewById(C0001R.C0003id.loader_view);
                    if ($r14 != null) {
                        ViewLoaderBinding $r5 = ViewLoaderBinding.bind($r14);
                        $i0 = C0001R.C0003id.toolbar;
                        View $r15 = view.findViewById(C0001R.C0003id.toolbar);
                        Toolbar toolbar = (Toolbar) $r15;
                        if (toolbar != null) {
                            ActivitySettingsDetailBinding $r7 = new ActivitySettingsDetailBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5, toolbar);
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
    public static ActivitySettingsDetailBinding inflate(LayoutInflater layoutInflater) {
        ActivitySettingsDetailBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivitySettingsDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_settings_detail, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivitySettingsDetailBinding $r3 = bind($r2);
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
