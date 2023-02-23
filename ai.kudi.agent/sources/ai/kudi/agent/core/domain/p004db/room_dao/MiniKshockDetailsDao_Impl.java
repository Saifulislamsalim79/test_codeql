package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.converters.BigDecimalTypeConverter;
import ai.kudi.agent.core.domain.room_entities.MiniKshockDetails;
import android.database.Cursor;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import androidx.room.p063z0.C1853b;
import androidx.room.p063z0.C1854c;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.MiniKshockDetailsDao_Impl */
/* loaded from: classes.dex */
public final class MiniKshockDetailsDao_Impl implements MiniKshockDetailsDao {
    private final BigDecimalTypeConverter __bigDecimalTypeConverter;
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<MiniKshockDetails> __insertionAdapterOfMiniKshockDetails;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MiniKshockDetailsDao_Impl(AbstractC1802o0 abstractC1802o0) {
        BigDecimalTypeConverter $r2 = new BigDecimalTypeConverter();
        this.__bigDecimalTypeConverter = $r2;
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfMiniKshockDetails = new AbstractC1763c0<MiniKshockDetails>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.MiniKshockDetailsDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, MiniKshockDetails miniKshockDetails) {
                int $i0 = miniKshockDetails.getId();
                long $l1 = $i0;
                interfaceC8101k.bindLong(1, $l1);
                MiniKshockDetailsDao_Impl $r3 = MiniKshockDetailsDao_Impl.this;
                BigDecimalTypeConverter $r4 = $r3.__bigDecimalTypeConverter;
                BigDecimal $r5 = miniKshockDetails.getAvailableLoanAmount();
                Long $r6 = $r4.fromBigDecimal($r5);
                if ($r6 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    long $l12 = $r6.longValue();
                    interfaceC8101k.bindLong(2, $l12);
                }
                MiniKshockDetailsDao_Impl $r32 = MiniKshockDetailsDao_Impl.this;
                BigDecimalTypeConverter $r42 = $r32.__bigDecimalTypeConverter;
                BigDecimal $r52 = miniKshockDetails.getMaxLoanAmount();
                Long $r62 = $r42.fromBigDecimal($r52);
                if ($r62 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    long $l13 = $r62.longValue();
                    interfaceC8101k.bindLong(3, $l13);
                }
                Integer $r7 = miniKshockDetails.getTenure();
                if ($r7 == null) {
                    interfaceC8101k.bindNull(4);
                    return;
                }
                Integer $r72 = miniKshockDetails.getTenure();
                int $i02 = $r72.intValue();
                long $l14 = $i02;
                interfaceC8101k.bindLong(4, $l14);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, MiniKshockDetails miniKshockDetails) {
                MiniKshockDetails $r3 = miniKshockDetails;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `mini_kshock_details` (`id`,`availableLoanAmount`,`maxLoanAmount`,`tenure`) VALUES (?,?,?,?)";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.MiniKshockDetailsDao
    public AbstractC11688p getMiniKshockDetails() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from mini_kshock_details where id = 0", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"mini_kshock_details"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<MiniKshockDetails>() { // from class: ai.kudi.agent.core.domain.db.room_dao.MiniKshockDetailsDao_Impl.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public MiniKshockDetails call() throws Exception {
                Long $r6;
                Long $r62;
                MiniKshockDetailsDao_Impl $r12 = MiniKshockDetailsDao_Impl.this;
                AbstractC1802o0 $r2 = $r12.__db;
                C1816r0 $r32 = $r3;
                Object $r42 = null;
                Cursor $r52 = C1854c.m34419b($r2, $r32, false, null);
                try {
                    int $i0 = C1853b.m34421e($r52, "id");
                    int $i1 = C1853b.m34421e($r52, "availableLoanAmount");
                    int $i2 = C1853b.m34421e($r52, "maxLoanAmount");
                    int $i3 = C1853b.m34421e($r52, "tenure");
                    boolean $z0 = $r52.moveToFirst();
                    if ($z0) {
                        int $i02 = $r52.getInt($i0);
                        boolean $z02 = $r52.isNull($i1);
                        if ($z02) {
                            $r6 = null;
                        } else {
                            long $l4 = $r52.getLong($i1);
                            $r6 = Long.valueOf($l4);
                        }
                        MiniKshockDetailsDao_Impl $r13 = MiniKshockDetailsDao_Impl.this;
                        BigDecimalTypeConverter $r7 = $r13.__bigDecimalTypeConverter;
                        BigDecimal $r8 = $r7.fromLong($r6);
                        boolean $z03 = $r52.isNull($i2);
                        if ($z03) {
                            $r62 = null;
                        } else {
                            long $l42 = $r52.getLong($i2);
                            $r62 = Long.valueOf($l42);
                        }
                        MiniKshockDetailsDao_Impl $r14 = MiniKshockDetailsDao_Impl.this;
                        BigDecimalTypeConverter $r72 = $r14.__bigDecimalTypeConverter;
                        BigDecimal $r9 = $r72.fromLong($r62);
                        boolean $z04 = $r52.isNull($i3);
                        if (!$z04) {
                            Object $r10 = Integer.valueOf($r52.getInt($i3));
                            $r42 = $r10;
                        }
                        Integer $r102 = (Integer) $r42;
                        Object r13 = new MiniKshockDetails($i02, $r8, $r9, $r102);
                        $r42 = r13;
                    }
                    $r52.close();
                    MiniKshockDetails $r11 = (MiniKshockDetails) $r42;
                    return $r11;
                } catch (Throwable $r122) {
                    $r52.close();
                    throw $r122;
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ MiniKshockDetails call() throws Exception {
                MiniKshockDetails $r12 = call();
                return $r12;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.MiniKshockDetailsDao
    public void insert(MiniKshockDetails miniKshockDetails) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfMiniKshockDetails;
            $r3.insert((AbstractC1763c0) miniKshockDetails);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }
}
