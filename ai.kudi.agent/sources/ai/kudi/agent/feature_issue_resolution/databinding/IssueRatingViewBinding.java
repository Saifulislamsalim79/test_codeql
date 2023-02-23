package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class IssueRatingViewBinding implements InterfaceC8209a {
    public final ImageView closeDialogButton;
    public final ProgressBar issueRatingProgressBar;
    public final RecyclerView ratingBar;
    private final ConstraintLayout rootView;
    public final TextView textView21;
    public final View view20;

    private IssueRatingViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, View view) {
        this.rootView = constraintLayout;
        this.closeDialogButton = imageView;
        this.issueRatingProgressBar = progressBar;
        this.ratingBar = recyclerView;
        this.textView21 = textView;
        this.view20 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueRatingViewBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.close_dialog_button;
        View $r12 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r12;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.issue_rating_progress_bar;
            View $r13 = view.findViewById($i0);
            ProgressBar $r3 = (ProgressBar) $r13;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.ratingBar;
                View $r14 = view.findViewById($i0);
                RecyclerView $r4 = (RecyclerView) $r14;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.textView21;
                    View $r15 = view.findViewById($i0);
                    TextView textView = (TextView) $r15;
                    if (textView != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.view20))) != null) {
                        IssueRatingViewBinding $r6 = new IssueRatingViewBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, $r1);
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
    public static IssueRatingViewBinding inflate(LayoutInflater layoutInflater) {
        IssueRatingViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueRatingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.issue_rating_view;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        IssueRatingViewBinding $r3 = bind($r2);
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
