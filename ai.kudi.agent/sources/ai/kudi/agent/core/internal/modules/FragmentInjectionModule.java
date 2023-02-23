package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import kotlin.Metadata;
/* compiled from: FragmentInjectionModule.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/FragmentInjectionModule;", "", "()V", "injectBanksFragment", "Lai/kudi/agent/banks/ui/BanksFragment;", "injectIssuesTermsAndConditionsFragment", "Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment;", "injectKudiPinV2", "Lai/kudi/agent/pin/KudiPin;", "injectReceiptTerminalConfirmationFragment", "Lai/kudi/agent/transactions/ui/bottomsheet/SendReceiptToTerminalConfirmationBottomSheet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class FragmentInjectionModule {
    public abstract BanksFragment injectBanksFragment();

    public abstract IssuesTermsAndConditionsFragment injectIssuesTermsAndConditionsFragment();

    public abstract KudiPin injectKudiPinV2();

    public abstract SendReceiptToTerminalConfirmationBottomSheet injectReceiptTerminalConfirmationFragment();
}
