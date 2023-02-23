package ai.kudi.agent.settings.account.presenters;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AccountView.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/settings/account/presenters/AccountView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "dismissBottomSheet", "", "hideTrackingStatusLoading", "showActiveStatus", "showBvnUnVerified", "phoneNum", "", "showInsuranceFetchError", "errorMessage", "showInsuranceSignUpError", "showKycLevel", "kycLevel", "showKycLevelError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showNoInsurancePlan", "showSuspendedStatus", "showTrackingStatusLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AccountView extends LoginListener {
    void dismissBottomSheet();

    void hideTrackingStatusLoading();

    void showActiveStatus();

    void showBvnUnVerified(String str);

    void showInsuranceFetchError(String str);

    void showInsuranceSignUpError(String str);

    void showKycLevel(String str);

    void showKycLevelError(String str);

    void showNoInsurancePlan();

    void showSuspendedStatus();

    void showTrackingStatusLoading();
}
