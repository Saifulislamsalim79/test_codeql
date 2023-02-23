package ai.kudi.agent.wallettopup.views;

import ai.kudi.agent.users.viewmodels.data.WalletTopupViewData;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: WalletTopupView.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/wallettopup/views/WalletTopupView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/users/viewmodels/data/WalletTopupViewData$Error;", "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface WalletTopupView extends LoginListener {
    void hideLoading();

    void showError(WalletTopupViewData.Error error);

    void showLoading();
}
