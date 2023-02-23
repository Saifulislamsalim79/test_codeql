package ai.kudi.agent.p036v2.common.bitmaps.components.products;

import ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment;
import ai.kudi.agent.p036v2.productHome.fragment.ProductHomeFragment;
import ai.kudi.agent.p036v2.productList.fragment.ProductListFragment;
import ai.kudi.agent.p036v2.productSearch.fragment.ProductSearchFragment;
import kotlin.Metadata;
/* compiled from: MarketplaceProductSubComponent.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent;", "", "inject", "", "productDetailsFragment", "Lai/kudi/agent/v2/productDetails/fragment/ProductDetailsFragment;", "productHomeFragment", "Lai/kudi/agent/v2/productHome/fragment/ProductHomeFragment;", "productListFragment", "Lai/kudi/agent/v2/productList/fragment/ProductListFragment;", "productSearchFragment", "Lai/kudi/agent/v2/productSearch/fragment/ProductSearchFragment;", "Factory", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.bitmaps.components.products.MarketplaceProductSubComponent */
/* loaded from: classes.dex */
public interface MarketplaceProductSubComponent {

    /* compiled from: MarketplaceProductSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent$Factory;", "", "create", "Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.bitmaps.components.products.MarketplaceProductSubComponent$Factory */
    /* loaded from: classes.dex */
    public interface Factory {
        MarketplaceProductSubComponent create();
    }

    void inject(ProductDetailsFragment productDetailsFragment);

    void inject(ProductHomeFragment productHomeFragment);

    void inject(ProductListFragment productListFragment);

    void inject(ProductSearchFragment productSearchFragment);
}
