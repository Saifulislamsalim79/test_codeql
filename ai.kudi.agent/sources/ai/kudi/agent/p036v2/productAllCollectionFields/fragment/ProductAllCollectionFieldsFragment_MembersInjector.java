package ai.kudi.agent.p036v2.productAllCollectionFields.fragment;

import ai.kudi.agent.p036v2.productAllCollectionFields.viewModel.ProductAllCollectionFieldsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductAllCollectionFieldsFragment_MembersInjector implements InterfaceC9463a<ProductAllCollectionFieldsFragment> {
    private final InterfaceC11700a<ProductAllCollectionFieldsViewModel> productAllCollectionFieldsViewModelProvider;

    public ProductAllCollectionFieldsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.productAllCollectionFieldsViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductAllCollectionFieldsFragment_MembersInjector $r1 = new ProductAllCollectionFieldsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectProductAllCollectionFieldsViewModel(ProductAllCollectionFieldsFragment productAllCollectionFieldsFragment, ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel) {
        productAllCollectionFieldsFragment.productAllCollectionFieldsViewModel = productAllCollectionFieldsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductAllCollectionFieldsFragment productAllCollectionFieldsFragment) {
        InterfaceC11700a $r3 = this.productAllCollectionFieldsViewModelProvider;
        Object $r2 = $r3.get();
        ProductAllCollectionFieldsViewModel $r4 = (ProductAllCollectionFieldsViewModel) $r2;
        injectProductAllCollectionFieldsViewModel(productAllCollectionFieldsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductAllCollectionFieldsFragment $r2 = (ProductAllCollectionFieldsFragment) obj;
        injectMembers($r2);
    }
}
