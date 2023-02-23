package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiBadgeButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBankAccountBinding implements InterfaceC8209a {
    public final TextView cashoutAcctContainerTitle;
    public final RecyclerView cashoutAcctNumberList;
    public final ProgressBar cashoutAcctNumbersLoader;
    public final TextView cashoutAddBankAcctView;
    public final KudiBadgeButton cashoutCardRetryButton;
    public final TextView cashoutEmptyDescView;
    public final TextView fundingAcctContainerTitle;
    public final RecyclerView fundingAcctNumberList;
    public final ProgressBar fundingAcctNumbersLoader;
    public final TextView fundingAddBankAcctView;
    public final KudiBadgeButton fundingCardRetryButton;
    public final TextView fundingEmptyDescView;
    private final NestedScrollView rootView;
    public final TextView tvDesc;
    public final View viewDivider1;
    public final View viewDivider2;
    public final View viewDivider3;
    public final View viewDivider4;

    private FragmentBankAccountBinding(NestedScrollView nestedScrollView, TextView textView, RecyclerView recyclerView, ProgressBar progressBar, TextView textView2, KudiBadgeButton kudiBadgeButton, TextView textView3, TextView textView4, RecyclerView recyclerView2, ProgressBar progressBar2, TextView textView5, KudiBadgeButton kudiBadgeButton2, TextView textView6, TextView textView7, View view, View view2, View view3, View view4) {
        this.rootView = nestedScrollView;
        this.cashoutAcctContainerTitle = textView;
        this.cashoutAcctNumberList = recyclerView;
        this.cashoutAcctNumbersLoader = progressBar;
        this.cashoutAddBankAcctView = textView2;
        this.cashoutCardRetryButton = kudiBadgeButton;
        this.cashoutEmptyDescView = textView3;
        this.fundingAcctContainerTitle = textView4;
        this.fundingAcctNumberList = recyclerView2;
        this.fundingAcctNumbersLoader = progressBar2;
        this.fundingAddBankAcctView = textView5;
        this.fundingCardRetryButton = kudiBadgeButton2;
        this.fundingEmptyDescView = textView6;
        this.tvDesc = textView7;
        this.viewDivider1 = view;
        this.viewDivider2 = view2;
        this.viewDivider3 = view3;
        this.viewDivider4 = view4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBankAccountBinding bind(View view) {
        int $i0 = C0001R.C0003id.cashoutAcctContainerTitle;
        View $r1 = view.findViewById(C0001R.C0003id.cashoutAcctContainerTitle);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.cashoutAcctNumberList;
            View $r12 = view.findViewById(C0001R.C0003id.cashoutAcctNumberList);
            RecyclerView recyclerView = (RecyclerView) $r12;
            if (recyclerView != null) {
                $i0 = C0001R.C0003id.cashoutAcctNumbersLoader;
                View $r13 = view.findViewById(C0001R.C0003id.cashoutAcctNumbersLoader);
                ProgressBar progressBar = (ProgressBar) $r13;
                if (progressBar != null) {
                    $i0 = C0001R.C0003id.cashoutAddBankAcctView;
                    View $r14 = view.findViewById(C0001R.C0003id.cashoutAddBankAcctView);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.cashoutCardRetryButton;
                        View $r15 = view.findViewById(C0001R.C0003id.cashoutCardRetryButton);
                        KudiBadgeButton kudiBadgeButton = (KudiBadgeButton) $r15;
                        if (kudiBadgeButton != null) {
                            $i0 = C0001R.C0003id.cashoutEmptyDescView;
                            View $r16 = view.findViewById(C0001R.C0003id.cashoutEmptyDescView);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.fundingAcctContainerTitle;
                                View $r17 = view.findViewById(C0001R.C0003id.fundingAcctContainerTitle);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.fundingAcctNumberList;
                                    View $r18 = view.findViewById(C0001R.C0003id.fundingAcctNumberList);
                                    RecyclerView $r9 = (RecyclerView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.fundingAcctNumbersLoader;
                                        View $r19 = view.findViewById(C0001R.C0003id.fundingAcctNumbersLoader);
                                        ProgressBar $r10 = (ProgressBar) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.fundingAddBankAcctView;
                                            View $r110 = view.findViewById(C0001R.C0003id.fundingAddBankAcctView);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.fundingCardRetryButton;
                                                View $r111 = view.findViewById(C0001R.C0003id.fundingCardRetryButton);
                                                KudiBadgeButton $r122 = (KudiBadgeButton) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.fundingEmptyDescView;
                                                    View $r112 = view.findViewById(C0001R.C0003id.fundingEmptyDescView);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.tv_desc;
                                                        View $r113 = view.findViewById(C0001R.C0003id.tv_desc);
                                                        TextView $r142 = (TextView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.view_divider1;
                                                            View $r114 = view.findViewById(C0001R.C0003id.view_divider1);
                                                            if ($r114 != null) {
                                                                $i0 = C0001R.C0003id.view_divider_2;
                                                                View $r152 = view.findViewById(C0001R.C0003id.view_divider_2);
                                                                if ($r152 != null) {
                                                                    $i0 = C0001R.C0003id.view_divider3;
                                                                    View $r162 = view.findViewById(C0001R.C0003id.view_divider3);
                                                                    if ($r162 != null) {
                                                                        $i0 = C0001R.C0003id.view_divider_4;
                                                                        View $r172 = view.findViewById(C0001R.C0003id.view_divider_4);
                                                                        if ($r172 != null) {
                                                                            NestedScrollView $r192 = (NestedScrollView) view;
                                                                            FragmentBankAccountBinding $r182 = new FragmentBankAccountBinding($r192, textView, recyclerView, progressBar, textView2, kudiBadgeButton, textView3, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r114, $r152, $r162, $r172);
                                                                            return $r182;
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
        Resources $r20 = view.getResources();
        String $r21 = $r20.getResourceName($i0);
        NullPointerException $r22 = new NullPointerException("Missing required view with ID: ".concat($r21));
        throw $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBankAccountBinding inflate(LayoutInflater layoutInflater) {
        FragmentBankAccountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBankAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBankAccountBinding $r3 = bind($r2);
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
