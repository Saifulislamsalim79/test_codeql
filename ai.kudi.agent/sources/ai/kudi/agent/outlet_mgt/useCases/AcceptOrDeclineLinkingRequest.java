package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OutletMgtApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDeclineResponse;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDelinerequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: AcceptOrDeclineLinkingRequest.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/useCases/AcceptOrDeclineLinkingRequest;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/outlet_mgt/data/OutletMgtAcceptDeclineResponse;", "acceptOrDeclineLinkingRequest", "Lai/kudi/agent/outlet_mgt/data/OutletMgtAcceptDelinerequest;", "id", "", "sessionId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AcceptOrDeclineLinkingRequest {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;

    public AcceptOrDeclineLinkingRequest(NetworkService networkService, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.networkService = networkService;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final OutletMgtAcceptDeclineResponse m39894execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        OutletMgtAcceptDeclineResponse $r2 = (OutletMgtAcceptDeclineResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(OutletMgtAcceptDelinerequest outletMgtAcceptDelinerequest, String str, String str2) {
        Log_OC.getArray(outletMgtAcceptDelinerequest, "acceptOrDeclineLinkingRequest");
        Log_OC.getArray(str, "id");
        Log_OC.getArray(str2, "sessionId");
        NetworkService $r4 = this.networkService;
        OutletMgtApi $r5 = $r4.getOutletApi();
        AbstractC11688p $r6 = $r5.acceptOrDeclineLinkingRequest(outletMgtAcceptDelinerequest, str2, str);
        Label $r7 = Label.f727k;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r64 = $r63.R($r82);
        Log_OC.loadImage($r64, "networkService.outletApi.acceptOrDeclineLinkingRequest(outletMgtAcceptDelinerequest = acceptOrDeclineLinkingRequest, id = id,\n                sessionId = sessionId).map {\n                it.data\n\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}
