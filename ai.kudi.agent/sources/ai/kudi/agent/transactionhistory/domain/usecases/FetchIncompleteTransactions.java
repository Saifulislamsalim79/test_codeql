package ai.kudi.agent.transactionhistory.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactionhistory.data.model.TransactionDataModel;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.usecases.FetchTransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
/* compiled from: FetchIncompleteTransactions.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/domain/usecases/FetchIncompleteTransactions;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "Lai/kudi/agent/transactionhistory/domain/usecases/FetchIncompleteTransactionUseCaseInput;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "repository", "Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "(Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchIncompleteTransactions implements OneInputUseCase<List<? extends TransactionDataModel>, FetchIncompleteTransactionUseCaseInput> {
    private final TransactionsRepository repository;
    private final RxSchedulers rxSchedulers;

    public FetchIncompleteTransactions(RxSchedulers rxSchedulers, TransactionsRepository transactionsRepository) {
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(transactionsRepository, "repository");
        this.rxSchedulers = rxSchedulers;
        this.repository = transactionsRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(FetchIncompleteTransactionUseCaseInput fetchIncompleteTransactionUseCaseInput) {
        Log_OC.getArray(fetchIncompleteTransactionUseCaseInput, MetricTracker.Object.INPUT);
        FetchRequest $r1 = new FetchRequest(null, 1, null);
        FetchTransactionRequest $r4 = fetchIncompleteTransactionUseCaseInput.getRequest();
        String $r5 = $r4.getType();
        $r1.setType($r5);
        FetchTransactionRequest $r42 = fetchIncompleteTransactionUseCaseInput.getRequest();
        String $r52 = $r42.getStatus();
        $r1.setStatus($r52);
        FetchTransactionRequest $r43 = fetchIncompleteTransactionUseCaseInput.getRequest();
        int $i0 = $r43.getPage();
        String $r53 = String.valueOf($i0);
        $r1.setPage($r53);
        FetchTransactionRequest $r44 = fetchIncompleteTransactionUseCaseInput.getRequest();
        String $r54 = $r44.getFrom();
        $r1.setFrom($r54);
        FetchTransactionRequest $r45 = fetchIncompleteTransactionUseCaseInput.getRequest();
        String $r55 = $r45.getTo();
        $r1.setTo($r55);
        FetchTransactionRequest $r46 = fetchIncompleteTransactionUseCaseInput.getRequest();
        String $r56 = $r46.getAgentUid();
        $r1.setAgentUid($r56);
        TransactionsRepository $r6 = this.repository;
        User $r7 = fetchIncompleteTransactionUseCaseInput.getUser();
        GetWalletActivitiesRequest $r2 = new GetWalletActivitiesRequest($r7, $r1, null, false, 12, null);
        AbstractC11688p $r8 = $r6.incompleteTransactions($r2);
        RxSchedulers $r9 = this.rxSchedulers;
        Item $r10 = $r9.setSettings();
        AbstractC11688p $r82 = $r8.h0($r10);
        RxSchedulers $r92 = this.rxSchedulers;
        Item $r102 = $r92.main();
        AbstractC11688p $r83 = $r82.R($r102);
        Log_OC.loadImage($r83, "repository.incompleteTransactions(GetWalletActivitiesRequest(input.user, request))\n            .subscribeOn(rxSchedulers.io())\n            .observeOn(rxSchedulers.main())");
        return $r83;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        FetchIncompleteTransactionUseCaseInput $r3 = (FetchIncompleteTransactionUseCaseInput) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
