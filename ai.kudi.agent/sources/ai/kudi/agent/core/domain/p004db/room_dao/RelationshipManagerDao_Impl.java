package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.RelationshipManager;
import android.database.Cursor;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import androidx.room.p063z0.C1853b;
import androidx.room.p063z0.C1854c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.RelationshipManagerDao_Impl */
/* loaded from: classes.dex */
public final class RelationshipManagerDao_Impl implements RelationshipManagerDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<RelationshipManager> __insertionAdapterOfRelationshipManager;
    private final AbstractC1841w0 __preparedStmtOfDeleteAll;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RelationshipManagerDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfRelationshipManager = new AbstractC1763c0<RelationshipManager>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.RelationshipManagerDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, RelationshipManager relationshipManager) {
                String $r3 = relationshipManager.getContactPhoneNumber();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = relationshipManager.getContactPhoneNumber();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = relationshipManager.getFirstName();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = relationshipManager.getFirstName();
                    interfaceC8101k.bindString(2, $r34);
                }
                String $r35 = relationshipManager.getLastName();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r36 = relationshipManager.getLastName();
                    interfaceC8101k.bindString(3, $r36);
                }
                String $r37 = relationshipManager.getManagerAccountPhone();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r38 = relationshipManager.getManagerAccountPhone();
                    interfaceC8101k.bindString(4, $r38);
                }
                String $r39 = relationshipManager.getManagerId();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r310 = relationshipManager.getManagerId();
                    interfaceC8101k.bindString(5, $r310);
                }
                String $r311 = relationshipManager.getOfficialEmail();
                if ($r311 == null) {
                    interfaceC8101k.bindNull(6);
                } else {
                    String $r312 = relationshipManager.getOfficialEmail();
                    interfaceC8101k.bindString(6, $r312);
                }
                int $i0 = relationshipManager.getId();
                long $l1 = $i0;
                interfaceC8101k.bindLong(7, $l1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, RelationshipManager relationshipManager) {
                RelationshipManager $r3 = relationshipManager;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `relationship_manager` (`contactPhoneNumber`,`firstName`,`lastName`,`managerAccountPhone`,`managerId`,`officialEmail`,`id`) VALUES (?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.RelationshipManagerDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from relationship_manager";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao
    public AbstractC11688p getRelationshipManager() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from relationship_manager where id = 0", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"relationship_manager"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<RelationshipManager>() { // from class: ai.kudi.agent.core.domain.db.room_dao.RelationshipManagerDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public RelationshipManager call() throws Exception {
                Object r14;
                RelationshipManagerDao_Impl $r2 = RelationshipManagerDao_Impl.this;
                AbstractC1802o0 $r32 = $r2.__db;
                C1816r0 $r42 = $r3;
                Object $r52 = null;
                Cursor $r6 = C1854c.m34419b($r32, $r42, false, null);
                try {
                    int $i0 = C1853b.m34421e($r6, "contactPhoneNumber");
                    int $i1 = C1853b.m34421e($r6, "firstName");
                    int $i2 = C1853b.m34421e($r6, "lastName");
                    int $i3 = C1853b.m34421e($r6, "managerAccountPhone");
                    int $i4 = C1853b.m34421e($r6, "managerId");
                    int $i5 = C1853b.m34421e($r6, "officialEmail");
                    int $i6 = C1853b.m34421e($r6, "id");
                    boolean $z0 = $r6.moveToFirst();
                    if ($z0) {
                        boolean $z02 = $r6.isNull($i0);
                        String $r7 = $z02 ? null : $r6.getString($i0);
                        boolean $z03 = $r6.isNull($i1);
                        String $r8 = $z03 ? null : $r6.getString($i1);
                        boolean $z04 = $r6.isNull($i2);
                        String $r9 = $z04 ? null : $r6.getString($i2);
                        boolean $z05 = $r6.isNull($i3);
                        String $r10 = $z05 ? null : $r6.getString($i3);
                        boolean $z06 = $r6.isNull($i4);
                        String $r11 = $z06 ? null : $r6.getString($i4);
                        boolean $z07 = $r6.isNull($i5);
                        if (!$z07) {
                            Object $r12 = $r6.getString($i5);
                            $r52 = $r12;
                        }
                        Object $r13 = $r52;
                        $r52 = r14;
                        String $r122 = (String) $r13;
                        r14 = new RelationshipManager($r7, $r8, $r9, $r10, $r11, $r122, $r6.getInt($i6));
                    }
                    $r6.close();
                    RelationshipManager r142 = (RelationshipManager) $r52;
                    return r142;
                } catch (Throwable $r132) {
                    $r6.close();
                    throw $r132;
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ RelationshipManager call() throws Exception {
                RelationshipManager $r12 = call();
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao
    public void insert(RelationshipManager relationshipManager) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfRelationshipManager;
            $r3.insert((AbstractC1763c0) relationshipManager);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }
}
