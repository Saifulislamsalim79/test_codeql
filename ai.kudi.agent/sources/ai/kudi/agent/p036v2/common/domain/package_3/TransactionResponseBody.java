package ai.kudi.agent.p036v2.common.domain.package_3;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TransactionResponseBody.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0019HÆ\u0003J\t\u0010E\u001a\u00020\u001bHÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0007HÆ\u0003Jí\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\t\u0010U\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006V"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/dto/TransactionResponseBody;", "", "id", "", TransactionField.AMOUNT, "Ljava/math/BigDecimal;", "agentId", "", "longitude", "", "latitude", "agentCommission", "revenue", "commission", "productCode", "paymentExtraField", "product", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "merchantId", "productName", "parentReference", "billingVendorReference", "paymentVendorReference", TransactionField.STATUS, "properties", "", "meta", "Lai/kudi/agent/v2/common/domain/dto/Meta;", "merchantNotificationStatus", "createdAt", "(ILjava/math/BigDecimal;Ljava/lang/String;DDLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/core/domain/data/MarketplaceProductModel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lai/kudi/agent/v2/common/domain/dto/Meta;Ljava/lang/String;Ljava/lang/String;)V", "getAgentCommission", "()Ljava/math/BigDecimal;", "getAgentId", "()Ljava/lang/String;", "getAmount", "getBillingVendorReference", "getCommission", "getCreatedAt", "getId", "()I", "getLatitude", "()D", "getLongitude", "getMerchantId", "getMerchantNotificationStatus", "getMeta", "()Lai/kudi/agent/v2/common/domain/dto/Meta;", "getParentReference", "getPaymentExtraField", "getPaymentVendorReference", "getProduct", "()Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "getProductCode", "getProductName", "getProperties", "()Ljava/util/Map;", "getRevenue", "getStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.package_3.TransactionResponseBody */
/* loaded from: classes.dex */
public final class TransactionResponseBody {
    private final BigDecimal agentCommission;
    private final String agentId;
    private final BigDecimal amount;
    private final String billingVendorReference;
    private final BigDecimal commission;
    private final String createdAt;
    private final int index;
    private final double latitude;
    private final double longitude;
    private final int merchantId;
    private final String merchantNotificationStatus;
    private final Meta meta;
    private final String parentReference;
    private final String paymentExtraField;
    private final String paymentVendorReference;
    private final MarketplaceProductModel product;
    private final String productCode;
    private final String productName;
    private final Map<String, Object> properties;
    private final BigDecimal revenue;
    private final String status;

    public TransactionResponseBody(int i, BigDecimal bigDecimal, String str, double d, double d2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, String str3, MarketplaceProductModel marketplaceProductModel, int i2, String str4, String str5, String str6, String str7, String str8, Map map, Meta meta, String str9, String str10) {
        Log_OC.getArray(bigDecimal, TransactionField.AMOUNT);
        Log_OC.getArray(str, "agentId");
        Log_OC.getArray(bigDecimal2, "agentCommission");
        Log_OC.getArray(bigDecimal3, "revenue");
        Log_OC.getArray(bigDecimal4, "commission");
        Log_OC.getArray(str2, "productCode");
        Log_OC.getArray(marketplaceProductModel, "product");
        Log_OC.getArray(str4, "productName");
        Log_OC.getArray(str5, "parentReference");
        Log_OC.getArray(str8, TransactionField.STATUS);
        Log_OC.getArray(map, "properties");
        Log_OC.getArray(meta, "meta");
        Log_OC.getArray(str9, "merchantNotificationStatus");
        Log_OC.getArray(str10, "createdAt");
        this.index = i;
        this.amount = bigDecimal;
        this.agentId = str;
        this.longitude = d;
        this.latitude = d2;
        this.agentCommission = bigDecimal2;
        this.revenue = bigDecimal3;
        this.commission = bigDecimal4;
        this.productCode = str2;
        this.paymentExtraField = str3;
        this.product = marketplaceProductModel;
        this.merchantId = i2;
        this.productName = str4;
        this.parentReference = str5;
        this.billingVendorReference = str6;
        this.paymentVendorReference = str7;
        this.status = str8;
        this.properties = map;
        this.meta = meta;
        this.merchantNotificationStatus = str9;
        this.createdAt = str10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TransactionResponseBody(int r4, java.math.BigDecimal r5, java.lang.String r6, double r7, double r9, java.math.BigDecimal r11, java.math.BigDecimal r12, java.math.BigDecimal r13, java.lang.String r14, java.lang.String r15, ai.kudi.agent.core.domain.data.MarketplaceProductModel r16, int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.Map r23, ai.kudi.agent.p036v2.common.domain.package_3.Meta r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.p483e0.p485d.DBUtils$1 r28) {
        /*
            r3 = this;
            r0 = r27
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r27 = r0
            if (r1 == 0) goto Lb
            r20 = 0
            goto Lb
        Lb:
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r27
            r0 = r0 & r2
            r27 = r0
            if (r27 == 0) goto L18
            r21 = 0
            goto L18
        L18:
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.domain.package_3.TransactionResponseBody.<init>(int, java.math.BigDecimal, java.lang.String, double, double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, ai.kudi.agent.core.domain.data.MarketplaceProductModel, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, ai.kudi.agent.v2.common.domain.package_3.Meta, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ TransactionResponseBody copy$default(TransactionResponseBody transactionResponseBody, int $i1, BigDecimal $r2, String $r3, double $d0, double $d1, BigDecimal $r4, BigDecimal $r5, BigDecimal $r6, String $r7, String $r8, MarketplaceProductModel $r9, int $i2, String $r10, String $r11, String $r12, String $r13, String $r14, Map $r15, Meta $r16, String $r17, String $r18, int $i3, Object obj) {
        if (($i3 & 1) != 0) {
            $i1 = transactionResponseBody.index;
        }
        if (($i3 & 2) != 0) {
            $r2 = transactionResponseBody.amount;
        }
        if (($i3 & 4) != 0) {
            $r3 = transactionResponseBody.agentId;
        }
        if (($i3 & 8) != 0) {
            $d0 = transactionResponseBody.longitude;
        }
        if (($i3 & 16) != 0) {
            $d1 = transactionResponseBody.latitude;
        }
        if (($i3 & 32) != 0) {
            $r4 = transactionResponseBody.agentCommission;
        }
        if (($i3 & 64) != 0) {
            $r5 = transactionResponseBody.revenue;
        }
        if (($i3 & 128) != 0) {
            $r6 = transactionResponseBody.commission;
        }
        if (($i3 & 256) != 0) {
            $r7 = transactionResponseBody.productCode;
        }
        if (($i3 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $r8 = transactionResponseBody.paymentExtraField;
        }
        if (($i3 & 1024) != 0) {
            MarketplaceProductModel $r92 = transactionResponseBody.product;
            $r9 = $r92;
        }
        if (($i3 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $i2 = transactionResponseBody.merchantId;
        }
        if (($i3 & 4096) != 0) {
            String $r102 = transactionResponseBody.productName;
            $r10 = $r102;
        }
        if (($i3 & 8192) != 0) {
            String $r112 = transactionResponseBody.parentReference;
            $r11 = $r112;
        }
        if (($i3 & 16384) != 0) {
            String $r122 = transactionResponseBody.billingVendorReference;
            $r12 = $r122;
        }
        if (($i3 & 32768) != 0) {
            String $r132 = transactionResponseBody.paymentVendorReference;
            $r13 = $r132;
        }
        if (($i3 & 65536) != 0) {
            String $r142 = transactionResponseBody.status;
            $r14 = $r142;
        }
        if (($i3 & 131072) != 0) {
            $r15 = transactionResponseBody.properties;
        }
        if (($i3 & 262144) != 0) {
            Meta $r162 = transactionResponseBody.meta;
            $r16 = $r162;
        }
        if (($i3 & 524288) != 0) {
            String $r172 = transactionResponseBody.merchantNotificationStatus;
            $r17 = $r172;
        }
        int $i0 = $i3 & 1048576;
        if ($i0 != 0) {
            String $r182 = transactionResponseBody.createdAt;
            $r18 = $r182;
        }
        TransactionResponseBody $r0 = transactionResponseBody.copy($i1, $r2, $r3, $d0, $d1, $r4, $r5, $r6, $r7, $r8, $r9, $i2, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component1() {
        int i0 = this.index;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.paymentExtraField;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceProductModel component11() {
        MarketplaceProductModel r1 = this.product;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component12() {
        int i0 = this.merchantId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component13() {
        String r1 = this.productName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component14() {
        String r1 = this.parentReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component15() {
        String r1 = this.billingVendorReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component16() {
        String r1 = this.paymentVendorReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component17() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map component18() {
        Map r1 = this.properties;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Meta component19() {
        Meta r1 = this.meta;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal component2() {
        BigDecimal r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component20() {
        String r1 = this.merchantNotificationStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component21() {
        String r1 = this.createdAt;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.agentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component4() {
        double d0 = this.longitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component5() {
        double d0 = this.latitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal component6() {
        BigDecimal r1 = this.agentCommission;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal component7() {
        BigDecimal r1 = this.revenue;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal component8() {
        BigDecimal r1 = this.commission;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.productCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionResponseBody copy(int i, BigDecimal bigDecimal, String str, double d, double d2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, String str3, MarketplaceProductModel marketplaceProductModel, int i2, String str4, String str5, String str6, String str7, String str8, Map map, Meta meta, String str9, String str10) {
        Log_OC.getArray(bigDecimal, TransactionField.AMOUNT);
        Log_OC.getArray(str, "agentId");
        Log_OC.getArray(bigDecimal2, "agentCommission");
        Log_OC.getArray(bigDecimal3, "revenue");
        Log_OC.getArray(bigDecimal4, "commission");
        Log_OC.getArray(str2, "productCode");
        Log_OC.getArray(marketplaceProductModel, "product");
        Log_OC.getArray(str4, "productName");
        Log_OC.getArray(str5, "parentReference");
        Log_OC.getArray(str8, TransactionField.STATUS);
        Log_OC.getArray(map, "properties");
        Log_OC.getArray(meta, "meta");
        Log_OC.getArray(str9, "merchantNotificationStatus");
        Log_OC.getArray(str10, "createdAt");
        TransactionResponseBody $r0 = new TransactionResponseBody(i, bigDecimal, str, d, d2, bigDecimal2, bigDecimal3, bigDecimal4, str2, str3, marketplaceProductModel, i2, str4, str5, str6, str7, str8, map, meta, str9, str10);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof TransactionResponseBody;
        if ($z0) {
            TransactionResponseBody $r2 = (TransactionResponseBody) obj;
            int $i0 = this.index;
            int $i1 = $r2.index;
            if ($i0 != $i1) {
                return false;
            }
            BigDecimal $r3 = this.amount;
            BigDecimal $r4 = $r2.amount;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r5 = this.agentId;
                String $r6 = $r2.agentId;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    double $d0 = this.longitude;
                    Double $r7 = Double.valueOf($d0);
                    double $d02 = $r2.longitude;
                    Double $r8 = Double.valueOf($d02);
                    boolean $z04 = Log_OC.append($r7, $r8);
                    if ($z04) {
                        double $d03 = this.latitude;
                        Double $r72 = Double.valueOf($d03);
                        double $d04 = $r2.latitude;
                        Double $r82 = Double.valueOf($d04);
                        boolean $z05 = Log_OC.append($r72, $r82);
                        if ($z05) {
                            BigDecimal $r32 = this.agentCommission;
                            BigDecimal $r42 = $r2.agentCommission;
                            boolean $z06 = Log_OC.append($r32, $r42);
                            if ($z06) {
                                BigDecimal $r33 = this.revenue;
                                BigDecimal $r43 = $r2.revenue;
                                boolean $z07 = Log_OC.append($r33, $r43);
                                if ($z07) {
                                    BigDecimal $r34 = this.commission;
                                    BigDecimal $r44 = $r2.commission;
                                    boolean $z08 = Log_OC.append($r34, $r44);
                                    if ($z08) {
                                        String $r52 = this.productCode;
                                        String $r62 = $r2.productCode;
                                        boolean $z09 = Log_OC.append($r52, $r62);
                                        if ($z09) {
                                            String $r53 = this.paymentExtraField;
                                            String $r63 = $r2.paymentExtraField;
                                            boolean $z010 = Log_OC.append($r53, $r63);
                                            if ($z010) {
                                                MarketplaceProductModel $r9 = this.product;
                                                MarketplaceProductModel $r92 = $r2.product;
                                                boolean $z011 = Log_OC.append($r9, $r92);
                                                if ($z011) {
                                                    int $i02 = this.merchantId;
                                                    int $i12 = $r2.merchantId;
                                                    if ($i02 != $i12) {
                                                        return false;
                                                    }
                                                    String $r54 = this.productName;
                                                    String $r64 = $r2.productName;
                                                    boolean $z012 = Log_OC.append($r54, $r64);
                                                    if ($z012) {
                                                        String $r55 = this.parentReference;
                                                        String $r65 = $r2.parentReference;
                                                        boolean $z013 = Log_OC.append($r55, $r65);
                                                        if ($z013) {
                                                            String $r56 = this.billingVendorReference;
                                                            String $r66 = $r2.billingVendorReference;
                                                            boolean $z014 = Log_OC.append($r56, $r66);
                                                            if ($z014) {
                                                                String $r57 = this.paymentVendorReference;
                                                                String $r67 = $r2.paymentVendorReference;
                                                                boolean $z015 = Log_OC.append($r57, $r67);
                                                                if ($z015) {
                                                                    String $r58 = this.status;
                                                                    String $r68 = $r2.status;
                                                                    boolean $z016 = Log_OC.append($r58, $r68);
                                                                    if ($z016) {
                                                                        Map $r11 = this.properties;
                                                                        Map $r112 = $r2.properties;
                                                                        boolean $z017 = Log_OC.append($r11, $r112);
                                                                        if ($z017) {
                                                                            Meta $r13 = this.meta;
                                                                            Meta $r132 = $r2.meta;
                                                                            boolean $z018 = Log_OC.append($r13, $r132);
                                                                            if ($z018) {
                                                                                String $r59 = this.merchantNotificationStatus;
                                                                                String $r69 = $r2.merchantNotificationStatus;
                                                                                boolean $z019 = Log_OC.append($r59, $r69);
                                                                                if ($z019) {
                                                                                    String $r510 = this.createdAt;
                                                                                    String $r610 = $r2.createdAt;
                                                                                    boolean $z020 = Log_OC.append($r510, $r610);
                                                                                    return $z020;
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
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal getAgentCommission() {
        BigDecimal r1 = this.agentCommission;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentId() {
        String r1 = this.agentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal getAmount() {
        BigDecimal r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBillingVendorReference() {
        String r1 = this.billingVendorReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal getCommission() {
        BigDecimal r1 = this.commission;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCreatedAt() {
        String r1 = this.createdAt;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getId() {
        int i0 = this.index;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getLatitude() {
        double d0 = this.latitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getLongitude() {
        double d0 = this.longitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getMerchantId() {
        int i0 = this.merchantId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getMerchantNotificationStatus() {
        String r1 = this.merchantNotificationStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Meta getMeta() {
        Meta r1 = this.meta;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getParentReference() {
        String r1 = this.parentReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPaymentExtraField() {
        String r1 = this.paymentExtraField;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPaymentVendorReference() {
        String r1 = this.paymentVendorReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceProductModel getProduct() {
        MarketplaceProductModel r1 = this.product;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProductCode() {
        String r1 = this.productCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProductName() {
        String r1 = this.productName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getProperties() {
        Map r1 = this.properties;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BigDecimal getRevenue() {
        BigDecimal r1 = this.revenue;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatus() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        int $i0 = this.index;
        BigDecimal $r1 = this.amount;
        int $i1 = $r1.hashCode();
        String $r2 = this.agentId;
        int $i12 = $r2.hashCode();
        double $d0 = this.longitude;
        int $i13 = Tags.append($d0);
        double $d02 = this.latitude;
        int $i14 = Tags.append($d02);
        BigDecimal $r12 = this.agentCommission;
        int $i15 = $r12.hashCode();
        BigDecimal $r13 = this.revenue;
        int $i16 = $r13.hashCode();
        BigDecimal $r14 = this.commission;
        int $i17 = $r14.hashCode();
        String $r22 = this.productCode;
        int $i18 = $r22.hashCode();
        int $i19 = (((((((((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31) + $i16) * 31) + $i17) * 31) + $i18) * 31;
        String $r23 = this.paymentExtraField;
        int $i2 = $r23 == null ? 0 : $r23.hashCode();
        MarketplaceProductModel $r3 = this.product;
        int $i22 = $r3.hashCode();
        int $i23 = this.merchantId;
        String $r24 = this.productName;
        int $i24 = $r24.hashCode();
        String $r25 = this.parentReference;
        int $i25 = $r25.hashCode();
        int $i110 = ((((((((($i19 + $i2) * 31) + $i22) * 31) + $i23) * 31) + $i24) * 31) + $i25) * 31;
        String $r26 = this.billingVendorReference;
        int $i26 = $r26 == null ? 0 : $r26.hashCode();
        int $i111 = ($i110 + $i26) * 31;
        String $r27 = this.paymentVendorReference;
        int $i02 = $r27 != null ? $r27.hashCode() : 0;
        String $r28 = this.status;
        int $i112 = $r28.hashCode();
        Map $r4 = this.properties;
        int $i113 = $r4.hashCode();
        Meta $r5 = this.meta;
        int $i114 = $r5.hashCode();
        String $r29 = this.merchantNotificationStatus;
        int $i115 = $r29.hashCode();
        String $r210 = this.createdAt;
        int $i116 = $r210.hashCode();
        return (((((((((($i111 + $i02) * 31) + $i112) * 31) + $i113) * 31) + $i114) * 31) + $i115) * 31) + $i116;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("TransactionResponseBody(id=");
        int $i0 = this.index;
        $r2.append($i0);
        $r2.append(", amount=");
        BigDecimal $r3 = this.amount;
        $r2.append($r3);
        $r2.append(", agentId=");
        String $r1 = this.agentId;
        $r2.append($r1);
        $r2.append(", longitude=");
        double $d0 = this.longitude;
        $r2.append($d0);
        $r2.append(", latitude=");
        double $d02 = this.latitude;
        $r2.append($d02);
        $r2.append(", agentCommission=");
        BigDecimal $r32 = this.agentCommission;
        $r2.append($r32);
        $r2.append(", revenue=");
        BigDecimal $r33 = this.revenue;
        $r2.append($r33);
        $r2.append(", commission=");
        BigDecimal $r34 = this.commission;
        $r2.append($r34);
        $r2.append(", productCode=");
        String $r12 = this.productCode;
        $r2.append($r12);
        $r2.append(", paymentExtraField=");
        String $r13 = this.paymentExtraField;
        $r2.append((Object) $r13);
        $r2.append(", product=");
        MarketplaceProductModel $r4 = this.product;
        $r2.append($r4);
        $r2.append(", merchantId=");
        int $i02 = this.merchantId;
        $r2.append($i02);
        $r2.append(", productName=");
        String $r14 = this.productName;
        $r2.append($r14);
        $r2.append(", parentReference=");
        String $r15 = this.parentReference;
        $r2.append($r15);
        $r2.append(", billingVendorReference=");
        String $r16 = this.billingVendorReference;
        $r2.append((Object) $r16);
        $r2.append(", paymentVendorReference=");
        String $r17 = this.paymentVendorReference;
        $r2.append((Object) $r17);
        $r2.append(", status=");
        String $r18 = this.status;
        $r2.append($r18);
        $r2.append(", properties=");
        Map $r5 = this.properties;
        $r2.append($r5);
        $r2.append(", meta=");
        Meta $r6 = this.meta;
        $r2.append($r6);
        $r2.append(", merchantNotificationStatus=");
        String $r19 = this.merchantNotificationStatus;
        $r2.append($r19);
        $r2.append(", createdAt=");
        String $r110 = this.createdAt;
        $r2.append($r110);
        $r2.append(')');
        String $r111 = $r2.toString();
        return $r111;
    }
}
