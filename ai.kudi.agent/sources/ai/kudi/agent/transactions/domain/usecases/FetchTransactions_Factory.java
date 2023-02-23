package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchTransactions_Factory implements InterfaceC9468d<FetchTransactions> {
    private final InterfaceC11700a<TransactionRepository> transactionRepoProvider;

    public FetchTransactions_Factory(InterfaceC11700a interfaceC11700a) {
        this.transactionRepoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchTransactions_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchTransactions_Factory $r1 = new FetchTransactions_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchTransactions newInstance(TransactionRepository transactionRepository) {
        FetchTransactions $r1 = new FetchTransactions(transactionRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchTransactions multiply() {
        InterfaceC11700a $r1 = this.transactionRepoProvider;
        Object $r2 = $r1.get();
        TransactionRepository $r3 = (TransactionRepository) $r2;
        FetchTransactions $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41104multiply() {
        FetchTransactions $r1 = multiply();
        return $r1;
    }
}
