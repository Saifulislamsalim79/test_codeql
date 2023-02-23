package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.register.domain.dto.PersonalInfo;
import ai.kudi.agent.register.domain.dto.RegistrationInfo;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p590o.p591a.Timber;
/* compiled from: RegisterNewAgent.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/RegisterNewAgent;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RegisterNewAgent implements OneInputUseCase<PersonalInfo, RegistrationInfo> {
    private final NetworkService networkService;

    public RegisterNewAgent(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, MetricTracker.Object.INPUT);
        String $r2 = registrationInfo.getRegistrationId();
        Object[] $r3 = new Object[0];
        Timber.tag(Log_OC.m10359a("regId at final stage ", (Object) $r2), $r3);
        NetworkService $r4 = this.networkService;
        OnboardingApi $r5 = $r4.getOnboardingApi();
        String $r22 = registrationInfo.getRegistrationId();
        ai.kudi.agent.register.domain.wiki.PersonalInfo $r6 = registrationInfo.getPersonalInfo();
        AbstractC11688p $r7 = $r5.completeAgentRegistration($r22, $r6);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r72 = $r7.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r73 = $r72.R($r82);
        Log_OC.loadImage($r73, "networkService.onboardingApi.completeAgentRegistration(input.registrationId,\n                                                            input.personalInfo)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r73;
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
