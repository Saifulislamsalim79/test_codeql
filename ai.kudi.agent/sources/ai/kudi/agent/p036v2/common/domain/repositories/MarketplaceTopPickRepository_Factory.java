package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.MarketplaceTopPickRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.MarketplaceTopPickRepository_Factory */
/* loaded from: classes.dex */
public final class MarketplaceTopPickRepository_Factory implements InterfaceC9468d<MarketplaceTopPickRepository> {
    private final InterfaceC11700a<MarketplaceTopPickRemoteSource> topPickRemoteSourceProvider;

    public MarketplaceTopPickRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.topPickRemoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceTopPickRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        MarketplaceTopPickRepository_Factory $r1 = new MarketplaceTopPickRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceTopPickRepository newInstance(MarketplaceTopPickRemoteSource marketplaceTopPickRemoteSource) {
        MarketplaceTopPickRepository $r1 = new MarketplaceTopPickRepository(marketplaceTopPickRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceTopPickRepository multiply() {
        InterfaceC11700a $r1 = this.topPickRemoteSourceProvider;
        Object $r2 = $r1.get();
        MarketplaceTopPickRemoteSource $r3 = (MarketplaceTopPickRemoteSource) $r2;
        MarketplaceTopPickRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41503multiply() {
        MarketplaceTopPickRepository $r1 = multiply();
        return $r1;
    }
}
