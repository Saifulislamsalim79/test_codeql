package ai.kudi.agent.login.game.components;

import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.login.p011ui.p012v2.EnterPhoneNoFragment;
import ai.kudi.agent.login.p011ui.p012v2.ForgotPasswordActivity;
import ai.kudi.agent.login.p011ui.p012v2.ResetPinFragment;
import kotlin.Metadata;
/* compiled from: ForgotPasswordSubComponent.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/login/ui/v2/EnterPhoneNoFragment;", "activity", "Lai/kudi/agent/login/ui/v2/ForgotPasswordActivity;", "Lai/kudi/agent/login/ui/v2/ResetPinFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ForgotPasswordSubComponent {

    /* compiled from: ForgotPasswordSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent$Factory;", "", "create", "Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent;", "forgotPasswordNavigator", "Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ForgotPasswordSubComponent create(ForgotPasswordNavigator forgotPasswordNavigator);
    }

    void inject(EnterPhoneNoFragment enterPhoneNoFragment);

    void inject(ForgotPasswordActivity forgotPasswordActivity);

    void inject(ResetPinFragment resetPinFragment);
}
