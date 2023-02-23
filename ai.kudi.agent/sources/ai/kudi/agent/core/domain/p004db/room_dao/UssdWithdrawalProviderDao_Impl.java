package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl */
/* loaded from: classes.dex */
public final class UssdWithdrawalProviderDao_Impl implements UssdWithdrawalProviderDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<UssdWithdrawalProvider> __insertionAdapterOfUssdWithdrawalProvider;
    private final AbstractC1841w0 __preparedStmtOfDeleteAllProviders;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalProviderDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfUssdWithdrawalProvider = new AbstractC1763c0<UssdWithdrawalProvider>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, UssdWithdrawalProvider ussdWithdrawalProvider) {
                String $r3 = ussdWithdrawalProvider.getApiBankName();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = ussdWithdrawalProvider.getApiBankName();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = ussdWithdrawalProvider.getBankName();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = ussdWithdrawalProvider.getBankName();
                    interfaceC8101k.bindString(2, $r34);
                }
                String $r35 = ussdWithdrawalProvider.getBankCode();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r36 = ussdWithdrawalProvider.getBankCode();
                    interfaceC8101k.bindString(3, $r36);
                }
                long $l0 = ussdWithdrawalProvider.getEnable() ? 1L : 0L;
                interfaceC8101k.bindLong(4, $l0);
                String $r37 = ussdWithdrawalProvider.getProcessor();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r38 = ussdWithdrawalProvider.getProcessor();
                    interfaceC8101k.bindString(5, $r38);
                }
                String $r39 = ussdWithdrawalProvider.getPrompt();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(6);
                } else {
                    String $r310 = ussdWithdrawalProvider.getPrompt();
                    interfaceC8101k.bindString(6, $r310);
                }
                String $r311 = ussdWithdrawalProvider.getUssdCode();
                if ($r311 == null) {
                    interfaceC8101k.bindNull(7);
                    return;
                }
                String $r312 = ussdWithdrawalProvider.getUssdCode();
                interfaceC8101k.bindString(7, $r312);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, UssdWithdrawalProvider ussdWithdrawalProvider) {
                UssdWithdrawalProvider $r3 = ussdWithdrawalProvider;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ussd_withdrawal_provider` (`api_bank_name`,`bank_name`,`bank_code`,`enable`,`processor`,`prompt`,`ussd_code`) VALUES (?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAllProviders = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM ussd_withdrawal_provider";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao
    public AbstractC11271b deleteAllProviders() {
        AbstractC11271b $r1 = AbstractC11271b.m11239l(new Callable<Void>() { // from class: ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl.4
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
                UssdWithdrawalProviderDao_Impl $r12 = UssdWithdrawalProviderDao_Impl.this;
                AbstractC1841w0 $r2 = $r12.__preparedStmtOfDeleteAllProviders;
                InterfaceC8101k $r3 = $r2.acquire();
                UssdWithdrawalProviderDao_Impl $r13 = UssdWithdrawalProviderDao_Impl.this;
                AbstractC1802o0 $r4 = $r13.__db;
                $r4.beginTransaction();
                try {
                    $r3.executeUpdateDelete();
                    UssdWithdrawalProviderDao_Impl $r14 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1802o0 $r42 = $r14.__db;
                    $r42.setTransactionSuccessful();
                    UssdWithdrawalProviderDao_Impl $r15 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1802o0 $r43 = $r15.__db;
                    $r43.endTransaction();
                    UssdWithdrawalProviderDao_Impl $r16 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1841w0 $r22 = $r16.__preparedStmtOfDeleteAllProviders;
                    $r22.release($r3);
                    return null;
                } catch (Throwable $r5) {
                    UssdWithdrawalProviderDao_Impl $r17 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1802o0 $r44 = $r17.__db;
                    $r44.endTransaction();
                    UssdWithdrawalProviderDao_Impl $r18 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1841w0 $r23 = $r18.__preparedStmtOfDeleteAllProviders;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao
    public AbstractC11688p fetchAllProviders() {
        final C1816r0 $r3 = C1816r0.m34466m("SELECT * FROM ussd_withdrawal_provider", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"ussd_withdrawal_provider"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<UssdWithdrawalProvider>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<UssdWithdrawalProvider> call() throws Exception {
                List $r12 = call2();
                return $r12;
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
            public java.util.List<ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider> call2() throws java.lang.Exception {
                /*
                    r34 = this;
                    r0 = r34
                    ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl r8 = ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao_Impl.this
                    androidx.room.o0 r9 = ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao_Impl.access$000(r8)
                    r0 = r34
                    androidx.room.r0 r10 = r2
                    r12 = 0
                    r13 = 0
                    android.database.Cursor r11 = androidx.room.p063z0.C1854c.m34419b(r9, r10, r12, r13)
                    java.lang.String r15 = "api_bank_name"
                    int r14 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.lang.String r15 = "bank_name"
                    int r16 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.lang.String r15 = "bank_code"
                    int r17 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.lang.String r15 = "enable"
                    int r18 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.lang.String r15 = "processor"
                    int r19 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.lang.String r15 = "prompt"
                    int r20 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.lang.String r15 = "ussd_code"
                    int r21 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> Le1
                    java.util.ArrayList r22 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
                    int r23 = r11.getCount()     // Catch: java.lang.Throwable -> Le1
                    r0 = r22
                    r1 = r23
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> Le1
                L49:
                    boolean r24 = r11.moveToNext()     // Catch: java.lang.Throwable -> Le1
                    if (r24 == 0) goto Ldd
                    boolean r24 = r11.isNull(r14)     // Catch: java.lang.Throwable -> Le1
                    if (r24 == 0) goto L58
                    r25 = 0
                    goto L5c
                L58:
                    java.lang.String r25 = r11.getString(r14)     // Catch: java.lang.Throwable -> Le1
                L5c:
                    r0 = r16
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le1
                    if (r24 == 0) goto L67
                    r26 = 0
                    goto L6d
                L67:
                    r0 = r16
                    java.lang.String r26 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le1
                L6d:
                    r0 = r17
                    boolean r24 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le1
                    if (r24 == 0) goto L78
                    r27 = 0
                    goto L7e
                L78:
                    r0 = r17
                    java.lang.String r27 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le1
                L7e:
                    r0 = r18
                    int r23 = r11.getInt(r0)     // Catch: java.lang.Throwable -> Le1
                    if (r23 == 0) goto L89
                    r24 = 1
                    goto L8b
                L89:
                    r24 = 0
                L8b:
                    r0 = r19
                    boolean r28 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le1
                    if (r28 == 0) goto L96
                    r29 = 0
                    goto L9c
                L96:
                    r0 = r19
                    java.lang.String r29 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le1
                L9c:
                    r0 = r20
                    boolean r28 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le1
                    if (r28 == 0) goto La7
                    r30 = 0
                    goto Lad
                La7:
                    r0 = r20
                    java.lang.String r30 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le1
                Lad:
                    r0 = r21
                    boolean r28 = r11.isNull(r0)     // Catch: java.lang.Throwable -> Le1
                    if (r28 == 0) goto Lb8
                    r31 = 0
                    goto Lbe
                Lb8:
                    r0 = r21
                    java.lang.String r31 = r11.getString(r0)     // Catch: java.lang.Throwable -> Le1
                Lbe:
                    ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider r32 = new ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider     // Catch: java.lang.Throwable -> Le1
                    r0 = r32
                    r1 = r25
                    r2 = r26
                    r3 = r27
                    r4 = r24
                    r5 = r29
                    r6 = r30
                    r7 = r31
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le1
                    r0 = r22
                    r1 = r32
                    r0.add(r1)     // Catch: java.lang.Throwable -> Le1
                    goto L49
                Ldd:
                    r11.close()
                    return r22
                Le1:
                    r33 = move-exception
                    r11.close()
                    goto Le6
                Le6:
                    throw r33
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao_Impl.CallableC01155.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao
    public AbstractC11271b insertProviders(final List list) {
        AbstractC11271b $r2 = AbstractC11271b.m11239l(new Callable<Void>() { // from class: ai.kudi.agent.core.domain.db.room_dao.UssdWithdrawalProviderDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
                Void $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            public Void call2() throws Exception {
                UssdWithdrawalProviderDao_Impl $r1 = UssdWithdrawalProviderDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                $r22.beginTransaction();
                try {
                    UssdWithdrawalProviderDao_Impl $r12 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1763c0 $r3 = $r12.__insertionAdapterOfUssdWithdrawalProvider;
                    List $r4 = list;
                    $r3.insert((Iterable) $r4);
                    UssdWithdrawalProviderDao_Impl $r13 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1802o0 $r23 = $r13.__db;
                    $r23.setTransactionSuccessful();
                    UssdWithdrawalProviderDao_Impl $r14 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1802o0 $r24 = $r14.__db;
                    $r24.endTransaction();
                    return null;
                } catch (Throwable $r5) {
                    UssdWithdrawalProviderDao_Impl $r15 = UssdWithdrawalProviderDao_Impl.this;
                    AbstractC1802o0 $r25 = $r15.__db;
                    $r25.endTransaction();
                    throw $r5;
                }
            }
        });
        return $r2;
    }
}
