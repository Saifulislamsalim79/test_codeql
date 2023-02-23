package ai.kudi.agent.p036v2.productDetails.fragment;

import ai.kudi.agent.p036v2.productDetails.viewModel.ProductDetailsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productDetails.fragment.ProductDetailsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductDetailsFragment_MembersInjector implements InterfaceC9463a<ProductDetailsFragment> {
    private final InterfaceC11700a<ProductDetailsViewModel> productDetailsViewModelProvider;

    public ProductDetailsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.productDetailsViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductDetailsFragment_MembersInjector $r1 = new ProductDetailsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectProductDetailsViewModel(ProductDetailsFragment productDetailsFragment, ProductDetailsViewModel productDetailsViewModel) {
        productDetailsFragment.productDetailsViewModel = productDetailsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductDetailsFragment productDetailsFragment) {
        InterfaceC11700a $r3 = this.productDetailsViewModelProvider;
        Object $r2 = $r3.get();
        ProductDetailsViewModel $r4 = (ProductDetailsViewModel) $r2;
        injectProductDetailsViewModel(productDetailsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductDetailsFragment $r2 = (ProductDetailsFragment) obj;
        injectMembers($r2);
    }
}
