package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetOutletTransactionSummaryUseCase.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/GetOutletTransactionSummaryUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "", "transactionsRepository", "Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getTransactionsRepository", "()Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetOutletTransactionSummaryUseCase implements OneInputUseCase<List<? extends TransactionSummaryItem>, String> {
    private final FetchCurrentUser fetchCurrentUser;
    private final TransactionsRepository transactionsRepository;

    public GetOutletTransactionSummaryUseCase(TransactionsRepository transactionsRepository, FetchCurrentUser fetchCurrentUser) {
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
    public static final InterfaceC11692s m41108execute$lambda0(GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase, String str, User user) {
        Log_OC.getArray(getOutletTransactionSummaryUseCase, "this$0");
        Log_OC.getArray(str, "$input");
        Log_OC.getArray(user, "user");
        TransactionsRepository $r3 = getOutletTransactionSummaryUseCase.getTransactionsRepository();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "user.sessionId");
        GetOutletTransactionSummaryRequest $r4 = new GetOutletTransactionSummaryRequest($r5, str);
        AbstractC11688p $r6 = $r3.outletTransactionsSummary($r4);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        String $r3 = (String) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final String str) {
        Log_OC.getArray(str, MetricTracker.Object.INPUT);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetOutletTransactionSummaryUseCase $r1 = GetOutletTransactionSummaryUseCase.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = GetOutletTransactionSummaryUseCase.m41108execute$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "fetchCurrentUser.execute().flatMapObservable { user ->\n            transactionsRepository.outletTransactionsSummary(\n                GetOutletTransactionSummaryRequest(user.sessionId, input)\n            )\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r53;
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
