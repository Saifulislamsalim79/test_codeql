package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.MarketplaceTopPickRemoteSource;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: MarketplaceTopPickRepository.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/repositories/MarketplaceTopPickRepository;", "", "topPickRemoteSource", "Lai/kudi/agent/v2/common/domain/sources/remoteSources/MarketplaceTopPickRemoteSource;", "(Lai/kudi/agent/v2/common/domain/sources/remoteSources/MarketplaceTopPickRemoteSource;)V", "fetchTopPick", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.MarketplaceTopPickRepository */
/* loaded from: classes.dex */
public final class MarketplaceTopPickRepository {
    private final MarketplaceTopPickRemoteSource topPickRemoteSource;

    public MarketplaceTopPickRepository(MarketplaceTopPickRemoteSource marketplaceTopPickRemoteSource) {
        Log_OC.getArray(marketplaceTopPickRemoteSource, "topPickRemoteSource");
        this.topPickRemoteSource = marketplaceTopPickRemoteSource;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchTopPick() {
        MarketplaceTopPickRemoteSource $r1 = this.topPickRemoteSource;
        AbstractC11688p $r2 = $r1.fetchMarketplaceTopPick();
        Item $r3 = ClassWriter.LogError();
        AbstractC11688p $r22 = $r2.h0($r3);
        Item $r32 = ContextUtils.LogError();
        AbstractC11688p $r23 = $r22.R($r32);
        Log_OC.loadImage($r23, "topPickRemoteSource.fetchMarketplaceTopPick().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r23;
    }
}
