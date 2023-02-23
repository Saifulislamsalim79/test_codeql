package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAirtimeAmountBinding implements InterfaceC8209a {
    public final KudiTextView amountEditText;
    public final RecyclerView amountSuggestionRecyclerView;
    public final ConstraintLayout constraintLayout3;
    public final KudiTextView currency;
    public final KudiTextView detailsLabel;
    public final TextView editLabelTextView;
    public final KudiTextView enterAmountTextViewLabel;
    public final KudiTextView errorMessage;
    public final View footer;
    public final PinpadView keyboard;
    public final KudiButton nextButton;
    private final ConstraintLayout rootView;
    public final KudiTextView textWalletBalance;

    private FragmentAirtimeAmountBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, KudiTextView kudiTextView2, KudiTextView kudiTextView3, TextView textView, KudiTextView kudiTextView4, KudiTextView kudiTextView5, View view, PinpadView pinpadView, KudiButton kudiButton, KudiTextView kudiTextView6) {
        this.rootView = constraintLayout;
        this.amountEditText = kudiTextView;
        this.amountSuggestionRecyclerView = recyclerView;
        this.constraintLayout3 = constraintLayout2;
        this.currency = kudiTextView2;
        this.detailsLabel = kudiTextView3;
        this.editLabelTextView = textView;
        this.enterAmountTextViewLabel = kudiTextView4;
        this.errorMessage = kudiTextView5;
        this.footer = view;
        this.keyboard = pinpadView;
        this.nextButton = kudiButton;
        this.textWalletBalance = kudiTextView6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAirtimeAmountBinding bind(View view) {
        View $r1;
        int $i0 = R$id.amountEditText;
        View $r12 = view.findViewById($i0);
        KudiTextView kudiTextView = (KudiTextView) $r12;
        if (kudiTextView != null) {
            $i0 = R$id.amountSuggestionRecyclerView;
            View $r13 = view.findViewById($i0);
            RecyclerView recyclerView = (RecyclerView) $r13;
            if (recyclerView != null) {
                $i0 = R$id.constraintLayout3;
                View $r14 = view.findViewById($i0);
                ConstraintLayout constraintLayout = (ConstraintLayout) $r14;
                if (constraintLayout != null) {
                    $i0 = R$id.currency;
                    View $r15 = view.findViewById($i0);
                    KudiTextView kudiTextView2 = (KudiTextView) $r15;
                    if (kudiTextView2 != null) {
                        $i0 = R$id.details_label;
                        View $r16 = view.findViewById($i0);
                        KudiTextView kudiTextView3 = (KudiTextView) $r16;
                        if (kudiTextView3 != null) {
                            $i0 = R$id.editLabelTextView;
                            View $r17 = view.findViewById($i0);
                            TextView textView = (TextView) $r17;
                            if (textView != null) {
                                $i0 = R$id.enterAmountTextViewLabel;
                                View $r18 = view.findViewById($i0);
                                KudiTextView $r8 = (KudiTextView) $r18;
                                if ($r8 != null) {
                                    $i0 = R$id.error_message;
                                    View $r19 = view.findViewById($i0);
                                    KudiTextView $r9 = (KudiTextView) $r19;
                                    if ($r9 != null && ($r1 = view.findViewById(($i0 = R$id.footer))) != null) {
                                        $i0 = R$id.keyboard;
                                        View $r10 = view.findViewById($i0);
                                        PinpadView $r11 = (PinpadView) $r10;
                                        if ($r11 != null) {
                                            $i0 = R$id.nextButton;
                                            View $r102 = view.findViewById($i0);
                                            KudiButton $r122 = (KudiButton) $r102;
                                            if ($r122 != null) {
                                                $i0 = R$id.text_wallet_balance;
                                                View $r103 = view.findViewById($i0);
                                                KudiTextView $r132 = (KudiTextView) $r103;
                                                if ($r132 != null) {
                                                    ConstraintLayout $r152 = (ConstraintLayout) view;
                                                    FragmentAirtimeAmountBinding $r142 = new FragmentAirtimeAmountBinding($r152, kudiTextView, recyclerView, constraintLayout, kudiTextView2, kudiTextView3, textView, $r8, $r9, $r1, $r11, $r122, $r132);
                                                    return $r142;
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
        Resources $r162 = view.getResources();
        String $r172 = $r162.getResourceName($i0);
        NullPointerException $r182 = new NullPointerException("Missing required view with ID: ".concat($r172));
        throw $r182;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAirtimeAmountBinding inflate(LayoutInflater layoutInflater) {
        FragmentAirtimeAmountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAirtimeAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_airtime_amount;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAirtimeAmountBinding $r3 = bind($r2);
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
