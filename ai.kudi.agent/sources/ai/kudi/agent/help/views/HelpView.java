package ai.kudi.agent.help.views;

import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HelpView.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/help/views/HelpView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "makeACall", "phoneNumber", "", "navigateToSubmitIssue", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "openFaqWebPage", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "showLoading", "showMessage", MetricTracker.Object.MESSAGE, "showPhoneNumbers", "phoneList", "", "Lai/kudi/agent/help/data/SupportInfoModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface HelpView extends LoginListener {
    void hideLoading();

    void makeACall(String str);

    void navigateToSubmitIssue(IssueTypeModel issueTypeModel);

    void openFaqWebPage(String str);

    void showLoading();

    void showMessage(String str);

    void showPhoneNumbers(List list);
}
