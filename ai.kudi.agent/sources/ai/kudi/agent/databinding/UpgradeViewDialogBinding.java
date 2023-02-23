package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class UpgradeViewDialogBinding implements InterfaceC8209a {
    public final ProgressBar loadingProgressBar;
    private final CardView rootView;
    public final TextView textView39;

    private UpgradeViewDialogBinding(CardView cardView, ProgressBar progressBar, TextView textView) {
        this.rootView = cardView;
        this.loadingProgressBar = progressBar;
        this.textView39 = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpgradeViewDialogBinding bind(View view) {
        int $i0 = C0001R.C0003id.loadingProgressBar;
        View $r1 = view.findViewById(C0001R.C0003id.loadingProgressBar);
        ProgressBar $r2 = (ProgressBar) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.textView39;
            View $r12 = view.findViewById(C0001R.C0003id.textView39);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                CardView $r5 = (CardView) view;
                UpgradeViewDialogBinding $r4 = new UpgradeViewDialogBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpgradeViewDialogBinding inflate(LayoutInflater layoutInflater) {
        UpgradeViewDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpgradeViewDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.upgrade_view_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        UpgradeViewDialogBinding $r3 = bind($r2);
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
