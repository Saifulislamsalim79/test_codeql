package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentWithdrawalSummaryBinding implements InterfaceC8209a {
    public final KudiButton confirmPayment;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final ListView summaryListView;

    private FragmentWithdrawalSummaryBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, ProgressBar progressBar, ListView listView) {
        this.rootView = constraintLayout;
        this.confirmPayment = kudiButton;
        this.progressBar = progressBar;
        this.summaryListView = listView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWithdrawalSummaryBinding bind(View view) {
        int $i0 = C0001R.C0003id.confirmPayment;
        View $r1 = view.findViewById(C0001R.C0003id.confirmPayment);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.progressBar;
            View $r12 = view.findViewById(C0001R.C0003id.progressBar);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.summaryListView;
                View $r13 = view.findViewById(C0001R.C0003id.summaryListView);
                ListView $r4 = (ListView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentWithdrawalSummaryBinding $r5 = new FragmentWithdrawalSummaryBinding($r6, $r2, $r3, $r4);
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
    public static FragmentWithdrawalSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentWithdrawalSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWithdrawalSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_withdrawal_summary, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentWithdrawalSummaryBinding $r3 = bind($r2);
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
