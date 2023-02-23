package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanFragment;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanReviewFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockAvailableFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockEligibilityCriteriaFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableInLocationFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockExistingLoanerFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanApplicationSubmittedFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanHistoryFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment;
import ai.kudi.agent.kshock.p009ui.views.OtpVerificationFragment;
import kotlin.Metadata;
/* compiled from: KshockActivityModule.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0018H'J\b\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u001cH'J\b\u0010\u001d\u001a\u00020\u001eH'J\b\u0010\u001f\u001a\u00020 H'J\b\u0010!\u001a\u00020\"H'J\b\u0010#\u001a\u00020$H'¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/KshockActivityModule;", "", "()V", "providesApplyForLoanFragment", "Lai/kudi/agent/kshock/ui/views/ApplyForLoanFragment;", "providesApplyForLoanReviewFragment", "Lai/kudi/agent/kshock/ui/views/ApplyForLoanReviewFragment;", "providesExistingLoanerFragment", "Lai/kudi/agent/kshock/ui/views/KshockExistingLoanerFragment;", "providesKSockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "kShockActivity", "Lai/kudi/agent/kshock/ui/KShockActivity;", "providesKshockAvailableFragment", "Lai/kudi/agent/kshock/ui/views/KShockAvailableFragment;", "providesKshockEligibilityCriteriaFragment", "Lai/kudi/agent/kshock/ui/views/KShockEligibilityCriteriaFragment;", "providesKshockLoansListFragment", "Lai/kudi/agent/kshock/ui/views/KshockLoansListFragment;", "providesKshockNotAvailableFragment", "Lai/kudi/agent/kshock/ui/views/KShockNotAvailableFragment;", "providesKshockNotAvailableInLocationFragment", "Lai/kudi/agent/kshock/ui/views/KShockNotAvailableInLocationFragment;", "providesKshockOverdueLoansDetailFragment", "Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansDetailFragment;", "providesKshockOverdueLoansListFragment", "Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansListFragment;", "providesLoanApplicationSubmittedFragment", "Lai/kudi/agent/kshock/ui/views/LoanApplicationSubmittedFragment;", "providesLoanHistoryFragment", "Lai/kudi/agent/kshock/ui/views/LoanHistoryFragment;", "providesLoanStatusFragment", "Lai/kudi/agent/kshock/ui/views/LoanStatusFragment;", "providesOtpVerificationFragment", "Lai/kudi/agent/kshock/ui/views/OtpVerificationFragment;", "providesPendingLoansListFragment", "Lai/kudi/agent/kshock/ui/views/KshockPendingLoansListFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class KshockActivityModule {
    public abstract ApplyForLoanFragment providesApplyForLoanFragment();

    public abstract ApplyForLoanReviewFragment providesApplyForLoanReviewFragment();

    public abstract KshockExistingLoanerFragment providesExistingLoanerFragment();

    public abstract KShockNavigator providesKSockNavigator(KShockActivity kShockActivity);

    public abstract KShockAvailableFragment providesKshockAvailableFragment();

    public abstract KShockEligibilityCriteriaFragment providesKshockEligibilityCriteriaFragment();

    public abstract KshockLoansListFragment providesKshockLoansListFragment();

    public abstract KShockNotAvailableFragment providesKshockNotAvailableFragment();

    public abstract KShockNotAvailableInLocationFragment providesKshockNotAvailableInLocationFragment();

    public abstract KshockOverdueLoansDetailFragment providesKshockOverdueLoansDetailFragment();

    public abstract KshockOverdueLoansListFragment providesKshockOverdueLoansListFragment();

    public abstract LoanApplicationSubmittedFragment providesLoanApplicationSubmittedFragment();

    public abstract LoanHistoryFragment providesLoanHistoryFragment();

    public abstract LoanStatusFragment providesLoanStatusFragment();

    public abstract OtpVerificationFragment providesOtpVerificationFragment();

    public abstract KshockPendingLoansListFragment providesPendingLoansListFragment();
}
