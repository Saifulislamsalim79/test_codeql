package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.bills.data.Product;
import ai.kudi.agent.core.domain.converters.ListConverters;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.ProductDao_Impl */
/* loaded from: classes.dex */
public final class ProductDao_Impl implements ProductDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<Product> __insertionAdapterOfProduct;
    private final ListConverters __listConverters;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductDao_Impl(AbstractC1802o0 abstractC1802o0) {
        ListConverters $r2 = new ListConverters();
        this.__listConverters = $r2;
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfProduct = new AbstractC1763c0<Product>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, Product product) {
                String $r3 = product.getId();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = product.getId();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = product.getName();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = product.getName();
                    interfaceC8101k.bindString(2, $r34);
                }
                Integer $r4 = product.getAmount();
                if ($r4 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    Integer $r42 = product.getAmount();
                    int $i1 = $r42.intValue();
                    long $l0 = $i1;
                    interfaceC8101k.bindLong(3, $l0);
                }
                String $r35 = product.getType();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r36 = product.getType();
                    interfaceC8101k.bindString(4, $r36);
                }
                ProductDao_Impl $r5 = ProductDao_Impl.this;
                ListConverters $r6 = $r5.__listConverters;
                List $r7 = product.getTypes();
                String $r37 = $r6.fromList($r7);
                if ($r37 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    interfaceC8101k.bindString(5, $r37);
                }
                int $i12 = product.getRequiresPhone();
                long $l02 = $i12;
                interfaceC8101k.bindLong(6, $l02);
                String $r38 = product.getBillerId();
                if ($r38 == null) {
                    interfaceC8101k.bindNull(7);
                } else {
                    String $r39 = product.getBillerId();
                    interfaceC8101k.bindString(7, $r39);
                }
                String $r310 = product.getLocalId();
                if ($r310 == null) {
                    interfaceC8101k.bindNull(8);
                } else {
                    String $r311 = product.getLocalId();
                    interfaceC8101k.bindString(8, $r311);
                }
                long $l03 = product.getAvailability() ? 1L : 0L;
                interfaceC8101k.bindLong(9, $l03);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, Product product) {
                Product $r3 = product;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Product` (`id`,`name`,`amount`,`type`,`types`,`requiresPhone`,`billerId`,`localId`,`availability`) VALUES (?,?,?,?,?,?,?,?,?)";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.ProductDao
    public AbstractC11696w fetchProducts() {
        final C1816r0 $r1 = C1816r0.m34466m("Select * from product WHERE availability = 1", 0);
        AbstractC11696w $r3 = C1823t0.m34459e(new Callable<List<Product>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<Product> call() throws Exception {
                List $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x006b */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.bills.data.Product> call2() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 314
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.ProductDao_Impl.CallableC00924.call2():java.util.List");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r12 = $r1;
                $r12.m34467J();
            }
        });
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.ProductDao
    public AbstractC11696w fetchProducts(String str) {
        final C1816r0 $r2 = C1816r0.m34466m("Select * from product where billerId=? AND availability = 1", 1);
        if (str == null) {
            $r2.bindNull(1);
        } else {
            $r2.bindString(1, str);
        }
        AbstractC11696w $r4 = C1823t0.m34459e(new Callable<List<Product>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<Product> call() throws Exception {
                List $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x006b */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.bills.data.Product> call2() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 314
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.ProductDao_Impl.CallableC00913.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.ProductDao
    public AbstractC11696w saveProducts(final List list) {
        AbstractC11696w $r2 = AbstractC11696w.m10439k(new Callable<List<Long>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.ProductDao_Impl.2
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
                ProductDao_Impl $r1 = ProductDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                $r22.beginTransaction();
                try {
                    ProductDao_Impl $r12 = ProductDao_Impl.this;
                    AbstractC1763c0 $r3 = $r12.__insertionAdapterOfProduct;
                    List $r4 = list;
                    List $r42 = $r3.insertAndReturnIdsList($r4);
                    ProductDao_Impl $r13 = ProductDao_Impl.this;
                    AbstractC1802o0 $r23 = $r13.__db;
                    $r23.setTransactionSuccessful();
                    return $r42;
                } finally {
                    ProductDao_Impl $r14 = ProductDao_Impl.this;
                    AbstractC1802o0 $r24 = $r14.__db;
                    $r24.endTransaction();
                }
            }
        });
        return $r2;
    }
}
