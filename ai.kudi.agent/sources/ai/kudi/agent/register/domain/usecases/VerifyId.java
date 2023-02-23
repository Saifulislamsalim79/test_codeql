package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.register.domain.wiki.Data;
import ai.kudi.agent.register.domain.wiki.IdVerificationRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: VerifyId.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/VerifyId;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/register/domain/dto/Data;", "idVerificationRequest", "Lai/kudi/agent/register/domain/dto/IdVerificationRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyId {
    private final NetworkService networkService;

    public VerifyId(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Data m40359execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        Log_OC.append($r1);
        Data $r2 = (Data) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(IdVerificationRequest idVerificationRequest) {
        Log_OC.getArray(idVerificationRequest, "idVerificationRequest");
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        AbstractC11688p $r4 = $r3.verifyPendingUserId(idVerificationRequest);
        FlurryAdSize $r5 = FlurryAdSize.FULLSCREEN;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.onboardingApi.verifyPendingUserId(idVerificationRequest).map {\n                it.data!!\n            }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }
}
