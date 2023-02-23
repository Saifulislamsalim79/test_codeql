package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.bills.data.AnnouncementRepository;
import ai.kudi.agent.bills.data.source.AnnouncementsDataSource;
import com.google.firebase.database.C5615f;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvideAnnouncementRepoFactory implements InterfaceC9468d<AnnouncementRepository> {
    private final InterfaceC11700a<AnnouncementsDataSource> announcementsDataSourceProvider;
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideAnnouncementRepoFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.module = repositoryModule;
        this.announcementsDataSourceProvider = interfaceC11700a;
        this.firebaseDatabaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvideAnnouncementRepoFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RepositoryModule_ProvideAnnouncementRepoFactory $r3 = new RepositoryModule_ProvideAnnouncementRepoFactory(repositoryModule, interfaceC11700a, interfaceC11700a2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AnnouncementRepository provideAnnouncementRepo(RepositoryModule repositoryModule, AnnouncementsDataSource announcementsDataSource, C5615f c5615f) {
        AnnouncementRepository $r2 = repositoryModule.provideAnnouncementRepo(announcementsDataSource, c5615f);
        C9473g.m14647e($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AnnouncementRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.announcementsDataSourceProvider;
        Object $r3 = $r2.get();
        AnnouncementsDataSource $r4 = (AnnouncementsDataSource) $r3;
        InterfaceC11700a $r22 = this.firebaseDatabaseProvider;
        Object $r32 = $r22.get();
        C5615f $r5 = (C5615f) $r32;
        AnnouncementRepository $r6 = provideAnnouncementRepo($r1, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41484remainder() {
        AnnouncementRepository $r1 = remainder();
        return $r1;
    }
}
