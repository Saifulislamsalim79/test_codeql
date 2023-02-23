package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityWalletTopUpBinding implements InterfaceC8209a {
    public final FrameLayout container;
    public final Guideline guideline;
    public final WalletLoaderViewBinding loaderView;
    public final View options;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;

    private ActivityWalletTopUpBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, WalletLoaderViewBinding walletLoaderViewBinding, View view, TabLayout tabLayout) {
        this.rootView = constraintLayout;
        this.container = frameLayout;
        this.guideline = guideline;
        this.loaderView = walletLoaderViewBinding;
        this.options = view;
        this.tabLayout = tabLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityWalletTopUpBinding bind(View view) {
        int $i0 = C0001R.C0003id.container;
        View $r1 = view.findViewById(C0001R.C0003id.container);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.guideline;
            View $r12 = view.findViewById(C0001R.C0003id.guideline);
            Guideline $r3 = (Guideline) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loaderView;
                View $r13 = view.findViewById(C0001R.C0003id.loaderView);
                if ($r13 != null) {
                    WalletLoaderViewBinding $r4 = WalletLoaderViewBinding.bind($r13);
                    $i0 = C0001R.C0003id.options;
                    View $r14 = view.findViewById(C0001R.C0003id.options);
                    if ($r14 != null) {
                        $i0 = C0001R.C0003id.tabLayout;
                        View $r5 = view.findViewById(C0001R.C0003id.tabLayout);
                        TabLayout tabLayout = (TabLayout) $r5;
                        if (tabLayout != null) {
                            ActivityWalletTopUpBinding $r7 = new ActivityWalletTopUpBinding((ConstraintLayout) view, $r2, $r3, $r4, $r14, tabLayout);
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
    public static ActivityWalletTopUpBinding inflate(LayoutInflater layoutInflater) {
        ActivityWalletTopUpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityWalletTopUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_wallet_top_up, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityWalletTopUpBinding $r3 = bind($r2);
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
