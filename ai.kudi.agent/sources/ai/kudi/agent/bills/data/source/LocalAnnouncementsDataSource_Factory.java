package ai.kudi.agent.bills.data.source;

import ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LocalAnnouncementsDataSource_Factory implements InterfaceC9468d<LocalAnnouncementsDataSource> {
    private final InterfaceC11700a<AnnouncementsDao> announcementsDaoProvider;

    public LocalAnnouncementsDataSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.announcementsDaoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LocalAnnouncementsDataSource_Factory create(InterfaceC11700a interfaceC11700a) {
        LocalAnnouncementsDataSource_Factory $r1 = new LocalAnnouncementsDataSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LocalAnnouncementsDataSource newInstance(AnnouncementsDao announcementsDao) {
        LocalAnnouncementsDataSource $r1 = new LocalAnnouncementsDataSource(announcementsDao);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LocalAnnouncementsDataSource multiply() {
        InterfaceC11700a $r1 = this.announcementsDaoProvider;
        Object $r2 = $r1.get();
        AnnouncementsDao $r3 = (AnnouncementsDao) $r2;
        LocalAnnouncementsDataSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39023multiply() {
        LocalAnnouncementsDataSource $r1 = multiply();
        return $r1;
    }
}
