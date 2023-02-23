package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.WelcomeViewData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: WelcomeViewModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/WelcomeViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/WelcomeViewData;", "registerNavigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "(Lai/kudi/agent/register/navigators/RegisterNavigator;)V", "continueClicked", "", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "isOutlet", "isHq", "customerType", "", "fundWalletClicked", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.WelcomeViewModel */
/* loaded from: classes.dex */
public final class WelcomeViewModel extends BaseViewModel<WelcomeViewData> {
    private final RegisterNavigator registerNavigator;

    public WelcomeViewModel(RegisterNavigator registerNavigator) {
        Log_OC.getArray(registerNavigator, "registerNavigator");
        this.registerNavigator = registerNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void continueClicked(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        Log_OC.getArray(str, "customerType");
        RegisterNavigator $r2 = this.registerNavigator;
        $r2.navigateToDashboard(d, z, z2, z3, z4, z5, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fundWalletClicked() {
        RegisterNavigator $r1 = this.registerNavigator;
        $r1.navigateToFundWallet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        WelcomeViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public WelcomeViewData initialData() {
        WelcomeViewData $r1 = new WelcomeViewData();
        return $r1;
    }
}
