package ai.kudi.agent.bills.viewHolders;

import ai.kudi.agent.bills.data.models.AdvertModel;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import android.os.Bundle;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdvertViewHolder.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AdvertViewHolderKt$bindViewHolder$1$1 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
    final /* synthetic */ List<AdvertModel> $listOfAdvert;
    final /* synthetic */ int $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertViewHolderKt$bindViewHolder$1$1(List list, int i) {
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
