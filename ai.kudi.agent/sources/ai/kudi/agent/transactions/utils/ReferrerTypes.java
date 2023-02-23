package ai.kudi.agent.transactions.utils;

import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionsUtil.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transactions/utils/ReferrerTypes;", "", "(Ljava/lang/String;I)V", "toString", "", "SUPER_AGENT", "AGGREGATOR", "SUPER_AGGREGATOR", "CHIEF_AGGREGATOR_OFFICER", KycLevelRemoteDataSource.NONE, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ReferrerTypes {
    private static final /* synthetic */ ReferrerTypes[] $VALUES;
    public static final ReferrerTypes AGGREGATOR;
    public static final ReferrerTypes CHIEF_AGGREGATOR_OFFICER;
    public static final ReferrerTypes NONE;
    public static final ReferrerTypes SUPER_AGENT;
    public static final ReferrerTypes SUPER_AGGREGATOR;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ ReferrerTypes[] $values() {
        ReferrerTypes $r1 = SUPER_AGENT;
        ReferrerTypes $r12 = AGGREGATOR;
        ReferrerTypes $r13 = SUPER_AGGREGATOR;
        ReferrerTypes $r14 = CHIEF_AGGREGATOR_OFFICER;
        ReferrerTypes $r15 = NONE;
        ReferrerTypes[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
        ReferrerTypes $r1 = new ReferrerTypes("SUPER_AGENT", 0);
        SUPER_AGENT = $r1;
        ReferrerTypes $r12 = new ReferrerTypes("AGGREGATOR", 1);
        AGGREGATOR = $r12;
        ReferrerTypes $r13 = new ReferrerTypes("SUPER_AGGREGATOR", 2);
        SUPER_AGGREGATOR = $r13;
        ReferrerTypes $r14 = new ReferrerTypes("CHIEF_AGGREGATOR_OFFICER", 3);
        CHIEF_AGGREGATOR_OFFICER = $r14;
        ReferrerTypes $r15 = new ReferrerTypes(KycLevelRemoteDataSource.NONE, 4);
        NONE = $r15;
        ReferrerTypes[] $r0 = $values();
        $VALUES = $r0;
    }

    private ReferrerTypes(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static ReferrerTypes valueOf(String str) {
        Enum $r0 = Enum.valueOf(ReferrerTypes.class, str);
        ReferrerTypes $r2 = (ReferrerTypes) $r0;
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
    public static ReferrerTypes[] values() {
        ReferrerTypes[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        ReferrerTypes[] $r12 = (ReferrerTypes[]) $r0;
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
    @Override // java.lang.Enum
    public String toString() {
        String $r1 = name();
        return $r1;
    }
}
