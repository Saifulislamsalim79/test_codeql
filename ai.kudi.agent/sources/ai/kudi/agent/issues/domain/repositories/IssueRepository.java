package ai.kudi.agent.issues.domain.repositories;

import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: IssueRepository.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u000e\u001a\u00020\fH&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b2\u0006\u0010\u0011\u001a\u00020\fH&J\b\u0010\u0012\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/issues/domain/repositories/IssueRepository;", "", "isFromDb", "", "()Z", "setFromDb", "(Z)V", "getIssueDetails", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "type", "", "getIssueDetailsByLabel", "label", "getIssueTypes", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "customerType", "shouldLoadIssuetypesFromNetwork", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IssueRepository {
    AbstractC11688p getIssueDetails(String str);

    AbstractC11688p getIssueDetailsByLabel(String str);

    AbstractC11688p getIssueTypes(String str);

    boolean isFromDb();

    void setFromDb(boolean z);

    boolean shouldLoadIssuetypesFromNetwork();
}
