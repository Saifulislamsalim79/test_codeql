package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentEmailVeridicationBinding implements InterfaceC8209a {
    public final KudiInputField emailValidationEmailAddressInputField;
    public final ConstraintLayout emailVerificationRootLayout;
    public final TextView emailVerificationSkipThisStepButton;
    public final KudiTextView emailVerificationSubtitle;
    public final KudiTextView emailVerificationTitleText;
    private final ConstraintLayout rootView;
    public final KudiInputField secondaryPhoneNumberInputField;
    public final KudiButton verifyDetailsButton;

    private FragmentEmailVeridicationBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, ConstraintLayout constraintLayout2, TextView textView, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiInputField kudiInputField2, KudiButton kudiButton) {
        this.rootView = constraintLayout;
        this.emailValidationEmailAddressInputField = kudiInputField;
        this.emailVerificationRootLayout = constraintLayout2;
        this.emailVerificationSkipThisStepButton = textView;
        this.emailVerificationSubtitle = kudiTextView;
        this.emailVerificationTitleText = kudiTextView2;
        this.secondaryPhoneNumberInputField = kudiInputField2;
        this.verifyDetailsButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEmailVeridicationBinding bind(View view) {
        int $i0 = C0001R.C0003id.emailValidationEmailAddressInputField;
        View $r1 = view.findViewById(C0001R.C0003id.emailValidationEmailAddressInputField);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            ConstraintLayout $r3 = (ConstraintLayout) view;
            $i0 = C0001R.C0003id.emailVerificationSkipThisStepButton;
            View $r12 = view.findViewById(C0001R.C0003id.emailVerificationSkipThisStepButton);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.emailVerificationSubtitle;
                View $r13 = view.findViewById(C0001R.C0003id.emailVerificationSubtitle);
                KudiTextView kudiTextView = (KudiTextView) $r13;
                if (kudiTextView != null) {
                    $i0 = C0001R.C0003id.emailVerificationTitleText;
                    View $r14 = view.findViewById(C0001R.C0003id.emailVerificationTitleText);
                    KudiTextView kudiTextView2 = (KudiTextView) $r14;
                    if (kudiTextView2 != null) {
                        $i0 = C0001R.C0003id.secondaryPhoneNumberInputField;
                        View $r15 = view.findViewById(C0001R.C0003id.secondaryPhoneNumberInputField);
                        KudiInputField kudiInputField = (KudiInputField) $r15;
                        if (kudiInputField != null) {
                            $i0 = C0001R.C0003id.verifyDetailsButton;
                            View $r16 = view.findViewById(C0001R.C0003id.verifyDetailsButton);
                            KudiButton $r8 = (KudiButton) $r16;
                            if ($r8 != null) {
                                FragmentEmailVeridicationBinding $r9 = new FragmentEmailVeridicationBinding($r3, $r2, $r3, textView, kudiTextView, kudiTextView2, kudiInputField, $r8);
                                return $r9;
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
    public static FragmentEmailVeridicationBinding inflate(LayoutInflater layoutInflater) {
        FragmentEmailVeridicationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEmailVeridicationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_email_veridication, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentEmailVeridicationBinding $r3 = bind($r2);
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
