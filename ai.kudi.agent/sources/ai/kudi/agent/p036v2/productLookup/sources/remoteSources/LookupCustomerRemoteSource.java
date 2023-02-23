package ai.kudi.agent.p036v2.productLookup.sources.remoteSources;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.merchantProduct.data.CustomerLookupRequest;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.LookupCustomerRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.LookupCustomerResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: LookupCustomerRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/v2/productLookup/sources/remoteSources/LookupCustomerRemoteSource;", "", "api", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "getApi", "()Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "lookupCustomer", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/LookupCustomerResponse;", "param", "Lai/kudi/agent/merchantProduct/data/CustomerLookupRequest;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.sources.remoteSources.LookupCustomerRemoteSource */
/* loaded from: classes.dex */
public final class LookupCustomerRemoteSource {
    private final MarketPlaceApi mApi;

    public LookupCustomerRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "api");
        this.mApi = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-0  reason: not valid java name */
    public static final LookupCustomerResponse m41660lookupCustomer$lambda0(C14840l c14840l) {
        Map $r6;
        String $r7;
        Map $r62;
        Map $r63;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 == 200) {
            Object $r2 = c14840l.m284a();
            APIResponse $r3 = (APIResponse) $r2;
            LookupCustomerResponse $r4 = null;
            String $r5 = $r3 == null ? null : $r3.message;
            Log_OC.append($r5);
            Object $r22 = c14840l.m284a();
            APIResponse $r32 = (APIResponse) $r22;
            if ($r32 != null) {
                Object $r23 = $r32.data;
                $r4 = (LookupCustomerResponse) $r23;
            }
            Log_OC.append($r4);
            Map $r64 = $r4.getSummary();
            LookupCustomerResponse $r1 = new LookupCustomerResponse($r5, $r64);
            return $r1;
        }
        int $i02 = c14840l.m283b();
        if ($i02 == 500) {
            $r63 = C13727r0.m3881k();
            LookupCustomerResponse $r12 = new LookupCustomerResponse("Product lookup failed", $r63);
            return $r12;
        }
        int $i03 = c14840l.m283b();
        if ($i03 == 404) {
            $r62 = C13727r0.m3881k();
            LookupCustomerResponse $r13 = new LookupCustomerResponse("Customer not found", $r62);
            return $r13;
        }
        Object $r24 = c14840l.m284a();
        APIResponse $r33 = (APIResponse) $r24;
        String $r52 = IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
        if ($r33 != null && ($r7 = $r33.message) != null) {
            $r52 = $r7;
        }
        $r6 = C13727r0.m3881k();
        LookupCustomerResponse $r14 = new LookupCustomerResponse($r52, $r6);
        return $r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketPlaceApi getApi() {
        MarketPlaceApi r1 = this.mApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p lookupCustomer(CustomerLookupRequest customerLookupRequest) {
        Log_OC.getArray(customerLookupRequest, "param");
        MarketPlaceApi $r3 = this.mApi;
        String $r4 = customerLookupRequest.getAgentId();
        double $d0 = customerLookupRequest.getLatitude();
        double $d1 = customerLookupRequest.getLongitude();
        String $r5 = customerLookupRequest.getProductCode();
        Map $r6 = customerLookupRequest.getRequiredLookupField();
        LookupCustomerRequestBody $r1 = new LookupCustomerRequestBody($r4, $d0, $d1, $r5, $r6);
        AbstractC11688p $r7 = $r3.lookupCustomer($r1);
        ClassWriter $r8 = ClassWriter.f1979a;
        AbstractC11688p $r72 = $r7.m10531O($r8);
        Token $r9 = Token.RANGE;
        AbstractC11688p $r73 = $r72.x($r9);
        Log_OC.loadImage($r73, "api.lookupCustomer(\n            LookupCustomerRequestBody(\n                param.agentId,\n                param.latitude,\n                param.longitude,\n                param.productCode,\n                param.requiredLookupField\n            )\n        ).map {\n            if (it.code() == 200) {\n                LookupCustomerResponse(\n                    message = it.body()?.message!!,\n                    summary = it.body()?.data!!.summary\n                )\n            } else {\n                if (it.code() == 500) {\n                    LookupCustomerResponse(message = \"Product lookup failed\", summary = emptyMap())\n                } else if (it.code() == 404) {\n                    LookupCustomerResponse(message = \"Customer not found\", summary = emptyMap())\n                } else {\n                    LookupCustomerResponse(\n                        message = it.body()?.message ?: \"error\",\n                        summary = emptyMap()\n                    )\n                }\n            }\n        }.doOnError { throwAppropriateException() }");
        return $r73;
    }
}
