package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentUssdWithdrawalVoucherSummaryBinding implements InterfaceC8209a {
    public final KudiButton btnWithdrawal;
    private final NestedScrollView rootView;
    public final RecyclerView rvVoucher;

    private FragmentUssdWithdrawalVoucherSummaryBinding(NestedScrollView nestedScrollView, KudiButton kudiButton, RecyclerView recyclerView) {
        this.rootView = nestedScrollView;
        this.btnWithdrawal = kudiButton;
        this.rvVoucher = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUssdWithdrawalVoucherSummaryBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_withdrawal;
        View $r1 = view.findViewById(C0001R.C0003id.btn_withdrawal);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.rv_voucher;
            View $r12 = view.findViewById(C0001R.C0003id.rv_voucher);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                NestedScrollView $r5 = (NestedScrollView) view;
                FragmentUssdWithdrawalVoucherSummaryBinding $r4 = new FragmentUssdWithdrawalVoucherSummaryBinding($r5, $r2, $r3);
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
    public static FragmentUssdWithdrawalVoucherSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentUssdWithdrawalVoucherSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUssdWithdrawalVoucherSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_ussd_withdrawal_voucher_summary, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentUssdWithdrawalVoucherSummaryBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
