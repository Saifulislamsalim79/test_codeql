package ai.kudi.agent.issues.data.remote;

import ai.kudi.agent.issues.data.IssueRatingRequest;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import java.util.Map;
import kotlin.Metadata;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
/* compiled from: IssuesApiService.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'JB\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0016\b\u0001\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0016H'J:\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0016\b\u0001\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0006H'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u0006H'¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/issues/data/remote/IssuesApiService;", "", "createIssue", "Lio/reactivex/Observable;", "Lai/kudi/agent/issues/data/model/Issue;", "sessionId", "", "issueRequest", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "fetchIssueCategories", "Lai/kudi/agent/issues/data/IssueCategories;", "customerType", "fetchIssueDetails", "Lio/reactivex/Maybe;", "Lai/kudi/agent/issues/data/IssueCategoryDetails;", "type", "getIssues", "Lretrofit2/Response;", "Lai/kudi/agent/core/network/response/APIResponse;", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "query", "", "getIssuesByTransactionType", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModelWithDuplicateChecker;", "getSingleIssue", "ticketId", "rateIssueResolution", "Lai/kudi/agent/issues/data/RatingResponse;", "ratingRequest", "Lai/kudi/agent/issues/data/IssueRatingRequest;", "id", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IssuesApiService {
    AbstractC11688p createIssue(String str, IssueTypeModel issueTypeModel);

    AbstractC11688p fetchIssueCategories(String str);

    AbstractC11677k fetchIssueDetails(String str);

    AbstractC11688p getIssues(String str, Map map);

    AbstractC11688p getIssuesByTransactionType(String str, String str2, Map map);

    AbstractC11688p getSingleIssue(String str);

    AbstractC11688p rateIssueResolution(IssueRatingRequest issueRatingRequest, String str);
}
