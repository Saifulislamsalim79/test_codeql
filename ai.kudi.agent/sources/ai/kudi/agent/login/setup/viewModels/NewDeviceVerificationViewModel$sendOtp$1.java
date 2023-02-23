package ai.kudi.agent.login.setup.viewModels;

import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.setup.viewModels.data.NewDeviceVerificationViewData;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.dto.OtpVerificationModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDeviceVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NewDeviceVerificationViewModel$sendOtp$1 extends AbstractC11802m implements InterfaceC11767l<OtpVerificationModel, C13666w> {
    final /* synthetic */ ai.kudi.agent.register.domain.wiki.OtpVerificationModel $otpVerificationModel;
    final /* synthetic */ NewDeviceVerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDeviceVerificationViewModel$sendOtp$1(NewDeviceVerificationViewModel newDeviceVerificationViewModel, ai.kudi.agent.register.domain.wiki.OtpVerificationModel otpVerificationModel) {
        super(1);
        this.this$0 = newDeviceVerificationViewModel;
        this.$otpVerificationModel = otpVerificationModel;
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
        boolean $z0;
        String $r6;
        Log_OC.getArray(otpVerificationModel, "it");
        NewDeviceVerificationViewModel $r3 = this.this$0;
        NewDeviceVerificationViewData $r4 = NewDeviceVerificationViewModel.access$getState($r3);
        $r3.publish(NewDeviceVerificationViewData.copy$default($r4, false, otpVerificationModel, null, 4, null));
        PhoneVerificationNavigator $r5 = this.this$0.phoneVerificationNavigator;
        long $l0 = otpVerificationModel.getExpiresInSeconds();
        String $r62 = otpVerificationModel.getMaskedPhoneNumber();
        $z0 = C13276s.m5440u($r62);
        if (!$z0) {
            $r6 = otpVerificationModel.getMaskedPhoneNumber();
        } else {
            ai.kudi.agent.register.domain.wiki.OtpVerificationModel $r2 = this.$otpVerificationModel;
            $r6 = $r2.getPhoneNumber();
        }
        ai.kudi.agent.register.domain.wiki.OtpVerificationModel $r22 = this.$otpVerificationModel;
        String $r7 = $r22.getLoginAttemptId();
        OtpData $r8 = new OtpData($r6, $l0, $r7, null, 8, null);
        OtpFragmentData $r1 = new OtpFragmentData(null, false, $r8, null, null, false, false, null, false, 507, null);
        ai.kudi.agent.register.domain.wiki.OtpVerificationModel $r23 = this.$otpVerificationModel;
        $r5.toEnterOtpView($r1, $r23);
    }
}
