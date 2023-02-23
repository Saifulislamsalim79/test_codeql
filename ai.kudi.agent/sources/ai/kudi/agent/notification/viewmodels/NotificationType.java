package ai.kudi.agent.notification.viewmodels;

import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationType.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/notification/viewmodels/NotificationType;", "", "(Ljava/lang/String;I)V", "TRANSACTION_REFUND", "TICKET_NOTIFICATION", "PENDING_FRAUD_CHECK", "WALLET_CREDIT_TOP_NOTIFICATION", IncomingMessage.TYPE_OUTLET_LINKING_REQUEST, IncomingMessage.TYPE_OUTLET_LINK_ACCEPTED, IncomingMessage.TYPE_KYC_UPGRADE_SUCCESSFUL, IncomingMessage.TYPE_KYC_UPGRADE_FAILED, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationType {
    private static final /* synthetic */ NotificationType[] $VALUES;
    public static final NotificationType KYC_UPGRADE_FAILED;
    public static final NotificationType KYC_UPGRADE_SUCCESSFUL;
    public static final NotificationType OUTLET_LINKING;
    public static final NotificationType OUTLET_LINK_ACCEPTED;
    public static final NotificationType PENDING_FRAUD_CHECK;
    public static final NotificationType TICKET_NOTIFICATION;
    public static final NotificationType TRANSACTION_REFUND;
    public static final NotificationType WALLET_CREDIT_TOP_NOTIFICATION;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ NotificationType[] $values() {
        NotificationType $r1 = TRANSACTION_REFUND;
        NotificationType $r12 = TICKET_NOTIFICATION;
        NotificationType $r13 = PENDING_FRAUD_CHECK;
        NotificationType $r14 = WALLET_CREDIT_TOP_NOTIFICATION;
        NotificationType $r15 = OUTLET_LINKING;
        NotificationType $r16 = OUTLET_LINK_ACCEPTED;
        NotificationType $r17 = KYC_UPGRADE_SUCCESSFUL;
        NotificationType $r18 = KYC_UPGRADE_FAILED;
        NotificationType[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18};
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
        NotificationType $r1 = new NotificationType("TRANSACTION_REFUND", 0);
        TRANSACTION_REFUND = $r1;
        NotificationType $r12 = new NotificationType("TICKET_NOTIFICATION", 1);
        TICKET_NOTIFICATION = $r12;
        NotificationType $r13 = new NotificationType("PENDING_FRAUD_CHECK", 2);
        PENDING_FRAUD_CHECK = $r13;
        NotificationType $r14 = new NotificationType("WALLET_CREDIT_TOP_NOTIFICATION", 3);
        WALLET_CREDIT_TOP_NOTIFICATION = $r14;
        NotificationType $r15 = new NotificationType(IncomingMessage.TYPE_OUTLET_LINKING_REQUEST, 4);
        OUTLET_LINKING = $r15;
        NotificationType $r16 = new NotificationType(IncomingMessage.TYPE_OUTLET_LINK_ACCEPTED, 5);
        OUTLET_LINK_ACCEPTED = $r16;
        NotificationType $r17 = new NotificationType(IncomingMessage.TYPE_KYC_UPGRADE_SUCCESSFUL, 6);
        KYC_UPGRADE_SUCCESSFUL = $r17;
        NotificationType $r18 = new NotificationType(IncomingMessage.TYPE_KYC_UPGRADE_FAILED, 7);
        KYC_UPGRADE_FAILED = $r18;
        NotificationType[] $r0 = $values();
        $VALUES = $r0;
    }

    private NotificationType(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static NotificationType valueOf(String str) {
        Enum $r0 = Enum.valueOf(NotificationType.class, str);
        NotificationType $r2 = (NotificationType) $r0;
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
    public static NotificationType[] values() {
        NotificationType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        NotificationType[] $r12 = (NotificationType[]) $r0;
        return $r12;
    }
}
