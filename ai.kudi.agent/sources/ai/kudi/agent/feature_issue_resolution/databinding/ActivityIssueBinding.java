package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityIssueBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final FrameLayout issueContainerFrameLayout;
    private final ConstraintLayout rootView;
    public final Toolbar searchToolbar;
    public final Toolbar toolbar;

    private ActivityIssueBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, Toolbar toolbar, Toolbar toolbar2) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.issueContainerFrameLayout = frameLayout;
        this.searchToolbar = toolbar;
        this.toolbar = toolbar2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityIssueBinding bind(View view) {
        int $i0 = C0214R.C0216id.app_bar_layout;
        View $r1 = view.findViewById($i0);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.issueContainerFrameLayout;
            View $r12 = view.findViewById($i0);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.searchToolbar;
                View $r13 = view.findViewById($i0);
                Toolbar $r4 = (Toolbar) $r13;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.toolbar;
                    View $r14 = view.findViewById($i0);
                    Toolbar $r5 = (Toolbar) $r14;
                    if ($r5 != null) {
                        ActivityIssueBinding $r6 = new ActivityIssueBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
                        return $r6;
                    }
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
    public static ActivityIssueBinding inflate(LayoutInflater layoutInflater) {
        ActivityIssueBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityIssueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.activity_issue;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityIssueBinding $r3 = bind($r2);
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
