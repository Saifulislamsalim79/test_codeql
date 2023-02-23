package ai.kudi.agent.p036v2.productSearch.fragment;

import ai.kudi.agent.p036v2.productSearch.viewModel.ProductSearchViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductSearchFragment_MembersInjector implements InterfaceC9463a<ProductSearchFragment> {
    private final InterfaceC11700a<ProductSearchViewModel> productSearchViewModelProvider;

    public ProductSearchFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.productSearchViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductSearchFragment_MembersInjector $r1 = new ProductSearchFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectProductSearchViewModel(ProductSearchFragment productSearchFragment, ProductSearchViewModel productSearchViewModel) {
        productSearchFragment.productSearchViewModel = productSearchViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductSearchFragment productSearchFragment) {
        InterfaceC11700a $r3 = this.productSearchViewModelProvider;
        Object $r2 = $r3.get();
        ProductSearchViewModel $r4 = (ProductSearchViewModel) $r2;
        injectProductSearchViewModel(productSearchFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductSearchFragment $r2 = (ProductSearchFragment) obj;
        injectMembers($r2);
    }
}
