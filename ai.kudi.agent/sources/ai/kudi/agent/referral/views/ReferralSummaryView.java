package ai.kudi.agent.referral.views;

import ai.kudi.agent.referral.AgentReferralSummary;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: ReferralSummaryView.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/referral/views/ReferralSummaryView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "showErrorMessage", MetricTracker.Object.MESSAGE, "", "showLoading", "showSummary", "summary", "Lai/kudi/agent/referral/AgentReferralSummary;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ReferralSummaryView extends LoginListener {
    void hideLoading();

    void showErrorMessage(String str);

    void showLoading();

    void showSummary(AgentReferralSummary agentReferralSummary);
}
