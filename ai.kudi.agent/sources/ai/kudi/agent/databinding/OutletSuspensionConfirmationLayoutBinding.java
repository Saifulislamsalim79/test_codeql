package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class OutletSuspensionConfirmationLayoutBinding implements InterfaceC8209a {
    public final KudiButton cancelSuspensionButton;
    public final TextView outletSuspensionText;
    private final CardView rootView;
    public final KudiButton yesButton;

    private OutletSuspensionConfirmationLayoutBinding(CardView cardView, KudiButton kudiButton, TextView textView, KudiButton kudiButton2) {
        this.rootView = cardView;
        this.cancelSuspensionButton = kudiButton;
        this.outletSuspensionText = textView;
        this.yesButton = kudiButton2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletSuspensionConfirmationLayoutBinding bind(View view) {
        int $i0 = C0001R.C0003id.cancelSuspensionButton;
        View $r1 = view.findViewById(C0001R.C0003id.cancelSuspensionButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.outletSuspensionText;
            View $r12 = view.findViewById(C0001R.C0003id.outletSuspensionText);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.yesButton;
                View $r13 = view.findViewById(C0001R.C0003id.yesButton);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    CardView $r6 = (CardView) view;
                    OutletSuspensionConfirmationLayoutBinding $r5 = new OutletSuspensionConfirmationLayoutBinding($r6, $r2, $r3, $r4);
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
    public static OutletSuspensionConfirmationLayoutBinding inflate(LayoutInflater layoutInflater) {
        OutletSuspensionConfirmationLayoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletSuspensionConfirmationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.outlet_suspension_confirmation_layout, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        OutletSuspensionConfirmationLayoutBinding $r3 = bind($r2);
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
