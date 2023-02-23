package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityKcashBinding implements InterfaceC8209a {
    public final WalletLoaderViewBinding loaderView;
    private final ConstraintLayout rootView;
    public final WebView webView;

    private ActivityKcashBinding(ConstraintLayout constraintLayout, WalletLoaderViewBinding walletLoaderViewBinding, WebView webView) {
        this.rootView = constraintLayout;
        this.loaderView = walletLoaderViewBinding;
        this.webView = webView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityKcashBinding bind(View view) {
        int $i0 = C0001R.C0003id.loader_view;
        View $r1 = view.findViewById(C0001R.C0003id.loader_view);
        if ($r1 != null) {
            WalletLoaderViewBinding $r2 = WalletLoaderViewBinding.bind($r1);
            WebView $r3 = (WebView) view.findViewById(C0001R.C0003id.webView);
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                ActivityKcashBinding $r4 = new ActivityKcashBinding($r5, $r2, $r3);
                return $r4;
            }
            $i0 = C0001R.C0003id.webView;
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityKcashBinding inflate(LayoutInflater layoutInflater) {
        ActivityKcashBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityKcashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_kcash, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityKcashBinding $r3 = bind($r2);
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
