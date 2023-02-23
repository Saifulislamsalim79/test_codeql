package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.MarketplaceBestCommissionRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.MarketplaceBestCommissionRepository_Factory */
/* loaded from: classes.dex */
public final class MarketplaceBestCommissionRepository_Factory implements InterfaceC9468d<MarketplaceBestCommissionRepository> {
    private final InterfaceC11700a<MarketplaceBestCommissionRemoteSource> bestCommissionRemoteSourceProvider;

    public MarketplaceBestCommissionRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.bestCommissionRemoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceBestCommissionRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        MarketplaceBestCommissionRepository_Factory $r1 = new MarketplaceBestCommissionRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceBestCommissionRepository newInstance(MarketplaceBestCommissionRemoteSource marketplaceBestCommissionRemoteSource) {
        MarketplaceBestCommissionRepository $r1 = new MarketplaceBestCommissionRepository(marketplaceBestCommissionRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceBestCommissionRepository multiply() {
        InterfaceC11700a $r1 = this.bestCommissionRemoteSourceProvider;
        Object $r2 = $r1.get();
        MarketplaceBestCommissionRemoteSource $r3 = (MarketplaceBestCommissionRemoteSource) $r2;
        MarketplaceBestCommissionRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41502multiply() {
        MarketplaceBestCommissionRepository $r1 = multiply();
        return $r1;
    }
}
