package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.VerifyCustomerRemoteSource_Factory */
/* loaded from: classes.dex */
public final class VerifyCustomerRemoteSource_Factory implements InterfaceC9468d<VerifyCustomerRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> apiProvider;

    public VerifyCustomerRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.apiProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VerifyCustomerRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        VerifyCustomerRemoteSource_Factory $r1 = new VerifyCustomerRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VerifyCustomerRemoteSource newInstance(MarketPlaceApi marketPlaceApi) {
        VerifyCustomerRemoteSource $r1 = new VerifyCustomerRemoteSource(marketPlaceApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VerifyCustomerRemoteSource multiply() {
        InterfaceC11700a $r1 = this.apiProvider;
        Object $r2 = $r1.get();
        MarketPlaceApi $r3 = (MarketPlaceApi) $r2;
        VerifyCustomerRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41607multiply() {
        VerifyCustomerRemoteSource $r1 = multiply();
        return $r1;
    }
}
