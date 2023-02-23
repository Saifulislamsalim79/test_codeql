package ai.kudi.agent.bills.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11696w;
/* compiled from: AnnouncementRepository.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\tH&J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/bills/data/AnnouncementRepository;", "", "getAnnouncements", "", "onDataChanged", "Lkotlin/Function1;", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "observeAnnouncements", "Lio/reactivex/Flowable;", "updateAnnouncements", "Lio/reactivex/Single;", "", "announcements", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AnnouncementRepository {
    void getAnnouncements(InterfaceC11767l interfaceC11767l);

    AbstractC11293f observeAnnouncements();

    AbstractC11696w updateAnnouncements(List list);
}
