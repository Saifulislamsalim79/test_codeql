package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPosChangeAddressBinding implements InterfaceC8209a {
    public final KudiInputField addressView;
    public final KudiButton continueButton;
    public final KudiInputField lgaField;
    public final KudiInputField posAreaInputField;
    private final ConstraintLayout rootView;
    public final KudiInputField statesField;

    private FragmentPosChangeAddressBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, KudiButton kudiButton, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiInputField kudiInputField4) {
        this.rootView = constraintLayout;
        this.addressView = kudiInputField;
        this.continueButton = kudiButton;
        this.lgaField = kudiInputField2;
        this.posAreaInputField = kudiInputField3;
        this.statesField = kudiInputField4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosChangeAddressBinding bind(View view) {
        int $i0 = C0001R.C0003id.addressView;
        View $r1 = view.findViewById(C0001R.C0003id.addressView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.continueButton;
            View $r12 = view.findViewById(C0001R.C0003id.continueButton);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.lgaField;
                View $r13 = view.findViewById(C0001R.C0003id.lgaField);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.posAreaInputField;
                    View $r14 = view.findViewById(C0001R.C0003id.posAreaInputField);
                    KudiInputField kudiInputField = (KudiInputField) $r14;
                    if (kudiInputField != null) {
                        $i0 = C0001R.C0003id.statesField;
                        View $r15 = view.findViewById(C0001R.C0003id.statesField);
                        KudiInputField kudiInputField2 = (KudiInputField) $r15;
                        if (kudiInputField2 != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            FragmentPosChangeAddressBinding $r7 = new FragmentPosChangeAddressBinding($r8, $r2, $r3, $r4, kudiInputField, kudiInputField2);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosChangeAddressBinding inflate(LayoutInflater layoutInflater) {
        FragmentPosChangeAddressBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosChangeAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pos_change_address, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPosChangeAddressBinding $r3 = bind($r2);
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
