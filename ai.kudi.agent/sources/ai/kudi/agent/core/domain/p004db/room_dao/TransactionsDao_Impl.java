package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.converters.DateConverter;
import ai.kudi.agent.core.domain.converters.TransactionKindDatabaseConverter;
import ai.kudi.agent.core.domain.converters.TransactionTypeDatabaseConverter;
import ai.kudi.agent.core.domain.p004db.model.TransactionKindDatabaseModel;
import ai.kudi.agent.core.domain.p004db.model.TransactionTypeDatabaseModel;
import ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.TransactionsDao_Impl */
/* loaded from: classes.dex */
public final class TransactionsDao_Impl extends TransactionsDao {
    private final DateConverter __dateConverter;
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<TransactionDatabaseModel> __insertionAdapterOfTransactionDatabaseModel;
    private final AbstractC1841w0 __preparedStmtOfDeleteAll;
    private final AbstractC1841w0 __preparedStmtOfDeleteOldUserTransactions;
    private final TransactionKindDatabaseConverter __transactionKindDatabaseConverter;
    private final TransactionTypeDatabaseConverter __transactionTypeDatabaseConverter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsDao_Impl(AbstractC1802o0 abstractC1802o0) {
        TransactionTypeDatabaseConverter $r2 = new TransactionTypeDatabaseConverter();
        this.__transactionTypeDatabaseConverter = $r2;
        TransactionKindDatabaseConverter $r3 = new TransactionKindDatabaseConverter();
        this.__transactionKindDatabaseConverter = $r3;
        DateConverter $r4 = new DateConverter();
        this.__dateConverter = $r4;
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfTransactionDatabaseModel = new AbstractC1763c0<TransactionDatabaseModel>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, TransactionDatabaseModel transactionDatabaseModel) {
                String $r32 = transactionDatabaseModel.getId();
                if ($r32 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r33 = transactionDatabaseModel.getId();
                    interfaceC8101k.bindString(1, $r33);
                }
                TransactionsDao_Impl $r42 = TransactionsDao_Impl.this;
                TransactionTypeDatabaseConverter $r5 = $r42.__transactionTypeDatabaseConverter;
                TransactionTypeDatabaseModel $r6 = transactionDatabaseModel.getTransactionType();
                String $r34 = $r5.fromTransactionType($r6);
                if ($r34 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    interfaceC8101k.bindString(2, $r34);
                }
                String $r35 = transactionDatabaseModel.getAccountBalance();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r36 = transactionDatabaseModel.getAccountBalance();
                    interfaceC8101k.bindString(3, $r36);
                }
                String $r37 = transactionDatabaseModel.getAmount();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r38 = transactionDatabaseModel.getAmount();
                    interfaceC8101k.bindString(4, $r38);
                }
                TransactionsDao_Impl $r43 = TransactionsDao_Impl.this;
                TransactionKindDatabaseConverter $r7 = $r43.__transactionKindDatabaseConverter;
                TransactionKindDatabaseModel $r8 = transactionDatabaseModel.getKind();
                String $r39 = $r7.fromTransactionType($r8);
                if ($r39 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    interfaceC8101k.bindString(5, $r39);
                }
                String $r310 = transactionDatabaseModel.getCustomerPhone();
                if ($r310 == null) {
                    interfaceC8101k.bindNull(6);
                } else {
                    String $r311 = transactionDatabaseModel.getCustomerPhone();
                    interfaceC8101k.bindString(6, $r311);
                }
                String $r312 = transactionDatabaseModel.getCustomerName();
                if ($r312 == null) {
                    interfaceC8101k.bindNull(7);
                } else {
                    String $r313 = transactionDatabaseModel.getCustomerName();
                    interfaceC8101k.bindString(7, $r313);
                }
                String $r314 = transactionDatabaseModel.getCustomerPictureId();
                if ($r314 == null) {
                    interfaceC8101k.bindNull(8);
                } else {
                    String $r315 = transactionDatabaseModel.getCustomerPictureId();
                    interfaceC8101k.bindString(8, $r315);
                }
                String $r316 = transactionDatabaseModel.getStatus();
                if ($r316 == null) {
                    interfaceC8101k.bindNull(9);
                } else {
                    String $r317 = transactionDatabaseModel.getStatus();
                    interfaceC8101k.bindString(9, $r317);
                }
                TransactionsDao_Impl $r44 = TransactionsDao_Impl.this;
                DateConverter $r9 = $r44.__dateConverter;
                Date $r10 = transactionDatabaseModel.getDate();
                Long $r11 = $r9.toTimeStamp($r10);
                if ($r11 == null) {
                    interfaceC8101k.bindNull(10);
                } else {
                    long $l0 = $r11.longValue();
                    interfaceC8101k.bindLong(10, $l0);
                }
                String $r318 = transactionDatabaseModel.getUserId();
                if ($r318 == null) {
                    interfaceC8101k.bindNull(11);
                    return;
                }
                String $r319 = transactionDatabaseModel.getUserId();
                interfaceC8101k.bindString(11, $r319);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, TransactionDatabaseModel transactionDatabaseModel) {
                TransactionDatabaseModel $r32 = transactionDatabaseModel;
                bind2(interfaceC8101k, $r32);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `transactions` (`id`,`transactionType`,`accountBalance`,`amount`,`kind`,`customerPhone`,`customerName`,`customerPictureId`,`status`,`date`,`userId`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM transactions";
            }
        };
        this.__preparedStmtOfDeleteOldUserTransactions = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsDao_Impl.3
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM transactions WHERE userId != ?";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao
    protected void insertAll(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfTransactionDatabaseModel;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao
    public AbstractC11688p observeAll(String str) {
        final C1816r0 $r3 = C1816r0.m34466m("SELECT * FROM  transactions WHERE userId = ?", 1);
        if (str == null) {
            $r3.bindNull(1);
        } else {
            $r3.bindString(1, str);
        }
        AbstractC1802o0 $r4 = this.__db;
        String[] $r5 = {"transactions"};
        AbstractC11688p $r6 = C1823t0.m34461c($r4, false, $r5, new Callable<List<TransactionDatabaseModel>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.TransactionsDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<TransactionDatabaseModel> call() throws Exception {
                List $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x0081 */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel> call2() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 421
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao_Impl.CallableC01024.call2():java.util.List");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r1 = $r3;
                $r1.m34467J();
            }
        });
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao
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
