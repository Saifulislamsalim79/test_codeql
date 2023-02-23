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
public final class FragmentResetPin2Binding implements InterfaceC8209a {
    public final KudiInputField confirmNewPinView;
    public final KudiInputField currentPinView;
    public final KudiInputField newPinView;
    public final KudiButton resetPinView;
    private final ScrollView rootView;

    private FragmentResetPin2Binding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiButton kudiButton) {
        this.rootView = scrollView;
        this.confirmNewPinView = kudiInputField;
        this.currentPinView = kudiInputField2;
        this.newPinView = kudiInputField3;
        this.resetPinView = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetPin2Binding bind(View view) {
        int $i0 = C0001R.C0003id.confirmNewPinView;
        View $r1 = view.findViewById(C0001R.C0003id.confirmNewPinView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.currentPinView;
            View $r12 = view.findViewById(C0001R.C0003id.currentPinView);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.newPinView;
                View $r13 = view.findViewById(C0001R.C0003id.newPinView);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.resetPinView;
                    View $r14 = view.findViewById(C0001R.C0003id.resetPinView);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        FragmentResetPin2Binding $r6 = new FragmentResetPin2Binding((ScrollView) view, $r2, $r3, $r4, kudiButton);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetPin2Binding inflate(LayoutInflater layoutInflater) {
        FragmentResetPin2Binding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentResetPin2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_reset_pin2, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentResetPin2Binding $r3 = bind($r2);
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
