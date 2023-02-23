package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvidesTransactionRemoteDataSourceFactory implements InterfaceC9468d<TransactionRepository> {
    private final RepositoryModule module;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public RepositoryModule_ProvidesTransactionRemoteDataSourceFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.module = repositoryModule;
        this.userRepoProvider = interfaceC11700a;
        this.networkServiceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvidesTransactionRemoteDataSourceFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RepositoryModule_ProvidesTransactionRemoteDataSourceFactory $r3 = new RepositoryModule_ProvidesTransactionRemoteDataSourceFactory(repositoryModule, interfaceC11700a, interfaceC11700a2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionRepository providesTransactionRemoteDataSource(RepositoryModule repositoryModule, UserRepository userRepository, NetworkService networkService) {
        TransactionRepository $r2 = repositoryModule.providesTransactionRemoteDataSource(userRepository, networkService);
        C9473g.m14647e($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.userRepoProvider;
        Object $r3 = $r2.get();
        UserRepository $r4 = (UserRepository) $r3;
        InterfaceC11700a $r22 = this.networkServiceProvider;
        Object $r32 = $r22.get();
        NetworkService $r5 = (NetworkService) $r32;
        TransactionRepository $r6 = providesTransactionRemoteDataSource($r1, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41490remainder() {
        TransactionRepository $r1 = remainder();
        return $r1;
    }
}
