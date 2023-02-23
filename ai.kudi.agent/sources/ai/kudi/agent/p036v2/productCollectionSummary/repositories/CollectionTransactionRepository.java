package ai.kudi.agent.p036v2.productCollectionSummary.repositories;

import ai.kudi.agent.p036v2.common.domain.package_3.TransactionRequestBody;
import ai.kudi.agent.p036v2.productCollectionSummary.sources.remoteSources.CollectionTransactionRemoteSource;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: CollectionTransactionRepository.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productCollectionSummary/repositories/CollectionTransactionRepository;", "", TransactionField.TRANSACTION_CHANNEL, "Lai/kudi/agent/v2/productCollectionSummary/sources/remoteSources/CollectionTransactionRemoteSource;", "(Lai/kudi/agent/v2/productCollectionSummary/sources/remoteSources/CollectionTransactionRemoteSource;)V", "makePayment", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/CollectionTransactionPaymentResponse;", "param", "Lai/kudi/agent/v2/common/domain/dto/TransactionRequestBody;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.repositories.CollectionTransactionRepository */
/* loaded from: classes.dex */
public final class CollectionTransactionRepository {
    private final CollectionTransactionRemoteSource source;

    public CollectionTransactionRepository(CollectionTransactionRemoteSource collectionTransactionRemoteSource) {
        Log_OC.getArray(collectionTransactionRemoteSource, TransactionField.TRANSACTION_CHANNEL);
        this.source = collectionTransactionRemoteSource;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p makePayment(TransactionRequestBody transactionRequestBody) {
        Log_OC.getArray(transactionRequestBody, "param");
        CollectionTransactionRemoteSource $r3 = this.source;
        AbstractC11688p $r1 = $r3.transactCollection(transactionRequestBody);
        return $r1;
    }
}
