package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDatabaseToDataMapper;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvidesTransactionsLocalSourceFactory implements InterfaceC9468d<TransactionsLocalSource> {
    private final RepositoryModule module;
    private final InterfaceC11700a<CoreAppDatabase> roomDatabaseProvider;
    private final InterfaceC11700a<TransactionDataToDatabaseMapper> transactionDataToDatabaseMapperProvider;
    private final InterfaceC11700a<TransactionDatabaseToDataMapper> transactionDatabaseToDataMapperProvider;

    public RepositoryModule_ProvidesTransactionsLocalSourceFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.module = repositoryModule;
        this.roomDatabaseProvider = interfaceC11700a;
        this.transactionDataToDatabaseMapperProvider = interfaceC11700a2;
        this.transactionDatabaseToDataMapperProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvidesTransactionsLocalSourceFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        RepositoryModule_ProvidesTransactionsLocalSourceFactory $r4 = new RepositoryModule_ProvidesTransactionsLocalSourceFactory(repositoryModule, interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsLocalSource providesTransactionsLocalSource(RepositoryModule repositoryModule, CoreAppDatabase coreAppDatabase, TransactionDataToDatabaseMapper transactionDataToDatabaseMapper, TransactionDatabaseToDataMapper transactionDatabaseToDataMapper) {
        TransactionsLocalSource $r3 = repositoryModule.providesTransactionsLocalSource(coreAppDatabase, transactionDataToDatabaseMapper, transactionDatabaseToDataMapper);
        C9473g.m14647e($r3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsLocalSource remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.roomDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        InterfaceC11700a $r22 = this.transactionDataToDatabaseMapperProvider;
        Object $r32 = $r22.get();
        TransactionDataToDatabaseMapper $r5 = (TransactionDataToDatabaseMapper) $r32;
        InterfaceC11700a $r23 = this.transactionDatabaseToDataMapperProvider;
        Object $r33 = $r23.get();
        TransactionDatabaseToDataMapper $r6 = (TransactionDatabaseToDataMapper) $r33;
        TransactionsLocalSource $r7 = providesTransactionsLocalSource($r1, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41491remainder() {
        TransactionsLocalSource $r1 = remainder();
        return $r1;
    }
}
