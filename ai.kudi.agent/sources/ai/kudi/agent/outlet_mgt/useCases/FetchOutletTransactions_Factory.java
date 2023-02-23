package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchOutletTransactions_Factory implements InterfaceC9468d<FetchOutletTransactions> {
    private final InterfaceC11700a<TransactionsRepository> repositoryProvider;

    public FetchOutletTransactions_Factory(InterfaceC11700a interfaceC11700a) {
        this.repositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchOutletTransactions_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchOutletTransactions_Factory $r1 = new FetchOutletTransactions_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchOutletTransactions newInstance(TransactionsRepository transactionsRepository) {
        FetchOutletTransactions $r1 = new FetchOutletTransactions(transactionsRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchOutletTransactions multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        TransactionsRepository $r3 = (TransactionsRepository) $r2;
        FetchOutletTransactions $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39907multiply() {
        FetchOutletTransactions $r1 = multiply();
        return $r1;
    }
}
