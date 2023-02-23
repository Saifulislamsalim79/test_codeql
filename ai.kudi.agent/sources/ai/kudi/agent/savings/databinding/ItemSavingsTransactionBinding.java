package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
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
public final class ItemSavingsTransactionBinding implements InterfaceC8209a {
    public final TextView amountText;
    public final TextView balanceText;
    public final View divider;
    private final ConstraintLayout rootView;
    public final TextView statusText;
    public final TextView timeText;
    public final AppCompatImageView transactionIcon;
    public final AppCompatImageView transactionIconBackground;
    public final FrameLayout transactionIconWrapper;
    public final TextView transactionTypeText;

    private ItemSavingsTransactionBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, TextView textView3, TextView textView4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, TextView textView5) {
        this.rootView = constraintLayout;
        this.amountText = textView;
        this.balanceText = textView2;
        this.divider = view;
        this.statusText = textView3;
        this.timeText = textView4;
        this.transactionIcon = appCompatImageView;
        this.transactionIconBackground = appCompatImageView2;
        this.transactionIconWrapper = frameLayout;
        this.transactionTypeText = textView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsTransactionBinding bind(View view) {
        View $r1;
        int $i0 = C0456R.C0458id.amount_text;
        View $r12 = view.findViewById($i0);
        TextView $r2 = (TextView) $r12;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.balance_text;
            View $r13 = view.findViewById($i0);
            TextView textView = (TextView) $r13;
            if (textView != null && ($r1 = view.findViewById(($i0 = C0456R.C0458id.divider))) != null) {
                $i0 = C0456R.C0458id.status_text;
                View $r4 = view.findViewById($i0);
                TextView textView2 = (TextView) $r4;
                if (textView2 != null) {
                    $i0 = C0456R.C0458id.time_text;
                    View $r42 = view.findViewById($i0);
                    TextView textView3 = (TextView) $r42;
                    if (textView3 != null) {
                        $i0 = C0456R.C0458id.transaction_icon;
                        View $r43 = view.findViewById($i0);
                        AppCompatImageView appCompatImageView = (AppCompatImageView) $r43;
                        if (appCompatImageView != null) {
                            $i0 = C0456R.C0458id.transaction_icon_background;
                            View $r44 = view.findViewById($i0);
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) $r44;
                            if (appCompatImageView2 != null) {
                                $i0 = C0456R.C0458id.transaction_icon_wrapper;
                                View $r45 = view.findViewById($i0);
                                FrameLayout $r9 = (FrameLayout) $r45;
                                if ($r9 != null) {
                                    $i0 = C0456R.C0458id.transaction_type_text;
                                    View $r46 = view.findViewById($i0);
                                    TextView $r10 = (TextView) $r46;
                                    if ($r10 != null) {
                                        ConstraintLayout $r122 = (ConstraintLayout) view;
                                        ItemSavingsTransactionBinding $r11 = new ItemSavingsTransactionBinding($r122, $r2, textView, $r1, textView2, textView3, appCompatImageView, appCompatImageView2, $r9, $r10);
                                        return $r11;
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
    public static ItemSavingsTransactionBinding inflate(LayoutInflater layoutInflater) {
        ItemSavingsTransactionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemSavingsTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.item_savings_transaction;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemSavingsTransactionBinding $r3 = bind($r2);
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
