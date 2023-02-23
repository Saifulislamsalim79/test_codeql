package ai.kudi.agent.pos.presentation.mapper;

import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.pos.data.PosOrder;
import ai.kudi.agent.pos.p016ui.model.PosOrderUiModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosOrderDataToUiMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/pos/presentation/mapper/PosOrderDataToUiMapper;", "", "()V", "map", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel$Order;", MetricTracker.Object.INPUT, "Lai/kudi/agent/pos/presentation/mapper/PosOrderMapperInput;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosOrderDataToUiMapper {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final PosOrderUiModel.Order getShares(PosOrderMapperInput posOrderMapperInput) {
        Log_OC.getArray(posOrderMapperInput, MetricTracker.Object.INPUT);
        PosOrder $r3 = posOrderMapperInput.getPosOrder();
        String $r4 = $r3.getId();
        Date $r5 = posOrderMapperInput.getDate();
        TimeZone $r6 = TimeZone.getDefault();
        Log_OC.loadImage($r6, "getDefault()");
        String $r7 = DateExtKt.formatWithStyle($r5, "hh.mma", $r6);
        PosOrder $r32 = posOrderMapperInput.getPosOrder();
        double $d0 = $r32.getAmount();
        Double $r8 = Double.valueOf($d0);
        String $r9 = StringExtKt.formatAmount($r8);
        PosOrderUiModel.Order $r2 = new PosOrderUiModel.Order($r4, $r7, $r9);
        return $r2;
    }
}
