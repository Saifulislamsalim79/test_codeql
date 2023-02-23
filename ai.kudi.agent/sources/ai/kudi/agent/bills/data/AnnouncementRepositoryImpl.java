package ai.kudi.agent.bills.data;

import ai.kudi.agent.BuildConfig;
import ai.kudi.agent.bills.data.source.AnnouncementsDataSource;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import com.google.firebase.database.InterfaceC5627o;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11696w;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AnnouncementRepository.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000eH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/bills/data/AnnouncementRepositoryImpl;", "Lai/kudi/agent/bills/data/AnnouncementRepository;", "dataSource", "Lai/kudi/agent/bills/data/source/AnnouncementsDataSource;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lai/kudi/agent/bills/data/source/AnnouncementsDataSource;Lcom/google/firebase/database/FirebaseDatabase;)V", "getAnnouncements", "", "onDataChanged", "Lkotlin/Function1;", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "observeAnnouncements", "Lio/reactivex/Flowable;", "updateAnnouncements", "Lio/reactivex/Single;", "", "announcements", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AnnouncementRepositoryImpl implements AnnouncementRepository {
    private final AnnouncementsDataSource dataSource;
    private final C5615f firebaseDatabase;

    public AnnouncementRepositoryImpl(AnnouncementsDataSource announcementsDataSource, C5615f c5615f) {
        Log_OC.getArray(announcementsDataSource, "dataSource");
        Log_OC.getArray(c5615f, "firebaseDatabase");
        this.dataSource = announcementsDataSource;
        this.firebaseDatabase = c5615f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.data.AnnouncementRepository
    public void getAnnouncements(final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "onDataChanged");
        C5615f $r3 = this.firebaseDatabase;
        C5612d $r2 = $r3.m24316f(BuildConfig.FIREBASE_ANNOUNCEMENT_PATH);
        Log_OC.loadImage($r2, "firebaseDatabase.getReference(FIREBASE_ANNOUNCEMENT_PATH)");
        $r2.m24307b(new InterfaceC5627o() { // from class: ai.kudi.agent.bills.data.AnnouncementRepositoryImpl$getAnnouncements$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.firebase.database.InterfaceC5627o
            public void onCancelled(C5611c c5611c) {
                Log_OC.getArray(c5611c, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                StringBuilder $r22 = new StringBuilder();
                $r22.append("It was cancelled for this reason ");
                String $r32 = c5611c.m24329h();
                $r22.append($r32);
                $r22.append(" with details ");
                String $r33 = c5611c.m24330g();
                $r22.append($r33);
                String $r34 = $r22.toString();
                Object[] $r4 = new Object[0];
                Timber.m1627e($r34, $r4);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:17:0x0050 */
            /* JADX WARN: Incorrect condition in loop: B:7:0x0025 */
            @Override // com.google.firebase.database.InterfaceC5627o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onDataChange(com.google.firebase.database.C5608b r21) {
                /*
                    r20 = this;
                    java.lang.String r2 = "data"
                    r0 = r21
                    kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
                    r0 = r21
                    java.lang.Iterable r3 = r0.m24343c()     // Catch: java.lang.Exception -> L7f
                    java.lang.String r2 = "data.children"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r3, r2)     // Catch: java.lang.Exception -> L7f
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r6 = 10
                    int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)     // Catch: java.lang.Exception -> L7f
                    r4.<init>(r5)     // Catch: java.lang.Exception -> L7f
                    java.util.Iterator r7 = r3.iterator()     // Catch: java.lang.Exception -> L7f
                L21:
                    boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L7f
                    if (r8 == 0) goto L43
                    java.lang.Object r9 = r7.next()     // Catch: java.lang.Exception -> L7f
                    r10 = r9
                    com.google.firebase.database.b r10 = (com.google.firebase.database.C5608b) r10
                    r21 = r10
                    java.lang.Class<ai.kudi.agent.core.domain.room_entities.Announcement> r11 = ai.kudi.agent.core.domain.room_entities.Announcement.class
                    r0 = r21
                    java.lang.Object r9 = r0.m24339g(r11)     // Catch: java.lang.Exception -> L7f
                    kotlin.p483e0.p485d.Log_OC.append(r9)     // Catch: java.lang.Exception -> L7f
                    r13 = r9
                    ai.kudi.agent.core.domain.room_entities.Announcement r13 = (ai.kudi.agent.core.domain.room_entities.Announcement) r13
                    r12 = r13
                    r4.add(r12)     // Catch: java.lang.Exception -> L7f
                    goto L21
                L43:
                    java.util.ArrayList r14 = new java.util.ArrayList
                    r14.<init>()     // Catch: java.lang.Exception -> L7f
                    java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Exception -> L7f
                L4c:
                    boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L7f
                    if (r8 == 0) goto L66
                    java.lang.Object r9 = r7.next()     // Catch: java.lang.Exception -> L7f
                    r15 = r9
                    ai.kudi.agent.core.domain.room_entities.Announcement r15 = (ai.kudi.agent.core.domain.room_entities.Announcement) r15
                    r12 = r15
                    boolean r8 = r12.getExpired()     // Catch: java.lang.Exception -> L7f
                    r6 = 1
                    r8 = r8 ^ r6
                    if (r8 == 0) goto L4c
                    r14.add(r9)     // Catch: java.lang.Exception -> L7f
                    goto L4c
                L66:
                    ai.kudi.agent.bills.data.AnnouncementRepositoryImpl$getAnnouncements$1$onDataChange$$inlined$sortedBy$1 r16 = new ai.kudi.agent.bills.data.AnnouncementRepositoryImpl$getAnnouncements$1$onDataChange$$inlined$sortedBy$1
                    r0 = r16
                    r0.<init>()     // Catch: java.lang.Exception -> L7f
                    r0 = r16
                    java.util.List r17 = kotlin.p557z.C13722p.m3911u0(r14, r0)     // Catch: java.lang.Exception -> L7f
                    r0 = r20
                    kotlin.e0.c.l<java.util.List<ai.kudi.agent.core.domain.room_entities.Announcement>, kotlin.w> r0 = kotlin.p483e0.p484c.InterfaceC11767l.this
                    r18 = r0
                    r1 = r17
                    r0.invoke(r1)     // Catch: java.lang.Exception -> L7f
                    return
                L7f:
                    r19 = move-exception
                    r0 = r19
                    r0.printStackTrace()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.data.AnnouncementRepositoryImpl$getAnnouncements$1.onDataChange(com.google.firebase.database.b):void");
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.data.AnnouncementRepository
    public AbstractC11293f observeAnnouncements() {
        AnnouncementsDataSource $r2 = this.dataSource;
        AbstractC11293f $r1 = $r2.observeAnnouncements();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.data.AnnouncementRepository
    public AbstractC11696w updateAnnouncements(List list) {
        Log_OC.getArray(list, "announcements");
        AnnouncementsDataSource $r3 = this.dataSource;
        AbstractC11696w $r1 = $r3.updateAnnouncements(list);
        return $r1;
    }
}
