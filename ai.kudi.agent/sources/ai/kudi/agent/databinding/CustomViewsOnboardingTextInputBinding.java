package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CustomViewsOnboardingTextInputBinding implements InterfaceC8209a {
    public final ImageView errorImageView;
    public final TextView errorTextView;
    public final Guideline fieldInputGuideline;
    public final EditText inputEditText;
    public final TextView inputTextView;
    public final ProgressBar progressLoader;
    private final ConstraintLayout rootView;

    private CustomViewsOnboardingTextInputBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Guideline guideline, EditText editText, TextView textView2, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.errorImageView = imageView;
        this.errorTextView = textView;
        this.fieldInputGuideline = guideline;
        this.inputEditText = editText;
        this.inputTextView = textView2;
        this.progressLoader = progressBar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomViewsOnboardingTextInputBinding bind(View view) {
        int $i0 = C0001R.C0003id.errorImageView;
        View $r1 = view.findViewById(C0001R.C0003id.errorImageView);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.errorTextView;
            View $r12 = view.findViewById(C0001R.C0003id.errorTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.fieldInputGuideline;
                View $r13 = view.findViewById(C0001R.C0003id.fieldInputGuideline);
                Guideline guideline = (Guideline) $r13;
                if (guideline != null) {
                    $i0 = C0001R.C0003id.inputEditText;
                    View $r14 = view.findViewById(C0001R.C0003id.inputEditText);
                    EditText editText = (EditText) $r14;
                    if (editText != null) {
                        $i0 = C0001R.C0003id.inputTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.inputTextView);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.progressLoader;
                            View $r16 = view.findViewById(C0001R.C0003id.progressLoader);
                            ProgressBar progressBar = (ProgressBar) $r16;
                            if (progressBar != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                CustomViewsOnboardingTextInputBinding $r8 = new CustomViewsOnboardingTextInputBinding($r9, $r2, $r3, guideline, editText, textView, progressBar);
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
    public static CustomViewsOnboardingTextInputBinding inflate(LayoutInflater layoutInflater) {
        CustomViewsOnboardingTextInputBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomViewsOnboardingTextInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.custom_views_onboarding_text_input, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CustomViewsOnboardingTextInputBinding $r3 = bind($r2);
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
