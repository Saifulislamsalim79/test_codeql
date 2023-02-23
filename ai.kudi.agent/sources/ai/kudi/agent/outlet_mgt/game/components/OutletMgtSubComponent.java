package ai.kudi.agent.outlet_mgt.game.components;

import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.fragments.CreateOutletFragment;
import ai.kudi.agent.outlet_mgt.fragments.ManageOutletFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingBuzzAgentFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingFormFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtAcctFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreateAcctOptionsFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreatePinFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtPersonalFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtResetPinFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtSecurityFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletsListingFragment;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsFragment;
import kotlin.Metadata;
/* compiled from: OutletMgtSubComponent.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\"J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020!H&¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent;", "", "inject", "", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "createOutletFragment", "Lai/kudi/agent/outlet_mgt/fragments/CreateOutletFragment;", "manageOutletFragment", "Lai/kudi/agent/outlet_mgt/fragments/ManageOutletFragment;", "outletLinkingBuzzAgentFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingBuzzAgentFragment;", "Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingFormFragment;", "outletMgtAcctFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtAcctFragment;", "outletMgtCreateAcctOptionsFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtCreateAcctOptionsFragment;", "createPinFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtCreatePinFragment;", "outletMgtPersonalFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtPersonalFragment;", "outletMgtResetPinFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtResetPinFragment;", "outletMgtSecurityFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtSecurityFragment;", "outletsListingFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletsListingFragment;", "transactionsFragment", "Lai/kudi/agent/transactionhistory/ui/view/FilterTransactionsFragment;", "incompleteTransactionsFragment", "Lai/kudi/agent/transactionhistory/ui/view/IncompleteTransactionsFragment;", "transactionsContainerFragment", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsContainerFragment;", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OutletMgtSubComponent {

    /* compiled from: OutletMgtSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent$Factory;", "", "create", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent;", "outletMgtNavigator", "Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;", "transactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;", "incompleteTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        OutletMgtSubComponent create(OutletMgtNavigator outletMgtNavigator, TransactionsNavigator transactionsNavigator, IncompleteTransactionsNavigator incompleteTransactionsNavigator);
    }

    void inject(OutletMgtActivity outletMgtActivity);

    void inject(CreateOutletFragment createOutletFragment);

    void inject(ManageOutletFragment manageOutletFragment);

    void inject(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment);

    void inject(OutletLinkingFormFragment outletLinkingFormFragment);

    void inject(OutletMgtAcctFragment outletMgtAcctFragment);

    void inject(OutletMgtCreateAcctOptionsFragment outletMgtCreateAcctOptionsFragment);

    void inject(OutletMgtCreatePinFragment outletMgtCreatePinFragment);

    void inject(OutletMgtPersonalFragment outletMgtPersonalFragment);

    void inject(OutletMgtResetPinFragment outletMgtResetPinFragment);

    void inject(OutletMgtSecurityFragment outletMgtSecurityFragment);

    void inject(OutletsListingFragment outletsListingFragment);

    void inject(FilterTransactionsFragment filterTransactionsFragment);

    void inject(IncompleteTransactionsFragment incompleteTransactionsFragment);

    void inject(TransactionsContainerFragment transactionsContainerFragment);

    void inject(TransactionsFragment transactionsFragment);
}
