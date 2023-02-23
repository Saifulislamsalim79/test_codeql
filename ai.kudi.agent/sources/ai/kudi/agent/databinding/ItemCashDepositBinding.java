package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ItemCashDepositBinding implements InterfaceC8209a {
    public final KudiTextView descriptionTextView;
    public final ImageView icon;
    private final ConstraintLayout rootView;
    public final TextView stepTextView;

    private ItemCashDepositBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.descriptionTextView = kudiTextView;
        this.icon = imageView;
        this.stepTextView = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemCashDepositBinding bind(View view) {
        int $i0 = C0001R.C0003id.description_text_view;
        View $r1 = view.findViewById(C0001R.C0003id.description_text_view);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.icon;
            View $r12 = view.findViewById(C0001R.C0003id.icon);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.step_text_view;
                View $r13 = view.findViewById(C0001R.C0003id.step_text_view);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    ItemCashDepositBinding $r5 = new ItemCashDepositBinding($r6, $r2, $r3, $r4);
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
    public static ItemCashDepositBinding inflate(LayoutInflater layoutInflater) {
        ItemCashDepositBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemCashDepositBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.item_cash_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemCashDepositBinding $r3 = bind($r2);
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
