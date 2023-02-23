package ai.kudi.agent.issues.domain;

import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: FetchIssueCategories.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/issues/domain/FetchIssueCategories;", "", "issueRepository", "Lai/kudi/agent/issues/domain/repositories/IssueRepository;", "(Lai/kudi/agent/issues/domain/repositories/IssueRepository;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "customerType", "", "fetchIssueDetails", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "type", "getIsFromDb", "", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchIssueCategories {
    private final IssueRepository issueRepository;

    public FetchIssueCategories(IssueRepository issueRepository) {
        Log_OC.getArray(issueRepository, "issueRepository");
        this.issueRepository = issueRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "customerType");
        IssueRepository $r2 = this.issueRepository;
        AbstractC11688p $r3 = $r2.getIssueTypes(str);
        Item $r4 = ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "issueRepository.getIssueTypes(customerType).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchIssueDetails(String str) {
        Log_OC.getArray(str, "type");
        IssueRepository $r2 = this.issueRepository;
        AbstractC11688p $r3 = $r2.getIssueDetails(str);
        Item $r4 = ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "issueRepository.getIssueDetails(type).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getIsFromDb() {
        IssueRepository $r1 = this.issueRepository;
        boolean $z0 = $r1.isFromDb();
        return $z0;
    }
}
