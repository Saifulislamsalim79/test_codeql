package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityVoucherCashoutPhoneVerificationBinding implements InterfaceC8209a {
    public final TextView errorTextView;
    public final PinEntryView inputForm;
    public final TextView phoneVerificationDescTextView;
    public final ImageView phoneVerificationImageView;
    public final ProgressBar progressBar;
    public final TextView resendOtpTextView;
    private final ConstraintLayout rootView;
    public final TextView timeLeftTextView;
    public final Toolbar toolbar;

    private ActivityVoucherCashoutPhoneVerificationBinding(ConstraintLayout constraintLayout, TextView textView, PinEntryView pinEntryView, TextView textView2, ImageView imageView, ProgressBar progressBar, TextView textView3, TextView textView4, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.errorTextView = textView;
        this.inputForm = pinEntryView;
        this.phoneVerificationDescTextView = textView2;
        this.phoneVerificationImageView = imageView;
        this.progressBar = progressBar;
        this.resendOtpTextView = textView3;
        this.timeLeftTextView = textView4;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityVoucherCashoutPhoneVerificationBinding bind(View view) {
        int $i0 = C0001R.C0003id.errorTextView;
        View $r1 = view.findViewById(C0001R.C0003id.errorTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.inputForm;
            View $r12 = view.findViewById(C0001R.C0003id.inputForm);
            PinEntryView pinEntryView = (PinEntryView) $r12;
            if (pinEntryView != null) {
                $i0 = C0001R.C0003id.phoneVerificationDescTextView;
                View $r13 = view.findViewById(C0001R.C0003id.phoneVerificationDescTextView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.phoneVerificationImageView;
                    View $r14 = view.findViewById(C0001R.C0003id.phoneVerificationImageView);
                    ImageView imageView = (ImageView) $r14;
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.progressBar;
                        View $r15 = view.findViewById(C0001R.C0003id.progressBar);
                        ProgressBar progressBar = (ProgressBar) $r15;
                        if (progressBar != null) {
                            $i0 = C0001R.C0003id.resendOtpTextView;
                            View $r16 = view.findViewById(C0001R.C0003id.resendOtpTextView);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.timeLeftTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.timeLeftTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.toolbar;
                                    View $r18 = view.findViewById(C0001R.C0003id.toolbar);
                                    Toolbar $r9 = (Toolbar) $r18;
                                    if ($r9 != null) {
                                        ConstraintLayout $r11 = (ConstraintLayout) view;
                                        ActivityVoucherCashoutPhoneVerificationBinding $r10 = new ActivityVoucherCashoutPhoneVerificationBinding($r11, $r2, pinEntryView, textView, imageView, progressBar, textView2, $r8, $r9);
                                        return $r10;
                                    }
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
    public static ActivityVoucherCashoutPhoneVerificationBinding inflate(LayoutInflater layoutInflater) {
        ActivityVoucherCashoutPhoneVerificationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityVoucherCashoutPhoneVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_voucher_cashout_phone_verification, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityVoucherCashoutPhoneVerificationBinding $r3 = bind($r2);
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
