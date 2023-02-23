package ai.kudi.agent.transfer.domain.repositories;

import ai.kudi.agent.transfer.domain.models.TransactionLookUpParam;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionLookUpRepository.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transfer/domain/repositories/TransactionLookUpRepository;", "", "doLookUp", "Lio/reactivex/Observable;", "Lai/kudi/agent/transfer/domain/models/TransactionLookUpResponse;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transfer/domain/models/TransactionLookUpParam;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionLookUpRepository {
    AbstractC11688p doLookUp(TransactionLookUpParam transactionLookUpParam);
}
