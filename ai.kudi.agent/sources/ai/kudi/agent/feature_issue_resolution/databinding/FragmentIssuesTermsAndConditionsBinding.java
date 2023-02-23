package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentIssuesTermsAndConditionsBinding implements InterfaceC8209a {
    public final CardView cardView;
    public final WebView kudiTermsWebView;
    private final ConstraintLayout rootView;
    public final KudiTextView signedByText;

    private FragmentIssuesTermsAndConditionsBinding(ConstraintLayout constraintLayout, CardView cardView, WebView webView, KudiTextView kudiTextView) {
        this.rootView = constraintLayout;
        this.cardView = cardView;
        this.kudiTermsWebView = webView;
        this.signedByText = kudiTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssuesTermsAndConditionsBinding bind(View view) {
        int $i0 = C0214R.C0216id.cardView;
        View $r1 = view.findViewById($i0);
        CardView $r2 = (CardView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.kudi_terms_web_view;
            View $r12 = view.findViewById($i0);
            WebView $r3 = (WebView) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.signed_by_text;
                View $r13 = view.findViewById($i0);
                KudiTextView $r4 = (KudiTextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentIssuesTermsAndConditionsBinding $r5 = new FragmentIssuesTermsAndConditionsBinding($r6, $r2, $r3, $r4);
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
    public static FragmentIssuesTermsAndConditionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentIssuesTermsAndConditionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssuesTermsAndConditionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_issues_terms_and_conditions;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentIssuesTermsAndConditionsBinding $r3 = bind($r2);
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
