package ai.kudi.agent.transfer.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transfer.domain.models.TransactionLookUpParam;
import ai.kudi.agent.transfer.domain.models.TransactionLookUpResponse;
import ai.kudi.agent.transfer.domain.repositories.TransactionLookUpRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: TransactionLookUpUsecase.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/transfer/domain/usecases/TransactionLookUpUsecase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/transfer/domain/models/TransactionLookUpResponse;", "Lai/kudi/agent/transfer/domain/models/TransactionLookUpParam;", "repository", "Lai/kudi/agent/transfer/domain/repositories/TransactionLookUpRepository;", "(Lai/kudi/agent/transfer/domain/repositories/TransactionLookUpRepository;)V", "getRepository", "()Lai/kudi/agent/transfer/domain/repositories/TransactionLookUpRepository;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionLookUpUsecase implements OneInputUseCase<TransactionLookUpResponse, TransactionLookUpParam> {
    private final TransactionLookUpRepository repository;

    public TransactionLookUpUsecase(TransactionLookUpRepository transactionLookUpRepository) {
        Log_OC.getArray(transactionLookUpRepository, "repository");
        this.repository = transactionLookUpRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(TransactionLookUpParam transactionLookUpParam) {
        Log_OC.getArray(transactionLookUpParam, MetricTracker.Object.INPUT);
        TransactionLookUpRepository $r2 = this.repository;
        AbstractC11688p $r3 = $r2.doLookUp(transactionLookUpParam);
        Item $r4 = ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "repository.doLookUp(input).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        TransactionLookUpParam $r3 = (TransactionLookUpParam) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionLookUpRepository getRepository() {
        TransactionLookUpRepository r1 = this.repository;
        return r1;
    }
}
