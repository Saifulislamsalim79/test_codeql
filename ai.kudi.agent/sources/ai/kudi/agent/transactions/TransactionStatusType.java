package ai.kudi.agent.transactions;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionStatusType.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/transactions/TransactionStatusType;", "", "(Ljava/lang/String;I)V", "WITHDRAWAL", "TRANSFER", "MULTIPLE_TRANSFER", "AIRTIME_AND_DATA", "OTHER_BILLS", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionStatusType {
    private static final /* synthetic */ TransactionStatusType[] $VALUES;
    public static final TransactionStatusType AIRTIME_AND_DATA;
    public static final TransactionStatusType MULTIPLE_TRANSFER;
    public static final TransactionStatusType OTHER_BILLS;
    public static final TransactionStatusType TRANSFER;
    public static final TransactionStatusType WITHDRAWAL;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ TransactionStatusType[] $values() {
        TransactionStatusType $r1 = WITHDRAWAL;
        TransactionStatusType $r12 = TRANSFER;
        TransactionStatusType $r13 = MULTIPLE_TRANSFER;
        TransactionStatusType $r14 = AIRTIME_AND_DATA;
        TransactionStatusType $r15 = OTHER_BILLS;
        TransactionStatusType[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
        TransactionStatusType $r1 = new TransactionStatusType("WITHDRAWAL", 0);
        WITHDRAWAL = $r1;
        TransactionStatusType $r12 = new TransactionStatusType("TRANSFER", 1);
        TRANSFER = $r12;
        TransactionStatusType $r13 = new TransactionStatusType("MULTIPLE_TRANSFER", 2);
        MULTIPLE_TRANSFER = $r13;
        TransactionStatusType $r14 = new TransactionStatusType("AIRTIME_AND_DATA", 3);
        AIRTIME_AND_DATA = $r14;
        TransactionStatusType $r15 = new TransactionStatusType("OTHER_BILLS", 4);
        OTHER_BILLS = $r15;
        TransactionStatusType[] $r0 = $values();
        $VALUES = $r0;
    }

    private TransactionStatusType(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionStatusType valueOf(String str) {
        Enum $r0 = Enum.valueOf(TransactionStatusType.class, str);
        TransactionStatusType $r2 = (TransactionStatusType) $r0;
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
    public static TransactionStatusType[] values() {
        TransactionStatusType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        TransactionStatusType[] $r12 = (TransactionStatusType[]) $r0;
        return $r12;
    }
}
