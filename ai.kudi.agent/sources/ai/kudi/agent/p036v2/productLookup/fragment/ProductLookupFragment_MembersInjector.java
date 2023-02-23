package ai.kudi.agent.p036v2.productLookup.fragment;

import ai.kudi.agent.p036v2.productLookup.viewModel.MarketplaceProductLookupViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductLookupFragment_MembersInjector implements InterfaceC9463a<ProductLookupFragment> {
    private final InterfaceC11700a<MarketplaceProductLookupViewModel> marketplaceLookupViewModelProvider;

    public ProductLookupFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.marketplaceLookupViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductLookupFragment_MembersInjector $r1 = new ProductLookupFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectMarketplaceLookupViewModel(ProductLookupFragment productLookupFragment, MarketplaceProductLookupViewModel marketplaceProductLookupViewModel) {
        productLookupFragment.marketplaceLookupViewModel = marketplaceProductLookupViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductLookupFragment productLookupFragment) {
        InterfaceC11700a $r3 = this.marketplaceLookupViewModelProvider;
        Object $r2 = $r3.get();
        MarketplaceProductLookupViewModel $r4 = (MarketplaceProductLookupViewModel) $r2;
        injectMarketplaceLookupViewModel(productLookupFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductLookupFragment $r2 = (ProductLookupFragment) obj;
        injectMembers($r2);
    }
}
