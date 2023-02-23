package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewSignupInsuranceBinding implements InterfaceC8209a {
    public final TextView addEmployees;
    public final TextView congratsLabel;
    public final KudiButton continueButton;
    public final LinearLayout employeesContainer;
    public final TextView errorMessage;
    public final KudiButton goBack;
    public final ImageView insuranceActiveImage;
    public final TextView insuranceActiveText;
    public final TextView learnMoreTextView;
    public final KudiInputField phoneNumberInputField;
    private final ScrollView rootView;
    public final ConstraintLayout signUpContainer;
    public final ConstraintLayout successContainer;
    public final TextView termsAndCondition;
    public final TextView textView16;
    public final TextView textView40;

    private ViewSignupInsuranceBinding(ScrollView scrollView, TextView textView, TextView textView2, KudiButton kudiButton, LinearLayout linearLayout, TextView textView3, KudiButton kudiButton2, ImageView imageView, TextView textView4, TextView textView5, KudiInputField kudiInputField, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = scrollView;
        this.addEmployees = textView;
        this.congratsLabel = textView2;
        this.continueButton = kudiButton;
        this.employeesContainer = linearLayout;
        this.errorMessage = textView3;
        this.goBack = kudiButton2;
        this.insuranceActiveImage = imageView;
        this.insuranceActiveText = textView4;
        this.learnMoreTextView = textView5;
        this.phoneNumberInputField = kudiInputField;
        this.signUpContainer = constraintLayout;
        this.successContainer = constraintLayout2;
        this.termsAndCondition = textView6;
        this.textView16 = textView7;
        this.textView40 = textView8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewSignupInsuranceBinding bind(View view) {
        int $i0 = C0001R.C0003id.addEmployees;
        View $r1 = view.findViewById(C0001R.C0003id.addEmployees);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.congrats_label;
            View $r12 = view.findViewById(C0001R.C0003id.congrats_label);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.continueButton;
                View $r13 = view.findViewById(C0001R.C0003id.continueButton);
                KudiButton kudiButton = (KudiButton) $r13;
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.employeesContainer;
                    View $r14 = view.findViewById(C0001R.C0003id.employeesContainer);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.errorMessage;
                        View $r15 = view.findViewById(C0001R.C0003id.errorMessage);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.goBack;
                            View $r16 = view.findViewById(C0001R.C0003id.goBack);
                            KudiButton kudiButton2 = (KudiButton) $r16;
                            if (kudiButton2 != null) {
                                $i0 = C0001R.C0003id.insuranceActiveImage;
                                View $r17 = view.findViewById(C0001R.C0003id.insuranceActiveImage);
                                ImageView $r8 = (ImageView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.insuranceActiveText;
                                    View $r18 = view.findViewById(C0001R.C0003id.insuranceActiveText);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.learnMoreTextView;
                                        View $r19 = view.findViewById(C0001R.C0003id.learnMoreTextView);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.phoneNumberInputField;
                                            View $r110 = view.findViewById(C0001R.C0003id.phoneNumberInputField);
                                            KudiInputField $r11 = (KudiInputField) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.signUpContainer;
                                                View $r111 = view.findViewById(C0001R.C0003id.signUpContainer);
                                                ConstraintLayout $r122 = (ConstraintLayout) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.successContainer;
                                                    View $r112 = view.findViewById(C0001R.C0003id.successContainer);
                                                    ConstraintLayout $r132 = (ConstraintLayout) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.termsAndCondition;
                                                        View $r113 = view.findViewById(C0001R.C0003id.termsAndCondition);
                                                        TextView $r142 = (TextView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.textView16;
                                                            View $r114 = view.findViewById(C0001R.C0003id.textView16);
                                                            TextView $r152 = (TextView) $r114;
                                                            if ($r152 != null) {
                                                                $i0 = C0001R.C0003id.textView40;
                                                                View $r115 = view.findViewById(C0001R.C0003id.textView40);
                                                                TextView $r162 = (TextView) $r115;
                                                                if ($r162 != null) {
                                                                    ScrollView $r182 = (ScrollView) view;
                                                                    ViewSignupInsuranceBinding $r172 = new ViewSignupInsuranceBinding($r182, textView, textView2, kudiButton, linearLayout, textView3, kudiButton2, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162);
                                                                    return $r172;
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
            }
        }
        Resources $r192 = view.getResources();
        String $r20 = $r192.getResourceName($i0);
        NullPointerException $r21 = new NullPointerException("Missing required view with ID: ".concat($r20));
        throw $r21;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewSignupInsuranceBinding inflate(LayoutInflater layoutInflater) {
        ViewSignupInsuranceBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewSignupInsuranceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_signup_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewSignupInsuranceBinding $r3 = bind($r2);
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
