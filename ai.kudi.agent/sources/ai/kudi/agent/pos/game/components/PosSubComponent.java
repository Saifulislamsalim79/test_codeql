package ai.kudi.agent.pos.game.components;

import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.LeasePosTermsOfAgreementFragment;
import ai.kudi.agent.pos.p016ui.OrderDetailsFragment;
import ai.kudi.agent.pos.p016ui.PosActivity;
import ai.kudi.agent.pos.p016ui.PosDeliveryAddressFragment;
import ai.kudi.agent.pos.p016ui.PosEligibilityFragment;
import ai.kudi.agent.pos.p016ui.PosOrderDetailFragment;
import ai.kudi.agent.pos.p016ui.PosOrderHistoryFragment;
import ai.kudi.agent.pos.p016ui.SelectPosFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.ActivatePosFragment;
import kotlin.Metadata;
/* compiled from: PosSubComponent.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/pos/di/components/PosSubComponent;", "", "inject", "", "leasePosTermsOfAgreementFragment", "Lai/kudi/agent/pos/ui/LeasePosTermsOfAgreementFragment;", "orderDetailsFragment", "Lai/kudi/agent/pos/ui/OrderDetailsFragment;", "posActivity", "Lai/kudi/agent/pos/ui/PosActivity;", "posDeliveryAddressFragment", "Lai/kudi/agent/pos/ui/PosDeliveryAddressFragment;", "posEligibilityFragment", "Lai/kudi/agent/pos/ui/PosEligibilityFragment;", "posOrderDetailFragment", "Lai/kudi/agent/pos/ui/PosOrderDetailFragment;", "posOrderHistoryFragment", "Lai/kudi/agent/pos/ui/PosOrderHistoryFragment;", "selectPosFragment", "Lai/kudi/agent/pos/ui/SelectPosFragment;", "activatePosFragment", "Lai/kudi/agent/settings/account/ui/fragment/ActivatePosFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PosSubComponent {

    /* compiled from: PosSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/pos/di/components/PosSubComponent$Factory;", "", "create", "Lai/kudi/agent/pos/di/components/PosSubComponent;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        PosSubComponent create(TerminalRequestNavigator terminalRequestNavigator);
    }

    void inject(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment);

    void inject(OrderDetailsFragment orderDetailsFragment);

    void inject(PosActivity posActivity);

    void inject(PosDeliveryAddressFragment posDeliveryAddressFragment);

    void inject(PosEligibilityFragment posEligibilityFragment);

    void inject(PosOrderDetailFragment posOrderDetailFragment);

    void inject(PosOrderHistoryFragment posOrderHistoryFragment);

    void inject(SelectPosFragment selectPosFragment);

    void inject(ActivatePosFragment activatePosFragment);
}
