package ai.kudi.agent.referral.views;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: AgentReferralListView.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/referral/views/AgentReferralListView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "hideNextLoading", "showAgentReferral", AttributeType.LIST, "", "Lai/kudi/agent/referral/AgentReferralModel;", "showEmptyReferralMessage", "showError", MetricTracker.Object.MESSAGE, "", "showInfoSuccessMessage", "showLoading", "showNextLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AgentReferralListView extends LoginListener {
    void hideLoading();

    void hideNextLoading();

    void showAgentReferral(List list);

    void showEmptyReferralMessage();

    void showError(String str);

    void showInfoSuccessMessage(String str);

    void showLoading();

    void showNextLoading();
}
