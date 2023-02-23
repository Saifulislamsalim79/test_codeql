package ai.kudi.agent.transactionstatus.summary.view;

import ai.kudi.agent.transactions.TransactionStatus;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransferSummaryView.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\bH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/view/TransferSummaryView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "navigateToTransactionStatusPage", TransactionField.STATUS, "Lai/kudi/agent/transactions/TransactionStatus;", "transactionReference", "", "errorMessage", "pinConfirmationDialog", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransferSummaryView extends LoginListener {
    void hideLoading();

    void navigateToTransactionStatusPage(TransactionStatus transactionStatus, String str, String str2);

    void pinConfirmationDialog();

    void showError(String str);

    void showLoading();
}
