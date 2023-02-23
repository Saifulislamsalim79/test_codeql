package ai.kudi.agent.transactionhistory.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class GetTransactionHistoryUseCase_Factory implements InterfaceC9468d<GetTransactionHistoryUseCase> {
    private final InterfaceC11700a<TransactionsRepository> repositoryProvider;
    private final InterfaceC11700a<RxSchedulers> schedulersProvider;

    public GetTransactionHistoryUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.repositoryProvider = interfaceC11700a;
        this.schedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetTransactionHistoryUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        GetTransactionHistoryUseCase_Factory $r2 = new GetTransactionHistoryUseCase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetTransactionHistoryUseCase newInstance(TransactionsRepository transactionsRepository, RxSchedulers rxSchedulers) {
        GetTransactionHistoryUseCase $r2 = new GetTransactionHistoryUseCase(transactionsRepository, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GetTransactionHistoryUseCase multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        TransactionsRepository $r3 = (TransactionsRepository) $r2;
        InterfaceC11700a $r12 = this.schedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        GetTransactionHistoryUseCase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41016multiply() {
        GetTransactionHistoryUseCase $r1 = multiply();
        return $r1;
    }
}
