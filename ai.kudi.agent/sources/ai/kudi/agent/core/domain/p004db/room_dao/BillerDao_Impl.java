package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.bills.data.Biller;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13666w;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl */
/* loaded from: classes.dex */
public final class BillerDao_Impl implements BillerDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<Biller> __insertionAdapterOfBiller;
    private final AbstractC1841w0 __preparedStmtOfUpdateBillers;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillerDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfBiller = new AbstractC1763c0<Biller>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, Biller biller) {
                String $r3 = biller.getLookupId();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = biller.getLookupId();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = biller.getName();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = biller.getName();
                    interfaceC8101k.bindString(2, $r34);
                }
                String $r35 = biller.getNamePrompt();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r36 = biller.getNamePrompt();
                    interfaceC8101k.bindString(3, $r36);
                }
                String $r37 = biller.getImage();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r38 = biller.getImage();
                    interfaceC8101k.bindString(4, $r38);
                }
                String $r39 = biller.getHeader();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r310 = biller.getHeader();
                    interfaceC8101k.bindString(5, $r310);
                }
                long $l0 = biller.getAvailability() ? 1L : 0L;
                interfaceC8101k.bindLong(6, $l0);
                String $r311 = biller.getPromptType();
                if ($r311 == null) {
                    interfaceC8101k.bindNull(7);
                } else {
                    String $r312 = biller.getPromptType();
                    interfaceC8101k.bindString(7, $r312);
                }
                boolean $z0 = biller.getShouldUseProductForLookUp();
                long $l02 = $z0 ? 1L : 0L;
                interfaceC8101k.bindLong(8, $l02);
                int $i1 = biller.getUsageFrequency();
                long $l03 = $i1;
                interfaceC8101k.bindLong(9, $l03);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, Biller biller) {
                Biller $r3 = biller;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Biller` (`lookupId`,`name`,`namePrompt`,`image`,`header`,`availability`,`promptType`,`shouldUseProductForLookUp`,`usageFrequency`) VALUES (?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfUpdateBillers = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "Update biller SET usageFrequency=? WHERE lookupId=?";
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0028 */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BillerDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p425j.p444e.AbstractC11696w getBillersWithoutData(java.util.List r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = androidx.room.p063z0.C1857f.m34413b()
            java.lang.String r1 = "Select * from biller where lookupId NOT IN ("
            r0.append(r1)
            int r2 = r12.size()
            androidx.room.p063z0.C1857f.m34414a(r0, r2)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            int r2 = r2 + 0
            androidx.room.r0 r4 = androidx.room.C1816r0.m34466m(r3, r2)
            java.util.Iterator r5 = r12.iterator()
            r2 = 1
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r3 = r8
            if (r3 != 0) goto L38
            r4.bindNull(r2)
            goto L3b
        L38:
            r4.bindString(r2, r3)
        L3b:
            int r2 = r2 + 1
            goto L24
        L3e:
            ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl$6 r9 = new ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl$6
            r9.<init>()
            j.e.w r10 = androidx.room.C1823t0.m34459e(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.BillerDao_Impl.getBillersWithoutData(java.util.List):j.e.w");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0028 */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BillerDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p425j.p444e.AbstractC11696w getFrequentlyUsedBillers(java.util.List r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = androidx.room.p063z0.C1857f.m34413b()
            java.lang.String r1 = "Select * from biller where lookupId NOT IN ("
            r0.append(r1)
            int r2 = r12.size()
            androidx.room.p063z0.C1857f.m34414a(r0, r2)
            java.lang.String r1 = ") AND availability = 1 order by usageFrequency DESC LIMIT 8"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            int r2 = r2 + 0
            androidx.room.r0 r4 = androidx.room.C1816r0.m34466m(r3, r2)
            java.util.Iterator r5 = r12.iterator()
            r2 = 1
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r3 = r8
            if (r3 != 0) goto L38
            r4.bindNull(r2)
            goto L3b
        L38:
            r4.bindString(r2, r3)
        L3b:
            int r2 = r2 + 1
            goto L24
        L3e:
            ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl$5 r9 = new ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl$5
            r9.<init>()
            j.e.w r10 = androidx.room.C1823t0.m34459e(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.BillerDao_Impl.getFrequentlyUsedBillers(java.util.List):j.e.w");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BillerDao
    public AbstractC11696w getNetworksForAirtimeAndData(String str) {
        final C1816r0 $r2 = C1816r0.m34466m("Select * from biller where header = ?", 1);
        if (str == null) {
            $r2.bindNull(1);
        } else {
            $r2.bindString(1, str);
        }
        AbstractC11696w $r4 = C1823t0.m34459e(new Callable<List<Biller>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<Biller> call() throws Exception {
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
            public java.util.List<ai.kudi.agent.bills.data.Biller> call2() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 288
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.BillerDao_Impl.CallableC00657.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BillerDao
    public AbstractC11696w saveBillers(final List list) {
        AbstractC11696w $r2 = AbstractC11696w.m10439k(new Callable<List<Long>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl.3
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
                BillerDao_Impl $r1 = BillerDao_Impl.this;
                AbstractC1802o0 $r22 = $r1.__db;
                $r22.beginTransaction();
                try {
                    BillerDao_Impl $r12 = BillerDao_Impl.this;
                    AbstractC1763c0 $r3 = $r12.__insertionAdapterOfBiller;
                    List $r4 = list;
                    List $r42 = $r3.insertAndReturnIdsList($r4);
                    BillerDao_Impl $r13 = BillerDao_Impl.this;
                    AbstractC1802o0 $r23 = $r13.__db;
                    $r23.setTransactionSuccessful();
                    return $r42;
                } finally {
                    BillerDao_Impl $r14 = BillerDao_Impl.this;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.BillerDao
    public AbstractC11696w updateBillers(final String str, final int i) {
        AbstractC11696w $r2 = AbstractC11696w.m10439k(new Callable<C13666w>() { // from class: ai.kudi.agent.core.domain.db.room_dao.BillerDao_Impl.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ C13666w call() throws Exception {
                C13666w $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            public C13666w call2() throws Exception {
                BillerDao_Impl $r1 = BillerDao_Impl.this;
                AbstractC1841w0 $r22 = $r1.__preparedStmtOfUpdateBillers;
                InterfaceC8101k $r3 = $r22.acquire();
                int $i0 = i;
                long $l1 = $i0;
                $r3.bindLong(1, $l1);
                String $r4 = str;
                if ($r4 == null) {
                    $r3.bindNull(2);
                } else {
                    $r3.bindString(2, $r4);
                }
                BillerDao_Impl $r12 = BillerDao_Impl.this;
                AbstractC1802o0 $r5 = $r12.__db;
                $r5.beginTransaction();
                try {
                    $r3.executeUpdateDelete();
                    BillerDao_Impl $r13 = BillerDao_Impl.this;
                    AbstractC1802o0 $r52 = $r13.__db;
                    $r52.setTransactionSuccessful();
                    C13666w r7 = C13666w.f30112a;
                    return r7;
                } finally {
                    BillerDao_Impl $r14 = BillerDao_Impl.this;
                    AbstractC1802o0 $r53 = $r14.__db;
                    $r53.endTransaction();
                    BillerDao_Impl $r15 = BillerDao_Impl.this;
                    AbstractC1841w0 $r23 = $r15.__preparedStmtOfUpdateBillers;
                    $r23.release($r3);
                }
            }
        });
        return $r2;
    }
}
