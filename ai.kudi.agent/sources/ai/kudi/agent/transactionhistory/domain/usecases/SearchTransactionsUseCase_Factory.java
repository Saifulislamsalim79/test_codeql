package ai.kudi.agent.transactionhistory.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SearchTransactionsUseCase_Factory implements InterfaceC9468d<SearchTransactionsUseCase> {
    private final InterfaceC11700a<TransactionsRepository> repositoryProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public SearchTransactionsUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.rxSchedulersProvider = interfaceC11700a;
        this.repositoryProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SearchTransactionsUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SearchTransactionsUseCase_Factory $r2 = new SearchTransactionsUseCase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SearchTransactionsUseCase newInstance(RxSchedulers rxSchedulers, TransactionsRepository transactionsRepository) {
        SearchTransactionsUseCase $r2 = new SearchTransactionsUseCase(rxSchedulers, transactionsRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SearchTransactionsUseCase multiply() {
        InterfaceC11700a $r1 = this.rxSchedulersProvider;
        Object $r2 = $r1.get();
        RxSchedulers $r3 = (RxSchedulers) $r2;
        InterfaceC11700a $r12 = this.repositoryProvider;
        Object $r22 = $r12.get();
        TransactionsRepository $r4 = (TransactionsRepository) $r22;
        SearchTransactionsUseCase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41017multiply() {
        SearchTransactionsUseCase $r1 = multiply();
        return $r1;
    }
}
