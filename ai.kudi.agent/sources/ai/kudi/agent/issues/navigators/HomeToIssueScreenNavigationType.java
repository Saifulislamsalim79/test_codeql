package ai.kudi.agent.issues.navigators;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IssueTypeHomeNavigator.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/navigators/HomeToIssueScreenNavigationType;", "", "(Ljava/lang/String;I)V", "CONTACT_US", "ISSUE_DETAIL", "ISSUE_TYPE", "ISSUE_STATUS", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HomeToIssueScreenNavigationType {
    private static final /* synthetic */ HomeToIssueScreenNavigationType[] $VALUES;
    public static final HomeToIssueScreenNavigationType CONTACT_US;
    public static final HomeToIssueScreenNavigationType ISSUE_DETAIL;
    public static final HomeToIssueScreenNavigationType ISSUE_STATUS;
    public static final HomeToIssueScreenNavigationType ISSUE_TYPE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ HomeToIssueScreenNavigationType[] $values() {
        HomeToIssueScreenNavigationType $r1 = CONTACT_US;
        HomeToIssueScreenNavigationType $r12 = ISSUE_DETAIL;
        HomeToIssueScreenNavigationType $r13 = ISSUE_TYPE;
        HomeToIssueScreenNavigationType $r14 = ISSUE_STATUS;
        HomeToIssueScreenNavigationType[] $r0 = {$r1, $r12, $r13, $r14};
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
        HomeToIssueScreenNavigationType $r1 = new HomeToIssueScreenNavigationType("CONTACT_US", 0);
        CONTACT_US = $r1;
        HomeToIssueScreenNavigationType $r12 = new HomeToIssueScreenNavigationType("ISSUE_DETAIL", 1);
        ISSUE_DETAIL = $r12;
        HomeToIssueScreenNavigationType $r13 = new HomeToIssueScreenNavigationType("ISSUE_TYPE", 2);
        ISSUE_TYPE = $r13;
        HomeToIssueScreenNavigationType $r14 = new HomeToIssueScreenNavigationType("ISSUE_STATUS", 3);
        ISSUE_STATUS = $r14;
        HomeToIssueScreenNavigationType[] $r0 = $values();
        $VALUES = $r0;
    }

    private HomeToIssueScreenNavigationType(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static HomeToIssueScreenNavigationType valueOf(String str) {
        Enum $r0 = Enum.valueOf(HomeToIssueScreenNavigationType.class, str);
        HomeToIssueScreenNavigationType $r2 = (HomeToIssueScreenNavigationType) $r0;
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
    public static HomeToIssueScreenNavigationType[] values() {
        HomeToIssueScreenNavigationType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        HomeToIssueScreenNavigationType[] $r12 = (HomeToIssueScreenNavigationType[]) $r0;
        return $r12;
    }
}
