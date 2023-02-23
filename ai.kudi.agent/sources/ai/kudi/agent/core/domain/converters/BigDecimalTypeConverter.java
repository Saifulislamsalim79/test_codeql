package ai.kudi.agent.core.domain.converters;

import java.math.BigDecimal;
import kotlin.Metadata;
/* compiled from: BigDecimalTypeConverter.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/domain/converters/BigDecimalTypeConverter;", "", "()V", "fromBigDecimal", "", "value", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)Ljava/lang/Long;", "fromLong", "(Ljava/lang/Long;)Ljava/math/BigDecimal;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BigDecimalTypeConverter {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Long fromBigDecimal(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal $r1 = new BigDecimal(100);
        BigDecimal $r2 = bigDecimal.multiply($r1);
        if ($r2 == null) {
            return null;
        }
        long $l0 = $r2.longValueExact();
        Long $r3 = Long.valueOf($l0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final BigDecimal fromLong(Long l) {
        if (l == null) {
            return null;
        }
        long $l0 = l.longValue();
        BigDecimal $r1 = new BigDecimal($l0);
        BigDecimal $r3 = new BigDecimal(100);
        return $r1.divide($r3, 2, 4);
    }
}
