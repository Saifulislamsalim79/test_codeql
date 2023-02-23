package ai.kudi.agent.transactionhistory.presentation.model;

import ai.kudi.agent.C0001R;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionSummaryItemType.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", "", "labelResId", "", "iconResId", "(Ljava/lang/String;III)V", "getIconResId", "()I", "getLabelResId", "TOTAL_VALUE", "TOTAL_COUNT", "COMMISSION_TOTAL_VALUE", "PAYOUT_TOTAL_COUNT", "WALLET_BALANCE", "COMMISSION_WALLET", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionSummaryItemType {
    private static final /* synthetic */ TransactionSummaryItemType[] $VALUES;
    public static final TransactionSummaryItemType COMMISSION_TOTAL_VALUE;
    public static final TransactionSummaryItemType COMMISSION_WALLET;
    public static final TransactionSummaryItemType PAYOUT_TOTAL_COUNT;
    public static final TransactionSummaryItemType TOTAL_COUNT;
    public static final TransactionSummaryItemType TOTAL_VALUE;
    public static final TransactionSummaryItemType WALLET_BALANCE;
    private final int iconResId;
    private final int labelResId;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ TransactionSummaryItemType[] $values() {
        TransactionSummaryItemType $r1 = TOTAL_VALUE;
        TransactionSummaryItemType $r12 = TOTAL_COUNT;
        TransactionSummaryItemType $r13 = COMMISSION_TOTAL_VALUE;
        TransactionSummaryItemType $r14 = PAYOUT_TOTAL_COUNT;
        TransactionSummaryItemType $r15 = WALLET_BALANCE;
        TransactionSummaryItemType $r16 = COMMISSION_WALLET;
        TransactionSummaryItemType[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16};
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        TransactionSummaryItemType $r1 = new TransactionSummaryItemType("TOTAL_VALUE", 0, C0001R.string.total_transaction_value, C0001R.C0002drawable.ic_transaction_total_summary);
        TOTAL_VALUE = $r1;
        TransactionSummaryItemType $r12 = new TransactionSummaryItemType("TOTAL_COUNT", 1, C0001R.string.total_transaction_count, C0001R.C0002drawable.ic_transaction_count_summary);
        TOTAL_COUNT = $r12;
        TransactionSummaryItemType $r13 = new TransactionSummaryItemType("COMMISSION_TOTAL_VALUE", 2, C0001R.string.commission_balance, C0001R.C0002drawable.ic_coins);
        COMMISSION_TOTAL_VALUE = $r13;
        TransactionSummaryItemType $r14 = new TransactionSummaryItemType("PAYOUT_TOTAL_COUNT", 3, C0001R.string.total_payout, C0001R.C0002drawable.ic_payout);
        PAYOUT_TOTAL_COUNT = $r14;
        TransactionSummaryItemType $r15 = new TransactionSummaryItemType("WALLET_BALANCE", 4, C0001R.string.wallet_balance, C0001R.C0002drawable.ic_wallet_balance);
        WALLET_BALANCE = $r15;
        TransactionSummaryItemType $r16 = new TransactionSummaryItemType("COMMISSION_WALLET", 5, C0001R.string.commission_wallet, C0001R.C0002drawable.ic_coins);
        COMMISSION_WALLET = $r16;
        TransactionSummaryItemType[] $r0 = $values();
        $VALUES = $r0;
    }

    private TransactionSummaryItemType(String str, int i, int i2, int i3) {
        this.labelResId = i2;
        this.iconResId = i3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ TransactionSummaryItemType(java.lang.String r1, int r2, int r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r0 = this;
            r5 = r5 & 2
            if (r5 == 0) goto L7
            r4 = 2131231436(0x7f0802cc, float:1.8078953E38)
        L7:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType.<init>(java.lang.String, int, int, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionSummaryItemType valueOf(String str) {
        Enum $r0 = Enum.valueOf(TransactionSummaryItemType.class, str);
        TransactionSummaryItemType $r2 = (TransactionSummaryItemType) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionSummaryItemType[] values() {
        TransactionSummaryItemType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        TransactionSummaryItemType[] $r12 = (TransactionSummaryItemType[]) $r0;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getIconResId() {
        int i0 = this.iconResId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getLabelResId() {
        int i0 = this.labelResId;
        return i0;
    }
}
