package ai.kudi.agent.core.domain.p004db.room_dao;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11293f;
/* compiled from: AnnouncementsDao.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H%J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H%J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nH'J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0017¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/AnnouncementsDao;", "", "()V", "deleteAll", "", "insertAll", "announcements", "", "Lai/kudi/agent/core/domain/room_entities/AnnouncementEntity;", "observeAnnouncements", "Lio/reactivex/Flowable;", "saveAll", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.AnnouncementsDao */
/* loaded from: classes.dex */
public abstract class AnnouncementsDao {
    protected abstract void deleteAll();

    protected abstract void insertAll(List list);

    public abstract AbstractC11293f observeAnnouncements();

    public void saveAll(List list) {
        Log_OC.getArray(list, "announcements");
        deleteAll();
        insertAll(list);
    }
}
