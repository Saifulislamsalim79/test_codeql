package ai.kudi.agent.voucher.cashout.view;

import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherPhoneVerificationView.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/view/VoucherPhoneVerificationView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "hideRetry", "navigateToConfirmationPage", "voucherResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "otpTimer", "expiresTime", "", "shouldReset", "", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoading", "showRetry", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface VoucherPhoneVerificationView extends LoginListener {
    void hideLoading();

    void hideRetry();

    void navigateToConfirmationPage(VoucherResponse voucherResponse);

    void otpTimer(long j, boolean z);

    void showError(String str);

    void showLoading();

    void showRetry();
}
