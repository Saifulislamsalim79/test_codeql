package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentInboxIssueListBinding implements InterfaceC8209a {
    public final LinearLayout emptyLayout;
    public final ProgressBar inboxProgressBar;
    public final RecyclerView inboxRecylerview;
    public final TextView inboxText;
    public final ProgressBar nextProgressiveBar;
    private final ConstraintLayout rootView;

    private FragmentInboxIssueListBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, ProgressBar progressBar2) {
        this.rootView = constraintLayout;
        this.emptyLayout = linearLayout;
        this.inboxProgressBar = progressBar;
        this.inboxRecylerview = recyclerView;
        this.inboxText = textView;
        this.nextProgressiveBar = progressBar2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentInboxIssueListBinding bind(View view) {
        int $i0 = C0001R.C0003id.emptyLayout;
        View $r1 = view.findViewById(C0001R.C0003id.emptyLayout);
        LinearLayout $r2 = (LinearLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.inboxProgressBar;
            View $r12 = view.findViewById(C0001R.C0003id.inboxProgressBar);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.inboxRecylerview;
                View $r13 = view.findViewById(C0001R.C0003id.inboxRecylerview);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.inboxText;
                    View $r14 = view.findViewById(C0001R.C0003id.inboxText);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.nextProgressiveBar;
                        View $r15 = view.findViewById(C0001R.C0003id.nextProgressiveBar);
                        ProgressBar progressBar = (ProgressBar) $r15;
                        if (progressBar != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            FragmentInboxIssueListBinding $r7 = new FragmentInboxIssueListBinding($r8, $r2, $r3, $r4, textView, progressBar);
                            return $r7;
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
    public static FragmentInboxIssueListBinding inflate(LayoutInflater layoutInflater) {
        FragmentInboxIssueListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentInboxIssueListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_inbox_issue_list, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentInboxIssueListBinding $r3 = bind($r2);
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
