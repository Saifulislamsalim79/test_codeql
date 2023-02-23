package ai.kudi.agent.login.setup.domain;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.login.model.VerifyBvnWithDobRequest;
import ai.kudi.agent.register.domain.dto.OtpVerificationResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
/* compiled from: VerifyFaceWithDob.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/login/setup/domain/VerifyFaceWithDob;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/register/domain/dto/OtpVerificationResponse;", "Lai/kudi/agent/login/model/VerifyBvnWithDobRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyFaceWithDob implements OneInputUseCase<OtpVerificationResponse, VerifyBvnWithDobRequest> {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public VerifyFaceWithDob(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(VerifyBvnWithDobRequest verifyBvnWithDobRequest) {
        Log_OC.getArray(verifyBvnWithDobRequest, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        AbstractC11688p $r4 = $r3.validateBvnWithDob(verifyBvnWithDobRequest);
        RxSchedulers $r5 = this.rxSchedulers;
        Item $r6 = $r5.setSettings();
        AbstractC11688p $r42 = $r4.h0($r6);
        RxSchedulers $r52 = this.rxSchedulers;
        Item $r62 = $r52.main();
        AbstractC11688p $r43 = $r42.R($r62);
        Log_OC.loadImage($r43, "networkService.onboardingApi.validateBvnWithDob(input).subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        VerifyBvnWithDobRequest $r3 = (VerifyBvnWithDobRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
