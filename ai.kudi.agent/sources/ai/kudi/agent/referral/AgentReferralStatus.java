package ai.kudi.agent.referral;

import ai.kudi.agent.kshock.p009ui.KShockActivity;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AgentReferralModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/referral/AgentReferralStatus;", "", "(Ljava/lang/String;I)V", "REGISTERED", "ACTIVE", KShockActivity.PAYBACK_PENDING, "INACTIVE", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralStatus {
    private static final /* synthetic */ AgentReferralStatus[] $VALUES;
    public static final AgentReferralStatus ACTIVE;
    public static final AgentReferralStatus INACTIVE;
    public static final AgentReferralStatus PENDING;
    public static final AgentReferralStatus REGISTERED;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ AgentReferralStatus[] $values() {
        AgentReferralStatus $r1 = REGISTERED;
        AgentReferralStatus $r12 = ACTIVE;
        AgentReferralStatus $r13 = PENDING;
        AgentReferralStatus $r14 = INACTIVE;
        AgentReferralStatus[] $r0 = {$r1, $r12, $r13, $r14};
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
        AgentReferralStatus $r1 = new AgentReferralStatus("REGISTERED", 0);
        REGISTERED = $r1;
        AgentReferralStatus $r12 = new AgentReferralStatus("ACTIVE", 1);
        ACTIVE = $r12;
        AgentReferralStatus $r13 = new AgentReferralStatus(KShockActivity.PAYBACK_PENDING, 2);
        PENDING = $r13;
        AgentReferralStatus $r14 = new AgentReferralStatus("INACTIVE", 3);
        INACTIVE = $r14;
        AgentReferralStatus[] $r0 = $values();
        $VALUES = $r0;
    }

    private AgentReferralStatus(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AgentReferralStatus valueOf(String str) {
        Enum $r0 = Enum.valueOf(AgentReferralStatus.class, str);
        AgentReferralStatus $r2 = (AgentReferralStatus) $r0;
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
    public static AgentReferralStatus[] values() {
        AgentReferralStatus[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        AgentReferralStatus[] $r12 = (AgentReferralStatus[]) $r0;
        return $r12;
    }
}
