package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentApplyForLoanReviewBinding implements InterfaceC8209a {
    public final TextView amountLabel;
    public final TextView amountText;
    public final TextView chargeLabel;
    public final TextView chargeText;
    public final TextView dueDateLabel;
    public final TextView dueDateText;
    public final TextView interestLabel;
    public final TextView interestText;
    public final KshockToolBarBinding kshockToolBar;
    public final TextView reviewLabel;
    private final CoordinatorLayout rootView;
    public final KudiButton submitButton;
    public final CardView summaryCard;
    public final TextView tenureLabel;
    public final TextView tenureText;

    private FragmentApplyForLoanReviewBinding(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, KshockToolBarBinding kshockToolBarBinding, TextView textView9, KudiButton kudiButton, CardView cardView, TextView textView10, TextView textView11) {
        this.rootView = coordinatorLayout;
        this.amountLabel = textView;
        this.amountText = textView2;
        this.chargeLabel = textView3;
        this.chargeText = textView4;
        this.dueDateLabel = textView5;
        this.dueDateText = textView6;
        this.interestLabel = textView7;
        this.interestText = textView8;
        this.kshockToolBar = kshockToolBarBinding;
        this.reviewLabel = textView9;
        this.submitButton = kudiButton;
        this.summaryCard = cardView;
        this.tenureLabel = textView10;
        this.tenureText = textView11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentApplyForLoanReviewBinding bind(View view) {
        int $i0 = C0220R.C0222id.amount_label;
        View $r1 = view.findViewById($i0);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0220R.C0222id.amount_text;
            View $r12 = view.findViewById($i0);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0220R.C0222id.charge_label;
                View $r13 = view.findViewById($i0);
                TextView textView3 = (TextView) $r13;
                if (textView3 != null) {
                    $i0 = C0220R.C0222id.charge_text;
                    View $r14 = view.findViewById($i0);
                    TextView textView4 = (TextView) $r14;
                    if (textView4 != null) {
                        $i0 = C0220R.C0222id.dueDateLabel;
                        View $r15 = view.findViewById($i0);
                        TextView textView5 = (TextView) $r15;
                        if (textView5 != null) {
                            $i0 = C0220R.C0222id.dueDateText;
                            View $r16 = view.findViewById($i0);
                            TextView textView6 = (TextView) $r16;
                            if (textView6 != null) {
                                $i0 = C0220R.C0222id.interest_label;
                                View $r17 = view.findViewById($i0);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0220R.C0222id.interest_text;
                                    View $r18 = view.findViewById($i0);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0220R.C0222id.kshock_tool_bar;
                                        View $r19 = view.findViewById($i0);
                                        if ($r19 != null) {
                                            KshockToolBarBinding $r10 = KshockToolBarBinding.bind($r19);
                                            $i0 = C0220R.C0222id.review_label;
                                            View $r110 = view.findViewById($i0);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0220R.C0222id.submit_button;
                                                View $r111 = view.findViewById($i0);
                                                KudiButton $r122 = (KudiButton) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0220R.C0222id.summary_card;
                                                    View $r112 = view.findViewById($i0);
                                                    CardView $r132 = (CardView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0220R.C0222id.tenure_label;
                                                        View $r113 = view.findViewById($i0);
                                                        TextView $r142 = (TextView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0220R.C0222id.tenure_text;
                                                            View $r114 = view.findViewById($i0);
                                                            TextView $r152 = (TextView) $r114;
                                                            if ($r152 != null) {
                                                                CoordinatorLayout $r172 = (CoordinatorLayout) view;
                                                                FragmentApplyForLoanReviewBinding $r162 = new FragmentApplyForLoanReviewBinding($r172, textView, textView2, textView3, textView4, textView5, textView6, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152);
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
    public static FragmentApplyForLoanReviewBinding inflate(LayoutInflater layoutInflater) {
        FragmentApplyForLoanReviewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentApplyForLoanReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_apply_for_loan_review;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentApplyForLoanReviewBinding $r3 = bind($r2);
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
