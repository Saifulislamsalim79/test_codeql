package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransferToBankCustomersBinding implements InterfaceC8209a {
    public final KudiButton continueToNextPage;
    public final TextView pageTitle;
    public final KudiInputField reasonField;
    public final KudiInputField recipientPhoneEditText;
    private final ScrollView rootView;
    public final SwitchCompat sendSmsToggle;
    public final TextView sendSmsToggleLabel;
    public final KudiInputField senderPhoneEditText;

    private FragmentTransferToBankCustomersBinding(ScrollView scrollView, KudiButton kudiButton, TextView textView, KudiInputField kudiInputField, KudiInputField kudiInputField2, SwitchCompat switchCompat, TextView textView2, KudiInputField kudiInputField3) {
        this.rootView = scrollView;
        this.continueToNextPage = kudiButton;
        this.pageTitle = textView;
        this.reasonField = kudiInputField;
        this.recipientPhoneEditText = kudiInputField2;
        this.sendSmsToggle = switchCompat;
        this.sendSmsToggleLabel = textView2;
        this.senderPhoneEditText = kudiInputField3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankCustomersBinding bind(View view) {
        int $i0 = C0001R.C0003id.continueToNextPage;
        View $r1 = view.findViewById(C0001R.C0003id.continueToNextPage);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.pageTitle;
            View $r12 = view.findViewById(C0001R.C0003id.pageTitle);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.reasonField;
                View $r13 = view.findViewById(C0001R.C0003id.reasonField);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.recipientPhoneEditText;
                    View $r14 = view.findViewById(C0001R.C0003id.recipientPhoneEditText);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.sendSmsToggle;
                        View $r15 = view.findViewById(C0001R.C0003id.sendSmsToggle);
                        SwitchCompat switchCompat = (SwitchCompat) $r15;
                        if (switchCompat != null) {
                            $i0 = C0001R.C0003id.sendSmsToggleLabel;
                            View $r16 = view.findViewById(C0001R.C0003id.sendSmsToggleLabel);
                            TextView textView = (TextView) $r16;
                            if (textView != null) {
                                $i0 = C0001R.C0003id.senderPhoneEditText;
                                View $r17 = view.findViewById(C0001R.C0003id.senderPhoneEditText);
                                KudiInputField $r8 = (KudiInputField) $r17;
                                if ($r8 != null) {
                                    ScrollView $r10 = (ScrollView) view;
                                    FragmentTransferToBankCustomersBinding $r9 = new FragmentTransferToBankCustomersBinding($r10, $r2, $r3, kudiInputField, kudiInputField2, switchCompat, textView, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankCustomersBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransferToBankCustomersBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankCustomersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transfer_to_bank_customers, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransferToBankCustomersBinding $r3 = bind($r2);
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
