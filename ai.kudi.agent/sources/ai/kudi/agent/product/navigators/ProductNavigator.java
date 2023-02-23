package ai.kudi.agent.product.navigators;

import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import kotlin.Metadata;
/* compiled from: ProductNavigator.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/product/navigators/ProductNavigator;", "", "navigateToAirtimeAmountFragment", "", "airtimePurchase", "Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "navigateToAirtimeAndDataFragment", "payload", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "navigateToAirtimePurchaseSummaryFragment", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ProductNavigator {
    void navigateToAirtimeAmountFragment(AirtimePurchase airtimePurchase);

    void navigateToAirtimeAndDataFragment(ProductPurchase productPurchase);

    void navigateToAirtimePurchaseSummaryFragment(ProductPurchase productPurchase);
}
