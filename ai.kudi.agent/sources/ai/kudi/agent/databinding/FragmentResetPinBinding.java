package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentResetPinBinding implements InterfaceC8209a {
    public final KudiInputField confirmPinInputView;
    public final KudiTextView headerText;
    public final KudiInputField newPinInputView;
    public final KudiButton resetPinButton;
    private final ConstraintLayout rootView;
    public final KudiTextView subtitleText;

    private FragmentResetPinBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, KudiTextView kudiTextView, KudiInputField kudiInputField2, KudiButton kudiButton, KudiTextView kudiTextView2) {
        this.rootView = constraintLayout;
        this.confirmPinInputView = kudiInputField;
        this.headerText = kudiTextView;
        this.newPinInputView = kudiInputField2;
        this.resetPinButton = kudiButton;
        this.subtitleText = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetPinBinding bind(View view) {
        int $i0 = C0001R.C0003id.confirmPinInputView;
        View $r1 = view.findViewById(C0001R.C0003id.confirmPinInputView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.headerText;
            View $r12 = view.findViewById(C0001R.C0003id.headerText);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.newPinInputView;
                View $r13 = view.findViewById(C0001R.C0003id.newPinInputView);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.resetPinButton;
                    View $r14 = view.findViewById(C0001R.C0003id.resetPinButton);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0001R.C0003id.subtitleText;
                        View $r15 = view.findViewById(C0001R.C0003id.subtitleText);
                        KudiTextView kudiTextView = (KudiTextView) $r15;
                        if (kudiTextView != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            FragmentResetPinBinding $r7 = new FragmentResetPinBinding($r8, $r2, $r3, $r4, kudiButton, kudiTextView);
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
    public static FragmentResetPinBinding inflate(LayoutInflater layoutInflater) {
        FragmentResetPinBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_reset_pin, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentResetPinBinding $r3 = bind($r2);
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
