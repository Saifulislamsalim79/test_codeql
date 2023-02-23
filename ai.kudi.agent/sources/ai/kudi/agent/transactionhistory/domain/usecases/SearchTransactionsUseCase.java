package ai.kudi.agent.transactionhistory.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
/* compiled from: SearchTransactionsUseCase.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/domain/usecases/SearchTransactionsUseCase;", "", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "repository", "Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "(Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactionhistory/data/source/request/GetWalletActivitiesRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SearchTransactionsUseCase {
    private final TransactionsRepository repository;
    private final RxSchedulers rxSchedulers;

    public SearchTransactionsUseCase(RxSchedulers rxSchedulers, TransactionsRepository transactionsRepository) {
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(transactionsRepository, "repository");
        this.rxSchedulers = rxSchedulers;
        this.repository = transactionsRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRepository $r2 = this.repository;
        AbstractC11688p $r3 = $r2.searchTransactions(getWalletActivitiesRequest);
        RxSchedulers $r4 = this.rxSchedulers;
        Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        RxSchedulers $r42 = this.rxSchedulers;
        Item $r52 = $r42.main();
        AbstractC11688p $r33 = $r32.R($r52);
        Log_OC.loadImage($r33, "repository.searchTransactions(request)\n            .subscribeOn(rxSchedulers.io())\n            .observeOn(rxSchedulers.main())");
        return $r33;
    }
}
