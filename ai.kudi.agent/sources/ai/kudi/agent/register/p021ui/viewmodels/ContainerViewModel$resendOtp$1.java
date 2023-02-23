package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.login.domain.dto.ResetPinResponse;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContainerViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.ContainerViewModel$resendOtp$1 */
/* loaded from: classes.dex */
public final class ContainerViewModel$resendOtp$1 extends AbstractC11802m implements InterfaceC11767l<ResetPinResponse, C13666w> {
    final /* synthetic */ ContainerViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerViewModel$resendOtp$1(ContainerViewModel containerViewModel) {
        super(1);
        this.this$0 = containerViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(ResetPinResponse resetPinResponse) {
        ai.kudi.agent.login.domain.wiki.ResetPinResponse $r2 = (ai.kudi.agent.login.domain.wiki.ResetPinResponse) resetPinResponse;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.login.domain.wiki.ResetPinResponse resetPinResponse) {
        Log_OC.getArray(resetPinResponse, "it");
        ContainerViewModel $r2 = this.this$0;
        String $r3 = resetPinResponse.getPinResetId();
        Long $r4 = resetPinResponse.getExpiresInSeconds();
        ContainerViewModel $r5 = this.this$0;
        ContainerViewData $r6 = ContainerViewModel.access$getState($r5);
        $r2.publish(ContainerViewData.copy$default($r6, false, "OTP has been resent", false, $r4, $r3, null, false, false, 193, null));
    }
}
