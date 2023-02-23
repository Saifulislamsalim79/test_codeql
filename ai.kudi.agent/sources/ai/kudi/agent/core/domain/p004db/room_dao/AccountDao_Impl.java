package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.database.Cursor;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import androidx.room.EmptyResultSetException;
import androidx.room.p063z0.C1853b;
import androidx.room.p063z0.C1854c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl */
/* loaded from: classes.dex */
public final class AccountDao_Impl implements AccountDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<BankAccount> __insertionAdapterOfBankAccount;
    private final AbstractC1841w0 __preparedStmtOfDeleteAllAccountDetails;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfBankAccount = new AbstractC1763c0<BankAccount>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, BankAccount bankAccount) {
                String $r3 = bankAccount.getAccountName();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = bankAccount.getAccountName();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = bankAccount.getAccountNumber();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = bankAccount.getAccountNumber();
                    interfaceC8101k.bindString(2, $r34);
                }
                String $r35 = bankAccount.getBankName();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r36 = bankAccount.getBankName();
                    interfaceC8101k.bindString(3, $r36);
                }
                String $r37 = bankAccount.getBankCode();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r38 = bankAccount.getBankCode();
                    interfaceC8101k.bindString(4, $r38);
                }
                String $r39 = bankAccount.getDateAdded();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r310 = bankAccount.getDateAdded();
                    interfaceC8101k.bindString(5, $r310);
                }
                String $r311 = bankAccount.getAgentId();
                if ($r311 == null) {
                    interfaceC8101k.bindNull(6);
                } else {
                    String $r312 = bankAccount.getAgentId();
                    interfaceC8101k.bindString(6, $r312);
                }
                String $r313 = bankAccount.getAccountPurpose();
                if ($r313 == null) {
                    interfaceC8101k.bindNull(7);
                    return;
                }
                String $r314 = bankAccount.getAccountPurpose();
                interfaceC8101k.bindString(7, $r314);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, BankAccount bankAccount) {
                BankAccount $r3 = bankAccount;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `account_details` (`accountName`,`accountNumber`,`bankName`,`bankCode`,`dateAdded`,`agentId`,`accountPurpose`) VALUES (?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAllAccountDetails = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM account_details";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AccountDao
    public AbstractC11696w addAcctDetails(final BankAccount... bankAccountArr) {
        AbstractC11696w $r2 = AbstractC11696w.m10439k(new Callable<List<Long>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<Long> call() throws Exception {
                List $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            public List<Long> call2() throws Exception {
                AccountDao_Impl $r1 = AccountDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                $r22.beginTransaction();
                try {
                    AccountDao_Impl $r12 = AccountDao_Impl.this;
                    AbstractC1763c0 $r3 = $r12.__insertionAdapterOfBankAccount;
                    BankAccount[] $r4 = bankAccountArr;
                    List $r5 = $r3.insertAndReturnIdsList($r4);
                    AccountDao_Impl $r13 = AccountDao_Impl.this;
                    AbstractC1802o0 $r23 = $r13.__db;
                    $r23.setTransactionSuccessful();
                    return $r5;
                } finally {
                    AccountDao_Impl $r14 = AccountDao_Impl.this;
                    AbstractC1802o0 $r24 = $r14.__db;
                    $r24.endTransaction();
                }
            }
        });
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AccountDao
    public AbstractC11271b deleteAllAccountDetails() {
        AbstractC11271b $r1 = AbstractC11271b.m11239l(new Callable<Void>() { // from class: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
                Void $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            public Void call2() throws Exception {
                AccountDao_Impl $r12 = AccountDao_Impl.this;
                AbstractC1841w0 $r2 = $r12.__preparedStmtOfDeleteAllAccountDetails;
                InterfaceC8101k $r3 = $r2.acquire();
                AccountDao_Impl $r13 = AccountDao_Impl.this;
                AbstractC1802o0 $r4 = $r13.__db;
                $r4.beginTransaction();
                try {
                    $r3.executeUpdateDelete();
                    AccountDao_Impl $r14 = AccountDao_Impl.this;
                    AbstractC1802o0 $r42 = $r14.__db;
                    $r42.setTransactionSuccessful();
                    AccountDao_Impl $r15 = AccountDao_Impl.this;
                    AbstractC1802o0 $r43 = $r15.__db;
                    $r43.endTransaction();
                    AccountDao_Impl $r16 = AccountDao_Impl.this;
                    AbstractC1841w0 $r22 = $r16.__preparedStmtOfDeleteAllAccountDetails;
                    $r22.release($r3);
                    return null;
                } catch (Throwable $r5) {
                    AccountDao_Impl $r17 = AccountDao_Impl.this;
                    AbstractC1802o0 $r44 = $r17.__db;
                    $r44.endTransaction();
                    AccountDao_Impl $r18 = AccountDao_Impl.this;
                    AbstractC1841w0 $r23 = $r18.__preparedStmtOfDeleteAllAccountDetails;
                    $r23.release($r3);
                    throw $r5;
                }
            }
        });
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AccountDao
    public AbstractC11696w fetchCashOutAccounts(String str) {
        final C1816r0 $r2 = C1816r0.m34466m("SELECT * FROM account_details where agentId=? AND accountPurpose='CASH_OUT' LIMIT 1", 1);
        if (str == null) {
            $r2.bindNull(1);
        } else {
            $r2.bindString(1, str);
        }
        AbstractC11696w $r4 = C1823t0.m34459e(new Callable<BankAccount>() { // from class: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public BankAccount call() throws Exception {
                Object r17;
                AccountDao_Impl $r22 = AccountDao_Impl.this;
                AbstractC1802o0 $r3 = $r22.__db;
                C1816r0 $r42 = $r2;
                Object $r5 = null;
                Cursor $r6 = C1854c.m34419b($r3, $r42, false, null);
                try {
                    int $i0 = C1853b.m34421e($r6, BanksWithMethods.ACCOUNT_NAME);
                    int $i1 = C1853b.m34421e($r6, BanksWithMethods.ACCOUNT_NUMBER);
                    int $i2 = C1853b.m34421e($r6, BanksWithMethods.BANK_NAME);
                    int $i3 = C1853b.m34421e($r6, "bankCode");
                    int $i4 = C1853b.m34421e($r6, "dateAdded");
                    int $i5 = C1853b.m34421e($r6, "agentId");
                    int $i6 = C1853b.m34421e($r6, "accountPurpose");
                    boolean $z0 = $r6.moveToFirst();
                    if ($z0) {
                        boolean $z02 = $r6.isNull($i0);
                        String $r7 = $z02 ? null : $r6.getString($i0);
                        boolean $z03 = $r6.isNull($i1);
                        String $r8 = $z03 ? null : $r6.getString($i1);
                        boolean $z04 = $r6.isNull($i2);
                        String $r9 = $z04 ? null : $r6.getString($i2);
                        boolean $z05 = $r6.isNull($i3);
                        String $r10 = $z05 ? null : $r6.getString($i3);
                        boolean $z06 = $r6.isNull($i4);
                        String $r11 = $z06 ? null : $r6.getString($i4);
                        boolean $z07 = $r6.isNull($i5);
                        String $r12 = $z07 ? null : $r6.getString($i5);
                        boolean $z08 = $r6.isNull($i6);
                        if (!$z08) {
                            Object $r13 = $r6.getString($i6);
                            $r5 = $r13;
                        }
                        Object $r1 = $r5;
                        $r5 = r17;
                        String $r132 = (String) $r1;
                        r17 = new BankAccount($r7, $r8, $r9, $r10, $r11, $r12, $r132);
                    }
                    if ($r5 != null) {
                        $r6.close();
                        BankAccount r172 = (BankAccount) $r5;
                        return r172;
                    }
                    StringBuilder r18 = new StringBuilder();
                    r18.append("Query returned empty result set: ");
                    C1816r0 $r43 = $r2;
                    String $r72 = $r43.mo16756c();
                    r18.append($r72);
                    String $r73 = r18.toString();
                    Throwable r19 = new EmptyResultSetException($r73);
                    Throwable $r16 = r19;
                    throw $r16;
                } catch (Throwable $r162) {
                    $r6.close();
                    throw $r162;
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ BankAccount call() throws Exception {
                BankAccount $r1 = call();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r1 = $r2;
                $r1.m34467J();
            }
        });
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AccountDao
    public AbstractC11688p getAccountDetails(String str) {
        final C1816r0 $r3 = C1816r0.m34466m("SELECT * FROM account_details where agentId=?", 1);
        if (str == null) {
            $r3.bindNull(1);
        } else {
            $r3.bindString(1, str);
        }
        AbstractC1802o0 $r4 = this.__db;
        String[] $r5 = {"account_details"};
        AbstractC11688p $r6 = C1823t0.m34461c($r4, false, $r5, new Callable<List<BankAccount>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<BankAccount> call() throws Exception {
                List $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x004d */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.BankAccount> call2() throws java.lang.Exception {
                /*
                    r34 = this;
                    r0 = r34
                    ai.kudi.agent.core.domain.db.room_dao.AccountDao_Impl r8 = ai.kudi.agent.core.domain.p004db.room_dao.AccountDao_Impl.this
                    androidx.room.o0 r9 = ai.kudi.agent.core.domain.p004db.room_dao.AccountDao_Impl.access$000(r8)
                    r0 = r34
                    androidx.room.r0 r10 = r2
                    r12 = 0
                    r13 = 0
                    android.database.Cursor r11 = androidx.room.p063z0.C1854c.m34419b(r9, r10, r12, r13)
                    java.lang.String r15 = "accountName"
                    int r14 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.lang.String r15 = "accountNumber"
                    int r16 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.lang.String r15 = "bankName"
                    int r17 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.lang.String r15 = "bankCode"
                    int r18 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.lang.String r15 = "dateAdded"
                    int r19 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.lang.String r15 = "agentId"
                    int r20 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.lang.String r15 = "accountPurpose"
                    int r21 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le5
                    java.util.ArrayList r22 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le5
                    int r23 = r11.getCount()     // Catch: java.lang.Throwable -> Le5
                    r0 = r22
                    r1 = r23
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> Le5
                L49:
                    boolean r24 = r11.moveToNext()     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto Le1
                    boolean r24 = r11.isNull(r14)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto L58
                    r25 = 0
                    goto L5c
                L58:
                    java.lang.String r25 = r11.getString(r14)     // Catch: java.lang.Throwable -> Le5
                L5c:
                    r0 = r16
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto L67
                    r26 = 0
                    goto L6d
                L67:
                    r0 = r16
                    java.lang.String r26 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le5
                L6d:
                    r0 = r17
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto L78
                    r27 = 0
                    goto L7e
                L78:
                    r0 = r17
                    java.lang.String r27 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le5
                L7e:
                    r0 = r18
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto L89
                    r28 = 0
                    goto L8f
                L89:
                    r0 = r18
                    java.lang.String r28 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le5
                L8f:
                    r0 = r19
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto L9a
                    r29 = 0
                    goto La0
                L9a:
                    r0 = r19
                    java.lang.String r29 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le5
                La0:
                    r0 = r20
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto Lab
                    r30 = 0
                    goto Lb1
                Lab:
                    r0 = r20
                    java.lang.String r30 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le5
                Lb1:
                    r0 = r21
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le5
                    if (r24 == 0) goto Lbc
                    r31 = 0
                    goto Lc2
                Lbc:
                    r0 = r21
                    java.lang.String r31 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le5
                Lc2:
                    ai.kudi.agent.core.domain.room_entities.BankAccount r32 = new ai.kudi.agent.core.domain.room_entities.BankAccount     // Catch: java.lang.Throwable -> Le5
                    r0 = r32
                    r1 = r25
                    r2 = r26
                    r3 = r27
                    r4 = r28
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le5
                    r0 = r22
                    r1 = r32
                    r0.add(r1)     // Catch: java.lang.Throwable -> Le5
                    goto L49
                Le1:
                    r11.close()
                    return r22
                Le5:
                    r33 = move-exception
                    r11.close()
                    goto Lea
                Lea:
                    throw r33
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.AccountDao_Impl.CallableC00495.call2():java.util.List");
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
}
