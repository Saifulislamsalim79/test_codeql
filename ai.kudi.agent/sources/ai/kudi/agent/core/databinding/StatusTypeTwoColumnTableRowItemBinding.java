package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class StatusTypeTwoColumnTableRowItemBinding implements InterfaceC8209a {
    public final ImageView icon;
    public final TextView loanStatus;
    public final TextView loanStatusLabel;
    private final ConstraintLayout rootView;
    public final View statusDivider;
    public final LinearLayoutCompat statusLinear;

    private StatusTypeTwoColumnTableRowItemBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, View view, LinearLayoutCompat linearLayoutCompat) {
        this.rootView = constraintLayout;
        this.icon = imageView;
        this.loanStatus = textView;
        this.loanStatusLabel = textView2;
        this.statusDivider = view;
        this.statusLinear = linearLayoutCompat;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static StatusTypeTwoColumnTableRowItemBinding bind(View view) {
        View $r1;
        int $i0 = C0038R.C0040id.icon;
        View $r12 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r12;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.loan_status;
            View $r13 = view.findViewById($i0);
            TextView $r3 = (TextView) $r13;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.loan_status_label;
                View $r14 = view.findViewById($i0);
                TextView $r4 = (TextView) $r14;
                if ($r4 != null && ($r1 = view.findViewById(($i0 = C0038R.C0040id.status_divider))) != null) {
                    $i0 = C0038R.C0040id.status_linear;
                    View $r5 = view.findViewById($i0);
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) $r5;
                    if (linearLayoutCompat != null) {
                        StatusTypeTwoColumnTableRowItemBinding $r7 = new StatusTypeTwoColumnTableRowItemBinding((ConstraintLayout) view, $r2, $r3, $r4, $r1, linearLayoutCompat);
                        return $r7;
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static StatusTypeTwoColumnTableRowItemBinding inflate(LayoutInflater layoutInflater) {
        StatusTypeTwoColumnTableRowItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static StatusTypeTwoColumnTableRowItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.status_type_two_column_table_row_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        StatusTypeTwoColumnTableRowItemBinding $r3 = bind($r2);
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
