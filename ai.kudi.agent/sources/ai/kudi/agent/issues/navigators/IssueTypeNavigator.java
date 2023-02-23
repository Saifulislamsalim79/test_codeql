package ai.kudi.agent.issues.navigators;

import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: IssueTypeNavigator.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J>\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0015H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0015H&¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "", "makeACall", "", "phoneNumber", "", "navigateToEnquiryLink", "enquiryLink", "navigateToTermsAndConditionsFragment", "pop", "sendEmail", "showTicketResponse", "titleText", "msgText", "actionBtnText", "shouldDismissImmediately", "", "action", "Lkotlin/Function0;", "toCustomerDetailsFragment", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "isFromChargeBackDialog", "toDelayedKtaTopUp", "issueTypeModel", "toDisputeView", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "toIssueContactUsFragment", "toIssueDetailFragment", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "toIssueResolutionFragment", "toIssueSummaryFragment", "toIssueTypeFragment", "toKycFormIssue", "issueType", "issueDetail", "toPosTerminalIssue", "toTransactionListView", "toWithdrawalIssue", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IssueTypeNavigator {

    /* compiled from: IssueTypeNavigator.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void showTicketResponse$default(IssueTypeNavigator issueTypeNavigator, String $r1, String $r2, String $r4, boolean z, InterfaceC11756a interfaceC11756a, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTicketResponse");
                throw $r6;
            }
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = "Issue Submitted";
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = "We will get back to you";
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = "Check Status";
            }
            issueTypeNavigator.showTicketResponse($r1, $r2, $r4, z, interfaceC11756a);
        }
    }

    void doFetch();

    void makeACall(String str);

    void navigateToEnquiryLink(String str);

    void navigateToTermsAndConditionsFragment();

    void sendEmail();

    void showTicketResponse(String str, String str2, String str3, boolean z, InterfaceC11756a interfaceC11756a);

    void toCustomerDetailsFragment(IssueTypeModel issueTypeModel, boolean z);

    void toDelayedKtaTopUp(IssueTypeModel issueTypeModel);

    void toDisputeView(Issue.Ticket ticket);

    void toIssueContactUsFragment();

    void toIssueDetailFragment(IssueCategory issueCategory);

    void toIssueResolutionFragment(IssueTypeModel issueTypeModel);

    void toIssueSummaryFragment(IssueTypeModel issueTypeModel);

    void toIssueTypeFragment(IssueCategory issueCategory);

    void toKycFormIssue(String str, String str2);

    void toPosTerminalIssue(IssueTypeModel issueTypeModel);

    void toTransactionListView(IssueTypeModel issueTypeModel);

    void toWithdrawalIssue(IssueTypeModel issueTypeModel);
}
