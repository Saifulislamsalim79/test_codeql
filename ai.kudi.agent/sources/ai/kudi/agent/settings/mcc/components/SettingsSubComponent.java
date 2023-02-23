package ai.kudi.agent.settings.mcc.components;

import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.register.p022v2.p023ui.EmailVerificationFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.AccountsFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.ActivatePosFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.InsuranceSignUpFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.PosActivationNotificationReceiverFragment;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.AccountAndSettingsOptionsFragment;
import ai.kudi.agent.settings.p029ui.OpenSourceFragment;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.SwitchAccountFragment;
import ai.kudi.agent.settings.personal.p027ui.AboutKycFragment;
import ai.kudi.agent.settings.personal.p027ui.CameraFragment;
import ai.kudi.agent.settings.personal.p027ui.EditProfileFragment;
import ai.kudi.agent.settings.personal.p027ui.EditUserProfileFragment;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment;
import ai.kudi.agent.settings.personal.p027ui.PersonalFragment;
import ai.kudi.agent.settings.personal.p027ui.RelationshipManagerFragment;
import ai.kudi.agent.settings.personal.p027ui.UpgradeAccountFragment;
import ai.kudi.agent.settings.personal.p027ui.UpgradeResultFragment;
import ai.kudi.agent.settings.security.p028ui.ConfirmOtpFragment;
import ai.kudi.agent.settings.security.p028ui.MyDevicesFragment;
import ai.kudi.agent.settings.security.p028ui.ResetPinFragment;
import ai.kudi.agent.settings.security.p028ui.ResetSavingPinFragment;
import ai.kudi.agent.settings.security.p028ui.SecurityFragment;
import ai.kudi.agent.settings.tandc.DisplayTermsFragment;
import ai.kudi.agent.settings.tandc.TermsAndConditionFragment;
import kotlin.Metadata;
/* compiled from: SettingsSubComponent.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001(J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0010H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001aH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020 H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020!H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020$H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020'H&¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/settings/di/components/SettingsSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/register/v2/ui/EmailVerificationFragment;", "Lai/kudi/agent/settings/account/ui/fragment/AccountsFragment;", "Lai/kudi/agent/settings/account/ui/fragment/ActivatePosFragment;", "Lai/kudi/agent/settings/account/ui/fragment/InsuranceSignUpFragment;", "Lai/kudi/agent/settings/account/ui/fragment/PosActivationNotificationReceiverFragment;", "aboutKycFragment", "Lai/kudi/agent/settings/personal/ui/AboutKycFragment;", "kycCameraFragment", "Lai/kudi/agent/settings/personal/ui/CameraFragment;", "editProfileFragment", "Lai/kudi/agent/settings/personal/ui/EditProfileFragment;", "Lai/kudi/agent/settings/personal/ui/EditUserProfileFragment;", "idtypesAndGenderFragment", "Lai/kudi/agent/settings/personal/ui/IdtypesFragment;", "Lai/kudi/agent/settings/personal/ui/PersonalFragment;", "Lai/kudi/agent/settings/personal/ui/RelationshipManagerFragment;", "upgradeAccountFragment", "Lai/kudi/agent/settings/personal/ui/UpgradeAccountFragment;", "upgradeResultFragment", "Lai/kudi/agent/settings/personal/ui/UpgradeResultFragment;", "Lai/kudi/agent/settings/security/ui/ConfirmOtpFragment;", "Lai/kudi/agent/settings/security/ui/MyDevicesFragment;", "resetPinFragment", "Lai/kudi/agent/settings/security/ui/ResetPinFragment;", "Lai/kudi/agent/settings/security/ui/ResetSavingPinFragment;", "securityFragment", "Lai/kudi/agent/settings/security/ui/SecurityFragment;", "Lai/kudi/agent/settings/tandc/DisplayTermsFragment;", "Lai/kudi/agent/settings/tandc/TermsAndConditionFragment;", "settingsAccountAndSettingsOptionsFragment", "Lai/kudi/agent/settings/ui/AccountAndSettingsOptionsFragment;", "Lai/kudi/agent/settings/ui/OpenSourceFragment;", "activity", "Lai/kudi/agent/settings/ui/SettingsActivity;", "Lai/kudi/agent/settings/ui/SwitchAccountFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface SettingsSubComponent {

    /* compiled from: SettingsSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/di/components/SettingsSubComponent$Factory;", "", "create", "Lai/kudi/agent/settings/di/components/SettingsSubComponent;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "emailVerificationNavigator", "Lai/kudi/agent/register/navigators/EmailVerificationNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        SettingsSubComponent create(SettingsNavigator settingsNavigator, EmailVerificationNavigator emailVerificationNavigator);
    }

    void inject(EmailVerificationFragment emailVerificationFragment);

    void inject(AccountsFragment accountsFragment);

    void inject(ActivatePosFragment activatePosFragment);

    void inject(InsuranceSignUpFragment insuranceSignUpFragment);

    void inject(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment);

    void inject(AboutKycFragment aboutKycFragment);

    void inject(CameraFragment cameraFragment);

    void inject(EditProfileFragment editProfileFragment);

    void inject(EditUserProfileFragment editUserProfileFragment);

    void inject(IdtypesFragment idtypesFragment);

    void inject(PersonalFragment personalFragment);

    void inject(RelationshipManagerFragment relationshipManagerFragment);

    void inject(UpgradeAccountFragment upgradeAccountFragment);

    void inject(UpgradeResultFragment upgradeResultFragment);

    void inject(ConfirmOtpFragment confirmOtpFragment);

    void inject(MyDevicesFragment myDevicesFragment);

    void inject(ResetPinFragment resetPinFragment);

    void inject(ResetSavingPinFragment resetSavingPinFragment);

    void inject(SecurityFragment securityFragment);

    void inject(DisplayTermsFragment displayTermsFragment);

    void inject(TermsAndConditionFragment termsAndConditionFragment);

    void inject(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment);

    void inject(OpenSourceFragment openSourceFragment);

    void inject(SettingsActivity settingsActivity);

    void inject(SwitchAccountFragment switchAccountFragment);
}
