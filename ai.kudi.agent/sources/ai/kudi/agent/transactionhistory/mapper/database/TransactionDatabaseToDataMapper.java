package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionKindDatabaseModel;
import ai.kudi.agent.core.domain.p004db.model.TransactionTypeDatabaseModel;
import ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionDataModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionDatabaseToDataMapper.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionDatabaseToDataMapper;", "", "transactionTypeDatabaseToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionTypeDatabaseToDataMapper;", "transactionKindDatabaseToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionKindDatabaseToDataMapper;", "(Lai/kudi/agent/transactionhistory/mapper/database/TransactionTypeDatabaseToDataMapper;Lai/kudi/agent/transactionhistory/mapper/database/TransactionKindDatabaseToDataMapper;)V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/core/domain/room_entities/TransactionDatabaseModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionDatabaseToDataMapper {
    private final TransactionKindDatabaseToDataMapper transactionKindDatabaseToDataMapper;
    private final TransactionTypeDatabaseToDataMapper transactionTypeDatabaseToDataMapper;

    public TransactionDatabaseToDataMapper(TransactionTypeDatabaseToDataMapper transactionTypeDatabaseToDataMapper, TransactionKindDatabaseToDataMapper transactionKindDatabaseToDataMapper) {
        Log_OC.getArray(transactionTypeDatabaseToDataMapper, "transactionTypeDatabaseToDataMapper");
        Log_OC.getArray(transactionKindDatabaseToDataMapper, "transactionKindDatabaseToDataMapper");
        this.transactionTypeDatabaseToDataMapper = transactionTypeDatabaseToDataMapper;
        this.transactionKindDatabaseToDataMapper = transactionKindDatabaseToDataMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionDataModel getPlaylist(TransactionDatabaseModel transactionDatabaseModel) {
        TransactionKind $r9;
        Log_OC.getArray(transactionDatabaseModel, MetricTracker.Object.INPUT);
        String $r2 = transactionDatabaseModel.getId();
        TransactionTypeDatabaseToDataMapper $r3 = this.transactionTypeDatabaseToDataMapper;
        TransactionTypeDatabaseModel $r4 = transactionDatabaseModel.getTransactionType();
        TransactionType $r5 = $r3.toUi($r4);
        Date $r6 = transactionDatabaseModel.getDate();
        String $r7 = transactionDatabaseModel.getAmount();
        TransactionKindDatabaseModel $r8 = transactionDatabaseModel.getKind();
        if ($r8 == null) {
            $r9 = null;
        } else {
            TransactionKindDatabaseToDataMapper $r10 = this.transactionKindDatabaseToDataMapper;
            $r9 = $r10.parse($r8);
        }
        String $r11 = transactionDatabaseModel.getStatus();
        String $r12 = transactionDatabaseModel.getAccountBalance();
        String $r13 = transactionDatabaseModel.getCustomerName();
        String $r14 = transactionDatabaseModel.getCustomerPhone();
        String $r15 = transactionDatabaseModel.getCustomerPictureId();
        TransactionDataModel $r16 = new TransactionDataModel($r2, $r5, $r12, $r7, $r9, $r14, $r13, $r15, $r11, $r6);
        return $r16;
    }
}
