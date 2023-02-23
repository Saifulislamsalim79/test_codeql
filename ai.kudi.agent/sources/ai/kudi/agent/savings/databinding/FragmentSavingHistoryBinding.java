package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSavingHistoryBinding implements InterfaceC8209a {
    public final AppCompatTextView filterView;
    private final ConstraintLayout rootView;
    public final RecyclerView rvSavingsPlan;

    private FragmentSavingHistoryBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.filterView = appCompatTextView;
        this.rvSavingsPlan = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingHistoryBinding bind(View view) {
        int $i0 = C0456R.C0458id.filter_view;
        View $r1 = view.findViewById($i0);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.rvSavingsPlan;
            View $r12 = view.findViewById($i0);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                FragmentSavingHistoryBinding $r4 = new FragmentSavingHistoryBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingHistoryBinding inflate(LayoutInflater layoutInflater) {
        FragmentSavingHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_saving_history;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSavingHistoryBinding $r3 = bind($r2);
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
