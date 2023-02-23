package ai.kudi.agent.issues.domain;

import ai.kudi.agent.issues.data.remote.IssuesApiService;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13725q0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: FetchIssueType.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/issues/domain/FetchIssueType;", "", "networkService", "Lai/kudi/agent/issues/data/remote/IssuesApiService;", "(Lai/kudi/agent/issues/data/remote/IssuesApiService;)V", "getNetworkService", "()Lai/kudi/agent/issues/data/remote/IssuesApiService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModelWithDuplicateChecker;", "transactionType", "", "transactionId", "sessionId", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchIssueType {
    private final IssuesApiService networkService;

    public FetchIssueType(IssuesApiService issuesApiService) {
        Log_OC.getArray(issuesApiService, "networkService");
        this.networkService = issuesApiService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AbstractC11688p execute$default(FetchIssueType fetchIssueType, String str, String $r5, String str2, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            throw $r6;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r5 = null;
        }
        AbstractC11688p $r2 = fetchIssueType.execute(str, $r5, str2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2, String str3) {
        Map $r4;
        Log_OC.getArray(str, "transactionType");
        Log_OC.getArray(str3, "sessionId");
        if (str2 == null) {
            $r4 = null;
        } else {
            C13287o $r5 = C13664u.m4227a("transactionId", str2);
            $r4 = C13725q0.m3897g($r5);
        }
        IssuesApiService $r6 = this.networkService;
        AbstractC11688p $r7 = $r6.getIssuesByTransactionType(str, str3, $r4);
        Item $r8 = ClassWriter.LogError();
        AbstractC11688p $r72 = $r7.h0($r8);
        Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r73 = $r72.R($r82);
        Log_OC.loadImage($r73, "networkService.getIssuesByTransactionType(transactionType, sessionId, query)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r73;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssuesApiService getNetworkService() {
        IssuesApiService r1 = this.networkService;
        return r1;
    }
}
