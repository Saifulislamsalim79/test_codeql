package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class BottomCreateAcctViewBinding implements InterfaceC8209a {
    public final TextView acctPromptView;
    public final ConstraintLayout constraintLayout4;
    public final KudiTextView createAcctTextView;
    private final ConstraintLayout rootView;

    private BottomCreateAcctViewBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, KudiTextView kudiTextView) {
        this.rootView = constraintLayout;
        this.acctPromptView = textView;
        this.constraintLayout4 = constraintLayout2;
        this.createAcctTextView = kudiTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomCreateAcctViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.acctPromptView;
        View $r1 = view.findViewById(C0001R.C0003id.acctPromptView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            ConstraintLayout $r3 = (ConstraintLayout) view;
            View $r12 = view.findViewById(C0001R.C0003id.createAcctTextView);
            KudiTextView $r4 = (KudiTextView) $r12;
            if ($r4 != null) {
                BottomCreateAcctViewBinding $r5 = new BottomCreateAcctViewBinding($r3, $r2, $r3, $r4);
                return $r5;
            }
            $i0 = C0001R.C0003id.createAcctTextView;
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomCreateAcctViewBinding inflate(LayoutInflater layoutInflater) {
        BottomCreateAcctViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomCreateAcctViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.bottom_create_acct_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        BottomCreateAcctViewBinding $r3 = bind($r2);
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
