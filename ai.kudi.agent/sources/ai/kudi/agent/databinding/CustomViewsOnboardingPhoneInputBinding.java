package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CustomViewsOnboardingPhoneInputBinding implements InterfaceC8209a {
    public final TextView countryCode;
    public final ImageView errorImageView;
    public final TextView errorTextView;
    public final Guideline fieldInputGuideline;
    public final EditText inputEditText;
    public final LinearLayout inputGroup;
    public final TextView inputTextView;
    public final ProgressBar progressLoader;
    private final ConstraintLayout rootView;

    private CustomViewsOnboardingPhoneInputBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, Guideline guideline, EditText editText, LinearLayout linearLayout, TextView textView3, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.countryCode = textView;
        this.errorImageView = imageView;
        this.errorTextView = textView2;
        this.fieldInputGuideline = guideline;
        this.inputEditText = editText;
        this.inputGroup = linearLayout;
        this.inputTextView = textView3;
        this.progressLoader = progressBar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomViewsOnboardingPhoneInputBinding bind(View view) {
        int $i0 = C0001R.C0003id.countryCode;
        View $r1 = view.findViewById(C0001R.C0003id.countryCode);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.errorImageView;
            View $r12 = view.findViewById(C0001R.C0003id.errorImageView);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                $i0 = C0001R.C0003id.errorTextView;
                View $r13 = view.findViewById(C0001R.C0003id.errorTextView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.fieldInputGuideline;
                    View $r14 = view.findViewById(C0001R.C0003id.fieldInputGuideline);
                    Guideline guideline = (Guideline) $r14;
                    if (guideline != null) {
                        $i0 = C0001R.C0003id.inputEditText;
                        View $r15 = view.findViewById(C0001R.C0003id.inputEditText);
                        EditText editText = (EditText) $r15;
                        if (editText != null) {
                            $i0 = C0001R.C0003id.inputGroup;
                            View $r16 = view.findViewById(C0001R.C0003id.inputGroup);
                            LinearLayout linearLayout = (LinearLayout) $r16;
                            if (linearLayout != null) {
                                $i0 = C0001R.C0003id.inputTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.inputTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.progressLoader;
                                    View $r18 = view.findViewById(C0001R.C0003id.progressLoader);
                                    ProgressBar $r9 = (ProgressBar) $r18;
                                    if ($r9 != null) {
                                        ConstraintLayout $r11 = (ConstraintLayout) view;
                                        CustomViewsOnboardingPhoneInputBinding $r10 = new CustomViewsOnboardingPhoneInputBinding($r11, $r2, imageView, textView, guideline, editText, linearLayout, $r8, $r9);
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
    public static CustomViewsOnboardingPhoneInputBinding inflate(LayoutInflater layoutInflater) {
        CustomViewsOnboardingPhoneInputBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomViewsOnboardingPhoneInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.custom_views_onboarding_phone_input, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CustomViewsOnboardingPhoneInputBinding $r3 = bind($r2);
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
