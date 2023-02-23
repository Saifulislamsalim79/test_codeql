package ai.kudi.agent.transactionhistory.mapper;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ServerTimeToTransactionDayMapper.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/core/util/ResourceDelegate;)V", "map", "", MetricTracker.Object.INPUT, "Ljava/util/Date;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ServerTimeToTransactionDayMapper {
    private final ResourceDelegate resource;

    public ServerTimeToTransactionDayMapper(ResourceDelegate resourceDelegate) {
        Log_OC.getArray(resourceDelegate, "resource");
        this.resource = resourceDelegate;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String formatDate(Date date) {
        Log_OC.getArray(date, MetricTracker.Object.INPUT);
        boolean $z0 = DateExtKt.isToday(date);
        if ($z0) {
            ResourceDelegate $r2 = this.resource;
            String $r3 = $r2.getString(C0001R.string.today);
            return $r3;
        }
        boolean $z02 = DateExtKt.isYesterday(date);
        if ($z02) {
            ResourceDelegate $r22 = this.resource;
            String $r32 = $r22.getString(C0001R.string.yesterday);
            return $r32;
        }
        TimeZone $r4 = TimeZone.getDefault();
        Log_OC.loadImage($r4, "getDefault()");
        String $r33 = DateExtKt.formatWithStyle(date, "EEEE, dd MMM, yyyy", $r4);
        return $r33;
    }
}
