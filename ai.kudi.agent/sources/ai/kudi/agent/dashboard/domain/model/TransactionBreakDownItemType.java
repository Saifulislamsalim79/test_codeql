package ai.kudi.agent.dashboard.domain.model;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import kotlin.Metadata;
/* compiled from: TransactionBreakDownItemType.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownItemType;", "", "()V", "AIRTIME_TOPUP", "", "BETTING", "COLLECTIONS", IssueTypeFragmentNew.DATA, "PHCN", "TRANSFER", "TV_SUBSCRIPTION", "WALLET_TOPUP", "WITHDRAWAL", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionBreakDownItemType {
    public static final String AIRTIME_TOPUP = "topup";
    public static final String BETTING = "betting";
    public static final String COLLECTIONS = "collections";
    public static final String DATA = "data";
    public static final TransactionBreakDownItemType INSTANCE;
    public static final String PHCN = "phcn";
    public static final String TRANSFER = "transfer";
    public static final String TV_SUBSCRIPTION = "tv_subscription";
    public static final String WALLET_TOPUP = "wallet_topup";
    public static final String WITHDRAWAL = "withdrawal";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        TransactionBreakDownItemType $r0 = new TransactionBreakDownItemType();
        INSTANCE = $r0;
    }

    private TransactionBreakDownItemType() {
    }
}
