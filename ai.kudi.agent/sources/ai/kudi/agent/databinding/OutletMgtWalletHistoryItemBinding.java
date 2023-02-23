package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class OutletMgtWalletHistoryItemBinding implements InterfaceC8209a {
    public final TextView amountTextView;
    public final TextView descriptionTextView;
    public final CircleImageView indicatorImageView;
    private final ConstraintLayout rootView;
    public final Guideline verticalGuideline;

    private OutletMgtWalletHistoryItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, CircleImageView circleImageView, Guideline guideline) {
        this.rootView = constraintLayout;
        this.amountTextView = textView;
        this.descriptionTextView = textView2;
        this.indicatorImageView = circleImageView;
        this.verticalGuideline = guideline;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtWalletHistoryItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.amount_text_view;
        View $r1 = view.findViewById(C0001R.C0003id.amount_text_view);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.description_text_view;
            View $r12 = view.findViewById(C0001R.C0003id.description_text_view);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.indicatorImageView;
                View $r13 = view.findViewById(C0001R.C0003id.indicatorImageView);
                CircleImageView $r4 = (CircleImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.verticalGuideline;
                    View $r14 = view.findViewById(C0001R.C0003id.verticalGuideline);
                    Guideline guideline = (Guideline) $r14;
                    if (guideline != null) {
                        OutletMgtWalletHistoryItemBinding $r6 = new OutletMgtWalletHistoryItemBinding((ConstraintLayout) view, $r2, $r3, $r4, guideline);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtWalletHistoryItemBinding inflate(LayoutInflater layoutInflater) {
        OutletMgtWalletHistoryItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtWalletHistoryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.outlet_mgt_wallet_history_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        OutletMgtWalletHistoryItemBinding $r3 = bind($r2);
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
