package ai.kudi.agent.outlet_mgt.game.components;

import ai.kudi.agent.outlet_mgt.activities.OutletMgtAcceptDeclineActivity;
import ai.kudi.agent.outlet_mgt.activities.OutletTopUpActivity;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity;
import ai.kudi.agent.outlet_mgt.fragments.OutletTopUpAmountFragment;
import kotlin.Metadata;
/* compiled from: OutletMgtFeaturesSubcomponents.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "", "inject", "", "outletMgtAcceptDeclineActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtAcceptDeclineActivity;", "outletTopUpActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletTopUpActivity;", "childOutletInformationActivity", "Lai/kudi/agent/outlet_mgt/activities/outlet_info/ChildOutletInformationActivity;", "outletTopUpAmountFragment", "Lai/kudi/agent/outlet_mgt/fragments/OutletTopUpAmountFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OutletMgtFeaturesSubcomponents {

    /* compiled from: OutletMgtFeaturesSubcomponents.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents$Factory;", "", "create", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        OutletMgtFeaturesSubcomponents create();
    }

    void inject(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity);

    void inject(OutletTopUpActivity outletTopUpActivity);

    void inject(ChildOutletInformationActivity childOutletInformationActivity);

    void inject(OutletTopUpAmountFragment outletTopUpAmountFragment);
}
