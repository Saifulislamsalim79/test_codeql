package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.network.client.responses.BestCommissionResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: MarketplaceBestCommissionRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/remoteSources/MarketplaceBestCommissionRemoteSource;", "", "productNetworkService", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "fetchMarketplaceBestCommission", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.MarketplaceBestCommissionRemoteSource */
/* loaded from: classes.dex */
public final class MarketplaceBestCommissionRemoteSource {
    private final MarketPlaceApi productNetworkService;

    public MarketplaceBestCommissionRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "productNetworkService");
        this.productNetworkService = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketplaceBestCommission$lambda-0  reason: not valid java name */
    public static final MarketplaceProductResponse m41515fetchMarketplaceBestCommission$lambda0(C14840l c14840l) {
        String $r7;
        List $r4;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            Object $r2 = c14840l.m284a();
            APIResponse $r3 = (APIResponse) $r2;
            String $r6 = "Error fetching products";
            if ($r3 != null && ($r7 = $r3.message) != null) {
                $r6 = $r7;
            }
            MarketplaceProductResponse $r1 = new MarketplaceProductResponse($r6, null);
            return $r1;
        }
        Object $r22 = c14840l.m284a();
        APIResponse $r32 = (APIResponse) $r22;
        if ($r32 != null) {
            Object $r23 = $r32.data;
            BestCommissionResponse $r5 = (BestCommissionResponse) $r23;
            if ($r5 != null) {
                Object $r24 = $r5.getBestCommissionProducts();
                $r4 = (List) $r24;
                Log_OC.append($r4);
                MarketplaceProductResponse $r12 = new MarketplaceProductResponse(null, $r4);
                return $r12;
            }
        }
        $r4 = null;
        Log_OC.append($r4);
        MarketplaceProductResponse $r122 = new MarketplaceProductResponse(null, $r4);
        return $r122;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketplaceBestCommission$lambda-2  reason: not valid java name */
    public static final MarketplaceProductResponse m41517fetchMarketplaceBestCommission$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        String $r0 = th.getLocalizedMessage();
        MarketplaceProductResponse $r2 = new MarketplaceProductResponse($r0, null, 2, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchMarketplaceBestCommission() {
        MarketPlaceApi $r1 = this.productNetworkService;
        AbstractC11688p $r2 = $r1.getBestCommission();
        Frame $r3 = Frame.f1904h;
        AbstractC11688p $r22 = $r2.m10531O($r3);
        C0686b $r4 = C0686b.f1908e;
        AbstractC11688p $r23 = $r22.x($r4);
        Type $r5 = Type.GRIDSET;
        AbstractC11688p $r24 = $r23.m10526T($r5);
        Log_OC.loadImage($r24, "productNetworkService.getBestCommission().map {\n            if (it.code() == 200) {\n                MarketplaceProductResponse(null, it.body()?.data?.bestCommissionProducts!!)\n            } else {\n                MarketplaceProductResponse(it.body()?.message ?: \"Error fetching products\", null)\n            }\n        }.doOnError { throwAppropriateException() }\n            .onErrorReturn { MarketplaceProductResponse(it.localizedMessage) }");
        return $r24;
    }
}
