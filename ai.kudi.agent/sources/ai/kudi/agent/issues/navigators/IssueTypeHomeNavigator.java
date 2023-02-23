package ai.kudi.agent.issues.navigators;

import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.issues.data.model.Issue;
import kotlin.Metadata;
/* compiled from: IssueTypeHomeNavigator.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "", "toDisputeIssueFragment", "", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "toIssueContactUsFragment", "toIssueDetailFragment", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "toIssueTypeFragment", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IssueTypeHomeNavigator {
    void toDisputeIssueFragment(Issue.Ticket ticket);

    void toIssueContactUsFragment();

    void toIssueDetailFragment(IssueCategory issueCategory);

    void toIssueTypeFragment(IssueCategory issueCategory);
}
