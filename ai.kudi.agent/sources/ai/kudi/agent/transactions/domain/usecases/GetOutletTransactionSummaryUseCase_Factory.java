package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class GetOutletTransactionSummaryUseCase_Factory implements InterfaceC9468d<GetOutletTransactionSummaryUseCase> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<TransactionsRepository> transactionsRepositoryProvider;

    public GetOutletTransactionSummaryUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.transactionsRepositoryProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetOutletTransactionSummaryUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        GetOutletTransactionSummaryUseCase_Factory $r2 = new GetOutletTransactionSummaryUseCase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetOutletTransactionSummaryUseCase newInstance(TransactionsRepository transactionsRepository, FetchCurrentUser fetchCurrentUser) {
        GetOutletTransactionSummaryUseCase $r2 = new GetOutletTransactionSummaryUseCase(transactionsRepository, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GetOutletTransactionSummaryUseCase multiply() {
        InterfaceC11700a $r1 = this.transactionsRepositoryProvider;
        Object $r2 = $r1.get();
        TransactionsRepository $r3 = (TransactionsRepository) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        GetOutletTransactionSummaryUseCase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41109multiply() {
        GetOutletTransactionSummaryUseCase $r1 = multiply();
        return $r1;
    }
}
