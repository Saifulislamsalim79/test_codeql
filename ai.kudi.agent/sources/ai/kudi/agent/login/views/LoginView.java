package ai.kudi.agent.login.views;

import ai.kudi.agent.login.domain.model.AccountErrorType;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: LoginView.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J@\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\tH&J\b\u0010\u001a\u001a\u00020\tH&J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\tH&J\b\u0010\u001f\u001a\u00020\tH&J\b\u0010 \u001a\u00020\tH&J\u001c\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\t2\u0006\u0010*\u001a\u00020+H&J\u0010\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0003H&J*\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0005H&¨\u00063"}, m10421d2 = {"Lai/kudi/agent/login/views/LoginView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "isInvalidsPhone", "", "phoneNumber", "", "isPinValid", "pin", "navigateToAccountError", "", "accountErrorType", "Lai/kudi/agent/login/domain/model/AccountErrorType;", "navigateToAccountHolderVerification", TransactionField.STATUS, "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "navigateToDashboard", "walletBalance", "", "isNewUser", "isKCashEnabled", "isC2C", "isHq", "isOutlet", "customerType", "navigateToDeviceUpdate", "navigateToLogin", "navigateToPhoneAndPinFragment", "user", "Lai/kudi/agent/users/domain/dto/User;", "requestFocus", "showAppForAgentOnly", "showContactSupportDialog", "showFingerPrintIcon", "toShow", "encodedPin", "showLoginError", MetricTracker.Object.MESSAGE, "showPendingKycScreen", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "showPhoneNumberError", "errorMessageResource", "", "showPinError", "showProgress", "visible", "showUserProfile", "firstName", "lastName", "profilePictureUrl", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface LoginView extends LoginListener {

    /* compiled from: LoginView.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void showFingerPrintIcon$default(LoginView loginView, boolean z, String $r2, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFingerPrintIcon");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = null;
            }
            loginView.showFingerPrintIcon(z, $r2);
        }
    }

    boolean isInvalidsPhone(String str);

    boolean isPinValid(String str);

    void navigateToAccountError(AccountErrorType accountErrorType);

    void navigateToAccountHolderVerification(String str, OtpVerificationModel otpVerificationModel);

    void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str);

    void navigateToDeviceUpdate();

    void navigateToLogin();

    void navigateToPhoneAndPinFragment(User user);

    void requestFocus();

    void showAppForAgentOnly();

    void showContactSupportDialog();

    void showFingerPrintIcon(boolean z, String str);

    void showLoginError(String str);

    void showPendingKycScreen(RegistrationInfo registrationInfo);

    void showPhoneNumberError(int i);

    void showPinError(int i);

    void showProgress(boolean z);

    void showUserProfile(String str, String str2, String str3, String str4);
}
