package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentKShockAvailableBinding implements InterfaceC8209a {
    public final TextView amountTextView;
    public final KudiButton continueButton;
    public final AppCompatImageView kShockIcon;
    public final TextView loanFeaturesText;
    public final TextView loanLimitDescriptionText;
    public final TextView loanUpTo;
    private final ScrollView rootView;

    private FragmentKShockAvailableBinding(ScrollView scrollView, TextView textView, KudiButton kudiButton, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.amountTextView = textView;
        this.continueButton = kudiButton;
        this.kShockIcon = appCompatImageView;
        this.loanFeaturesText = textView2;
        this.loanLimitDescriptionText = textView3;
        this.loanUpTo = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockAvailableBinding bind(View view) {
        int $i0 = C0220R.C0222id.amount_text_view;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.continue_button;
            View $r12 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.k_shock_icon;
                View $r13 = view.findViewById($i0);
                AppCompatImageView $r4 = (AppCompatImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.loan_features_text;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0220R.C0222id.loan_limit_description_text;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0220R.C0222id.loan_up_to;
                            View $r16 = view.findViewById($i0);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                ScrollView $r9 = (ScrollView) view;
                                FragmentKShockAvailableBinding $r8 = new FragmentKShockAvailableBinding($r9, $r2, $r3, $r4, textView, textView2, textView3);
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
    public static FragmentKShockAvailableBinding inflate(LayoutInflater layoutInflater) {
        FragmentKShockAvailableBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockAvailableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_k_shock_available;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentKShockAvailableBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
