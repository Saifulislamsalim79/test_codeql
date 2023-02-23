package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSavingsPlanBinding implements InterfaceC8209a {
    public final Button btnViewSavingsTransaction;
    public final AppCompatTextView filterView;
    public final KudiButton kbCreateSaving;
    private final ConstraintLayout rootView;
    public final RecyclerView rvSavingsPlan;
    public final TextView tvTotalSavedHeader;
    public final TextView tvTotalSavingBalance;

    private FragmentSavingsPlanBinding(ConstraintLayout constraintLayout, Button button, AppCompatTextView appCompatTextView, KudiButton kudiButton, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnViewSavingsTransaction = button;
        this.filterView = appCompatTextView;
        this.kbCreateSaving = kudiButton;
        this.rvSavingsPlan = recyclerView;
        this.tvTotalSavedHeader = textView;
        this.tvTotalSavingBalance = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsPlanBinding bind(View view) {
        int $i0 = C0456R.C0458id.btnViewSavingsTransaction;
        View $r1 = view.findViewById($i0);
        Button $r2 = (Button) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.filter_view;
            View $r12 = view.findViewById($i0);
            AppCompatTextView $r3 = (AppCompatTextView) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.kbCreateSaving;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = C0456R.C0458id.rvSavingsPlan;
                    View $r14 = view.findViewById($i0);
                    RecyclerView recyclerView = (RecyclerView) $r14;
                    if (recyclerView != null) {
                        $i0 = C0456R.C0458id.tvTotalSavedHeader;
                        View $r15 = view.findViewById($i0);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0456R.C0458id.tvTotalSavingBalance;
                            View $r16 = view.findViewById($i0);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentSavingsPlanBinding $r8 = new FragmentSavingsPlanBinding($r9, $r2, $r3, $r4, recyclerView, textView, textView2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsPlanBinding inflate(LayoutInflater layoutInflater) {
        FragmentSavingsPlanBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsPlanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_savings_plan;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSavingsPlanBinding $r3 = bind($r2);
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
