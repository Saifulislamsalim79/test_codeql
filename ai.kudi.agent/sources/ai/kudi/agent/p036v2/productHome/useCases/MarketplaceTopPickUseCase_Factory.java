package ai.kudi.agent.p036v2.productHome.useCases;

import ai.kudi.agent.p036v2.common.domain.repositories.MarketplaceTopPickRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productHome.useCases.MarketplaceTopPickUseCase_Factory */
/* loaded from: classes.dex */
public final class MarketplaceTopPickUseCase_Factory implements InterfaceC9468d<MarketplaceTopPickUseCase> {
    private final InterfaceC11700a<MarketplaceTopPickRepository> topPickRepositoryProvider;

    public MarketplaceTopPickUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.topPickRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceTopPickUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        MarketplaceTopPickUseCase_Factory $r1 = new MarketplaceTopPickUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceTopPickUseCase newInstance(MarketplaceTopPickRepository marketplaceTopPickRepository) {
        MarketplaceTopPickUseCase $r1 = new MarketplaceTopPickUseCase(marketplaceTopPickRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceTopPickUseCase multiply() {
        InterfaceC11700a $r1 = this.topPickRepositoryProvider;
        Object $r2 = $r1.get();
        MarketplaceTopPickRepository $r3 = (MarketplaceTopPickRepository) $r2;
        MarketplaceTopPickUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41638multiply() {
        MarketplaceTopPickUseCase $r1 = multiply();
        return $r1;
    }
}
