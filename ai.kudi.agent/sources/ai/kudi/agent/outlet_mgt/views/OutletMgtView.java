package ai.kudi.agent.outlet_mgt.views;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletMgtView.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/views/OutletMgtView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "handleError", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showFeedBack", MetricTracker.Object.MESSAGE, "toggleOtpLoading", "isLoading", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OutletMgtView extends LoginListener {
    void handleError(String str);

    void showFeedBack(String str);

    void toggleOtpLoading(boolean z);
}
