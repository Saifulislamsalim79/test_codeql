package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.PinEntity;
import android.database.Cursor;
import androidx.room.AbstractC1761b0;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import androidx.room.EmptyResultSetException;
import androidx.room.p063z0.C1853b;
import androidx.room.p063z0.C1854c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.PinCredentialsDao_Impl */
/* loaded from: classes.dex */
public final class PinCredentialsDao_Impl implements PinCredentialsDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1761b0<PinEntity> __deletionAdapterOfPinEntity;
    private final AbstractC1763c0<PinEntity> __insertionAdapterOfPinEntity;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PinCredentialsDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfPinEntity = new AbstractC1763c0<PinEntity>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.PinCredentialsDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, PinEntity pinEntity) {
                String $r3 = pinEntity.getPhoneNumber();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = pinEntity.getPhoneNumber();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = pinEntity.getEncodedPin();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                    return;
                }
                String $r34 = pinEntity.getEncodedPin();
                interfaceC8101k.bindString(2, $r34);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, PinEntity pinEntity) {
                PinEntity $r3 = pinEntity;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `agent_credentials` (`phoneNumber`,`encodedPin`) VALUES (?,?)";
            }
        };
        this.__deletionAdapterOfPinEntity = new AbstractC1761b0<PinEntity>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.PinCredentialsDao_Impl.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, PinEntity pinEntity) {
                String $r3 = pinEntity.getPhoneNumber();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                    return;
                }
                String $r32 = pinEntity.getPhoneNumber();
                interfaceC8101k.bindString(1, $r32);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1761b0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, PinEntity pinEntity) {
                PinEntity $r3 = pinEntity;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1761b0, androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM `agent_credentials` WHERE `phoneNumber` = ?";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao
    public void deletePin(PinEntity pinEntity) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1761b0 $r3 = this.__deletionAdapterOfPinEntity;
            $r3.handle(pinEntity);
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao
    public AbstractC11696w getPin(String str) {
        final C1816r0 $r2 = C1816r0.m34466m("SELECT * FROM agent_credentials WHERE phoneNumber=? LIMIT 1", 1);
        if (str == null) {
            $r2.bindNull(1);
        } else {
            $r2.bindString(1, str);
        }
        AbstractC11696w $r4 = C1823t0.m34459e(new Callable<PinEntity>() { // from class: ai.kudi.agent.core.domain.db.room_dao.PinCredentialsDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PinEntity call() throws Exception {
                PinCredentialsDao_Impl $r1 = PinCredentialsDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                C1816r0 $r3 = $r2;
                Object $r42 = null;
                Cursor $r5 = C1854c.m34419b($r22, $r3, false, null);
                try {
                    int $i0 = C1853b.m34421e($r5, "phoneNumber");
                    int $i1 = C1853b.m34421e($r5, "encodedPin");
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
                        Object r12 = new PinEntity($r6, $r72);
                        $r42 = r12;
                    }
                    if ($r42 != null) {
                        $r5.close();
                        PinEntity $r8 = (PinEntity) $r42;
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
            public /* bridge */ /* synthetic */ PinEntity call() throws Exception {
                PinEntity $r1 = call();
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao
    public AbstractC11696w insertPin(final PinEntity pinEntity) {
        AbstractC11696w $r2 = AbstractC11696w.m10439k(new Callable<Long>() { // from class: ai.kudi.agent.core.domain.db.room_dao.PinCredentialsDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                PinCredentialsDao_Impl $r1 = PinCredentialsDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                $r22.beginTransaction();
                try {
                    PinCredentialsDao_Impl $r12 = PinCredentialsDao_Impl.this;
                    AbstractC1763c0 $r3 = $r12.__insertionAdapterOfPinEntity;
                    PinEntity $r4 = pinEntity;
                    long $l0 = $r3.insertAndReturnId($r4);
                    PinCredentialsDao_Impl $r13 = PinCredentialsDao_Impl.this;
                    AbstractC1802o0 $r23 = $r13.__db;
                    $r23.setTransactionSuccessful();
                    Long $r5 = Long.valueOf($l0);
                    return $r5;
                } finally {
                    PinCredentialsDao_Impl $r14 = PinCredentialsDao_Impl.this;
                    AbstractC1802o0 $r24 = $r14.__db;
                    $r24.endTransaction();
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Long call() throws Exception {
                Long $r1 = call();
                return $r1;
            }
        });
        return $r2;
    }
}
