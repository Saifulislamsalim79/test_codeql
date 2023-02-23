package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.Bank;
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
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.BanksDao_Impl */
/* loaded from: classes.dex */
public final class BanksDao_Impl implements BanksDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<Bank> __insertionAdapterOfBank;
    private final AbstractC1841w0 __preparedStmtOfDeleteBanks;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfBank = new AbstractC1763c0<Bank>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.BanksDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, Bank bank) {
                String $r3 = bank.getName();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = bank.getName();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = bank.getBankCode();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                    return;
                }
                String $r34 = bank.getBankCode();
                interfaceC8101k.bindString(2, $r34);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, Bank bank) {
                Bank $r3 = bank;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `bank` (`name`,`bankCode`) VALUES (?,?)";
            }
        };
        this.__preparedStmtOfDeleteBanks = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.BanksDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from bank";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BanksDao
    public void deleteBanks() {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1841w0 $r3 = this.__preparedStmtOfDeleteBanks;
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
            AbstractC1841w0 $r32 = this.__preparedStmtOfDeleteBanks;
            $r32.release($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BanksDao
    public AbstractC11696w getBankByCode(String str) {
        final C1816r0 $r2 = C1816r0.m34466m("Select * from bank where bankCode=? LIMIT 1", 1);
        if (str == null) {
            $r2.bindNull(1);
        } else {
            $r2.bindString(1, str);
        }
        AbstractC11696w $r4 = C1823t0.m34459e(new Callable<Bank>() { // from class: ai.kudi.agent.core.domain.db.room_dao.BanksDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Bank call() throws Exception {
                BanksDao_Impl $r1 = BanksDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                C1816r0 $r3 = $r2;
                Object $r42 = null;
                Cursor $r5 = C1854c.m34419b($r22, $r3, false, null);
                try {
                    int $i0 = C1853b.m34421e($r5, "name");
                    int $i1 = C1853b.m34421e($r5, "bankCode");
                    boolean $z0 = $r5.moveToFirst();
                    if ($z0) {
                        boolean $z02 = $r5.isNull($i0);
                        String $r6 = $z02 ? null : $r5.getString($i0);
                        boolean $z03 = $r5.isNull($i1);
                        if (!$z03) {
                            Object $r7 = $r5.getString($i1);
                            $r42 = $r7;
                        }
                        String $r72 = (String) $r42;
                        Object r12 = new Bank($r6, $r72);
                        $r42 = r12;
                    }
                    if ($r42 != null) {
                        $r5.close();
                        Bank $r8 = (Bank) $r42;
                        return $r8;
                    }
                    StringBuilder r13 = new StringBuilder();
                    r13.append("Query returned empty result set: ");
                    C1816r0 $r32 = $r2;
                    String $r62 = $r32.mo16756c();
                    r13.append($r62);
                    String $r63 = r13.toString();
                    Throwable r14 = new EmptyResultSetException($r63);
                    Throwable $r11 = r14;
                    throw $r11;
                } catch (Throwable $r112) {
                    $r5.close();
                    throw $r112;
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Bank call() throws Exception {
                Bank $r1 = call();
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BanksDao
    public AbstractC11688p getBanks() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from bank", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"bank"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<Bank>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.BanksDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<Bank> call() throws Exception {
                List $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x002d */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.Bank> call2() throws java.lang.Exception {
                /*
                    r17 = this;
                    r0 = r17
                    ai.kudi.agent.core.domain.db.room_dao.BanksDao_Impl r1 = ai.kudi.agent.core.domain.p004db.room_dao.BanksDao_Impl.this
                    r17 = r0
                    androidx.room.o0 r2 = ai.kudi.agent.core.domain.p004db.room_dao.BanksDao_Impl.access$000(r1)
                    r0 = r17
                    androidx.room.r0 r3 = r2
                    r5 = 0
                    r6 = 0
                    android.database.Cursor r4 = androidx.room.p063z0.C1854c.m34419b(r2, r3, r5, r6)
                    java.lang.String r8 = "name"
                    int r7 = androidx.room.p063z0.C1853b.m34421e(r4, r8)     // Catch: java.lang.Throwable -> L54
                    java.lang.String r8 = "bankCode"
                    int r9 = androidx.room.p063z0.C1853b.m34421e(r4, r8)     // Catch: java.lang.Throwable -> L54
                    java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54
                    int r11 = r4.getCount()     // Catch: java.lang.Throwable -> L54
                    r10.<init>(r11)     // Catch: java.lang.Throwable -> L54
                L29:
                    boolean r12 = r4.moveToNext()     // Catch: java.lang.Throwable -> L54
                    if (r12 == 0) goto L50
                    boolean r12 = r4.isNull(r7)     // Catch: java.lang.Throwable -> L54
                    if (r12 == 0) goto L37
                    r13 = 0
                    goto L3b
                L37:
                    java.lang.String r13 = r4.getString(r7)     // Catch: java.lang.Throwable -> L54
                L3b:
                    boolean r12 = r4.isNull(r9)     // Catch: java.lang.Throwable -> L54
                    if (r12 == 0) goto L43
                    r14 = 0
                    goto L47
                L43:
                    java.lang.String r14 = r4.getString(r9)     // Catch: java.lang.Throwable -> L54
                L47:
                    ai.kudi.agent.core.domain.room_entities.Bank r15 = new ai.kudi.agent.core.domain.room_entities.Bank     // Catch: java.lang.Throwable -> L54
                    r15.<init>(r13, r14)     // Catch: java.lang.Throwable -> L54
                    r10.add(r15)     // Catch: java.lang.Throwable -> L54
                    goto L29
                L50:
                    r4.close()
                    return r10
                L54:
                    r16 = move-exception
                    r4.close()
                    goto L59
                L59:
                    throw r16
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.BanksDao_Impl.CallableC00573.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BanksDao
    public void insertBanks(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfBank;
            $r3.insert((Iterable) list);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }
}
