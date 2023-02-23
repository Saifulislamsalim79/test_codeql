package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductFieldsRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.ProductFieldsRepository_Factory */
/* loaded from: classes.dex */
public final class ProductFieldsRepository_Factory implements InterfaceC9468d<ProductFieldsRepository> {
    private final InterfaceC11700a<ProductFieldsRemoteSource> productFieldsRemoteSourceProvider;

    public ProductFieldsRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.productFieldsRemoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductFieldsRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductFieldsRepository_Factory $r1 = new ProductFieldsRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductFieldsRepository newInstance(ProductFieldsRemoteSource productFieldsRemoteSource) {
        ProductFieldsRepository $r1 = new ProductFieldsRepository(productFieldsRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductFieldsRepository multiply() {
        InterfaceC11700a $r1 = this.productFieldsRemoteSourceProvider;
        Object $r2 = $r1.get();
        ProductFieldsRemoteSource $r3 = (ProductFieldsRemoteSource) $r2;
        ProductFieldsRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41504multiply() {
        ProductFieldsRepository $r1 = multiply();
        return $r1;
    }
}
