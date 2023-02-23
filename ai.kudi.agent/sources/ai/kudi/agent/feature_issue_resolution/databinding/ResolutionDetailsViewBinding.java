package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ResolutionDetailsViewBinding implements InterfaceC8209a {
    public final RecyclerView recyclerViewIssueDetail;
    private final ConstraintLayout rootView;
    public final TextView textView21;
    public final View view20;

    private ResolutionDetailsViewBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, View view) {
        this.rootView = constraintLayout;
        this.recyclerViewIssueDetail = recyclerView;
        this.textView21 = textView;
        this.view20 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionDetailsViewBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.recyclerViewIssueDetail;
        View $r12 = view.findViewById($i0);
        RecyclerView $r2 = (RecyclerView) $r12;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.textView21;
            View $r13 = view.findViewById($i0);
            TextView $r3 = (TextView) $r13;
            if ($r3 != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.view20))) != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                ResolutionDetailsViewBinding $r4 = new ResolutionDetailsViewBinding($r5, $r2, $r3, $r1);
                return $r4;
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
    public static ResolutionDetailsViewBinding inflate(LayoutInflater layoutInflater) {
        ResolutionDetailsViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionDetailsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.resolution_details_view;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ResolutionDetailsViewBinding $r3 = bind($r2);
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
