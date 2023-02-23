package ai.kudi.agent.referral.views;

import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: AgentReferralInfoView.kt */
@Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/referral/views/AgentReferralInfoView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "displayInfoToAgent", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AgentReferralInfoView extends LoginListener {
    void displayInfoToAgent(User user);
}
