package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.ProductFieldResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: ProductFieldsRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductFieldsRemoteSource;", "", "productNetworkService", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "fetchProductFields", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/ProductFieldResponse;", "productId", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.ProductFieldsRemoteSource */
/* loaded from: classes.dex */
public final class ProductFieldsRemoteSource {
    private final MarketPlaceApi productNetworkService;

    public ProductFieldsRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "productNetworkService");
        this.productNetworkService = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductFields$lambda-0  reason: not valid java name */
    public static final ProductFieldResponse m41523fetchProductFields$lambda0(C14840l c14840l) {
        ProductField $r4;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            String $r5 = c14840l.m279f();
            String $r6 = $r5;
            if ($r5 == null) {
                $r6 = "Error fetching fields";
            }
            ProductFieldResponse $r1 = new ProductFieldResponse(null, $r6, 1, null);
            return $r1;
        }
        Object $r2 = c14840l.m284a();
        APIResponse $r3 = (APIResponse) $r2;
        if ($r3 == null) {
            $r4 = null;
        } else {
            Object $r22 = $r3.data;
            $r4 = (ProductField) $r22;
        }
        ProductFieldResponse $r12 = new ProductFieldResponse($r4, null, 2, null);
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductFields$lambda-2  reason: not valid java name */
    public static final ProductFieldResponse m41525fetchProductFields$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        String $r0 = th.getLocalizedMessage();
        ProductFieldResponse $r2 = new ProductFieldResponse(null, $r0, 1, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchProductFields(String str) {
        Log_OC.getArray(str, "productId");
        MarketPlaceApi $r2 = this.productNetworkService;
        AbstractC11688p $r3 = $r2.getProductFields(str);
        Subscription $r4 = Subscription.subscribed;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        Language $r5 = Language.f1907C;
        AbstractC11688p $r33 = $r32.x($r5);
        C0688f $r6 = C0688f.f1910o;
        return $r33.m10526T($r6);
    }
}
