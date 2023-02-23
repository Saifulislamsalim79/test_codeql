package ai.kudi.agent.register.navigators;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import kotlin.Metadata;
/* compiled from: RegisterNavigator.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J$\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H&J@\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u001c\u0010\u001b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&JH\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007H&J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001aH&J\u0012\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001aH&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001aH&J\b\u0010'\u001a\u00020\u0003H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010,\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001aH&J\u0012\u0010-\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010/\u001a\u00020\u0003H&J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u00101\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001aH&J\u0012\u00102\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001aH&J\u0018\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u00064"}, m10421d2 = {"Lai/kudi/agent/register/navigators/RegisterNavigator;", "", "backToBusinessInfoFragment", "", "finishFragmentBvn", "navigateToBvnNinView", "phoneNumber", "", PhoneFragment.ARG_BVN, "regId", "navigateToDashboard", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "isOutlet", "isHq", "customerType", "navigateToEnableFingerPrint", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "navigateToFundWallet", "navigateToPendingKycVerification", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "navigateToPhoneView", "navigateToWelcomePage", "firstName", "sNewUser", "toAccountTypeSelectionView", TransactionBreakDownItemType.DATA, "toBusinessInformationView", "toCallSupportView", "toCreatePinView", "resetPinResponse", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "personalInfo", "toDuplicateIdentityNumberFragment", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "toLoginView", "toMerchantTandC", "toPersonalInformationView", "toProfilePictureUploadView", "toProfilePictureView", "toResetPinView", "toSelectBusinessTypeDescriptionView", "toSelectBusinessTypeView", "toSomethingIsWrongView", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface RegisterNavigator {
    void backToBusinessInfoFragment();

    void finishFragmentBvn();

    void navigateToBvnNinView(String str, String str2, String str3);

    void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str);

    void navigateToEnableFingerPrint(CompleteRegistrationData completeRegistrationData);

    void navigateToFundWallet();

    void navigateToPendingKycVerification(RegistrationInfo registrationInfo);

    void navigateToPhoneView(String str, String str2);

    void navigateToWelcomePage(String str, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2);

    void toAccountTypeSelectionView(RegistrationInfo registrationInfo);

    void toBusinessInformationView(RegistrationInfo registrationInfo);

    void toCallSupportView();

    void toCreatePinView(ResetPinResponse resetPinResponse);

    void toCreatePinView(RegistrationInfo registrationInfo);

    void toDuplicateIdentityNumberFragment();

    void toEnterOtpView(OtpFragmentData otpFragmentData, String str);

    void toLoginView(String str);

    void toMerchantTandC(RegistrationInfo registrationInfo);

    void toPersonalInformationView(RegistrationInfo registrationInfo);

    void toProfilePictureUploadView(RegistrationInfo registrationInfo);

    void toProfilePictureView();

    void toResetPinView(String str);

    void toSelectBusinessTypeDescriptionView(RegistrationInfo registrationInfo);

    void toSelectBusinessTypeView(RegistrationInfo registrationInfo);

    void toSomethingIsWrongView(String str, String str2);
}
