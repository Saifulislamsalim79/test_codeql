package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.AnnouncementEntity;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.AbstractC1841w0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11293f;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.AnnouncementsDao_Impl */
/* loaded from: classes.dex */
public final class AnnouncementsDao_Impl extends AnnouncementsDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1763c0<AnnouncementEntity> __insertionAdapterOfAnnouncementEntity;
    private final AbstractC1841w0 __preparedStmtOfDeleteAll;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AnnouncementsDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfAnnouncementEntity = new AbstractC1763c0<AnnouncementEntity>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.AnnouncementsDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, AnnouncementEntity announcementEntity) {
                int $i0 = announcementEntity.getId();
                long $l1 = $i0;
                interfaceC8101k.bindLong(1, $l1);
                String $r3 = announcementEntity.getTitle();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r32 = announcementEntity.getTitle();
                    interfaceC8101k.bindString(2, $r32);
                }
                String $r33 = announcementEntity.getMessage();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r34 = announcementEntity.getMessage();
                    interfaceC8101k.bindString(3, $r34);
                }
                String $r35 = announcementEntity.getType();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r36 = announcementEntity.getType();
                    interfaceC8101k.bindString(4, $r36);
                }
                String $r37 = announcementEntity.getCustomerType();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(5);
                } else {
                    String $r38 = announcementEntity.getCustomerType();
                    interfaceC8101k.bindString(5, $r38);
                }
                String $r39 = announcementEntity.getPreview();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(6);
                    return;
                }
                String $r310 = announcementEntity.getPreview();
                interfaceC8101k.bindString(6, $r310);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, AnnouncementEntity announcementEntity) {
                AnnouncementEntity $r3 = announcementEntity;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR ABORT INTO `announcements` (`id`,`title`,`message`,`type`,`customerType`,`preview`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC1841w0(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.AnnouncementsDao_Impl.2
            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM announcements";
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao
    protected void deleteAll() {
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao
    protected void insertAll(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfAnnouncementEntity;
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao
    public AbstractC11293f observeAnnouncements() {
        final C1816r0 $r3 = C1816r0.m34466m("SELECT * FROM  announcements", 0);
        AbstractC1802o0 $r1 = this.__db;
        String[] $r4 = {"announcements"};
        AbstractC11293f $r5 = C1823t0.m34463a($r1, false, $r4, new Callable<List<AnnouncementEntity>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.AnnouncementsDao_Impl.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<AnnouncementEntity> call() throws Exception {
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
            public java.util.List<ai.kudi.agent.core.domain.room_entities.AnnouncementEntity> call2() throws java.lang.Exception {
                /*
                    r30 = this;
                    r0 = r30
                    ai.kudi.agent.core.domain.db.room_dao.AnnouncementsDao_Impl r7 = ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao_Impl.this
                    androidx.room.o0 r8 = ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao_Impl.access$100(r7)
                    r0 = r30
                    androidx.room.r0 r9 = r2
                    r11 = 0
                    r12 = 0
                    android.database.Cursor r10 = androidx.room.p063z0.C1854c.m34419b(r8, r9, r11, r12)
                    java.lang.String r14 = "id"
                    int r13 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r14 = "title"
                    int r15 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r14 = "message"
                    int r16 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r14 = "type"
                    int r17 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r14 = "customerType"
                    int r18 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r14 = "preview"
                    int r19 = androidx.room.p063z0.C1853b.m34421e(r10, r14)     // Catch: java.lang.Throwable -> Lbd
                    java.util.ArrayList r20 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbd
                    int r21 = r10.getCount()     // Catch: java.lang.Throwable -> Lbd
                    r0 = r20
                    r1 = r21
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbd
                L43:
                    boolean r22 = r10.moveToNext()     // Catch: java.lang.Throwable -> Lbd
                    if (r22 == 0) goto Lb9
                    int r21 = r10.getInt(r13)     // Catch: java.lang.Throwable -> Lbd
                    boolean r22 = r10.isNull(r15)     // Catch: java.lang.Throwable -> Lbd
                    if (r22 == 0) goto L56
                    r23 = 0
                    goto L5a
                L56:
                    java.lang.String r23 = r10.getString(r15)     // Catch: java.lang.Throwable -> Lbd
                L5a:
                    r0 = r16
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Lbd
                    if (r22 == 0) goto L65
                    r24 = 0
                    goto L6b
                L65:
                    r0 = r16
                    java.lang.String r24 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lbd
                L6b:
                    r0 = r17
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Lbd
                    if (r22 == 0) goto L76
                    r25 = 0
                    goto L7c
                L76:
                    r0 = r17
                    java.lang.String r25 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lbd
                L7c:
                    r0 = r18
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Lbd
                    if (r22 == 0) goto L87
                    r26 = 0
                    goto L8d
                L87:
                    r0 = r18
                    java.lang.String r26 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lbd
                L8d:
                    r0 = r19
                    boolean r22 = r10.isNull(r0)     // Catch: java.lang.Throwable -> Lbd
                    if (r22 == 0) goto L98
                    r27 = 0
                    goto L9e
                L98:
                    r0 = r19
                    java.lang.String r27 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lbd
                L9e:
                    ai.kudi.agent.core.domain.room_entities.AnnouncementEntity r28 = new ai.kudi.agent.core.domain.room_entities.AnnouncementEntity     // Catch: java.lang.Throwable -> Lbd
                    r0 = r28
                    r1 = r21
                    r2 = r23
                    r3 = r24
                    r4 = r25
                    r5 = r26
                    r6 = r27
                    r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lbd
                    r0 = r20
                    r1 = r28
                    r0.add(r1)     // Catch: java.lang.Throwable -> Lbd
                    goto L43
                Lb9:
                    r10.close()
                    return r20
                Lbd:
                    r29 = move-exception
                    r10.close()
                    goto Lc2
                Lc2:
                    throw r29
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao_Impl.CallableC00543.call2():java.util.List");
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
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao
    public void saveAll(List list) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.beginTransaction();
        try {
            super.saveAll(list);
            AbstractC1802o0 $r22 = this.__db;
            $r22.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r23 = this.__db;
            $r23.endTransaction();
        }
    }
}
