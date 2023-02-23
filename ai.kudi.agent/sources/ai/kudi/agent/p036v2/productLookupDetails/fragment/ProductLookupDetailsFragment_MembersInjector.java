package ai.kudi.agent.p036v2.productLookupDetails.fragment;

import ai.kudi.agent.p036v2.productLookupDetails.ProductLookupDetailsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productLookupDetails.fragment.ProductLookupDetailsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductLookupDetailsFragment_MembersInjector implements InterfaceC9463a<ProductLookupDetailsFragment> {
    private final InterfaceC11700a<ProductLookupDetailsViewModel> productLookupDetailsViewModelProvider;

    public ProductLookupDetailsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.productLookupDetailsViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductLookupDetailsFragment_MembersInjector $r1 = new ProductLookupDetailsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectProductLookupDetailsViewModel(ProductLookupDetailsFragment productLookupDetailsFragment, ProductLookupDetailsViewModel productLookupDetailsViewModel) {
        productLookupDetailsFragment.productLookupDetailsViewModel = productLookupDetailsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductLookupDetailsFragment productLookupDetailsFragment) {
        InterfaceC11700a $r3 = this.productLookupDetailsViewModelProvider;
        Object $r2 = $r3.get();
        ProductLookupDetailsViewModel $r4 = (ProductLookupDetailsViewModel) $r2;
        injectProductLookupDetailsViewModel(productLookupDetailsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductLookupDetailsFragment $r2 = (ProductLookupDetailsFragment) obj;
        injectMembers($r2);
    }
}
