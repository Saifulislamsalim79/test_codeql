package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransactionListBinding implements InterfaceC8209a {
    public final TextView dateTextView;
    public final EmptyHistoryBinding emptyTransactionView;
    public final TextView filterAction;
    public final LinearLayout layoutZero;
    public final ProgressBar loaderView;
    public final ProgressBar nextProgressBar;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;

    private FragmentTransactionListBinding(ConstraintLayout constraintLayout, TextView textView, EmptyHistoryBinding emptyHistoryBinding, TextView textView2, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.dateTextView = textView;
        this.emptyTransactionView = emptyHistoryBinding;
        this.filterAction = textView2;
        this.layoutZero = linearLayout;
        this.loaderView = progressBar;
        this.nextProgressBar = progressBar2;
        this.recyclerView = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionListBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.dateTextView;
        TextView $r2 = (TextView) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.emptyTransactionView))) != null) {
            EmptyHistoryBinding $r3 = EmptyHistoryBinding.bind($r1);
            $i0 = C0214R.C0216id.filterAction;
            TextView $r4 = (TextView) view.findViewById($i0);
            if ($r4 != null) {
                $i0 = C0214R.C0216id.layoutZero;
                LinearLayout linearLayout = (LinearLayout) view.findViewById($i0);
                if (linearLayout != null) {
                    $i0 = C0214R.C0216id.loaderView;
                    ProgressBar progressBar = (ProgressBar) view.findViewById($i0);
                    if (progressBar != null) {
                        $i0 = C0214R.C0216id.nextProgressBar;
                        ProgressBar progressBar2 = (ProgressBar) view.findViewById($i0);
                        if (progressBar2 != null) {
                            $i0 = C0214R.C0216id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) view.findViewById($i0);
                            if (recyclerView != null) {
                                ConstraintLayout $r10 = (ConstraintLayout) view;
                                FragmentTransactionListBinding $r9 = new FragmentTransactionListBinding($r10, $r2, $r3, $r4, linearLayout, progressBar, progressBar2, recyclerView);
                                return $r9;
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r12 = $r11.getResourceName($i0);
        NullPointerException $r13 = new NullPointerException("Missing required view with ID: ".concat($r12));
        throw $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionListBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransactionListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_transaction_list;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransactionListBinding $r3 = bind($r2);
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
