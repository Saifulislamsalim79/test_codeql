package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.AssociatedFieldResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.AssociatedFieldsResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: AssociatedFieldsRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/remoteSources/AssociatedFieldsRemoteSource;", "", "productNetworkService", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "fetchAssociatedFields", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/AssociatedFieldsResponseBody;", "id", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.AssociatedFieldsRemoteSource */
/* loaded from: classes.dex */
public final class AssociatedFieldsRemoteSource {
    private final MarketPlaceApi productNetworkService;

    public AssociatedFieldsRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "productNetworkService");
        this.productNetworkService = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAssociatedFields$lambda-0  reason: not valid java name */
    public static final AssociatedFieldsResponseBody m41513fetchAssociatedFields$lambda0(C14840l c14840l) {
        String $r7;
        List $r4;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            Object $r2 = c14840l.m284a();
            APIResponse $r3 = (APIResponse) $r2;
            String $r6 = "Error Associated field";
            if ($r3 != null && ($r7 = $r3.message) != null) {
                $r6 = $r7;
            }
            AssociatedFieldsResponseBody $r1 = new AssociatedFieldsResponseBody($r6, null);
            return $r1;
        }
        Object $r22 = c14840l.m284a();
        APIResponse $r32 = (APIResponse) $r22;
        if ($r32 != null) {
            Object $r23 = $r32.data;
            AssociatedFieldResponse $r5 = (AssociatedFieldResponse) $r23;
            if ($r5 != null) {
                Object $r24 = $r5.getAssociatedFields();
                $r4 = (List) $r24;
                Log_OC.append($r4);
                AssociatedFieldsResponseBody $r12 = new AssociatedFieldsResponseBody(null, $r4);
                return $r12;
            }
        }
        $r4 = null;
        Log_OC.append($r4);
        AssociatedFieldsResponseBody $r122 = new AssociatedFieldsResponseBody(null, $r4);
        return $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchAssociatedFields(String str) {
        Log_OC.getArray(str, "id");
        MarketPlaceApi $r2 = this.productNetworkService;
        AbstractC11688p $r3 = $r2.getAssociatedFields(str);
        Position $r4 = Position.AUTO;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        Log_OC.loadImage($r32, "productNetworkService.getAssociatedFields(id).map {\n            if (it.code() == 200) {\n                AssociatedFieldsResponseBody(null, it.body()?.data?.associatedFields!!)\n            } else {\n                AssociatedFieldsResponseBody(it.body()?.message ?: \"Error Associated field\", null)\n            }\n        }");
        return $r32;
    }
}
