package ai.kudi.agent.transactionhistory.mapper;

import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionKindMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/TransactionKindMapper;", "", "()V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionKind;", MetricTracker.Object.INPUT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionKindMapper {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final TransactionKind getPlainText(String str) {
        boolean $z0 = Log_OC.append(str, "CREDIT");
        if ($z0) {
            TransactionKind r2 = TransactionKind.CREDIT;
            return r2;
        }
        boolean $z02 = Log_OC.append(str, "DEBIT");
        if ($z02) {
            TransactionKind r22 = TransactionKind.DEBIT;
            return r22;
        }
        return null;
    }
}
