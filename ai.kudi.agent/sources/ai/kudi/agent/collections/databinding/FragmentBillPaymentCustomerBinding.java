package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBillPaymentCustomerBinding implements InterfaceC8209a {
    public final KudiTextView accountDetails;
    public final ConstraintLayout constraintLayout5;
    public final KudiButton continueButton;
    public final TextView editButton;
    public final KudiInputField fullNameView;
    public final KudiInputField phoneNoView;
    private final ConstraintLayout rootView;

    private FragmentBillPaymentCustomerBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, ConstraintLayout constraintLayout2, KudiButton kudiButton, TextView textView, KudiInputField kudiInputField, KudiInputField kudiInputField2) {
        this.rootView = constraintLayout;
        this.accountDetails = kudiTextView;
        this.constraintLayout5 = constraintLayout2;
        this.continueButton = kudiButton;
        this.editButton = textView;
        this.fullNameView = kudiInputField;
        this.phoneNoView = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBillPaymentCustomerBinding bind(View view) {
        int $i0 = R$id.account_details;
        View $r1 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = R$id.constraintLayout5;
            View $r12 = view.findViewById($i0);
            ConstraintLayout $r3 = (ConstraintLayout) $r12;
            if ($r3 != null) {
                $i0 = R$id.continueButton;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = R$id.editButton;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = R$id.fullNameView;
                        View $r15 = view.findViewById($i0);
                        KudiInputField kudiInputField = (KudiInputField) $r15;
                        if (kudiInputField != null) {
                            $i0 = R$id.phoneNoView;
                            View $r16 = view.findViewById($i0);
                            KudiInputField kudiInputField2 = (KudiInputField) $r16;
                            if (kudiInputField2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentBillPaymentCustomerBinding $r8 = new FragmentBillPaymentCustomerBinding($r9, $r2, $r3, $r4, textView, kudiInputField, kudiInputField2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBillPaymentCustomerBinding inflate(LayoutInflater layoutInflater) {
        FragmentBillPaymentCustomerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBillPaymentCustomerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_bill_payment_customer;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBillPaymentCustomerBinding $r3 = bind($r2);
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
