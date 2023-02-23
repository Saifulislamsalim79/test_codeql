package ai.kudi.agent.p036v2.productCollectionSummary.fragments;

import ai.kudi.agent.p036v2.productCollectionSummary.viewModel.ProductCollectionSummaryViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductCollectionSummaryFragment_MembersInjector implements InterfaceC9463a<ProductCollectionSummaryFragment> {
    private final InterfaceC11700a<ProductCollectionSummaryViewModel> marketplaceCollectionSummaryViewModelProvider;

    public ProductCollectionSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.marketplaceCollectionSummaryViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductCollectionSummaryFragment_MembersInjector $r1 = new ProductCollectionSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectMarketplaceCollectionSummaryViewModel(ProductCollectionSummaryFragment productCollectionSummaryFragment, ProductCollectionSummaryViewModel productCollectionSummaryViewModel) {
        productCollectionSummaryFragment.marketplaceCollectionSummaryViewModel = productCollectionSummaryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductCollectionSummaryFragment productCollectionSummaryFragment) {
        InterfaceC11700a $r3 = this.marketplaceCollectionSummaryViewModelProvider;
        Object $r2 = $r3.get();
        ProductCollectionSummaryViewModel $r4 = (ProductCollectionSummaryViewModel) $r2;
        injectMarketplaceCollectionSummaryViewModel(productCollectionSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductCollectionSummaryFragment $r2 = (ProductCollectionSummaryFragment) obj;
        injectMembers($r2);
    }
}
