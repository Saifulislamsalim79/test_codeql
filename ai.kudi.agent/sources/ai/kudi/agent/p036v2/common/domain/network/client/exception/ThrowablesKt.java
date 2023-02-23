package ai.kudi.agent.p036v2.common.domain.network.client.exception;

import ai.kudi.agent.network.exceptions.ConflictingException;
import ai.kudi.agent.network.exceptions.MalformedParamException;
import kotlin.Metadata;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: Throwables.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m10421d2 = {"throwAppropriateException", "Lio/reactivex/functions/Consumer;", "", "feature-collections_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.network.client.exception.ThrowablesKt */
/* loaded from: classes.dex */
public final class ThrowablesKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Object throwAppropriateException() {
        Token r0 = Token.DOUBLE;
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: throwAppropriateException$lambda-0  reason: not valid java name */
    public static final void m41500throwAppropriateException$lambda0(Throwable th) {
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r1 = (HttpException) th;
            int $i0 = $r1.m352a();
            if ($i0 == 400) {
                MalformedParamException $r4 = new MalformedParamException("Something went wrong. Please try again.");
                throw $r4;
            } else if ($i0 == 404) {
                ConflictingException $r2 = new ConflictingException("Customer not found");
                throw $r2;
            } else {
                String $r3 = $r1.m350c();
                ConflictingException $r22 = new ConflictingException($r3);
                throw $r22;
            }
        }
    }
}
