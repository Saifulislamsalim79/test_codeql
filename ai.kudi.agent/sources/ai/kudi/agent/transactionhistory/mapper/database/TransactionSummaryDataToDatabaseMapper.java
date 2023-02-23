package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionSummaryTypeDatabaseModel;
import ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionSummaryDataToDatabaseMapper.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryDataToDatabaseMapper;", "", "transactionSummaryTypeUiToDatabaseMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryTypeUiToDatabaseMapper;", "(Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryTypeUiToDatabaseMapper;)V", "map", "Lai/kudi/agent/core/domain/room_entities/TransactionSummaryDatabaseModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryDataToDatabaseMapper$MapperInput;", "MapperInput", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionSummaryDataToDatabaseMapper {
    private final TransactionSummaryTypeUiToDatabaseMapper transactionSummaryTypeUiToDatabaseMapper;

    /* compiled from: TransactionSummaryDataToDatabaseMapper.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryDataToDatabaseMapper$MapperInput;", "", "summary", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "userId", "", "(Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;Ljava/lang/String;)V", "getSummary", "()Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MapperInput {
        private final TransactionSummaryItem summary;
        private final String userId;

        public MapperInput(TransactionSummaryItem transactionSummaryItem, String str) {
            Log_OC.getArray(transactionSummaryItem, "summary");
            Log_OC.getArray(str, "userId");
            this.summary = transactionSummaryItem;
            this.userId = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ MapperInput copy$default(MapperInput mapperInput, TransactionSummaryItem $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = mapperInput.summary;
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
        public final TransactionSummaryItem component1() {
            TransactionSummaryItem r1 = this.summary;
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
        public final MapperInput copy(TransactionSummaryItem transactionSummaryItem, String str) {
            Log_OC.getArray(transactionSummaryItem, "summary");
            Log_OC.getArray(str, "userId");
            MapperInput $r0 = new MapperInput(transactionSummaryItem, str);
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
                TransactionSummaryItem $r4 = this.summary;
                TransactionSummaryItem $r1 = $r3.summary;
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
        public final TransactionSummaryItem getSummary() {
            TransactionSummaryItem r1 = this.summary;
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
            TransactionSummaryItem $r1 = this.summary;
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
            $r2.append("MapperInput(summary=");
            TransactionSummaryItem $r3 = this.summary;
            $r2.append($r3);
            $r2.append(", userId=");
            String $r1 = this.userId;
            $r2.append($r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    public TransactionSummaryDataToDatabaseMapper(TransactionSummaryTypeUiToDatabaseMapper transactionSummaryTypeUiToDatabaseMapper) {
        Log_OC.getArray(transactionSummaryTypeUiToDatabaseMapper, "transactionSummaryTypeUiToDatabaseMapper");
        this.transactionSummaryTypeUiToDatabaseMapper = transactionSummaryTypeUiToDatabaseMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionSummaryDatabaseModel createOrUpdate(MapperInput mapperInput) {
        Log_OC.getArray(mapperInput, MetricTracker.Object.INPUT);
        TransactionSummaryItem $r2 = mapperInput.getSummary();
        String $r3 = $r2.getValue();
        TransactionSummaryTypeUiToDatabaseMapper $r4 = this.transactionSummaryTypeUiToDatabaseMapper;
        TransactionSummaryItem $r22 = mapperInput.getSummary();
        TransactionSummaryItemType $r5 = $r22.getType();
        TransactionSummaryTypeDatabaseModel $r6 = $r4.toDatabase($r5);
        String $r7 = mapperInput.getUserId();
        TransactionSummaryDatabaseModel $r8 = new TransactionSummaryDatabaseModel(0L, $r6, $r3, $r7, 1, null);
        return $r8;
    }
}
