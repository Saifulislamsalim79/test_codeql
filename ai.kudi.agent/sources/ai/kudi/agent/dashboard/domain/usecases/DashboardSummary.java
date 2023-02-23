package ai.kudi.agent.dashboard.domain.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.dashboard.domain.fht.DashboardSummaryDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: DashboardSummary.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/dashboard/domain/usecases/DashboardSummary;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/dashboard/domain/dto/DashboardSummaryDto;", "sessionId", "", "queryMap", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class DashboardSummary {
    private final NetworkService networkService;

    public DashboardSummary(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final DashboardSummaryDto m39193execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        DashboardSummaryDto $r2 = (DashboardSummaryDto) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, Map map) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(map, "queryMap");
        NetworkService $r3 = this.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        AbstractC11688p $r5 = $r4.fetchDashboardSummary(str, map);
        Item $r6 = Item.f231k;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.api.fetchDashboardSummary(sessionId, queryMap)\n            .map {\n                it.data\n            }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}
