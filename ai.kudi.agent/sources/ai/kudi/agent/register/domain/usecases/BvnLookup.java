package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.register.domain.wiki.LookUpBvnAndVerifyPhoneRequest;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: VerifyBvn.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/BvnLookup;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "bvnLookUpAndVerifyPhone", "Lio/reactivex/Observable;", "Lai/kudi/agent/register/domain/dto/LookUpBvnAndVerifyPhoneResponse;", "lookUpBvnAndVerifyPhoneRequest", "Lai/kudi/agent/register/domain/dto/LookUpBvnAndVerifyPhoneRequest;", "execute", "Lai/kudi/agent/register/domain/dto/BvnLookUpResponse;", PhoneFragment.ARG_BVN, "", "sessionId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BvnLookup {
    private final NetworkService networkService;

    public BvnLookup(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p bvnLookUpAndVerifyPhone(LookUpBvnAndVerifyPhoneRequest lookUpBvnAndVerifyPhoneRequest) {
        Log_OC.getArray(lookUpBvnAndVerifyPhoneRequest, "lookUpBvnAndVerifyPhoneRequest");
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        AbstractC11688p $r4 = $r3.bvnLookUpAndVerifyPhoneNewAgent(lookUpBvnAndVerifyPhoneRequest);
        C0426c $r5 = C0426c.f1024d;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.onboardingApi.bvnLookUpAndVerifyPhoneNewAgent(\n                lookUpBvnAndVerifyPhoneRequest).map {\n            it\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2) {
        Log_OC.getArray(str, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str2, "sessionId");
        NetworkService $r3 = this.networkService;
        OnboardingApi $r4 = $r3.getOnboardingApi();
        AbstractC11688p $r5 = $r4.bvnLookupExistingAgent(str, str2);
        Duration $r6 = Duration.ZERO;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.onboardingApi.bvnLookupExistingAgent(bvn, sessionId).map {\n            it\n\n        }.subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }
}
