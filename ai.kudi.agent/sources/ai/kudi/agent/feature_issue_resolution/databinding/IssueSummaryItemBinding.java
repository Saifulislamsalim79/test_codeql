package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class IssueSummaryItemBinding implements InterfaceC8209a {
    public final KudiTextView issueDescription;
    public final KudiTextView issueTitle;
    private final LinearLayout rootView;
    public final View view14;

    private IssueSummaryItemBinding(LinearLayout linearLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, View view) {
        this.rootView = linearLayout;
        this.issueDescription = kudiTextView;
        this.issueTitle = kudiTextView2;
        this.view14 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueSummaryItemBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.issueDescription;
        View $r12 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r12;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.issueTitle;
            View $r13 = view.findViewById($i0);
            KudiTextView $r3 = (KudiTextView) $r13;
            if ($r3 != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.view14))) != null) {
                LinearLayout $r5 = (LinearLayout) view;
                IssueSummaryItemBinding $r4 = new IssueSummaryItemBinding($r5, $r2, $r3, $r1);
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
    public static IssueSummaryItemBinding inflate(LayoutInflater layoutInflater) {
        IssueSummaryItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueSummaryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.issue_summary_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        IssueSummaryItemBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
