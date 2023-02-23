package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiRadioButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CustomerDetailsIssueFragmentBinding implements InterfaceC8209a {
    public final TextView accountNameInputField;
    public final ProgressBar accountNameProgressBar;
    public final KudiInputField accountNumberInputField;
    public final KudiNairaInputField amountView;
    public final KudiButton continueButton;
    public final ConstraintLayout customerBankDetails;
    public final KudiInputField customerBankView;
    public final KudiInputField customerNameView;
    public final KudiInputField customerPhoneNumber;
    public final KudiInputField dateOfTransactionView;
    public final KudiRadioButton noOption;
    public final RadioGroup radioGroupYesOrNo;
    private final ScrollView rootView;
    public final TextView settleCustomerQuestionView;
    public final KudiRadioButton yesOption;

    private CustomerDetailsIssueFragmentBinding(ScrollView scrollView, TextView textView, ProgressBar progressBar, KudiInputField kudiInputField, KudiNairaInputField kudiNairaInputField, KudiButton kudiButton, ConstraintLayout constraintLayout, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiInputField kudiInputField4, KudiInputField kudiInputField5, KudiRadioButton kudiRadioButton, RadioGroup radioGroup, TextView textView2, KudiRadioButton kudiRadioButton2) {
        this.rootView = scrollView;
        this.accountNameInputField = textView;
        this.accountNameProgressBar = progressBar;
        this.accountNumberInputField = kudiInputField;
        this.amountView = kudiNairaInputField;
        this.continueButton = kudiButton;
        this.customerBankDetails = constraintLayout;
        this.customerBankView = kudiInputField2;
        this.customerNameView = kudiInputField3;
        this.customerPhoneNumber = kudiInputField4;
        this.dateOfTransactionView = kudiInputField5;
        this.noOption = kudiRadioButton;
        this.radioGroupYesOrNo = radioGroup;
        this.settleCustomerQuestionView = textView2;
        this.yesOption = kudiRadioButton2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerDetailsIssueFragmentBinding bind(View view) {
        int $i0 = C0214R.C0216id.accountNameInputField;
        View $r1 = view.findViewById($i0);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0214R.C0216id.accountNameProgressBar;
            View $r12 = view.findViewById($i0);
            ProgressBar progressBar = (ProgressBar) $r12;
            if (progressBar != null) {
                $i0 = C0214R.C0216id.accountNumberInputField;
                View $r13 = view.findViewById($i0);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0214R.C0216id.amount_view;
                    View $r14 = view.findViewById($i0);
                    KudiNairaInputField kudiNairaInputField = (KudiNairaInputField) $r14;
                    if (kudiNairaInputField != null) {
                        $i0 = C0214R.C0216id.continue_button;
                        View $r15 = view.findViewById($i0);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            $i0 = C0214R.C0216id.customer_bank_details;
                            View $r16 = view.findViewById($i0);
                            ConstraintLayout constraintLayout = (ConstraintLayout) $r16;
                            if (constraintLayout != null) {
                                $i0 = C0214R.C0216id.customer_bank_view;
                                View $r17 = view.findViewById($i0);
                                KudiInputField $r8 = (KudiInputField) $r17;
                                if ($r8 != null) {
                                    $i0 = C0214R.C0216id.customer_name_view;
                                    View $r18 = view.findViewById($i0);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0214R.C0216id.customer_phone_number;
                                        View $r19 = view.findViewById($i0);
                                        KudiInputField $r10 = (KudiInputField) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0214R.C0216id.date_of_transaction_view;
                                            View $r110 = view.findViewById($i0);
                                            KudiInputField $r11 = (KudiInputField) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0214R.C0216id.no_option;
                                                View $r111 = view.findViewById($i0);
                                                KudiRadioButton $r122 = (KudiRadioButton) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0214R.C0216id.radioGroupYesOrNo;
                                                    View $r112 = view.findViewById($i0);
                                                    RadioGroup $r132 = (RadioGroup) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0214R.C0216id.settle_customer_question_view;
                                                        View $r113 = view.findViewById($i0);
                                                        TextView $r142 = (TextView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0214R.C0216id.yes_option;
                                                            View $r114 = view.findViewById($i0);
                                                            KudiRadioButton $r152 = (KudiRadioButton) $r114;
                                                            if ($r152 != null) {
                                                                ScrollView $r172 = (ScrollView) view;
                                                                CustomerDetailsIssueFragmentBinding $r162 = new CustomerDetailsIssueFragmentBinding($r172, textView, progressBar, kudiInputField, kudiNairaInputField, kudiButton, constraintLayout, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152);
                                                                return $r162;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r182 = view.getResources();
        String $r192 = $r182.getResourceName($i0);
        NullPointerException $r20 = new NullPointerException("Missing required view with ID: ".concat($r192));
        throw $r20;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerDetailsIssueFragmentBinding inflate(LayoutInflater layoutInflater) {
        CustomerDetailsIssueFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerDetailsIssueFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.customer_details_issue_fragment;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CustomerDetailsIssueFragmentBinding $r3 = bind($r2);
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
