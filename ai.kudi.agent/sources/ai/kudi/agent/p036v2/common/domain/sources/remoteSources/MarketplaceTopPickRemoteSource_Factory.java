package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.MarketplaceTopPickRemoteSource_Factory */
/* loaded from: classes.dex */
public final class MarketplaceTopPickRemoteSource_Factory implements InterfaceC9468d<MarketplaceTopPickRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> productNetworkServiceProvider;

    public MarketplaceTopPickRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.productNetworkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceTopPickRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        MarketplaceTopPickRemoteSource_Factory $r1 = new MarketplaceTopPickRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceTopPickRemoteSource newInstance(MarketPlaceApi marketPlaceApi) {
        MarketplaceTopPickRemoteSource $r1 = new MarketplaceTopPickRemoteSource(marketPlaceApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceTopPickRemoteSource multiply() {
        InterfaceC11700a $r1 = this.productNetworkServiceProvider;
        Object $r2 = $r1.get();
        MarketPlaceApi $r3 = (MarketPlaceApi) $r2;
        MarketplaceTopPickRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41522multiply() {
        MarketplaceTopPickRemoteSource $r1 = multiply();
        return $r1;
    }
}
