package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchBusinessCategories.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/FetchBusinessCategories;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/register/domain/dto/BusinessCategoryData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchBusinessCategories {
    private final NetworkService networkService;

    public FetchBusinessCategories(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m40335execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute() {
        NetworkService $r1 = this.networkService;
        OnboardingApi $r2 = $r1.getOnboardingApi();
        AbstractC11688p $r3 = $r2.getBusinessCategories();
        C0424aa $r4 = C0424aa.f1022b;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        p425j.p444e.Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r33 = $r32.h0($r5);
        p425j.p444e.Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r34 = $r33.R($r52);
        Log_OC.loadImage($r34, "networkService.onboardingApi.getBusinessCategories().map {\n            it.data\n    }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r34;
    }
}
