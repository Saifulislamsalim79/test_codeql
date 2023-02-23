package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ItemSavingsDateBinding implements InterfaceC8209a {
    public final TextView dateTextView;
    public final View divider;
    private final ConstraintLayout rootView;

    private ItemSavingsDateBinding(ConstraintLayout constraintLayout, TextView textView, View view) {
        this.rootView = constraintLayout;
        this.dateTextView = textView;
        this.divider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsDateBinding bind(View view) {
        View $r1;
        int $i0 = C0456R.C0458id.dateTextView;
        TextView $r2 = (TextView) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = C0456R.C0458id.divider))) != null) {
            ConstraintLayout $r4 = (ConstraintLayout) view;
            ItemSavingsDateBinding $r3 = new ItemSavingsDateBinding($r4, $r2, $r1);
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
    public static ItemSavingsDateBinding inflate(LayoutInflater layoutInflater) {
        ItemSavingsDateBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsDateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.item_savings_date;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemSavingsDateBinding $r3 = bind($r2);
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
