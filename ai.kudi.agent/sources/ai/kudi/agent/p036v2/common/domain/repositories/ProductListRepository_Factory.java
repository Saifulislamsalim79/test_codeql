package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductListRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.ProductListRepository_Factory */
/* loaded from: classes.dex */
public final class ProductListRepository_Factory implements InterfaceC9468d<ProductListRepository> {
    private final InterfaceC11700a<ProductListRemoteSource> productListRemoteSourceProvider;

    public ProductListRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.productListRemoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductListRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductListRepository_Factory $r1 = new ProductListRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductListRepository newInstance(ProductListRemoteSource productListRemoteSource) {
        ProductListRepository $r1 = new ProductListRepository(productListRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductListRepository multiply() {
        InterfaceC11700a $r1 = this.productListRemoteSourceProvider;
        Object $r2 = $r1.get();
        ProductListRemoteSource $r3 = (ProductListRemoteSource) $r2;
        ProductListRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41505multiply() {
        ProductListRepository $r1 = multiply();
        return $r1;
    }
}
