package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityAcceptTermsBinding implements InterfaceC8209a {
    public final KudiButton acceptTerms;
    public final KudiButton rejectTerms;
    private final LinearLayout rootView;
    public final WebView termsWebView;

    private ActivityAcceptTermsBinding(LinearLayout linearLayout, KudiButton kudiButton, KudiButton kudiButton2, WebView webView) {
        this.rootView = linearLayout;
        this.acceptTerms = kudiButton;
        this.rejectTerms = kudiButton2;
        this.termsWebView = webView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAcceptTermsBinding bind(View view) {
        int $i0 = C0038R.C0040id.accept_terms;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.reject_terms;
            View $r12 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.terms_web_view;
                View $r13 = view.findViewById($i0);
                WebView $r4 = (WebView) $r13;
                if ($r4 != null) {
                    LinearLayout $r6 = (LinearLayout) view;
                    ActivityAcceptTermsBinding $r5 = new ActivityAcceptTermsBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAcceptTermsBinding inflate(LayoutInflater layoutInflater) {
        ActivityAcceptTermsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAcceptTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.activity_accept_terms;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityAcceptTermsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
