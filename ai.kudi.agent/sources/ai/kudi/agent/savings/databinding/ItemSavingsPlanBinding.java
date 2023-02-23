package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ItemSavingsPlanBinding implements InterfaceC8209a {
    public final ConstraintLayout clPlanContainer;
    private final CardView rootView;
    public final TextView tvDueDate;
    public final TextView tvDueDateHeader;
    public final TextView tvSavingState;
    public final TextView tvSavingsGoal;
    public final TextView tvTotalAmount;
    public final TextView tvTotalAmountHeader;
    public final TextView tvViewDetails;

    private ItemSavingsPlanBinding(CardView cardView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = cardView;
        this.clPlanContainer = constraintLayout;
        this.tvDueDate = textView;
        this.tvDueDateHeader = textView2;
        this.tvSavingState = textView3;
        this.tvSavingsGoal = textView4;
        this.tvTotalAmount = textView5;
        this.tvTotalAmountHeader = textView6;
        this.tvViewDetails = textView7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsPlanBinding bind(View view) {
        int $i0 = C0456R.C0458id.clPlanContainer;
        View $r1 = view.findViewById($i0);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.tvDueDate;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.tvDueDateHeader;
                View $r13 = view.findViewById($i0);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0456R.C0458id.tvSavingState;
                    View $r14 = view.findViewById($i0);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0456R.C0458id.tvSavingsGoal;
                        View $r15 = view.findViewById($i0);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0456R.C0458id.tvTotalAmount;
                            View $r16 = view.findViewById($i0);
                            TextView textView4 = (TextView) $r16;
                            if (textView4 != null) {
                                $i0 = C0456R.C0458id.tvTotalAmountHeader;
                                View $r17 = view.findViewById($i0);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0456R.C0458id.tvViewDetails;
                                    View $r18 = view.findViewById($i0);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        CardView $r11 = (CardView) view;
                                        ItemSavingsPlanBinding $r10 = new ItemSavingsPlanBinding($r11, $r2, $r3, textView, textView2, textView3, textView4, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsPlanBinding inflate(LayoutInflater layoutInflater) {
        ItemSavingsPlanBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsPlanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.item_savings_plan;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemSavingsPlanBinding $r3 = bind($r2);
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
