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
public final class ActivityPosBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final WalletLoaderViewBinding loaderView;
    public final FrameLayout posContainer;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private ActivityPosBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, WalletLoaderViewBinding walletLoaderViewBinding, FrameLayout frameLayout, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.loaderView = walletLoaderViewBinding;
        this.posContainer = frameLayout;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPosBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        AppBarLayout $r2 = (AppBarLayout) view.findViewById(C0001R.C0003id.app_bar_layout);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.loader_view;
            View $r1 = view.findViewById(C0001R.C0003id.loader_view);
            if ($r1 != null) {
                WalletLoaderViewBinding $r3 = WalletLoaderViewBinding.bind($r1);
                $i0 = C0001R.C0003id.posContainer;
                FrameLayout $r4 = (FrameLayout) view.findViewById(C0001R.C0003id.posContainer);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.toolbar;
                    Toolbar $r5 = (Toolbar) view.findViewById(C0001R.C0003id.toolbar);
                    if ($r5 != null) {
                        ActivityPosBinding $r6 = new ActivityPosBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static ActivityPosBinding inflate(LayoutInflater layoutInflater) {
        ActivityPosBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPosBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_pos, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityPosBinding $r3 = bind($r2);
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
