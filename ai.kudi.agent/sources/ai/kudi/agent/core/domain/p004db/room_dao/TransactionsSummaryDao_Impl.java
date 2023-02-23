package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.converters.TransactionSummaryTypeDatabaseConverter;
import ai.kudi.agent.core.domain.p004db.model.TransactionSummaryTypeDatabaseModel;
import ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl */
/* loaded from: classes.dex */
public final class TransactionsSummaryDao_Impl extends TransactionsSummaryDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<TransactionSummaryDatabaseModel> __insertionAdapterOfTransactionSummaryDatabaseModel;
    private final AbstractC1841w0 __preparedStmtOfDeleteAll;
    private final AbstractC1841w0 __preparedStmtOfDeleteOldUserTransactions;
    private final TransactionSummaryTypeDatabaseConverter __transactionSummaryTypeDatabaseConverter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsSummaryDao_Impl(AbstractC1802o0 abstractC1802o0) {
        TransactionSummaryTypeDatabaseConverter $r2 = new TransactionSummaryTypeDatabaseConverter();
        this.__transactionSummaryTypeDatabaseConverter = $r2;
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfTransactionSummaryDatabaseModel = new AbstractC1763c0<TransactionSummaryDatabaseModel>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, TransactionSummaryDatabaseModel transactionSummaryDatabaseModel) {
                long $l0 = transactionSummaryDatabaseModel.getId();
                interfaceC8101k.bindLong(1, $l0);
                TransactionsSummaryDao_Impl $r3 = TransactionsSummaryDao_Impl.this;
                TransactionSummaryTypeDatabaseConverter $r4 = $r3.__transactionSummaryTypeDatabaseConverter;
                TransactionSummaryTypeDatabaseModel $r5 = transactionSummaryDatabaseModel.getType();
                String $r6 = $r4.fromSummaryType($r5);
                if ($r6 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    interfaceC8101k.bindString(2, $r6);
                }
                if (transactionSummaryDatabaseModel.getValue() == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    interfaceC8101k.bindString(3, transactionSummaryDatabaseModel.getValue());
                }
                if (transactionSummaryDatabaseModel.getUserId() == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    interfaceC8101k.bindString(4, transactionSummaryDatabaseModel.getUserId());
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, TransactionSummaryDatabaseModel transactionSummaryDatabaseModel) {
                TransactionSummaryDatabaseModel $r3 = transactionSummaryDatabaseModel;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR ABORT INTO `transactions_summary` (`id`,`type`,`value`,`userId`) VALUES (nullif(?, 0),?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM transactions_summary";
            }
        };
        this.__preparedStmtOfDeleteOldUserTransactions = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl.3
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM transactions_summary WHERE userId != ?";
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static List getRequiredConverters() {
        List $r0 = Collections.emptyList();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao
    protected void deleteAll() {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1841w0 $r3 = this.__preparedStmtOfDeleteAll;
        InterfaceC8101k $r1 = $r3.acquire();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            $r1.executeUpdateDelete();
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
            AbstractC1841w0 $r32 = this.__preparedStmtOfDeleteAll;
            $r32.release($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao
    public void deleteOldUserTransactions(String str) {
        AbstractC1802o0 $r3 = this.__db;
        $r3.assertNotSuspendingTransaction();
        AbstractC1841w0 $r4 = this.__preparedStmtOfDeleteOldUserTransactions;
        InterfaceC8101k $r1 = $r4.acquire();
        if (str == null) {
            $r1.bindNull(1);
        } else {
            $r1.bindString(1, str);
        }
        AbstractC1802o0 $r32 = this.__db;
        $r32.beginTransaction();
        try {
            $r1.executeUpdateDelete();
            AbstractC1802o0 $r33 = this.__db;
            $r33.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r34 = this.__db;
            $r34.endTransaction();
            AbstractC1841w0 $r42 = this.__preparedStmtOfDeleteOldUserTransactions;
            $r42.release($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao
    protected void insertAll(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfTransactionSummaryDatabaseModel;
            $r3.insert((Iterable) list);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao
    public AbstractC11688p observeAll() {
        final C1816r0 $r3 = C1816r0.m34466m("SELECT * FROM  transactions_summary", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"transactions_summary"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<TransactionSummaryDatabaseModel>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<TransactionSummaryDatabaseModel> call() throws Exception {
                List $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x003b */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel> call2() throws java.lang.Exception {
                /*
                    r28 = this;
                    r0 = r28
                    ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl r6 = ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao_Impl.this
                    androidx.room.o0 r7 = ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao_Impl.access$200(r6)
                    r0 = r28
                    androidx.room.r0 r8 = r2
                    r10 = 0
                    r11 = 0
                    android.database.Cursor r9 = androidx.room.p063z0.C1854c.m34419b(r7, r8, r10, r11)
                    java.lang.String r13 = "id"
                    int r12 = androidx.room.p063z0.C1853b.m34421e(r9, r13)     // Catch: java.lang.Throwable -> L97
                    java.lang.String r13 = "type"
                    int r14 = androidx.room.p063z0.C1853b.m34421e(r9, r13)     // Catch: java.lang.Throwable -> L97
                    java.lang.String r13 = "value"
                    int r15 = androidx.room.p063z0.C1853b.m34421e(r9, r13)     // Catch: java.lang.Throwable -> L97
                    java.lang.String r13 = "userId"
                    int r16 = androidx.room.p063z0.C1853b.m34421e(r9, r13)     // Catch: java.lang.Throwable -> L97
                    java.util.ArrayList r17 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
                    int r18 = r9.getCount()     // Catch: java.lang.Throwable -> L97
                    r0 = r17
                    r1 = r18
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L97
                L37:
                    boolean r19 = r9.moveToNext()     // Catch: java.lang.Throwable -> L97
                    if (r19 == 0) goto L93
                    long r20 = r9.getLong(r12)     // Catch: java.lang.Throwable -> L97
                    boolean r19 = r9.isNull(r14)     // Catch: java.lang.Throwable -> L97
                    if (r19 == 0) goto L4a
                    r22 = 0
                    goto L4e
                L4a:
                    java.lang.String r22 = r9.getString(r14)     // Catch: java.lang.Throwable -> L97
                L4e:
                    r0 = r28
                    ai.kudi.agent.core.domain.db.room_dao.TransactionsSummaryDao_Impl r6 = ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao_Impl.this     // Catch: java.lang.Throwable -> L97
                    ai.kudi.agent.core.domain.converters.TransactionSummaryTypeDatabaseConverter r23 = ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao_Impl.access$000(r6)     // Catch: java.lang.Throwable -> L97
                    r0 = r23
                    r1 = r22
                    ai.kudi.agent.core.domain.db.model.TransactionSummaryTypeDatabaseModel r24 = r0.toSummaryType(r1)     // Catch: java.lang.Throwable -> L97
                    boolean r19 = r9.isNull(r15)     // Catch: java.lang.Throwable -> L97
                    if (r19 == 0) goto L67
                    r22 = 0
                    goto L6b
                L67:
                    java.lang.String r22 = r9.getString(r15)     // Catch: java.lang.Throwable -> L97
                L6b:
                    r0 = r16
                    boolean r19 = r9.isNull(r0)     // Catch: java.lang.Throwable -> L97
                    if (r19 == 0) goto L76
                    r25 = 0
                    goto L7c
                L76:
                    r0 = r16
                    java.lang.String r25 = r9.getString(r0)     // Catch: java.lang.Throwable -> L97
                L7c:
                    ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel r26 = new ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel     // Catch: java.lang.Throwable -> L97
                    r0 = r26
                    r1 = r20
                    r3 = r24
                    r4 = r22
                    r5 = r25
                    r0.<init>(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L97
                    r0 = r17
                    r1 = r26
                    r0.add(r1)     // Catch: java.lang.Throwable -> L97
                    goto L37
                L93:
                    r9.close()
                    return r17
                L97:
                    r27 = move-exception
                    r9.close()
                    goto L9c
                L9c:
                    throw r27
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao_Impl.CallableC01064.call2():java.util.List");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r12 = $r3;
                $r12.m34467J();
            }
        });
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao
    public void saveAll(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.beginTransaction();
        try {
            super.saveAll(list);
            AbstractC1802o0 $r22 = this.__db;
            $r22.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r23 = this.__db;
            $r23.endTransaction();
        }
    }
}
