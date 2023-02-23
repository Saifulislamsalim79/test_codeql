package ai.kudi.agent.transactionhistory.data.repository;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsSummaryLocalSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionsRepository_Factory implements InterfaceC9468d<TransactionsRepository> {
    private final InterfaceC11700a<RxSchedulers> schedulersProvider;
    private final InterfaceC11700a<TransactionsLocalSource> transactionsLocalSourceProvider;
    private final InterfaceC11700a<TransactionsRemoteSource> transactionsRemoteSourceProvider;
    private final InterfaceC11700a<TransactionsSummaryLocalSource> transactionsSummaryLocalDataSourceProvider;

    public TransactionsRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.transactionsRemoteSourceProvider = interfaceC11700a;
        this.transactionsLocalSourceProvider = interfaceC11700a2;
        this.transactionsSummaryLocalDataSourceProvider = interfaceC11700a3;
        this.schedulersProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        TransactionsRepository_Factory $r4 = new TransactionsRepository_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsRepository newInstance(TransactionsRemoteSource transactionsRemoteSource, TransactionsLocalSource transactionsLocalSource, TransactionsSummaryLocalSource transactionsSummaryLocalSource, RxSchedulers rxSchedulers) {
        TransactionsRepository $r4 = new TransactionsRepository(transactionsRemoteSource, transactionsLocalSource, transactionsSummaryLocalSource, rxSchedulers);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsRepository multiply() {
        InterfaceC11700a $r1 = this.transactionsRemoteSourceProvider;
        Object $r2 = $r1.get();
        TransactionsRemoteSource $r3 = (TransactionsRemoteSource) $r2;
        InterfaceC11700a $r12 = this.transactionsLocalSourceProvider;
        Object $r22 = $r12.get();
        TransactionsLocalSource $r4 = (TransactionsLocalSource) $r22;
        InterfaceC11700a $r13 = this.transactionsSummaryLocalDataSourceProvider;
        Object $r23 = $r13.get();
        TransactionsSummaryLocalSource $r5 = (TransactionsSummaryLocalSource) $r23;
        InterfaceC11700a $r14 = this.schedulersProvider;
        Object $r24 = $r14.get();
        RxSchedulers $r6 = (RxSchedulers) $r24;
        TransactionsRepository $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40997multiply() {
        TransactionsRepository $r1 = multiply();
        return $r1;
    }
}
