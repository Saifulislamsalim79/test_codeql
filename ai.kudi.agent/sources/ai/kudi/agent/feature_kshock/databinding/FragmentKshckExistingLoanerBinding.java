package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentKshckExistingLoanerBinding implements InterfaceC8209a {
    public final KudiButton applyButton;
    public final TextView availableLoanLabel;
    public final TextView availableLoanText;
    public final TextView creditLimitText;
    public final TextView creditLimitTextLabel;
    public final ProgressBar progressBar;
    private final CoordinatorLayout rootView;
    public final CardView summaryCard;
    public final TextView tenureLabel;
    public final TextView tenureText;

    private FragmentKshckExistingLoanerBinding(CoordinatorLayout coordinatorLayout, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, CardView cardView, TextView textView5, TextView textView6) {
        this.rootView = coordinatorLayout;
        this.applyButton = kudiButton;
        this.availableLoanLabel = textView;
        this.availableLoanText = textView2;
        this.creditLimitText = textView3;
        this.creditLimitTextLabel = textView4;
        this.progressBar = progressBar;
        this.summaryCard = cardView;
        this.tenureLabel = textView5;
        this.tenureText = textView6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKshckExistingLoanerBinding bind(View view) {
        int $i0 = C0220R.C0222id.apply_button;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.available_loan_label;
            View $r12 = view.findViewById($i0);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0220R.C0222id.available_loan_text;
                View $r13 = view.findViewById($i0);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0220R.C0222id.creditLimitText;
                    View $r14 = view.findViewById($i0);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0220R.C0222id.creditLimitText_label;
                        View $r15 = view.findViewById($i0);
                        TextView textView4 = (TextView) $r15;
                        if (textView4 != null) {
                            $i0 = C0220R.C0222id.progress_bar;
                            View $r16 = view.findViewById($i0);
                            ProgressBar progressBar = (ProgressBar) $r16;
                            if (progressBar != null) {
                                $i0 = C0220R.C0222id.summary_card;
                                View $r17 = view.findViewById($i0);
                                CardView $r8 = (CardView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0220R.C0222id.tenure_label;
                                    View $r18 = view.findViewById($i0);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0220R.C0222id.tenure_text;
                                        View $r19 = view.findViewById($i0);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            CoordinatorLayout $r122 = (CoordinatorLayout) view;
                                            FragmentKshckExistingLoanerBinding $r11 = new FragmentKshckExistingLoanerBinding($r122, $r2, textView, textView2, textView3, textView4, progressBar, $r8, $r9, $r10);
                                            return $r11;
                                        }
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
    public static FragmentKshckExistingLoanerBinding inflate(LayoutInflater layoutInflater) {
        FragmentKshckExistingLoanerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKshckExistingLoanerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_kshck_existing_loaner;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentKshckExistingLoanerBinding $r3 = bind($r2);
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
