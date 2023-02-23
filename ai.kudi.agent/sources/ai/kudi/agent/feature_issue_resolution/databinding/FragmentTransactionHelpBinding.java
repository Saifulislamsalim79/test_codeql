package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransactionHelpBinding implements InterfaceC8209a {
    public final EmptyHistoryBinding emptyHistoryView;
    public final RecyclerView issueTypeRecyclerview;
    public final ProgressBar loader;
    private final ConstraintLayout rootView;

    private FragmentTransactionHelpBinding(ConstraintLayout constraintLayout, EmptyHistoryBinding emptyHistoryBinding, RecyclerView recyclerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.emptyHistoryView = emptyHistoryBinding;
        this.issueTypeRecyclerview = recyclerView;
        this.loader = progressBar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionHelpBinding bind(View view) {
        int $i0 = C0214R.C0216id.emptyHistoryView;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            EmptyHistoryBinding $r2 = EmptyHistoryBinding.bind($r1);
            $i0 = C0214R.C0216id.issueTypeRecyclerview;
            RecyclerView $r3 = (RecyclerView) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = C0214R.C0216id.loader;
                ProgressBar $r4 = (ProgressBar) view.findViewById($i0);
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentTransactionHelpBinding $r5 = new FragmentTransactionHelpBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionHelpBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransactionHelpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_transaction_help;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransactionHelpBinding $r3 = bind($r2);
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
