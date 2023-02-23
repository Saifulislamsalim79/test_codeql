package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class P2pSummaryItemBinding implements InterfaceC8209a {
    public final TextView p2pSummaryDetailView;
    public final TextView p2pSummaryEditButton;
    public final TextView p2pSummaryTitleView;
    private final ConstraintLayout rootView;
    public final View view14;

    private P2pSummaryItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = constraintLayout;
        this.p2pSummaryDetailView = textView;
        this.p2pSummaryEditButton = textView2;
        this.p2pSummaryTitleView = textView3;
        this.view14 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static P2pSummaryItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.p2pSummaryDetailView;
        View $r1 = view.findViewById(C0001R.C0003id.p2pSummaryDetailView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.p2pSummaryEditButton;
            View $r12 = view.findViewById(C0001R.C0003id.p2pSummaryEditButton);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.p2pSummaryTitleView;
                View $r13 = view.findViewById(C0001R.C0003id.p2pSummaryTitleView);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.view14;
                    View $r14 = view.findViewById(C0001R.C0003id.view14);
                    if ($r14 != null) {
                        P2pSummaryItemBinding $r5 = new P2pSummaryItemBinding((ConstraintLayout) view, $r2, $r3, $r4, $r14);
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
    public static P2pSummaryItemBinding inflate(LayoutInflater layoutInflater) {
        P2pSummaryItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static P2pSummaryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.p2p_summary_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        P2pSummaryItemBinding $r3 = bind($r2);
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
