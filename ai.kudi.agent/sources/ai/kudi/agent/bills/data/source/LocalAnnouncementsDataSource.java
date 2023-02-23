package ai.kudi.agent.bills.data.source;

import ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11293f;
/* compiled from: AnnouncementsDataSource.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/bills/data/source/LocalAnnouncementsDataSource;", "Lai/kudi/agent/bills/data/source/AnnouncementsDataSource;", "announcementsDao", "Lai/kudi/agent/core/domain/db/room_dao/AnnouncementsDao;", "(Lai/kudi/agent/core/domain/db/room_dao/AnnouncementsDao;)V", "observeAnnouncements", "Lio/reactivex/Flowable;", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "updateAnnouncements", "Lio/reactivex/Single;", "", "announcements", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LocalAnnouncementsDataSource implements AnnouncementsDataSource {
    private final AnnouncementsDao announcementsDao;

    public LocalAnnouncementsDataSource(AnnouncementsDao announcementsDao) {
        Log_OC.getArray(announcementsDao, "announcementsDao");
        this.announcementsDao = announcementsDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0018 */
    /* renamed from: observeAnnouncements$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m39021observeAnnouncements$lambda1(java.util.List r10) {
        /*
            java.lang.String r0 = "it"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r2 = kotlin.p557z.C13722p.m3921o(r10, r3)
            r1.<init>(r2)
            java.util.Iterator r4 = r10.iterator()
        L14:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r6 = r4.next()
            r8 = r6
            ai.kudi.agent.core.domain.room_entities.AnnouncementEntity r8 = (ai.kudi.agent.core.domain.room_entities.AnnouncementEntity) r8
            r7 = r8
            ai.kudi.agent.core.domain.room_entities.Announcement r9 = ai.kudi.agent.core.domain.room_entities.AnnouncementEntityKt.toAnnouncement(r7)
            r1.add(r9)
            goto L14
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.data.source.LocalAnnouncementsDataSource.m39021observeAnnouncements$lambda1(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateAnnouncements$lambda-3  reason: not valid java name */
    public static final Boolean m39022updateAnnouncements$lambda3(LocalAnnouncementsDataSource localAnnouncementsDataSource, List list) {
        Log_OC.getArray(localAnnouncementsDataSource, "this$0");
        Log_OC.getArray(list, "$entities");
        AnnouncementsDao $r2 = localAnnouncementsDataSource.announcementsDao;
        $r2.saveAll(list);
        Boolean r3 = Boolean.TRUE;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.data.source.AnnouncementsDataSource
    public AbstractC11293f observeAnnouncements() {
        AnnouncementsDao $r1 = this.announcementsDao;
        AbstractC11293f $r2 = $r1.observeAnnouncements();
        ServiceLocator $r3 = ServiceLocator.instance;
        AbstractC11293f $r22 = $r2.m11162w($r3);
        Log_OC.loadImage($r22, "announcementsDao.observeAnnouncements()\n        .map { it.map { entity -> entity.toAnnouncement() } }");
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0018 */
    @Override // ai.kudi.agent.bills.data.source.AnnouncementsDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p425j.p444e.AbstractC11696w updateAnnouncements(java.util.List r13) {
        /*
            r12 = this;
            java.lang.String r0 = "announcements"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r2 = kotlin.p557z.C13722p.m3921o(r13, r3)
            r1.<init>(r2)
            java.util.Iterator r4 = r13.iterator()
        L14:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r6 = r4.next()
            r8 = r6
            ai.kudi.agent.core.domain.room_entities.Announcement r8 = (ai.kudi.agent.core.domain.room_entities.Announcement) r8
            r7 = r8
            ai.kudi.agent.core.domain.room_entities.AnnouncementEntity r9 = ai.kudi.agent.core.domain.room_entities.AnnouncementEntityKt.toEntity(r7)
            r1.add(r9)
            goto L14
        L2a:
            ai.kudi.agent.bills.data.source.Preferences$1 r10 = new ai.kudi.agent.bills.data.source.Preferences$1
            r10.<init>()
            j.e.w r11 = p425j.p444e.AbstractC11696w.m10439k(r10)
            java.lang.String r0 = "fromCallable {\n            announcementsDao.saveAll(entities)\n            true\n        }"
            kotlin.p483e0.p485d.Log_OC.loadImage(r11, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.data.source.LocalAnnouncementsDataSource.updateAnnouncements(java.util.List):j.e.w");
    }
}
