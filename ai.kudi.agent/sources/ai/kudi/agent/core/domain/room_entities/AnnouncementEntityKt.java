package ai.kudi.agent.core.domain.room_entities;

import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AnnouncementEntity.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m10421d2 = {"toAnnouncement", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "Lai/kudi/agent/core/domain/room_entities/AnnouncementEntity;", "toEntity", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AnnouncementEntityKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Announcement toAnnouncement(AnnouncementEntity announcementEntity) {
        Log_OC.getArray(announcementEntity, "<this>");
        String $r1 = announcementEntity.getTitle();
        String $r2 = announcementEntity.getMessage();
        String $r3 = announcementEntity.getType();
        String $r4 = announcementEntity.getCustomerType();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        Announcement $r6 = new Announcement($r5, $r1, $r2, $r3, false, 0, announcementEntity.getPreview(), 48, null);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final AnnouncementEntity toEntity(Announcement announcement) {
        Log_OC.getArray(announcement, "<this>");
        String $r2 = announcement.getTitle();
        String $r3 = announcement.getMessage();
        String $r4 = announcement.getType();
        String $r5 = announcement.getCustomerType();
        String $r6 = announcement.getPreview();
        AnnouncementEntity $r1 = new AnnouncementEntity(0, $r2, $r3, $r4, $r5, $r6, 1, null);
        return $r1;
    }
}
