package ai.kudi.agent.p036v2.productList.viewData;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceProductViewData;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductListViewData.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00060"}, m10421d2 = {"Lai/kudi/agent/v2/productList/viewData/ProductListViewData;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceProductViewData;", "isSectorListLoading", "", "isProductListLoading", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "clearSectorAdapter", "productSectors", "", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "marketplaceProductList", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "reset", "productBusinessCategoryId", "", "productBusinessSectorTitle", "", "(ZZLai/kudi/agent/v2/common/view/viewData/data/Error;ZLjava/util/List;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;)V", "getClearSectorAdapter", "()Z", "getError", "()Lai/kudi/agent/v2/common/view/viewData/data/Error;", "getMarketplaceProductList", "()Ljava/util/List;", "getProductBusinessCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductBusinessSectorTitle", "()Ljava/lang/String;", "getProductSectors", "getReset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLai/kudi/agent/v2/common/view/viewData/data/Error;ZLjava/util/List;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;)Lai/kudi/agent/v2/productList/viewData/ProductListViewData;", "equals", "other", "", "hashCode", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productList.viewData.ProductListViewData */
/* loaded from: classes.dex */
public final class ProductListViewData implements MarketplaceProductViewData {
    private final boolean clearSectorAdapter;
    private final Error error;
    private final boolean isProductListLoading;
    private final boolean isSectorListLoading;
    private final List<MarketplaceProductModel> marketplaceProductList;
    private final Integer productBusinessCategoryId;
    private final String productBusinessSectorTitle;
    private final List<ProductSectorModel> productSectors;
    private final boolean reset;

    public ProductListViewData() {
        this(false, false, null, false, null, null, false, null, null, 511, null);
    }

    public ProductListViewData(boolean z, boolean z2, Error error, boolean z3, List list, List list2, boolean z4, Integer num, String str) {
        Log_OC.getArray(list, "productSectors");
        Log_OC.getArray(list2, "marketplaceProductList");
        this.isSectorListLoading = z;
        this.isProductListLoading = z2;
        this.error = error;
        this.clearSectorAdapter = z3;
        this.productSectors = list;
        this.marketplaceProductList = list2;
        this.reset = z4;
        this.productBusinessCategoryId = num;
        this.productBusinessSectorTitle = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProductListViewData(boolean r14, boolean r15, ai.kudi.agent.p036v2.common.view.viewData.data.Error r16, boolean r17, java.util.List r18, java.util.List r19, boolean r20, java.lang.Integer r21, java.lang.String r22, int r23, kotlin.p483e0.p485d.DBUtils$1 r24) {
        /*
            r13 = this;
            r10 = r23 & 1
            r11 = 0
            if (r10 == 0) goto L7
            r14 = 0
            goto L7
        L7:
            r10 = r23 & 2
            if (r10 == 0) goto Ld
            r15 = 0
            goto Ld
        Ld:
            r10 = r23 & 4
            r12 = 0
            if (r10 == 0) goto L15
            r16 = 0
            goto L15
        L15:
            r10 = r23 & 8
            if (r10 == 0) goto L1c
            r17 = 0
            goto L1c
        L1c:
            r10 = r23 & 16
            if (r10 == 0) goto L25
            java.util.List r18 = kotlin.p557z.C13722p.m3941e()
            goto L25
        L25:
            r10 = r23 & 32
            if (r10 == 0) goto L2e
            java.util.List r19 = kotlin.p557z.C13722p.m3941e()
            goto L2e
        L2e:
            r10 = r23 & 64
            if (r10 == 0) goto L33
            goto L35
        L33:
            r11 = r20
        L35:
            r0 = r23
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L3e
            r21 = 0
            goto L3e
        L3e:
            r0 = r23
            r0 = r0 & 256(0x100, float:3.59E-43)
            r23 = r0
            if (r23 == 0) goto L47
            goto L49
        L47:
            r12 = r22
        L49:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r11
            r8 = r21
            r9 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productList.viewData.ProductListViewData.<init>(boolean, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, java.util.List, java.util.List, boolean, java.lang.Integer, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ ProductListViewData copy$default(ProductListViewData productListViewData, boolean $z0, boolean $z1, Error $r2, boolean $z2, List $r3, List $r4, boolean $z3, Integer $r5, String $r6, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = productListViewData.isSectorListLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z1 = productListViewData.isProductListLoading;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r2 = productListViewData.error;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $z2 = productListViewData.clearSectorAdapter;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r3 = productListViewData.productSectors;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r4 = productListViewData.marketplaceProductList;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z3 = productListViewData.reset;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r5 = productListViewData.productBusinessCategoryId;
        }
        int $i0 = i & 256;
        if ($i0 != 0) {
            $r6 = productListViewData.productBusinessSectorTitle;
        }
        ProductListViewData $r0 = productListViewData.copy($z0, $z1, $r2, $z2, $r3, $r4, $z3, $r5, $r6);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isSectorListLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isProductListLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component3() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component4() {
        boolean z0 = this.clearSectorAdapter;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component5() {
        List r1 = this.productSectors;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component6() {
        List r1 = this.marketplaceProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component7() {
        boolean z0 = this.reset;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Integer component8() {
        Integer r1 = this.productBusinessCategoryId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.productBusinessSectorTitle;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductListViewData copy(boolean z, boolean z2, Error error, boolean z3, List list, List list2, boolean z4, Integer num, String str) {
        Log_OC.getArray(list, "productSectors");
        Log_OC.getArray(list2, "marketplaceProductList");
        ProductListViewData $r0 = new ProductListViewData(z, z2, error, z3, list, list2, z4, num, str);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof ProductListViewData;
        if ($z0) {
            ProductListViewData $r2 = (ProductListViewData) obj;
            boolean $z02 = this.isSectorListLoading;
            boolean $z1 = $r2.isSectorListLoading;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isProductListLoading;
            boolean $z12 = $r2.isProductListLoading;
            if ($z03 != $z12) {
                return false;
            }
            Error $r3 = this.error;
            Error $r4 = $r2.error;
            boolean $z04 = Log_OC.append($r3, $r4);
            if ($z04) {
                boolean $z05 = this.clearSectorAdapter;
                boolean $z13 = $r2.clearSectorAdapter;
                if ($z05 != $z13) {
                    return false;
                }
                List $r5 = this.productSectors;
                List $r6 = $r2.productSectors;
                boolean $z06 = Log_OC.append($r5, $r6);
                if ($z06) {
                    List $r52 = this.marketplaceProductList;
                    List $r62 = $r2.marketplaceProductList;
                    boolean $z07 = Log_OC.append($r52, $r62);
                    if ($z07) {
                        boolean $z08 = this.reset;
                        boolean $z14 = $r2.reset;
                        if ($z08 != $z14) {
                            return false;
                        }
                        Integer $r7 = this.productBusinessCategoryId;
                        Integer $r8 = $r2.productBusinessCategoryId;
                        boolean $z09 = Log_OC.append($r7, $r8);
                        if ($z09) {
                            String $r9 = this.productBusinessSectorTitle;
                            String $r10 = $r2.productBusinessSectorTitle;
                            boolean $z010 = Log_OC.append($r9, $r10);
                            return $z010;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getClearSectorAdapter() {
        boolean z0 = this.clearSectorAdapter;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getError() {
        Error r1 = this.error;
        return r1;
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
    public final Integer getProductBusinessCategoryId() {
        Integer r1 = this.productBusinessCategoryId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProductBusinessSectorTitle() {
        String r1 = this.productBusinessSectorTitle;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getProductSectors() {
        List r1 = this.productSectors;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getReset() {
        boolean z0 = this.reset;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isSectorListLoading;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.isProductListLoading;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i12 = ($i02 + $i1) * 31;
        Error $r1 = this.error;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        boolean $z03 = this.clearSectorAdapter;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i22 = i2;
        List $r2 = this.productSectors;
        int $i23 = $r2.hashCode();
        List $r22 = this.marketplaceProductList;
        int $i24 = $r22.hashCode();
        int $i14 = ((((($i13 + $i22) * 31) + $i23) * 31) + $i24) * 31;
        boolean $z04 = this.reset;
        int $i25 = $z04 ? 1 : $z04 ? 1 : 0;
        int $i15 = ($i14 + $i25) * 31;
        Integer $r3 = this.productBusinessCategoryId;
        int $i26 = $r3 == null ? 0 : $r3.hashCode();
        int $i16 = ($i15 + $i26) * 31;
        String $r4 = this.productBusinessSectorTitle;
        int $i03 = $r4 != null ? $r4.hashCode() : 0;
        return $i16 + $i03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isProductListLoading() {
        boolean z0 = this.isProductListLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isSectorListLoading() {
        boolean z0 = this.isSectorListLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ProductListViewData(isSectorListLoading=");
        boolean $z0 = this.isSectorListLoading;
        $r2.append($z0);
        $r2.append(", isProductListLoading=");
        boolean $z02 = this.isProductListLoading;
        $r2.append($z02);
        $r2.append(", error=");
        Error $r3 = this.error;
        $r2.append($r3);
        $r2.append(", clearSectorAdapter=");
        boolean $z03 = this.clearSectorAdapter;
        $r2.append($z03);
        $r2.append(", productSectors=");
        List $r4 = this.productSectors;
        $r2.append($r4);
        $r2.append(", marketplaceProductList=");
        List $r42 = this.marketplaceProductList;
        $r2.append($r42);
        $r2.append(", reset=");
        boolean $z04 = this.reset;
        $r2.append($z04);
        $r2.append(", productBusinessCategoryId=");
        Integer $r5 = this.productBusinessCategoryId;
        $r2.append($r5);
        $r2.append(", productBusinessSectorTitle=");
        String $r1 = this.productBusinessSectorTitle;
        $r2.append((Object) $r1);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
