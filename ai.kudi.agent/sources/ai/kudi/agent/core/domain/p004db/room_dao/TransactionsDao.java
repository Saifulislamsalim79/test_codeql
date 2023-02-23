package ai.kudi.agent.core.domain.p004db.room_dao;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionsDao.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH%J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/TransactionsDao;", "", "()V", "deleteAll", "", "deleteOldUserTransactions", "userId", "", "insertAll", "transactions", "", "Lai/kudi/agent/core/domain/room_entities/TransactionDatabaseModel;", "observeAll", "Lio/reactivex/Observable;", "saveAll", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.TransactionsDao */
/* loaded from: classes.dex */
public abstract class TransactionsDao {
    protected abstract void deleteAll();

    public abstract void deleteOldUserTransactions(String str);

    protected abstract void insertAll(List list);

    public abstract AbstractC11688p observeAll(String str);

    public void saveAll(List list) {
        Log_OC.getArray(list, "transactions");
        deleteAll();
        insertAll(list);
    }
}
