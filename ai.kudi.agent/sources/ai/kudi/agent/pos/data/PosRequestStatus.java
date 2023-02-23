package ai.kudi.agent.pos.data;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PosRequestStatus.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/pos/data/PosRequestStatus;", "", "(Ljava/lang/String;I)V", "INITIATE_REQUEST", "CONFIGURATION", "DELIVERED", "UNDEFINED", "PURCHASED", "CONFIGURED", "REFUNDED", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosRequestStatus {
    private static final /* synthetic */ PosRequestStatus[] $VALUES;
    public static final PosRequestStatus CONFIGURATION;
    public static final PosRequestStatus CONFIGURED;
    public static final PosRequestStatus DELIVERED;
    public static final PosRequestStatus INITIATE_REQUEST;
    public static final PosRequestStatus PURCHASED;
    public static final PosRequestStatus REFUNDED;
    public static final PosRequestStatus UNDEFINED;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ PosRequestStatus[] $values() {
        PosRequestStatus $r1 = INITIATE_REQUEST;
        PosRequestStatus $r12 = CONFIGURATION;
        PosRequestStatus $r13 = DELIVERED;
        PosRequestStatus $r14 = UNDEFINED;
        PosRequestStatus $r15 = PURCHASED;
        PosRequestStatus $r16 = CONFIGURED;
        PosRequestStatus $r17 = REFUNDED;
        PosRequestStatus[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17};
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
        PosRequestStatus $r1 = new PosRequestStatus("INITIATE_REQUEST", 0);
        INITIATE_REQUEST = $r1;
        PosRequestStatus $r12 = new PosRequestStatus("CONFIGURATION", 1);
        CONFIGURATION = $r12;
        PosRequestStatus $r13 = new PosRequestStatus("DELIVERED", 2);
        DELIVERED = $r13;
        PosRequestStatus $r14 = new PosRequestStatus("UNDEFINED", 3);
        UNDEFINED = $r14;
        PosRequestStatus $r15 = new PosRequestStatus("PURCHASED", 4);
        PURCHASED = $r15;
        PosRequestStatus $r16 = new PosRequestStatus("CONFIGURED", 5);
        CONFIGURED = $r16;
        PosRequestStatus $r17 = new PosRequestStatus("REFUNDED", 6);
        REFUNDED = $r17;
        PosRequestStatus[] $r0 = $values();
        $VALUES = $r0;
    }

    private PosRequestStatus(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static PosRequestStatus valueOf(String str) {
        Enum $r0 = Enum.valueOf(PosRequestStatus.class, str);
        PosRequestStatus $r2 = (PosRequestStatus) $r0;
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
    public static PosRequestStatus[] values() {
        PosRequestStatus[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        PosRequestStatus[] $r12 = (PosRequestStatus[]) $r0;
        return $r12;
    }
}
