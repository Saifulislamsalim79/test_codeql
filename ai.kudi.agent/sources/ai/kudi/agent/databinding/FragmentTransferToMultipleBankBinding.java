package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiSwitch;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransferToMultipleBankBinding implements InterfaceC8209a {
    public final ImageView accountLookupLoader;
    public final TextView accountNameField;
    public final KudiInputField accountNumberField;
    public final KudiButton addMultipleButton;
    public final KudiNairaInputField amountEditText;
    public final KudiInputField bankField;
    public final NestedScrollView container;
    public final KudiButton continueButton;
    public final TextView errorMessage;
    public final RecyclerView recipientsList;
    private final FrameLayout rootView;
    public final KudiSwitch sameAmountSwitch;
    public final TextView sameAmountText;
    public final KudiInputField transferReasonEditText;

    private FragmentTransferToMultipleBankBinding(FrameLayout frameLayout, ImageView imageView, TextView textView, KudiInputField kudiInputField, KudiButton kudiButton, KudiNairaInputField kudiNairaInputField, KudiInputField kudiInputField2, NestedScrollView nestedScrollView, KudiButton kudiButton2, TextView textView2, RecyclerView recyclerView, KudiSwitch kudiSwitch, TextView textView3, KudiInputField kudiInputField3) {
        this.rootView = frameLayout;
        this.accountLookupLoader = imageView;
        this.accountNameField = textView;
        this.accountNumberField = kudiInputField;
        this.addMultipleButton = kudiButton;
        this.amountEditText = kudiNairaInputField;
        this.bankField = kudiInputField2;
        this.container = nestedScrollView;
        this.continueButton = kudiButton2;
        this.errorMessage = textView2;
        this.recipientsList = recyclerView;
        this.sameAmountSwitch = kudiSwitch;
        this.sameAmountText = textView3;
        this.transferReasonEditText = kudiInputField3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToMultipleBankBinding bind(View view) {
        int $i0 = C0001R.C0003id.account_lookup_loader;
        View $r1 = view.findViewById(C0001R.C0003id.account_lookup_loader);
        ImageView imageView = (ImageView) $r1;
        if (imageView != null) {
            $i0 = C0001R.C0003id.account_name_field;
            View $r12 = view.findViewById(C0001R.C0003id.account_name_field);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.account_number_field;
                View $r13 = view.findViewById(C0001R.C0003id.account_number_field);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.add_multiple_button;
                    View $r14 = view.findViewById(C0001R.C0003id.add_multiple_button);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0001R.C0003id.amount_edit_text;
                        View $r15 = view.findViewById(C0001R.C0003id.amount_edit_text);
                        KudiNairaInputField kudiNairaInputField = (KudiNairaInputField) $r15;
                        if (kudiNairaInputField != null) {
                            $i0 = C0001R.C0003id.bank_field;
                            View $r16 = view.findViewById(C0001R.C0003id.bank_field);
                            KudiInputField kudiInputField2 = (KudiInputField) $r16;
                            if (kudiInputField2 != null) {
                                $i0 = C0001R.C0003id.container;
                                View $r17 = view.findViewById(C0001R.C0003id.container);
                                NestedScrollView $r8 = (NestedScrollView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.continue_button;
                                    View $r18 = view.findViewById(C0001R.C0003id.continue_button);
                                    KudiButton $r9 = (KudiButton) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.error_message;
                                        View $r19 = view.findViewById(C0001R.C0003id.error_message);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.recipients_list;
                                            View $r110 = view.findViewById(C0001R.C0003id.recipients_list);
                                            RecyclerView $r11 = (RecyclerView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.same_amount_switch;
                                                View $r111 = view.findViewById(C0001R.C0003id.same_amount_switch);
                                                KudiSwitch $r122 = (KudiSwitch) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.same_amount_text;
                                                    View $r112 = view.findViewById(C0001R.C0003id.same_amount_text);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.transfer_reason_edit_text;
                                                        View $r113 = view.findViewById(C0001R.C0003id.transfer_reason_edit_text);
                                                        KudiInputField $r142 = (KudiInputField) $r113;
                                                        if ($r142 != null) {
                                                            FrameLayout $r162 = (FrameLayout) view;
                                                            FragmentTransferToMultipleBankBinding $r152 = new FragmentTransferToMultipleBankBinding($r162, imageView, textView, kudiInputField, kudiButton, kudiNairaInputField, kudiInputField2, $r8, $r9, $r10, $r11, $r122, $r132, $r142);
                                                            return $r152;
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
        Resources $r172 = view.getResources();
        String $r182 = $r172.getResourceName($i0);
        NullPointerException $r192 = new NullPointerException("Missing required view with ID: ".concat($r182));
        throw $r192;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToMultipleBankBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransferToMultipleBankBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToMultipleBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transfer_to_multiple_bank, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransferToMultipleBankBinding $r3 = bind($r2);
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
