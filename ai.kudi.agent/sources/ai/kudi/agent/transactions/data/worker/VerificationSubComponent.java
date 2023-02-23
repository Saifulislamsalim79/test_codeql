package ai.kudi.agent.transactions.data.worker;

import ai.kudi.agent.transactions.p032ui.PendingVerificationActivity;
import ai.kudi.agent.transactions.p032ui.PendingVerificationCustomerDetailInputFragment;
import ai.kudi.agent.transactions.p032ui.PendingVerificationImageCaptureFragment;
import ai.kudi.agent.transactions.p032ui.VerificationNavigator;
import kotlin.Metadata;
/* compiled from: VerificationSubComponent.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactions/data/di/VerificationSubComponent;", "", "inject", "", "activity", "Lai/kudi/agent/transactions/ui/PendingVerificationActivity;", "fragment", "Lai/kudi/agent/transactions/ui/PendingVerificationCustomerDetailInputFragment;", "pendingVerificationImageCaptureFragment", "Lai/kudi/agent/transactions/ui/PendingVerificationImageCaptureFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface VerificationSubComponent {

    /* compiled from: VerificationSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transactions/data/di/VerificationSubComponent$Factory;", "", "create", "Lai/kudi/agent/transactions/data/di/VerificationSubComponent;", "verificationNavigator", "Lai/kudi/agent/transactions/ui/VerificationNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        VerificationSubComponent create(VerificationNavigator verificationNavigator);
    }

    void inject(PendingVerificationActivity pendingVerificationActivity);

    void inject(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment);

    void inject(PendingVerificationImageCaptureFragment pendingVerificationImageCaptureFragment);
}
