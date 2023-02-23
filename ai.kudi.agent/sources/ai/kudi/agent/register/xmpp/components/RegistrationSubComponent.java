package ai.kudi.agent.register.xmpp.components;

import ai.kudi.agent.login.p011ui.NonAgentSignOnFragment;
import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.AccountTypeFragment;
import ai.kudi.agent.register.p021ui.BusinessInfoFragment;
import ai.kudi.agent.register.p021ui.CreatePinFragment;
import ai.kudi.agent.register.p021ui.PersonalInfoFragment;
import ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment;
import ai.kudi.agent.register.p022v2.p023ui.EmailVerificationFragment;
import ai.kudi.agent.register.p022v2.p023ui.EnableFingerPrintFragment;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.p022v2.p023ui.WelcomeFragment;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureFragment;
import kotlin.Metadata;
/* compiled from: RegistrationSubComponent.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0010H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/register/di/components/RegistrationSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/login/ui/NonAgentSignOnFragment;", "Lai/kudi/agent/register/ui/AccountTypeFragment;", "Lai/kudi/agent/register/ui/BusinessInfoFragment;", "Lai/kudi/agent/register/ui/CreatePinFragment;", "Lai/kudi/agent/register/ui/PersonalInfoFragment;", "Lai/kudi/agent/register/v2/ui/BvnNinFragment;", "Lai/kudi/agent/register/v2/ui/EmailVerificationFragment;", "Lai/kudi/agent/register/v2/ui/EnableFingerPrintFragment;", "Lai/kudi/agent/register/v2/ui/PhoneFragment;", "activity", "Lai/kudi/agent/register/v2/ui/RegisterActivity;", "Lai/kudi/agent/register/v2/ui/WelcomeFragment;", "Lai/kudi/agent/register/verifybvn/VerifyBvnPictureFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface RegistrationSubComponent {

    /* compiled from: RegistrationSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/register/di/components/RegistrationSubComponent$Factory;", "", "create", "Lai/kudi/agent/register/di/components/RegistrationSubComponent;", "registerV2Navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "emailVerificationNavigator", "Lai/kudi/agent/register/navigators/EmailVerificationNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        RegistrationSubComponent create(RegisterNavigator registerNavigator, EmailVerificationNavigator emailVerificationNavigator);
    }

    void inject(NonAgentSignOnFragment nonAgentSignOnFragment);

    void inject(AccountTypeFragment accountTypeFragment);

    void inject(BusinessInfoFragment businessInfoFragment);

    void inject(CreatePinFragment createPinFragment);

    void inject(PersonalInfoFragment personalInfoFragment);

    void inject(BvnNinFragment bvnNinFragment);

    void inject(EmailVerificationFragment emailVerificationFragment);

    void inject(EnableFingerPrintFragment enableFingerPrintFragment);

    void inject(PhoneFragment phoneFragment);

    void inject(RegisterActivity registerActivity);

    void inject(WelcomeFragment welcomeFragment);

    void inject(VerifyBvnPictureFragment verifyBvnPictureFragment);
}
