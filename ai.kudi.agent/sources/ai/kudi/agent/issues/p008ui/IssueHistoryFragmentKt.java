package ai.kudi.agent.issues.p008ui;

import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p557z.C13727r0;
/* compiled from: IssueHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m10421d2 = {"issueStatusMap", "", "", "getIssueStatusMap", "()Ljava/util/Map;", "feature-issue-resolution_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragmentKt */
/* loaded from: classes.dex */
public final class IssueHistoryFragmentKt {
    private static final Map<String, String> issueStatusMap;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Map $r2;
        C13287o $r1 = C13664u.m4227a("All", "");
        C13287o $r12 = C13664u.m4227a("Opened", "OPENED");
        C13287o $r13 = C13664u.m4227a("Resolved", "RESOLVED");
        C13287o $r14 = C13664u.m4227a("Unresolved", "UNRESOLVED");
        C13287o[] $r0 = {$r1, $r12, $r13, $r14};
        $r2 = C13727r0.m3878n($r0);
        issueStatusMap = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Map getIssueStatusMap() {
        Map r0 = issueStatusMap;
        return r0;
    }
}
