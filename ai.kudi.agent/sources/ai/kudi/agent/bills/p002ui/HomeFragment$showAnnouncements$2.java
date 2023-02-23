package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.presenters.AnnouncementType;
import ai.kudi.agent.bills.presenters.HomePresenter;
import ai.kudi.agent.core.domain.room_entities.Announcement;
import ai.kudi.agent.core.util.CustomDialog;
import android.app.Dialog;
import android.content.Context;
import io.intercom.android.sdk.models.Part;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: HomeFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m10421d2 = {"<anonymous>", "", Part.LEGACY_ANNOUNCEMENT_STYLE, "Lai/kudi/agent/core/domain/room_entities/Announcement;", "drawableRes", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.HomeFragment$showAnnouncements$2 */
/* loaded from: classes.dex */
final class HomeFragment$showAnnouncements$2 extends AbstractC11802m implements InterfaceC11771p<Announcement, Integer, C13666w> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.bills.ui.HomeFragment$showAnnouncements$2$1 */
    /* loaded from: classes.dex */
    public static final class C00261 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
        final /* synthetic */ C11812w<Dialog> $dialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00261(C11812w c11812w) {
            super(0);
            this.$dialog = c11812w;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            invoke2();
            C13666w r1 = C13666w.f30112a;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C11812w $r1 = this.$dialog;
            Object $r2 = $r1.f26499c;
            Dialog $r3 = (Dialog) $r2;
            if ($r3 == null) {
                return;
            }
            $r3.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$showAnnouncements$2(HomeFragment homeFragment) {
        super(2);
        this.this$0 = homeFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(Announcement announcement, Integer num) {
        Announcement $r3 = announcement;
        Integer $r4 = num;
        invoke2($r3, $r4);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r29v0, types: [T, android.app.Dialog] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Announcement announcement, Integer num) {
        Log_OC.getArray(announcement, Part.LEGACY_ANNOUNCEMENT_STYLE);
        HomeFragment $r5 = this.this$0;
        InterfaceC9413d $r6 = ((AbstractC9412c) $r5).presenter;
        HomePresenter $r7 = (HomePresenter) $r6;
        $r7.logAnnouncementClicked(announcement);
        C11812w r16 = new C11812w();
        CustomDialog.Companion $r2 = CustomDialog.Companion;
        HomeFragment $r52 = this.this$0;
        Context $r9 = $r52.requireContext();
        Log_OC.loadImage($r9, "requireContext()");
        String $r10 = announcement.getTitle();
        String $r11 = announcement.getMessage();
        C00261 r17 = new C00261(r16);
        String $r12 = announcement.getType();
        AnnouncementType $r13 = AnnouncementType.WARNING;
        String $r14 = $r13.name();
        boolean $z0 = Log_OC.append($r12, $r14);
        int $i0 = $z0 ? C0001R.C0004layout.content_announcement_pop_warning : C0001R.C0004layout.content_announcement_pop;
        r16.f26499c = $r2.show($r9, $r10, num, $r11, "Close", true, r17, $i0);
    }
}
