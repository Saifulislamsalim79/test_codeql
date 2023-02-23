package ai.kudi.agent.inbox.game.components;

import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.inbox.p007ui.InboxActivity;
import ai.kudi.agent.inbox.p007ui.InboxIssueListFragment;
import ai.kudi.agent.issues.p008ui.DisputeIssueFragment;
import ai.kudi.agent.issues.p008ui.RatingDialog;
import kotlin.Metadata;
/* compiled from: InboxSubComponent.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\tH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/inbox/di/components/InboxSubComponent;", "", "inject", "", "inboxActivity", "Lai/kudi/agent/inbox/ui/InboxActivity;", "fragment", "Lai/kudi/agent/inbox/ui/InboxIssueListFragment;", "Lai/kudi/agent/issues/ui/DisputeIssueFragment;", "Lai/kudi/agent/issues/ui/RatingDialog;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface InboxSubComponent {

    /* compiled from: InboxSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/inbox/di/components/InboxSubComponent$Factory;", "", "create", "Lai/kudi/agent/inbox/di/components/InboxSubComponent;", "inboxNavigator", "Lai/kudi/agent/inbox/navigators/InboxNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        InboxSubComponent create(InboxNavigator inboxNavigator);
    }

    void inject(InboxActivity inboxActivity);

    void inject(InboxIssueListFragment inboxIssueListFragment);

    void inject(DisputeIssueFragment disputeIssueFragment);

    void inject(RatingDialog ratingDialog);
}
