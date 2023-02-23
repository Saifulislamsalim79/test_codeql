package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBillPaymentStepOneBinding implements InterfaceC8209a {
    public final KudiButton continueToNextPage;
    public final AppCompatTextView customerAddressView;
    public final AppCompatTextView customerNameView;
    public final ProgressBar customerNameloader;
    private final ConstraintLayout rootView;
    public final KudiInputField selectPlanView;
    public final KudiInputField smartCardNo;

    private FragmentBillPaymentStepOneBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ProgressBar progressBar, KudiInputField kudiInputField, KudiInputField kudiInputField2) {
        this.rootView = constraintLayout;
        this.continueToNextPage = kudiButton;
        this.customerAddressView = appCompatTextView;
        this.customerNameView = appCompatTextView2;
        this.customerNameloader = progressBar;
        this.selectPlanView = kudiInputField;
        this.smartCardNo = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBillPaymentStepOneBinding bind(View view) {
        int $i0 = R$id.continueToNextPage;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = R$id.customerAddressView;
            View $r12 = view.findViewById($i0);
            AppCompatTextView $r3 = (AppCompatTextView) $r12;
            if ($r3 != null) {
                $i0 = R$id.customerNameView;
                View $r13 = view.findViewById($i0);
                AppCompatTextView $r4 = (AppCompatTextView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.customerNameloader;
                    View $r14 = view.findViewById($i0);
                    ProgressBar progressBar = (ProgressBar) $r14;
                    if (progressBar != null) {
                        $i0 = R$id.selectPlanView;
                        View $r15 = view.findViewById($i0);
                        KudiInputField kudiInputField = (KudiInputField) $r15;
                        if (kudiInputField != null) {
                            $i0 = R$id.smartCardNo;
                            View $r16 = view.findViewById($i0);
                            KudiInputField kudiInputField2 = (KudiInputField) $r16;
                            if (kudiInputField2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentBillPaymentStepOneBinding $r8 = new FragmentBillPaymentStepOneBinding($r9, $r2, $r3, $r4, progressBar, kudiInputField, kudiInputField2);
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
    public static FragmentBillPaymentStepOneBinding inflate(LayoutInflater layoutInflater) {
        FragmentBillPaymentStepOneBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBillPaymentStepOneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_bill_payment_step_one;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBillPaymentStepOneBinding $r3 = bind($r2);
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
