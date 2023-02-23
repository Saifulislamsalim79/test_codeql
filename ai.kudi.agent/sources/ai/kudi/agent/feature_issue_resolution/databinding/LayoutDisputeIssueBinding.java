package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutDisputeIssueBinding implements InterfaceC8209a {
    public final KudiTextView amountTextView;
    public final KudiButton disputeIssueViewTransactionDetails;
    public final TextView errorTextView;
    public final TextView indicatorPhase1;
    public final TextView indicatorPhase2;
    public final TextView indicatorPhase3;
    public final ResolutionDetailsViewBinding issueDetailsView;
    public final TextView issueTypeTextView;
    public final ProgressBar progressBar4;
    public final FrameLayout ratingContainer;
    public final ResolutionMessagesViewBinding resolutionMessagesView;
    private final ScrollView rootView;
    public final ShimmerFrameLayout shimmerLoader;
    public final KudiTextView textPhase1;
    public final KudiTextView textPhase2;
    public final KudiTextView textPhase3;
    public final View view19;

    private LayoutDisputeIssueBinding(ScrollView scrollView, KudiTextView kudiTextView, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, ResolutionDetailsViewBinding resolutionDetailsViewBinding, TextView textView5, ProgressBar progressBar, FrameLayout frameLayout, ResolutionMessagesViewBinding resolutionMessagesViewBinding, ShimmerFrameLayout shimmerFrameLayout, KudiTextView kudiTextView2, KudiTextView kudiTextView3, KudiTextView kudiTextView4, View view) {
        this.rootView = scrollView;
        this.amountTextView = kudiTextView;
        this.disputeIssueViewTransactionDetails = kudiButton;
        this.errorTextView = textView;
        this.indicatorPhase1 = textView2;
        this.indicatorPhase2 = textView3;
        this.indicatorPhase3 = textView4;
        this.issueDetailsView = resolutionDetailsViewBinding;
        this.issueTypeTextView = textView5;
        this.progressBar4 = progressBar;
        this.ratingContainer = frameLayout;
        this.resolutionMessagesView = resolutionMessagesViewBinding;
        this.shimmerLoader = shimmerFrameLayout;
        this.textPhase1 = kudiTextView2;
        this.textPhase2 = kudiTextView3;
        this.textPhase3 = kudiTextView4;
        this.view19 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutDisputeIssueBinding bind(View view) {
        int $i0 = C0214R.C0216id.amountTextView;
        View $r1 = view.findViewById($i0);
        KudiTextView kudiTextView = (KudiTextView) $r1;
        if (kudiTextView != null) {
            $i0 = C0214R.C0216id.disputeIssueViewTransactionDetails;
            View $r12 = view.findViewById($i0);
            KudiButton kudiButton = (KudiButton) $r12;
            if (kudiButton != null) {
                $i0 = C0214R.C0216id.errorTextView;
                View $r13 = view.findViewById($i0);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0214R.C0216id.indicator_phase_1;
                    View $r14 = view.findViewById($i0);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0214R.C0216id.indicator_phase_2;
                        View $r15 = view.findViewById($i0);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0214R.C0216id.indicator_phase_3;
                            View $r16 = view.findViewById($i0);
                            TextView textView4 = (TextView) $r16;
                            if (textView4 != null) {
                                $i0 = C0214R.C0216id.issueDetailsView;
                                View $r17 = view.findViewById($i0);
                                if ($r17 != null) {
                                    ResolutionDetailsViewBinding $r8 = ResolutionDetailsViewBinding.bind($r17);
                                    $i0 = C0214R.C0216id.issueTypeTextView;
                                    View $r18 = view.findViewById($i0);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0214R.C0216id.progressBar4;
                                        View $r19 = view.findViewById($i0);
                                        ProgressBar $r10 = (ProgressBar) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0214R.C0216id.ratingContainer;
                                            View $r110 = view.findViewById($i0);
                                            FrameLayout $r11 = (FrameLayout) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0214R.C0216id.resolutionMessagesView;
                                                View $r111 = view.findViewById($i0);
                                                if ($r111 != null) {
                                                    ResolutionMessagesViewBinding $r122 = ResolutionMessagesViewBinding.bind($r111);
                                                    $i0 = C0214R.C0216id.shimmerLoader;
                                                    View $r112 = view.findViewById($i0);
                                                    ShimmerFrameLayout $r132 = (ShimmerFrameLayout) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0214R.C0216id.text_phase_1;
                                                        View $r113 = view.findViewById($i0);
                                                        KudiTextView $r142 = (KudiTextView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0214R.C0216id.text_phase_2;
                                                            View $r114 = view.findViewById($i0);
                                                            KudiTextView $r152 = (KudiTextView) $r114;
                                                            if ($r152 != null) {
                                                                $i0 = C0214R.C0216id.text_phase_3;
                                                                View $r115 = view.findViewById($i0);
                                                                KudiTextView $r162 = (KudiTextView) $r115;
                                                                if ($r162 != null) {
                                                                    $i0 = C0214R.C0216id.view19;
                                                                    View $r116 = view.findViewById($i0);
                                                                    if ($r116 != null) {
                                                                        ScrollView $r182 = (ScrollView) view;
                                                                        LayoutDisputeIssueBinding $r172 = new LayoutDisputeIssueBinding($r182, kudiTextView, kudiButton, textView, textView2, textView3, textView4, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r116);
                                                                        return $r172;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r192 = view.getResources();
        String $r20 = $r192.getResourceName($i0);
        NullPointerException $r21 = new NullPointerException("Missing required view with ID: ".concat($r20));
        throw $r21;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutDisputeIssueBinding inflate(LayoutInflater layoutInflater) {
        LayoutDisputeIssueBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutDisputeIssueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.layout_dispute_issue;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutDisputeIssueBinding $r3 = bind($r2);
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
