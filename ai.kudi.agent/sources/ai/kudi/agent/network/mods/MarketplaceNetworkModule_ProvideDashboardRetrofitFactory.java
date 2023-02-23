package ai.kudi.agent.network.mods;

import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class MarketplaceNetworkModule_ProvideDashboardRetrofitFactory implements InterfaceC9468d<C14841m> {
    private final InterfaceC11700a<Context> contextProvider;
    private final InterfaceC11700a<C14207a> httpLoggingInterceptorProvider;
    private final MarketplaceNetworkModule module;
    private final InterfaceC11700a<InterfaceC14233u> providesAuthInterceptorProvider;
    private final InterfaceC11700a<InterfaceC14233u> providesVersionInterceptorProvider;

    public MarketplaceNetworkModule_ProvideDashboardRetrofitFactory(MarketplaceNetworkModule marketplaceNetworkModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.module = marketplaceNetworkModule;
        this.contextProvider = interfaceC11700a;
        this.providesAuthInterceptorProvider = interfaceC11700a2;
        this.providesVersionInterceptorProvider = interfaceC11700a3;
        this.httpLoggingInterceptorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceNetworkModule_ProvideDashboardRetrofitFactory create(MarketplaceNetworkModule marketplaceNetworkModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        MarketplaceNetworkModule_ProvideDashboardRetrofitFactory $r5 = new MarketplaceNetworkModule_ProvideDashboardRetrofitFactory(marketplaceNetworkModule, interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C14841m provideDashboardRetrofit(MarketplaceNetworkModule marketplaceNetworkModule, Context context, InterfaceC14233u interfaceC14233u, InterfaceC14233u interfaceC14233u2, C14207a c14207a) {
        C14841m $r4 = marketplaceNetworkModule.provideDashboardRetrofit(context, interfaceC14233u, interfaceC14233u2, c14207a);
        C9473g.m14647e($r4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ Object resolveValue() {
        C14841m $r1 = m39824resolveValue();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resolveValue  reason: collision with other method in class */
    public C14841m m39824resolveValue() {
        MarketplaceNetworkModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        InterfaceC11700a $r22 = this.providesAuthInterceptorProvider;
        Object $r32 = $r22.get();
        InterfaceC14233u $r5 = (InterfaceC14233u) $r32;
        InterfaceC11700a $r23 = this.providesVersionInterceptorProvider;
        Object $r33 = $r23.get();
        InterfaceC14233u $r6 = (InterfaceC14233u) $r33;
        InterfaceC11700a $r24 = this.httpLoggingInterceptorProvider;
        Object $r34 = $r24.get();
        C14207a $r7 = (C14207a) $r34;
        C14841m $r8 = provideDashboardRetrofit($r1, $r4, $r5, $r6, $r7);
        return $r8;
    }
}
