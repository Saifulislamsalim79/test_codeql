package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.CategoryData;
import ai.kudi.agent.core.domain.room_entities.IssueCategory;
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
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl */
/* loaded from: classes.dex */
public final class IssueResolutionDao_Impl implements IssueResolutionDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<CategoryData> __insertionAdapterOfCategoryData;
    private final AbstractC1763c0<IssueCategory> __insertionAdapterOfIssueCategory;
    private final AbstractC1841w0 __preparedStmtOfNukeIssueDetailsForType;
    private final AbstractC1841w0 __preparedStmtOfNukeIssueTable;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueResolutionDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfIssueCategory = new AbstractC1763c0<IssueCategory>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, IssueCategory issueCategory) {
                Integer $r3;
                Integer $r32 = issueCategory.getLocalId();
                if ($r32 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    Integer $r33 = issueCategory.getLocalId();
                    int $i0 = $r33.intValue();
                    long $l1 = $i0;
                    interfaceC8101k.bindLong(1, $l1);
                }
                String $r4 = issueCategory.getCategory();
                if ($r4 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r42 = issueCategory.getCategory();
                    interfaceC8101k.bindString(2, $r42);
                }
                String $r43 = issueCategory.getCategoryName();
                if ($r43 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r44 = issueCategory.getCategoryName();
                    interfaceC8101k.bindString(3, $r44);
                }
                Boolean $r5 = issueCategory.getHasChildren();
                if ($r5 == null) {
                    $r3 = null;
                } else {
                    Boolean $r52 = issueCategory.getHasChildren();
                    $r3 = Integer.valueOf($r52.booleanValue() ? 1 : 0);
                }
                if ($r3 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    int $i02 = $r3.intValue();
                    long $l12 = $i02;
                    interfaceC8101k.bindLong(4, $l12);
                }
                int $i03 = issueCategory.getIndex();
                long $l13 = $i03;
                interfaceC8101k.bindLong(5, $l13);
                int $i04 = issueCategory.getParentIndex();
                long $l14 = $i04;
                interfaceC8101k.bindLong(6, $l14);
                boolean $z0 = issueCategory.getTransactionCentric();
                long $l15 = $z0 ? 1L : 0L;
                interfaceC8101k.bindLong(7, $l15);
                String $r45 = issueCategory.getTransactionTypeKey();
                if ($r45 == null) {
                    interfaceC8101k.bindNull(8);
                    return;
                }
                String $r46 = issueCategory.getTransactionTypeKey();
                interfaceC8101k.bindString(8, $r46);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, IssueCategory issueCategory) {
                IssueCategory $r3 = issueCategory;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `issue_data` (`id`,`category`,`categoryName`,`hasChildren`,`index`,`parentIndex`,`transactionCentric`,`transactionTypeKey`) VALUES (?,?,?,?,?,?,?,?)";
            }
        };
        this.__insertionAdapterOfCategoryData = new AbstractC1763c0<CategoryData>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, CategoryData categoryData) {
                String $r3 = categoryData.getDescription();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = categoryData.getDescription();
                    interfaceC8101k.bindString(1, $r32);
                }
                Integer $r4 = categoryData.getGlobalIndex();
                if ($r4 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    Integer $r42 = categoryData.getGlobalIndex();
                    int $i0 = $r42.intValue();
                    long $l1 = $i0;
                    interfaceC8101k.bindLong(2, $l1);
                }
                String $r33 = categoryData.getId();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r34 = categoryData.getId();
                    interfaceC8101k.bindString(3, $r34);
                }
                Integer $r43 = categoryData.getIndex();
                if ($r43 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    Integer $r44 = categoryData.getIndex();
                    int $i02 = $r44.intValue();
                    long $l12 = $i02;
                    interfaceC8101k.bindLong(4, $l12);
                }
                String $r35 = categoryData.getLabel();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r36 = categoryData.getLabel();
                    interfaceC8101k.bindString(5, $r36);
                }
                String $r37 = categoryData.getPrettyName();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(6);
                } else {
                    String $r38 = categoryData.getPrettyName();
                    interfaceC8101k.bindString(6, $r38);
                }
                Integer $r45 = categoryData.getSlaInHours();
                if ($r45 == null) {
                    interfaceC8101k.bindNull(7);
                } else {
                    Integer $r46 = categoryData.getSlaInHours();
                    int $i03 = $r46.intValue();
                    long $l13 = $i03;
                    interfaceC8101k.bindLong(7, $l13);
                }
                String $r39 = categoryData.getTimeCreated();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(8);
                } else {
                    String $r310 = categoryData.getTimeCreated();
                    interfaceC8101k.bindString(8, $r310);
                }
                String $r311 = categoryData.getTimeUpdated();
                if ($r311 == null) {
                    interfaceC8101k.bindNull(9);
                } else {
                    String $r312 = categoryData.getTimeUpdated();
                    interfaceC8101k.bindString(9, $r312);
                }
                String $r313 = categoryData.getType();
                if ($r313 == null) {
                    interfaceC8101k.bindNull(10);
                } else {
                    String $r314 = categoryData.getType();
                    interfaceC8101k.bindString(10, $r314);
                }
                String $r315 = categoryData.getBody();
                if ($r315 == null) {
                    interfaceC8101k.bindNull(11);
                } else {
                    String $r316 = categoryData.getBody();
                    interfaceC8101k.bindString(11, $r316);
                }
                String $r317 = categoryData.getTypeSlug();
                if ($r317 == null) {
                    interfaceC8101k.bindNull(12);
                    return;
                }
                String $r318 = categoryData.getTypeSlug();
                interfaceC8101k.bindString(12, $r318);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, CategoryData categoryData) {
                CategoryData $r3 = categoryData;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `issue_details` (`description`,`globalIndex`,`id`,`index`,`label`,`prettyName`,`slaInHours`,`timeCreated`,`timeUpdated`,`type`,`body`,`typeSlug`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfNukeIssueDetailsForType = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.3
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from issue_details where type = ?";
            }
        };
        this.__preparedStmtOfNukeIssueTable = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.4
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "delete from issue_data";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public void addIssueDetails(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfCategoryData;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public void addIssueTypes(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfIssueCategory;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public AbstractC11677k getIssueCategoryByLabel(String str) {
        final C1816r0 $r2 = C1816r0.m34466m("select * from issue_details where label = ?", 1);
        if (str == null) {
            $r2.bindNull(1);
        } else {
            $r2.bindString(1, str);
        }
        AbstractC11677k $r4 = AbstractC11677k.m10591l(new Callable<CategoryData>() { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public CategoryData call() throws Exception {
                Object r20;
                IssueResolutionDao_Impl $r22 = IssueResolutionDao_Impl.this;
                AbstractC1802o0 $r3 = $r22.__db;
                C1816r0 $r42 = $r2;
                Object $r5 = null;
                Cursor $r6 = C1854c.m34419b($r3, $r42, false, null);
                try {
                    int $i0 = C1853b.m34421e($r6, "description");
                    int $i1 = C1853b.m34421e($r6, "globalIndex");
                    int $i2 = C1853b.m34421e($r6, "id");
                    int $i3 = C1853b.m34421e($r6, "index");
                    int $i4 = C1853b.m34421e($r6, "label");
                    int $i5 = C1853b.m34421e($r6, "prettyName");
                    int $i6 = C1853b.m34421e($r6, "slaInHours");
                    int $i7 = C1853b.m34421e($r6, "timeCreated");
                    int $i8 = C1853b.m34421e($r6, "timeUpdated");
                    int $i9 = C1853b.m34421e($r6, "type");
                    int $i10 = C1853b.m34421e($r6, "body");
                    int $i11 = C1853b.m34421e($r6, "typeSlug");
                    boolean $z0 = $r6.moveToFirst();
                    if ($z0) {
                        boolean $z02 = $r6.isNull($i0);
                        String $r7 = $z02 ? null : $r6.getString($i0);
                        boolean $z03 = $r6.isNull($i1);
                        Integer $r8 = $z03 ? null : Integer.valueOf($r6.getInt($i1));
                        boolean $z04 = $r6.isNull($i2);
                        String $r9 = $z04 ? null : $r6.getString($i2);
                        boolean $z05 = $r6.isNull($i3);
                        Integer $r10 = $z05 ? null : Integer.valueOf($r6.getInt($i3));
                        boolean $z06 = $r6.isNull($i4);
                        String $r11 = $z06 ? null : $r6.getString($i4);
                        boolean $z07 = $r6.isNull($i5);
                        String $r12 = $z07 ? null : $r6.getString($i5);
                        boolean $z08 = $r6.isNull($i6);
                        Integer $r13 = $z08 ? null : Integer.valueOf($r6.getInt($i6));
                        boolean $z09 = $r6.isNull($i7);
                        String $r14 = $z09 ? null : $r6.getString($i7);
                        boolean $z010 = $r6.isNull($i8);
                        String $r15 = $z010 ? null : $r6.getString($i8);
                        boolean $z011 = $r6.isNull($i9);
                        String $r16 = $z011 ? null : $r6.getString($i9);
                        boolean $z012 = $r6.isNull($i10);
                        String $r17 = $z012 ? null : $r6.getString($i10);
                        boolean $z013 = $r6.isNull($i11);
                        if (!$z013) {
                            Object $r18 = $r6.getString($i11);
                            $r5 = $r18;
                        }
                        Object $r1 = $r5;
                        $r5 = r20;
                        String $r182 = (String) $r1;
                        r20 = new CategoryData($r7, $r8, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r182);
                    }
                    $r6.close();
                    CategoryData r202 = (CategoryData) $r5;
                    return r202;
                } catch (Throwable $r19) {
                    $r6.close();
                    throw $r19;
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ CategoryData call() throws Exception {
                CategoryData $r1 = call();
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public AbstractC11688p getIssueDetails(String str) {
        final C1816r0 $r3 = C1816r0.m34466m("select * from issue_details where type = ?", 1);
        if (str == null) {
            $r3.bindNull(1);
        } else {
            $r3.bindString(1, str);
        }
        AbstractC1802o0 $r4 = this.__db;
        String[] $r5 = {"issue_details"};
        AbstractC11688p $r6 = C1823t0.m34461c($r4, false, $r5, new Callable<List<CategoryData>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<CategoryData> call() throws Exception {
                List $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x00a5 */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.CategoryData> call2() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 492
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao_Impl.CallableC00756.call2():java.util.List");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r1 = $r3;
                $r1.m34467J();
            }
        });
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public AbstractC11688p getIssueTypes() {
        final C1816r0 $r3 = C1816r0.m34466m("select * from issue_data", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"issue_data"};
        AbstractC11688p $r5 = C1823t0.m34461c($r1, false, $r4, new Callable<List<IssueCategory>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao_Impl.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<IssueCategory> call() throws Exception {
                List $r12 = call2();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x0063 */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.IssueCategory> call2() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao_Impl.CallableC00745.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public void nukeIssueDetailsForType(String str) {
        AbstractC1802o0 $r3 = this.__db;
        $r3.assertNotSuspendingTransaction();
        AbstractC1841w0 $r4 = this.__preparedStmtOfNukeIssueDetailsForType;
        InterfaceC8101k $r1 = $r4.acquire();
        if (str == null) {
            $r1.bindNull(1);
        } else {
            $r1.bindString(1, str);
        }
        AbstractC1802o0 $r32 = this.__db;
        $r32.beginTransaction();
        try {
            $r1.executeUpdateDelete();
            AbstractC1802o0 $r33 = this.__db;
            $r33.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r34 = this.__db;
            $r34.endTransaction();
            AbstractC1841w0 $r42 = this.__preparedStmtOfNukeIssueDetailsForType;
            $r42.release($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao
    public void nukeIssueTable() {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1841w0 $r3 = this.__preparedStmtOfNukeIssueTable;
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
            AbstractC1841w0 $r32 = this.__preparedStmtOfNukeIssueTable;
            $r32.release($r1);
        }
    }
}
