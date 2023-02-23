package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactions.p032ui.widget.TransactionPdfReceiptView;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityTransactionDetailsBinding implements InterfaceC8209a {
    public final TextView amountText;
    public final FloatingActionButton btnAddCustomer;
    public final FloatingActionButton btnSupport;
    public final LinearLayout enterCustomersDetails;
    public final TextView errorTextView;
    public final LinearLayout llContainer1;
    public final LinearLayout llContainer2;
    public final LinearLayout llContainer3;
    public final TransactionPdfReceiptView pdfPrintView;
    public final LinearLayout printContainer;
    public final FrameLayout progressBar;
    public final TextView raiseChargeBackButton;
    public final ProgressBar raiseChargeBackProgressBar;
    public final SwipeRefreshLayout refreshView;
    public final ConstraintLayout rootLayout;
    private final SwipeRefreshLayout rootView;
    public final RecyclerView rvContainer1;
    public final RecyclerView rvContainer2;
    public final RecyclerView rvContainer3;
    public final ScrollView scrollView;
    public final KudiButton sendToTerminalButton;
    public final AppCompatImageView transactionIcon;
    public final AppCompatImageView transactionIconBackground;
    public final FrameLayout transactionIconWrapper;
    public final AppCompatTextView transactionStatusText;
    public final TextView transactionTypeText;
    public final FrameLayout viewIssueContainer;

    private ActivityTransactionDetailsBinding(SwipeRefreshLayout swipeRefreshLayout, TextView textView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TransactionPdfReceiptView transactionPdfReceiptView, LinearLayout linearLayout5, FrameLayout frameLayout, TextView textView3, ProgressBar progressBar, SwipeRefreshLayout swipeRefreshLayout2, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ScrollView scrollView, KudiButton kudiButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout2, AppCompatTextView appCompatTextView, TextView textView4, FrameLayout frameLayout3) {
        this.rootView = swipeRefreshLayout;
        this.amountText = textView;
        this.btnAddCustomer = floatingActionButton;
        this.btnSupport = floatingActionButton2;
        this.enterCustomersDetails = linearLayout;
        this.errorTextView = textView2;
        this.llContainer1 = linearLayout2;
        this.llContainer2 = linearLayout3;
        this.llContainer3 = linearLayout4;
        this.pdfPrintView = transactionPdfReceiptView;
        this.printContainer = linearLayout5;
        this.progressBar = frameLayout;
        this.raiseChargeBackButton = textView3;
        this.raiseChargeBackProgressBar = progressBar;
        this.refreshView = swipeRefreshLayout2;
        this.rootLayout = constraintLayout;
        this.rvContainer1 = recyclerView;
        this.rvContainer2 = recyclerView2;
        this.rvContainer3 = recyclerView3;
        this.scrollView = scrollView;
        this.sendToTerminalButton = kudiButton;
        this.transactionIcon = appCompatImageView;
        this.transactionIconBackground = appCompatImageView2;
        this.transactionIconWrapper = frameLayout2;
        this.transactionStatusText = appCompatTextView;
        this.transactionTypeText = textView4;
        this.viewIssueContainer = frameLayout3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionDetailsBinding bind(View view) {
        int $i0 = C0001R.C0003id.amount_text;
        View $r1 = view.findViewById(C0001R.C0003id.amount_text);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.btn_add_customer;
            View $r12 = view.findViewById(C0001R.C0003id.btn_add_customer);
            FloatingActionButton floatingActionButton = (FloatingActionButton) $r12;
            if (floatingActionButton != null) {
                $i0 = C0001R.C0003id.btn_support;
                View $r13 = view.findViewById(C0001R.C0003id.btn_support);
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) $r13;
                if (floatingActionButton2 != null) {
                    $i0 = C0001R.C0003id.enter_customers_details;
                    View $r14 = view.findViewById(C0001R.C0003id.enter_customers_details);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.errorTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.errorTextView);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.ll_container_1;
                            View $r16 = view.findViewById(C0001R.C0003id.ll_container_1);
                            LinearLayout linearLayout2 = (LinearLayout) $r16;
                            if (linearLayout2 != null) {
                                $i0 = C0001R.C0003id.ll_container_2;
                                View $r17 = view.findViewById(C0001R.C0003id.ll_container_2);
                                LinearLayout $r8 = (LinearLayout) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.ll_container_3;
                                    View $r18 = view.findViewById(C0001R.C0003id.ll_container_3);
                                    LinearLayout $r9 = (LinearLayout) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.pdf_print_view;
                                        View $r19 = view.findViewById(C0001R.C0003id.pdf_print_view);
                                        TransactionPdfReceiptView $r10 = (TransactionPdfReceiptView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.printContainer;
                                            View $r110 = view.findViewById(C0001R.C0003id.printContainer);
                                            LinearLayout $r11 = (LinearLayout) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.progressBar;
                                                View $r111 = view.findViewById(C0001R.C0003id.progressBar);
                                                FrameLayout $r122 = (FrameLayout) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.raiseChargeBackButton;
                                                    View $r112 = view.findViewById(C0001R.C0003id.raiseChargeBackButton);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.raiseChargeBackProgressBar;
                                                        View $r113 = view.findViewById(C0001R.C0003id.raiseChargeBackProgressBar);
                                                        ProgressBar $r142 = (ProgressBar) $r113;
                                                        if ($r142 != null) {
                                                            SwipeRefreshLayout $r152 = (SwipeRefreshLayout) view;
                                                            $i0 = C0001R.C0003id.rootLayout;
                                                            View $r114 = view.findViewById(C0001R.C0003id.rootLayout);
                                                            ConstraintLayout $r162 = (ConstraintLayout) $r114;
                                                            if ($r162 != null) {
                                                                $i0 = C0001R.C0003id.rv_container_1;
                                                                View $r115 = view.findViewById(C0001R.C0003id.rv_container_1);
                                                                RecyclerView $r172 = (RecyclerView) $r115;
                                                                if ($r172 != null) {
                                                                    $i0 = C0001R.C0003id.rv_container_2;
                                                                    View $r116 = view.findViewById(C0001R.C0003id.rv_container_2);
                                                                    RecyclerView $r182 = (RecyclerView) $r116;
                                                                    if ($r182 != null) {
                                                                        $i0 = C0001R.C0003id.rv_container_3;
                                                                        View $r117 = view.findViewById(C0001R.C0003id.rv_container_3);
                                                                        RecyclerView $r192 = (RecyclerView) $r117;
                                                                        if ($r192 != null) {
                                                                            $i0 = C0001R.C0003id.scroll_view;
                                                                            View $r118 = view.findViewById(C0001R.C0003id.scroll_view);
                                                                            ScrollView $r20 = (ScrollView) $r118;
                                                                            if ($r20 != null) {
                                                                                $i0 = C0001R.C0003id.send_to_terminal_button;
                                                                                View $r119 = view.findViewById(C0001R.C0003id.send_to_terminal_button);
                                                                                KudiButton $r21 = (KudiButton) $r119;
                                                                                if ($r21 != null) {
                                                                                    $i0 = C0001R.C0003id.transaction_icon;
                                                                                    View $r120 = view.findViewById(C0001R.C0003id.transaction_icon);
                                                                                    AppCompatImageView $r22 = (AppCompatImageView) $r120;
                                                                                    if ($r22 != null) {
                                                                                        $i0 = C0001R.C0003id.transaction_icon_background;
                                                                                        View $r121 = view.findViewById(C0001R.C0003id.transaction_icon_background);
                                                                                        AppCompatImageView $r23 = (AppCompatImageView) $r121;
                                                                                        if ($r23 != null) {
                                                                                            $i0 = C0001R.C0003id.transaction_icon_wrapper;
                                                                                            View $r123 = view.findViewById(C0001R.C0003id.transaction_icon_wrapper);
                                                                                            FrameLayout $r24 = (FrameLayout) $r123;
                                                                                            if ($r24 != null) {
                                                                                                $i0 = C0001R.C0003id.transaction_status_text;
                                                                                                View $r124 = view.findViewById(C0001R.C0003id.transaction_status_text);
                                                                                                AppCompatTextView $r25 = (AppCompatTextView) $r124;
                                                                                                if ($r25 != null) {
                                                                                                    $i0 = C0001R.C0003id.transaction_type_text;
                                                                                                    View $r125 = view.findViewById(C0001R.C0003id.transaction_type_text);
                                                                                                    TextView $r26 = (TextView) $r125;
                                                                                                    if ($r26 != null) {
                                                                                                        $i0 = C0001R.C0003id.view_issue_container;
                                                                                                        View $r126 = view.findViewById(C0001R.C0003id.view_issue_container);
                                                                                                        FrameLayout $r27 = (FrameLayout) $r126;
                                                                                                        if ($r27 != null) {
                                                                                                            ActivityTransactionDetailsBinding $r28 = new ActivityTransactionDetailsBinding($r152, textView, floatingActionButton, floatingActionButton2, linearLayout, textView2, linearLayout2, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r172, $r182, $r192, $r20, $r21, $r22, $r23, $r24, $r25, $r26, $r27);
                                                                                                            return $r28;
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
        Resources $r29 = view.getResources();
        String $r30 = $r29.getResourceName($i0);
        NullPointerException $r31 = new NullPointerException("Missing required view with ID: ".concat($r30));
        throw $r31;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionDetailsBinding inflate(LayoutInflater layoutInflater) {
        ActivityTransactionDetailsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_transaction_details, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityTransactionDetailsBinding $r3 = bind($r2);
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
    public SwipeRefreshLayout getRoot() {
        SwipeRefreshLayout r1 = this.rootView;
        return r1;
    }
}
