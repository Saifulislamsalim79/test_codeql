package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentWithdrawSavingsBinding implements InterfaceC8209a {
    public final KudiTextView amountEditText;
    public final RecyclerView amountSuggestionRecyclerView;
    public final KudiTextView currency;
    public final KudiTextView enterAmountTextViewLabel;
    public final KudiTextView errorMessage;
    public final View footer;
    public final PinpadView keyboard;
    public final KudiButton nextButton;
    private final ConstraintLayout rootView;
    public final KudiTextView textWalletBalance;

    private FragmentWithdrawSavingsBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, RecyclerView recyclerView, KudiTextView kudiTextView2, KudiTextView kudiTextView3, KudiTextView kudiTextView4, View view, PinpadView pinpadView, KudiButton kudiButton, KudiTextView kudiTextView5) {
        this.rootView = constraintLayout;
        this.amountEditText = kudiTextView;
        this.amountSuggestionRecyclerView = recyclerView;
        this.currency = kudiTextView2;
        this.enterAmountTextViewLabel = kudiTextView3;
        this.errorMessage = kudiTextView4;
        this.footer = view;
        this.keyboard = pinpadView;
        this.nextButton = kudiButton;
        this.textWalletBalance = kudiTextView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWithdrawSavingsBinding bind(View view) {
        View $r1;
        int $i0 = C0456R.C0458id.amountEditText;
        View $r12 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r12;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.amountSuggestionRecyclerView;
            View $r13 = view.findViewById($i0);
            RecyclerView recyclerView = (RecyclerView) $r13;
            if (recyclerView != null) {
                $i0 = C0456R.C0458id.currency;
                View $r14 = view.findViewById($i0);
                KudiTextView kudiTextView = (KudiTextView) $r14;
                if (kudiTextView != null) {
                    $i0 = C0456R.C0458id.enterAmountTextViewLabel;
                    View $r15 = view.findViewById($i0);
                    KudiTextView kudiTextView2 = (KudiTextView) $r15;
                    if (kudiTextView2 != null) {
                        $i0 = C0456R.C0458id.error_message;
                        View $r16 = view.findViewById($i0);
                        KudiTextView kudiTextView3 = (KudiTextView) $r16;
                        if (kudiTextView3 != null && ($r1 = view.findViewById(($i0 = C0456R.C0458id.footer))) != null) {
                            $i0 = C0456R.C0458id.keyboard;
                            View $r7 = view.findViewById($i0);
                            PinpadView pinpadView = (PinpadView) $r7;
                            if (pinpadView != null) {
                                $i0 = C0456R.C0458id.nextButton;
                                View $r72 = view.findViewById($i0);
                                KudiButton $r9 = (KudiButton) $r72;
                                if ($r9 != null) {
                                    $i0 = C0456R.C0458id.text_wallet_balance;
                                    View $r73 = view.findViewById($i0);
                                    KudiTextView $r10 = (KudiTextView) $r73;
                                    if ($r10 != null) {
                                        ConstraintLayout $r122 = (ConstraintLayout) view;
                                        FragmentWithdrawSavingsBinding $r11 = new FragmentWithdrawSavingsBinding($r122, $r2, recyclerView, kudiTextView, kudiTextView2, kudiTextView3, $r1, pinpadView, $r9, $r10);
                                        return $r11;
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
    public static FragmentWithdrawSavingsBinding inflate(LayoutInflater layoutInflater) {
        FragmentWithdrawSavingsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWithdrawSavingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_withdraw_savings;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentWithdrawSavingsBinding $r3 = bind($r2);
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
