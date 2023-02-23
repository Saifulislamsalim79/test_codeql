package ai.kudi.agent.transactions.data.repositories;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionRepositoryImpl_Factory implements InterfaceC9468d<TransactionRepositoryImpl> {
    private final InterfaceC11700a<TransactionRepository> remoteSourceProvider;

    public TransactionRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a) {
        this.remoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a) {
        TransactionRepositoryImpl_Factory $r1 = new TransactionRepositoryImpl_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionRepositoryImpl newInstance(TransactionRepository transactionRepository) {
        TransactionRepositoryImpl $r1 = new TransactionRepositoryImpl(transactionRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.remoteSourceProvider;
        Object $r2 = $r1.get();
        TransactionRepository $r3 = (TransactionRepository) $r2;
        TransactionRepositoryImpl $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41089multiply() {
        TransactionRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
