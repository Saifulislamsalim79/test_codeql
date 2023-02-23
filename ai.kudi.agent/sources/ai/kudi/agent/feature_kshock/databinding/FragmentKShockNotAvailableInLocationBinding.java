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
public final class FragmentKShockNotAvailableInLocationBinding implements InterfaceC8209a {
    public final KudiButton closeButton;
    public final TextView descriptionText;
    public final AppCompatImageView kShockIcon;
    public final TextView loanNotAvailableDescriptionText;
    private final ScrollView rootView;
    public final TextView titleTextView;

    private FragmentKShockNotAvailableInLocationBinding(ScrollView scrollView, KudiButton kudiButton, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.closeButton = kudiButton;
        this.descriptionText = textView;
        this.kShockIcon = appCompatImageView;
        this.loanNotAvailableDescriptionText = textView2;
        this.titleTextView = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockNotAvailableInLocationBinding bind(View view) {
        int $i0 = C0220R.C0222id.close_button;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.description_text;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.k_shock_icon;
                View $r13 = view.findViewById($i0);
                AppCompatImageView $r4 = (AppCompatImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.loan_not_available_description_text;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0220R.C0222id.title_text_view;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            FragmentKShockNotAvailableInLocationBinding $r7 = new FragmentKShockNotAvailableInLocationBinding((ScrollView) view, $r2, $r3, $r4, textView, textView2);
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
    public static FragmentKShockNotAvailableInLocationBinding inflate(LayoutInflater layoutInflater) {
        FragmentKShockNotAvailableInLocationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockNotAvailableInLocationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_k_shock_not_available_in_location;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentKShockNotAvailableInLocationBinding $r3 = bind($r2);
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
