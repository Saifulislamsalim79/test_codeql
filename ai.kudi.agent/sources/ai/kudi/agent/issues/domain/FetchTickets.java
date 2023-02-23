package ai.kudi.agent.issues.domain;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.issues.data.remote.IssuesApiService;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* compiled from: FetchTickets.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/issues/domain/FetchTickets;", "", "networkService", "Lai/kudi/agent/issues/data/remote/IssuesApiService;", "(Lai/kudi/agent/issues/data/remote/IssuesApiService;)V", "getNetworkService", "()Lai/kudi/agent/issues/data/remote/IssuesApiService;", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "sessionId", "", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchTickets {
    private final IssuesApiService networkService;

    public FetchTickets(IssuesApiService issuesApiService) {
        Log_OC.getArray(issuesApiService, "networkService");
        this.networkService = issuesApiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m39350execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        if (c14840l.m284a() == null) {
            Throwable r5 = new HttpException(c14840l);
            Throwable r6 = r5;
            throw r6;
        }
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        APIResponse $r2 = (APIResponse) $r1;
        List $r3 = (List) $r2.data;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, FetchRequest fetchRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(fetchRequest, "fetchRequest");
        IssuesApiService $r3 = this.networkService;
        Map $r4 = fetchRequest.getParams();
        AbstractC11688p $r5 = $r3.getIssues(str, $r4);
        Type $r6 = Type.GRIDSET;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.getIssues(sessionId, fetchRequest.params)\n                .map {\n                    if(it.body() == null) throw HttpException(it) else{\n                        it.body()!!.data\n                    }\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssuesApiService getNetworkService() {
        IssuesApiService r1 = this.networkService;
        return r1;
    }
}
