package ai.kudi.agent.transactionstatus.summary.view;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: WithdrawalView.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/view/WithdrawalView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "navigateToTransactionStatusPage", "isSuccessful", "", "pinConfirmationDialog", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface WithdrawalView extends LoginListener {
    void hideLoading();

    void navigateToTransactionStatusPage(boolean z);

    void pinConfirmationDialog();

    void showError(String str);

    void showLoading();
}
