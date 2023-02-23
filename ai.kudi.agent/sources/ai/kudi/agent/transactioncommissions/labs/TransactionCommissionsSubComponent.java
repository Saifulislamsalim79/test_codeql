package ai.kudi.agent.transactioncommissions.labs;

import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactioncommissions.p030ui.CommissionsCashoutStatusFragment;
import ai.kudi.agent.transactioncommissions.p030ui.FilterCommissionsFragment;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsActivity;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsFragment;
import kotlin.Metadata;
/* compiled from: TransactionCommissionsSubComponent.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/transactioncommissions/ui/CommissionsCashoutStatusFragment;", "Lai/kudi/agent/transactioncommissions/ui/FilterCommissionsFragment;", "activity", "Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsActivity;", "Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionCommissionsSubComponent {

    /* compiled from: TransactionCommissionsSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent$Factory;", "", "create", "Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent;", "transactionsNavigator", "Lai/kudi/agent/transactioncommissions/navigator/TransactionCommissionsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        TransactionCommissionsSubComponent create(TransactionCommissionsNavigator transactionCommissionsNavigator);
    }

    void inject(CommissionsCashoutStatusFragment commissionsCashoutStatusFragment);

    void inject(FilterCommissionsFragment filterCommissionsFragment);

    void inject(TransactionCommissionsActivity transactionCommissionsActivity);

    void inject(TransactionCommissionsFragment transactionCommissionsFragment);
}
