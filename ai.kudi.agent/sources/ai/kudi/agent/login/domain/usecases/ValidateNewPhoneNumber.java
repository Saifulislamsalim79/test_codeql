package ai.kudi.agent.login.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.login.domain.dto.ResetPinRequest;
import ai.kudi.agent.login.domain.dto.ResetPinResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: ValidateNewPhoneNumber.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/login/domain/usecases/ValidateNewPhoneNumber;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "Lai/kudi/agent/login/domain/dto/ResetPinRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ValidateNewPhoneNumber implements OneInputUseCase<ResetPinResponse, ResetPinRequest> {
    private final NetworkService networkService;

    public ValidateNewPhoneNumber(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.login.domain.wiki.ResetPinRequest resetPinRequest) {
        Log_OC.getArray(resetPinRequest, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        String $r4 = resetPinRequest.getOtp();
        Log_OC.append($r4);
        AbstractC11688p $r5 = $r3.verifyOtpForNewAccount($r4, resetPinRequest);
        Item $r6 = ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "networkService\n                .onboardingApi\n                .verifyOtpForNewAccount(input.otp!!, input)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.login.domain.wiki.ResetPinRequest $r3 = (ai.kudi.agent.login.domain.wiki.ResetPinRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
