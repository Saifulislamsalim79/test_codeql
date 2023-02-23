package ai.kudi.agent.login.game.components;

import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.login.setup.p010ui.BvnUpdateFragment;
import ai.kudi.agent.login.setup.p010ui.EnforceBvnVerificationFragment;
import ai.kudi.agent.login.setup.p010ui.NewDeviceVerificationOptionFragment;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceDobFragment;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceFaceVerificationFragment;
import kotlin.Metadata;
/* compiled from: DeviceVerificationSubcomponent.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent;", "", "inject", "", "activity", "Lai/kudi/agent/login/setup/ui/AccountVerificationHolderActivity;", "fragment", "Lai/kudi/agent/login/setup/ui/BvnUpdateFragment;", "Lai/kudi/agent/login/setup/ui/EnforceBvnVerificationFragment;", "newDeviceVerificationOptionFragment", "Lai/kudi/agent/login/setup/ui/NewDeviceVerificationOptionFragment;", "unknownDeviceDobFragment", "Lai/kudi/agent/login/setup/ui/UnknownDeviceDobFragment;", "Lai/kudi/agent/login/setup/ui/UnknownDeviceFaceVerificationFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface DeviceVerificationSubcomponent {

    /* compiled from: DeviceVerificationSubcomponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent$Factory;", "", "create", "Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent;", "phoneVerificationNavigator", "Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        DeviceVerificationSubcomponent create(PhoneVerificationNavigator phoneVerificationNavigator);
    }

    void inject(AccountVerificationHolderActivity accountVerificationHolderActivity);

    void inject(BvnUpdateFragment bvnUpdateFragment);

    void inject(EnforceBvnVerificationFragment enforceBvnVerificationFragment);

    void inject(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment);

    void inject(UnknownDeviceDobFragment unknownDeviceDobFragment);

    void inject(UnknownDeviceFaceVerificationFragment unknownDeviceFaceVerificationFragment);
}
