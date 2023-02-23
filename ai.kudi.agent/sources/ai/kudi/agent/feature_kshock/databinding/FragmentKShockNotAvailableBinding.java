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
public final class FragmentKShockNotAvailableBinding implements InterfaceC8209a {
    public final KudiButton closeButton;
    public final AppCompatImageView kShockIcon;
    public final TextView loanNotAvailableDescriptionText;
    private final ScrollView rootView;

    private FragmentKShockNotAvailableBinding(ScrollView scrollView, KudiButton kudiButton, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = scrollView;
        this.closeButton = kudiButton;
        this.kShockIcon = appCompatImageView;
        this.loanNotAvailableDescriptionText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockNotAvailableBinding bind(View view) {
        int $i0 = C0220R.C0222id.close_button;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.k_shock_icon;
            View $r12 = view.findViewById($i0);
            AppCompatImageView $r3 = (AppCompatImageView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.loan_not_available_description_text;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ScrollView $r6 = (ScrollView) view;
                    FragmentKShockNotAvailableBinding $r5 = new FragmentKShockNotAvailableBinding($r6, $r2, $r3, $r4);
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
    public static FragmentKShockNotAvailableBinding inflate(LayoutInflater layoutInflater) {
        FragmentKShockNotAvailableBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKShockNotAvailableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_k_shock_not_available;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentKShockNotAvailableBinding $r3 = bind($r2);
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
