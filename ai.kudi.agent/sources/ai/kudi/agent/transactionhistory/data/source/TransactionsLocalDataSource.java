package ai.kudi.agent.transactionhistory.data.source;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDatabaseToDataMapper;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: TransactionsLocalDataSource.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/TransactionsLocalDataSource;", "Lai/kudi/agent/transactionhistory/data/source/TransactionsLocalSource;", "database", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "transactionDataToDatabaseMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionDataToDatabaseMapper;", "transactionDatabaseToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/database/TransactionDatabaseToDataMapper;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;Lai/kudi/agent/transactionhistory/mapper/database/TransactionDataToDatabaseMapper;Lai/kudi/agent/transactionhistory/mapper/database/TransactionDatabaseToDataMapper;)V", "clearOldUserData", "Lio/reactivex/Single;", "", "currentUserId", "", "observeTransactions", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "userId", "saveAll", "transactions", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionsLocalDataSource implements TransactionsLocalSource {
    private final CoreAppDatabase database;
    private final TransactionDataToDatabaseMapper transactionDataToDatabaseMapper;
    private final TransactionDatabaseToDataMapper transactionDatabaseToDataMapper;

    public TransactionsLocalDataSource(CoreAppDatabase coreAppDatabase, TransactionDataToDatabaseMapper transactionDataToDatabaseMapper, TransactionDatabaseToDataMapper transactionDatabaseToDataMapper) {
        Log_OC.getArray(coreAppDatabase, "database");
        Log_OC.getArray(transactionDataToDatabaseMapper, "transactionDataToDatabaseMapper");
        Log_OC.getArray(transactionDatabaseToDataMapper, "transactionDatabaseToDataMapper");
        this.database = coreAppDatabase;
        this.transactionDataToDatabaseMapper = transactionDataToDatabaseMapper;
        this.transactionDatabaseToDataMapper = transactionDatabaseToDataMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: clearOldUserData$lambda-2  reason: not valid java name */
    public static final C13666w m40998clearOldUserData$lambda2(TransactionsLocalDataSource transactionsLocalDataSource, String str) {
        Log_OC.getArray(transactionsLocalDataSource, "this$0");
        Log_OC.getArray(str, "$currentUserId");
        CoreAppDatabase $r3 = transactionsLocalDataSource.database;
        TransactionsDao $r1 = $r3.getTransactionsDao();
        $r1.deleteOldUserTransactions(str);
        C13666w r4 = C13666w.f30112a;
        return r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001f */
    /* renamed from: observeTransactions$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m40999observeTransactions$lambda0(ai.kudi.agent.transactionhistory.data.source.TransactionsLocalDataSource r11, java.util.List r12) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.lang.String r0 = "it"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            ai.kudi.agent.transactionhistory.mapper.database.TransactionDatabaseToDataMapper r1 = r11.transactionDatabaseToDataMapper
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r12, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r12.iterator()
        L1b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L31
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel r9 = (ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel) r9
            r8 = r9
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r10 = r1.getPlaylist(r8)
            r2.add(r10)
            goto L1b
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsLocalDataSource.m40999observeTransactions$lambda0(ai.kudi.agent.transactionhistory.data.source.TransactionsLocalDataSource, java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource
    public AbstractC11696w clearOldUserData(final String str) {
        Log_OC.getArray(str, "currentUserId");
        AbstractC11696w $r1 = AbstractC11696w.m10439k(new Callable() { // from class: ai.kudi.agent.transactionhistory.data.source.Preferences$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TransactionsLocalDataSource $r3 = TransactionsLocalDataSource.this;
                String $r12 = str;
                C13666w $r2 = TransactionsLocalDataSource.m40998clearOldUserData$lambda2($r3, $r12);
                return $r2;
            }
        });
        Log_OC.loadImage($r1, "fromCallable { database.transactionsDao.deleteOldUserTransactions(currentUserId) }");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource
    public AbstractC11688p observeTransactions(String str) {
        Log_OC.getArray(str, "userId");
        CoreAppDatabase $r2 = this.database;
        TransactionsDao $r3 = $r2.getTransactionsDao();
        AbstractC11688p $r4 = $r3.observeAll(str).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsLocalDataSource $r1 = TransactionsLocalDataSource.this;
                List $r22 = (List) obj;
                return TransactionsLocalDataSource.m40999observeTransactions$lambda0($r1, $r22);
            }
        });
        Log_OC.loadImage($r4, "database.transactionsDao\n        .observeAll(userId).map { it.map(transactionDatabaseToDataMapper::map) }");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002b */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void saveAll(java.lang.String r16, java.util.List r17) {
        /*
            r15 = this;
            java.lang.String r1 = "userId"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "transactions"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            ai.kudi.agent.core.domain.db.CoreAppDatabase r2 = r15.database
            ai.kudi.agent.core.domain.db.room_dao.TransactionsDao r3 = r2.getTransactionsDao()
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            r0 = r17
            int r5 = kotlin.p557z.C13722p.m3921o(r0, r6)
            r4.<init>(r5)
            r0 = r17
            java.util.Iterator r7 = r0.iterator()
        L27:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L46
            java.lang.Object r9 = r7.next()
            r11 = r9
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r11 = (ai.kudi.agent.transactionhistory.data.model.TransactionDataModel) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper r12 = r15.transactionDataToDatabaseMapper
            ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper$MapperInput r13 = new ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper$MapperInput
            r0 = r16
            r13.<init>(r10, r0)
            ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel r14 = r12.createOrUpdate(r13)
            r4.add(r14)
            goto L27
        L46:
            r3.saveAll(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsLocalDataSource.saveAll(java.lang.String, java.util.List):void");
    }
}
