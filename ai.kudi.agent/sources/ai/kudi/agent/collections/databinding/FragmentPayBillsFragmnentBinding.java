package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPayBillsFragmnentBinding implements InterfaceC8209a {
    public final RecyclerView billersRecyclerView;
    public final ProgressBar merchantProgressBar;
    public final CollectionsEmptyHistoryBinding merchantsListEmptyState;
    public final AppCompatTextView needHelpButton;
    private final ConstraintLayout rootView;

    private FragmentPayBillsFragmnentBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ProgressBar progressBar, CollectionsEmptyHistoryBinding collectionsEmptyHistoryBinding, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.billersRecyclerView = recyclerView;
        this.merchantProgressBar = progressBar;
        this.merchantsListEmptyState = collectionsEmptyHistoryBinding;
        this.needHelpButton = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPayBillsFragmnentBinding bind(View view) {
        View $r1;
        int $i0 = R$id.billersRecyclerView;
        View $r12 = view.findViewById($i0);
        RecyclerView $r2 = (RecyclerView) $r12;
        if ($r2 != null) {
            $i0 = R$id.merchantProgressBar;
            View $r13 = view.findViewById($i0);
            ProgressBar $r3 = (ProgressBar) $r13;
            if ($r3 != null && ($r1 = view.findViewById(($i0 = R$id.merchantsListEmptyState))) != null) {
                CollectionsEmptyHistoryBinding $r4 = CollectionsEmptyHistoryBinding.bind($r1);
                $i0 = R$id.needHelpButton;
                View $r14 = view.findViewById($i0);
                AppCompatTextView $r5 = (AppCompatTextView) $r14;
                if ($r5 != null) {
                    FragmentPayBillsFragmnentBinding $r6 = new FragmentPayBillsFragmnentBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
                    return $r6;
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPayBillsFragmnentBinding inflate(LayoutInflater layoutInflater) {
        FragmentPayBillsFragmnentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPayBillsFragmnentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_pay_bills_fragmnent;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPayBillsFragmnentBinding $r3 = bind($r2);
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
