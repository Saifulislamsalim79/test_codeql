package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.IdType;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.IdTypeDao_Impl */
/* loaded from: classes.dex */
public final class IdTypeDao_Impl implements IdTypeDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<IdType> __insertionAdapterOfIdType;
    private final AbstractC1841w0 __preparedStmtOfDeleteAllIdTypes;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IdTypeDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfIdType = new AbstractC1763c0<IdType>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.IdTypeDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, IdType idType) {
                String $r3 = idType.getName();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = idType.getName();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = idType.getId();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = idType.getId();
                    interfaceC8101k.bindString(2, $r34);
                }
                int $i0 = idType.getValidLength();
                long $l1 = $i0;
                interfaceC8101k.bindLong(3, $l1);
                long $l12 = idType.isAvailable() ? 1L : 0L;
                interfaceC8101k.bindLong(4, $l12);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, IdType idType) {
                IdType $r3 = idType;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `idType` (`name`,`id`,`validLength`,`isAvailable`) VALUES (?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAllIdTypes = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.IdTypeDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM idType";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao
    public void deleteAllIdTypes() {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1841w0 $r3 = this.__preparedStmtOfDeleteAllIdTypes;
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
            AbstractC1841w0 $r32 = this.__preparedStmtOfDeleteAllIdTypes;
            $r32.release($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao
    public AbstractC11293f getIdTypes() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from idType", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"idType"};
        AbstractC11293f $r5 = C1823t0.m34463a($r1, false, $r4, new Callable<List<IdType>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.IdTypeDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<IdType> call() throws Exception {
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
            public java.util.List<ai.kudi.agent.core.domain.room_entities.IdType> call2() throws java.lang.Exception {
                /*
                    r24 = this;
                    r0 = r24
                    ai.kudi.agent.core.domain.db.room_dao.IdTypeDao_Impl r5 = ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao_Impl.this
                    androidx.room.o0 r6 = ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao_Impl.access$000(r5)
                    r0 = r24
                    androidx.room.r0 r7 = r2
                    r9 = 0
                    r10 = 0
                    android.database.Cursor r8 = androidx.room.p063z0.C1854c.m34419b(r6, r7, r9, r10)
                    java.lang.String r12 = "name"
                    int r11 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L81
                    java.lang.String r12 = "id"
                    int r13 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L81
                    java.lang.String r12 = "validLength"
                    int r14 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L81
                    java.lang.String r12 = "isAvailable"
                    int r15 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L81
                    java.util.ArrayList r16 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
                    int r17 = r8.getCount()     // Catch: java.lang.Throwable -> L81
                    r0 = r16
                    r1 = r17
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
                L37:
                    boolean r18 = r8.moveToNext()     // Catch: java.lang.Throwable -> L81
                    if (r18 == 0) goto L7d
                    boolean r18 = r8.isNull(r11)     // Catch: java.lang.Throwable -> L81
                    if (r18 == 0) goto L46
                    r19 = 0
                    goto L4a
                L46:
                    java.lang.String r19 = r8.getString(r11)     // Catch: java.lang.Throwable -> L81
                L4a:
                    boolean r18 = r8.isNull(r13)     // Catch: java.lang.Throwable -> L81
                    if (r18 == 0) goto L53
                    r20 = 0
                    goto L57
                L53:
                    java.lang.String r20 = r8.getString(r13)     // Catch: java.lang.Throwable -> L81
                L57:
                    int r17 = r8.getInt(r14)     // Catch: java.lang.Throwable -> L81
                    int r21 = r8.getInt(r15)     // Catch: java.lang.Throwable -> L81
                    if (r21 == 0) goto L64
                    r18 = 1
                    goto L66
                L64:
                    r18 = 0
                L66:
                    ai.kudi.agent.core.domain.room_entities.IdType r22 = new ai.kudi.agent.core.domain.room_entities.IdType     // Catch: java.lang.Throwable -> L81
                    r0 = r22
                    r1 = r19
                    r2 = r20
                    r3 = r17
                    r4 = r18
                    r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L81
                    r0 = r16
                    r1 = r22
                    r0.add(r1)     // Catch: java.lang.Throwable -> L81
                    goto L37
                L7d:
                    r8.close()
                    return r16
                L81:
                    r23 = move-exception
                    r8.close()
                    goto L86
                L86:
                    throw r23
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao_Impl.CallableC00694.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao
    public AbstractC11696w insertIdTypes(final List list) {
        AbstractC11696w $r2 = AbstractC11696w.m10439k(new Callable<List<Long>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.IdTypeDao_Impl.3
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
                IdTypeDao_Impl $r1 = IdTypeDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                $r22.beginTransaction();
                try {
                    IdTypeDao_Impl $r12 = IdTypeDao_Impl.this;
                    AbstractC1763c0 $r3 = $r12.__insertionAdapterOfIdType;
                    List $r4 = list;
                    List $r42 = $r3.insertAndReturnIdsList($r4);
                    IdTypeDao_Impl $r13 = IdTypeDao_Impl.this;
                    AbstractC1802o0 $r23 = $r13.__db;
                    $r23.setTransactionSuccessful();
                    return $r42;
                } finally {
                    IdTypeDao_Impl $r14 = IdTypeDao_Impl.this;
                    AbstractC1802o0 $r24 = $r14.__db;
                    $r24.endTransaction();
                }
            }
        });
        return $r2;
    }
}
