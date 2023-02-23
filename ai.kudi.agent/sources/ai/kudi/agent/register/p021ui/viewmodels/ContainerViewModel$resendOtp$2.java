package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import ai.kudi.agent.settings.p029ui.AccountAndSettingsOptionsFragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContainerViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.ContainerViewModel$resendOtp$2 */
/* loaded from: classes.dex */
public final class ContainerViewModel$resendOtp$2 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ ContainerViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerViewModel$resendOtp$2(ContainerViewModel containerViewModel) {
        super(1);
        this.this$0 = containerViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        Throwable $r2 = th;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Log_OC.getArray(th, "it");
        ContainerViewModel $r2 = this.this$0;
        ContainerViewData $r3 = ContainerViewModel.access$getState($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again.", null, 2, null);
        Object $r5 = $r4.invoke(th);
        $r2.publish(ContainerViewData.copy$default($r3, false, null, false, null, null, (String) $r5, false, false, AccountAndSettingsOptionsFragment.UPDATE_APP_REQUEST_CODE, null));
    }
}
