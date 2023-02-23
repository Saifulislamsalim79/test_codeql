package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvideDefaultTransactionRepositoryFactory implements InterfaceC9468d<TransactionRepository> {
    private final RepositoryModule module;
    private final InterfaceC11700a<TransactionRepository> remoteProvider;

    public RepositoryModule_ProvideDefaultTransactionRepositoryFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        this.module = repositoryModule;
        this.remoteProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvideDefaultTransactionRepositoryFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        RepositoryModule_ProvideDefaultTransactionRepositoryFactory $r2 = new RepositoryModule_ProvideDefaultTransactionRepositoryFactory(repositoryModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionRepository provideDefaultTransactionRepository(RepositoryModule repositoryModule, TransactionRepository transactionRepository) {
        TransactionRepository $r0 = repositoryModule.provideDefaultTransactionRepository(transactionRepository);
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.remoteProvider;
        Object $r3 = $r2.get();
        TransactionRepository $r4 = (TransactionRepository) $r3;
        return provideDefaultTransactionRepository($r1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41487remainder() {
        TransactionRepository $r1 = remainder();
        return $r1;
    }
}
