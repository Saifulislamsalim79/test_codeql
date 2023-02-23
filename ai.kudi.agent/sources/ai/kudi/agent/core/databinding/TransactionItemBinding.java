package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TransactionItemBinding implements InterfaceC8209a {
    public final KudiTextView amountTextView;
    public final KudiTextView balanceTextView;
    public final KudiTextView descriptionTextView;
    public final View divider;
    public final LinearLayout fundsTransfer;
    public final CircleImageView indicatorImageView;
    public final Guideline moneyGuideline;
    private final ConstraintLayout rootView;
    public final KudiTextView status;
    public final KudiTextView timeTextView;

    private TransactionItemBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiTextView kudiTextView3, View view, LinearLayout linearLayout, CircleImageView circleImageView, Guideline guideline, KudiTextView kudiTextView4, KudiTextView kudiTextView5) {
        this.rootView = constraintLayout;
        this.amountTextView = kudiTextView;
        this.balanceTextView = kudiTextView2;
        this.descriptionTextView = kudiTextView3;
        this.divider = view;
        this.fundsTransfer = linearLayout;
        this.indicatorImageView = circleImageView;
        this.moneyGuideline = guideline;
        this.status = kudiTextView4;
        this.timeTextView = kudiTextView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionItemBinding bind(View view) {
        View $r1;
        int $i0 = C0038R.C0040id.amount_text_view;
        View $r12 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r12;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.balance_text_view;
            View $r13 = view.findViewById($i0);
            KudiTextView kudiTextView = (KudiTextView) $r13;
            if (kudiTextView != null) {
                $i0 = C0038R.C0040id.description_text_view;
                View $r14 = view.findViewById($i0);
                KudiTextView kudiTextView2 = (KudiTextView) $r14;
                if (kudiTextView2 != null && ($r1 = view.findViewById(($i0 = C0038R.C0040id.divider))) != null) {
                    $i0 = C0038R.C0040id.funds_transfer;
                    View $r5 = view.findViewById($i0);
                    LinearLayout linearLayout = (LinearLayout) $r5;
                    if (linearLayout != null) {
                        $i0 = C0038R.C0040id.indicatorImageView;
                        View $r52 = view.findViewById($i0);
                        CircleImageView circleImageView = (CircleImageView) $r52;
                        if (circleImageView != null) {
                            $i0 = C0038R.C0040id.moneyGuideline;
                            View $r53 = view.findViewById($i0);
                            Guideline guideline = (Guideline) $r53;
                            if (guideline != null) {
                                $i0 = C0038R.C0040id.status;
                                View $r54 = view.findViewById($i0);
                                KudiTextView $r9 = (KudiTextView) $r54;
                                if ($r9 != null) {
                                    $i0 = C0038R.C0040id.time_text_view;
                                    View $r55 = view.findViewById($i0);
                                    KudiTextView $r10 = (KudiTextView) $r55;
                                    if ($r10 != null) {
                                        ConstraintLayout $r122 = (ConstraintLayout) view;
                                        TransactionItemBinding $r11 = new TransactionItemBinding($r122, $r2, kudiTextView, kudiTextView2, $r1, linearLayout, circleImageView, guideline, $r9, $r10);
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
        NullPointerException $r15 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionItemBinding inflate(LayoutInflater layoutInflater) {
        TransactionItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.transaction_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TransactionItemBinding $r3 = bind($r2);
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
