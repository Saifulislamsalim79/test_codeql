package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CreateSavingPinFragmentBinding implements InterfaceC8209a {
    public final KudiInputField confirmNewPinView;
    public final KudiButton kbSendOtp;
    public final KudiInputField newPinView;
    private final FrameLayout rootView;
    public final TextView tvCreatePinInfo;

    private CreateSavingPinFragmentBinding(FrameLayout frameLayout, KudiInputField kudiInputField, KudiButton kudiButton, KudiInputField kudiInputField2, TextView textView) {
        this.rootView = frameLayout;
        this.confirmNewPinView = kudiInputField;
        this.kbSendOtp = kudiButton;
        this.newPinView = kudiInputField2;
        this.tvCreatePinInfo = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateSavingPinFragmentBinding bind(View view) {
        int $i0 = C0456R.C0458id.confirmNewPinView;
        View $r1 = view.findViewById($i0);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.kbSendOtp;
            View $r12 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.newPinView;
                View $r13 = view.findViewById($i0);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    $i0 = C0456R.C0458id.tvCreatePinInfo;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        CreateSavingPinFragmentBinding $r6 = new CreateSavingPinFragmentBinding((FrameLayout) view, $r2, $r3, $r4, $r5);
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
    public static CreateSavingPinFragmentBinding inflate(LayoutInflater layoutInflater) {
        CreateSavingPinFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateSavingPinFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.create_saving_pin_fragment;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CreateSavingPinFragmentBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
