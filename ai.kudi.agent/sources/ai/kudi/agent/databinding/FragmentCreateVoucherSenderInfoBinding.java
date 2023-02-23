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
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCreateVoucherSenderInfoBinding implements InterfaceC8209a {
    public final TextView amountTextView;
    public final KudiButton continueButton;
    public final TextView editLabelTextView;
    public final ConstraintLayout infoLayout;
    public final TextView recipientPhoneNumberTextView;
    public final TextView recipientTextView;
    private final ScrollView rootView;
    public final TextView sendLabelTextView;
    public final KudiInputField senderNameEditText;
    public final KudiInputField senderPhoneEditText;

    private FragmentCreateVoucherSenderInfoBinding(ScrollView scrollView, TextView textView, KudiButton kudiButton, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, TextView textView5, KudiInputField kudiInputField, KudiInputField kudiInputField2) {
        this.rootView = scrollView;
        this.amountTextView = textView;
        this.continueButton = kudiButton;
        this.editLabelTextView = textView2;
        this.infoLayout = constraintLayout;
        this.recipientPhoneNumberTextView = textView3;
        this.recipientTextView = textView4;
        this.sendLabelTextView = textView5;
        this.senderNameEditText = kudiInputField;
        this.senderPhoneEditText = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherSenderInfoBinding bind(View view) {
        int $i0 = C0001R.C0003id.amountTextView;
        View $r1 = view.findViewById(C0001R.C0003id.amountTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.continueButton;
            View $r12 = view.findViewById(C0001R.C0003id.continueButton);
            KudiButton kudiButton = (KudiButton) $r12;
            if (kudiButton != null) {
                $i0 = C0001R.C0003id.editLabelTextView;
                View $r13 = view.findViewById(C0001R.C0003id.editLabelTextView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.infoLayout;
                    View $r14 = view.findViewById(C0001R.C0003id.infoLayout);
                    ConstraintLayout constraintLayout = (ConstraintLayout) $r14;
                    if (constraintLayout != null) {
                        $i0 = C0001R.C0003id.recipientPhoneNumberTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.recipientPhoneNumberTextView);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.recipientTextView;
                            View $r16 = view.findViewById(C0001R.C0003id.recipientTextView);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.sendLabelTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.sendLabelTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.senderNameEditText;
                                    View $r18 = view.findViewById(C0001R.C0003id.senderNameEditText);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.senderPhoneEditText;
                                        View $r19 = view.findViewById(C0001R.C0003id.senderPhoneEditText);
                                        KudiInputField $r10 = (KudiInputField) $r19;
                                        if ($r10 != null) {
                                            ScrollView $r122 = (ScrollView) view;
                                            FragmentCreateVoucherSenderInfoBinding $r11 = new FragmentCreateVoucherSenderInfoBinding($r122, $r2, kudiButton, textView, constraintLayout, textView2, textView3, $r8, $r9, $r10);
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
    public static FragmentCreateVoucherSenderInfoBinding inflate(LayoutInflater layoutInflater) {
        FragmentCreateVoucherSenderInfoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherSenderInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_create_voucher_sender_info, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCreateVoucherSenderInfoBinding $r3 = bind($r2);
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
