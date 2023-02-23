package ai.kudi.agent.settings.navigators;

import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.settings.personal.p027ui.UpgradeResultFragment;
import kotlin.Metadata;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: SettingsNavigator.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bH&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\bH&¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/settings/navigators/SettingsNavigator;", "", "finishFragment", "", "launchSavingsPinResetSuccessDialog", "navigateToAcctsFragment", "navigateToConfirmOtpFragment", "mobile", "", "pin", "navigateToHomePage", "navigateToKycUpgradeResult", "fragment", "Lai/kudi/agent/settings/personal/ui/UpgradeResultFragment;", "navigateToOpenSource", "navigateToResetSavingsPin", "navigateToVerifiedInfoScreen", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "onClearAppData", "toAboutKyc", "toAccountInformationFragment", "toActivatePos", "toAppPermissionsFragment", "toBankAccountsFragment", "toCashInsurance", "toDisplayTermsFragment", "toEditProfileFragment", "isBvnVerified", "", "toMyDevicesFragment", "toPersonalFragment", "toRelationshipManager", "managerId", "toResetPinFragment", "toSecondaryPhoneNumberFragment", "toSecurityAndSafety", "toTermsAndConditionsFragment", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface SettingsNavigator {
    void finishFragment();

    void launchSavingsPinResetSuccessDialog();

    void navigateToAcctsFragment();

    void navigateToConfirmOtpFragment(String str, String str2);

    void navigateToHomePage();

    void navigateToKycUpgradeResult(UpgradeResultFragment upgradeResultFragment);

    void navigateToOpenSource();

    void navigateToResetSavingsPin();

    void navigateToVerifiedInfoScreen(UserProfile userProfile);

    void onClearAppData();

    void toAboutKyc();

    void toAccountInformationFragment();

    void toActivatePos();

    void toAppPermissionsFragment();

    void toBankAccountsFragment();

    void toCashInsurance();

    void toDisplayTermsFragment();

    void toEditProfileFragment(boolean z);

    void toMyDevicesFragment();

    void toPersonalFragment();

    void toRelationshipManager(String str);

    void toResetPinFragment();

    void toSecondaryPhoneNumberFragment();

    void toSecurityAndSafety();

    void toTermsAndConditionsFragment(String str);
}
