package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewPosRequestsSummaryBinding implements InterfaceC8209a {
    public final RecyclerView posOverViewRecyclerView;
    public final FrameLayout posOverviewProgressBar;
    public final TextView posOverviewTitle;
    private final View rootView;

    private ViewPosRequestsSummaryBinding(View view, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView) {
        this.rootView = view;
        this.posOverViewRecyclerView = recyclerView;
        this.posOverviewProgressBar = frameLayout;
        this.posOverviewTitle = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPosRequestsSummaryBinding bind(View view) {
        int $i0 = C0001R.C0003id.pos_over_view_recycler_view;
        View $r1 = view.findViewById(C0001R.C0003id.pos_over_view_recycler_view);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.pos_overview_progress_bar;
            View $r12 = view.findViewById(C0001R.C0003id.pos_overview_progress_bar);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.pos_overview_title;
                View $r13 = view.findViewById(C0001R.C0003id.pos_overview_title);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ViewPosRequestsSummaryBinding $r5 = new ViewPosRequestsSummaryBinding(view, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPosRequestsSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            NullPointerException $r3 = new NullPointerException("parent");
            throw $r3;
        }
        layoutInflater.inflate(C0001R.C0004layout.view_pos_requests_summary, viewGroup);
        ViewPosRequestsSummaryBinding $r0 = bind(viewGroup);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public View getRoot() {
        View r1 = this.rootView;
        return r1;
    }
}
