package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.ProductListRemoteSource_Factory */
/* loaded from: classes.dex */
public final class ProductListRemoteSource_Factory implements InterfaceC9468d<ProductListRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> productNetworkServiceProvider;

    public ProductListRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.productNetworkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductListRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductListRemoteSource_Factory $r1 = new ProductListRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductListRemoteSource newInstance(MarketPlaceApi marketPlaceApi) {
        ProductListRemoteSource $r1 = new ProductListRemoteSource(marketPlaceApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductListRemoteSource multiply() {
        InterfaceC11700a $r1 = this.productNetworkServiceProvider;
        Object $r2 = $r1.get();
        MarketPlaceApi $r3 = (MarketPlaceApi) $r2;
        ProductListRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41530multiply() {
        ProductListRemoteSource $r1 = multiply();
        return $r1;
    }
}
