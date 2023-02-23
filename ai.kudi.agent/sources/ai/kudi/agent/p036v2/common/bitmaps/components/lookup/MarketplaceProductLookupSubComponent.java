package ai.kudi.agent.p036v2.common.bitmaps.components.lookup;

import ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment;
import ai.kudi.agent.p036v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment;
import ai.kudi.agent.p036v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment;
import ai.kudi.agent.p036v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment;
import ai.kudi.agent.p036v2.productLookup.fragment.ProductLookupFragment;
import ai.kudi.agent.p036v2.productLookupDetails.fragment.ProductLookupDetailsFragment;
import kotlin.Metadata;
/* compiled from: MarketplaceProductLookupSubComponent.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent;", "", "inject", "", "imagePickerFragment", "Lai/kudi/agent/v2/common/view/fragment/ImagePickerFragment;", "productAllCollectionFieldsFragment", "Lai/kudi/agent/v2/productAllCollectionFields/fragment/ProductAllCollectionFieldsFragment;", "productCollectionSummary", "Lai/kudi/agent/v2/productCollectionSummary/fragments/ProductCollectionSummaryFragment;", "marketplaceCustomerRegistrationFragment", "Lai/kudi/agent/v2/productCustomerRegistration/fragment/MarketplaceCustomerRegistrationFragment;", "marketplaceCustomerRegistrationSummaryFragment", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/fragment/ProductCustomerRegistrationSummaryFragment;", "productLookupFragment", "Lai/kudi/agent/v2/productLookup/fragment/ProductLookupFragment;", "productLookupDetailsFragment", "Lai/kudi/agent/v2/productLookupDetails/fragment/ProductLookupDetailsFragment;", "Factory", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent */
/* loaded from: classes.dex */
public interface MarketplaceProductLookupSubComponent {

    /* compiled from: MarketplaceProductLookupSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent$Factory;", "", "create", "Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent$Factory */
    /* loaded from: classes.dex */
    public interface Factory {
        MarketplaceProductLookupSubComponent create();
    }

    void inject(ImagePickerFragment imagePickerFragment);

    void inject(ProductAllCollectionFieldsFragment productAllCollectionFieldsFragment);

    void inject(ProductCollectionSummaryFragment productCollectionSummaryFragment);

    void inject(MarketplaceCustomerRegistrationFragment marketplaceCustomerRegistrationFragment);

    void inject(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment);

    void inject(ProductLookupFragment productLookupFragment);

    void inject(ProductLookupDetailsFragment productLookupDetailsFragment);
}
