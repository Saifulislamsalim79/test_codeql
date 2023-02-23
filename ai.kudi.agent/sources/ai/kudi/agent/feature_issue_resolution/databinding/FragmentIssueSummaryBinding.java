package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentIssueSummaryBinding implements InterfaceC8209a {
    public final KudiTextView cancelButton;
    public final RecyclerView recyclerView2;
    private final ScrollView rootView;
    public final KudiButton submitIssueButton;

    private FragmentIssueSummaryBinding(ScrollView scrollView, KudiTextView kudiTextView, RecyclerView recyclerView, KudiButton kudiButton) {
        this.rootView = scrollView;
        this.cancelButton = kudiTextView;
        this.recyclerView2 = recyclerView;
        this.submitIssueButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueSummaryBinding bind(View view) {
        int $i0 = C0214R.C0216id.cancelButton;
        View $r1 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.recyclerView2;
            View $r12 = view.findViewById($i0);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.submitIssueButton;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    ScrollView $r6 = (ScrollView) view;
                    FragmentIssueSummaryBinding $r5 = new FragmentIssueSummaryBinding($r6, $r2, $r3, $r4);
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
    public static FragmentIssueSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentIssueSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_issue_summary;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentIssueSummaryBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
