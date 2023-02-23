package ai.kudi.agent.inbox.navigators;

import ai.kudi.agent.issues.data.model.Issue;
import kotlin.Metadata;
/* compiled from: InboxNavigator.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/inbox/navigators/InboxNavigator;", "", "toDisputeIssueView", "", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "toInboxView", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface InboxNavigator {
    void toDisputeIssueView(Issue.Ticket ticket);

    void toInboxView();
}
