package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import ai.kudi.agent.product.navigators.ProductNavigator;
import ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator;
import ai.kudi.agent.product.other_bills.p018ui.AmountFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.product.other_bills.p018ui.PayBillsFragment;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.agent.product.p019ui.ProductSummaryFragment;
import kotlin.Metadata;
/* compiled from: ProductActivityModule.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/ProductActivityModule;", "", "()V", "bindsBillPaymentNavigator", "Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;", "productActivity", "Lai/kudi/agent/product/ui/ProductActivity;", "bindsProductNavigator", "Lai/kudi/agent/product/navigators/ProductNavigator;", "injectAirtimeAmountFragment", "Lai/kudi/agent/product/airtime_data/ui/AirtimeAmountFragment;", "injectAirtimeTopUpFragment", "Lai/kudi/agent/product/airtime_data/ui/AirtimeTopUpFragment;", "injectAmountFragment", "Lai/kudi/agent/product/other_bills/ui/AmountFragment;", "injectBillPaymentCustomerDetailsFragment", "Lai/kudi/agent/product/other_bills/ui/BillPaymentCustomerDetailsFragment;", "injectBillPaymentStepOneFragment", "Lai/kudi/agent/product/other_bills/ui/BillPaymentStepOneFragment;", "injectPayBillsFragment", "Lai/kudi/agent/product/other_bills/ui/PayBillsFragment;", "injectProductSummaryFragment", "Lai/kudi/agent/product/ui/ProductSummaryFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProductActivityModule {
    public abstract BillPaymentNavigator bindsBillPaymentNavigator(ProductActivity productActivity);

    public abstract ProductNavigator bindsProductNavigator(ProductActivity productActivity);

    public abstract AirtimeAmountFragment injectAirtimeAmountFragment();

    public abstract AirtimeTopUpFragment injectAirtimeTopUpFragment();

    public abstract AmountFragment injectAmountFragment();

    public abstract BillPaymentCustomerDetailsFragment injectBillPaymentCustomerDetailsFragment();

    public abstract BillPaymentStepOneFragment injectBillPaymentStepOneFragment();

    public abstract PayBillsFragment injectPayBillsFragment();

    public abstract ProductSummaryFragment injectProductSummaryFragment();
}
