package ai.kudi.agent.p036v2.productCustomerRegistration.viewData;

import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceLookupViewData;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.dip.library.bottomSheets.models.Field;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: MarketplaceCustomerRegistrationViewData.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J£\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00105\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001d¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistration/viewData/MarketplaceCustomerRegistrationViewData;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceLookupViewData;", "productField", "Lai/kudi/agent/core/domain/data/ProductField;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "loading", "", "fetchingLocation", "location", "", "Lai/kudi/agent/register/data/models/LocationModel;", "locationError", "uploadingFile", "fileUploadError", "filePropertyMap", "", "", "associatedFields", "Lai/kudi/dip/library/bottomSheets/models/Field;", "fetchingAssociatedFields", "associatedFieldsError", "(Lai/kudi/agent/core/domain/data/ProductField;Lai/kudi/agent/v2/common/view/viewData/data/Error;ZZLjava/util/List;Lai/kudi/agent/v2/common/view/viewData/data/Error;ZLai/kudi/agent/v2/common/view/viewData/data/Error;Ljava/util/Map;Ljava/util/List;ZLai/kudi/agent/v2/common/view/viewData/data/Error;)V", "getAssociatedFields", "()Ljava/util/List;", "getAssociatedFieldsError", "()Lai/kudi/agent/v2/common/view/viewData/data/Error;", "getError", "getFetchingAssociatedFields", "()Z", "getFetchingLocation", "getFilePropertyMap", "()Ljava/util/Map;", "getFileUploadError", "getLoading", "getLocation", "getLocationError", "getProductField", "()Lai/kudi/agent/core/domain/data/ProductField;", "getUploadingFile", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistration.viewData.MarketplaceCustomerRegistrationViewData */
/* loaded from: classes.dex */
public final class MarketplaceCustomerRegistrationViewData implements MarketplaceLookupViewData {
    private final List<Field> associatedFields;
    private final Error associatedFieldsError;
    private final Error error;
    private final boolean fetchingAssociatedFields;
    private final boolean fetchingLocation;
    private final Map<String, String> filePropertyMap;
    private final Error fileUploadError;
    private final boolean loading;
    private final List<LocationModel> location;
    private final Error locationError;
    private final ProductField productField;
    private final boolean uploadingFile;

    public MarketplaceCustomerRegistrationViewData() {
        this(null, null, false, false, null, null, false, null, null, null, false, null, 4095, null);
    }

    public MarketplaceCustomerRegistrationViewData(ProductField productField, Error error, boolean z, boolean z2, List list, Error error2, boolean z3, Error error3, Map map, List list2, boolean z4, Error error4) {
        Log_OC.getArray(list, "location");
        Log_OC.getArray(map, "filePropertyMap");
        Log_OC.getArray(list2, "associatedFields");
        this.productField = productField;
        this.error = error;
        this.loading = z;
        this.fetchingLocation = z2;
        this.location = list;
        this.locationError = error2;
        this.uploadingFile = z3;
        this.fileUploadError = error3;
        this.filePropertyMap = map;
        this.associatedFields = list2;
        this.fetchingAssociatedFields = z4;
        this.associatedFieldsError = error4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MarketplaceCustomerRegistrationViewData(ai.kudi.agent.core.domain.data.ProductField r25, ai.kudi.agent.p036v2.common.view.viewData.data.Error r26, boolean r27, boolean r28, java.util.List r29, ai.kudi.agent.p036v2.common.view.viewData.data.Error r30, boolean r31, ai.kudi.agent.p036v2.common.view.viewData.data.Error r32, java.util.Map r33, java.util.List r34, boolean r35, ai.kudi.agent.p036v2.common.view.viewData.data.Error r36, int r37, kotlin.p483e0.p485d.DBUtils$1 r38) {
        /*
            r24 = this;
            r13 = r37 & 1
            r14 = 0
            if (r13 == 0) goto L8
            r25 = 0
            goto L8
        L8:
            r13 = r37 & 2
            if (r13 == 0) goto Lf
            r26 = 0
            goto Lf
        Lf:
            r13 = r37 & 4
            r15 = 0
            if (r13 == 0) goto L17
            r27 = 0
            goto L17
        L17:
            r13 = r37 & 8
            if (r13 == 0) goto L1e
            r28 = 0
            goto L1e
        L1e:
            r13 = r37 & 16
            if (r13 == 0) goto L2c
            java.util.ArrayList r16 = new java.util.ArrayList
            r17 = r16
            r0 = r16
            r0.<init>()
            goto L2e
        L2c:
            r17 = r29
        L2e:
            r13 = r37 & 32
            if (r13 == 0) goto L35
            r30 = 0
            goto L35
        L35:
            r13 = r37 & 64
            if (r13 == 0) goto L3c
            r31 = 0
            goto L3c
        L3c:
            r0 = r37
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L45
            r32 = 0
            goto L45
        L45:
            r0 = r37
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L55
            java.util.LinkedHashMap r18 = new java.util.LinkedHashMap
            r19 = r18
            r0 = r18
            r0.<init>()
            goto L57
        L55:
            r19 = r33
        L57:
            r0 = r37
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L67
            java.util.ArrayList r16 = new java.util.ArrayList
            r20 = r16
            r0 = r16
            r0.<init>()
            goto L69
        L67:
            r20 = r34
        L69:
            r0 = r37
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L70
            goto L72
        L70:
            r15 = r35
        L72:
            r0 = r37
            r0 = r0 & 2048(0x800, float:2.87E-42)
            r37 = r0
            if (r37 == 0) goto L7b
            goto L7d
        L7b:
            r14 = r36
        L7d:
            r21 = r17
            java.util.List r21 = (java.util.List) r21
            r29 = r21
            r22 = r19
            java.util.Map r22 = (java.util.Map) r22
            r33 = r22
            r23 = r20
            java.util.List r23 = (java.util.List) r23
            r34 = r23
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r15
            r12 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productCustomerRegistration.viewData.MarketplaceCustomerRegistrationViewData.<init>(ai.kudi.agent.core.domain.data.ProductField, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, boolean, java.util.List, ai.kudi.agent.v2.common.view.viewData.data.Error, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, java.util.Map, java.util.List, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ MarketplaceCustomerRegistrationViewData copy$default(MarketplaceCustomerRegistrationViewData marketplaceCustomerRegistrationViewData, ProductField $r2, Error $r3, boolean $z0, boolean $z1, List $r4, Error $r5, boolean $z2, Error $r6, Map $r7, List $r8, boolean $z3, Error $r9, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = marketplaceCustomerRegistrationViewData.productField;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = marketplaceCustomerRegistrationViewData.error;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z0 = marketplaceCustomerRegistrationViewData.loading;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $z1 = marketplaceCustomerRegistrationViewData.fetchingLocation;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r4 = marketplaceCustomerRegistrationViewData.location;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r5 = marketplaceCustomerRegistrationViewData.locationError;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z2 = marketplaceCustomerRegistrationViewData.uploadingFile;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r6 = marketplaceCustomerRegistrationViewData.fileUploadError;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $r7 = marketplaceCustomerRegistrationViewData.filePropertyMap;
        }
        int $i110 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i110 != 0) {
            $r8 = marketplaceCustomerRegistrationViewData.associatedFields;
        }
        int $i111 = i & 1024;
        if ($i111 != 0) {
            $z3 = marketplaceCustomerRegistrationViewData.fetchingAssociatedFields;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_INTRA;
        if ($i0 != 0) {
            $r9 = marketplaceCustomerRegistrationViewData.associatedFieldsError;
        }
        MarketplaceCustomerRegistrationViewData $r0 = marketplaceCustomerRegistrationViewData.copy($r2, $r3, $z0, $z1, $r4, $r5, $z2, $r6, $r7, $r8, $z3, $r9);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductField component1() {
        ProductField r1 = this.productField;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component10() {
        List r1 = this.associatedFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component11() {
        boolean z0 = this.fetchingAssociatedFields;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component12() {
        Error r1 = this.associatedFieldsError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component2() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component4() {
        boolean z0 = this.fetchingLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component5() {
        List r1 = this.location;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component6() {
        Error r1 = this.locationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component7() {
        boolean z0 = this.uploadingFile;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component8() {
        Error r1 = this.fileUploadError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map component9() {
        Map r1 = this.filePropertyMap;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceCustomerRegistrationViewData copy(ProductField productField, Error error, boolean z, boolean z2, List list, Error error2, boolean z3, Error error3, Map map, List list2, boolean z4, Error error4) {
        Log_OC.getArray(list, "location");
        Log_OC.getArray(map, "filePropertyMap");
        Log_OC.getArray(list2, "associatedFields");
        MarketplaceCustomerRegistrationViewData $r0 = new MarketplaceCustomerRegistrationViewData(productField, error, z, z2, list, error2, z3, error3, map, list2, z4, error4);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof MarketplaceCustomerRegistrationViewData;
        if ($z0) {
            MarketplaceCustomerRegistrationViewData $r2 = (MarketplaceCustomerRegistrationViewData) obj;
            ProductField $r3 = this.productField;
            ProductField $r4 = $r2.productField;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                Error $r5 = this.error;
                Error $r6 = $r2.error;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    boolean $z04 = this.loading;
                    boolean $z1 = $r2.loading;
                    if ($z04 != $z1) {
                        return false;
                    }
                    boolean $z05 = this.fetchingLocation;
                    boolean $z12 = $r2.fetchingLocation;
                    if ($z05 != $z12) {
                        return false;
                    }
                    List $r7 = this.location;
                    List $r8 = $r2.location;
                    boolean $z06 = Log_OC.append($r7, $r8);
                    if ($z06) {
                        Error $r52 = this.locationError;
                        Error $r62 = $r2.locationError;
                        boolean $z07 = Log_OC.append($r52, $r62);
                        if ($z07) {
                            boolean $z08 = this.uploadingFile;
                            boolean $z13 = $r2.uploadingFile;
                            if ($z08 != $z13) {
                                return false;
                            }
                            Error $r53 = this.fileUploadError;
                            Error $r63 = $r2.fileUploadError;
                            boolean $z09 = Log_OC.append($r53, $r63);
                            if ($z09) {
                                Map $r9 = this.filePropertyMap;
                                Map $r10 = $r2.filePropertyMap;
                                boolean $z010 = Log_OC.append($r9, $r10);
                                if ($z010) {
                                    List $r72 = this.associatedFields;
                                    List $r82 = $r2.associatedFields;
                                    boolean $z011 = Log_OC.append($r72, $r82);
                                    if ($z011) {
                                        boolean $z012 = this.fetchingAssociatedFields;
                                        boolean $z14 = $r2.fetchingAssociatedFields;
                                        if ($z012 != $z14) {
                                            return false;
                                        }
                                        Error $r54 = this.associatedFieldsError;
                                        Error $r64 = $r2.associatedFieldsError;
                                        boolean $z013 = Log_OC.append($r54, $r64);
                                        return $z013;
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
    public final List getAssociatedFields() {
        List r1 = this.associatedFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getAssociatedFieldsError() {
        Error r1 = this.associatedFieldsError;
        return r1;
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
    public final boolean getFetchingAssociatedFields() {
        boolean z0 = this.fetchingAssociatedFields;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getFetchingLocation() {
        boolean z0 = this.fetchingLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getFilePropertyMap() {
        Map r1 = this.filePropertyMap;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getFileUploadError() {
        Error r1 = this.fileUploadError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getLoading() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getLocation() {
        List r1 = this.location;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getLocationError() {
        Error r1 = this.locationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductField getProductField() {
        ProductField r1 = this.productField;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getUploadingFile() {
        boolean z0 = this.uploadingFile;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        ProductField $r1 = this.productField;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        Error $r2 = this.error;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        boolean $z0 = this.loading;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i22 = i;
        int $i14 = ($i13 + $i22) * 31;
        boolean $z02 = this.fetchingLocation;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i23 = i2;
        List $r3 = this.location;
        int $i24 = $r3.hashCode();
        int $i15 = ((($i14 + $i23) * 31) + $i24) * 31;
        Error $r22 = this.locationError;
        int $i25 = $r22 == null ? 0 : $r22.hashCode();
        int $i16 = ($i15 + $i25) * 31;
        boolean $z03 = this.uploadingFile;
        int i3 = $z03;
        if ($z03 != 0) {
            i3 = 1;
        }
        int $i26 = i3;
        int $i17 = ($i16 + $i26) * 31;
        Error $r23 = this.fileUploadError;
        int $i27 = $r23 == null ? 0 : $r23.hashCode();
        Map $r4 = this.filePropertyMap;
        int $i28 = $r4.hashCode();
        List $r32 = this.associatedFields;
        int $i29 = $r32.hashCode();
        int $i18 = ((((($i17 + $i27) * 31) + $i28) * 31) + $i29) * 31;
        boolean $z04 = this.fetchingAssociatedFields;
        int $i210 = $z04 ? 1 : $z04 ? 1 : 0;
        int $i19 = ($i18 + $i210) * 31;
        Error $r24 = this.associatedFieldsError;
        int $i0 = $r24 != null ? $r24.hashCode() : 0;
        return $i19 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("MarketplaceCustomerRegistrationViewData(productField=");
        ProductField $r3 = this.productField;
        $r2.append($r3);
        $r2.append(", error=");
        Error $r4 = this.error;
        $r2.append($r4);
        $r2.append(", loading=");
        boolean $z0 = this.loading;
        $r2.append($z0);
        $r2.append(", fetchingLocation=");
        boolean $z02 = this.fetchingLocation;
        $r2.append($z02);
        $r2.append(", location=");
        List $r5 = this.location;
        $r2.append($r5);
        $r2.append(", locationError=");
        Error $r42 = this.locationError;
        $r2.append($r42);
        $r2.append(", uploadingFile=");
        boolean $z03 = this.uploadingFile;
        $r2.append($z03);
        $r2.append(", fileUploadError=");
        Error $r43 = this.fileUploadError;
        $r2.append($r43);
        $r2.append(", filePropertyMap=");
        Map $r6 = this.filePropertyMap;
        $r2.append($r6);
        $r2.append(", associatedFields=");
        List $r52 = this.associatedFields;
        $r2.append($r52);
        $r2.append(", fetchingAssociatedFields=");
        boolean $z04 = this.fetchingAssociatedFields;
        $r2.append($z04);
        $r2.append(", associatedFieldsError=");
        Error $r44 = this.associatedFieldsError;
        $r2.append($r44);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
