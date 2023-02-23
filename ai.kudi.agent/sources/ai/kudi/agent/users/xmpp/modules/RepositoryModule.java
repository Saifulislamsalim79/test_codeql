package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.bills.data.AnnouncementRepository;
import ai.kudi.agent.bills.data.AnnouncementRepositoryImpl;
import ai.kudi.agent.bills.data.source.AnnouncementsDataSource;
import ai.kudi.agent.bills.data.source.LocalAnnouncementsDataSource;
import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.payments.data.repositories.PaymentMethodRepository;
import ai.kudi.agent.payments.data.repositories.RoomPaymentMethodRepository;
import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.product.repository.BillerRepositoryImpl;
import ai.kudi.agent.product.repository.LocalBillerRepositoryImpl;
import ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl;
import ai.kudi.agent.transactionhistory.data.source.TransactionsLocalDataSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsSummaryLocalDataSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsSummaryLocalSource;
import ai.kudi.agent.transactionhistory.mapper.IncompleteTransactionApiToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.SearchWalletActivityResponseToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDatabaseToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryDatabaseToDataMapper;
import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import ai.kudi.agent.transactions.data.repositories.TransactionRepositoryImpl;
import ai.kudi.agent.transactions.data.sources.remote.TransactionRemoteSource;
import ai.kudi.agent.transfer.domain.repositories.DefaultTransactionLookUpRepository;
import ai.kudi.agent.transfer.domain.repositories.TransactionLookUpRepository;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.RoomUserRepository;
import ai.kudi.agent.users.data.repositories.UserRepository;
import android.content.SharedPreferences;
import com.google.firebase.database.C5615f;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: RepositoryModule.kt */
@Metadata(m10422d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J$\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0007J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J \u0010$\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J0\u0010*\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0007J \u00104\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0007J\u0018\u0010:\u001a\u00020#2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010;\u001a\u00020<H\u0007¨\u0006="}, m10421d2 = {"Lai/kudi/agent/users/di/modules/RepositoryModule;", "", "()V", "provideAnnouncementDataSource", "Lai/kudi/agent/bills/data/source/AnnouncementsDataSource;", "roomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "provideAnnouncementRepo", "Lai/kudi/agent/bills/data/AnnouncementRepository;", "announcementsDataSource", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "provideBillerLocalSource", "Lai/kudi/agent/product/repository/BillerRepository;", "provideBillerRemoteSource", "Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;", "provideBillerRepo", "localdb", "sharedPreferences", "Landroid/content/SharedPreferences;", "remotedb", "provideDefaultTransactionRepository", "Lai/kudi/agent/transactions/data/repositories/TransactionRepository;", "remote", "provideTransactionLookUpRepository", "Lai/kudi/agent/transfer/domain/repositories/TransactionLookUpRepository;", "impl", "Lai/kudi/agent/transfer/domain/repositories/DefaultTransactionLookUpRepository;", "providesPaymentMethodRepository", "Lai/kudi/agent/payments/data/repositories/PaymentMethodRepository;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "appRoomDatabase", "providesTransactionRemoteDataSource", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "providesTransactionsLocalSource", "Lai/kudi/agent/transactionhistory/data/source/TransactionsLocalSource;", "transactionDataToDatabaseMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionDataToDatabaseMapper;", "transactionDatabaseToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionDatabaseToDataMapper;", "providesTransactionsRemoteSource", "Lai/kudi/agent/transactionhistory/data/source/TransactionsRemoteSource;", "incompleteTransactionApiToTransactionDataMapper", "Lai/kudi/agent/transactionhistory/mapper/IncompleteTransactionApiToTransactionDataMapper;", "walletActivityApiToTransactionDataMapper", "Lai/kudi/agent/transactionhistory/mapper/WalletActivityApiToTransactionDataMapper;", "searchWalletActivityResponseToTransactionDataMapper", "Lai/kudi/agent/transactionhistory/mapper/SearchWalletActivityResponseToTransactionDataMapper;", "transactionApiToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionApiToDataMapper;", "providesTransactionsSummaryLocalSource", "Lai/kudi/agent/transactionhistory/data/source/TransactionsSummaryLocalSource;", "transactionSummaryDataToDatabaseMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryDataToDatabaseMapper;", "transactionSummaryDatabaseToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionSummaryDatabaseToDataMapper;", "providesUserRepository", "service", "Lai/kudi/agent/users/data/network/UserService;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RepositoryModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AnnouncementsDataSource provideAnnouncementDataSource(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "roomDatabase");
        AnnouncementsDao $r1 = coreAppDatabase.announcementDao();
        LocalAnnouncementsDataSource $r3 = new LocalAnnouncementsDataSource($r1);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AnnouncementRepository provideAnnouncementRepo(AnnouncementsDataSource announcementsDataSource, C5615f c5615f) {
        Log_OC.getArray(announcementsDataSource, "announcementsDataSource");
        Log_OC.getArray(c5615f, "firebaseDatabase");
        AnnouncementRepositoryImpl $r3 = new AnnouncementRepositoryImpl(announcementsDataSource, c5615f);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillerRepository provideBillerLocalSource(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "roomDatabase");
        LocalBillerRepositoryImpl $r2 = new LocalBillerRepositoryImpl(coreAppDatabase);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RemoteBillerRepositoryImpl provideBillerRemoteSource(C5615f c5615f) {
        Log_OC.getArray(c5615f, "firebaseDatabase");
        RemoteBillerRepositoryImpl $r2 = new RemoteBillerRepositoryImpl(c5615f);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillerRepository provideBillerRepo(BillerRepository billerRepository, SharedPreferences sharedPreferences, RemoteBillerRepositoryImpl remoteBillerRepositoryImpl) {
        Log_OC.getArray(billerRepository, "localdb");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        Log_OC.getArray(remoteBillerRepositoryImpl, "remotedb");
        BillerRepositoryImpl $r4 = new BillerRepositoryImpl(billerRepository, sharedPreferences, remoteBillerRepositoryImpl);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionRepository provideDefaultTransactionRepository(TransactionRepository transactionRepository) {
        Log_OC.getArray(transactionRepository, "remote");
        TransactionRepositoryImpl $r2 = new TransactionRepositoryImpl(transactionRepository);
        return $r2;
    }

    public final TransactionLookUpRepository provideTransactionLookUpRepository(DefaultTransactionLookUpRepository defaultTransactionLookUpRepository) {
        Log_OC.getArray(defaultTransactionLookUpRepository, "impl");
        return defaultTransactionLookUpRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PaymentMethodRepository providesPaymentMethodRepository(NetworkService networkService, CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        RoomPaymentMethodRepository $r3 = new RoomPaymentMethodRepository(networkService, coreAppDatabase);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionRepository providesTransactionRemoteDataSource(UserRepository userRepository, NetworkService networkService) {
        Log_OC.getArray(userRepository, "userRepo");
        Log_OC.getArray(networkService, "networkService");
        TransactionRemoteSource $r3 = new TransactionRemoteSource(userRepository, networkService);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionsLocalSource providesTransactionsLocalSource(CoreAppDatabase coreAppDatabase, TransactionDataToDatabaseMapper transactionDataToDatabaseMapper, TransactionDatabaseToDataMapper transactionDatabaseToDataMapper) {
        Log_OC.getArray(coreAppDatabase, "roomDatabase");
        Log_OC.getArray(transactionDataToDatabaseMapper, "transactionDataToDatabaseMapper");
        Log_OC.getArray(transactionDatabaseToDataMapper, "transactionDatabaseToDataMapper");
        TransactionsLocalDataSource $r4 = new TransactionsLocalDataSource(coreAppDatabase, transactionDataToDatabaseMapper, transactionDatabaseToDataMapper);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionsRemoteSource providesTransactionsRemoteSource(NetworkService networkService, IncompleteTransactionApiToTransactionDataMapper incompleteTransactionApiToTransactionDataMapper, WalletActivityApiToTransactionDataMapper walletActivityApiToTransactionDataMapper, SearchWalletActivityResponseToTransactionDataMapper searchWalletActivityResponseToTransactionDataMapper, TransactionApiToDataMapper transactionApiToDataMapper) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(incompleteTransactionApiToTransactionDataMapper, "incompleteTransactionApiToTransactionDataMapper");
        Log_OC.getArray(walletActivityApiToTransactionDataMapper, "walletActivityApiToTransactionDataMapper");
        Log_OC.getArray(searchWalletActivityResponseToTransactionDataMapper, "searchWalletActivityResponseToTransactionDataMapper");
        Log_OC.getArray(transactionApiToDataMapper, "transactionApiToDataMapper");
        TransactionsRemoteDataSource $r6 = new TransactionsRemoteDataSource(networkService, incompleteTransactionApiToTransactionDataMapper, walletActivityApiToTransactionDataMapper, searchWalletActivityResponseToTransactionDataMapper, transactionApiToDataMapper);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionsSummaryLocalSource providesTransactionsSummaryLocalSource(CoreAppDatabase coreAppDatabase, TransactionSummaryDataToDatabaseMapper transactionSummaryDataToDatabaseMapper, TransactionSummaryDatabaseToDataMapper transactionSummaryDatabaseToDataMapper) {
        Log_OC.getArray(coreAppDatabase, "roomDatabase");
        Log_OC.getArray(transactionSummaryDataToDatabaseMapper, "transactionSummaryDataToDatabaseMapper");
        Log_OC.getArray(transactionSummaryDatabaseToDataMapper, "transactionSummaryDatabaseToDataMapper");
        TransactionsSummaryLocalDataSource $r4 = new TransactionsSummaryLocalDataSource(coreAppDatabase, transactionSummaryDataToDatabaseMapper, transactionSummaryDatabaseToDataMapper);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserRepository providesUserRepository(CoreAppDatabase coreAppDatabase, UserService userService) {
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        Log_OC.getArray(userService, "service");
        RoomUserRepository $r3 = new RoomUserRepository(coreAppDatabase, userService);
        return $r3;
    }
}
