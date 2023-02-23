package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvideMarketPlaceApiFactory implements InterfaceC9468d<MarketPlaceApi> {
    private final ApplicationModule module;
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public ApplicationModule_ProvideMarketPlaceApiFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvideMarketPlaceApiFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvideMarketPlaceApiFactory $r2 = new ApplicationModule_ProvideMarketPlaceApiFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketPlaceApi provideMarketPlaceApi(ApplicationModule applicationModule, C14841m c14841m) {
        MarketPlaceApi $r1 = applicationModule.provideMarketPlaceApi(c14841m);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public MarketPlaceApi m38949b() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.retrofitProvider;
        Object $r3 = $r2.get();
        C14841m $r4 = (C14841m) $r3;
        MarketPlaceApi $r5 = provideMarketPlaceApi($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38948b() {
        MarketPlaceApi $r1 = m38949b();
        return $r1;
    }
}
