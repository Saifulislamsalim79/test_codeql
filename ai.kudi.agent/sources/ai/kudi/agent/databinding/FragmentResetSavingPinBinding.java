package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentResetSavingPinBinding implements InterfaceC8209a {
    public final KudiInputField confirmNewPinView;
    public final KudiButton kbSendOtp;
    public final KudiInputField newPinView;
    private final ScrollView rootView;

    private FragmentResetSavingPinBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiButton kudiButton, KudiInputField kudiInputField2) {
        this.rootView = scrollView;
        this.confirmNewPinView = kudiInputField;
        this.kbSendOtp = kudiButton;
        this.newPinView = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetSavingPinBinding bind(View view) {
        int $i0 = C0001R.C0003id.confirmNewPinView;
        View $r1 = view.findViewById(C0001R.C0003id.confirmNewPinView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.kbSendOtp;
            View $r12 = view.findViewById(C0001R.C0003id.kbSendOtp);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.newPinView;
                View $r13 = view.findViewById(C0001R.C0003id.newPinView);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    ScrollView $r6 = (ScrollView) view;
                    FragmentResetSavingPinBinding $r5 = new FragmentResetSavingPinBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetSavingPinBinding inflate(LayoutInflater layoutInflater) {
        FragmentResetSavingPinBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetSavingPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_reset_saving_pin, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentResetSavingPinBinding $r3 = bind($r2);
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
