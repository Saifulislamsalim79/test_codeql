package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.KshockEligibility;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: FetchKshockAvailabilty.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/FetchKshockAvailabilty;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "", "kShockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchKshockAvailabilty implements OneInputUseCase<KshockEligibility, String> {
    private final KshockApi kShockApi;
    private final RxSchedulers rxSchedulers;

    public FetchKshockAvailabilty(KshockApi kshockApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(kshockApi, "kShockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.kShockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final KshockEligibility m39680execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        KshockEligibility $r2 = (KshockEligibility) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        String $r3 = (String) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(String str) {
        Log_OC.getArray(str, MetricTracker.Object.INPUT);
        KshockApi $r2 = this.kShockApi;
        AbstractC11688p $r3 = $r2.fetchKShockEligibility(str);
        Position $r4 = Position.TOP;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        RxSchedulers $r5 = this.rxSchedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        AbstractC11688p $r33 = $r32.h0($r6);
        RxSchedulers $r52 = this.rxSchedulers;
        p425j.p444e.Item $r62 = $r52.main();
        AbstractC11688p $r34 = $r33.R($r62);
        Log_OC.loadImage($r34, "kShockApi.fetchKShockEligibility(input).map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r34;
    }
}
