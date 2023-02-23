package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.p024ui.ConfirmOtpFragment;
import ai.kudi.agent.savings.p024ui.CreateSavingPinFragment;
import ai.kudi.agent.savings.p024ui.CreateSavingsFragment;
import ai.kudi.agent.savings.p024ui.DetailAndTransactionFragment;
import ai.kudi.agent.savings.p024ui.GetStartedFragment;
import ai.kudi.agent.savings.p024ui.PerformActionBottomSheet;
import ai.kudi.agent.savings.p024ui.SavingHistoryFragment;
import ai.kudi.agent.savings.p024ui.SavingsActivity;
import ai.kudi.agent.savings.p024ui.SavingsDetailFragment;
import ai.kudi.agent.savings.p024ui.SavingsFragment;
import ai.kudi.agent.savings.p024ui.SavingsPlanFragment;
import ai.kudi.agent.savings.p024ui.SavingsReviewFragment;
import ai.kudi.agent.savings.p024ui.SavingsTermsAndConditionFragment;
import ai.kudi.agent.savings.p024ui.WithdrawSavingsFragment;
import kotlin.Metadata;
/* compiled from: SavingsModule.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0018H'J\b\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u001cH'J\b\u0010\u001d\u001a\u00020\u001eH'J\b\u0010\u001f\u001a\u00020 H'¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/SavingsModule;", "", "()V", "provideCreateSavingsFragment", "Lai/kudi/agent/savings/ui/CreateSavingsFragment;", "provideGetStartedFragment", "Lai/kudi/agent/savings/ui/GetStartedFragment;", "provideSavingsDetailFragment", "Lai/kudi/agent/savings/ui/SavingsDetailFragment;", "provideSavingsFragment", "Lai/kudi/agent/savings/ui/SavingsFragment;", "provideSavingsNavigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "savingsActivity", "Lai/kudi/agent/savings/ui/SavingsActivity;", "provideSavingsPlanFragment", "Lai/kudi/agent/savings/ui/SavingsPlanFragment;", "provideSavingsReviewFragment", "Lai/kudi/agent/savings/ui/SavingsReviewFragment;", "provideSavingsTermsAndConditionFragment", "Lai/kudi/agent/savings/ui/SavingsTermsAndConditionFragment;", "providesConfirmOtpFragment", "Lai/kudi/agent/savings/ui/ConfirmOtpFragment;", "providesCreateSavingPinFragment", "Lai/kudi/agent/savings/ui/CreateSavingPinFragment;", "providesDetailAndTransactionAdapter", "Lai/kudi/agent/savings/ui/DetailAndTransactionFragment;", "providesPerformActionBottomSheet", "Lai/kudi/agent/savings/ui/PerformActionBottomSheet;", "providesSavingHistoryFragment", "Lai/kudi/agent/savings/ui/SavingHistoryFragment;", "providesWithdrawSavingsFragment", "Lai/kudi/agent/savings/ui/WithdrawSavingsFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class SavingsModule {
    public abstract CreateSavingsFragment provideCreateSavingsFragment();

    public abstract GetStartedFragment provideGetStartedFragment();

    public abstract SavingsDetailFragment provideSavingsDetailFragment();

    public abstract SavingsFragment provideSavingsFragment();

    public abstract SavingsNavigator provideSavingsNavigator(SavingsActivity savingsActivity);

    public abstract SavingsPlanFragment provideSavingsPlanFragment();

    public abstract SavingsReviewFragment provideSavingsReviewFragment();

    public abstract SavingsTermsAndConditionFragment provideSavingsTermsAndConditionFragment();

    public abstract ConfirmOtpFragment providesConfirmOtpFragment();

    public abstract CreateSavingPinFragment providesCreateSavingPinFragment();

    public abstract DetailAndTransactionFragment providesDetailAndTransactionAdapter();

    public abstract PerformActionBottomSheet providesPerformActionBottomSheet();

    public abstract SavingHistoryFragment providesSavingHistoryFragment();

    public abstract WithdrawSavingsFragment providesWithdrawSavingsFragment();
}
