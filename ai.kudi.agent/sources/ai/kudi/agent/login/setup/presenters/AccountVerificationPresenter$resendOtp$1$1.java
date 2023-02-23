package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.login.setup.views.AccountVerificationView;
import ai.kudi.agent.register.domain.dto.OtpVerificationModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountVerificationPresenter$resendOtp$1$1 extends AbstractC11802m implements InterfaceC11767l<OtpVerificationModel, C13666w> {
    final /* synthetic */ AccountVerificationView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerificationPresenter$resendOtp$1$1(AccountVerificationView accountVerificationView) {
        super(1);
        this.$view = accountVerificationView;
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
        AccountVerificationView $r2 = this.$view;
        $r2.hideProgress();
        long $l1 = otpVerificationModel.getExpiresInSeconds();
        if ($l1 <= 0) {
            AccountVerificationView $r22 = this.$view;
            $r22.showMsg("OTP not sent. Please try again");
            return;
        }
        AccountVerificationView $r23 = this.$view;
        $r23.showMsg("OTP has been sent!");
        AccountVerificationView $r24 = this.$view;
        $r24.setOtpDetails(otpVerificationModel);
    }
}
