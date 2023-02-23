package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentReferralCommissionsBinding implements InterfaceC8209a {
    public final TransactionsView referralCommissionsTransactionView;
    private final TransactionsView rootView;

    private FragmentReferralCommissionsBinding(TransactionsView transactionsView, TransactionsView transactionsView2) {
        this.rootView = transactionsView;
        this.referralCommissionsTransactionView = transactionsView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentReferralCommissionsBinding bind(View view) {
        if (view == null) {
            NullPointerException $r3 = new NullPointerException("rootView");
            throw $r3;
        }
        TransactionsView $r1 = (TransactionsView) view;
        FragmentReferralCommissionsBinding $r2 = new FragmentReferralCommissionsBinding($r1, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentReferralCommissionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentReferralCommissionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentReferralCommissionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_referral_commissions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentReferralCommissionsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public TransactionsView getRoot() {
        TransactionsView r1 = this.rootView;
        return r1;
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
}
