package ai.kudi.agent.transactionhistory.presentation.viewstate;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TransactionsViewState.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\u007f\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tHÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\t\u0010.\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoadingSummary", "", "isLoadingTransactions", "isLoadingMore", "showEmptyListView", "hideSummary", "transactions", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "walletSummary", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "incompleteTransactionsCount", "", "warningText", "", "commissionWallets", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "(ZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/util/List;)V", "getCommissionWallets", "()Ljava/util/List;", "getHideSummary", "()Z", "getIncompleteTransactionsCount", "()I", "getShowEmptyListView", "getTransactions", "getWalletSummary", "getWarningText", "()Ljava/lang/String;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionsViewState implements ViewData {
    private final List<CommissionWallet> commissionWallets;
    private final boolean hideSummary;
    private final int incompleteTransactionsCount;
    private final boolean isLoadingMore;
    private final boolean isLoadingSummary;
    private final boolean isLoadingTransactions;
    private final boolean showEmptyListView;
    private final List<TransactionItemUiModel> transactions;
    private final List<TransactionSummaryItem> walletSummary;
    private final String warningText;

    public TransactionsViewState() {
        this(false, false, false, false, false, null, null, 0, null, null, 1023, null);
    }

    public TransactionsViewState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, List list2, int i, String str, List list3) {
        Log_OC.getArray(list, "transactions");
        Log_OC.getArray(list2, "walletSummary");
        Log_OC.getArray(str, "warningText");
        Log_OC.getArray(list3, "commissionWallets");
        this.isLoadingSummary = z;
        this.isLoadingTransactions = z2;
        this.isLoadingMore = z3;
        this.showEmptyListView = z4;
        this.hideSummary = z5;
        this.transactions = list;
        this.walletSummary = list2;
        this.incompleteTransactionsCount = i;
        this.warningText = str;
        this.commissionWallets = list3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TransactionsViewState(boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, java.util.List r19, java.util.List r20, int r21, java.lang.String r22, java.util.List r23, int r24, kotlin.p483e0.p485d.DBUtils$1 r25) {
        /*
            r13 = this;
            r11 = r24 & 1
            r12 = 0
            if (r11 == 0) goto L7
            r14 = 0
            goto L7
        L7:
            r11 = r24 & 2
            if (r11 == 0) goto Ld
            r15 = 0
            goto Ld
        Ld:
            r11 = r24 & 4
            if (r11 == 0) goto L14
            r16 = 0
            goto L14
        L14:
            r11 = r24 & 8
            if (r11 == 0) goto L1b
            r17 = 0
            goto L1b
        L1b:
            r11 = r24 & 16
            if (r11 == 0) goto L22
            r18 = 0
            goto L22
        L22:
            r11 = r24 & 32
            if (r11 == 0) goto L2b
            java.util.List r19 = kotlin.p557z.C13722p.m3941e()
            goto L2b
        L2b:
            r11 = r24 & 64
            if (r11 == 0) goto L34
            java.util.List r20 = kotlin.p557z.C13722p.m3941e()
            goto L34
        L34:
            r0 = r24
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L3b
            goto L3d
        L3b:
            r12 = r21
        L3d:
            r0 = r24
            r0 = r0 & 256(0x100, float:3.59E-43)
            r21 = r0
            if (r21 == 0) goto L48
            java.lang.String r22 = ""
            goto L48
        L48:
            r0 = r24
            r0 = r0 & 512(0x200, float:7.175E-43)
            r21 = r0
            if (r21 == 0) goto L55
            java.util.List r23 = kotlin.p557z.C13722p.m3941e()
            goto L55
        L55:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r12
            r9 = r22
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState.<init>(boolean, boolean, boolean, boolean, boolean, java.util.List, java.util.List, int, java.lang.String, java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ TransactionsViewState copy$default(TransactionsViewState transactionsViewState, boolean $z0, boolean $z1, boolean $z2, boolean $z3, boolean $z4, List $r2, List $r3, int $i1, String $r4, List $r5, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $z0 = transactionsViewState.isLoadingSummary;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $z1 = transactionsViewState.isLoadingTransactions;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $z2 = transactionsViewState.isLoadingMore;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $z3 = transactionsViewState.showEmptyListView;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $z4 = transactionsViewState.hideSummary;
        }
        int $i26 = i & 32;
        if ($i26 != 0) {
            $r2 = transactionsViewState.transactions;
        }
        int $i27 = i & 64;
        if ($i27 != 0) {
            $r3 = transactionsViewState.walletSummary;
        }
        int $i28 = i & 128;
        if ($i28 != 0) {
            $i1 = transactionsViewState.incompleteTransactionsCount;
        }
        int $i29 = i & 256;
        if ($i29 != 0) {
            $r4 = transactionsViewState.warningText;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i0 != 0) {
            $r5 = transactionsViewState.commissionWallets;
        }
        TransactionsViewState $r0 = transactionsViewState.copy($z0, $z1, $z2, $z3, $z4, $r2, $r3, $i1, $r4, $r5);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isLoadingSummary;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component10() {
        List r1 = this.commissionWallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isLoadingTransactions;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isLoadingMore;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component4() {
        boolean z0 = this.showEmptyListView;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.hideSummary;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component6() {
        List r1 = this.transactions;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component7() {
        List r1 = this.walletSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component8() {
        int i0 = this.incompleteTransactionsCount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.warningText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionsViewState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, List list2, int i, String str, List list3) {
        Log_OC.getArray(list, "transactions");
        Log_OC.getArray(list2, "walletSummary");
        Log_OC.getArray(str, "warningText");
        Log_OC.getArray(list3, "commissionWallets");
        TransactionsViewState $r0 = new TransactionsViewState(z, z2, z3, z4, z5, list, list2, i, str, list3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof TransactionsViewState;
        if ($z0) {
            TransactionsViewState $r2 = (TransactionsViewState) obj;
            boolean $z02 = this.isLoadingSummary;
            boolean $z1 = $r2.isLoadingSummary;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isLoadingTransactions;
            boolean $z12 = $r2.isLoadingTransactions;
            if ($z03 != $z12) {
                return false;
            }
            boolean $z04 = this.isLoadingMore;
            boolean $z13 = $r2.isLoadingMore;
            if ($z04 != $z13) {
                return false;
            }
            boolean $z05 = this.showEmptyListView;
            boolean $z14 = $r2.showEmptyListView;
            if ($z05 != $z14) {
                return false;
            }
            boolean $z06 = this.hideSummary;
            boolean $z15 = $r2.hideSummary;
            if ($z06 != $z15) {
                return false;
            }
            List $r3 = this.transactions;
            List $r4 = $r2.transactions;
            boolean $z07 = Log_OC.append($r3, $r4);
            if ($z07) {
                List $r32 = this.walletSummary;
                List $r42 = $r2.walletSummary;
                boolean $z08 = Log_OC.append($r32, $r42);
                if ($z08) {
                    int $i0 = this.incompleteTransactionsCount;
                    int $i1 = $r2.incompleteTransactionsCount;
                    if ($i0 != $i1) {
                        return false;
                    }
                    String $r5 = this.warningText;
                    String $r6 = $r2.warningText;
                    boolean $z09 = Log_OC.append($r5, $r6);
                    if ($z09) {
                        List $r33 = this.commissionWallets;
                        List $r43 = $r2.commissionWallets;
                        boolean $z010 = Log_OC.append($r33, $r43);
                        return $z010;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getCommissionWallets() {
        List r1 = this.commissionWallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getHideSummary() {
        boolean z0 = this.hideSummary;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getIncompleteTransactionsCount() {
        int i0 = this.incompleteTransactionsCount;
        return i0;
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
    public final List getWalletSummary() {
        List r1 = this.walletSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getWarningText() {
        String r1 = this.warningText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isLoadingSummary;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.isLoadingTransactions;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i03 = ($i02 + $i1) * 31;
        boolean $z03 = this.isLoadingMore;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i12 = i2;
        int $i04 = ($i03 + $i12) * 31;
        boolean $z04 = this.showEmptyListView;
        int i3 = $z04;
        if ($z04 != 0) {
            i3 = 1;
        }
        int $i13 = i3;
        int $i05 = ($i04 + $i13) * 31;
        boolean $z05 = this.hideSummary;
        int $i14 = $z05 ? 1 : $z05 ? 1 : 0;
        List $r1 = this.transactions;
        int $i15 = $r1.hashCode();
        List $r12 = this.walletSummary;
        int $i16 = $r12.hashCode();
        int $i17 = this.incompleteTransactionsCount;
        String $r2 = this.warningText;
        int $i18 = $r2.hashCode();
        List $r13 = this.commissionWallets;
        int $i19 = $r13.hashCode();
        return (((((((((($i05 + $i14) * 31) + $i15) * 31) + $i16) * 31) + $i17) * 31) + $i18) * 31) + $i19;
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
    public final boolean isLoadingSummary() {
        boolean z0 = this.isLoadingSummary;
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
        $r2.append("TransactionsViewState(isLoadingSummary=");
        boolean $z0 = this.isLoadingSummary;
        $r2.append($z0);
        $r2.append(", isLoadingTransactions=");
        boolean $z02 = this.isLoadingTransactions;
        $r2.append($z02);
        $r2.append(", isLoadingMore=");
        boolean $z03 = this.isLoadingMore;
        $r2.append($z03);
        $r2.append(", showEmptyListView=");
        boolean $z04 = this.showEmptyListView;
        $r2.append($z04);
        $r2.append(", hideSummary=");
        boolean $z05 = this.hideSummary;
        $r2.append($z05);
        $r2.append(", transactions=");
        List $r3 = this.transactions;
        $r2.append($r3);
        $r2.append(", walletSummary=");
        List $r32 = this.walletSummary;
        $r2.append($r32);
        $r2.append(", incompleteTransactionsCount=");
        int $i0 = this.incompleteTransactionsCount;
        $r2.append($i0);
        $r2.append(", warningText=");
        String $r1 = this.warningText;
        $r2.append($r1);
        $r2.append(", commissionWallets=");
        List $r33 = this.commissionWallets;
        $r2.append($r33);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
