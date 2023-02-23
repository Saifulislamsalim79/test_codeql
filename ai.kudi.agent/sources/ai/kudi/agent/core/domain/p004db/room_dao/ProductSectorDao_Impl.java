package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.ProductSectorEntity;
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
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.ProductSectorDao_Impl */
/* loaded from: classes.dex */
public final class ProductSectorDao_Impl implements ProductSectorDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<ProductSectorEntity> __insertionAdapterOfProductSectorEntity;
    private final AbstractC1841w0 __preparedStmtOfDeleteProductSectors;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSectorDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfProductSectorEntity = new AbstractC1763c0<ProductSectorEntity>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductSectorDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, ProductSectorEntity productSectorEntity) {
                Integer $r3 = productSectorEntity.getId();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    Integer $r32 = productSectorEntity.getId();
                    int $i1 = $r32.intValue();
                    long $l0 = $i1;
                    interfaceC8101k.bindLong(1, $l0);
                }
                String $r4 = productSectorEntity.getName();
                if ($r4 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r42 = productSectorEntity.getName();
                    interfaceC8101k.bindString(2, $r42);
                }
                String $r43 = productSectorEntity.getNameSlugified();
                if ($r43 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r44 = productSectorEntity.getNameSlugified();
                    interfaceC8101k.bindString(3, $r44);
                }
                String $r45 = productSectorEntity.getStatus();
                if ($r45 == null) {
                    interfaceC8101k.bindNull(4);
                    return;
                }
                String $r46 = productSectorEntity.getStatus();
                interfaceC8101k.bindString(4, $r46);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, ProductSectorEntity productSectorEntity) {
                ProductSectorEntity $r3 = productSectorEntity;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `product_sectors` (`id`,`name`,`nameSlugified`,`status`) VALUES (?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteProductSectors = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductSectorDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from product_sectors";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao
    public void deleteProductSectors() {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1841w0 $r3 = this.__preparedStmtOfDeleteProductSectors;
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
            AbstractC1841w0 $r32 = this.__preparedStmtOfDeleteProductSectors;
            $r32.release($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao
    public AbstractC11688p fetchAllProductSectors() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from product_sectors", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"product_sectors"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<ProductSectorEntity>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductSectorDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<ProductSectorEntity> call() throws Exception {
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
            public java.util.List<ai.kudi.agent.core.domain.room_entities.ProductSectorEntity> call2() throws java.lang.Exception {
                /*
                    r25 = this;
                    r0 = r25
                    ai.kudi.agent.core.domain.db.room_dao.ProductSectorDao_Impl r5 = ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao_Impl.this
                    androidx.room.o0 r6 = ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao_Impl.access$000(r5)
                    r0 = r25
                    androidx.room.r0 r7 = r2
                    r9 = 0
                    r10 = 0
                    android.database.Cursor r8 = androidx.room.p063z0.C1854c.m34419b(r6, r7, r9, r10)
                    java.lang.String r12 = "id"
                    int r11 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L92
                    java.lang.String r12 = "name"
                    int r13 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L92
                    java.lang.String r12 = "nameSlugified"
                    int r14 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L92
                    java.lang.String r12 = "status"
                    int r15 = androidx.room.p063z0.C1853b.m34421e(r8, r12)     // Catch: java.lang.Throwable -> L92
                    java.util.ArrayList r16 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
                    int r17 = r8.getCount()     // Catch: java.lang.Throwable -> L92
                    r0 = r16
                    r1 = r17
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L92
                L37:
                    boolean r18 = r8.moveToNext()     // Catch: java.lang.Throwable -> L92
                    if (r18 == 0) goto L8e
                    boolean r18 = r8.isNull(r11)     // Catch: java.lang.Throwable -> L92
                    if (r18 == 0) goto L46
                    r19 = 0
                    goto L50
                L46:
                    int r17 = r8.getInt(r11)     // Catch: java.lang.Throwable -> L92
                    r0 = r17
                    java.lang.Integer r19 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L92
                L50:
                    boolean r18 = r8.isNull(r13)     // Catch: java.lang.Throwable -> L92
                    if (r18 == 0) goto L59
                    r20 = 0
                    goto L5d
                L59:
                    java.lang.String r20 = r8.getString(r13)     // Catch: java.lang.Throwable -> L92
                L5d:
                    boolean r18 = r8.isNull(r14)     // Catch: java.lang.Throwable -> L92
                    if (r18 == 0) goto L66
                    r21 = 0
                    goto L6a
                L66:
                    java.lang.String r21 = r8.getString(r14)     // Catch: java.lang.Throwable -> L92
                L6a:
                    boolean r18 = r8.isNull(r15)     // Catch: java.lang.Throwable -> L92
                    if (r18 == 0) goto L73
                    r22 = 0
                    goto L77
                L73:
                    java.lang.String r22 = r8.getString(r15)     // Catch: java.lang.Throwable -> L92
                L77:
                    ai.kudi.agent.core.domain.room_entities.ProductSectorEntity r23 = new ai.kudi.agent.core.domain.room_entities.ProductSectorEntity     // Catch: java.lang.Throwable -> L92
                    r0 = r23
                    r1 = r19
                    r2 = r20
                    r3 = r21
                    r4 = r22
                    r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L92
                    r0 = r16
                    r1 = r23
                    r0.add(r1)     // Catch: java.lang.Throwable -> L92
                    goto L37
                L8e:
                    r8.close()
                    return r16
                L92:
                    r24 = move-exception
                    r8.close()
                    goto L97
                L97:
                    throw r24
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao_Impl.CallableC00953.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao
    public void insertProductSectors(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfProductSectorEntity;
            $r3.insert((Iterable) list);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }
}
