package ai.kudi.agent.referral.xmpp.components;

import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.p020ui.AgentReferralActivity;
import ai.kudi.agent.referral.p020ui.AgentReferralInfoFragment;
import ai.kudi.agent.referral.p020ui.AgentReferralSummaryFragment;
import ai.kudi.agent.referral.p020ui.AgentReferredInvitationFragment;
import ai.kudi.agent.referral.p020ui.AgentReferredListFragment;
import kotlin.Metadata;
/* compiled from: ReferralSubComponent.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\nH&¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/referral/di/components/ReferralSubComponent;", "", "inject", "", "activity", "Lai/kudi/agent/referral/ui/AgentReferralActivity;", "fragment", "Lai/kudi/agent/referral/ui/AgentReferralInfoFragment;", "Lai/kudi/agent/referral/ui/AgentReferralSummaryFragment;", "Lai/kudi/agent/referral/ui/AgentReferredInvitationFragment;", "Lai/kudi/agent/referral/ui/AgentReferredListFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ReferralSubComponent {

    /* compiled from: ReferralSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/referral/di/components/ReferralSubComponent$Factory;", "", "create", "Lai/kudi/agent/referral/di/components/ReferralSubComponent;", "referralNavigator", "Lai/kudi/agent/referral/navigators/ReferralNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ReferralSubComponent create(ReferralNavigator referralNavigator);
    }

    void inject(AgentReferralActivity agentReferralActivity);

    void inject(AgentReferralInfoFragment agentReferralInfoFragment);

    void inject(AgentReferralSummaryFragment agentReferralSummaryFragment);

    void inject(AgentReferredInvitationFragment agentReferredInvitationFragment);

    void inject(AgentReferredListFragment agentReferredListFragment);
}
