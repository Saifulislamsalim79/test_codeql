package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TransactionBreakdownContentListingBinding implements InterfaceC8209a {
    public final AppCompatImageView breakdownIcon;
    public final TextView breakdownLabel;
    public final TextView breakdownValue;
    public final View divider;
    private final ConstraintLayout rootView;

    private TransactionBreakdownContentListingBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, View view) {
        this.rootView = constraintLayout;
        this.breakdownIcon = appCompatImageView;
        this.breakdownLabel = textView;
        this.breakdownValue = textView2;
        this.divider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionBreakdownContentListingBinding bind(View view) {
        int $i0 = C0001R.C0003id.breakdown_icon;
        View $r1 = view.findViewById(C0001R.C0003id.breakdown_icon);
        AppCompatImageView $r2 = (AppCompatImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.breakdown_label;
            View $r12 = view.findViewById(C0001R.C0003id.breakdown_label);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.breakdown_value;
                View $r13 = view.findViewById(C0001R.C0003id.breakdown_value);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.divider;
                    View $r14 = view.findViewById(C0001R.C0003id.divider);
                    if ($r14 != null) {
                        TransactionBreakdownContentListingBinding $r5 = new TransactionBreakdownContentListingBinding((ConstraintLayout) view, $r2, $r3, $r4, $r14);
                        return $r5;
                    }
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
    public static TransactionBreakdownContentListingBinding inflate(LayoutInflater layoutInflater) {
        TransactionBreakdownContentListingBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionBreakdownContentListingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.transaction_breakdown_content_listing, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TransactionBreakdownContentListingBinding $r3 = bind($r2);
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
