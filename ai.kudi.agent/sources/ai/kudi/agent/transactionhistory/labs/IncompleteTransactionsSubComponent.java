package ai.kudi.agent.transactionhistory.labs;

import ai.kudi.agent.transactionhistory.navigator.PendingTransactionsNavigator;
import ai.kudi.agent.transactionhistory.p031ui.view.PendingFraudCheckTransactionsFragment;
import kotlin.Metadata;
/* compiled from: IncompleteTransactionsSubComponent.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/transactionhistory/ui/view/PendingFraudCheckTransactionsFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IncompleteTransactionsSubComponent {

    /* compiled from: IncompleteTransactionsSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent$Factory;", "", "create", "Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent;", "pendingTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/PendingTransactionsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        IncompleteTransactionsSubComponent create(PendingTransactionsNavigator pendingTransactionsNavigator);
    }

    void inject(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment);
}
