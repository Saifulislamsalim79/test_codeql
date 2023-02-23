package ai.kudi.agent.p036v2.productHome.viewData;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceProductViewData;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ProductHomeViewData.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J\u0089\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006."}, m10421d2 = {"Lai/kudi/agent/v2/productHome/viewData/ProductHomeViewData;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceProductViewData;", "isSectorListLoading", "", "isTopPicksProductListLoading", "isBestCommissionProductsLoading", "businessSectorError", "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "topPicksProductListError", "bestCommissionProductListError", "clearSectorAdapter", "productSectors", "", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "topPickProductList", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "bestCommissionProductList", "(ZZZLai/kudi/agent/v2/common/view/viewData/data/Error;Lai/kudi/agent/v2/common/view/viewData/data/Error;Lai/kudi/agent/v2/common/view/viewData/data/Error;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBestCommissionProductList", "()Ljava/util/List;", "getBestCommissionProductListError", "()Lai/kudi/agent/v2/common/view/viewData/data/Error;", "getBusinessSectorError", "getClearSectorAdapter", "()Z", "getProductSectors", "getTopPickProductList", "getTopPicksProductListError", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.viewData.ProductHomeViewData */
/* loaded from: classes.dex */
public final class ProductHomeViewData implements MarketplaceProductViewData {
    private final List<MarketplaceProductModel> bestCommissionProductList;
    private final Error bestCommissionProductListError;
    private final Error businessSectorError;
    private final boolean clearSectorAdapter;
    private final boolean isBestCommissionProductsLoading;
    private final boolean isSectorListLoading;
    private final boolean isTopPicksProductListLoading;
    private final List<ProductSectorModel> productSectors;
    private final List<MarketplaceProductModel> topPickProductList;
    private final Error topPicksProductListError;

    public ProductHomeViewData() {
        this(false, false, false, null, null, null, false, null, null, null, 1023, null);
    }

    public ProductHomeViewData(boolean z, boolean z2, boolean z3, Error error, Error error2, Error error3, boolean z4, List list, List list2, List list3) {
        Log_OC.getArray(list, "productSectors");
        this.isSectorListLoading = z;
        this.isTopPicksProductListLoading = z2;
        this.isBestCommissionProductsLoading = z3;
        this.businessSectorError = error;
        this.topPicksProductListError = error2;
        this.bestCommissionProductListError = error3;
        this.clearSectorAdapter = z4;
        this.productSectors = list;
        this.topPickProductList = list2;
        this.bestCommissionProductList = list3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProductHomeViewData(boolean r15, boolean r16, boolean r17, ai.kudi.agent.p036v2.common.view.viewData.data.Error r18, ai.kudi.agent.p036v2.common.view.viewData.data.Error r19, ai.kudi.agent.p036v2.common.view.viewData.data.Error r20, boolean r21, java.util.List r22, java.util.List r23, java.util.List r24, int r25, kotlin.p483e0.p485d.DBUtils$1 r26) {
        /*
            r14 = this;
            r11 = r25 & 1
            r12 = 0
            if (r11 == 0) goto L7
            r15 = 0
            goto L7
        L7:
            r11 = r25 & 2
            if (r11 == 0) goto Le
            r16 = 0
            goto Le
        Le:
            r11 = r25 & 4
            if (r11 == 0) goto L15
            r17 = 0
            goto L15
        L15:
            r11 = r25 & 8
            r13 = 0
            if (r11 == 0) goto L1d
            r18 = 0
            goto L1d
        L1d:
            r11 = r25 & 16
            if (r11 == 0) goto L24
            r19 = 0
            goto L24
        L24:
            r11 = r25 & 32
            if (r11 == 0) goto L2b
            r20 = 0
            goto L2b
        L2b:
            r11 = r25 & 64
            if (r11 == 0) goto L30
            goto L32
        L30:
            r12 = r21
        L32:
            r0 = r25
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L3d
            java.util.List r22 = kotlin.p557z.C13722p.m3941e()
            goto L3d
        L3d:
            r0 = r25
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L46
            r23 = 0
            goto L46
        L46:
            r0 = r25
            r0 = r0 & 512(0x200, float:7.175E-43)
            r25 = r0
            if (r25 == 0) goto L4f
            goto L51
        L4f:
            r13 = r24
        L51:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r12
            r8 = r22
            r9 = r23
            r10 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData.<init>(boolean, boolean, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, ai.kudi.agent.v2.common.view.viewData.data.Error, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, java.util.List, java.util.List, java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ ProductHomeViewData copy$default(ProductHomeViewData productHomeViewData, boolean $z0, boolean $z1, boolean $z2, Error $r2, Error $r3, Error $r4, boolean $z3, List $r5, List $r6, List $r7, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = productHomeViewData.isSectorListLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z1 = productHomeViewData.isTopPicksProductListLoading;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z2 = productHomeViewData.isBestCommissionProductsLoading;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r2 = productHomeViewData.businessSectorError;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r3 = productHomeViewData.topPicksProductListError;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r4 = productHomeViewData.bestCommissionProductListError;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z3 = productHomeViewData.clearSectorAdapter;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r5 = productHomeViewData.productSectors;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $r6 = productHomeViewData.topPickProductList;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i0 != 0) {
            $r7 = productHomeViewData.bestCommissionProductList;
        }
        ProductHomeViewData $r0 = productHomeViewData.copy($z0, $z1, $z2, $r2, $r3, $r4, $z3, $r5, $r6, $r7);
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
    public final List component10() {
        List r1 = this.bestCommissionProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isTopPicksProductListLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isBestCommissionProductsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component4() {
        Error r1 = this.businessSectorError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component5() {
        Error r1 = this.topPicksProductListError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component6() {
        Error r1 = this.bestCommissionProductListError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component7() {
        boolean z0 = this.clearSectorAdapter;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component8() {
        List r1 = this.productSectors;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component9() {
        List r1 = this.topPickProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductHomeViewData copy(boolean z, boolean z2, boolean z3, Error error, Error error2, Error error3, boolean z4, List list, List list2, List list3) {
        Log_OC.getArray(list, "productSectors");
        ProductHomeViewData $r0 = new ProductHomeViewData(z, z2, z3, error, error2, error3, z4, list, list2, list3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof ProductHomeViewData;
        if ($z0) {
            ProductHomeViewData $r2 = (ProductHomeViewData) obj;
            boolean $z02 = this.isSectorListLoading;
            boolean $z1 = $r2.isSectorListLoading;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isTopPicksProductListLoading;
            boolean $z12 = $r2.isTopPicksProductListLoading;
            if ($z03 != $z12) {
                return false;
            }
            boolean $z04 = this.isBestCommissionProductsLoading;
            boolean $z13 = $r2.isBestCommissionProductsLoading;
            if ($z04 != $z13) {
                return false;
            }
            Error $r3 = this.businessSectorError;
            Error $r4 = $r2.businessSectorError;
            boolean $z05 = Log_OC.append($r3, $r4);
            if ($z05) {
                Error $r32 = this.topPicksProductListError;
                Error $r42 = $r2.topPicksProductListError;
                boolean $z06 = Log_OC.append($r32, $r42);
                if ($z06) {
                    Error $r33 = this.bestCommissionProductListError;
                    Error $r43 = $r2.bestCommissionProductListError;
                    boolean $z07 = Log_OC.append($r33, $r43);
                    if ($z07) {
                        boolean $z08 = this.clearSectorAdapter;
                        boolean $z14 = $r2.clearSectorAdapter;
                        if ($z08 != $z14) {
                            return false;
                        }
                        List $r5 = this.productSectors;
                        List $r6 = $r2.productSectors;
                        boolean $z09 = Log_OC.append($r5, $r6);
                        if ($z09) {
                            List $r52 = this.topPickProductList;
                            List $r62 = $r2.topPickProductList;
                            boolean $z010 = Log_OC.append($r52, $r62);
                            if ($z010) {
                                List $r53 = this.bestCommissionProductList;
                                List $r63 = $r2.bestCommissionProductList;
                                boolean $z011 = Log_OC.append($r53, $r63);
                                return $z011;
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
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBestCommissionProductList() {
        List r1 = this.bestCommissionProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getBestCommissionProductListError() {
        Error r1 = this.bestCommissionProductListError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getBusinessSectorError() {
        Error r1 = this.businessSectorError;
        return r1;
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
    public final List getProductSectors() {
        List r1 = this.productSectors;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getTopPickProductList() {
        List r1 = this.topPickProductList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getTopPicksProductListError() {
        Error r1 = this.topPicksProductListError;
        return r1;
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
        boolean $z02 = this.isTopPicksProductListLoading;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i03 = ($i02 + $i1) * 31;
        boolean $z03 = this.isBestCommissionProductsLoading;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i12 = i2;
        int $i13 = ($i03 + $i12) * 31;
        Error $r1 = this.businessSectorError;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i14 = ($i13 + $i2) * 31;
        Error $r12 = this.topPicksProductListError;
        int $i22 = $r12 == null ? 0 : $r12.hashCode();
        int $i15 = ($i14 + $i22) * 31;
        Error $r13 = this.bestCommissionProductListError;
        int $i23 = $r13 == null ? 0 : $r13.hashCode();
        int $i16 = ($i15 + $i23) * 31;
        boolean $z04 = this.clearSectorAdapter;
        int $i24 = $z04 ? 1 : $z04 ? 1 : 0;
        int $i25 = this.productSectors.hashCode();
        int $i17 = ((($i16 + $i24) * 31) + $i25) * 31;
        List $r2 = this.topPickProductList;
        int $i26 = $r2 == null ? 0 : $r2.hashCode();
        int $i18 = ($i17 + $i26) * 31;
        List $r22 = this.bestCommissionProductList;
        int $i04 = $r22 != null ? $r22.hashCode() : 0;
        return $i18 + $i04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isBestCommissionProductsLoading() {
        boolean z0 = this.isBestCommissionProductsLoading;
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
    public final boolean isTopPicksProductListLoading() {
        boolean z0 = this.isTopPicksProductListLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ProductHomeViewData(isSectorListLoading=");
        boolean $z0 = this.isSectorListLoading;
        $r2.append($z0);
        $r2.append(", isTopPicksProductListLoading=");
        boolean $z02 = this.isTopPicksProductListLoading;
        $r2.append($z02);
        $r2.append(", isBestCommissionProductsLoading=");
        boolean $z03 = this.isBestCommissionProductsLoading;
        $r2.append($z03);
        $r2.append(", businessSectorError=");
        Error $r3 = this.businessSectorError;
        $r2.append($r3);
        $r2.append(", topPicksProductListError=");
        Error $r32 = this.topPicksProductListError;
        $r2.append($r32);
        $r2.append(", bestCommissionProductListError=");
        Error $r33 = this.bestCommissionProductListError;
        $r2.append($r33);
        $r2.append(", clearSectorAdapter=");
        boolean $z04 = this.clearSectorAdapter;
        $r2.append($z04);
        $r2.append(", productSectors=");
        List $r4 = this.productSectors;
        $r2.append($r4);
        $r2.append(", topPickProductList=");
        List $r42 = this.topPickProductList;
        $r2.append($r42);
        $r2.append(", bestCommissionProductList=");
        List $r43 = this.bestCommissionProductList;
        $r2.append($r43);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
