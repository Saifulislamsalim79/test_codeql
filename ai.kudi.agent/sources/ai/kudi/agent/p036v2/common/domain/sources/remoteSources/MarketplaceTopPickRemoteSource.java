package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: MarketplaceTopPickRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/remoteSources/MarketplaceTopPickRemoteSource;", "", "productNetworkService", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "fetchMarketplaceTopPick", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.MarketplaceTopPickRemoteSource */
/* loaded from: classes.dex */
public final class MarketplaceTopPickRemoteSource {
    private final MarketPlaceApi productNetworkService;

    public MarketplaceTopPickRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "productNetworkService");
        this.productNetworkService = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketplaceTopPick$lambda-0  reason: not valid java name */
    public static final MarketplaceProductResponse m41519fetchMarketplaceTopPick$lambda0(C14840l c14840l) {
        String $r6;
        List $r4;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            Object $r2 = c14840l.m284a();
            APIResponse $r3 = (APIResponse) $r2;
            String $r5 = "Error fetching products";
            if ($r3 != null && ($r6 = $r3.message) != null) {
                $r5 = $r6;
            }
            MarketplaceProductResponse $r1 = new MarketplaceProductResponse($r5, null);
            return $r1;
        }
        Object $r22 = c14840l.m284a();
        APIResponse $r32 = (APIResponse) $r22;
        if ($r32 == null) {
            $r4 = null;
        } else {
            Object $r23 = $r32.data;
            $r4 = (List) $r23;
        }
        Log_OC.append($r4);
        MarketplaceProductResponse $r12 = new MarketplaceProductResponse(null, $r4);
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketplaceTopPick$lambda-2  reason: not valid java name */
    public static final MarketplaceProductResponse m41521fetchMarketplaceTopPick$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        String $r0 = th.getLocalizedMessage();
        MarketplaceProductResponse $r2 = new MarketplaceProductResponse($r0, null, 2, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchMarketplaceTopPick() {
        MarketPlaceApi $r1 = this.productNetworkService;
        AbstractC11688p $r2 = $r1.getTopPicks();
        Label $r3 = Label.f1906i;
        AbstractC11688p $r22 = $r2.m10531O($r3);
        C0687c $r4 = C0687c.f1909d;
        AbstractC11688p $r23 = $r22.x($r4);
        C0689g $r5 = C0689g.f1911d;
        AbstractC11688p $r24 = $r23.m10526T($r5);
        Log_OC.loadImage($r24, "productNetworkService.getTopPicks().map {\n            if (it.code() == 200) {\n                MarketplaceProductResponse(null, it.body()?.data!!)\n            } else {\n                MarketplaceProductResponse(it.body()?.message ?: \"Error fetching products\", null)\n            }\n        }.doOnError { throwAppropriateException() }\n            .onErrorReturn { MarketplaceProductResponse(it.localizedMessage) }");
        return $r24;
    }
}
