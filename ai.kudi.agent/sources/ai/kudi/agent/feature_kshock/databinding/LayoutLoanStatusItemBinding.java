package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutLoanStatusItemBinding implements InterfaceC8209a {
    public final TextView actionTextView;
    public final LinearLayout actionView;
    public final AppCompatImageView cancelImage;
    public final ProgressBar cancelLoanProgress;
    public final TextView loanStatus;
    public final TextView loanStatusLabel;
    public final RecyclerView loanStatusRv;
    private final ConstraintLayout rootView;
    public final View statusDivider;

    private LayoutLoanStatusItemBinding(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, ProgressBar progressBar, TextView textView2, TextView textView3, RecyclerView recyclerView, View view) {
        this.rootView = constraintLayout;
        this.actionTextView = textView;
        this.actionView = linearLayout;
        this.cancelImage = appCompatImageView;
        this.cancelLoanProgress = progressBar;
        this.loanStatus = textView2;
        this.loanStatusLabel = textView3;
        this.loanStatusRv = recyclerView;
        this.statusDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutLoanStatusItemBinding bind(View view) {
        View $r1;
        int $i0 = C0220R.C0222id.action_text_view;
        View $r12 = view.findViewById($i0);
        TextView $r2 = (TextView) $r12;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.action_view;
            View $r13 = view.findViewById($i0);
            LinearLayout $r3 = (LinearLayout) $r13;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.cancel_image;
                View $r14 = view.findViewById($i0);
                AppCompatImageView appCompatImageView = (AppCompatImageView) $r14;
                if (appCompatImageView != null) {
                    $i0 = C0220R.C0222id.cancel_loan_progress;
                    View $r15 = view.findViewById($i0);
                    ProgressBar progressBar = (ProgressBar) $r15;
                    if (progressBar != null) {
                        $i0 = C0220R.C0222id.loan_status;
                        View $r16 = view.findViewById($i0);
                        TextView textView = (TextView) $r16;
                        if (textView != null) {
                            $i0 = C0220R.C0222id.loan_status_label;
                            View $r17 = view.findViewById($i0);
                            TextView textView2 = (TextView) $r17;
                            if (textView2 != null) {
                                $i0 = C0220R.C0222id.loan_status_rv;
                                View $r18 = view.findViewById($i0);
                                RecyclerView $r8 = (RecyclerView) $r18;
                                if ($r8 != null && ($r1 = view.findViewById(($i0 = C0220R.C0222id.status_divider))) != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    LayoutLoanStatusItemBinding $r9 = new LayoutLoanStatusItemBinding($r10, $r2, $r3, appCompatImageView, progressBar, textView, textView2, $r8, $r1);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutLoanStatusItemBinding inflate(LayoutInflater layoutInflater) {
        LayoutLoanStatusItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutLoanStatusItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.layout_loan_status_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutLoanStatusItemBinding $r3 = bind($r2);
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
