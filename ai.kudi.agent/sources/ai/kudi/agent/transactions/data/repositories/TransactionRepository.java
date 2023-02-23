package ai.kudi.agent.transactions.data.repositories;

import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionRepository.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactions/data/repositories/TransactionRepository;", "", "fetchTransaction", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactions/data/repositories/dto/TransactionModel;", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "findBy", "ref", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionRepository {
    AbstractC11688p fetchTransaction(FetchRequest fetchRequest);

    AbstractC11688p findBy(String str);
}
