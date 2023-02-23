package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.payments.domain.dto.PaymentMethod;
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
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.PaymentMethodDao_Impl */
/* loaded from: classes.dex */
public final class PaymentMethodDao_Impl implements PaymentMethodDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<PaymentMethod> __insertionAdapterOfPaymentMethod;
    private final AbstractC1841w0 __preparedStmtOfDeleteAll;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PaymentMethodDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfPaymentMethod = new AbstractC1763c0<PaymentMethod>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.PaymentMethodDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void bind(InterfaceC8101k interfaceC8101k, ai.kudi.agent.payments.domain.wiki.PaymentMethod paymentMethod) {
                long $l0 = paymentMethod.getId();
                interfaceC8101k.bindLong(1, $l0);
                long $l02 = paymentMethod.getType();
                interfaceC8101k.bindLong(2, $l02);
                String $r3 = paymentMethod.getCardNo();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r32 = paymentMethod.getCardNo();
                    interfaceC8101k.bindString(3, $r32);
                }
                String $r33 = paymentMethod.getToken();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r34 = paymentMethod.getToken();
                    interfaceC8101k.bindString(4, $r34);
                }
                Integer $r4 = paymentMethod.getAmount();
                if ($r4 == null) {
                    interfaceC8101k.bindNull(5);
                    return;
                }
                Integer $r42 = paymentMethod.getAmount();
                int $i1 = $r42.intValue();
                long $l03 = $i1;
                interfaceC8101k.bindLong(5, $l03);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, PaymentMethod paymentMethod) {
                ai.kudi.agent.payments.domain.wiki.PaymentMethod $r3 = (ai.kudi.agent.payments.domain.wiki.PaymentMethod) paymentMethod;
                bind(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `payment_method` (`id`,`type`,`cardNo`,`token`,`amount`) VALUES (?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.PaymentMethodDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from payment_method";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao
    public void addPaymentMethods(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfPaymentMethod;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao
    public AbstractC11688p getAllPaymentMethods() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from payment_method", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"payment_method"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<PaymentMethod>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.PaymentMethodDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<PaymentMethod> call() throws Exception {
                List $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x0041 */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.payments.domain.dto.PaymentMethod> call2() throws java.lang.Exception {
                /*
                    r32 = this;
                    r0 = r32
                    ai.kudi.agent.core.domain.db.room_dao.PaymentMethodDao_Impl r8 = ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao_Impl.this
                    androidx.room.o0 r9 = ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao_Impl.access$000(r8)
                    r0 = r32
                    androidx.room.r0 r10 = r2
                    r12 = 0
                    r13 = 0
                    android.database.Cursor r11 = androidx.room.p063z0.C1854c.m34419b(r9, r10, r12, r13)
                    java.lang.String r15 = "id"
                    int r14 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> La3
                    java.lang.String r15 = "type"
                    int r16 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> La3
                    java.lang.String r15 = "cardNo"
                    int r17 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> La3
                    java.lang.String r15 = "token"
                    int r18 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> La3
                    java.lang.String r15 = "amount"
                    int r19 = androidx.room.p063z0.C1853b.m34421e(r11, r15)     // Catch: java.lang.Throwable -> La3
                    java.util.ArrayList r20 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La3
                    int r21 = r11.getCount()     // Catch: java.lang.Throwable -> La3
                    r0 = r20
                    r1 = r21
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> La3
                L3d:
                    boolean r22 = r11.moveToNext()     // Catch: java.lang.Throwable -> La3
                    if (r22 == 0) goto L9f
                    long r23 = r11.getLong(r14)     // Catch: java.lang.Throwable -> La3
                    r0 = r16
                    long r25 = r11.getLong(r0)     // Catch: java.lang.Throwable -> La3
                    r0 = r17
                    boolean r22 = r11.isNull(r0)     // Catch: java.lang.Throwable -> La3
                    if (r22 == 0) goto L58
                    r27 = 0
                    goto L5e
                L58:
                    r0 = r17
                    java.lang.String r27 = r11.getString(r0)     // Catch: java.lang.Throwable -> La3
                L5e:
                    r0 = r18
                    boolean r22 = r11.isNull(r0)     // Catch: java.lang.Throwable -> La3
                    if (r22 == 0) goto L69
                    r28 = 0
                    goto L6f
                L69:
                    r0 = r18
                    java.lang.String r28 = r11.getString(r0)     // Catch: java.lang.Throwable -> La3
                L6f:
                    r0 = r19
                    boolean r22 = r11.isNull(r0)     // Catch: java.lang.Throwable -> La3
                    if (r22 == 0) goto L7a
                    r29 = 0
                    goto L86
                L7a:
                    r0 = r19
                    int r21 = r11.getInt(r0)     // Catch: java.lang.Throwable -> La3
                    r0 = r21
                    java.lang.Integer r29 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La3
                L86:
                    ai.kudi.agent.payments.domain.wiki.PaymentMethod r30 = new ai.kudi.agent.payments.domain.wiki.PaymentMethod     // Catch: java.lang.Throwable -> La3
                    r0 = r30
                    r1 = r23
                    r3 = r25
                    r5 = r27
                    r6 = r28
                    r7 = r29
                    r0.<init>(r1, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> La3
                    r0 = r20
                    r1 = r30
                    r0.add(r1)     // Catch: java.lang.Throwable -> La3
                    goto L3d
                L9f:
                    r11.close()
                    return r20
                La3:
                    r31 = move-exception
                    r11.close()
                    goto La8
                La8:
                    throw r31
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao_Impl.CallableC00843.call2():java.util.List");
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
