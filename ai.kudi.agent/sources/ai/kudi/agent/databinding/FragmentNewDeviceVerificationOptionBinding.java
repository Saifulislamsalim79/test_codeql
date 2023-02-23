package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentNewDeviceVerificationOptionBinding implements InterfaceC8209a {
    public final TextView deviceTrustText;
    public final CamomileSpinner loaderView;
    public final BottomLoginViewBinding otpBottomView;
    public final TextView primaryPhoneVerificationButton;
    private final ConstraintLayout rootView;
    public final TextView secondaryPhoneNumberVerificationButton;
    public final TextView textView14;
    public final TextView verifyWithFaceButton;

    private FragmentNewDeviceVerificationOptionBinding(ConstraintLayout constraintLayout, TextView textView, CamomileSpinner camomileSpinner, BottomLoginViewBinding bottomLoginViewBinding, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.deviceTrustText = textView;
        this.loaderView = camomileSpinner;
        this.otpBottomView = bottomLoginViewBinding;
        this.primaryPhoneVerificationButton = textView2;
        this.secondaryPhoneNumberVerificationButton = textView3;
        this.textView14 = textView4;
        this.verifyWithFaceButton = textView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentNewDeviceVerificationOptionBinding bind(View view) {
        int $i0 = C0001R.C0003id.device_trust_text;
        View $r1 = view.findViewById(C0001R.C0003id.device_trust_text);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.loaderView;
            View $r12 = view.findViewById(C0001R.C0003id.loaderView);
            CamomileSpinner $r3 = (CamomileSpinner) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.otpBottomView;
                View $r13 = view.findViewById(C0001R.C0003id.otpBottomView);
                if ($r13 != null) {
                    BottomLoginViewBinding $r4 = BottomLoginViewBinding.bind($r13);
                    $i0 = C0001R.C0003id.primaryPhoneVerificationButton;
                    View $r14 = view.findViewById(C0001R.C0003id.primaryPhoneVerificationButton);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.secondaryPhoneNumberVerificationButton;
                        View $r15 = view.findViewById(C0001R.C0003id.secondaryPhoneNumberVerificationButton);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.textView14;
                            View $r16 = view.findViewById(C0001R.C0003id.textView14);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.verify_with_face_button;
                                View $r17 = view.findViewById(C0001R.C0003id.verify_with_face_button);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    FragmentNewDeviceVerificationOptionBinding $r9 = new FragmentNewDeviceVerificationOptionBinding($r10, $r2, $r3, $r4, textView, textView2, textView3, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentNewDeviceVerificationOptionBinding inflate(LayoutInflater layoutInflater) {
        FragmentNewDeviceVerificationOptionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentNewDeviceVerificationOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_new_device_verification_option, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentNewDeviceVerificationOptionBinding $r3 = bind($r2);
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
