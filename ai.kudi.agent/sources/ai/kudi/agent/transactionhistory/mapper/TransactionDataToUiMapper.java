package ai.kudi.agent.transactionhistory.mapper;

import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.transactionhistory.data.model.TransactionDataModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionDataToUiMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "", "()V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionDataToUiMapper {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final TransactionItemUiModel.Transaction getPlaylist(TransactionDataModel transactionDataModel) {
        Log_OC.getArray(transactionDataModel, MetricTracker.Object.INPUT);
        String $r2 = transactionDataModel.getId();
        TransactionType $r3 = transactionDataModel.getTransactionType();
        String $r4 = transactionDataModel.getAmount();
        TransactionKind $r5 = transactionDataModel.getKind();
        String $r6 = transactionDataModel.getStatus();
        Date $r7 = transactionDataModel.getDate();
        Date $r8 = transactionDataModel.getDate();
        TimeZone $r9 = TimeZone.getDefault();
        Log_OC.loadImage($r9, "getDefault()");
        String $r10 = DateExtKt.formatWithStyle($r8, "hh.mma", $r9);
        String $r11 = transactionDataModel.getCustomerName();
        String $r12 = transactionDataModel.getCustomerPictureId();
        String $r13 = transactionDataModel.getCustomerPhone();
        String $r14 = transactionDataModel.getAccountBalance();
        TransactionItemUiModel.Transaction $r15 = new TransactionItemUiModel.Transaction($r2, $r3, $r10, $r14, $r4, $r5, $r13, $r11, $r12, $r6, $r7);
        return $r15;
    }
}
