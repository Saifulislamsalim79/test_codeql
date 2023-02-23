package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class KycViewBinding implements InterfaceC8209a {
    public final TextView buttomViewHeader;
    public final TextView cashoutView;
    public final TextView kycLevelTextView;
    public final TextView otpHeaderText;
    public final ProgressBar progressBar3;
    public final KudiTextView reviewRequest;
    private final ConstraintLayout rootView;
    public final TextView transferLimitView;
    public final TextView transferWidthrawalLimit;
    public final View view4;
    public final View view5;
    public final TextView walletTopUpLimitView;
    public final TextView whatDoesThis;

    private KycViewBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, KudiTextView kudiTextView, TextView textView5, TextView textView6, View view, View view2, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.buttomViewHeader = textView;
        this.cashoutView = textView2;
        this.kycLevelTextView = textView3;
        this.otpHeaderText = textView4;
        this.progressBar3 = progressBar;
        this.reviewRequest = kudiTextView;
        this.transferLimitView = textView5;
        this.transferWidthrawalLimit = textView6;
        this.view4 = view;
        this.view5 = view2;
        this.walletTopUpLimitView = textView7;
        this.whatDoesThis = textView8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.buttomViewHeader;
        View $r1 = view.findViewById(C0001R.C0003id.buttomViewHeader);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.cashoutView;
            View $r12 = view.findViewById(C0001R.C0003id.cashoutView);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.kycLevelTextView;
                View $r13 = view.findViewById(C0001R.C0003id.kycLevelTextView);
                TextView textView3 = (TextView) $r13;
                if (textView3 != null) {
                    $i0 = C0001R.C0003id.otpHeaderText;
                    View $r14 = view.findViewById(C0001R.C0003id.otpHeaderText);
                    TextView textView4 = (TextView) $r14;
                    if (textView4 != null) {
                        $i0 = C0001R.C0003id.progressBar3;
                        View $r15 = view.findViewById(C0001R.C0003id.progressBar3);
                        ProgressBar progressBar = (ProgressBar) $r15;
                        if (progressBar != null) {
                            $i0 = C0001R.C0003id.reviewRequest;
                            View $r16 = view.findViewById(C0001R.C0003id.reviewRequest);
                            KudiTextView kudiTextView = (KudiTextView) $r16;
                            if (kudiTextView != null) {
                                $i0 = C0001R.C0003id.transferLimitView;
                                View $r17 = view.findViewById(C0001R.C0003id.transferLimitView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.transferWidthrawalLimit;
                                    View $r18 = view.findViewById(C0001R.C0003id.transferWidthrawalLimit);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.view4;
                                        View $r19 = view.findViewById(C0001R.C0003id.view4);
                                        if ($r19 != null) {
                                            $i0 = C0001R.C0003id.view5;
                                            View $r10 = view.findViewById(C0001R.C0003id.view5);
                                            if ($r10 != null) {
                                                $i0 = C0001R.C0003id.walletTopUpLimitView;
                                                View $r11 = view.findViewById(C0001R.C0003id.walletTopUpLimitView);
                                                TextView $r122 = (TextView) $r11;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.what_does_this;
                                                    View $r112 = view.findViewById(C0001R.C0003id.what_does_this);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        ConstraintLayout $r152 = (ConstraintLayout) view;
                                                        KycViewBinding $r142 = new KycViewBinding($r152, textView, textView2, textView3, textView4, progressBar, kudiTextView, $r8, $r9, $r19, $r10, $r122, $r132);
                                                        return $r142;
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
        Resources $r162 = view.getResources();
        String $r172 = $r162.getResourceName($i0);
        NullPointerException $r182 = new NullPointerException("Missing required view with ID: ".concat($r172));
        throw $r182;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycViewBinding inflate(LayoutInflater layoutInflater) {
        KycViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.kyc_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        KycViewBinding $r3 = bind($r2);
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
