package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentP2pNameAndPhoneNoBinding implements InterfaceC8209a {
    public final TextView p2pAccountNameTextView;
    public final ProgressBar p2pAcctNameLoading;
    public final KudiInputField p2pRecipientPhoneEditText;
    public final KudiInputField p2pRemarkEditText;
    public final KudiButton p2pcontinueButton;
    private final ScrollView rootView;

    private FragmentP2pNameAndPhoneNoBinding(ScrollView scrollView, TextView textView, ProgressBar progressBar, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiButton kudiButton) {
        this.rootView = scrollView;
        this.p2pAccountNameTextView = textView;
        this.p2pAcctNameLoading = progressBar;
        this.p2pRecipientPhoneEditText = kudiInputField;
        this.p2pRemarkEditText = kudiInputField2;
        this.p2pcontinueButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentP2pNameAndPhoneNoBinding bind(View view) {
        int $i0 = C0001R.C0003id.p2pAccountNameTextView;
        View $r1 = view.findViewById(C0001R.C0003id.p2pAccountNameTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.p2pAcctNameLoading;
            View $r12 = view.findViewById(C0001R.C0003id.p2pAcctNameLoading);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.p2pRecipientPhoneEditText;
                View $r13 = view.findViewById(C0001R.C0003id.p2pRecipientPhoneEditText);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.p2pRemarkEditText;
                    View $r14 = view.findViewById(C0001R.C0003id.p2pRemarkEditText);
                    KudiInputField kudiInputField = (KudiInputField) $r14;
                    if (kudiInputField != null) {
                        $i0 = C0001R.C0003id.p2pcontinueButton;
                        View $r15 = view.findViewById(C0001R.C0003id.p2pcontinueButton);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            ScrollView $r8 = (ScrollView) view;
                            FragmentP2pNameAndPhoneNoBinding $r7 = new FragmentP2pNameAndPhoneNoBinding($r8, $r2, $r3, $r4, kudiInputField, kudiButton);
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
    public static FragmentP2pNameAndPhoneNoBinding inflate(LayoutInflater layoutInflater) {
        FragmentP2pNameAndPhoneNoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentP2pNameAndPhoneNoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_p2p_name_and_phone_no, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentP2pNameAndPhoneNoBinding $r3 = bind($r2);
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
