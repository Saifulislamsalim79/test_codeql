package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class PayBackLoanDialogBinding implements InterfaceC8209a {
    public final TextView amountText;
    public final TextView cancelButton;
    public final TextView cancelConfirmationTextView;
    public final KudiButton proceedButton;
    private final CardView rootView;
    public final TextView textView3;

    private PayBackLoanDialogBinding(CardView cardView, TextView textView, TextView textView2, TextView textView3, KudiButton kudiButton, TextView textView4) {
        this.rootView = cardView;
        this.amountText = textView;
        this.cancelButton = textView2;
        this.cancelConfirmationTextView = textView3;
        this.proceedButton = kudiButton;
        this.textView3 = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PayBackLoanDialogBinding bind(View view) {
        int $i0 = C0220R.C0222id.amount_text;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.cancel_button;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.cancel_confirmation_text_view;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.proceed_button;
                    View $r14 = view.findViewById($i0);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0220R.C0222id.textView3;
                        View $r15 = view.findViewById($i0);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            PayBackLoanDialogBinding $r7 = new PayBackLoanDialogBinding((CardView) view, $r2, $r3, $r4, kudiButton, textView);
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
    public static PayBackLoanDialogBinding inflate(LayoutInflater layoutInflater) {
        PayBackLoanDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PayBackLoanDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.pay_back_loan_dialog;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        PayBackLoanDialogBinding $r3 = bind($r2);
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
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}
