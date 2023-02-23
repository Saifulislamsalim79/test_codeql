package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.ContactUsFragment;
import ai.kudi.agent.issues.p008ui.CustomerDetailsIssueFragment;
import ai.kudi.agent.issues.p008ui.DelayedKTAtopUpFragment;
import ai.kudi.agent.issues.p008ui.DisputeIssueFragment;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.issues.p008ui.IssueDetailFragment;
import ai.kudi.agent.issues.p008ui.IssueHistoryFragment;
import ai.kudi.agent.issues.p008ui.IssueResolutionFragment;
import ai.kudi.agent.issues.p008ui.IssueSummaryFragment;
import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import ai.kudi.agent.issues.p008ui.KYCformIssueFragment;
import ai.kudi.agent.issues.p008ui.PosIssueFragment;
import ai.kudi.agent.issues.p008ui.PosTerminalIssuesFragment;
import ai.kudi.agent.issues.p008ui.RatingDialog;
import ai.kudi.agent.issues.p008ui.SubmitWithdrawalIssueFragment;
import ai.kudi.agent.issues.p008ui.SupportIssueFragment;
import ai.kudi.agent.issues.p008ui.TransactionListFragment;
import kotlin.Metadata;
/* compiled from: IssueActivityModule.kt */
@Metadata(m10422d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0018H'J\b\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u001cH'J\b\u0010\u001d\u001a\u00020\u001eH'J\b\u0010\u001f\u001a\u00020 H'J\b\u0010!\u001a\u00020\"H'J\b\u0010#\u001a\u00020$H'J\b\u0010%\u001a\u00020&H'J\b\u0010'\u001a\u00020(H'J\b\u0010)\u001a\u00020*H'J\b\u0010+\u001a\u00020,H'¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/IssueActivityModule;", "", "()V", "bindsInboxNavigator", "Lai/kudi/agent/inbox/navigators/InboxNavigator;", "issueActivity", "Lai/kudi/agent/issues/ui/IssueActivity;", "bindsIssueTypeHomeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "bindsIssueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "injectContactUsFragment", "Lai/kudi/agent/issues/ui/ContactUsFragment;", "injectCustomerDetailsIssueFragment", "Lai/kudi/agent/issues/ui/CustomerDetailsIssueFragment;", "injectDelayedKTAtopUpFragment", "Lai/kudi/agent/issues/ui/DelayedKTAtopUpFragment;", "injectDisputeIssueFragment", "Lai/kudi/agent/issues/ui/DisputeIssueFragment;", "injectIssueDetailFragment", "Lai/kudi/agent/issues/ui/IssueDetailFragment;", "injectIssueHistoryFragment", "Lai/kudi/agent/issues/ui/IssueHistoryFragment;", "injectIssueResolutionFragment", "Lai/kudi/agent/issues/ui/IssueResolutionFragment;", "injectIssueSummaryFragment", "Lai/kudi/agent/issues/ui/IssueSummaryFragment;", "injectIssueTypeFragment", "Lai/kudi/agent/issues/ui/IssueTypeFragment;", "injectIssueTypeFragmentNew", "Lai/kudi/agent/issues/ui/IssueTypeFragmentNew;", "injectKYCformIssueFragment", "Lai/kudi/agent/issues/ui/KYCformIssueFragment;", "injectPosIssueFragment", "Lai/kudi/agent/issues/ui/PosIssueFragment;", "injectPosTerminalIssuesFragment", "Lai/kudi/agent/issues/ui/PosTerminalIssuesFragment;", "injectRatingDialog", "Lai/kudi/agent/issues/ui/RatingDialog;", "injectSubmitWithdrawalIssueFragment", "Lai/kudi/agent/issues/ui/SubmitWithdrawalIssueFragment;", "injectSupportIssueFragment", "Lai/kudi/agent/issues/ui/SupportIssueFragment;", "injectTransactionListFragment", "Lai/kudi/agent/issues/ui/TransactionListFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class IssueActivityModule {
    public abstract InboxNavigator bindsInboxNavigator(IssueActivity issueActivity);

    public abstract IssueTypeHomeNavigator bindsIssueTypeHomeNavigator(IssueActivity issueActivity);

    public abstract IssueTypeNavigator bindsIssueTypeNavigator(IssueActivity issueActivity);

    public abstract ContactUsFragment injectContactUsFragment();

    public abstract CustomerDetailsIssueFragment injectCustomerDetailsIssueFragment();

    public abstract DelayedKTAtopUpFragment injectDelayedKTAtopUpFragment();

    public abstract DisputeIssueFragment injectDisputeIssueFragment();

    public abstract IssueDetailFragment injectIssueDetailFragment();

    public abstract IssueHistoryFragment injectIssueHistoryFragment();

    public abstract IssueResolutionFragment injectIssueResolutionFragment();

    public abstract IssueSummaryFragment injectIssueSummaryFragment();

    public abstract IssueTypeFragment injectIssueTypeFragment();

    public abstract IssueTypeFragmentNew injectIssueTypeFragmentNew();

    public abstract KYCformIssueFragment injectKYCformIssueFragment();

    public abstract PosIssueFragment injectPosIssueFragment();

    public abstract PosTerminalIssuesFragment injectPosTerminalIssuesFragment();

    public abstract RatingDialog injectRatingDialog();

    public abstract SubmitWithdrawalIssueFragment injectSubmitWithdrawalIssueFragment();

    public abstract SupportIssueFragment injectSupportIssueFragment();

    public abstract TransactionListFragment injectTransactionListFragment();
}
