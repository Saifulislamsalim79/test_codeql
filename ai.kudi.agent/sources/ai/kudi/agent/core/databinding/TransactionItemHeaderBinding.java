package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TransactionItemHeaderBinding implements InterfaceC8209a {
    public final KudiTextView dateTextView;
    public final View divider;
    private final ConstraintLayout rootView;

    private TransactionItemHeaderBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, View view) {
        this.rootView = constraintLayout;
        this.dateTextView = kudiTextView;
        this.divider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionItemHeaderBinding bind(View view) {
        View $r1;
        int $i0 = C0038R.C0040id.dateTextView;
        KudiTextView $r2 = (KudiTextView) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = C0038R.C0040id.divider))) != null) {
            ConstraintLayout $r4 = (ConstraintLayout) view;
            TransactionItemHeaderBinding $r3 = new TransactionItemHeaderBinding($r4, $r2, $r1);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName($i0);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionItemHeaderBinding inflate(LayoutInflater layoutInflater) {
        TransactionItemHeaderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionItemHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.transaction_item_header;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TransactionItemHeaderBinding $r3 = bind($r2);
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
