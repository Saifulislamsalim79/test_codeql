package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductSectorRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.ProductSectorRepository_Factory */
/* loaded from: classes.dex */
public final class ProductSectorRepository_Factory implements InterfaceC9468d<ProductSectorRepository> {
    private final InterfaceC11700a<ProductSectorLocalSource> localSourceProvider;
    private final InterfaceC11700a<ProductSectorRemoteSource> remoteSourceProvider;

    public ProductSectorRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.localSourceProvider = interfaceC11700a;
        this.remoteSourceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ProductSectorRepository_Factory $r2 = new ProductSectorRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorRepository newInstance(ProductSectorLocalSource productSectorLocalSource, ProductSectorRemoteSource productSectorRemoteSource) {
        ProductSectorRepository $r2 = new ProductSectorRepository(productSectorLocalSource, productSectorRemoteSource);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSectorRepository multiply() {
        InterfaceC11700a $r1 = this.localSourceProvider;
        Object $r2 = $r1.get();
        ProductSectorLocalSource $r3 = (ProductSectorLocalSource) $r2;
        InterfaceC11700a $r12 = this.remoteSourceProvider;
        Object $r22 = $r12.get();
        ProductSectorRemoteSource $r4 = (ProductSectorRemoteSource) $r22;
        ProductSectorRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41509multiply() {
        ProductSectorRepository $r1 = multiply();
        return $r1;
    }
}
