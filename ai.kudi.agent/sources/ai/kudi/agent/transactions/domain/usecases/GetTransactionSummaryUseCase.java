package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.request.GetTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetTransactionSummaryUseCase.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/GetTransactionSummaryUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "Lai/kudi/agent/transactions/domain/usecases/GetTransactionSummaryUseCaseInput;", "transactionsRepository", "Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getTransactionsRepository", "()Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetTransactionSummaryUseCase implements OneInputUseCase<List<? extends TransactionSummaryItem>, GetTransactionSummaryUseCaseInput> {
    private final FetchCurrentUser fetchCurrentUser;
    private final TransactionsRepository transactionsRepository;

    public GetTransactionSummaryUseCase(TransactionsRepository transactionsRepository, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(transactionsRepository, "transactionsRepository");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.transactionsRepository = transactionsRepository;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41110execute$lambda0(GetTransactionSummaryUseCase getTransactionSummaryUseCase, GetTransactionSummaryUseCaseInput getTransactionSummaryUseCaseInput, User user) {
        Log_OC.getArray(getTransactionSummaryUseCase, "this$0");
        Log_OC.getArray(getTransactionSummaryUseCaseInput, "$input");
        Log_OC.getArray(user, "user");
        TransactionsRepository $r4 = getTransactionSummaryUseCase.getTransactionsRepository();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "user.sessionId");
        String $r6 = user.getId();
        Log_OC.loadImage($r6, "user.id");
        FilteredDate $r7 = getTransactionSummaryUseCaseInput.getFilteredDate();
        Date $r8 = $r7.getFrom();
        String $r9 = DateExtKt.convertDateToGivenFormat($r8, "yyyy-MM-dd HH:mm:ss");
        FilteredDate $r72 = getTransactionSummaryUseCaseInput.getFilteredDate();
        Date $r82 = $r72.getTo();
        String $r10 = DateExtKt.convertDateToGivenFormat($r82, "yyyy-MM-dd HH:mm:ss");
        boolean $z0 = getTransactionSummaryUseCaseInput.isCachingEnabled();
        GetTransactionSummaryRequest $r1 = new GetTransactionSummaryRequest($r5, $r6, $r9, $r10, $z0);
        AbstractC11688p $r11 = $r4.transactionsSummary($r1);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final GetTransactionSummaryUseCaseInput getTransactionSummaryUseCaseInput) {
        Log_OC.getArray(getTransactionSummaryUseCaseInput, MetricTracker.Object.INPUT);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetTransactionSummaryUseCase $r1 = GetTransactionSummaryUseCase.this;
                GetTransactionSummaryUseCaseInput $r22 = getTransactionSummaryUseCaseInput;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = GetTransactionSummaryUseCase.m41110execute$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "fetchCurrentUser.execute().flatMapObservable { user ->\n            transactionsRepository.transactionsSummary(\n                GetTransactionSummaryRequest(\n                    sessionId = user.sessionId,\n                    userId = user.id,\n                    fromDate = convertDateToGivenFormat(input.filteredDate.from, FILTER_DATE_FORMAT),\n                    toDate = convertDateToGivenFormat(input.filteredDate.to, FILTER_DATE_FORMAT),\n                    isCachingEnabled = input.isCachingEnabled\n                )\n            )\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        GetTransactionSummaryUseCaseInput $r3 = (GetTransactionSummaryUseCaseInput) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionsRepository getTransactionsRepository() {
        TransactionsRepository r1 = this.transactionsRepository;
        return r1;
    }
}
