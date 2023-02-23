package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionKindDatabaseModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionKindDatabaseToDataMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionKindDatabaseToDataMapper;", "", "()V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionKind;", MetricTracker.Object.INPUT, "Lai/kudi/agent/core/domain/db/model/TransactionKindDatabaseModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionKindDatabaseToDataMapper {

    /* compiled from: TransactionKindDatabaseToDataMapper.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        static {
            TransactionKindDatabaseModel[] $r0 = TransactionKindDatabaseModel.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionKindDatabaseModel $r2 = TransactionKindDatabaseModel.CREDIT;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionKindDatabaseModel $r22 = TransactionKindDatabaseModel.DEBIT;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final TransactionKind parse(TransactionKindDatabaseModel transactionKindDatabaseModel) {
        Log_OC.getArray(transactionKindDatabaseModel, MetricTracker.Object.INPUT);
        int[] $r2 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r2[transactionKindDatabaseModel.ordinal()];
        if ($i0 == 1) {
            TransactionKind r4 = TransactionKind.CREDIT;
            return r4;
        } else if ($i0 == 2) {
            TransactionKind r42 = TransactionKind.DEBIT;
            return r42;
        } else {
            Throwable r5 = new NoWhenBranchMatchedException();
            Throwable r6 = r5;
            throw r6;
        }
    }
}
