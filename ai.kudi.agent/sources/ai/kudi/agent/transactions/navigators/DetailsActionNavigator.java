package ai.kudi.agent.transactions.navigators;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
/* compiled from: DetailsActionNavigator.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactions/navigators/DetailsActionNavigator;", "", "navigateToCustomerCreationPage", "", "transactionRef", "", "navigateToStatusPage", "isANewCustomer", "", "customerName", "navigateToSupportPage", TransactionField.AMOUNT, "type", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface DetailsActionNavigator {
    void navigateToCustomerCreationPage(String str);

    void navigateToStatusPage(boolean z, String str);

    void navigateToSupportPage(String str, String str2, String str3);
}
