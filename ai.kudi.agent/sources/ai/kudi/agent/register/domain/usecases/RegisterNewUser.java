package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.register.domain.dto.PersonalInfo;
import ai.kudi.agent.register.domain.dto.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.UserRegInfo;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: RegisterNewUser.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/RegisterNewUser;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RegisterNewUser implements OneInputUseCase<PersonalInfo, RegistrationInfo> {
    private final NetworkService networkService;

    public RegisterNewUser(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final ai.kudi.agent.register.domain.wiki.PersonalInfo m40342execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        ai.kudi.agent.register.domain.wiki.PersonalInfo $r2 = (ai.kudi.agent.register.domain.wiki.PersonalInfo) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        ai.kudi.agent.register.domain.wiki.PersonalInfo $r4 = registrationInfo.getPersonalInfo();
        UserRegInfo $r5 = $r4.mapToUserRegInfo();
        AbstractC11688p $r6 = $r3.completeUserRegistration($r5);
        Device $r7 = Device.platform;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r64 = $r63.R($r82);
        Log_OC.loadImage($r64, "networkService.onboardingApi.completeUserRegistration(input.personalInfo.mapToUserRegInfo())\n            .map { it.data }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.register.domain.wiki.RegistrationInfo $r3 = (ai.kudi.agent.register.domain.wiki.RegistrationInfo) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
