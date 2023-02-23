package ai.kudi.agent.transactionhistory.presentation.viewstate;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IncompleteTransactionsViewState.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/viewstate/IncompleteTransactionsViewState;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoadingTransactions", "", "isLoadingMore", "showEmptyListView", "transactions", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "(ZZZLjava/util/List;)V", "()Z", "getShowEmptyListView", "getTransactions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IncompleteTransactionsViewState implements ViewData {
    private final boolean isLoadingMore;
    private final boolean isLoadingTransactions;
    private final boolean showEmptyListView;
    private final List<TransactionItemUiModel> transactions;

    public IncompleteTransactionsViewState() {
        this(false, false, false, null, 15, null);
    }

    public IncompleteTransactionsViewState(boolean z, boolean z2, boolean z3, List list) {
        Log_OC.getArray(list, "transactions");
        this.isLoadingTransactions = z;
        this.isLoadingMore = z2;
        this.showEmptyListView = z3;
        this.transactions = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IncompleteTransactionsViewState(boolean r2, boolean r3, boolean r4, java.util.List r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
        /*
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r6 & 2
            if (r0 == 0) goto La
            r3 = 0
        La:
            r0 = r6 & 4
            if (r0 == 0) goto Lf
            r4 = 0
        Lf:
            r6 = r6 & 8
            if (r6 == 0) goto L17
            java.util.List r5 = kotlin.p557z.C13722p.m3941e()
        L17:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState.<init>(boolean, boolean, boolean, java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ IncompleteTransactionsViewState copy$default(IncompleteTransactionsViewState incompleteTransactionsViewState, boolean $z0, boolean $z1, boolean $z2, List $r1, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = incompleteTransactionsViewState.isLoadingTransactions;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z1 = incompleteTransactionsViewState.isLoadingMore;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z2 = incompleteTransactionsViewState.showEmptyListView;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r1 = incompleteTransactionsViewState.transactions;
        }
        IncompleteTransactionsViewState $r0 = incompleteTransactionsViewState.copy($z0, $z1, $z2, $r1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isLoadingTransactions;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isLoadingMore;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.showEmptyListView;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component4() {
        List r1 = this.transactions;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IncompleteTransactionsViewState copy(boolean z, boolean z2, boolean z3, List list) {
        Log_OC.getArray(list, "transactions");
        IncompleteTransactionsViewState $r0 = new IncompleteTransactionsViewState(z, z2, z3, list);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof IncompleteTransactionsViewState;
        if ($z0) {
            IncompleteTransactionsViewState $r2 = (IncompleteTransactionsViewState) obj;
            boolean $z02 = this.isLoadingTransactions;
            boolean $z1 = $r2.isLoadingTransactions;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isLoadingMore;
            boolean $z12 = $r2.isLoadingMore;
            if ($z03 != $z12) {
                return false;
            }
            boolean $z04 = this.showEmptyListView;
            boolean $z13 = $r2.showEmptyListView;
            if ($z04 != $z13) {
                return false;
            }
            List $r3 = this.transactions;
            List $r4 = $r2.transactions;
            boolean $z05 = Log_OC.append($r3, $r4);
            return $z05;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowEmptyListView() {
        boolean z0 = this.showEmptyListView;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getTransactions() {
        List r1 = this.transactions;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isLoadingTransactions;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.isLoadingMore;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i03 = ($i02 + $i1) * 31;
        boolean $z03 = this.showEmptyListView;
        int $i12 = $z03 ? 1 : $z03 ? 1 : 0;
        int $i13 = ($i03 + $i12) * 31;
        List $r1 = this.transactions;
        int $i04 = $r1.hashCode();
        return $i13 + $i04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoadingMore() {
        boolean z0 = this.isLoadingMore;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoadingTransactions() {
        boolean z0 = this.isLoadingTransactions;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("IncompleteTransactionsViewState(isLoadingTransactions=");
        boolean $z0 = this.isLoadingTransactions;
        $r2.append($z0);
        $r2.append(", isLoadingMore=");
        boolean $z02 = this.isLoadingMore;
        $r2.append($z02);
        $r2.append(", showEmptyListView=");
        boolean $z03 = this.showEmptyListView;
        $r2.append($z03);
        $r2.append(", transactions=");
        List $r3 = this.transactions;
        $r2.append($r3);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
