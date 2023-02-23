package ai.kudi.agent.referral.views;

import ai.kudi.agent.referral.AgentReferralEarnings;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: ReferralEarningsView.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/referral/views/ReferralEarningsView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "showEarnings", "earnings", "Lai/kudi/agent/referral/AgentReferralEarnings;", "showLoading", "showWithdrawalError", MetricTracker.Object.MESSAGE, "", "showWithdrawalSuccess", "balance", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ReferralEarningsView extends LoginListener {
    void hideLoading();

    void showEarnings(AgentReferralEarnings agentReferralEarnings);

    void showLoading();

    void showWithdrawalError(String str);

    void showWithdrawalSuccess(double d, String str);
}
