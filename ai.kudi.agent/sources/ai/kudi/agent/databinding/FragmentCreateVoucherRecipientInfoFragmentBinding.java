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
public final class FragmentCreateVoucherRecipientInfoFragmentBinding implements InterfaceC8209a {
    public final KudiButton continueButton;
    public final KudiInputField recipientNameEditText;
    public final KudiInputField recipientPhoneEditText;
    private final ConstraintLayout rootView;

    private FragmentCreateVoucherRecipientInfoFragmentBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, KudiInputField kudiInputField, KudiInputField kudiInputField2) {
        this.rootView = constraintLayout;
        this.continueButton = kudiButton;
        this.recipientNameEditText = kudiInputField;
        this.recipientPhoneEditText = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherRecipientInfoFragmentBinding bind(View view) {
        int $i0 = C0001R.C0003id.continueButton;
        View $r1 = view.findViewById(C0001R.C0003id.continueButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.recipientNameEditText;
            View $r12 = view.findViewById(C0001R.C0003id.recipientNameEditText);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.recipientPhoneEditText;
                View $r13 = view.findViewById(C0001R.C0003id.recipientPhoneEditText);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentCreateVoucherRecipientInfoFragmentBinding $r5 = new FragmentCreateVoucherRecipientInfoFragmentBinding($r6, $r2, $r3, $r4);
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
    public static FragmentCreateVoucherRecipientInfoFragmentBinding inflate(LayoutInflater layoutInflater) {
        FragmentCreateVoucherRecipientInfoFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherRecipientInfoFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_create_voucher_recipient_info_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCreateVoucherRecipientInfoFragmentBinding $r3 = bind($r2);
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
