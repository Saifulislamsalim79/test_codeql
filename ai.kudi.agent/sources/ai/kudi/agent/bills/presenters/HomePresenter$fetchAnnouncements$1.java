package ai.kudi.agent.bills.presenters;

import ai.kudi.agent.bills.data.AnnouncementRepository;
import ai.kudi.agent.core.domain.room_entities.Announcement;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: HomePresenter.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class HomePresenter$fetchAnnouncements$1 extends AbstractC11802m implements InterfaceC11767l<List<? extends Announcement>, C13666w> {
    final /* synthetic */ HomePresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePresenter$fetchAnnouncements$1(HomePresenter homePresenter) {
        super(1);
        this.this$0 = homePresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39070invoke$lambda0(Boolean bool) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(List<? extends Announcement> list) {
        List<? extends Announcement> $r2 = list;
        invoke2((List) $r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List list) {
        Log_OC.getArray(list, "it");
        HomePresenter $r3 = this.this$0;
        AnnouncementRepository $r4 = $r3.announcementRepository;
        AbstractC11696w $r5 = $r4.updateAnnouncements(list);
        HomePresenter $r32 = this.this$0;
        RxSchedulers $r6 = $r32.schedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11696w $r52 = $r5.u($r7);
        HomePresenter $r33 = this.this$0;
        RxSchedulers $r62 = $r33.schedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11696w $r53 = $r52.n($r72);
        RequestParams $r8 = RequestParams.params;
        Util $r1 = Util.log;
        FavoritesArrayAdapter $r9 = $r53.s($r8, $r1);
        Log_OC.loadImage($r9, "announcementRepository.updateAnnouncements(it)\n                .subscribeOn(schedulers.io())\n                .observeOn(schedulers.main())\n                .subscribe({}, { throwable -> throwable.printStackTrace() })");
        HomePresenter $r34 = this.this$0;
        C11280b $r10 = $r34.getDisposables();
        $r10.b($r9);
    }
}
