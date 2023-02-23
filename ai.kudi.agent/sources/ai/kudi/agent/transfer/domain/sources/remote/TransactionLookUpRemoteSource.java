package ai.kudi.agent.transfer.domain.sources.remote;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TransactionApi;
import ai.kudi.agent.transfer.domain.models.TransactionLookUpParam;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionLookUpRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transfer/domain/sources/remote/TransactionLookUpRemoteSource;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "doLookUp", "Lio/reactivex/Observable;", "Lai/kudi/agent/transfer/domain/models/TransactionLookUpResponse;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transfer/domain/models/TransactionLookUpParam;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionLookUpRemoteSource {
    private final NetworkService networkService;

    public TransactionLookUpRemoteSource(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p doLookUp(TransactionLookUpParam transactionLookUpParam) {
        Log_OC.getArray(transactionLookUpParam, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        TransactionApi $r3 = $r2.getTransactionApi();
        String $r4 = transactionLookUpParam.getSessionId();
        String $r5 = transactionLookUpParam.getType();
        String $r6 = transactionLookUpParam.getSearchTerm();
        AbstractC11688p $r7 = $r3.doTransactionLookUp($r4, $r5, $r6);
        return $r7;
    }
}
