package ai.kudi.agent.product.other_bills.navigators;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import kotlin.Metadata;
/* compiled from: BillPaymentNavigator.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;", "", "toAmountView", "", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "toStepOneView", "toStepThreeView", "toStepTwoView", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BillPaymentNavigator {
    void toAmountView(BillsData billsData);

    void toStepOneView(BillsData billsData);

    void toStepThreeView(BillsData billsData);

    void toStepTwoView(BillsData billsData);
}
