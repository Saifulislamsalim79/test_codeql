package ai.kudi.agent.kshock.navigator;

import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
/* compiled from: KShockNavigator.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/kshock/navigator/KShockNavigator;", "", "navigateToOverduePaymentResult", "", TransactionField.STATUS, "", MetricTracker.Object.MESSAGE, "toApplicationSubmittedFragment", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "toCompleteProfileInfo", "toExistingLoanerFragment", "maxLoanAmount", "", "shouldPop", "", "toLoanApplicationFragment", "toLoanApplicationReviewFragment", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "toLoanEligibilityFragment", "toLoanStatusFragment", "toOtpVerification", "mobile", "email", "toOverdueLoanDetailsFragment", "toPendingLoansListFragment", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface KShockNavigator {
    void navigateToOverduePaymentResult(String str, String str2);

    void toApplicationSubmittedFragment(Loan loan);

    void toCompleteProfileInfo();

    void toExistingLoanerFragment(double d, boolean z);

    void toLoanApplicationFragment(double d);

    void toLoanApplicationReviewFragment(Interest interest);

    void toLoanEligibilityFragment();

    void toLoanStatusFragment(Loan loan);

    void toOtpVerification(String str, String str2, Interest interest);

    void toOverdueLoanDetailsFragment(Loan loan);

    void toPendingLoansListFragment(double d);
}
