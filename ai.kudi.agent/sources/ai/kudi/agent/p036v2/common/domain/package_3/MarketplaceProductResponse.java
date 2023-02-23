package ai.kudi.agent.p036v2.common.domain.package_3;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MarketplaceProductResponse.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "", "responseMessage", "", "marketplaceProductList", "", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getMarketplaceProductList", "()Ljava/util/List;", "getResponseMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.package_3.MarketplaceProductResponse */
/* loaded from: classes.dex */
public final class MarketplaceProductResponse {
    private final List<MarketplaceProductModel> marketplaceProductList;
    private final String responseMessage;

    public MarketplaceProductResponse() {
        this(null, null, 3, null);
    }

    public MarketplaceProductResponse(String str, List list) {
        this.responseMessage = str;
        this.marketplaceProductList = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MarketplaceProductResponse(java.lang.String r2, java.util.List r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r3 = 0
        La:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse.<init>(java.lang.String, java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ MarketplaceProductResponse copy$default(MarketplaceProductResponse marketplaceProductResponse, String $r1, List $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = marketplaceProductResponse.responseMessage;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = marketplaceProductResponse.marketplaceProductList;
        }
        MarketplaceProductResponse $r0 = marketplaceProductResponse.copy($r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.responseMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component2() {
        List r1 = this.marketplaceProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceProductResponse copy(String str, List list) {
        MarketplaceProductResponse $r0 = new MarketplaceProductResponse(str, list);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof MarketplaceProductResponse;
        if ($z0) {
            MarketplaceProductResponse $r3 = (MarketplaceProductResponse) obj;
            String $r4 = this.responseMessage;
            String $r1 = $r3.responseMessage;
            boolean $z02 = Log_OC.append($r4, $r1);
            if ($z02) {
                List $r5 = this.marketplaceProductList;
                List $r6 = $r3.marketplaceProductList;
                boolean $z03 = Log_OC.append($r5, $r6);
                return $z03;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getMarketplaceProductList() {
        List r1 = this.marketplaceProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getResponseMessage() {
        String r1 = this.responseMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r2 = this.responseMessage;
        int $i1 = $r2 == null ? 0 : $r2.hashCode();
        int $i12 = $i1 * 31;
        List $r1 = this.marketplaceProductList;
        int $i0 = $r1 != null ? $r1.hashCode() : 0;
        return $i12 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("MarketplaceProductResponse(responseMessage=");
        String $r1 = this.responseMessage;
        $r2.append((Object) $r1);
        $r2.append(", marketplaceProductList=");
        List $r3 = this.marketplaceProductList;
        $r2.append($r3);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
