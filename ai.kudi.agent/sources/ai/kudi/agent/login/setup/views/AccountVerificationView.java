package ai.kudi.agent.login.setup.views;

import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: AccountVerificationView.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/login/setup/views/AccountVerificationView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideProgress", "", "navigateToBusinessInfoView", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "navigateToDashBoard", "navigateToFaceFragment", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "navigateToLogin", "setOtpDetails", "showMsg", "feedbackMsg", "", "showProgress", "toggleAuthState", "inProgress", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AccountVerificationView extends LoginListener {
    void hideProgress();

    void navigateToBusinessInfoView(DashboardData dashboardData);

    void navigateToDashBoard(DashboardData dashboardData);

    void navigateToFaceFragment(OtpVerificationModel otpVerificationModel);

    void navigateToLogin();

    void setOtpDetails(OtpVerificationModel otpVerificationModel);

    void showMsg(String str);

    void showProgress();

    void toggleAuthState(boolean z);
}
