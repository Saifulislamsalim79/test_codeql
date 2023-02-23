package ai.kudi.agent.register.domain.wiki;

import ai.kudi.agent.kshock.data.model.RuleTypes;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RegistrationInfo.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/register/domain/dto/RegistrationStatus;", "", "(Ljava/lang/String;I)V", "PENDING_KYC_VERIFICATION", "BVN_VERIFICATION_REQUIRED", "LOGIN_SUSPENDED", "OTP_VERIFICATION_NEEDED", "FACE_VERIFICATION_NEEDED", "SUSPENDED", "LOCKED_OUT", RuleTypes.BLACKLISTED, "ALLOW", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RegistrationStatus {
    private static final /* synthetic */ RegistrationStatus[] $VALUES;
    public static final RegistrationStatus ALLOW;
    public static final RegistrationStatus BLACKLISTED;
    public static final RegistrationStatus BVN_VERIFICATION_REQUIRED;
    public static final RegistrationStatus FACE_VERIFICATION_NEEDED;
    public static final RegistrationStatus LOCKED_OUT;
    public static final RegistrationStatus LOGIN_SUSPENDED;
    public static final RegistrationStatus OTP_VERIFICATION_NEEDED;
    public static final RegistrationStatus PENDING_KYC_VERIFICATION;
    public static final RegistrationStatus SUSPENDED;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ RegistrationStatus[] $values() {
        RegistrationStatus $r1 = PENDING_KYC_VERIFICATION;
        RegistrationStatus $r12 = BVN_VERIFICATION_REQUIRED;
        RegistrationStatus $r13 = LOGIN_SUSPENDED;
        RegistrationStatus $r14 = OTP_VERIFICATION_NEEDED;
        RegistrationStatus $r15 = FACE_VERIFICATION_NEEDED;
        RegistrationStatus $r16 = SUSPENDED;
        RegistrationStatus $r17 = LOCKED_OUT;
        RegistrationStatus $r18 = BLACKLISTED;
        RegistrationStatus $r19 = ALLOW;
        RegistrationStatus[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19};
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
        RegistrationStatus $r1 = new RegistrationStatus("PENDING_KYC_VERIFICATION", 0);
        PENDING_KYC_VERIFICATION = $r1;
        RegistrationStatus $r12 = new RegistrationStatus("BVN_VERIFICATION_REQUIRED", 1);
        BVN_VERIFICATION_REQUIRED = $r12;
        RegistrationStatus $r13 = new RegistrationStatus("LOGIN_SUSPENDED", 2);
        LOGIN_SUSPENDED = $r13;
        RegistrationStatus $r14 = new RegistrationStatus("OTP_VERIFICATION_NEEDED", 3);
        OTP_VERIFICATION_NEEDED = $r14;
        RegistrationStatus $r15 = new RegistrationStatus("FACE_VERIFICATION_NEEDED", 4);
        FACE_VERIFICATION_NEEDED = $r15;
        RegistrationStatus $r16 = new RegistrationStatus("SUSPENDED", 5);
        SUSPENDED = $r16;
        RegistrationStatus $r17 = new RegistrationStatus("LOCKED_OUT", 6);
        LOCKED_OUT = $r17;
        RegistrationStatus $r18 = new RegistrationStatus(RuleTypes.BLACKLISTED, 7);
        BLACKLISTED = $r18;
        RegistrationStatus $r19 = new RegistrationStatus("ALLOW", 8);
        ALLOW = $r19;
        RegistrationStatus[] $r0 = $values();
        $VALUES = $r0;
    }

    private RegistrationStatus(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static RegistrationStatus valueOf(String str) {
        Enum $r0 = Enum.valueOf(ai.kudi.agent.register.domain.dto.RegistrationStatus.class, str);
        RegistrationStatus $r2 = (RegistrationStatus) $r0;
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
    public static RegistrationStatus[] values() {
        RegistrationStatus[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        RegistrationStatus[] $r12 = (RegistrationStatus[]) $r0;
        return $r12;
    }
}
