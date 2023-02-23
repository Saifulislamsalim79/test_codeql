package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.converters.BigDecimalTypeConverter;
import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl */
/* loaded from: classes.dex */
public final class KycLevelsDao_Impl implements KycLevelsDao {
    private final BigDecimalTypeConverter __bigDecimalTypeConverter;
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<KycLevelsModel> __insertionAdapterOfKycLevelsModel;
    private final AbstractC1841w0 __preparedStmtOfDeleteAll;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KycLevelsDao_Impl(AbstractC1802o0 abstractC1802o0) {
        BigDecimalTypeConverter $r2 = new BigDecimalTypeConverter();
        this.__bigDecimalTypeConverter = $r2;
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfKycLevelsModel = new AbstractC1763c0<KycLevelsModel>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, KycLevelsModel kycLevelsModel) {
                int $i0 = kycLevelsModel.getId();
                long $l1 = $i0;
                interfaceC8101k.bindLong(1, $l1);
                KycLevelsDao_Impl $r3 = KycLevelsDao_Impl.this;
                BigDecimalTypeConverter $r4 = $r3.__bigDecimalTypeConverter;
                BigDecimal $r5 = kycLevelsModel.getMonthlyWithdrawalLimit();
                Long $r6 = $r4.fromBigDecimal($r5);
                if ($r6 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    long $l12 = $r6.longValue();
                    interfaceC8101k.bindLong(2, $l12);
                }
                KycLevelsDao_Impl $r32 = KycLevelsDao_Impl.this;
                BigDecimalTypeConverter $r42 = $r32.__bigDecimalTypeConverter;
                BigDecimal $r52 = kycLevelsModel.getMonthlyTransferLimit();
                Long $r62 = $r42.fromBigDecimal($r52);
                if ($r62 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    long $l13 = $r62.longValue();
                    interfaceC8101k.bindLong(3, $l13);
                }
                String $r7 = kycLevelsModel.getMonthlyWalletTopUpLimit();
                if ($r7 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r72 = kycLevelsModel.getMonthlyWalletTopUpLimit();
                    interfaceC8101k.bindString(4, $r72);
                }
                String $r73 = kycLevelsModel.getKycLevel();
                if ($r73 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r74 = kycLevelsModel.getKycLevel();
                    interfaceC8101k.bindString(5, $r74);
                }
                String $r75 = kycLevelsModel.getName();
                if ($r75 == null) {
                    interfaceC8101k.bindNull(6);
                    return;
                }
                String $r76 = kycLevelsModel.getName();
                interfaceC8101k.bindString(6, $r76);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, KycLevelsModel kycLevelsModel) {
                KycLevelsModel $r3 = kycLevelsModel;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `kyc_level_data` (`id`,`monthlyWithdrawalLimit`,`monthlyTransferLimit`,`monthlyWalletTopUpLimit`,`kycLevel`,`name`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from kyc_level_data";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao
    public void addAllLevels(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfKycLevelsModel;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao
    public void deleteAll() {
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao
    public AbstractC11688p getKycLevels() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from kyc_level_data", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"kyc_level_data"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<KycLevelsModel>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<KycLevelsModel> call() throws Exception {
                List $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x0047 */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.KycLevelsModel> call2() throws java.lang.Exception {
                /*
                    r34 = this;
                    r0 = r34
                    ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl r7 = ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.this
                    androidx.room.o0 r8 = ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.access$100(r7)
                    r0 = r34
                    androidx.room.r0 r9 = r2
                    r11 = 0
                    r12 = 0
                    android.database.Cursor r10 = androidx.room.p063z0.C1854c.m34419b(r8, r9, r11, r12)
                    java.lang.String r14 = "id"
                    int r13 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Leb
                    java.lang.String r14 = "monthlyWithdrawalLimit"
                    int r15 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Leb
                    java.lang.String r14 = "monthlyTransferLimit"
                    int r16 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Leb
                    java.lang.String r14 = "monthlyWalletTopUpLimit"
                    int r17 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Leb
                    java.lang.String r14 = "kycLevel"
                    int r18 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Leb
                    java.lang.String r14 = "name"
                    int r19 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Leb
                    java.util.ArrayList r20 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
                    int r21 = r10.getCount()     // Catch: java.lang.Throwable -> Leb
                    r0 = r20
                    r1 = r21
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> Leb
                L43:
                    boolean r22 = r10.moveToNext()     // Catch: java.lang.Throwable -> Leb
                    if (r22 == 0) goto Le7
                    int r21 = r10.getInt(r13)     // Catch: java.lang.Throwable -> Leb
                    boolean r22 = r10.isNull(r15)     // Catch: java.lang.Throwable -> Leb
                    if (r22 == 0) goto L56
                    r23 = 0
                    goto L60
                L56:
                    long r24 = r10.getLong(r15)     // Catch: java.lang.Throwable -> Leb
                    r0 = r24
                    java.lang.Long r23 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Leb
                L60:
                    r0 = r34
                    ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl r7 = ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.this     // Catch: java.lang.Throwable -> Leb
                    ai.kudi.agent.core.domain.converters.BigDecimalTypeConverter r26 = ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.access$000(r7)     // Catch: java.lang.Throwable -> Leb
                    r0 = r26
                    r1 = r23
                    java.math.BigDecimal r27 = r0.fromLong(r1)     // Catch: java.lang.Throwable -> Leb
                    r0 = r16
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Leb
                    if (r22 == 0) goto L7b
                    r23 = 0
                    goto L87
                L7b:
                    r0 = r16
                    long r24 = r10.getLong(r0)     // Catch: java.lang.Throwable -> Leb
                    r0 = r24
                    java.lang.Long r23 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Leb
                L87:
                    r0 = r34
                    ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao_Impl r7 = ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.this     // Catch: java.lang.Throwable -> Leb
                    ai.kudi.agent.core.domain.converters.BigDecimalTypeConverter r26 = ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.access$000(r7)     // Catch: java.lang.Throwable -> Leb
                    r0 = r26
                    r1 = r23
                    java.math.BigDecimal r28 = r0.fromLong(r1)     // Catch: java.lang.Throwable -> Leb
                    r0 = r17
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Leb
                    if (r22 == 0) goto La2
                    r29 = 0
                    goto La8
                La2:
                    r0 = r17
                    java.lang.String r29 = r10.getString(r0)     // Catch: java.lang.Throwable -> Leb
                La8:
                    r0 = r18
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Leb
                    if (r22 == 0) goto Lb3
                    r30 = 0
                    goto Lb9
                Lb3:
                    r0 = r18
                    java.lang.String r30 = r10.getString(r0)     // Catch: java.lang.Throwable -> Leb
                Lb9:
                    r0 = r19
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Leb
                    if (r22 == 0) goto Lc4
                    r31 = 0
                    goto Lca
                Lc4:
                    r0 = r19
                    java.lang.String r31 = r10.getString(r0)     // Catch: java.lang.Throwable -> Leb
                Lca:
                    ai.kudi.agent.core.domain.room_entities.KycLevelsModel r32 = new ai.kudi.agent.core.domain.room_entities.KycLevelsModel     // Catch: java.lang.Throwable -> Leb
                    r0 = r32
                    r1 = r21
                    r2 = r27
                    r3 = r28
                    r4 = r29
                    r5 = r30
                    r6 = r31
                    r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Leb
                    r0 = r20
                    r1 = r32
                    r0.add(r1)     // Catch: java.lang.Throwable -> Leb
                    goto L43
                Le7:
                    r10.close()
                    return r20
                Leb:
                    r33 = move-exception
                    r10.close()
                    goto Lf0
                Lf0:
                    throw r33
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl.CallableC00793.call2():java.util.List");
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
}
