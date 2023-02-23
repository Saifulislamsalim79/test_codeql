package ai.kudi.agent.login.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.login.domain.dto.ResetPinRequest;
import ai.kudi.agent.login.domain.dto.ResetPinResponse;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: RequestOtp.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/login/domain/usecases/RequestOtp;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "Lai/kudi/agent/login/domain/dto/ResetPinRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RequestOtp implements OneInputUseCase<ResetPinResponse, ResetPinRequest> {
    private final NetworkService networkService;

    public RequestOtp(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.login.domain.wiki.ResetPinRequest resetPinRequest) {
        Log_OC.getArray(resetPinRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        AbstractC11688p $r4 = $r3.createResetPin(resetPinRequest);
        Item $r5 = ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r43 = $r42.R($r52);
        Log_OC.loadImage($r43, "networkService\n                .onboardingApi\n                .createResetPin(request)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r43;
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
