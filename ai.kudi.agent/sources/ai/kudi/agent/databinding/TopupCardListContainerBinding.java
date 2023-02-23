package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.SelectView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TopupCardListContainerBinding implements InterfaceC8209a {
    public final TextView addNewCardLabel;
    public final TextView cardLabel;
    public final SelectView paymentOptionSelectView;
    private final ConstraintLayout rootView;

    private TopupCardListContainerBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, SelectView selectView) {
        this.rootView = constraintLayout;
        this.addNewCardLabel = textView;
        this.cardLabel = textView2;
        this.paymentOptionSelectView = selectView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TopupCardListContainerBinding bind(View view) {
        int $i0 = C0001R.C0003id.add_new_card_label;
        View $r1 = view.findViewById(C0001R.C0003id.add_new_card_label);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.card_label;
            View $r12 = view.findViewById(C0001R.C0003id.card_label);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.paymentOptionSelectView;
                View $r13 = view.findViewById(C0001R.C0003id.paymentOptionSelectView);
                SelectView $r4 = (SelectView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    TopupCardListContainerBinding $r5 = new TopupCardListContainerBinding($r6, $r2, $r3, $r4);
                    return $r5;
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
    public static TopupCardListContainerBinding inflate(LayoutInflater layoutInflater) {
        TopupCardListContainerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TopupCardListContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.topup_card_list_container, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TopupCardListContainerBinding $r3 = bind($r2);
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
