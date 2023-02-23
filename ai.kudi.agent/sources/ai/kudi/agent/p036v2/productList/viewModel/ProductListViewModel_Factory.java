package ai.kudi.agent.p036v2.productList.viewModel;

import ai.kudi.agent.p036v2.common.domain.usecases.ProductBusinessSectorUseCase;
import ai.kudi.agent.p036v2.productList.domain.usecases.FetchProductListUseCase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productList.viewModel.ProductListViewModel_Factory */
/* loaded from: classes.dex */
public final class ProductListViewModel_Factory implements InterfaceC9468d<ProductListViewModel> {
    private final InterfaceC11700a<ProductBusinessSectorUseCase> productBusinessSectorUseCaseProvider;
    private final InterfaceC11700a<FetchProductListUseCase> productListUseCaseProvider;

    public ProductListViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.productBusinessSectorUseCaseProvider = interfaceC11700a;
        this.productListUseCaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductListViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ProductListViewModel_Factory $r2 = new ProductListViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductListViewModel newInstance(ProductBusinessSectorUseCase productBusinessSectorUseCase, FetchProductListUseCase fetchProductListUseCase) {
        ProductListViewModel $r2 = new ProductListViewModel(productBusinessSectorUseCase, fetchProductListUseCase);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductListViewModel multiply() {
        InterfaceC11700a $r1 = this.productBusinessSectorUseCaseProvider;
        Object $r2 = $r1.get();
        ProductBusinessSectorUseCase $r3 = (ProductBusinessSectorUseCase) $r2;
        InterfaceC11700a $r12 = this.productListUseCaseProvider;
        Object $r22 = $r12.get();
        FetchProductListUseCase $r4 = (FetchProductListUseCase) $r22;
        ProductListViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41657multiply() {
        ProductListViewModel $r1 = multiply();
        return $r1;
    }
}
