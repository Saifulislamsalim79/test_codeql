package ai.kudi.agent.referral.views;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: AgentReferralInviteView.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/referral/views/AgentReferralInviteView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "createReferralLoading", "", "hideReferralLoading", "showError", MetricTracker.Object.MESSAGE, "", "showMildErrorMessage", "showSuccessMessage", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AgentReferralInviteView extends LoginListener {
    void createReferralLoading();

    void hideReferralLoading();

    void showError(String str);

    void showMildErrorMessage(String str);

    void showSuccessMessage(String str);
}
