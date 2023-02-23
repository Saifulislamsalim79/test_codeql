package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentDisputeBinding implements InterfaceC8209a {
    public final LinearLayout agentCommissionLayout;
    public final TextView agentCommissionTextView;
    public final TextView amountTextView;
    public final LinearLayout dateLayout;
    public final TextView dateTextView;
    public final TextView dateTitle;
    public final TextView descriptionTextView;
    public final TextView errorTextView;
    public final FrameLayout extraInformationFragment;
    public final TextView feeSectionTitle;
    public final LinearLayout feesLayout;
    public final View firstDivider;
    public final TextView inProgressCircleView;
    public final TextView inProgressView;
    public final LinearLayout kudiCommissionLayout;
    public final TextView kudiCommissionTextView;
    public final TextView messageNotification;
    public final CardView notificationCard;
    public final ProgressBar progressBar;
    public final TextView receivedCircleView;
    public final TextView receivedView;
    public final LinearLayout referenceLayout;
    public final TextView referenceTextView;
    public final TextView referenceTitle;
    public final RecyclerView resolutionLayout;
    public final TextView resolutionSectionHeader;
    public final TextView resolutionStatusTextView;
    public final TextView resolvedCircleView;
    public final TextView resolvedView;
    public final ConstraintLayout rootLayout;
    private final ScrollView rootView;
    public final View secondDivider;
    public final View secondDivider2;
    public final LinearLayout serviceFeeLayout;
    public final TextView serviceFeeTextView;
    public final View statusDividerOne;
    public final View statusDividerTwo;
    public final View thirdDivider;

    private FragmentDisputeBinding(ScrollView scrollView, LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, FrameLayout frameLayout, TextView textView7, LinearLayout linearLayout3, View view, TextView textView8, TextView textView9, LinearLayout linearLayout4, TextView textView10, TextView textView11, CardView cardView, ProgressBar progressBar, TextView textView12, TextView textView13, LinearLayout linearLayout5, TextView textView14, TextView textView15, RecyclerView recyclerView, TextView textView16, TextView textView17, TextView textView18, TextView textView19, ConstraintLayout constraintLayout, View view2, View view3, LinearLayout linearLayout6, TextView textView20, View view4, View view5, View view6) {
        this.rootView = scrollView;
        this.agentCommissionLayout = linearLayout;
        this.agentCommissionTextView = textView;
        this.amountTextView = textView2;
        this.dateLayout = linearLayout2;
        this.dateTextView = textView3;
        this.dateTitle = textView4;
        this.descriptionTextView = textView5;
        this.errorTextView = textView6;
        this.extraInformationFragment = frameLayout;
        this.feeSectionTitle = textView7;
        this.feesLayout = linearLayout3;
        this.firstDivider = view;
        this.inProgressCircleView = textView8;
        this.inProgressView = textView9;
        this.kudiCommissionLayout = linearLayout4;
        this.kudiCommissionTextView = textView10;
        this.messageNotification = textView11;
        this.notificationCard = cardView;
        this.progressBar = progressBar;
        this.receivedCircleView = textView12;
        this.receivedView = textView13;
        this.referenceLayout = linearLayout5;
        this.referenceTextView = textView14;
        this.referenceTitle = textView15;
        this.resolutionLayout = recyclerView;
        this.resolutionSectionHeader = textView16;
        this.resolutionStatusTextView = textView17;
        this.resolvedCircleView = textView18;
        this.resolvedView = textView19;
        this.rootLayout = constraintLayout;
        this.secondDivider = view2;
        this.secondDivider2 = view3;
        this.serviceFeeLayout = linearLayout6;
        this.serviceFeeTextView = textView20;
        this.statusDividerOne = view4;
        this.statusDividerTwo = view5;
        this.thirdDivider = view6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDisputeBinding bind(View view) {
        int $i0 = C0001R.C0003id.agentCommissionLayout;
        View $r1 = view.findViewById(C0001R.C0003id.agentCommissionLayout);
        LinearLayout linearLayout = (LinearLayout) $r1;
        if (linearLayout != null) {
            $i0 = C0001R.C0003id.agentCommissionTextView;
            View $r12 = view.findViewById(C0001R.C0003id.agentCommissionTextView);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.amountTextView;
                View $r13 = view.findViewById(C0001R.C0003id.amountTextView);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.dateLayout;
                    View $r14 = view.findViewById(C0001R.C0003id.dateLayout);
                    LinearLayout linearLayout2 = (LinearLayout) $r14;
                    if (linearLayout2 != null) {
                        $i0 = C0001R.C0003id.dateTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.dateTextView);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.dateTitle;
                            View $r16 = view.findViewById(C0001R.C0003id.dateTitle);
                            TextView textView4 = (TextView) $r16;
                            if (textView4 != null) {
                                $i0 = C0001R.C0003id.descriptionTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.descriptionTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.errorTextView;
                                    View $r18 = view.findViewById(C0001R.C0003id.errorTextView);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.extraInformationFragment;
                                        View $r19 = view.findViewById(C0001R.C0003id.extraInformationFragment);
                                        FrameLayout $r10 = (FrameLayout) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.feeSectionTitle;
                                            View $r110 = view.findViewById(C0001R.C0003id.feeSectionTitle);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.feesLayout;
                                                View $r111 = view.findViewById(C0001R.C0003id.feesLayout);
                                                LinearLayout $r122 = (LinearLayout) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.firstDivider;
                                                    View $r112 = view.findViewById(C0001R.C0003id.firstDivider);
                                                    if ($r112 != null) {
                                                        $i0 = C0001R.C0003id.inProgressCircleView;
                                                        View $r132 = view.findViewById(C0001R.C0003id.inProgressCircleView);
                                                        TextView $r142 = (TextView) $r132;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.inProgressView;
                                                            View $r133 = view.findViewById(C0001R.C0003id.inProgressView);
                                                            TextView $r152 = (TextView) $r133;
                                                            if ($r152 != null) {
                                                                $i0 = C0001R.C0003id.kudiCommissionLayout;
                                                                View $r134 = view.findViewById(C0001R.C0003id.kudiCommissionLayout);
                                                                LinearLayout $r162 = (LinearLayout) $r134;
                                                                if ($r162 != null) {
                                                                    $i0 = C0001R.C0003id.kudiCommissionTextView;
                                                                    View $r135 = view.findViewById(C0001R.C0003id.kudiCommissionTextView);
                                                                    TextView $r172 = (TextView) $r135;
                                                                    if ($r172 != null) {
                                                                        $i0 = C0001R.C0003id.message_notification;
                                                                        View $r136 = view.findViewById(C0001R.C0003id.message_notification);
                                                                        TextView $r182 = (TextView) $r136;
                                                                        if ($r182 != null) {
                                                                            $i0 = C0001R.C0003id.notificationCard;
                                                                            View $r137 = view.findViewById(C0001R.C0003id.notificationCard);
                                                                            CardView $r192 = (CardView) $r137;
                                                                            if ($r192 != null) {
                                                                                $i0 = C0001R.C0003id.progressBar;
                                                                                View $r138 = view.findViewById(C0001R.C0003id.progressBar);
                                                                                ProgressBar $r20 = (ProgressBar) $r138;
                                                                                if ($r20 != null) {
                                                                                    $i0 = C0001R.C0003id.receivedCircleView;
                                                                                    View $r139 = view.findViewById(C0001R.C0003id.receivedCircleView);
                                                                                    TextView $r21 = (TextView) $r139;
                                                                                    if ($r21 != null) {
                                                                                        $i0 = C0001R.C0003id.receivedView;
                                                                                        View $r1310 = view.findViewById(C0001R.C0003id.receivedView);
                                                                                        TextView $r22 = (TextView) $r1310;
                                                                                        if ($r22 != null) {
                                                                                            $i0 = C0001R.C0003id.referenceLayout;
                                                                                            View $r1311 = view.findViewById(C0001R.C0003id.referenceLayout);
                                                                                            LinearLayout $r23 = (LinearLayout) $r1311;
                                                                                            if ($r23 != null) {
                                                                                                $i0 = C0001R.C0003id.referenceTextView;
                                                                                                View $r1312 = view.findViewById(C0001R.C0003id.referenceTextView);
                                                                                                TextView $r24 = (TextView) $r1312;
                                                                                                if ($r24 != null) {
                                                                                                    $i0 = C0001R.C0003id.referenceTitle;
                                                                                                    View $r1313 = view.findViewById(C0001R.C0003id.referenceTitle);
                                                                                                    TextView $r25 = (TextView) $r1313;
                                                                                                    if ($r25 != null) {
                                                                                                        $i0 = C0001R.C0003id.resolutionLayout;
                                                                                                        View $r1314 = view.findViewById(C0001R.C0003id.resolutionLayout);
                                                                                                        RecyclerView $r26 = (RecyclerView) $r1314;
                                                                                                        if ($r26 != null) {
                                                                                                            $i0 = C0001R.C0003id.resolutionSectionHeader;
                                                                                                            View $r1315 = view.findViewById(C0001R.C0003id.resolutionSectionHeader);
                                                                                                            TextView $r27 = (TextView) $r1315;
                                                                                                            if ($r27 != null) {
                                                                                                                $i0 = C0001R.C0003id.resolutionStatusTextView;
                                                                                                                View $r1316 = view.findViewById(C0001R.C0003id.resolutionStatusTextView);
                                                                                                                TextView $r28 = (TextView) $r1316;
                                                                                                                if ($r28 != null) {
                                                                                                                    $i0 = C0001R.C0003id.resolvedCircleView;
                                                                                                                    View $r1317 = view.findViewById(C0001R.C0003id.resolvedCircleView);
                                                                                                                    TextView $r29 = (TextView) $r1317;
                                                                                                                    if ($r29 != null) {
                                                                                                                        $i0 = C0001R.C0003id.resolvedView;
                                                                                                                        View $r1318 = view.findViewById(C0001R.C0003id.resolvedView);
                                                                                                                        TextView $r30 = (TextView) $r1318;
                                                                                                                        if ($r30 != null) {
                                                                                                                            $i0 = C0001R.C0003id.rootLayout;
                                                                                                                            View $r1319 = view.findViewById(C0001R.C0003id.rootLayout);
                                                                                                                            ConstraintLayout $r31 = (ConstraintLayout) $r1319;
                                                                                                                            if ($r31 != null) {
                                                                                                                                $i0 = C0001R.C0003id.secondDivider;
                                                                                                                                View $r1320 = view.findViewById(C0001R.C0003id.secondDivider);
                                                                                                                                if ($r1320 != null) {
                                                                                                                                    $i0 = C0001R.C0003id.secondDivider2;
                                                                                                                                    View $r32 = view.findViewById(C0001R.C0003id.secondDivider2);
                                                                                                                                    if ($r32 != null) {
                                                                                                                                        $i0 = C0001R.C0003id.serviceFeeLayout;
                                                                                                                                        View $r33 = view.findViewById(C0001R.C0003id.serviceFeeLayout);
                                                                                                                                        LinearLayout $r34 = (LinearLayout) $r33;
                                                                                                                                        if ($r34 != null) {
                                                                                                                                            $i0 = C0001R.C0003id.serviceFeeTextView;
                                                                                                                                            View $r332 = view.findViewById(C0001R.C0003id.serviceFeeTextView);
                                                                                                                                            TextView $r35 = (TextView) $r332;
                                                                                                                                            if ($r35 != null) {
                                                                                                                                                $i0 = C0001R.C0003id.statusDividerOne;
                                                                                                                                                View $r333 = view.findViewById(C0001R.C0003id.statusDividerOne);
                                                                                                                                                if ($r333 != null) {
                                                                                                                                                    $i0 = C0001R.C0003id.statusDividerTwo;
                                                                                                                                                    View $r36 = view.findViewById(C0001R.C0003id.statusDividerTwo);
                                                                                                                                                    if ($r36 != null) {
                                                                                                                                                        $i0 = C0001R.C0003id.thirdDivider;
                                                                                                                                                        View $r37 = view.findViewById(C0001R.C0003id.thirdDivider);
                                                                                                                                                        if ($r37 != null) {
                                                                                                                                                            ScrollView $r39 = (ScrollView) view;
                                                                                                                                                            FragmentDisputeBinding $r38 = new FragmentDisputeBinding($r39, linearLayout, textView, textView2, linearLayout2, textView3, textView4, $r8, $r9, $r10, $r11, $r122, $r112, $r142, $r152, $r162, $r172, $r182, $r192, $r20, $r21, $r22, $r23, $r24, $r25, $r26, $r27, $r28, $r29, $r30, $r31, $r1320, $r32, $r34, $r35, $r333, $r36, $r37);
                                                                                                                                                            return $r38;
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
        Resources $r40 = view.getResources();
        String $r41 = $r40.getResourceName($i0);
        NullPointerException $r42 = new NullPointerException("Missing required view with ID: ".concat($r41));
        throw $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDisputeBinding inflate(LayoutInflater layoutInflater) {
        FragmentDisputeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDisputeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_dispute, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentDisputeBinding $r3 = bind($r2);
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
