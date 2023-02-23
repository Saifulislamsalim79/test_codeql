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
public final class ItemSavingDetailBinding implements InterfaceC8209a {
    public final View divider1;
    private final ConstraintLayout rootView;
    public final TextView textView18;
    public final TextView textView61;

    private ItemSavingDetailBinding(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.divider1 = view;
        this.textView18 = textView;
        this.textView61 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingDetailBinding bind(View view) {
        int $i0 = C0456R.C0458id.divider1;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            $i0 = C0456R.C0458id.textView18;
            View $r2 = view.findViewById($i0);
            TextView $r3 = (TextView) $r2;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.textView61;
                View $r22 = view.findViewById($i0);
                TextView $r4 = (TextView) $r22;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    ItemSavingDetailBinding $r5 = new ItemSavingDetailBinding($r6, $r1, $r3, $r4);
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
    public static ItemSavingDetailBinding inflate(LayoutInflater layoutInflater) {
        ItemSavingDetailBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.item_saving_detail;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemSavingDetailBinding $r3 = bind($r2);
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
