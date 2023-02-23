package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentEnterOtpBinding implements InterfaceC8209a {
    public final TextView btnCopy;
    public final TextView btnDial;
    public final RelativeLayout containerOtp;
    public final ConstraintLayout generateOtpLayout;
    public final TextView generateOtpTextView;
    public final BottomLoginViewBinding otpBottomView;
    public final TextView otpHeaderText;
    public final ConstraintLayout otpRootView;
    public final TextView otpSubHeaderText;
    public final PinEntryView pinEntryView;
    public final KudiTextView resendOtp;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final TextView time;
    public final TextView tvContent;

    private FragmentEnterOtpBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, TextView textView3, BottomLoginViewBinding bottomLoginViewBinding, TextView textView4, ConstraintLayout constraintLayout3, TextView textView5, PinEntryView pinEntryView, KudiTextView kudiTextView, ScrollView scrollView, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.btnCopy = textView;
        this.btnDial = textView2;
        this.containerOtp = relativeLayout;
        this.generateOtpLayout = constraintLayout2;
        this.generateOtpTextView = textView3;
        this.otpBottomView = bottomLoginViewBinding;
        this.otpHeaderText = textView4;
        this.otpRootView = constraintLayout3;
        this.otpSubHeaderText = textView5;
        this.pinEntryView = pinEntryView;
        this.resendOtp = kudiTextView;
        this.scrollView = scrollView;
        this.time = textView6;
        this.tvContent = textView7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnterOtpBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_copy;
        View $r1 = view.findViewById(C0001R.C0003id.btn_copy);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.btn_dial;
            View $r12 = view.findViewById(C0001R.C0003id.btn_dial);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.container_otp;
                View $r13 = view.findViewById(C0001R.C0003id.container_otp);
                RelativeLayout relativeLayout = (RelativeLayout) $r13;
                if (relativeLayout != null) {
                    $i0 = C0001R.C0003id.generateOtpLayout;
                    View $r14 = view.findViewById(C0001R.C0003id.generateOtpLayout);
                    ConstraintLayout constraintLayout = (ConstraintLayout) $r14;
                    if (constraintLayout != null) {
                        $i0 = C0001R.C0003id.generateOtpTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.generateOtpTextView);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.otpBottomView;
                            View $r16 = view.findViewById(C0001R.C0003id.otpBottomView);
                            if ($r16 != null) {
                                BottomLoginViewBinding $r7 = BottomLoginViewBinding.bind($r16);
                                $i0 = C0001R.C0003id.otpHeaderText;
                                View $r17 = view.findViewById(C0001R.C0003id.otpHeaderText);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r9 = (ConstraintLayout) view;
                                    $i0 = C0001R.C0003id.otpSubHeaderText;
                                    View $r18 = view.findViewById(C0001R.C0003id.otpSubHeaderText);
                                    TextView $r10 = (TextView) $r18;
                                    if ($r10 != null) {
                                        $i0 = C0001R.C0003id.pinEntryView;
                                        View $r19 = view.findViewById(C0001R.C0003id.pinEntryView);
                                        PinEntryView $r11 = (PinEntryView) $r19;
                                        if ($r11 != null) {
                                            $i0 = C0001R.C0003id.resendOtp;
                                            View $r110 = view.findViewById(C0001R.C0003id.resendOtp);
                                            KudiTextView $r122 = (KudiTextView) $r110;
                                            if ($r122 != null) {
                                                $i0 = C0001R.C0003id.scroll_view;
                                                View $r111 = view.findViewById(C0001R.C0003id.scroll_view);
                                                ScrollView $r132 = (ScrollView) $r111;
                                                if ($r132 != null) {
                                                    $i0 = C0001R.C0003id.time;
                                                    View $r112 = view.findViewById(C0001R.C0003id.time);
                                                    TextView $r142 = (TextView) $r112;
                                                    if ($r142 != null) {
                                                        $i0 = C0001R.C0003id.tv_content;
                                                        View $r113 = view.findViewById(C0001R.C0003id.tv_content);
                                                        TextView $r152 = (TextView) $r113;
                                                        if ($r152 != null) {
                                                            FragmentEnterOtpBinding $r162 = new FragmentEnterOtpBinding($r9, textView, textView2, relativeLayout, constraintLayout, textView3, $r7, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152);
                                                            return $r162;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r172 = view.getResources();
        String $r182 = $r172.getResourceName($i0);
        NullPointerException $r192 = new NullPointerException("Missing required view with ID: ".concat($r182));
        throw $r192;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnterOtpBinding inflate(LayoutInflater layoutInflater) {
        FragmentEnterOtpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnterOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_enter_otp, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentEnterOtpBinding $r3 = bind($r2);
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
