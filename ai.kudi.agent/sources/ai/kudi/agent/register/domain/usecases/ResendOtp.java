package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* compiled from: ResendOtp.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/ResendOtp;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "otpVerificationModel", "executeAccountHolderVerification", "executeSecondaryVerificationOtp", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class ResendOtp {
    private final NetworkService networkService;

    public ResendOtp(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final OtpVerificationModel m40344execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        boolean $z0 = ((APIResponse) $r1).status;
        if (!$z0) {
            OtpVerificationModel $r3 = new OtpVerificationModel("", null, null, 0L, 0L, false, null, null, null, null, null, false, null, 8190, null);
            return $r3;
        }
        Object $r12 = c14840l.m284a();
        Log_OC.append($r12);
        return (OtpVerificationModel) ((APIResponse) $r12).data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: executeAccountHolderVerification$lambda-1  reason: not valid java name */
    public static final OtpVerificationModel m40345executeAccountHolderVerification$lambda1(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        boolean $z0 = c14840l.m280e();
        if (!$z0) {
            Throwable r6 = new HttpException(c14840l);
            Throwable r7 = r6;
            throw r7;
        }
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        boolean $z02 = ((APIResponse) $r1).status;
        if (!$z02) {
            OtpVerificationModel r5 = new OtpVerificationModel("", null, null, 0L, 0L, false, null, null, null, null, null, false, null, 8190, null);
            return r5;
        }
        Object $r12 = c14840l.m284a();
        Log_OC.append($r12);
        return (OtpVerificationModel) ((APIResponse) $r12).data;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        AbstractC11688p $r4 = $r3.resendOtp(otpVerificationModel);
        Country $r5 = Country.f1011LR;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.onboardingApi.resendOtp(otpVerificationModel)\n                .map {\n                    if (it.body()!!.status) it.body()!!.data else OtpVerificationModel(\n                            phoneNumber = \"\")\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p executeAccountHolderVerification(OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        String $r4 = otpVerificationModel.getLoginAttemptId();
        AbstractC11688p $r5 = $r3.resendOtp($r4, otpVerificationModel);
        EventManager $r6 = EventManager.f1012em;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.onboardingApi.resendOtp(otpVerificationModel.loginAttemptId,\n                                            otpVerificationModel)\n                .map {\n                    if (!it.isSuccessful){\n                        throw HttpException(it)\n                    }\n                    if (it.body()!!.status) it.body()!!.data else OtpVerificationModel(\n                            phoneNumber = \"\")\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p executeSecondaryVerificationOtp(OtpVerificationModel otpVerificationModel, String str) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        Log_OC.getArray(str, "sessionId");
        NetworkService $r3 = this.networkService;
        OnboardingApi $r4 = $r3.getOnboardingApi();
        AbstractC11688p $r5 = $r4.sendOtp(str, otpVerificationModel);
        Unit $r6 = Unit.PERCENT;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.onboardingApi.sendOtp(sessionId, otpVerificationModel).map {\n            it\n        } .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }
}
