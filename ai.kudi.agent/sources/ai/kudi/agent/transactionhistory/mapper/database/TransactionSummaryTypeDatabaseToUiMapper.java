package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionSummaryTypeDatabaseModel;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionSummaryTypeDatabaseToUiMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryTypeDatabaseToUiMapper;", "", "()V", "map", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", MetricTracker.Object.INPUT, "Lai/kudi/agent/core/domain/db/model/TransactionSummaryTypeDatabaseModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionSummaryTypeDatabaseToUiMapper {

    /* compiled from: TransactionSummaryTypeDatabaseToUiMapper.kt */
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
            TransactionSummaryTypeDatabaseModel[] $r0 = TransactionSummaryTypeDatabaseModel.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionSummaryTypeDatabaseModel $r2 = TransactionSummaryTypeDatabaseModel.TOTAL_VALUE;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionSummaryTypeDatabaseModel $r22 = TransactionSummaryTypeDatabaseModel.TOTAL_COUNT;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            TransactionSummaryTypeDatabaseModel $r23 = TransactionSummaryTypeDatabaseModel.COMMISSION_TOTAL_VALUE;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            TransactionSummaryTypeDatabaseModel $r24 = TransactionSummaryTypeDatabaseModel.PAYOUT_TOTAL_COUNT;
            int $i05 = $r24.ordinal();
            $r1[$i05] = 4;
            TransactionSummaryTypeDatabaseModel $r25 = TransactionSummaryTypeDatabaseModel.WALLET_BALANCE;
            int $i06 = $r25.ordinal();
            $r1[$i06] = 5;
            TransactionSummaryTypeDatabaseModel $r26 = TransactionSummaryTypeDatabaseModel.COMMISSION_WALLET;
            int $i07 = $r26.ordinal();
            $r1[$i07] = 6;
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
    public final TransactionSummaryItemType start(TransactionSummaryTypeDatabaseModel transactionSummaryTypeDatabaseModel) {
        Log_OC.getArray(transactionSummaryTypeDatabaseModel, MetricTracker.Object.INPUT);
        int[] $r2 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = transactionSummaryTypeDatabaseModel.ordinal();
        switch ($r2[$i0]) {
            case 1:
                TransactionSummaryItemType r4 = TransactionSummaryItemType.TOTAL_VALUE;
                return r4;
            case 2:
                TransactionSummaryItemType r42 = TransactionSummaryItemType.TOTAL_COUNT;
                return r42;
            case 3:
                TransactionSummaryItemType r43 = TransactionSummaryItemType.COMMISSION_TOTAL_VALUE;
                return r43;
            case 4:
                TransactionSummaryItemType r44 = TransactionSummaryItemType.PAYOUT_TOTAL_COUNT;
                return r44;
            case 5:
                TransactionSummaryItemType r45 = TransactionSummaryItemType.WALLET_BALANCE;
                return r45;
            case 6:
                TransactionSummaryItemType r46 = TransactionSummaryItemType.COMMISSION_WALLET;
                return r46;
            default:
                Throwable r5 = new NoWhenBranchMatchedException();
                Throwable r6 = r5;
                throw r6;
        }
    }
}
