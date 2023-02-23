package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.register.domain.dto.SecondaryDetailsResponse;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/SecondaryDetailsResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.viewModels.SettingsDetailsViewModel$verifyOtpSecondaryVerification$1 */
/* loaded from: classes.dex */
public final class SettingsDetailsViewModel$verifyOtpSecondaryVerification$1 extends AbstractC11802m implements InterfaceC11767l<SecondaryDetailsResponse, C13666w> {
    final /* synthetic */ SettingsDetailsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsDetailsViewModel$verifyOtpSecondaryVerification$1(SettingsDetailsViewModel settingsDetailsViewModel) {
        super(1);
        this.this$0 = settingsDetailsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(SecondaryDetailsResponse secondaryDetailsResponse) {
        ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse $r2 = (ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse) secondaryDetailsResponse;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse secondaryDetailsResponse) {
        Log_OC.getArray(secondaryDetailsResponse, "it");
        SettingsDetailsViewModel $r2 = this.this$0;
        ContainerViewData $r3 = SettingsDetailsViewModel.access$getState($r2);
        $r2.publish(ContainerViewData.copy$default($r3, false, null, false, null, null, null, true, false, 190, null));
    }
}
