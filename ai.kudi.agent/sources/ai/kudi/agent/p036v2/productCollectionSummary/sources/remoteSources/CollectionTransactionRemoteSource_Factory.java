package ai.kudi.agent.p036v2.productCollectionSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.sources.remoteSources.CollectionTransactionRemoteSource_Factory */
/* loaded from: classes.dex */
public final class CollectionTransactionRemoteSource_Factory implements InterfaceC9468d<CollectionTransactionRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> apiProvider;

    public CollectionTransactionRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.apiProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionTransactionRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        CollectionTransactionRemoteSource_Factory $r1 = new CollectionTransactionRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionTransactionRemoteSource newInstance(MarketPlaceApi marketPlaceApi) {
        CollectionTransactionRemoteSource $r1 = new CollectionTransactionRemoteSource(marketPlaceApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CollectionTransactionRemoteSource multiply() {
        InterfaceC11700a $r1 = this.apiProvider;
        Object $r2 = $r1.get();
        MarketPlaceApi $r3 = (MarketPlaceApi) $r2;
        CollectionTransactionRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41580multiply() {
        CollectionTransactionRemoteSource $r1 = multiply();
        return $r1;
    }
}
