package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TwoColumnTableRowItemBinding implements InterfaceC8209a {
    public final Guideline guideline;
    private final ConstraintLayout rootView;
    public final View statusDivider;
    public final KudiTextView titleText;
    public final KudiTextView valueText;

    private TwoColumnTableRowItemBinding(ConstraintLayout constraintLayout, Guideline guideline, View view, KudiTextView kudiTextView, KudiTextView kudiTextView2) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.statusDivider = view;
        this.titleText = kudiTextView;
        this.valueText = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TwoColumnTableRowItemBinding bind(View view) {
        View $r1;
        int $i0 = C0038R.C0040id.guideline;
        Guideline $r2 = (Guideline) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = C0038R.C0040id.status_divider))) != null) {
            $i0 = C0038R.C0040id.title_text;
            View $r3 = view.findViewById($i0);
            KudiTextView $r4 = (KudiTextView) $r3;
            if ($r4 != null) {
                $i0 = C0038R.C0040id.value_text;
                View $r32 = view.findViewById($i0);
                KudiTextView $r5 = (KudiTextView) $r32;
                if ($r5 != null) {
                    TwoColumnTableRowItemBinding $r6 = new TwoColumnTableRowItemBinding((ConstraintLayout) view, $r2, $r1, $r4, $r5);
                    return $r6;
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TwoColumnTableRowItemBinding inflate(LayoutInflater layoutInflater) {
        TwoColumnTableRowItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TwoColumnTableRowItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.two_column_table_row_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TwoColumnTableRowItemBinding $r3 = bind($r2);
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
