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
public final class FragmentConfirmOtpBinding implements InterfaceC8209a {
    public final KudiInputField confirmNewPinView;
    public final KudiButton kbConfirmOtp;
    private final ConstraintLayout rootView;
    public final TextView tvOtpVerificationInfo;
    public final TextView tvResendOtp;

    private FragmentConfirmOtpBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, KudiButton kudiButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.confirmNewPinView = kudiInputField;
        this.kbConfirmOtp = kudiButton;
        this.tvOtpVerificationInfo = textView;
        this.tvResendOtp = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentConfirmOtpBinding bind(View view) {
        int $i0 = C0001R.C0003id.confirmNewPinView;
        View $r1 = view.findViewById(C0001R.C0003id.confirmNewPinView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.kbConfirmOtp;
            View $r12 = view.findViewById(C0001R.C0003id.kbConfirmOtp);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.tvOtpVerificationInfo;
                View $r13 = view.findViewById(C0001R.C0003id.tvOtpVerificationInfo);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.tvResendOtp;
                    View $r14 = view.findViewById(C0001R.C0003id.tvResendOtp);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        FragmentConfirmOtpBinding $r6 = new FragmentConfirmOtpBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentConfirmOtpBinding inflate(LayoutInflater layoutInflater) {
        FragmentConfirmOtpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentConfirmOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_confirm_otp, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentConfirmOtpBinding $r3 = bind($r2);
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
