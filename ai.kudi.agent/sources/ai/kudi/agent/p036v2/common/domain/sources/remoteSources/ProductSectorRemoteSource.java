package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: ProductSectorRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductSectorRemoteSource;", "", "networkApi", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "fetchProductSector", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.ProductSectorRemoteSource */
/* loaded from: classes.dex */
public final class ProductSectorRemoteSource {
    private final MarketPlaceApi networkApi;

    public ProductSectorRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "networkApi");
        this.networkApi = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductSector$lambda-0  reason: not valid java name */
    public static final List m41531fetchProductSector$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        Object $r0 = c14840l.m284a();
        APIResponse $r2 = (APIResponse) $r0;
        if ($r2 == null) {
            return null;
        }
        Object $r02 = $r2.data;
        List $r3 = (List) $r02;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchProductSector() {
        MarketPlaceApi $r1 = this.networkApi;
        AbstractC11688p $r2 = $r1.getProductSectors();
        ClassWriter $r3 = ClassWriter.f1903b;
        AbstractC11688p $r22 = $r2.m10531O($r3);
        Chunk $r4 = Chunk.NEWLINE;
        return $r22.x($r4);
    }
}
