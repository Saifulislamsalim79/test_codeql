package ai.kudi.agent.p036v2.productDetails.viewData;

import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceProductViewData;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductDetailsLiveData.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/viewData/ProductDetailsLiveData;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceProductViewData;", "productDetailsLoading", "", "productFields", "Lai/kudi/agent/core/domain/data/ProductField;", "productFieldsLoading", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "enableButton", "(ZLai/kudi/agent/core/domain/data/ProductField;ZLai/kudi/agent/v2/common/view/viewData/data/Error;Z)V", "getEnableButton", "()Z", "getError", "()Lai/kudi/agent/v2/common/view/viewData/data/Error;", "getProductDetailsLoading", "getProductFields", "()Lai/kudi/agent/core/domain/data/ProductField;", "setProductFields", "(Lai/kudi/agent/core/domain/data/ProductField;)V", "getProductFieldsLoading", "setProductFieldsLoading", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.viewData.ProductDetailsLiveData */
/* loaded from: classes.dex */
public final class ProductDetailsLiveData implements MarketplaceProductViewData {
    private final boolean enableButton;
    private final Error error;
    private final boolean productDetailsLoading;
    private ProductField productFields;
    private boolean productFieldsLoading;

    public ProductDetailsLiveData() {
        this(false, null, false, null, false, 31, null);
    }

    public ProductDetailsLiveData(boolean z, ProductField productField, boolean z2, Error error, boolean z3) {
        this.productDetailsLoading = z;
        this.productFields = productField;
        this.productFieldsLoading = z2;
        this.error = error;
        this.enableButton = z3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProductDetailsLiveData(boolean r9, ai.kudi.agent.core.domain.data.ProductField r10, boolean r11, ai.kudi.agent.p036v2.common.view.viewData.data.Error r12, boolean r13, int r14, kotlin.p483e0.p485d.DBUtils$1 r15) {
        /*
            r8 = this;
            r6 = r14 & 1
            if (r6 == 0) goto L6
            r9 = 0
            goto L6
        L6:
            r6 = r14 & 2
            r7 = 0
            if (r6 == 0) goto Ld
            r10 = 0
            goto Ld
        Ld:
            r6 = r14 & 4
            if (r6 == 0) goto L13
            r11 = 0
            goto L13
        L13:
            r6 = r14 & 8
            if (r6 == 0) goto L18
            goto L19
        L18:
            r7 = r12
        L19:
            r14 = r14 & 16
            if (r14 == 0) goto L1f
            r13 = 0
            goto L1f
        L1f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.viewData.ProductDetailsLiveData.<init>(boolean, ai.kudi.agent.core.domain.data.ProductField, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ ProductDetailsLiveData copy$default(ProductDetailsLiveData productDetailsLiveData, boolean $z1, ProductField $r2, boolean $z0, Error $r0, boolean $z2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z1 = productDetailsLiveData.productDetailsLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = productDetailsLiveData.productFields;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z0 = productDetailsLiveData.productFieldsLoading;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r0 = productDetailsLiveData.error;
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $z2 = productDetailsLiveData.enableButton;
        }
        ProductDetailsLiveData $r1 = productDetailsLiveData.copy($z1, $r2, $z0, $r0, $z2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.productDetailsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductField component2() {
        ProductField r1 = this.productFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.productFieldsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component4() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.enableButton;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductDetailsLiveData copy(boolean z, ProductField productField, boolean z2, Error error, boolean z3) {
        ProductDetailsLiveData $r0 = new ProductDetailsLiveData(z, productField, z2, error, z3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof ProductDetailsLiveData;
        if ($z0) {
            ProductDetailsLiveData $r2 = (ProductDetailsLiveData) obj;
            boolean $z02 = this.productDetailsLoading;
            boolean $z1 = $r2.productDetailsLoading;
            if ($z02 != $z1) {
                return false;
            }
            ProductField $r3 = this.productFields;
            ProductField $r4 = $r2.productFields;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                boolean $z04 = this.productFieldsLoading;
                boolean $z12 = $r2.productFieldsLoading;
                if ($z04 != $z12) {
                    return false;
                }
                Error $r5 = this.error;
                Error $r6 = $r2.error;
                boolean $z05 = Log_OC.append($r5, $r6);
                if ($z05) {
                    boolean $z06 = this.enableButton;
                    boolean $z13 = $r2.enableButton;
                    return $z06 == $z13;
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
    public final boolean getEnableButton() {
        boolean z0 = this.enableButton;
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
    public final boolean getProductDetailsLoading() {
        boolean z0 = this.productDetailsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductField getProductFields() {
        ProductField r1 = this.productFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getProductFieldsLoading() {
        boolean z0 = this.productFieldsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.productDetailsLoading;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        ProductField $r1 = this.productFields;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        boolean $z02 = this.productFieldsLoading;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i22 = i;
        int $i03 = ($i02 + $i22) * 31;
        Error $r2 = this.error;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        int $i13 = ($i03 + $i12) * 31;
        boolean $z03 = this.enableButton;
        int $i04 = $z03 ? 1 : $z03 ? 1 : 0;
        return $i13 + $i04;
    }

    public final void setProductFields(ProductField productField) {
        this.productFields = productField;
    }

    public final void setProductFieldsLoading(boolean z) {
        this.productFieldsLoading = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ProductDetailsLiveData(productDetailsLoading=");
        boolean $z0 = this.productDetailsLoading;
        $r2.append($z0);
        $r2.append(", productFields=");
        ProductField $r3 = this.productFields;
        $r2.append($r3);
        $r2.append(", productFieldsLoading=");
        boolean $z02 = this.productFieldsLoading;
        $r2.append($z02);
        $r2.append(", error=");
        Error $r4 = this.error;
        $r2.append($r4);
        $r2.append(", enableButton=");
        boolean $z03 = this.enableButton;
        $r2.append($z03);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
