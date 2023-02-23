package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TransactionListLoaderPlaceHolderBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final View view15;
    public final View view16;
    public final View view8;

    private TransactionListLoaderPlaceHolderBinding(ConstraintLayout constraintLayout, View view, View view2, View view3) {
        this.rootView = constraintLayout;
        this.view15 = view;
        this.view16 = view2;
        this.view8 = view3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionListLoaderPlaceHolderBinding bind(View view) {
        View $r2;
        View $r3;
        int $i0 = C0038R.C0040id.view15;
        View $r1 = view.findViewById($i0);
        if ($r1 != null && ($r2 = view.findViewById(($i0 = C0038R.C0040id.view16))) != null && ($r3 = view.findViewById(($i0 = C0038R.C0040id.view8))) != null) {
            ConstraintLayout $r5 = (ConstraintLayout) view;
            TransactionListLoaderPlaceHolderBinding $r4 = new TransactionListLoaderPlaceHolderBinding($r5, $r1, $r2, $r3);
            return $r4;
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionListLoaderPlaceHolderBinding inflate(LayoutInflater layoutInflater) {
        TransactionListLoaderPlaceHolderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionListLoaderPlaceHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.transaction_list_loader_place_holder;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TransactionListLoaderPlaceHolderBinding $r3 = bind($r2);
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
