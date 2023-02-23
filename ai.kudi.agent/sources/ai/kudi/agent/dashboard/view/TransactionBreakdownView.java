package ai.kudi.agent.dashboard.view;

import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionBreakdownView.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/dashboard/view/TransactionBreakdownView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "displayBreakdown", "", "breakdown", "", "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", "hideErrorLayout", "hideProgress", "showErrorLayout", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showProgress", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionBreakdownView extends LoginListener {
    void displayBreakdown(List list);

    void hideErrorLayout();

    void hideProgress();

    void showErrorLayout(String str);

    void showProgress();
}
