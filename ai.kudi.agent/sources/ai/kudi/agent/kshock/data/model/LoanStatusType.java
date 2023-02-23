package ai.kudi.agent.kshock.data.model;

import kotlin.Metadata;
/* compiled from: LoanUiModel.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/kshock/data/model/LoanStatusType;", "", "()V", LoanStatusType.APPROVED, "", LoanStatusType.CANCELLED, LoanStatusType.DECLINED, "OVERDUE", LoanStatusType.PENDING_APPROVAL, LoanStatusType.PENDING_PAYBACK, LoanStatusType.SETTLED, "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoanStatusType {
    public static final String APPROVED = "APPROVED";
    public static final String CANCELLED = "CANCELLED";
    public static final String DECLINED = "DECLINED";
    public static final LoanStatusType INSTANCE;
    public static final String OVERDUE = "OVERDUE";
    public static final String PENDING_APPROVAL = "PENDING_APPROVAL";
    public static final String PENDING_PAYBACK = "PENDING_PAYBACK";
    public static final String SETTLED = "SETTLED";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        LoanStatusType $r0 = new LoanStatusType();
        INSTANCE = $r0;
    }

    private LoanStatusType() {
    }
}
