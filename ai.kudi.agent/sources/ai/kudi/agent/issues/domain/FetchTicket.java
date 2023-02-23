package ai.kudi.agent.issues.domain;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.data.remote.IssuesApiService;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: FetchTicket.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/issues/domain/FetchTicket;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/issues/data/model/Issue;", "", "networkService", "Lai/kudi/agent/issues/data/remote/IssuesApiService;", "(Lai/kudi/agent/issues/data/remote/IssuesApiService;)V", "getNetworkService", "()Lai/kudi/agent/issues/data/remote/IssuesApiService;", "execute", "Lio/reactivex/Observable;", "ticketId", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchTicket implements OneInputUseCase<Issue, String> {
    private final IssuesApiService networkService;

    public FetchTicket(IssuesApiService issuesApiService) {
        Log_OC.getArray(issuesApiService, "networkService");
        this.networkService = issuesApiService;
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
        Log_OC.getArray(str, "ticketId");
        IssuesApiService $r2 = this.networkService;
        AbstractC11688p $r3 = $r2.getSingleIssue(str);
        Item $r4 = ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "networkService.getSingleIssue(ticketId)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssuesApiService getNetworkService() {
        IssuesApiService r1 = this.networkService;
        return r1;
    }
}
