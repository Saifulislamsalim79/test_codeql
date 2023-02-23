package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPosEligibilityBinding implements InterfaceC8209a {
    public final TextView activatePosView;
    public final CardView cardView;
    public final TextView clickHereForReplacementButton;
    public final ApplyPosRepairReplacementBinding eligibleRepairReplacementView;
    public final NeedPosViewBinding getPosContainer;
    public final ConstraintLayout getPosForDownlinesContainer;
    public final TextView getPosTextview;
    public final ImageView imageView15;
    public final ListLoaderViewBinding loaderView;
    public final TextView posDiscountTextView;
    public final TextView replaceBankTerminalText;
    public final CardView replaceTerminalContainer;
    private final NestedScrollView rootView;
    public final PosRequestsSummaryView summaryView;
    public final ViewPosInfoBinding terminalDetailsLayout;
    public final CardView terminalDetailsView;
    public final TextView textView50;
    public final TextView textView51;
    public final TextView textView56;
    public final ViewTrackPosBinding trackPOS;
    public final ConstraintLayout trackPosContainer;

    private FragmentPosEligibilityBinding(NestedScrollView nestedScrollView, TextView textView, CardView cardView, TextView textView2, ApplyPosRepairReplacementBinding applyPosRepairReplacementBinding, NeedPosViewBinding needPosViewBinding, ConstraintLayout constraintLayout, TextView textView3, ImageView imageView, ListLoaderViewBinding listLoaderViewBinding, TextView textView4, TextView textView5, CardView cardView2, PosRequestsSummaryView posRequestsSummaryView, ViewPosInfoBinding viewPosInfoBinding, CardView cardView3, TextView textView6, TextView textView7, TextView textView8, ViewTrackPosBinding viewTrackPosBinding, ConstraintLayout constraintLayout2) {
        this.rootView = nestedScrollView;
        this.activatePosView = textView;
        this.cardView = cardView;
        this.clickHereForReplacementButton = textView2;
        this.eligibleRepairReplacementView = applyPosRepairReplacementBinding;
        this.getPosContainer = needPosViewBinding;
        this.getPosForDownlinesContainer = constraintLayout;
        this.getPosTextview = textView3;
        this.imageView15 = imageView;
        this.loaderView = listLoaderViewBinding;
        this.posDiscountTextView = textView4;
        this.replaceBankTerminalText = textView5;
        this.replaceTerminalContainer = cardView2;
        this.summaryView = posRequestsSummaryView;
        this.terminalDetailsLayout = viewPosInfoBinding;
        this.terminalDetailsView = cardView3;
        this.textView50 = textView6;
        this.textView51 = textView7;
        this.textView56 = textView8;
        this.trackPOS = viewTrackPosBinding;
        this.trackPosContainer = constraintLayout2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosEligibilityBinding bind(View view) {
        int $i0 = C0001R.C0003id.activate_pos_view;
        View $r1 = view.findViewById(C0001R.C0003id.activate_pos_view);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.card_view;
            View $r12 = view.findViewById(C0001R.C0003id.card_view);
            CardView cardView = (CardView) $r12;
            if (cardView != null) {
                $i0 = C0001R.C0003id.click_here_for_replacement_button;
                View $r13 = view.findViewById(C0001R.C0003id.click_here_for_replacement_button);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.eligible_repair_replacement_view;
                    View $r14 = view.findViewById(C0001R.C0003id.eligible_repair_replacement_view);
                    if ($r14 != null) {
                        ApplyPosRepairReplacementBinding $r5 = ApplyPosRepairReplacementBinding.bind($r14);
                        $i0 = C0001R.C0003id.get_pos_container;
                        View $r15 = view.findViewById(C0001R.C0003id.get_pos_container);
                        if ($r15 != null) {
                            NeedPosViewBinding $r6 = NeedPosViewBinding.bind($r15);
                            $i0 = C0001R.C0003id.get_pos_for_downlines_container;
                            View $r16 = view.findViewById(C0001R.C0003id.get_pos_for_downlines_container);
                            ConstraintLayout constraintLayout = (ConstraintLayout) $r16;
                            if (constraintLayout != null) {
                                $i0 = C0001R.C0003id.get_pos_textview;
                                View $r17 = view.findViewById(C0001R.C0003id.get_pos_textview);
                                TextView textView3 = (TextView) $r17;
                                if (textView3 != null) {
                                    $i0 = C0001R.C0003id.imageView15;
                                    View $r18 = view.findViewById(C0001R.C0003id.imageView15);
                                    ImageView $r9 = (ImageView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.loader_view;
                                        View $r19 = view.findViewById(C0001R.C0003id.loader_view);
                                        if ($r19 != null) {
                                            ListLoaderViewBinding $r10 = ListLoaderViewBinding.bind($r19);
                                            $i0 = C0001R.C0003id.pos_discount_text_view;
                                            View $r110 = view.findViewById(C0001R.C0003id.pos_discount_text_view);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.replace_bank_terminal_text;
                                                View $r111 = view.findViewById(C0001R.C0003id.replace_bank_terminal_text);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.replace_terminal_container;
                                                    View $r112 = view.findViewById(C0001R.C0003id.replace_terminal_container);
                                                    CardView $r132 = (CardView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.summary_view;
                                                        View $r113 = view.findViewById(C0001R.C0003id.summary_view);
                                                        PosRequestsSummaryView $r142 = (PosRequestsSummaryView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.terminal_details_layout;
                                                            View $r114 = view.findViewById(C0001R.C0003id.terminal_details_layout);
                                                            if ($r114 != null) {
                                                                ViewPosInfoBinding $r152 = ViewPosInfoBinding.bind($r114);
                                                                $i0 = C0001R.C0003id.terminal_details_view;
                                                                View $r115 = view.findViewById(C0001R.C0003id.terminal_details_view);
                                                                CardView $r162 = (CardView) $r115;
                                                                if ($r162 != null) {
                                                                    $i0 = C0001R.C0003id.textView50;
                                                                    View $r116 = view.findViewById(C0001R.C0003id.textView50);
                                                                    TextView $r172 = (TextView) $r116;
                                                                    if ($r172 != null) {
                                                                        $i0 = C0001R.C0003id.textView51;
                                                                        View $r117 = view.findViewById(C0001R.C0003id.textView51);
                                                                        TextView $r182 = (TextView) $r117;
                                                                        if ($r182 != null) {
                                                                            $i0 = C0001R.C0003id.textView56;
                                                                            View $r118 = view.findViewById(C0001R.C0003id.textView56);
                                                                            TextView $r192 = (TextView) $r118;
                                                                            if ($r192 != null) {
                                                                                $i0 = C0001R.C0003id.trackPOS;
                                                                                View $r119 = view.findViewById(C0001R.C0003id.trackPOS);
                                                                                if ($r119 != null) {
                                                                                    ViewTrackPosBinding $r20 = ViewTrackPosBinding.bind($r119);
                                                                                    $i0 = C0001R.C0003id.track_pos_container;
                                                                                    View $r120 = view.findViewById(C0001R.C0003id.track_pos_container);
                                                                                    ConstraintLayout $r21 = (ConstraintLayout) $r120;
                                                                                    if ($r21 != null) {
                                                                                        NestedScrollView $r23 = (NestedScrollView) view;
                                                                                        FragmentPosEligibilityBinding $r22 = new FragmentPosEligibilityBinding($r23, textView, cardView, textView2, $r5, $r6, constraintLayout, textView3, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r172, $r182, $r192, $r20, $r21);
                                                                                        return $r22;
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
                    }
                }
            }
        }
        Resources $r24 = view.getResources();
        String $r25 = $r24.getResourceName($i0);
        NullPointerException $r26 = new NullPointerException("Missing required view with ID: ".concat($r25));
        throw $r26;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosEligibilityBinding inflate(LayoutInflater layoutInflater) {
        FragmentPosEligibilityBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosEligibilityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pos_eligibility, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPosEligibilityBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
