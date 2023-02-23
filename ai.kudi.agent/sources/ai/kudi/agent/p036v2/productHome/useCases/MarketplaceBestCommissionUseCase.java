package ai.kudi.agent.p036v2.productHome.useCases;

import ai.kudi.agent.p036v2.common.domain.repositories.MarketplaceBestCommissionRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: MarketplaceBestCommissionUseCase.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/useCases/MarketplaceBestCommissionUseCase;", "", "bestCommissionRepository", "Lai/kudi/agent/v2/common/domain/repositories/MarketplaceBestCommissionRepository;", "(Lai/kudi/agent/v2/common/domain/repositories/MarketplaceBestCommissionRepository;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.useCases.MarketplaceBestCommissionUseCase */
/* loaded from: classes.dex */
public final class MarketplaceBestCommissionUseCase {
    private final MarketplaceBestCommissionRepository bestCommissionRepository;

    public MarketplaceBestCommissionUseCase(MarketplaceBestCommissionRepository marketplaceBestCommissionRepository) {
        Log_OC.getArray(marketplaceBestCommissionRepository, "bestCommissionRepository");
        this.bestCommissionRepository = marketplaceBestCommissionRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute() {
        MarketplaceBestCommissionRepository $r2 = this.bestCommissionRepository;
        AbstractC11688p $r1 = $r2.fetchBestCommission();
        return $r1;
    }
}
