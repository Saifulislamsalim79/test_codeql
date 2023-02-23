package ai.kudi.agent.core.domain.p004db.model;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionSummaryTypeDatabaseModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/model/TransactionSummaryTypeDatabaseModel;", "", "(Ljava/lang/String;I)V", "TOTAL_VALUE", "TOTAL_COUNT", "COMMISSION_TOTAL_VALUE", "PAYOUT_TOTAL_COUNT", "WALLET_BALANCE", "COMMISSION_WALLET", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.model.TransactionSummaryTypeDatabaseModel */
/* loaded from: classes.dex */
public final class TransactionSummaryTypeDatabaseModel {
    private static final /* synthetic */ TransactionSummaryTypeDatabaseModel[] $VALUES;
    public static final TransactionSummaryTypeDatabaseModel COMMISSION_TOTAL_VALUE;
    public static final TransactionSummaryTypeDatabaseModel COMMISSION_WALLET;
    public static final TransactionSummaryTypeDatabaseModel PAYOUT_TOTAL_COUNT;
    public static final TransactionSummaryTypeDatabaseModel TOTAL_COUNT;
    public static final TransactionSummaryTypeDatabaseModel TOTAL_VALUE;
    public static final TransactionSummaryTypeDatabaseModel WALLET_BALANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ TransactionSummaryTypeDatabaseModel[] $values() {
        TransactionSummaryTypeDatabaseModel $r1 = TOTAL_VALUE;
        TransactionSummaryTypeDatabaseModel $r12 = TOTAL_COUNT;
        TransactionSummaryTypeDatabaseModel $r13 = COMMISSION_TOTAL_VALUE;
        TransactionSummaryTypeDatabaseModel $r14 = PAYOUT_TOTAL_COUNT;
        TransactionSummaryTypeDatabaseModel $r15 = WALLET_BALANCE;
        TransactionSummaryTypeDatabaseModel $r16 = COMMISSION_WALLET;
        TransactionSummaryTypeDatabaseModel[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16};
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
        TransactionSummaryTypeDatabaseModel $r1 = new TransactionSummaryTypeDatabaseModel("TOTAL_VALUE", 0);
        TOTAL_VALUE = $r1;
        TransactionSummaryTypeDatabaseModel $r12 = new TransactionSummaryTypeDatabaseModel("TOTAL_COUNT", 1);
        TOTAL_COUNT = $r12;
        TransactionSummaryTypeDatabaseModel $r13 = new TransactionSummaryTypeDatabaseModel("COMMISSION_TOTAL_VALUE", 2);
        COMMISSION_TOTAL_VALUE = $r13;
        TransactionSummaryTypeDatabaseModel $r14 = new TransactionSummaryTypeDatabaseModel("PAYOUT_TOTAL_COUNT", 3);
        PAYOUT_TOTAL_COUNT = $r14;
        TransactionSummaryTypeDatabaseModel $r15 = new TransactionSummaryTypeDatabaseModel("WALLET_BALANCE", 4);
        WALLET_BALANCE = $r15;
        TransactionSummaryTypeDatabaseModel $r16 = new TransactionSummaryTypeDatabaseModel("COMMISSION_WALLET", 5);
        COMMISSION_WALLET = $r16;
        TransactionSummaryTypeDatabaseModel[] $r0 = $values();
        $VALUES = $r0;
    }

    private TransactionSummaryTypeDatabaseModel(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionSummaryTypeDatabaseModel valueOf(String str) {
        Enum $r0 = Enum.valueOf(TransactionSummaryTypeDatabaseModel.class, str);
        TransactionSummaryTypeDatabaseModel $r2 = (TransactionSummaryTypeDatabaseModel) $r0;
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
    public static TransactionSummaryTypeDatabaseModel[] values() {
        TransactionSummaryTypeDatabaseModel[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        TransactionSummaryTypeDatabaseModel[] $r12 = (TransactionSummaryTypeDatabaseModel[]) $r0;
        return $r12;
    }
}
