package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionSummaryTypeDatabaseModel;
import ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionSummaryDatabaseToDataMapper.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryDatabaseToDataMapper;", "", "transactionSummaryTypeDatabaseToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryTypeDatabaseToUiMapper;", "(Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryTypeDatabaseToUiMapper;)V", "map", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", MetricTracker.Object.INPUT, "Lai/kudi/agent/core/domain/room_entities/TransactionSummaryDatabaseModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionSummaryDatabaseToDataMapper {
    private final TransactionSummaryTypeDatabaseToUiMapper transactionSummaryTypeDatabaseToUiMapper;

    public TransactionSummaryDatabaseToDataMapper(TransactionSummaryTypeDatabaseToUiMapper transactionSummaryTypeDatabaseToUiMapper) {
        Log_OC.getArray(transactionSummaryTypeDatabaseToUiMapper, "transactionSummaryTypeDatabaseToUiMapper");
        this.transactionSummaryTypeDatabaseToUiMapper = transactionSummaryTypeDatabaseToUiMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionSummaryItem getPlaylist(TransactionSummaryDatabaseModel transactionSummaryDatabaseModel) {
        Log_OC.getArray(transactionSummaryDatabaseModel, MetricTracker.Object.INPUT);
        String $r4 = transactionSummaryDatabaseModel.getValue();
        TransactionSummaryTypeDatabaseToUiMapper $r1 = this.transactionSummaryTypeDatabaseToUiMapper;
        TransactionSummaryTypeDatabaseModel $r5 = transactionSummaryDatabaseModel.getType();
        TransactionSummaryItemType $r6 = $r1.start($r5);
        TransactionSummaryItem $r3 = new TransactionSummaryItem($r4, $r6);
        return $r3;
    }
}
