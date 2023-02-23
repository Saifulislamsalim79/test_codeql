package ai.kudi.agent.withdrawal.xmpp.components;

import ai.kudi.agent.transactionstatus.summary.p033ui.WithdrawalSummaryFragment;
import ai.kudi.agent.withdrawal.p041ui.OthersWithdrawalFragment;
import ai.kudi.agent.withdrawal.p041ui.WithdrawActivity;
import ai.kudi.agent.withdrawal.view.MainWithdrawalView;
import kotlin.Metadata;
/* compiled from: WithdrawalSubComponent.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/transactionstatus/summary/ui/WithdrawalSummaryFragment;", "Lai/kudi/agent/withdrawal/ui/OthersWithdrawalFragment;", "activity", "Lai/kudi/agent/withdrawal/ui/WithdrawActivity;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface WithdrawalSubComponent {

    /* compiled from: WithdrawalSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent$Factory;", "", "create", "Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent;", "mainWithdrawalView", "Lai/kudi/agent/withdrawal/view/MainWithdrawalView;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        WithdrawalSubComponent create(MainWithdrawalView mainWithdrawalView);
    }

    void inject(WithdrawalSummaryFragment withdrawalSummaryFragment);

    void inject(OthersWithdrawalFragment othersWithdrawalFragment);

    void inject(WithdrawActivity withdrawActivity);
}
