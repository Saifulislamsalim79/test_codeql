package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ListItemTransactionHistoryBinding implements InterfaceC8209a {
    public final KudiTextView amountText;
    public final KudiTextView balanceText;
    public final View divider;
    private final ConstraintLayout rootView;
    public final TextView statusText;
    public final KudiTextView timeText;
    public final AppCompatImageView transactionIcon;
    public final AppCompatImageView transactionIconBackground;
    public final FrameLayout transactionIconWrapper;
    public final KudiTextView transactionTypeText;

    private ListItemTransactionHistoryBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, View view, TextView textView, KudiTextView kudiTextView3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, KudiTextView kudiTextView4) {
        this.rootView = constraintLayout;
        this.amountText = kudiTextView;
        this.balanceText = kudiTextView2;
        this.divider = view;
        this.statusText = textView;
        this.timeText = kudiTextView3;
        this.transactionIcon = appCompatImageView;
        this.transactionIconBackground = appCompatImageView2;
        this.transactionIconWrapper = frameLayout;
        this.transactionTypeText = kudiTextView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemTransactionHistoryBinding bind(View view) {
        int $i0 = C0001R.C0003id.amount_text;
        View $r1 = view.findViewById(C0001R.C0003id.amount_text);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.balance_text;
            View $r12 = view.findViewById(C0001R.C0003id.balance_text);
            KudiTextView kudiTextView = (KudiTextView) $r12;
            if (kudiTextView != null) {
                $i0 = C0001R.C0003id.divider;
                View $r13 = view.findViewById(C0001R.C0003id.divider);
                if ($r13 != null) {
                    $i0 = C0001R.C0003id.status_text;
                    View $r4 = view.findViewById(C0001R.C0003id.status_text);
                    TextView textView = (TextView) $r4;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.time_text;
                        View $r42 = view.findViewById(C0001R.C0003id.time_text);
                        KudiTextView kudiTextView2 = (KudiTextView) $r42;
                        if (kudiTextView2 != null) {
                            $i0 = C0001R.C0003id.transaction_icon;
                            View $r43 = view.findViewById(C0001R.C0003id.transaction_icon);
                            AppCompatImageView appCompatImageView = (AppCompatImageView) $r43;
                            if (appCompatImageView != null) {
                                $i0 = C0001R.C0003id.transaction_icon_background;
                                View $r44 = view.findViewById(C0001R.C0003id.transaction_icon_background);
                                AppCompatImageView $r8 = (AppCompatImageView) $r44;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.transaction_icon_wrapper;
                                    View $r45 = view.findViewById(C0001R.C0003id.transaction_icon_wrapper);
                                    FrameLayout $r9 = (FrameLayout) $r45;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.transaction_type_text;
                                        View $r46 = view.findViewById(C0001R.C0003id.transaction_type_text);
                                        KudiTextView $r10 = (KudiTextView) $r46;
                                        if ($r10 != null) {
                                            ConstraintLayout $r122 = (ConstraintLayout) view;
                                            ListItemTransactionHistoryBinding $r11 = new ListItemTransactionHistoryBinding($r122, $r2, kudiTextView, $r13, textView, kudiTextView2, appCompatImageView, $r8, $r9, $r10);
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
        Resources $r132 = view.getResources();
        String $r14 = $r132.getResourceName($i0);
        NullPointerException $r15 = new NullPointerException("Missing required view with ID: ".concat($r14));
        throw $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemTransactionHistoryBinding inflate(LayoutInflater layoutInflater) {
        ListItemTransactionHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemTransactionHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.list_item_transaction_history, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ListItemTransactionHistoryBinding $r3 = bind($r2);
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
