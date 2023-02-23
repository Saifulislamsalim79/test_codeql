package ai.kudi.agent.p036v2.productSearch.viewModel;

import ai.kudi.agent.p036v2.productList.domain.usecases.FetchProductListUseCase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productSearch.viewModel.ProductSearchViewModel_Factory */
/* loaded from: classes.dex */
public final class ProductSearchViewModel_Factory implements InterfaceC9468d<ProductSearchViewModel> {
    private final InterfaceC11700a<FetchProductListUseCase> fetchProductsProvider;

    public ProductSearchViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchProductsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSearchViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductSearchViewModel_Factory $r1 = new ProductSearchViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSearchViewModel newInstance(FetchProductListUseCase fetchProductListUseCase) {
        ProductSearchViewModel $r1 = new ProductSearchViewModel(fetchProductListUseCase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSearchViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchProductsProvider;
        Object $r2 = $r1.get();
        FetchProductListUseCase $r3 = (FetchProductListUseCase) $r2;
        ProductSearchViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41689multiply() {
        ProductSearchViewModel $r1 = multiply();
        return $r1;
    }
}
