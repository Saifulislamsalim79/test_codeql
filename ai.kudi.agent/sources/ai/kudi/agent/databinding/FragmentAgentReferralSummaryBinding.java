package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAgentReferralSummaryBinding implements InterfaceC8209a {
    public final TextView accountStatusLabel;
    public final TextView accountStatusValue;
    public final ConstraintLayout container;
    public final TextView dateJoinedLabel;
    public final TextView dateJoinedValue;
    public final View divider1;
    public final View divider2;
    public final View divider3;
    public final View divider4;
    public final TextView firstNameLabel;
    public final TextView firstNameValue;
    public final TextView lastNameLabel;
    public final TextView lastNameValue;
    public final WalletLoaderViewBinding loaderView;
    private final ConstraintLayout rootView;
    public final TextView totalCommissionLabel;
    public final TextView totalCommissionValue;

    private FragmentAgentReferralSummaryBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, View view, View view2, View view3, View view4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, WalletLoaderViewBinding walletLoaderViewBinding, TextView textView9, TextView textView10) {
        this.rootView = constraintLayout;
        this.accountStatusLabel = textView;
        this.accountStatusValue = textView2;
        this.container = constraintLayout2;
        this.dateJoinedLabel = textView3;
        this.dateJoinedValue = textView4;
        this.divider1 = view;
        this.divider2 = view2;
        this.divider3 = view3;
        this.divider4 = view4;
        this.firstNameLabel = textView5;
        this.firstNameValue = textView6;
        this.lastNameLabel = textView7;
        this.lastNameValue = textView8;
        this.loaderView = walletLoaderViewBinding;
        this.totalCommissionLabel = textView9;
        this.totalCommissionValue = textView10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferralSummaryBinding bind(View view) {
        int $i0 = C0001R.C0003id.account_status_label;
        View $r1 = view.findViewById(C0001R.C0003id.account_status_label);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.account_status_value;
            View $r12 = view.findViewById(C0001R.C0003id.account_status_value);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.container;
                View $r13 = view.findViewById(C0001R.C0003id.container);
                ConstraintLayout constraintLayout = (ConstraintLayout) $r13;
                if (constraintLayout != null) {
                    $i0 = C0001R.C0003id.date_joined_label;
                    View $r14 = view.findViewById(C0001R.C0003id.date_joined_label);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.date_joined_value;
                        View $r15 = view.findViewById(C0001R.C0003id.date_joined_value);
                        TextView textView4 = (TextView) $r15;
                        if (textView4 != null) {
                            $i0 = C0001R.C0003id.divider1;
                            View $r16 = view.findViewById(C0001R.C0003id.divider1);
                            if ($r16 != null) {
                                $i0 = C0001R.C0003id.divider2;
                                View $r7 = view.findViewById(C0001R.C0003id.divider2);
                                if ($r7 != null) {
                                    $i0 = C0001R.C0003id.divider3;
                                    View $r8 = view.findViewById(C0001R.C0003id.divider3);
                                    if ($r8 != null) {
                                        $i0 = C0001R.C0003id.divider4;
                                        View $r9 = view.findViewById(C0001R.C0003id.divider4);
                                        if ($r9 != null) {
                                            $i0 = C0001R.C0003id.first_name_label;
                                            View $r10 = view.findViewById(C0001R.C0003id.first_name_label);
                                            TextView $r11 = (TextView) $r10;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.first_name_value;
                                                View $r102 = view.findViewById(C0001R.C0003id.first_name_value);
                                                TextView $r122 = (TextView) $r102;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.last_name_label;
                                                    View $r103 = view.findViewById(C0001R.C0003id.last_name_label);
                                                    TextView $r132 = (TextView) $r103;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.last_name_value;
                                                        View $r104 = view.findViewById(C0001R.C0003id.last_name_value);
                                                        TextView $r142 = (TextView) $r104;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.loader_view;
                                                            View $r105 = view.findViewById(C0001R.C0003id.loader_view);
                                                            if ($r105 != null) {
                                                                WalletLoaderViewBinding $r152 = WalletLoaderViewBinding.bind($r105);
                                                                $i0 = C0001R.C0003id.total_commission_label;
                                                                View $r106 = view.findViewById(C0001R.C0003id.total_commission_label);
                                                                TextView $r162 = (TextView) $r106;
                                                                if ($r162 != null) {
                                                                    $i0 = C0001R.C0003id.total_commission_value;
                                                                    View $r107 = view.findViewById(C0001R.C0003id.total_commission_value);
                                                                    TextView $r17 = (TextView) $r107;
                                                                    if ($r17 != null) {
                                                                        ConstraintLayout $r19 = (ConstraintLayout) view;
                                                                        FragmentAgentReferralSummaryBinding $r18 = new FragmentAgentReferralSummaryBinding($r19, textView, textView2, constraintLayout, textView3, textView4, $r16, $r7, $r8, $r9, $r11, $r122, $r132, $r142, $r152, $r162, $r17);
                                                                        return $r18;
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
        Resources $r20 = view.getResources();
        String $r21 = $r20.getResourceName($i0);
        NullPointerException $r22 = new NullPointerException("Missing required view with ID: ".concat($r21));
        throw $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferralSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentAgentReferralSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferralSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_agent_referral_summary, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAgentReferralSummaryBinding $r3 = bind($r2);
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
