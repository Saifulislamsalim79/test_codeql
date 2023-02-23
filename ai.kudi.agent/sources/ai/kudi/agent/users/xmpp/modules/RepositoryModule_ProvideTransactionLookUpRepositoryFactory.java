package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.transfer.domain.repositories.DefaultTransactionLookUpRepository;
import ai.kudi.agent.transfer.domain.repositories.TransactionLookUpRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvideTransactionLookUpRepositoryFactory implements InterfaceC9468d<TransactionLookUpRepository> {
    private final InterfaceC11700a<DefaultTransactionLookUpRepository> implProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideTransactionLookUpRepositoryFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        this.module = repositoryModule;
        this.implProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvideTransactionLookUpRepositoryFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        RepositoryModule_ProvideTransactionLookUpRepositoryFactory $r2 = new RepositoryModule_ProvideTransactionLookUpRepositoryFactory(repositoryModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionLookUpRepository provideTransactionLookUpRepository(RepositoryModule repositoryModule, DefaultTransactionLookUpRepository defaultTransactionLookUpRepository) {
        TransactionLookUpRepository $r1 = repositoryModule.provideTransactionLookUpRepository(defaultTransactionLookUpRepository);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionLookUpRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.implProvider;
        Object $r3 = $r2.get();
        DefaultTransactionLookUpRepository $r4 = (DefaultTransactionLookUpRepository) $r3;
        TransactionLookUpRepository $r5 = provideTransactionLookUpRepository($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41488remainder() {
        TransactionLookUpRepository $r1 = remainder();
        return $r1;
    }
}
