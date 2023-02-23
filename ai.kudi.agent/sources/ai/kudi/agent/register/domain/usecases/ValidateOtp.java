package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.register.domain.wiki.OtpVerificationBvnResponse;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModelBvn;
import ai.kudi.agent.register.domain.wiki.OtpVerificationResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* compiled from: ValidateOtp.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/ValidateOtp;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/register/domain/dto/OtpVerificationResponse;", "otpCode", "", "loginAttemptId", MetricTracker.Object.INPUT, "Lai/kudi/agent/register/domain/usecases/Input;", "verifyOtpForBvn", "Lai/kudi/agent/register/domain/dto/OtpVerificationBvnResponse;", "otpVerificationModelBvn", "Lai/kudi/agent/register/domain/dto/OtpVerificationModelBvn;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class ValidateOtp {
    private final NetworkService networkService;

    public ValidateOtp(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final OtpVerificationResponse m40353execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        boolean $z0 = c14840l.m280e();
        if (!$z0) {
            Throwable r4 = new HttpException(c14840l);
            Throwable r5 = r4;
            throw r5;
        }
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        OtpVerificationResponse $r2 = (OtpVerificationResponse) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyOtpForBvn$lambda-1  reason: not valid java name */
    public static final OtpVerificationBvnResponse m40354verifyOtpForBvn$lambda1(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        Object $r0 = c14840l.m284a();
        Log_OC.append($r0);
        OtpVerificationBvnResponse $r2 = (OtpVerificationBvnResponse) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2, Input input) {
        Log_OC.getArray(str, "otpCode");
        Log_OC.getArray(str2, "loginAttemptId");
        Log_OC.getArray(input, MetricTracker.Object.INPUT);
        NetworkService $r4 = this.networkService;
        OnboardingApi $r5 = $r4.getOnboardingApi();
        AbstractC11688p $r6 = $r5.validateOtp(str, str2, input);
        Type $r7 = Type.TOP;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r64 = $r63.R($r82);
        Log_OC.loadImage($r64, "networkService.onboardingApi.validateOtp(otpCode = otpCode, loginAttemptId = loginAttemptId, input = input)\n                .map {\n                    if (!it.isSuccessful){\n                        throw HttpException(it)\n                    } else {\n                        it.body()!!\n                    }\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p verifyOtpForBvn(OtpVerificationModelBvn otpVerificationModelBvn) {
        Log_OC.getArray(otpVerificationModelBvn, "otpVerificationModelBvn");
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        AbstractC11688p $r4 = $r3.validateOtpForBvn(otpVerificationModelBvn);
        C0427g $r5 = C0427g.f1025d;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.onboardingApi.validateOtpForBvn(otpVerificationModelBvn).map {\n            it.body()!!\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }
}
