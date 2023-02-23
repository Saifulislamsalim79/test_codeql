package ai.kudi.agent.bills.data;

import ai.kudi.agent.bills.data.source.AnnouncementsDataSource;
import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AnnouncementRepositoryImpl_Factory implements InterfaceC9468d<AnnouncementRepositoryImpl> {
    private final InterfaceC11700a<AnnouncementsDataSource> dataSourceProvider;
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;

    public AnnouncementRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.dataSourceProvider = interfaceC11700a;
        this.firebaseDatabaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AnnouncementRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        AnnouncementRepositoryImpl_Factory $r2 = new AnnouncementRepositoryImpl_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AnnouncementRepositoryImpl newInstance(AnnouncementsDataSource announcementsDataSource, C5615f c5615f) {
        AnnouncementRepositoryImpl $r2 = new AnnouncementRepositoryImpl(announcementsDataSource, c5615f);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AnnouncementRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.dataSourceProvider;
        Object $r2 = $r1.get();
        AnnouncementsDataSource $r3 = (AnnouncementsDataSource) $r2;
        InterfaceC11700a $r12 = this.firebaseDatabaseProvider;
        Object $r22 = $r12.get();
        C5615f $r4 = (C5615f) $r22;
        AnnouncementRepositoryImpl $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39020multiply() {
        AnnouncementRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
