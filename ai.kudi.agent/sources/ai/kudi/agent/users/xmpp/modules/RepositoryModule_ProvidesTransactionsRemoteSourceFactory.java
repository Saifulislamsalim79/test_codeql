package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource;
import ai.kudi.agent.transactionhistory.mapper.IncompleteTransactionApiToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.SearchWalletActivityResponseToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvidesTransactionsRemoteSourceFactory implements InterfaceC9468d<TransactionsRemoteSource> {
    private final InterfaceC11700a<IncompleteTransactionApiToTransactionDataMapper> incompleteTransactionApiToTransactionDataMapperProvider;
    private final RepositoryModule module;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<SearchWalletActivityResponseToTransactionDataMapper> searchWalletActivityResponseToTransactionDataMapperProvider;
    private final InterfaceC11700a<TransactionApiToDataMapper> transactionApiToDataMapperProvider;
    private final InterfaceC11700a<WalletActivityApiToTransactionDataMapper> walletActivityApiToTransactionDataMapperProvider;

    public RepositoryModule_ProvidesTransactionsRemoteSourceFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.module = repositoryModule;
        this.networkServiceProvider = interfaceC11700a;
        this.incompleteTransactionApiToTransactionDataMapperProvider = interfaceC11700a2;
        this.walletActivityApiToTransactionDataMapperProvider = interfaceC11700a3;
        this.searchWalletActivityResponseToTransactionDataMapperProvider = interfaceC11700a4;
        this.transactionApiToDataMapperProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvidesTransactionsRemoteSourceFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        RepositoryModule_ProvidesTransactionsRemoteSourceFactory $r6 = new RepositoryModule_ProvidesTransactionsRemoteSourceFactory(repositoryModule, interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsRemoteSource providesTransactionsRemoteSource(RepositoryModule repositoryModule, NetworkService networkService, IncompleteTransactionApiToTransactionDataMapper incompleteTransactionApiToTransactionDataMapper, WalletActivityApiToTransactionDataMapper walletActivityApiToTransactionDataMapper, SearchWalletActivityResponseToTransactionDataMapper searchWalletActivityResponseToTransactionDataMapper, TransactionApiToDataMapper transactionApiToDataMapper) {
        TransactionsRemoteSource $r5 = repositoryModule.providesTransactionsRemoteSource(networkService, incompleteTransactionApiToTransactionDataMapper, walletActivityApiToTransactionDataMapper, searchWalletActivityResponseToTransactionDataMapper, transactionApiToDataMapper);
        C9473g.m14647e($r5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsRemoteSource remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.networkServiceProvider;
        Object $r3 = $r2.get();
        NetworkService $r4 = (NetworkService) $r3;
        InterfaceC11700a $r22 = this.incompleteTransactionApiToTransactionDataMapperProvider;
        Object $r32 = $r22.get();
        IncompleteTransactionApiToTransactionDataMapper $r5 = (IncompleteTransactionApiToTransactionDataMapper) $r32;
        InterfaceC11700a $r23 = this.walletActivityApiToTransactionDataMapperProvider;
        Object $r33 = $r23.get();
        WalletActivityApiToTransactionDataMapper $r6 = (WalletActivityApiToTransactionDataMapper) $r33;
        InterfaceC11700a $r24 = this.searchWalletActivityResponseToTransactionDataMapperProvider;
        Object $r34 = $r24.get();
        SearchWalletActivityResponseToTransactionDataMapper searchWalletActivityResponseToTransactionDataMapper = (SearchWalletActivityResponseToTransactionDataMapper) $r34;
        InterfaceC11700a $r25 = this.transactionApiToDataMapperProvider;
        Object $r35 = $r25.get();
        TransactionsRemoteSource $r9 = providesTransactionsRemoteSource($r1, $r4, $r5, $r6, searchWalletActivityResponseToTransactionDataMapper, (TransactionApiToDataMapper) $r35);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41492remainder() {
        TransactionsRemoteSource $r1 = remainder();
        return $r1;
    }
}
