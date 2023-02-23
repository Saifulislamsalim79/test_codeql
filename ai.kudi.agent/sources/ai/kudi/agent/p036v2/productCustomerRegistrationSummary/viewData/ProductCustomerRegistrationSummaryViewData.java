package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData;

import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceProductViewData;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ProductCustomerRegistrationSummaryViewData.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0092\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00062"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewData/ProductCustomerRegistrationSummaryViewData;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceProductViewData;", "loading", "", "firstDependentDetailsLoading", "marketplaceSummary", "", "", "marketplace1stDependentSummary", "requireVerification", "verificationSuccessful", "registrationError", "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "verifyingCustomer", "verificationError", "registrationLoading", "(ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/kudi/agent/v2/common/view/viewData/data/Error;ZLai/kudi/agent/v2/common/view/viewData/data/Error;Z)V", "getFirstDependentDetailsLoading", "()Z", "getLoading", "getMarketplace1stDependentSummary", "()Ljava/util/Map;", "getMarketplaceSummary", "getRegistrationError", "()Lai/kudi/agent/v2/common/view/viewData/data/Error;", "getRegistrationLoading", "getRequireVerification", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVerificationError", "getVerificationSuccessful", "getVerifyingCustomer", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/kudi/agent/v2/common/view/viewData/data/Error;ZLai/kudi/agent/v2/common/view/viewData/data/Error;Z)Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewData/ProductCustomerRegistrationSummaryViewData;", "equals", "other", "", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData */
/* loaded from: classes.dex */
public final class ProductCustomerRegistrationSummaryViewData implements MarketplaceProductViewData {
    private final boolean firstDependentDetailsLoading;
    private final boolean loading;
    private final Map<String, String> marketplace1stDependentSummary;
    private final Map<String, String> marketplaceSummary;
    private final Error registrationError;
    private final boolean registrationLoading;
    private final Boolean requireVerification;
    private final Error verificationError;
    private final Boolean verificationSuccessful;
    private final boolean verifyingCustomer;

    public ProductCustomerRegistrationSummaryViewData() {
        this(false, false, null, null, null, null, null, false, null, false, 1023, null);
    }

    public ProductCustomerRegistrationSummaryViewData(boolean z, boolean z2, Map map, Map map2, Boolean bool, Boolean bool2, Error error, boolean z3, Error error2, boolean z4) {
        Log_OC.getArray(map, "marketplaceSummary");
        Log_OC.getArray(map2, "marketplace1stDependentSummary");
        this.loading = z;
        this.firstDependentDetailsLoading = z2;
        this.marketplaceSummary = map;
        this.marketplace1stDependentSummary = map2;
        this.requireVerification = bool;
        this.verificationSuccessful = bool2;
        this.registrationError = error;
        this.verifyingCustomer = z3;
        this.verificationError = error2;
        this.registrationLoading = z4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProductCustomerRegistrationSummaryViewData(boolean r20, boolean r21, java.util.Map r22, java.util.Map r23, java.lang.Boolean r24, java.lang.Boolean r25, ai.kudi.agent.p036v2.common.view.viewData.data.Error r26, boolean r27, ai.kudi.agent.p036v2.common.view.viewData.data.Error r28, boolean r29, int r30, kotlin.p483e0.p485d.DBUtils$1 r31) {
        /*
            r19 = this;
            r11 = r30 & 1
            r12 = 0
            if (r11 == 0) goto L8
            r20 = 0
            goto L8
        L8:
            r11 = r30 & 2
            if (r11 == 0) goto Lf
            r21 = 0
            goto Lf
        Lf:
            r11 = r30 & 4
            if (r11 == 0) goto L1b
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r14 = r13
            r13.<init>()
            goto L1d
        L1b:
            r14 = r22
        L1d:
            r11 = r30 & 8
            if (r11 == 0) goto L29
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r15 = r13
            r13.<init>()
            goto L2b
        L29:
            r15 = r23
        L2b:
            r11 = r30 & 16
            r16 = 0
            if (r11 == 0) goto L34
            r24 = 0
            goto L34
        L34:
            r11 = r30 & 32
            if (r11 == 0) goto L3b
            r25 = 0
            goto L3b
        L3b:
            r11 = r30 & 64
            if (r11 == 0) goto L42
            r26 = 0
            goto L42
        L42:
            r0 = r30
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L4b
            r27 = 0
            goto L4b
        L4b:
            r0 = r30
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L52
            goto L54
        L52:
            r16 = r28
        L54:
            r0 = r30
            r0 = r0 & 512(0x200, float:7.175E-43)
            r30 = r0
            if (r30 == 0) goto L5d
            goto L5f
        L5d:
            r12 = r29
        L5f:
            r17 = r14
            java.util.Map r17 = (java.util.Map) r17
            r22 = r17
            r18 = r15
            java.util.Map r18 = (java.util.Map) r18
            r23 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r16
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData.<init>(boolean, boolean, java.util.Map, java.util.Map, java.lang.Boolean, java.lang.Boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ ProductCustomerRegistrationSummaryViewData copy$default(ProductCustomerRegistrationSummaryViewData productCustomerRegistrationSummaryViewData, boolean $z0, boolean $z1, Map $r2, Map $r3, Boolean $r4, Boolean $r5, Error $r6, boolean $z2, Error $r7, boolean $z3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = productCustomerRegistrationSummaryViewData.loading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z1 = productCustomerRegistrationSummaryViewData.firstDependentDetailsLoading;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r2 = productCustomerRegistrationSummaryViewData.marketplaceSummary;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r3 = productCustomerRegistrationSummaryViewData.marketplace1stDependentSummary;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r4 = productCustomerRegistrationSummaryViewData.requireVerification;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r5 = productCustomerRegistrationSummaryViewData.verificationSuccessful;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r6 = productCustomerRegistrationSummaryViewData.registrationError;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $z2 = productCustomerRegistrationSummaryViewData.verifyingCustomer;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $r7 = productCustomerRegistrationSummaryViewData.verificationError;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i0 != 0) {
            $z3 = productCustomerRegistrationSummaryViewData.registrationLoading;
        }
        ProductCustomerRegistrationSummaryViewData $r0 = productCustomerRegistrationSummaryViewData.copy($z0, $z1, $r2, $r3, $r4, $r5, $r6, $z2, $r7, $z3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component1() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component10() {
        boolean z0 = this.registrationLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component2() {
        boolean z0 = this.firstDependentDetailsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Map component3() {
        Map r1 = this.marketplaceSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Map component4() {
        Map r1 = this.marketplace1stDependentSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean component5() {
        Boolean r1 = this.requireVerification;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean component6() {
        Boolean r1 = this.verificationSuccessful;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Error component7() {
        Error r1 = this.registrationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component8() {
        boolean z0 = this.verifyingCustomer;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Error component9() {
        Error r1 = this.verificationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final ProductCustomerRegistrationSummaryViewData copy(boolean z, boolean z2, Map map, Map map2, Boolean bool, Boolean bool2, Error error, boolean z3, Error error2, boolean z4) {
        Log_OC.getArray(map, "marketplaceSummary");
        Log_OC.getArray(map2, "marketplace1stDependentSummary");
        ProductCustomerRegistrationSummaryViewData $r0 = new ProductCustomerRegistrationSummaryViewData(z, z2, map, map2, bool, bool2, error, z3, error2, z4);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof ProductCustomerRegistrationSummaryViewData;
        if ($z0) {
            ProductCustomerRegistrationSummaryViewData $r2 = (ProductCustomerRegistrationSummaryViewData) obj;
            boolean $z02 = this.loading;
            boolean $z1 = $r2.loading;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.firstDependentDetailsLoading;
            boolean $z12 = $r2.firstDependentDetailsLoading;
            if ($z03 != $z12) {
                return false;
            }
            Map $r3 = this.marketplaceSummary;
            Map $r4 = $r2.marketplaceSummary;
            boolean $z04 = Log_OC.append($r3, $r4);
            if ($z04) {
                Map $r32 = this.marketplace1stDependentSummary;
                Map $r42 = $r2.marketplace1stDependentSummary;
                boolean $z05 = Log_OC.append($r32, $r42);
                if ($z05) {
                    Boolean $r5 = this.requireVerification;
                    Boolean $r6 = $r2.requireVerification;
                    boolean $z06 = Log_OC.append($r5, $r6);
                    if ($z06) {
                        Boolean $r52 = this.verificationSuccessful;
                        Boolean $r62 = $r2.verificationSuccessful;
                        boolean $z07 = Log_OC.append($r52, $r62);
                        if ($z07) {
                            Error $r7 = this.registrationError;
                            Error $r8 = $r2.registrationError;
                            boolean $z08 = Log_OC.append($r7, $r8);
                            if ($z08) {
                                boolean $z09 = this.verifyingCustomer;
                                boolean $z13 = $r2.verifyingCustomer;
                                if ($z09 != $z13) {
                                    return false;
                                }
                                Error $r72 = this.verificationError;
                                Error $r82 = $r2.verificationError;
                                boolean $z010 = Log_OC.append($r72, $r82);
                                if ($z010) {
                                    boolean $z011 = this.registrationLoading;
                                    boolean $z14 = $r2.registrationLoading;
                                    return $z011 == $z14;
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
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean getFirstDependentDetailsLoading() {
        boolean z0 = this.firstDependentDetailsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean getLoading() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Map getMarketplace1stDependentSummary() {
        Map r1 = this.marketplace1stDependentSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Map getMarketplaceSummary() {
        Map r1 = this.marketplaceSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Error getRegistrationError() {
        Error r1 = this.registrationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean getRegistrationLoading() {
        boolean z0 = this.registrationLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean getRequireVerification() {
        Boolean r1 = this.requireVerification;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Error getVerificationError() {
        Error r1 = this.verificationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean getVerificationSuccessful() {
        Boolean r1 = this.verificationSuccessful;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean getVerifyingCustomer() {
        boolean z0 = this.verifyingCustomer;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.loading;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.firstDependentDetailsLoading;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        Map $r1 = this.marketplaceSummary;
        int $i12 = $r1.hashCode();
        Map $r12 = this.marketplace1stDependentSummary;
        int $i13 = $r12.hashCode();
        int $i14 = ((((($i02 + $i1) * 31) + $i12) * 31) + $i13) * 31;
        Boolean $r2 = this.requireVerification;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i15 = ($i14 + $i2) * 31;
        Boolean $r22 = this.verificationSuccessful;
        int $i22 = $r22 == null ? 0 : $r22.hashCode();
        int $i16 = ($i15 + $i22) * 31;
        Error $r3 = this.registrationError;
        int $i23 = $r3 == null ? 0 : $r3.hashCode();
        int $i17 = ($i16 + $i23) * 31;
        boolean $z03 = this.verifyingCustomer;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i24 = i2;
        int $i18 = ($i17 + $i24) * 31;
        Error $r32 = this.verificationError;
        int $i03 = $r32 != null ? $r32.hashCode() : 0;
        int $i04 = ($i18 + $i03) * 31;
        boolean $z04 = this.registrationLoading;
        int $i19 = $z04 ? 1 : $z04 ? 1 : 0;
        return $i04 + $i19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ProductCustomerRegistrationSummaryViewData(loading=");
        boolean $z0 = this.loading;
        $r2.append($z0);
        $r2.append(", firstDependentDetailsLoading=");
        boolean $z02 = this.firstDependentDetailsLoading;
        $r2.append($z02);
        $r2.append(", marketplaceSummary=");
        Map $r3 = this.marketplaceSummary;
        $r2.append($r3);
        $r2.append(", marketplace1stDependentSummary=");
        Map $r32 = this.marketplace1stDependentSummary;
        $r2.append($r32);
        $r2.append(", requireVerification=");
        Boolean $r4 = this.requireVerification;
        $r2.append($r4);
        $r2.append(", verificationSuccessful=");
        Boolean $r42 = this.verificationSuccessful;
        $r2.append($r42);
        $r2.append(", registrationError=");
        Error $r5 = this.registrationError;
        $r2.append($r5);
        $r2.append(", verifyingCustomer=");
        boolean $z03 = this.verifyingCustomer;
        $r2.append($z03);
        $r2.append(", verificationError=");
        Error $r52 = this.verificationError;
        $r2.append($r52);
        $r2.append(", registrationLoading=");
        boolean $z04 = this.registrationLoading;
        $r2.append($z04);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
