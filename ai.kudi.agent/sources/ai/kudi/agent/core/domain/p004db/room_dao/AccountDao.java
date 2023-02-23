package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.BankAccount;
import kotlin.Metadata;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: AccountDao.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH'¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\r\u001a\u00020\u000eH'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00102\u0006\u0010\r\u001a\u00020\u000eH'¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/AccountDao;", "", "addAcctDetails", "Lio/reactivex/Single;", "", "", "account", "", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "([Lai/kudi/agent/core/domain/room_entities/BankAccount;)Lio/reactivex/Single;", "deleteAllAccountDetails", "Lio/reactivex/Completable;", "fetchCashOutAccounts", "agentId", "", "getAccountDetails", "Lio/reactivex/Observable;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.AccountDao */
/* loaded from: classes.dex */
public interface AccountDao {
    AbstractC11696w addAcctDetails(BankAccount... bankAccountArr);

    AbstractC11271b deleteAllAccountDetails();

    AbstractC11696w fetchCashOutAccounts(String str);

    AbstractC11688p getAccountDetails(String str);
}
