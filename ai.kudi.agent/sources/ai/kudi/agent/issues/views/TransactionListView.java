package ai.kudi.agent.issues.views;

import ai.kudi.agent.filter.domain.FilteredDate;
import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionListView.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J&\u0010\u0011\u001a\u00020\u00032\u001c\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0014j\u0002`\u00150\u0013H&¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/issues/views/TransactionListView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "hideNextLoading", "navigateToTransactionBreakDownPage", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "showEmptyTransactionView", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showFeedbackMsg", "msg", "showFilterDialog", "showLoading", "showNextLoading", "showTransactions", "transactions", "", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionListView extends LoginListener {
    void hideLoading();

    void hideNextLoading();

    void navigateToTransactionBreakDownPage(FilteredDate filteredDate);

    void showEmptyTransactionView();

    void showError(String str);

    void showFeedbackMsg(String str);

    void showFilterDialog();

    void showLoading();

    void showNextLoading();

    void showTransactions(List list);
}
