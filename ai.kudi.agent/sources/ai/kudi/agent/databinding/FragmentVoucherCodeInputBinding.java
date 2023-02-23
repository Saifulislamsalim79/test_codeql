package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentVoucherCodeInputBinding implements InterfaceC8209a {
    public final LinearLayout linearLayout4;
    public final PinpadView pinTextInput;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final KudiButton sendVoucherButton;
    public final EditText voucherEditText;

    private FragmentVoucherCodeInputBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, PinpadView pinpadView, ProgressBar progressBar, KudiButton kudiButton, EditText editText) {
        this.rootView = relativeLayout;
        this.linearLayout4 = linearLayout;
        this.pinTextInput = pinpadView;
        this.progressBar = progressBar;
        this.sendVoucherButton = kudiButton;
        this.voucherEditText = editText;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentVoucherCodeInputBinding bind(View view) {
        int $i0 = C0001R.C0003id.linearLayout4;
        View $r1 = view.findViewById(C0001R.C0003id.linearLayout4);
        LinearLayout $r2 = (LinearLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.pinTextInput;
            View $r12 = view.findViewById(C0001R.C0003id.pinTextInput);
            PinpadView $r3 = (PinpadView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.progressBar;
                View $r13 = view.findViewById(C0001R.C0003id.progressBar);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.sendVoucherButton;
                    View $r14 = view.findViewById(C0001R.C0003id.sendVoucherButton);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0001R.C0003id.voucherEditText;
                        View $r15 = view.findViewById(C0001R.C0003id.voucherEditText);
                        EditText editText = (EditText) $r15;
                        if (editText != null) {
                            RelativeLayout $r8 = (RelativeLayout) view;
                            FragmentVoucherCodeInputBinding $r7 = new FragmentVoucherCodeInputBinding($r8, $r2, $r3, $r4, kudiButton, editText);
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
    public static FragmentVoucherCodeInputBinding inflate(LayoutInflater layoutInflater) {
        FragmentVoucherCodeInputBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentVoucherCodeInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_voucher_code_input, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentVoucherCodeInputBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        RelativeLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public RelativeLayout getRoot() {
        RelativeLayout r1 = this.rootView;
        return r1;
    }
}
