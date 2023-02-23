package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPendingKycFormBinding implements InterfaceC8209a {
    public final KudiInputField emailAddressView;
    public final KudiInputField idCardNumberView;
    public final KudiInputField idCardType;
    private final ConstraintLayout rootView;
    public final KudiButton submitIdVerifyView;
    public final TextView textView19;
    public final TextView textView20;

    private FragmentPendingKycFormBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiButton kudiButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.emailAddressView = kudiInputField;
        this.idCardNumberView = kudiInputField2;
        this.idCardType = kudiInputField3;
        this.submitIdVerifyView = kudiButton;
        this.textView19 = textView;
        this.textView20 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingKycFormBinding bind(View view) {
        int $i0 = C0001R.C0003id.emailAddressView;
        View $r1 = view.findViewById(C0001R.C0003id.emailAddressView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.idCardNumberView;
            View $r12 = view.findViewById(C0001R.C0003id.idCardNumberView);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.idCardType;
                View $r13 = view.findViewById(C0001R.C0003id.idCardType);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.submitIdVerifyView;
                    View $r14 = view.findViewById(C0001R.C0003id.submitIdVerifyView);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0001R.C0003id.textView19;
                        View $r15 = view.findViewById(C0001R.C0003id.textView19);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.textView20;
                            View $r16 = view.findViewById(C0001R.C0003id.textView20);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentPendingKycFormBinding $r8 = new FragmentPendingKycFormBinding($r9, $r2, $r3, kudiInputField, kudiButton, textView, textView2);
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
    public static FragmentPendingKycFormBinding inflate(LayoutInflater layoutInflater) {
        FragmentPendingKycFormBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingKycFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pending_kyc_form, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPendingKycFormBinding $r3 = bind($r2);
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
