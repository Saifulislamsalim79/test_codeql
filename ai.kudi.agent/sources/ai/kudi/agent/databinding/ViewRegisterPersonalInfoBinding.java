package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiRadioButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewRegisterPersonalInfoBinding implements InterfaceC8209a {
    public final KudiInputField closestLandmarkField;
    public final KudiButton continueToNextPage;
    public final KudiRadioButton femaleRadioButton;
    public final KudiInputField lgaField;
    public final KudiRadioButton maleRadioButton;
    public final TextView pageSubtitle;
    public final TextView pageTitle;
    public final RadioGroup radioGroup2;
    public final KudiInputField residentialAddressField;
    private final ScrollView rootView;
    public final KudiInputField stateField;
    public final TextView textView32;

    private ViewRegisterPersonalInfoBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiButton kudiButton, KudiRadioButton kudiRadioButton, KudiInputField kudiInputField2, KudiRadioButton kudiRadioButton2, TextView textView, TextView textView2, RadioGroup radioGroup, KudiInputField kudiInputField3, KudiInputField kudiInputField4, TextView textView3) {
        this.rootView = scrollView;
        this.closestLandmarkField = kudiInputField;
        this.continueToNextPage = kudiButton;
        this.femaleRadioButton = kudiRadioButton;
        this.lgaField = kudiInputField2;
        this.maleRadioButton = kudiRadioButton2;
        this.pageSubtitle = textView;
        this.pageTitle = textView2;
        this.radioGroup2 = radioGroup;
        this.residentialAddressField = kudiInputField3;
        this.stateField = kudiInputField4;
        this.textView32 = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterPersonalInfoBinding bind(View view) {
        int $i0 = C0001R.C0003id.closestLandmarkField;
        View $r1 = view.findViewById(C0001R.C0003id.closestLandmarkField);
        KudiInputField kudiInputField = (KudiInputField) $r1;
        if (kudiInputField != null) {
            $i0 = C0001R.C0003id.continueToNextPage;
            View $r12 = view.findViewById(C0001R.C0003id.continueToNextPage);
            KudiButton kudiButton = (KudiButton) $r12;
            if (kudiButton != null) {
                $i0 = C0001R.C0003id.femaleRadioButton;
                View $r13 = view.findViewById(C0001R.C0003id.femaleRadioButton);
                KudiRadioButton kudiRadioButton = (KudiRadioButton) $r13;
                if (kudiRadioButton != null) {
                    $i0 = C0001R.C0003id.lgaField;
                    View $r14 = view.findViewById(C0001R.C0003id.lgaField);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.maleRadioButton;
                        View $r15 = view.findViewById(C0001R.C0003id.maleRadioButton);
                        KudiRadioButton kudiRadioButton2 = (KudiRadioButton) $r15;
                        if (kudiRadioButton2 != null) {
                            $i0 = C0001R.C0003id.page_subtitle;
                            View $r16 = view.findViewById(C0001R.C0003id.page_subtitle);
                            TextView textView = (TextView) $r16;
                            if (textView != null) {
                                $i0 = C0001R.C0003id.page_title;
                                View $r17 = view.findViewById(C0001R.C0003id.page_title);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.radioGroup2;
                                    View $r18 = view.findViewById(C0001R.C0003id.radioGroup2);
                                    RadioGroup $r9 = (RadioGroup) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.residentialAddressField;
                                        View $r19 = view.findViewById(C0001R.C0003id.residentialAddressField);
                                        KudiInputField $r10 = (KudiInputField) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.stateField;
                                            View $r110 = view.findViewById(C0001R.C0003id.stateField);
                                            KudiInputField $r11 = (KudiInputField) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.textView32;
                                                View $r111 = view.findViewById(C0001R.C0003id.textView32);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    ScrollView $r142 = (ScrollView) view;
                                                    ViewRegisterPersonalInfoBinding $r132 = new ViewRegisterPersonalInfoBinding($r142, kudiInputField, kudiButton, kudiRadioButton, kudiInputField2, kudiRadioButton2, textView, $r8, $r9, $r10, $r11, $r122);
                                                    return $r132;
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
        Resources $r152 = view.getResources();
        String $r162 = $r152.getResourceName($i0);
        NullPointerException $r172 = new NullPointerException("Missing required view with ID: ".concat($r162));
        throw $r172;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterPersonalInfoBinding inflate(LayoutInflater layoutInflater) {
        ViewRegisterPersonalInfoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterPersonalInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_register_personal_info, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewRegisterPersonalInfoBinding $r3 = bind($r2);
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
