package ai.kudi.agent.voucher.cashout.view;

import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherVerificationView.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/view/VoucherVerificationView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "navigateToPhoneVerificationPage", "voucherVerification", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface VoucherVerificationView extends LoginListener {
    void hideLoading();

    void navigateToPhoneVerificationPage(VoucherVerification voucherVerification);

    void showError(String str);

    void showLoading();
}
