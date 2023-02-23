package ai.kudi.agent.issues.domain;

import ai.kudi.agent.issues.data.IssueRatingRequest;
import ai.kudi.agent.issues.data.remote.IssuesApiService;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: RateIssue.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/issues/domain/RateIssue;", "", "networkService", "Lai/kudi/agent/issues/data/remote/IssuesApiService;", "(Lai/kudi/agent/issues/data/remote/IssuesApiService;)V", "getNetworkService", "()Lai/kudi/agent/issues/data/remote/IssuesApiService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/issues/data/RatingResponse;", "issueId", "", "rateIssueRequest", "Lai/kudi/agent/issues/data/IssueRatingRequest;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RateIssue {
    private final IssuesApiService networkService;

    public RateIssue(IssuesApiService issuesApiService) {
        Log_OC.getArray(issuesApiService, "networkService");
        this.networkService = issuesApiService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, IssueRatingRequest issueRatingRequest) {
        Log_OC.getArray(str, "issueId");
        Log_OC.getArray(issueRatingRequest, "rateIssueRequest");
        IssuesApiService $r3 = this.networkService;
        AbstractC11688p $r4 = $r3.rateIssueResolution(issueRatingRequest, str);
        C0250b $r5 = C0250b.f376e;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        Item $r6 = ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.rateIssueResolution(rateIssueRequest, issueId)\n                .map {\n                    it\n                }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssuesApiService getNetworkService() {
        IssuesApiService r1 = this.networkService;
        return r1;
    }
}
