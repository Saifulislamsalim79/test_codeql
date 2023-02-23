package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.ProductSectorRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.ProductBusinessSectorUseCase_Factory */
/* loaded from: classes.dex */
public final class ProductBusinessSectorUseCase_Factory implements InterfaceC9468d<ProductBusinessSectorUseCase> {
    private final InterfaceC11700a<ProductSectorRepository> productSectorRepositoryProvider;

    public ProductBusinessSectorUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.productSectorRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductBusinessSectorUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductBusinessSectorUseCase_Factory $r1 = new ProductBusinessSectorUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductBusinessSectorUseCase newInstance(ProductSectorRepository productSectorRepository) {
        ProductBusinessSectorUseCase $r1 = new ProductBusinessSectorUseCase(productSectorRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductBusinessSectorUseCase multiply() {
        InterfaceC11700a $r1 = this.productSectorRepositoryProvider;
        Object $r2 = $r1.get();
        ProductSectorRepository $r3 = (ProductSectorRepository) $r2;
        ProductBusinessSectorUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41537multiply() {
        ProductBusinessSectorUseCase $r1 = multiply();
        return $r1;
    }
}
