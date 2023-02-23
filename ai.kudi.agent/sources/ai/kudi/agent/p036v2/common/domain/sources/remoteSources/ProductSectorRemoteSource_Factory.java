package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.ProductSectorRemoteSource_Factory */
/* loaded from: classes.dex */
public final class ProductSectorRemoteSource_Factory implements InterfaceC9468d<ProductSectorRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> networkApiProvider;

    public ProductSectorRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkApiProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductSectorRemoteSource_Factory $r1 = new ProductSectorRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorRemoteSource newInstance(MarketPlaceApi marketPlaceApi) {
        ProductSectorRemoteSource $r1 = new ProductSectorRemoteSource(marketPlaceApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSectorRemoteSource multiply() {
        InterfaceC11700a $r1 = this.networkApiProvider;
        Object $r2 = $r1.get();
        MarketPlaceApi $r3 = (MarketPlaceApi) $r2;
        ProductSectorRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41533multiply() {
        ProductSectorRemoteSource $r1 = multiply();
        return $r1;
    }
}
