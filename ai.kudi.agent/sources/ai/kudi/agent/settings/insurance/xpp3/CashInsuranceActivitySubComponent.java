package ai.kudi.agent.settings.insurance.xpp3;

import ai.kudi.agent.settings.insurance.navigator.CashInsuranceFragmentNavigator;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceFragment;
import ai.kudi.agent.settings.insurance.p026ui.InsuranceDeactivationReasonsFragment;
import kotlin.Metadata;
/* compiled from: CashInsuranceActivitySubComponent.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/settings/insurance/ui/CashInsuranceFragment;", "Lai/kudi/agent/settings/insurance/ui/InsuranceDeactivationReasonsFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CashInsuranceActivitySubComponent {

    /* compiled from: CashInsuranceActivitySubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent$Factory;", "", "create", "Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent;", "navigator", "Lai/kudi/agent/settings/insurance/navigator/CashInsuranceFragmentNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        CashInsuranceActivitySubComponent create(CashInsuranceFragmentNavigator cashInsuranceFragmentNavigator);
    }

    void inject(CashInsuranceFragment cashInsuranceFragment);

    void inject(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment);
}
