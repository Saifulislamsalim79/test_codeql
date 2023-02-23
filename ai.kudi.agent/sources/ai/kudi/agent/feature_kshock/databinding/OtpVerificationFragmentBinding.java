package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.feature_kshock.C0220R;
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
public final class OtpVerificationFragmentBinding implements InterfaceC8209a {
    public final KudiInputField confirmNewPinView;
    public final KudiButton kbConfirmOtp;
    public final KshockToolBarBinding kshockToolBar;
    public final PinEntryView pinEntryView;
    public final KudiTextView resendOtp;
    private final ConstraintLayout rootView;
    public final TextView time;
    public final TextView tvOtpError;
    public final TextView tvOtpVerificationInfo;

    private OtpVerificationFragmentBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, KudiButton kudiButton, KshockToolBarBinding kshockToolBarBinding, PinEntryView pinEntryView, KudiTextView kudiTextView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.confirmNewPinView = kudiInputField;
        this.kbConfirmOtp = kudiButton;
        this.kshockToolBar = kshockToolBarBinding;
        this.pinEntryView = pinEntryView;
        this.resendOtp = kudiTextView;
        this.time = textView;
        this.tvOtpError = textView2;
        this.tvOtpVerificationInfo = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpVerificationFragmentBinding bind(View view) {
        View $r1;
        int $i0 = C0220R.C0222id.confirmNewPinView;
        View $r12 = view.findViewById($i0);
        KudiInputField $r2 = (KudiInputField) $r12;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.kbConfirmOtp;
            View $r13 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r13;
            if ($r3 != null && ($r1 = view.findViewById(($i0 = C0220R.C0222id.kshock_tool_bar))) != null) {
                KshockToolBarBinding $r4 = KshockToolBarBinding.bind($r1);
                $i0 = C0220R.C0222id.pinEntryView;
                View $r14 = view.findViewById($i0);
                PinEntryView pinEntryView = (PinEntryView) $r14;
                if (pinEntryView != null) {
                    $i0 = C0220R.C0222id.resendOtp;
                    View $r15 = view.findViewById($i0);
                    KudiTextView kudiTextView = (KudiTextView) $r15;
                    if (kudiTextView != null) {
                        $i0 = C0220R.C0222id.time;
                        View $r16 = view.findViewById($i0);
                        TextView textView = (TextView) $r16;
                        if (textView != null) {
                            $i0 = C0220R.C0222id.tvOtpError;
                            View $r17 = view.findViewById($i0);
                            TextView textView2 = (TextView) $r17;
                            if (textView2 != null) {
                                $i0 = C0220R.C0222id.tvOtpVerificationInfo;
                                View $r18 = view.findViewById($i0);
                                TextView $r9 = (TextView) $r18;
                                if ($r9 != null) {
                                    ConstraintLayout $r11 = (ConstraintLayout) view;
                                    OtpVerificationFragmentBinding $r10 = new OtpVerificationFragmentBinding($r11, $r2, $r3, $r4, pinEntryView, kudiTextView, textView, textView2, $r9);
                                    return $r10;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpVerificationFragmentBinding inflate(LayoutInflater layoutInflater) {
        OtpVerificationFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpVerificationFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.otp_verification_fragment;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        OtpVerificationFragmentBinding $r3 = bind($r2);
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
