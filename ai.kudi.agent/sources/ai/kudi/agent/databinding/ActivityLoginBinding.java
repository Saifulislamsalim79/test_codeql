package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityLoginBinding implements InterfaceC8209a {
    public final ImageView KudiText;
    public final FrameLayout container;
    public final ImageView fingerPrintView;
    public final ImageView kudiLogoView;
    public final TextView kudiTermsOfUseTextView;
    public final KudiButton loginButton;
    public final KudiInputField phoneNumberEditText;
    public final KudiInputField pinEditText;
    public final CircleImageView profilePic;
    public final KudiTextView resetPinTextView;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final CheckBox termsAndConditionCheckbox;
    public final LinearLayout termsLinearLayout;
    public final BottomCreateAcctViewBinding view;
    public final TextView welcomeText;

    private ActivityLoginBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, ImageView imageView3, TextView textView, KudiButton kudiButton, KudiInputField kudiInputField, KudiInputField kudiInputField2, CircleImageView circleImageView, KudiTextView kudiTextView, ScrollView scrollView, CheckBox checkBox, LinearLayout linearLayout, BottomCreateAcctViewBinding bottomCreateAcctViewBinding, TextView textView2) {
        this.rootView = constraintLayout;
        this.KudiText = imageView;
        this.container = frameLayout;
        this.fingerPrintView = imageView2;
        this.kudiLogoView = imageView3;
        this.kudiTermsOfUseTextView = textView;
        this.loginButton = kudiButton;
        this.phoneNumberEditText = kudiInputField;
        this.pinEditText = kudiInputField2;
        this.profilePic = circleImageView;
        this.resetPinTextView = kudiTextView;
        this.scrollView = scrollView;
        this.termsAndConditionCheckbox = checkBox;
        this.termsLinearLayout = linearLayout;
        this.view = bottomCreateAcctViewBinding;
        this.welcomeText = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityLoginBinding bind(View view) {
        int $i0 = C0001R.C0003id.KudiText;
        View $r1 = view.findViewById(C0001R.C0003id.KudiText);
        ImageView imageView = (ImageView) $r1;
        if (imageView != null) {
            $i0 = C0001R.C0003id.container;
            View $r12 = view.findViewById(C0001R.C0003id.container);
            FrameLayout frameLayout = (FrameLayout) $r12;
            if (frameLayout != null) {
                $i0 = C0001R.C0003id.fingerPrintView;
                View $r13 = view.findViewById(C0001R.C0003id.fingerPrintView);
                ImageView imageView2 = (ImageView) $r13;
                if (imageView2 != null) {
                    $i0 = C0001R.C0003id.kudiLogoView;
                    View $r14 = view.findViewById(C0001R.C0003id.kudiLogoView);
                    ImageView imageView3 = (ImageView) $r14;
                    if (imageView3 != null) {
                        $i0 = C0001R.C0003id.kudiTermsOfUseTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.kudiTermsOfUseTextView);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.loginButton;
                            View $r16 = view.findViewById(C0001R.C0003id.loginButton);
                            KudiButton kudiButton = (KudiButton) $r16;
                            if (kudiButton != null) {
                                $i0 = C0001R.C0003id.phoneNumberEditText;
                                View $r17 = view.findViewById(C0001R.C0003id.phoneNumberEditText);
                                KudiInputField $r8 = (KudiInputField) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.pinEditText;
                                    View $r18 = view.findViewById(C0001R.C0003id.pinEditText);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.profilePic;
                                        View $r19 = view.findViewById(C0001R.C0003id.profilePic);
                                        CircleImageView $r10 = (CircleImageView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.resetPinTextView;
                                            View $r110 = view.findViewById(C0001R.C0003id.resetPinTextView);
                                            KudiTextView $r11 = (KudiTextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.scroll_view;
                                                View $r111 = view.findViewById(C0001R.C0003id.scroll_view);
                                                ScrollView $r122 = (ScrollView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.termsAndConditionCheckbox;
                                                    View $r112 = view.findViewById(C0001R.C0003id.termsAndConditionCheckbox);
                                                    CheckBox $r132 = (CheckBox) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.termsLinearLayout;
                                                        View $r113 = view.findViewById(C0001R.C0003id.termsLinearLayout);
                                                        LinearLayout $r142 = (LinearLayout) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.view;
                                                            View $r114 = view.findViewById(C0001R.C0003id.view);
                                                            if ($r114 != null) {
                                                                BottomCreateAcctViewBinding $r152 = BottomCreateAcctViewBinding.bind($r114);
                                                                $i0 = C0001R.C0003id.welcomeText;
                                                                View $r115 = view.findViewById(C0001R.C0003id.welcomeText);
                                                                TextView $r162 = (TextView) $r115;
                                                                if ($r162 != null) {
                                                                    ConstraintLayout $r182 = (ConstraintLayout) view;
                                                                    ActivityLoginBinding $r172 = new ActivityLoginBinding($r182, imageView, frameLayout, imageView2, imageView3, textView, kudiButton, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162);
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
    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        ActivityLoginBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityLoginBinding $r3 = bind($r2);
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
