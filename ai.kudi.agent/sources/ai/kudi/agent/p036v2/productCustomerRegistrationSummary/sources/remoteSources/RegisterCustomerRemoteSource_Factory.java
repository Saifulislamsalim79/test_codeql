package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.RegisterCustomerRemoteSource_Factory */
/* loaded from: classes.dex */
public final class RegisterCustomerRemoteSource_Factory implements InterfaceC9468d<RegisterCustomerRemoteSource> {
    private final InterfaceC11700a<MarketPlaceApi> marketplaceApiProvider;

    public RegisterCustomerRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.marketplaceApiProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegisterCustomerRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        RegisterCustomerRemoteSource_Factory $r1 = new RegisterCustomerRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegisterCustomerRemoteSource newInstance(MarketPlaceApi marketPlaceApi) {
        RegisterCustomerRemoteSource $r1 = new RegisterCustomerRemoteSource(marketPlaceApi);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RegisterCustomerRemoteSource multiply() {
        InterfaceC11700a $r1 = this.marketplaceApiProvider;
        Object $r2 = $r1.get();
        MarketPlaceApi $r3 = (MarketPlaceApi) $r2;
        RegisterCustomerRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41604multiply() {
        RegisterCustomerRemoteSource $r1 = multiply();
        return $r1;
    }
}
