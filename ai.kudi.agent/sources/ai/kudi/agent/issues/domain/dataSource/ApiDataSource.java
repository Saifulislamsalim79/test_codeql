package ai.kudi.agent.issues.domain.dataSource;

import ai.kudi.agent.issues.data.IssueCategories;
import ai.kudi.agent.issues.data.IssueCategoryDetails;
import ai.kudi.agent.issues.data.remote.IssuesApiService;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
/* compiled from: ApiDataSource.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\f2\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/issues/domain/dataSource/ApiDataSource;", "", "networkService", "Lai/kudi/agent/issues/data/remote/IssuesApiService;", "(Lai/kudi/agent/issues/data/remote/IssuesApiService;)V", "fetchIssueDetails", "Lio/reactivex/Maybe;", "", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "type", "", "fetchIssueTypes", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "customerType", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApiDataSource {
    private final IssuesApiService networkService;

    public ApiDataSource(IssuesApiService issuesApiService) {
        Log_OC.getArray(issuesApiService, "networkService");
        this.networkService = issuesApiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueDetails$lambda-1  reason: not valid java name */
    public static final List m39354fetchIssueDetails$lambda1(IssueCategoryDetails issueCategoryDetails) {
        Log_OC.getArray(issueCategoryDetails, "it");
        List $r0 = issueCategoryDetails.getData();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueTypes$lambda-0  reason: not valid java name */
    public static final List m39355fetchIssueTypes$lambda0(IssueCategories issueCategories) {
        Log_OC.getArray(issueCategories, "it");
        List $r0 = issueCategories.getData();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11677k fetchIssueDetails(String str) {
        Log_OC.getArray(str, "type");
        IssuesApiService $r2 = this.networkService;
        AbstractC11677k $r3 = $r2.fetchIssueDetails(str);
        C0251b $r4 = C0251b.f379e;
        AbstractC11677k $r32 = $r3.m10588o($r4);
        Log_OC.loadImage($r32, "networkService.fetchIssueDetails(type).map {\n            it.data\n        }");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchIssueTypes(String str) {
        Log_OC.getArray(str, "customerType");
        IssuesApiService $r2 = this.networkService;
        AbstractC11688p $r3 = $r2.fetchIssueCategories(str);
        ClassWriter $r4 = ClassWriter.f377b;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        Log_OC.loadImage($r32, "networkService.fetchIssueCategories(customerType).map {\n            it.data\n        }");
        return $r32;
    }
}
