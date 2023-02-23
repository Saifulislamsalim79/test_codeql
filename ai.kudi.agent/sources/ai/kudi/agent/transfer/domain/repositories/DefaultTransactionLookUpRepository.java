package ai.kudi.agent.transfer.domain.repositories;

import ai.kudi.agent.transfer.domain.models.TransactionLookUpParam;
import ai.kudi.agent.transfer.domain.sources.remote.TransactionLookUpRemoteSource;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: DefaultTransactionLookUpRepository.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transfer/domain/repositories/DefaultTransactionLookUpRepository;", "Lai/kudi/agent/transfer/domain/repositories/TransactionLookUpRepository;", "remoteSource", "Lai/kudi/agent/transfer/domain/sources/remote/TransactionLookUpRemoteSource;", "(Lai/kudi/agent/transfer/domain/sources/remote/TransactionLookUpRemoteSource;)V", "doLookUp", "Lio/reactivex/Observable;", "Lai/kudi/agent/transfer/domain/models/TransactionLookUpResponse;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transfer/domain/models/TransactionLookUpParam;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTransactionLookUpRepository implements TransactionLookUpRepository {
    private final TransactionLookUpRemoteSource remoteSource;

    public DefaultTransactionLookUpRepository(TransactionLookUpRemoteSource transactionLookUpRemoteSource) {
        Log_OC.getArray(transactionLookUpRemoteSource, "remoteSource");
        this.remoteSource = transactionLookUpRemoteSource;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.domain.repositories.TransactionLookUpRepository
    public AbstractC11688p doLookUp(TransactionLookUpParam transactionLookUpParam) {
        Log_OC.getArray(transactionLookUpParam, MetricTracker.Object.INPUT);
        TransactionLookUpRemoteSource $r3 = this.remoteSource;
        AbstractC11688p $r1 = $r3.doLookUp(transactionLookUpParam);
        return $r1;
    }
}
