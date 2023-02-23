package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCreateOutletBinding implements InterfaceC8209a {
    public final KudiInputField createOutletAddressInputField;
    public final KudiInputField createOutletAreaInputField;
    public final KudiButton createOutletContinueButton;
    public final KudiInputField createOutletLgaInputField;
    public final KudiInputField createOutletOutletNameInputField;
    public final KudiInputField createOutletPhoneNoInputField;
    public final KudiInputField createOutletStateInputField;
    private final ScrollView rootView;
    public final KudiTextView textView14;
    public final KudiTextView textView35;

    private FragmentCreateOutletBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiButton kudiButton, KudiInputField kudiInputField3, KudiInputField kudiInputField4, KudiInputField kudiInputField5, KudiInputField kudiInputField6, KudiTextView kudiTextView, KudiTextView kudiTextView2) {
        this.rootView = scrollView;
        this.createOutletAddressInputField = kudiInputField;
        this.createOutletAreaInputField = kudiInputField2;
        this.createOutletContinueButton = kudiButton;
        this.createOutletLgaInputField = kudiInputField3;
        this.createOutletOutletNameInputField = kudiInputField4;
        this.createOutletPhoneNoInputField = kudiInputField5;
        this.createOutletStateInputField = kudiInputField6;
        this.textView14 = kudiTextView;
        this.textView35 = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateOutletBinding bind(View view) {
        int $i0 = C0001R.C0003id.createOutletAddressInputField;
        View $r1 = view.findViewById(C0001R.C0003id.createOutletAddressInputField);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.createOutletAreaInputField;
            View $r12 = view.findViewById(C0001R.C0003id.createOutletAreaInputField);
            KudiInputField kudiInputField = (KudiInputField) $r12;
            if (kudiInputField != null) {
                $i0 = C0001R.C0003id.createOutletContinueButton;
                View $r13 = view.findViewById(C0001R.C0003id.createOutletContinueButton);
                KudiButton kudiButton = (KudiButton) $r13;
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.createOutletLgaInputField;
                    View $r14 = view.findViewById(C0001R.C0003id.createOutletLgaInputField);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.createOutletOutletNameInputField;
                        View $r15 = view.findViewById(C0001R.C0003id.createOutletOutletNameInputField);
                        KudiInputField kudiInputField3 = (KudiInputField) $r15;
                        if (kudiInputField3 != null) {
                            $i0 = C0001R.C0003id.createOutletPhoneNoInputField;
                            View $r16 = view.findViewById(C0001R.C0003id.createOutletPhoneNoInputField);
                            KudiInputField kudiInputField4 = (KudiInputField) $r16;
                            if (kudiInputField4 != null) {
                                $i0 = C0001R.C0003id.createOutletStateInputField;
                                View $r17 = view.findViewById(C0001R.C0003id.createOutletStateInputField);
                                KudiInputField $r8 = (KudiInputField) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.textView14;
                                    View $r18 = view.findViewById(C0001R.C0003id.textView14);
                                    KudiTextView $r9 = (KudiTextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.textView35;
                                        View $r19 = view.findViewById(C0001R.C0003id.textView35);
                                        KudiTextView $r10 = (KudiTextView) $r19;
                                        if ($r10 != null) {
                                            ScrollView $r122 = (ScrollView) view;
                                            FragmentCreateOutletBinding $r11 = new FragmentCreateOutletBinding($r122, $r2, kudiInputField, kudiButton, kudiInputField2, kudiInputField3, kudiInputField4, $r8, $r9, $r10);
                                            return $r11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateOutletBinding inflate(LayoutInflater layoutInflater) {
        FragmentCreateOutletBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateOutletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_create_outlet, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCreateOutletBinding $r3 = bind($r2);
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
