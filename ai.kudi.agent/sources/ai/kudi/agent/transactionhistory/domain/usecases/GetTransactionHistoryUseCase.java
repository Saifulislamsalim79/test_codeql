package ai.kudi.agent.transactionhistory.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactionhistory.data.model.TransactionDataModel;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
/* compiled from: GetTransactionHistoryUseCase.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/domain/usecases/GetTransactionHistoryUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "Lai/kudi/agent/transactionhistory/data/source/request/GetWalletActivitiesRequest;", "repository", "Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "schedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetTransactionHistoryUseCase implements OneInputUseCase<List<? extends TransactionDataModel>, GetWalletActivitiesRequest> {
    private final TransactionsRepository repository;
    private final RxSchedulers schedulers;

    public GetTransactionHistoryUseCase(TransactionsRepository transactionsRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(transactionsRepository, "repository");
        Log_OC.getArray(rxSchedulers, "schedulers");
        this.repository = transactionsRepository;
        this.schedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, MetricTracker.Object.INPUT);
        TransactionsRepository $r2 = this.repository;
        AbstractC11688p $r3 = $r2.transactions(getWalletActivitiesRequest);
        RxSchedulers $r4 = this.schedulers;
        Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        RxSchedulers $r42 = this.schedulers;
        Item $r52 = $r42.main();
        AbstractC11688p $r33 = $r32.R($r52);
        Log_OC.loadImage($r33, "repository\n            .transactions(input)\n            .subscribeOn(schedulers.io())\n            .observeOn(schedulers.main())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        GetWalletActivitiesRequest $r3 = (GetWalletActivitiesRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
