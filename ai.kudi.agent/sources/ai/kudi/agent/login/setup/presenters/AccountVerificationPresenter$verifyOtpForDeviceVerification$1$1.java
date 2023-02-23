package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.login.setup.views.AccountVerificationView;
import ai.kudi.agent.register.domain.dto.OtpVerificationResponse;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/OtpVerificationResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountVerificationPresenter$verifyOtpForDeviceVerification$1$1 extends AbstractC11802m implements InterfaceC11767l<OtpVerificationResponse, C13666w> {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    final /* synthetic */ OtpVerificationModel $otpVerificationModel;
    final /* synthetic */ AccountVerificationView $view;
    final /* synthetic */ AccountVerificationPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerificationPresenter$verifyOtpForDeviceVerification$1$1(AccountVerificationPresenter accountVerificationPresenter, OtpVerificationModel otpVerificationModel, double d, double d2, AccountVerificationView accountVerificationView) {
        super(1);
        this.this$0 = accountVerificationPresenter;
        this.$otpVerificationModel = otpVerificationModel;
        this.$latitude = d;
        this.$longitude = d2;
        this.$view = accountVerificationView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39752invoke$lambda0(OtpVerificationModel otpVerificationModel, AccountVerificationView accountVerificationView) {
        Log_OC.getArray(otpVerificationModel, "$otpVerificationModel");
        Log_OC.getArray(accountVerificationView, "verificationView");
        accountVerificationView.hideProgress();
        accountVerificationView.navigateToFaceFragment(otpVerificationModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(OtpVerificationResponse otpVerificationResponse) {
        ai.kudi.agent.register.domain.wiki.OtpVerificationResponse $r2 = (ai.kudi.agent.register.domain.wiki.OtpVerificationResponse) otpVerificationResponse;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.register.domain.wiki.OtpVerificationResponse otpVerificationResponse) {
        Log_OC.getArray(otpVerificationResponse, "it");
        String $r3 = otpVerificationResponse.getStatus();
        RegistrationStatus $r4 = RegistrationStatus.ALLOW;
        String $r5 = $r4.name();
        boolean $z0 = Log_OC.append($r3, $r5);
        if (!$z0) {
            RegistrationStatus $r42 = RegistrationStatus.FACE_VERIFICATION_NEEDED;
            String $r52 = $r42.name();
            boolean $z02 = Log_OC.append($r3, $r52);
            if ($z02) {
                AccountVerificationPresenter $r1 = this.this$0;
                final OtpVerificationModel $r6 = this.$otpVerificationModel;
                $r1.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.setup.presenters.Container
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    public final void removeEventListener(Object obj) {
                        OtpVerificationModel $r12 = OtpVerificationModel.this;
                        AccountVerificationView $r32 = (AccountVerificationView) obj;
                        AccountVerificationPresenter$verifyOtpForDeviceVerification$1$1.m39752invoke$lambda0($r12, $r32);
                    }
                });
                return;
            }
            AccountVerificationView $r12 = this.$view;
            $r12.showMsg(otpVerificationResponse.getMessage());
            AccountVerificationView $r122 = this.$view;
            $r122.hideProgress();
            return;
        }
        AccountVerificationPresenter $r13 = this.this$0;
        OtpVerificationModel $r62 = this.$otpVerificationModel;
        String $r32 = $r62.getPhoneNumber();
        OtpVerificationModel $r63 = this.$otpVerificationModel;
        String $r53 = $r63.getPin();
        OtpVerificationModel $r64 = this.$otpVerificationModel;
        String $r7 = $r64.getDeviceName();
        OtpVerificationModel $r65 = this.$otpVerificationModel;
        String $r8 = $r65.getDeviceId();
        OtpVerificationModel $r66 = this.$otpVerificationModel;
        String $r9 = $r66.getImeiId();
        RegistrationStatus $r43 = RegistrationStatus.OTP_VERIFICATION_NEEDED;
        String $r10 = $r43.name();
        double $d0 = this.$latitude;
        double $d1 = this.$longitude;
        $r13.performLogin($r32, $r53, $r7, $r8, $r9, $r10, $d0, $d1);
    }
}
