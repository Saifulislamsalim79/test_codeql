package ai.kudi.agent.transactions.views;

import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: EmailTransactionReportView.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\u0003H&J&\u0010\u000f\u001a\u00020\u00032\u001c\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0012j\u0002`\u00130\u0011H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/transactions/views/EmailTransactionReportView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "downloadStatus", "", "isDownloading", "", "hideLoading", "showBottomSheet", "emailAddress", "", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showFeedbackMsg", "msg", "showLoading", "showTransactions", "transactions", "", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "toggleBottomSheet", "isSuccessful", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface EmailTransactionReportView extends LoginListener {
    void downloadStatus(boolean z);

    void hideLoading();

    void showBottomSheet(String str);

    void showError(String str);

    void showFeedbackMsg(String str);

    void showLoading();

    void showTransactions(List list);

    void toggleBottomSheet(boolean z);
}
