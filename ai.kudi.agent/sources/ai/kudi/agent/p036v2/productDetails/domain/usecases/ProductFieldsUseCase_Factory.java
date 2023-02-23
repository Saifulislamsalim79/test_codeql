package ai.kudi.agent.p036v2.productDetails.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.ProductFieldsRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productDetails.domain.usecases.ProductFieldsUseCase_Factory */
/* loaded from: classes.dex */
public final class ProductFieldsUseCase_Factory implements InterfaceC9468d<ProductFieldsUseCase> {
    private final InterfaceC11700a<ProductFieldsRepository> productFieldsRepositoryProvider;

    public ProductFieldsUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.productFieldsRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductFieldsUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductFieldsUseCase_Factory $r1 = new ProductFieldsUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductFieldsUseCase newInstance(ProductFieldsRepository productFieldsRepository) {
        ProductFieldsUseCase $r1 = new ProductFieldsUseCase(productFieldsRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductFieldsUseCase multiply() {
        InterfaceC11700a $r1 = this.productFieldsRepositoryProvider;
        Object $r2 = $r1.get();
        ProductFieldsRepository $r3 = (ProductFieldsRepository) $r2;
        ProductFieldsUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41620multiply() {
        ProductFieldsUseCase $r1 = multiply();
        return $r1;
    }
}
