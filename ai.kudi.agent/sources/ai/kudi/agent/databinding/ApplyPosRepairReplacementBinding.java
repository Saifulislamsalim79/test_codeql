package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ApplyPosRepairReplacementBinding implements InterfaceC8209a {
    public final TextView applyButton;
    public final CardView repairReplacementCardView;
    private final CardView rootView;
    public final TextView textView53;
    public final TextView textView55;

    private ApplyPosRepairReplacementBinding(CardView cardView, TextView textView, CardView cardView2, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.applyButton = textView;
        this.repairReplacementCardView = cardView2;
        this.textView53 = textView2;
        this.textView55 = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyPosRepairReplacementBinding bind(View view) {
        int $i0 = C0001R.C0003id.apply_button;
        View $r1 = view.findViewById(C0001R.C0003id.apply_button);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            CardView $r3 = (CardView) view;
            $i0 = C0001R.C0003id.textView53;
            View $r12 = view.findViewById(C0001R.C0003id.textView53);
            TextView $r4 = (TextView) $r12;
            if ($r4 != null) {
                $i0 = C0001R.C0003id.textView55;
                View $r13 = view.findViewById(C0001R.C0003id.textView55);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    ApplyPosRepairReplacementBinding $r6 = new ApplyPosRepairReplacementBinding($r3, $r2, $r3, $r4, textView);
                    return $r6;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyPosRepairReplacementBinding inflate(LayoutInflater layoutInflater) {
        ApplyPosRepairReplacementBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyPosRepairReplacementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.apply_pos_repair_replacement, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ApplyPosRepairReplacementBinding $r3 = bind($r2);
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
