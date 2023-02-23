package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductListRemoteSource.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductListRemoteSource;", "", "productNetworkService", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "currentItemCount", "", "totalItemCount", "canLoadMoreProducts", "", "page", "fetchAllProducts", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "param", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductsApiParams;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.ProductListRemoteSource */
/* loaded from: classes.dex */
public final class ProductListRemoteSource {
    private int currentItemCount;
    private final MarketPlaceApi productNetworkService;
    private int totalItemCount;

    public ProductListRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "productNetworkService");
        this.productNetworkService = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: fetchAllProducts$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse m41527fetchAllProducts$lambda0(ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductListRemoteSource r25, retrofit2.C14840l r26) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductListRemoteSource.m41527fetchAllProducts$lambda0(ai.kudi.agent.v2.common.domain.sources.remoteSources.ProductListRemoteSource, retrofit2.l):ai.kudi.agent.v2.common.domain.package_3.MarketplaceProductResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAllProducts$lambda-2  reason: not valid java name */
    public static final MarketplaceProductResponse m41529fetchAllProducts$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        String $r0 = th.getLocalizedMessage();
        MarketplaceProductResponse $r2 = new MarketplaceProductResponse($r0, null, 2, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean canLoadMoreProducts(int i) {
        if (i >= 0) {
            int $i1 = this.currentItemCount;
            int $i0 = this.totalItemCount;
            return $i1 < $i0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r8 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p425j.p444e.AbstractC11688p fetchAllProducts(int r19, ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductsApiParams r20) {
        /*
            r18 = this;
            java.lang.String r6 = "param"
            r0 = r20
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            r0 = r20
            boolean r7 = r0.getReset()
            if (r7 == 0) goto L11
            r19 = 0
        L11:
            r0 = r18
            r1 = r19
            boolean r7 = r0.canLoadMoreProducts(r1)
            if (r7 != 0) goto L29
            r0 = r18
            int r8 = r0.totalItemCount
            if (r8 == 0) goto L29
            r0 = r18
            int r8 = r0.currentItemCount
            if (r8 == 0) goto L29
            int r19 = r19 + (-1)
        L29:
            r0 = r18
            ai.kudi.agent.v2.common.domain.network.client.MarketPlaceApi r9 = r0.productNetworkService
            r0 = r20
            java.lang.String r10 = r0.getSearchTerm()
            java.lang.String r6 = ""
            boolean r7 = kotlin.p483e0.p485d.Log_OC.append(r10, r6)
            r11 = 0
            if (r7 == 0) goto L3e
            r10 = 0
            goto L44
        L3e:
            r0 = r20
            java.lang.String r10 = r0.getSearchTerm()
        L44:
            r0 = r20
            java.lang.Integer r12 = r0.getBusinessCategoryId()
            if (r12 != 0) goto L4d
            goto L54
        L4d:
            int r8 = r12.intValue()
            if (r8 != 0) goto L54
            goto L5a
        L54:
            r0 = r20
            java.lang.Integer r11 = r0.getBusinessCategoryId()
        L5a:
            int r19 = r19 + 1
            r14 = 20
            java.lang.String r6 = "ACTIVE"
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r14
            r4 = r19
            r5 = r6
            j.e.p r13 = r0.getAllProducts(r1, r2, r3, r4, r5)
            ai.kudi.agent.v2.common.domain.sources.remoteSources.Item r15 = new ai.kudi.agent.v2.common.domain.sources.remoteSources.Item
            r0 = r18
            r15.<init>()
            j.e.p r13 = r13.m10531O(r15)
            ai.kudi.agent.v2.common.domain.sources.remoteSources.State r16 = ai.kudi.agent.p036v2.common.domain.sources.remoteSources.State.NONE
            r0 = r16
            j.e.p r13 = r13.x(r0)
            ai.kudi.agent.v2.common.domain.sources.remoteSources.Token r17 = ai.kudi.agent.p036v2.common.domain.sources.remoteSources.Token.RANGE
            r0 = r17
            j.e.p r13 = r13.m10526T(r0)
            java.lang.String r6 = "productNetworkService.getAllProducts(\n            searchTerm = if (param.searchTerm == \"\") null else param.searchTerm,\n            businessCategoryId = if (param.businessCategoryId == 0) null else param.businessCategoryId,\n            20,\n            page = ++pageCount,\n            status = \"ACTIVE\"\n        ).map {\n            if (it.code() == 200) {\n                currentItemCount = currentItemCount.plus(it.body()?.data?.list?.size!!)\n                totalItemCount = it.body()?.data?.total!!\n                MarketplaceProductResponse(null, it.body()?.data?.list)\n            } else {\n                MarketplaceProductResponse(it.body()?.message ?: \"Error fetching products\", null)\n            }\n        }.doOnError { throwAppropriateException() }\n            .onErrorReturn { MarketplaceProductResponse(it.localizedMessage) }"
            kotlin.p483e0.p485d.Log_OC.loadImage(r13, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductListRemoteSource.fetchAllProducts(int, ai.kudi.agent.v2.common.domain.package_3.MarketplaceProductsApiParams):j.e.p");
    }
}
