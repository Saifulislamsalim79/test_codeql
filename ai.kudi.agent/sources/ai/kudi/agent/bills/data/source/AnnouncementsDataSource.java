package ai.kudi.agent.bills.data.source;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11696w;
/* compiled from: AnnouncementsDataSource.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/bills/data/source/AnnouncementsDataSource;", "", "observeAnnouncements", "Lio/reactivex/Flowable;", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "updateAnnouncements", "Lio/reactivex/Single;", "", "announcements", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AnnouncementsDataSource {
    AbstractC11293f observeAnnouncements();

    AbstractC11696w updateAnnouncements(List list);
}
