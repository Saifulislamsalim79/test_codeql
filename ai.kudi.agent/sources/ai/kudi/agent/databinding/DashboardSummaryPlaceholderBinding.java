package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class DashboardSummaryPlaceholderBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final View view17;
    public final View view18;
    public final View view19;
    public final View view20;
    public final View view21;
    public final View view22;

    private DashboardSummaryPlaceholderBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.view17 = view;
        this.view18 = view2;
        this.view19 = view3;
        this.view20 = view4;
        this.view21 = view5;
        this.view22 = view6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DashboardSummaryPlaceholderBinding bind(View view) {
        int $i0 = C0001R.C0003id.view17;
        View $r1 = view.findViewById(C0001R.C0003id.view17);
        if ($r1 != null) {
            $i0 = C0001R.C0003id.view18;
            View $r2 = view.findViewById(C0001R.C0003id.view18);
            if ($r2 != null) {
                $i0 = C0001R.C0003id.view19;
                View $r3 = view.findViewById(C0001R.C0003id.view19);
                if ($r3 != null) {
                    $i0 = C0001R.C0003id.view20;
                    View $r4 = view.findViewById(C0001R.C0003id.view20);
                    if ($r4 != null) {
                        $i0 = C0001R.C0003id.view21;
                        View $r5 = view.findViewById(C0001R.C0003id.view21);
                        if ($r5 != null) {
                            $i0 = C0001R.C0003id.view22;
                            View $r6 = view.findViewById(C0001R.C0003id.view22);
                            if ($r6 != null) {
                                DashboardSummaryPlaceholderBinding $r7 = new DashboardSummaryPlaceholderBinding((ConstraintLayout) view, $r1, $r2, $r3, $r4, $r5, $r6);
                                return $r7;
                            }
                        }
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
    public static DashboardSummaryPlaceholderBinding inflate(LayoutInflater layoutInflater) {
        DashboardSummaryPlaceholderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DashboardSummaryPlaceholderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.dashboard_summary_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        DashboardSummaryPlaceholderBinding $r3 = bind($r2);
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
