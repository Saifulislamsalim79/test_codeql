package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class BottomSheetTransactionsOptionMenuBinding implements InterfaceC8209a {
    public final AppCompatTextView emailReportView;
    public final View emailReportViewDivider;
    public final AppCompatTextView manageOutletView;
    public final View manageOutletViewDivider;
    public final CardView notch;
    public final AppCompatTextView pendingTransactionView;
    public final View pendingTransactionViewDivider;
    public final AppCompatTextView requestAccountStatementView;
    private final LinearLayout rootView;
    public final AppCompatTextView walletCashoutView;
    public final View walletCashoutViewDivider;

    private BottomSheetTransactionsOptionMenuBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView, View view, AppCompatTextView appCompatTextView2, View view2, CardView cardView, AppCompatTextView appCompatTextView3, View view3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, View view4) {
        this.rootView = linearLayout;
        this.emailReportView = appCompatTextView;
        this.emailReportViewDivider = view;
        this.manageOutletView = appCompatTextView2;
        this.manageOutletViewDivider = view2;
        this.notch = cardView;
        this.pendingTransactionView = appCompatTextView3;
        this.pendingTransactionViewDivider = view3;
        this.requestAccountStatementView = appCompatTextView4;
        this.walletCashoutView = appCompatTextView5;
        this.walletCashoutViewDivider = view4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetTransactionsOptionMenuBinding bind(View view) {
        int $i0 = C0001R.C0003id.email_report_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C0001R.C0003id.email_report_view);
        if (appCompatTextView != null) {
            $i0 = C0001R.C0003id.email_report_view_divider;
            View $r1 = view.findViewById(C0001R.C0003id.email_report_view_divider);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.manage_outlet_view;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(C0001R.C0003id.manage_outlet_view);
                if (appCompatTextView2 != null) {
                    $i0 = C0001R.C0003id.manage_outlet_view_divider;
                    View $r3 = view.findViewById(C0001R.C0003id.manage_outlet_view_divider);
                    if ($r3 != null) {
                        $i0 = C0001R.C0003id.notch;
                        View $r5 = view.findViewById(C0001R.C0003id.notch);
                        CardView cardView = (CardView) $r5;
                        if (cardView != null) {
                            $i0 = C0001R.C0003id.pending_transaction_view;
                            View $r52 = view.findViewById(C0001R.C0003id.pending_transaction_view);
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) $r52;
                            if (appCompatTextView3 != null) {
                                $i0 = C0001R.C0003id.pending_transaction_view_divider;
                                View $r53 = view.findViewById(C0001R.C0003id.pending_transaction_view_divider);
                                if ($r53 != null) {
                                    $i0 = C0001R.C0003id.request_account_statement_view;
                                    View $r8 = view.findViewById(C0001R.C0003id.request_account_statement_view);
                                    AppCompatTextView $r9 = (AppCompatTextView) $r8;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.wallet_cashout_view;
                                        View $r82 = view.findViewById(C0001R.C0003id.wallet_cashout_view);
                                        AppCompatTextView $r10 = (AppCompatTextView) $r82;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.wallet_cashout_view_divider;
                                            View $r83 = view.findViewById(C0001R.C0003id.wallet_cashout_view_divider);
                                            if ($r83 != null) {
                                                LinearLayout $r12 = (LinearLayout) view;
                                                BottomSheetTransactionsOptionMenuBinding $r11 = new BottomSheetTransactionsOptionMenuBinding($r12, appCompatTextView, $r1, appCompatTextView2, $r3, cardView, appCompatTextView3, $r53, $r9, $r10, $r83);
                                                return $r11;
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
        Resources $r13 = view.getResources();
        String $r14 = $r13.getResourceName($i0);
        NullPointerException $r15 = new NullPointerException("Missing required view with ID: ".concat($r14));
        throw $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetTransactionsOptionMenuBinding inflate(LayoutInflater layoutInflater) {
        BottomSheetTransactionsOptionMenuBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetTransactionsOptionMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.bottom_sheet_transactions_option_menu, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        BottomSheetTransactionsOptionMenuBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
