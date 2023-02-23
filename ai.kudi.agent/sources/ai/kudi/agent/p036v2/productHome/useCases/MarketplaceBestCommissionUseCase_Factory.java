package ai.kudi.agent.p036v2.productHome.useCases;

import ai.kudi.agent.p036v2.common.domain.repositories.MarketplaceBestCommissionRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productHome.useCases.MarketplaceBestCommissionUseCase_Factory */
/* loaded from: classes.dex */
public final class MarketplaceBestCommissionUseCase_Factory implements InterfaceC9468d<MarketplaceBestCommissionUseCase> {
    private final InterfaceC11700a<MarketplaceBestCommissionRepository> bestCommissionRepositoryProvider;

    public MarketplaceBestCommissionUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.bestCommissionRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceBestCommissionUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        MarketplaceBestCommissionUseCase_Factory $r1 = new MarketplaceBestCommissionUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceBestCommissionUseCase newInstance(MarketplaceBestCommissionRepository marketplaceBestCommissionRepository) {
        MarketplaceBestCommissionUseCase $r1 = new MarketplaceBestCommissionUseCase(marketplaceBestCommissionRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceBestCommissionUseCase multiply() {
        InterfaceC11700a $r1 = this.bestCommissionRepositoryProvider;
        Object $r2 = $r1.get();
        MarketplaceBestCommissionRepository $r3 = (MarketplaceBestCommissionRepository) $r2;
        MarketplaceBestCommissionUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41637multiply() {
        MarketplaceBestCommissionUseCase $r1 = multiply();
        return $r1;
    }
}
