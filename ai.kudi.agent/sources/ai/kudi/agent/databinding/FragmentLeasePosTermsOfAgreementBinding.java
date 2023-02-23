package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentLeasePosTermsOfAgreementBinding implements InterfaceC8209a {
    public final CardView cardView3;
    public final TextView countDownTimerText;
    private final ConstraintLayout rootView;
    public final KudiButton termsOfLeaseAgreementButton;
    public final KudiButton termsOfLeaseDisagreementButton;
    public final WebView termsOfLeaseWebView;
    public final TextView textView33;

    private FragmentLeasePosTermsOfAgreementBinding(ConstraintLayout constraintLayout, CardView cardView, TextView textView, KudiButton kudiButton, KudiButton kudiButton2, WebView webView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cardView3 = cardView;
        this.countDownTimerText = textView;
        this.termsOfLeaseAgreementButton = kudiButton;
        this.termsOfLeaseDisagreementButton = kudiButton2;
        this.termsOfLeaseWebView = webView;
        this.textView33 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLeasePosTermsOfAgreementBinding bind(View view) {
        int $i0 = C0001R.C0003id.cardView3;
        View $r1 = view.findViewById(C0001R.C0003id.cardView3);
        CardView $r2 = (CardView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.countDownTimerText;
            View $r12 = view.findViewById(C0001R.C0003id.countDownTimerText);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.termsOfLeaseAgreementButton;
                View $r13 = view.findViewById(C0001R.C0003id.termsOfLeaseAgreementButton);
                KudiButton kudiButton = (KudiButton) $r13;
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.termsOfLeaseDisagreementButton;
                    View $r14 = view.findViewById(C0001R.C0003id.termsOfLeaseDisagreementButton);
                    KudiButton kudiButton2 = (KudiButton) $r14;
                    if (kudiButton2 != null) {
                        $i0 = C0001R.C0003id.termsOfLeaseWebView;
                        View $r15 = view.findViewById(C0001R.C0003id.termsOfLeaseWebView);
                        WebView webView = (WebView) $r15;
                        if (webView != null) {
                            $i0 = C0001R.C0003id.textView33;
                            View $r16 = view.findViewById(C0001R.C0003id.textView33);
                            TextView textView = (TextView) $r16;
                            if (textView != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentLeasePosTermsOfAgreementBinding $r8 = new FragmentLeasePosTermsOfAgreementBinding($r9, $r2, $r3, kudiButton, kudiButton2, webView, textView);
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
    public static FragmentLeasePosTermsOfAgreementBinding inflate(LayoutInflater layoutInflater) {
        FragmentLeasePosTermsOfAgreementBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLeasePosTermsOfAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_lease_pos_terms_of_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentLeasePosTermsOfAgreementBinding $r3 = bind($r2);
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
