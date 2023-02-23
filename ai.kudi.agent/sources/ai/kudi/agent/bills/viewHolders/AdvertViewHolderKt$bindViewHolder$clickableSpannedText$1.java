package ai.kudi.agent.bills.viewHolders;

import ai.kudi.agent.bills.data.AdvertItemTag;
import ai.kudi.agent.bills.data.models.AdvertModel;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AdvertViewHolder.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class AdvertViewHolderKt$bindViewHolder$clickableSpannedText$1 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<AdvertModel> $listOfAdvert;
    final /* synthetic */ int $position;
    final /* synthetic */ AdvertItemTag $tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdvertViewHolder.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.bills.viewHolders.AdvertViewHolderKt$bindViewHolder$clickableSpannedText$1$1 */
    /* loaded from: classes.dex */
    public static final class C00331 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        final /* synthetic */ List<AdvertModel> $listOfAdvert;
        final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00331(List list, int i) {
            super(1);
            this.$listOfAdvert = list;
            this.$position = i;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
            Bundle $r2 = bundle;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bundle bundle) {
            Log_OC.getArray(bundle, "$this$launchActivity");
            bundle.putString(KShockActivity.FROM, KShockActivity.KSHOCK_ADVERT_ELIGIBLE);
            List $r2 = this.$listOfAdvert;
            int $i0 = this.$position;
            Object $r3 = $r2.get($i0);
            AdvertModel $r4 = (AdvertModel) $r3;
            Double $r5 = $r4.getMaxLoanAmount();
            double $d0 = $r5 == null ? 200000.0d : $r5.doubleValue();
            bundle.putDouble("MAX_LOAN_AMT", $d0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdvertViewHolder.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.bills.viewHolders.AdvertViewHolderKt$bindViewHolder$clickableSpannedText$1$2 */
    /* loaded from: classes.dex */
    public static final class C00342 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        public static final C00342 INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            C00342 $r0 = new C00342();
            INSTANCE = $r0;
        }

        C00342() {
            super(1);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
            Bundle $r2 = bundle;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bundle bundle) {
            Log_OC.getArray(bundle, "$this$launchActivity");
            bundle.putString(KShockActivity.FROM, KShockActivity.KSHOCK_ADVERT_INELIGIBLE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertViewHolderKt$bindViewHolder$clickableSpannedText$1(AdvertItemTag advertItemTag, Context context, List list, int i) {
        super(1);
        this.$tag = advertItemTag;
        this.$context = context;
        this.$listOfAdvert = list;
        this.$position = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "it");
        AdvertItemTag $r2 = this.$tag;
        AdvertItemTag $r3 = AdvertItemTag.KSHOCK_ELIGIBLE;
        if ($r2 == $r3) {
            Context $r4 = this.$context;
            List $r6 = this.$listOfAdvert;
            int $i0 = this.$position;
            C00331 $r5 = new C00331($r6, $i0);
            ContextExtKt.launchActivity$default($r4, false, KShockActivity.class, (InterfaceC11767l) $r5, 1, (Object) null);
        }
        AdvertItemTag $r22 = this.$tag;
        AdvertItemTag $r32 = AdvertItemTag.KSHOCK_INELIGIBLE;
        if ($r22 == $r32) {
            Context $r42 = this.$context;
            C00342 $r7 = C00342.INSTANCE;
            ContextExtKt.launchActivity$default($r42, false, KShockActivity.class, (InterfaceC11767l) $r7, 1, (Object) null);
        }
    }
}
