package ai.kudi.agent.p036v2.productList.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.ProductListRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productList.domain.usecases.FetchProductListUseCase_Factory */
/* loaded from: classes.dex */
public final class FetchProductListUseCase_Factory implements InterfaceC9468d<FetchProductListUseCase> {
    private final InterfaceC11700a<ProductListRepository> repositoryProvider;

    public FetchProductListUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.repositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchProductListUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchProductListUseCase_Factory $r1 = new FetchProductListUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchProductListUseCase newInstance(ProductListRepository productListRepository) {
        FetchProductListUseCase $r1 = new FetchProductListUseCase(productListRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchProductListUseCase multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        ProductListRepository $r3 = (ProductListRepository) $r2;
        FetchProductListUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41647multiply() {
        FetchProductListUseCase $r1 = multiply();
        return $r1;
    }
}
