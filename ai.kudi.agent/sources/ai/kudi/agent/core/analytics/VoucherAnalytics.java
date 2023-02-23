package ai.kudi.agent.core.analytics;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherAnalytics.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J,\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J,\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J,\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J,\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J,\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\"\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J,\u0010\u0015\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\"\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/core/analytics/VoucherAnalytics;", "", "onVoucherAmountEntered", "", "phoneNumber", "", TransactionField.AMOUNT, "user", "Lai/kudi/agent/users/domain/dto/User;", "onVoucherCashInCreationButtonClicked", "isSuccessful", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "onVoucherCashOutRequestEvent", "reference", "onVoucherCodeLookUpClickedEvent", "voucherCode", "onVoucherPinCashInPinVerification", "onVoucherPinCashOutPinVerification", "onVoucherRecipientInfoEntered", "name", "onVoucherRecipientPhoneVerificationEvent", "recipientNameOrPhone", "onVoucherSenderInfoEntered", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface VoucherAnalytics {
    void onVoucherAmountEntered(String str, String str2, User user);

    void onVoucherCashInCreationButtonClicked(String str, boolean z, String str2, User user);

    void onVoucherCashOutRequestEvent(boolean z, String str, String str2, User user);

    void onVoucherCodeLookUpClickedEvent(String str, boolean z, String str2, User user);

    void onVoucherPinCashInPinVerification(String str, boolean z, String str2, User user);

    void onVoucherPinCashOutPinVerification(String str, boolean z, String str2, User user);

    void onVoucherRecipientInfoEntered(String str, String str2, User user);

    void onVoucherRecipientPhoneVerificationEvent(boolean z, String str, String str2, User user);

    void onVoucherSenderInfoEntered(String str, String str2, User user);
}
