package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentFilterTransactionsBinding implements InterfaceC8209a {
    public final ConstraintLayout appBar;
    public final AppCompatImageButton closeButton;
    public final AppCompatTextView filterDate;
    public final AppCompatTextView filterType;
    public final LinearLayout filterView;
    private final ConstraintLayout rootView;
    public final AppCompatTextView titleView;
    public final TransactionsView transactionsView;

    private FragmentFilterTransactionsBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageButton appCompatImageButton, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView3, TransactionsView transactionsView) {
        this.rootView = constraintLayout;
        this.appBar = constraintLayout2;
        this.closeButton = appCompatImageButton;
        this.filterDate = appCompatTextView;
        this.filterType = appCompatTextView2;
        this.filterView = linearLayout;
        this.titleView = appCompatTextView3;
        this.transactionsView = transactionsView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterTransactionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.close_button;
            View $r12 = view.findViewById(C0001R.C0003id.close_button);
            AppCompatImageButton $r3 = (AppCompatImageButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.filter_date;
                View $r13 = view.findViewById(C0001R.C0003id.filter_date);
                AppCompatTextView appCompatTextView = (AppCompatTextView) $r13;
                if (appCompatTextView != null) {
                    $i0 = C0001R.C0003id.filter_type;
                    View $r14 = view.findViewById(C0001R.C0003id.filter_type);
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) $r14;
                    if (appCompatTextView2 != null) {
                        $i0 = C0001R.C0003id.filter_view;
                        View $r15 = view.findViewById(C0001R.C0003id.filter_view);
                        LinearLayout linearLayout = (LinearLayout) $r15;
                        if (linearLayout != null) {
                            $i0 = C0001R.C0003id.title_view;
                            View $r16 = view.findViewById(C0001R.C0003id.title_view);
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) $r16;
                            if (appCompatTextView3 != null) {
                                $i0 = C0001R.C0003id.transactions_view;
                                View $r17 = view.findViewById(C0001R.C0003id.transactions_view);
                                TransactionsView $r8 = (TransactionsView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    FragmentFilterTransactionsBinding $r9 = new FragmentFilterTransactionsBinding($r10, $r2, $r3, appCompatTextView, appCompatTextView2, linearLayout, appCompatTextView3, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterTransactionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentFilterTransactionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterTransactionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_filter_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentFilterTransactionsBinding $r3 = bind($r2);
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
