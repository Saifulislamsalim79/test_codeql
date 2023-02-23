package ai.kudi.agent.transactions.data.repositories;

import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactions/data/repositories/TransactionRepositoryImpl;", "Lai/kudi/agent/transactions/data/repositories/TransactionRepository;", "remoteSource", "(Lai/kudi/agent/transactions/data/repositories/TransactionRepository;)V", "fetchTransaction", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactions/data/repositories/dto/TransactionModel;", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "findBy", "ref", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionRepositoryImpl implements TransactionRepository {
    private final TransactionRepository remoteSource;

    public TransactionRepositoryImpl(TransactionRepository transactionRepository) {
        Log_OC.getArray(transactionRepository, "remoteSource");
        this.remoteSource = transactionRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.data.repositories.TransactionRepository
    public AbstractC11688p fetchTransaction(FetchRequest fetchRequest) {
        Log_OC.getArray(fetchRequest, "fetchRequest");
        TransactionRepository $r3 = this.remoteSource;
        AbstractC11688p $r1 = $r3.fetchTransaction(fetchRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.data.repositories.TransactionRepository
    public AbstractC11688p findBy(String str) {
        Log_OC.getArray(str, "ref");
        TransactionRepository $r3 = this.remoteSource;
        AbstractC11688p $r1 = $r3.findBy(str);
        return $r1;
    }
}
