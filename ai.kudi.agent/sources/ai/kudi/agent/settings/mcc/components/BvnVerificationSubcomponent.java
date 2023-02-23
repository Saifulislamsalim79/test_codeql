package ai.kudi.agent.settings.mcc.components;

import ai.kudi.agent.login.p011ui.NonAgentSignOnFragment;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.AccountTypeFragment;
import ai.kudi.agent.register.p021ui.BusinessInfoFragment;
import ai.kudi.agent.register.p021ui.CreatePinFragment;
import ai.kudi.agent.register.p021ui.PersonalInfoFragment;
import ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.WelcomeFragment;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureFragment;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import kotlin.Metadata;
/* compiled from: BvnVerificationSubcomponent.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent;", "", "inject", "", "fragment", "Lai/kudi/agent/login/ui/NonAgentSignOnFragment;", "Lai/kudi/agent/register/ui/AccountTypeFragment;", "Lai/kudi/agent/register/ui/BusinessInfoFragment;", "Lai/kudi/agent/register/ui/CreatePinFragment;", "Lai/kudi/agent/register/ui/PersonalInfoFragment;", "Lai/kudi/agent/register/v2/ui/BvnNinFragment;", "Lai/kudi/agent/register/v2/ui/PhoneFragment;", "Lai/kudi/agent/register/v2/ui/WelcomeFragment;", "Lai/kudi/agent/register/verifybvn/VerifyBvnPictureFragment;", "activity", "Lai/kudi/agent/settings/ui/BvnExistingAgentActivity;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BvnVerificationSubcomponent {

    /* compiled from: BvnVerificationSubcomponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent$Factory;", "", "create", "Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent;", "registerV2Navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        BvnVerificationSubcomponent create(RegisterNavigator registerNavigator);
    }

    void inject(NonAgentSignOnFragment nonAgentSignOnFragment);

    void inject(AccountTypeFragment accountTypeFragment);

    void inject(BusinessInfoFragment businessInfoFragment);

    void inject(CreatePinFragment createPinFragment);

    void inject(PersonalInfoFragment personalInfoFragment);

    void inject(BvnNinFragment bvnNinFragment);

    void inject(PhoneFragment phoneFragment);

    void inject(WelcomeFragment welcomeFragment);

    void inject(VerifyBvnPictureFragment verifyBvnPictureFragment);

    void inject(BvnExistingAgentActivity bvnExistingAgentActivity);
}
