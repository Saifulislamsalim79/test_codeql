package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.transactionhistory.data.source.TransactionsSummaryLocalSource;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryDatabaseToDataMapper;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory implements InterfaceC9468d<TransactionsSummaryLocalSource> {
    private final RepositoryModule module;
    private final InterfaceC11700a<CoreAppDatabase> roomDatabaseProvider;
    private final InterfaceC11700a<TransactionSummaryDataToDatabaseMapper> transactionSummaryDataToDatabaseMapperProvider;
    private final InterfaceC11700a<TransactionSummaryDatabaseToDataMapper> transactionSummaryDatabaseToDataMapperProvider;

    public RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.module = repositoryModule;
        this.roomDatabaseProvider = interfaceC11700a;
        this.transactionSummaryDataToDatabaseMapperProvider = interfaceC11700a2;
        this.transactionSummaryDatabaseToDataMapperProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory $r4 = new RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory(repositoryModule, interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsSummaryLocalSource providesTransactionsSummaryLocalSource(RepositoryModule repositoryModule, CoreAppDatabase coreAppDatabase, TransactionSummaryDataToDatabaseMapper transactionSummaryDataToDatabaseMapper, TransactionSummaryDatabaseToDataMapper transactionSummaryDatabaseToDataMapper) {
        TransactionsSummaryLocalSource $r3 = repositoryModule.providesTransactionsSummaryLocalSource(coreAppDatabase, transactionSummaryDataToDatabaseMapper, transactionSummaryDatabaseToDataMapper);
        C9473g.m14647e($r3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsSummaryLocalSource remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.roomDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        InterfaceC11700a $r22 = this.transactionSummaryDataToDatabaseMapperProvider;
        Object $r32 = $r22.get();
        TransactionSummaryDataToDatabaseMapper $r5 = (TransactionSummaryDataToDatabaseMapper) $r32;
        InterfaceC11700a $r23 = this.transactionSummaryDatabaseToDataMapperProvider;
        Object $r33 = $r23.get();
        TransactionSummaryDatabaseToDataMapper $r6 = (TransactionSummaryDatabaseToDataMapper) $r33;
        TransactionsSummaryLocalSource $r7 = providesTransactionsSummaryLocalSource($r1, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41493remainder() {
        TransactionsSummaryLocalSource $r1 = remainder();
        return $r1;
    }
}
