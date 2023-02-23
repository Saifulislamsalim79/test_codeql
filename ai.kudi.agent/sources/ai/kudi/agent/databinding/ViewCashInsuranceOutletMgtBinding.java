package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiBadgeButton;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewCashInsuranceOutletMgtBinding implements InterfaceC8209a {
    public final ConstraintLayout activePlanContainer;
    public final TextView errorMessageForInsurance;
    public final ImageView insuranceActiveImage;
    public final TextView insuranceActiveText;
    public final TextView insuranceBodyText;
    public final View insuranceContainerDivider;
    public final TextView insuranceContainerTitle;
    public final ImageView insuranceEmptyStateImage;
    public final TextView insuranceLearnMore;
    public final ProgressBar insuranceLoader;
    public final KudiButton insuranceSignUp;
    private final ConstraintLayout rootView;
    public final ConstraintLayout signUpContainer;
    public final KudiBadgeButton tryAgainButton;

    private ViewCashInsuranceOutletMgtBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, TextView textView2, TextView textView3, View view, TextView textView4, ImageView imageView2, TextView textView5, ProgressBar progressBar, KudiButton kudiButton, ConstraintLayout constraintLayout3, KudiBadgeButton kudiBadgeButton) {
        this.rootView = constraintLayout;
        this.activePlanContainer = constraintLayout2;
        this.errorMessageForInsurance = textView;
        this.insuranceActiveImage = imageView;
        this.insuranceActiveText = textView2;
        this.insuranceBodyText = textView3;
        this.insuranceContainerDivider = view;
        this.insuranceContainerTitle = textView4;
        this.insuranceEmptyStateImage = imageView2;
        this.insuranceLearnMore = textView5;
        this.insuranceLoader = progressBar;
        this.insuranceSignUp = kudiButton;
        this.signUpContainer = constraintLayout3;
        this.tryAgainButton = kudiBadgeButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewCashInsuranceOutletMgtBinding bind(View view) {
        int $i0 = C0001R.C0003id.activePlanContainer;
        View $r1 = view.findViewById(C0001R.C0003id.activePlanContainer);
        ConstraintLayout constraintLayout = (ConstraintLayout) $r1;
        if (constraintLayout != null) {
            $i0 = C0001R.C0003id.errorMessageForInsurance;
            View $r12 = view.findViewById(C0001R.C0003id.errorMessageForInsurance);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.insuranceActiveImage;
                View $r13 = view.findViewById(C0001R.C0003id.insuranceActiveImage);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.insuranceActiveText;
                    View $r14 = view.findViewById(C0001R.C0003id.insuranceActiveText);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.insuranceBodyText;
                        View $r15 = view.findViewById(C0001R.C0003id.insuranceBodyText);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.insuranceContainerDivider;
                            View $r16 = view.findViewById(C0001R.C0003id.insuranceContainerDivider);
                            if ($r16 != null) {
                                $i0 = C0001R.C0003id.insuranceContainerTitle;
                                View $r7 = view.findViewById(C0001R.C0003id.insuranceContainerTitle);
                                TextView $r8 = (TextView) $r7;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.insuranceEmptyStateImage;
                                    View $r72 = view.findViewById(C0001R.C0003id.insuranceEmptyStateImage);
                                    ImageView $r9 = (ImageView) $r72;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.insuranceLearnMore;
                                        View $r73 = view.findViewById(C0001R.C0003id.insuranceLearnMore);
                                        TextView $r10 = (TextView) $r73;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.insuranceLoader;
                                            View $r74 = view.findViewById(C0001R.C0003id.insuranceLoader);
                                            ProgressBar $r11 = (ProgressBar) $r74;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.insuranceSignUp;
                                                View $r75 = view.findViewById(C0001R.C0003id.insuranceSignUp);
                                                KudiButton $r122 = (KudiButton) $r75;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.signUpContainer;
                                                    View $r76 = view.findViewById(C0001R.C0003id.signUpContainer);
                                                    ConstraintLayout $r132 = (ConstraintLayout) $r76;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.tryAgainButton;
                                                        View $r77 = view.findViewById(C0001R.C0003id.tryAgainButton);
                                                        KudiBadgeButton $r142 = (KudiBadgeButton) $r77;
                                                        if ($r142 != null) {
                                                            ConstraintLayout $r162 = (ConstraintLayout) view;
                                                            ViewCashInsuranceOutletMgtBinding $r152 = new ViewCashInsuranceOutletMgtBinding($r162, constraintLayout, textView, imageView, textView2, textView3, $r16, $r8, $r9, $r10, $r11, $r122, $r132, $r142);
                                                            return $r152;
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
        Resources $r17 = view.getResources();
        String $r18 = $r17.getResourceName($i0);
        NullPointerException $r19 = new NullPointerException("Missing required view with ID: ".concat($r18));
        throw $r19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewCashInsuranceOutletMgtBinding inflate(LayoutInflater layoutInflater) {
        ViewCashInsuranceOutletMgtBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewCashInsuranceOutletMgtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_cash_insurance_outlet_mgt, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewCashInsuranceOutletMgtBinding $r3 = bind($r2);
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
