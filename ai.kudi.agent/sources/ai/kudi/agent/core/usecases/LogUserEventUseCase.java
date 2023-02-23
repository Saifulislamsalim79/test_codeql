package ai.kudi.agent.core.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: LogUserEventUseCase.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/usecases/LogUserEventUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "", "Lai/kudi/agent/core/usecases/LogUserEventRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LogUserEventUseCase implements OneInputUseCase<Map<String, ? extends String>, LogUserEventRequest> {
    private final NetworkService networkService;

    public LogUserEventUseCase(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Map m39170execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        Map $r2 = (Map) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(LogUserEventRequest logUserEventRequest) {
        Log_OC.getArray(logUserEventRequest, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        AbstractC11688p $r4 = $r3.logUserEvent(logUserEventRequest);
        Item $r5 = ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        C0195b $r6 = C0195b.f207e;
        AbstractC11688p $r43 = $r42.m10531O($r6);
        Log_OC.loadImage($r43, "networkService.api.logUserEvent(input)\n            .subscribeOn(Schedulers.io())\n            .map { it.data }");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        LogUserEventRequest $r3 = (LogUserEventRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
