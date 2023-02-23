package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.dto.OtpVerificationModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.viewModels.SettingsDetailsViewModel$sendOtpEmailVerification$1 */
/* loaded from: classes.dex */
public final class SettingsDetailsViewModel$sendOtpEmailVerification$1 extends AbstractC11802m implements InterfaceC11767l<OtpVerificationModel, C13666w> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ SettingsDetailsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsDetailsViewModel$sendOtpEmailVerification$1(SettingsDetailsViewModel settingsDetailsViewModel, String str) {
        super(1);
        this.this$0 = settingsDetailsViewModel;
        this.$phoneNumber = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(OtpVerificationModel otpVerificationModel) {
        ai.kudi.agent.register.domain.wiki.OtpVerificationModel $r2 = (ai.kudi.agent.register.domain.wiki.OtpVerificationModel) otpVerificationModel;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.register.domain.wiki.OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "it");
        SettingsDetailsViewModel $r2 = this.this$0;
        ContainerViewData $r3 = SettingsDetailsViewModel.access$getState($r2);
        $r2.publish(ContainerViewData.copy$default($r3, false, "OTP has been resent", false, null, null, null, false, false, 209, null));
        Analytics $r4 = this.this$0.analytics;
        String $r5 = this.$phoneNumber;
        $r4.onSecondaryPhoneNumberVerified($r5);
    }
}
