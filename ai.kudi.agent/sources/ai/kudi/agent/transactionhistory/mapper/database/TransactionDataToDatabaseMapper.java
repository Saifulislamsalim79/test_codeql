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
/* compiled from: TransactionDataToDatabaseMapper.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionDataToDatabaseMapper;", "", "transactionTypeDataToDatabaseMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionTypeDataToDatabaseMapper;", "transactionKindDataToDatabaseMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionKindDataToDatabaseMapper;", "(Lai/kudi/agent/transactionhistory/mapper/database/TransactionTypeDataToDatabaseMapper;Lai/kudi/agent/transactionhistory/mapper/database/TransactionKindDataToDatabaseMapper;)V", "map", "Lai/kudi/agent/core/domain/room_entities/TransactionDatabaseModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transactionhistory/mapper/database/TransactionDataToDatabaseMapper$MapperInput;", "MapperInput", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionDataToDatabaseMapper {
    private final TransactionKindDataToDatabaseMapper transactionKindDataToDatabaseMapper;
    private final TransactionTypeDataToDatabaseMapper transactionTypeDataToDatabaseMapper;

    /* compiled from: TransactionDataToDatabaseMapper.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionDataToDatabaseMapper$MapperInput;", "", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "userId", "", "(Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;Ljava/lang/String;)V", "getTransaction", "()Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MapperInput {
        private final TransactionDataModel transaction;
        private final String userId;

        public MapperInput(TransactionDataModel transactionDataModel, String str) {
            Log_OC.getArray(transactionDataModel, "transaction");
            Log_OC.getArray(str, "userId");
            this.transaction = transactionDataModel;
            this.userId = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ MapperInput copy$default(MapperInput mapperInput, TransactionDataModel $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = mapperInput.transaction;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = mapperInput.userId;
            }
            MapperInput $r0 = mapperInput.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionDataModel component1() {
            TransactionDataModel r1 = this.transaction;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.userId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final MapperInput copy(TransactionDataModel transactionDataModel, String str) {
            Log_OC.getArray(transactionDataModel, "transaction");
            Log_OC.getArray(str, "userId");
            MapperInput $r0 = new MapperInput(transactionDataModel, str);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof MapperInput;
            if ($z0) {
                MapperInput $r3 = (MapperInput) obj;
                TransactionDataModel $r4 = this.transaction;
                TransactionDataModel $r1 = $r3.transaction;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r5 = this.userId;
                    String $r6 = $r3.userId;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionDataModel getTransaction() {
            TransactionDataModel r1 = this.transaction;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getUserId() {
            String r1 = this.userId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            TransactionDataModel $r1 = this.transaction;
            int $i0 = $r1.hashCode();
            String $r2 = this.userId;
            int $i1 = $r2.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("MapperInput(transaction=");
            TransactionDataModel $r3 = this.transaction;
            $r2.append($r3);
            $r2.append(", userId=");
            String $r1 = this.userId;
            $r2.append($r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    public TransactionDataToDatabaseMapper(TransactionTypeDataToDatabaseMapper transactionTypeDataToDatabaseMapper, TransactionKindDataToDatabaseMapper transactionKindDataToDatabaseMapper) {
        Log_OC.getArray(transactionTypeDataToDatabaseMapper, "transactionTypeDataToDatabaseMapper");
        Log_OC.getArray(transactionKindDataToDatabaseMapper, "transactionKindDataToDatabaseMapper");
        this.transactionTypeDataToDatabaseMapper = transactionTypeDataToDatabaseMapper;
        this.transactionKindDataToDatabaseMapper = transactionKindDataToDatabaseMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionDatabaseModel createOrUpdate(MapperInput mapperInput) {
        TransactionKindDatabaseModel $r10;
        Log_OC.getArray(mapperInput, MetricTracker.Object.INPUT);
        TransactionDataModel $r2 = mapperInput.getTransaction();
        String $r3 = $r2.getId();
        TransactionTypeDataToDatabaseMapper $r4 = this.transactionTypeDataToDatabaseMapper;
        TransactionDataModel $r22 = mapperInput.getTransaction();
        TransactionType $r5 = $r22.getTransactionType();
        TransactionTypeDatabaseModel $r6 = $r4.toDatabase($r5);
        TransactionDataModel $r23 = mapperInput.getTransaction();
        Date $r7 = $r23.getDate();
        TransactionDataModel $r24 = mapperInput.getTransaction();
        String $r8 = $r24.getAmount();
        TransactionDataModel $r25 = mapperInput.getTransaction();
        TransactionKind $r9 = $r25.getKind();
        if ($r9 == null) {
            $r10 = null;
        } else {
            TransactionKindDataToDatabaseMapper $r11 = this.transactionKindDataToDatabaseMapper;
            $r10 = $r11.m38313e($r9);
        }
        TransactionDataModel $r26 = mapperInput.getTransaction();
        String $r12 = $r26.getStatus();
        TransactionDataModel $r27 = mapperInput.getTransaction();
        String $r13 = $r27.getAccountBalance();
        TransactionDataModel $r28 = mapperInput.getTransaction();
        String $r14 = $r28.getCustomerName();
        TransactionDataModel $r29 = mapperInput.getTransaction();
        String $r15 = $r29.getCustomerPhone();
        TransactionDataModel $r210 = mapperInput.getTransaction();
        String $r16 = $r210.getCustomerPictureId();
        String $r17 = mapperInput.getUserId();
        TransactionDatabaseModel $r18 = new TransactionDatabaseModel($r3, $r6, $r13, $r8, $r10, $r15, $r14, $r16, $r12, $r7, $r17);
        return $r18;
    }
}
