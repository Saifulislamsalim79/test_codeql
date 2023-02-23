package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentApplyForLoanBinding implements InterfaceC8209a {
    public final KudiNairaInputField amountField;
    public final TextView howMuchLabel;
    public final KshockToolBarBinding kshockToolBar;
    public final TextView maximumAmount;
    public final TextView maximumAmountLabel;
    private final CoordinatorLayout rootView;
    public final KudiButton submitButton;

    private FragmentApplyForLoanBinding(CoordinatorLayout coordinatorLayout, KudiNairaInputField kudiNairaInputField, TextView textView, KshockToolBarBinding kshockToolBarBinding, TextView textView2, TextView textView3, KudiButton kudiButton) {
        this.rootView = coordinatorLayout;
        this.amountField = kudiNairaInputField;
        this.howMuchLabel = textView;
        this.kshockToolBar = kshockToolBarBinding;
        this.maximumAmount = textView2;
        this.maximumAmountLabel = textView3;
        this.submitButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentApplyForLoanBinding bind(View view) {
        View $r1;
        int $i0 = C0220R.C0222id.amount_field;
        View $r12 = view.findViewById($i0);
        KudiNairaInputField $r2 = (KudiNairaInputField) $r12;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.how_much_label;
            View $r13 = view.findViewById($i0);
            TextView $r3 = (TextView) $r13;
            if ($r3 != null && ($r1 = view.findViewById(($i0 = C0220R.C0222id.kshock_tool_bar))) != null) {
                KshockToolBarBinding $r4 = KshockToolBarBinding.bind($r1);
                $i0 = C0220R.C0222id.maximum_amount;
                View $r14 = view.findViewById($i0);
                TextView textView = (TextView) $r14;
                if (textView != null) {
                    $i0 = C0220R.C0222id.maximum_amount_label;
                    View $r15 = view.findViewById($i0);
                    TextView textView2 = (TextView) $r15;
                    if (textView2 != null) {
                        $i0 = C0220R.C0222id.submit_button;
                        View $r16 = view.findViewById($i0);
                        KudiButton kudiButton = (KudiButton) $r16;
                        if (kudiButton != null) {
                            CoordinatorLayout $r9 = (CoordinatorLayout) view;
                            FragmentApplyForLoanBinding $r8 = new FragmentApplyForLoanBinding($r9, $r2, $r3, $r4, textView, textView2, kudiButton);
                            return $r8;
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
    public static FragmentApplyForLoanBinding inflate(LayoutInflater layoutInflater) {
        FragmentApplyForLoanBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentApplyForLoanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_apply_for_loan;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentApplyForLoanBinding $r3 = bind($r2);
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
    public CoordinatorLayout getRoot() {
        CoordinatorLayout r1 = this.rootView;
        return r1;
    }
}
