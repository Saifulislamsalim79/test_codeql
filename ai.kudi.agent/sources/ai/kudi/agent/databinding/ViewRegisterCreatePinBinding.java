package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewRegisterCreatePinBinding implements InterfaceC8209a {
    public final ConstraintLayout createPinRootLayout;
    public final TextView kudiTermsOfUseTextView;
    public final TextView pageSubtitle;
    public final TextView pageTitle;
    public final PinEntryView pinEntryView;
    private final ScrollView rootView;
    public final KudiButton submitPinButton;
    public final CheckBox termsAndConditionCheckbox;
    public final LinearLayout termsLinearLayout;

    private ViewRegisterCreatePinBinding(ScrollView scrollView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, PinEntryView pinEntryView, KudiButton kudiButton, CheckBox checkBox, LinearLayout linearLayout) {
        this.rootView = scrollView;
        this.createPinRootLayout = constraintLayout;
        this.kudiTermsOfUseTextView = textView;
        this.pageSubtitle = textView2;
        this.pageTitle = textView3;
        this.pinEntryView = pinEntryView;
        this.submitPinButton = kudiButton;
        this.termsAndConditionCheckbox = checkBox;
        this.termsLinearLayout = linearLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterCreatePinBinding bind(View view) {
        int $i0 = C0001R.C0003id.createPinRootLayout;
        View $r1 = view.findViewById(C0001R.C0003id.createPinRootLayout);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.kudiTermsOfUseTextView;
            View $r12 = view.findViewById(C0001R.C0003id.kudiTermsOfUseTextView);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.page_subtitle;
                View $r13 = view.findViewById(C0001R.C0003id.page_subtitle);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.page_title;
                    View $r14 = view.findViewById(C0001R.C0003id.page_title);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.pinEntryView;
                        View $r15 = view.findViewById(C0001R.C0003id.pinEntryView);
                        PinEntryView pinEntryView = (PinEntryView) $r15;
                        if (pinEntryView != null) {
                            $i0 = C0001R.C0003id.submitPinButton;
                            View $r16 = view.findViewById(C0001R.C0003id.submitPinButton);
                            KudiButton kudiButton = (KudiButton) $r16;
                            if (kudiButton != null) {
                                $i0 = C0001R.C0003id.termsAndConditionCheckbox;
                                View $r17 = view.findViewById(C0001R.C0003id.termsAndConditionCheckbox);
                                CheckBox $r8 = (CheckBox) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.termsLinearLayout;
                                    View $r18 = view.findViewById(C0001R.C0003id.termsLinearLayout);
                                    LinearLayout $r9 = (LinearLayout) $r18;
                                    if ($r9 != null) {
                                        ScrollView $r11 = (ScrollView) view;
                                        ViewRegisterCreatePinBinding $r10 = new ViewRegisterCreatePinBinding($r11, $r2, textView, textView2, textView3, pinEntryView, kudiButton, $r8, $r9);
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
    public static ViewRegisterCreatePinBinding inflate(LayoutInflater layoutInflater) {
        ViewRegisterCreatePinBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterCreatePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_register_create_pin, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewRegisterCreatePinBinding $r3 = bind($r2);
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
