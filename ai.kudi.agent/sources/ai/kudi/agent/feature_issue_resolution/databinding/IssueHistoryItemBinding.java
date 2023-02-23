package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class IssueHistoryItemBinding implements InterfaceC8209a {
    public final KudiTextView issueDateView;
    public final ImageView issueStatusIndicator;
    public final KudiTextView issueTypeNameView;
    private final ConstraintLayout rootView;
    public final KudiTextView ticketNoView;
    public final KudiTextView ticketStatusView;
    public final View view27;

    private IssueHistoryItemBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, ImageView imageView, KudiTextView kudiTextView2, KudiTextView kudiTextView3, KudiTextView kudiTextView4, View view) {
        this.rootView = constraintLayout;
        this.issueDateView = kudiTextView;
        this.issueStatusIndicator = imageView;
        this.issueTypeNameView = kudiTextView2;
        this.ticketNoView = kudiTextView3;
        this.ticketStatusView = kudiTextView4;
        this.view27 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueHistoryItemBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.issueDateView;
        View $r12 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r12;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.issueStatusIndicator;
            View $r13 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r13;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.issueTypeNameView;
                View $r14 = view.findViewById($i0);
                KudiTextView $r4 = (KudiTextView) $r14;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.ticketNoView;
                    View $r15 = view.findViewById($i0);
                    KudiTextView kudiTextView = (KudiTextView) $r15;
                    if (kudiTextView != null) {
                        $i0 = C0214R.C0216id.ticketStatusView;
                        View $r16 = view.findViewById($i0);
                        KudiTextView kudiTextView2 = (KudiTextView) $r16;
                        if (kudiTextView2 != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.view27))) != null) {
                            IssueHistoryItemBinding $r7 = new IssueHistoryItemBinding((ConstraintLayout) view, $r2, $r3, $r4, kudiTextView, kudiTextView2, $r1);
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
    public static IssueHistoryItemBinding inflate(LayoutInflater layoutInflater) {
        IssueHistoryItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueHistoryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.issue_history_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        IssueHistoryItemBinding $r3 = bind($r2);
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
