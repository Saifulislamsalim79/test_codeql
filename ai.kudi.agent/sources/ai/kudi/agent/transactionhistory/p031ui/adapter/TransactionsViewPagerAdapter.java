package ai.kudi.agent.transactionhistory.p031ui.adapter;

import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionsViewPagerAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentManager;", "lifeCycle", "Landroidx/lifecycle/Lifecycle;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "titles", "", "", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;[Ljava/lang/String;)V", "[Ljava/lang/String;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionsViewPagerAdapter */
/* loaded from: classes.dex */
public final class TransactionsViewPagerAdapter extends FragmentStateAdapter {
    private final String[] titles;
    private final TransactionHistoryScope transactionHistoryScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsViewPagerAdapter(FragmentManager fragmentManager, AbstractC1565i abstractC1565i, TransactionHistoryScope transactionHistoryScope, String[] strArr) {
        super(fragmentManager, abstractC1565i);
        Log_OC.getArray(fragmentManager, "fragmentActivity");
        Log_OC.getArray(abstractC1565i, "lifeCycle");
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        Log_OC.getArray(strArr, "titles");
        this.transactionHistoryScope = transactionHistoryScope;
        this.titles = strArr;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i) {
        if (i == 0) {
            TransactionsFragment.Companion $r5 = TransactionsFragment.Companion;
            TransactionHistoryScope $r3 = this.transactionHistoryScope;
            TransactionsFragment $r1 = $r5.newInstance($r3);
            return $r1;
        } else if (i != 1) {
            TransactionsFragment $r12 = new TransactionsFragment();
            return $r12;
        } else {
            IncompleteTransactionsFragment.Companion $r2 = IncompleteTransactionsFragment.Companion;
            TransactionHistoryScope $r32 = this.transactionHistoryScope;
            IncompleteTransactionsFragment $r4 = $r2.newInstance($r32);
            return $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        String[] $r1 = this.titles;
        int $i0 = $r1.length;
        return $i0;
    }
}
