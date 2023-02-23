package ai.kudi.agent.p036v2.productLookup.viewData;

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
/* compiled from: MarketplaceProductLookupViewData.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003JÍ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010?\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$¨\u0006E"}, m10421d2 = {"Lai/kudi/agent/v2/productLookup/viewData/MarketplaceProductLookupViewData;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceLookupViewData;", "productField", "Lai/kudi/agent/core/domain/data/ProductField;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "uploadingError", "filePropertyMap", "", "", "lookupLoading", "", "loading", "customerLookupSummary", "customerLookupResponseMessage", "fetchingLocation", "uploadingFile", "location", "", "Lai/kudi/agent/register/data/models/LocationModel;", "locationError", "associatedFields", "Lai/kudi/dip/library/bottomSheets/models/Field;", "fetchingAssociatedFields", "associatedFieldsError", "(Lai/kudi/agent/core/domain/data/ProductField;Lai/kudi/agent/v2/common/view/viewData/data/Error;Lai/kudi/agent/v2/common/view/viewData/data/Error;Ljava/util/Map;ZZLjava/util/Map;Ljava/lang/String;ZZLjava/util/List;Lai/kudi/agent/v2/common/view/viewData/data/Error;Ljava/util/List;ZLai/kudi/agent/v2/common/view/viewData/data/Error;)V", "getAssociatedFields", "()Ljava/util/List;", "getAssociatedFieldsError", "()Lai/kudi/agent/v2/common/view/viewData/data/Error;", "getCustomerLookupResponseMessage", "()Ljava/lang/String;", "getCustomerLookupSummary", "()Ljava/util/Map;", "getError", "getFetchingAssociatedFields", "()Z", "getFetchingLocation", "getFilePropertyMap", "getLoading", "getLocation", "getLocationError", "getLookupLoading", "getProductField", "()Lai/kudi/agent/core/domain/data/ProductField;", "getUploadingError", "getUploadingFile", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.viewData.MarketplaceProductLookupViewData */
/* loaded from: classes.dex */
public final class MarketplaceProductLookupViewData implements MarketplaceLookupViewData {
    private final List<Field> associatedFields;
    private final Error associatedFieldsError;
    private final String customerLookupResponseMessage;
    private final Map<String, String> customerLookupSummary;
    private final Error error;
    private final boolean fetchingAssociatedFields;
    private final boolean fetchingLocation;
    private final Map<String, String> filePropertyMap;
    private final boolean loading;
    private final List<LocationModel> location;
    private final Error locationError;
    private final boolean lookupLoading;
    private final ProductField productField;
    private final Error uploadingError;
    private final boolean uploadingFile;

    public MarketplaceProductLookupViewData() {
        this(null, null, null, null, false, false, null, null, false, false, null, null, null, false, null, 32767, null);
    }

    public MarketplaceProductLookupViewData(ProductField productField, Error error, Error error2, Map map, boolean z, boolean z2, Map map2, String str, boolean z3, boolean z4, List list, Error error3, List list2, boolean z5, Error error4) {
        Log_OC.getArray(map, "filePropertyMap");
        Log_OC.getArray(map2, "customerLookupSummary");
        Log_OC.getArray(str, "customerLookupResponseMessage");
        Log_OC.getArray(list, "location");
        Log_OC.getArray(list2, "associatedFields");
        this.productField = productField;
        this.error = error;
        this.uploadingError = error2;
        this.filePropertyMap = map;
        this.lookupLoading = z;
        this.loading = z2;
        this.customerLookupSummary = map2;
        this.customerLookupResponseMessage = str;
        this.fetchingLocation = z3;
        this.uploadingFile = z4;
        this.location = list;
        this.locationError = error3;
        this.associatedFields = list2;
        this.fetchingAssociatedFields = z5;
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
    public /* synthetic */ MarketplaceProductLookupViewData(ai.kudi.agent.core.domain.data.ProductField r29, ai.kudi.agent.p036v2.common.view.viewData.data.Error r30, ai.kudi.agent.p036v2.common.view.viewData.data.Error r31, java.util.Map r32, boolean r33, boolean r34, java.util.Map r35, java.lang.String r36, boolean r37, boolean r38, java.util.List r39, ai.kudi.agent.p036v2.common.view.viewData.data.Error r40, java.util.List r41, boolean r42, ai.kudi.agent.p036v2.common.view.viewData.data.Error r43, int r44, kotlin.p483e0.p485d.DBUtils$1 r45) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productLookup.viewData.MarketplaceProductLookupViewData.<init>(ai.kudi.agent.core.domain.data.ProductField, ai.kudi.agent.v2.common.view.viewData.data.Error, ai.kudi.agent.v2.common.view.viewData.data.Error, java.util.Map, boolean, boolean, java.util.Map, java.lang.String, boolean, boolean, java.util.List, ai.kudi.agent.v2.common.view.viewData.data.Error, java.util.List, boolean, ai.kudi.agent.v2.common.view.viewData.data.Error, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ MarketplaceProductLookupViewData copy$default(MarketplaceProductLookupViewData marketplaceProductLookupViewData, ProductField $r2, Error $r3, Error $r4, Map $r5, boolean $z0, boolean $z1, Map $r6, String $r7, boolean $z2, boolean $z3, List $r8, Error $r9, List $r10, boolean $z4, Error $r11, int $i1, Object obj) {
        if (($i1 & 1) != 0) {
            $r2 = marketplaceProductLookupViewData.productField;
        }
        if (($i1 & 2) != 0) {
            $r3 = marketplaceProductLookupViewData.error;
        }
        if (($i1 & 4) != 0) {
            $r4 = marketplaceProductLookupViewData.uploadingError;
        }
        if (($i1 & 8) != 0) {
            $r5 = marketplaceProductLookupViewData.filePropertyMap;
        }
        if (($i1 & 16) != 0) {
            $z0 = marketplaceProductLookupViewData.lookupLoading;
        }
        if (($i1 & 32) != 0) {
            $z1 = marketplaceProductLookupViewData.loading;
        }
        if (($i1 & 64) != 0) {
            $r6 = marketplaceProductLookupViewData.customerLookupSummary;
        }
        if (($i1 & 128) != 0) {
            $r7 = marketplaceProductLookupViewData.customerLookupResponseMessage;
        }
        if (($i1 & 256) != 0) {
            $z2 = marketplaceProductLookupViewData.fetchingLocation;
        }
        if (($i1 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $z3 = marketplaceProductLookupViewData.uploadingFile;
        }
        if (($i1 & 1024) != 0) {
            $r8 = marketplaceProductLookupViewData.location;
        }
        if (($i1 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $r9 = marketplaceProductLookupViewData.locationError;
        }
        if (($i1 & 4096) != 0) {
            $r10 = marketplaceProductLookupViewData.associatedFields;
        }
        if (($i1 & 8192) != 0) {
            boolean $z42 = marketplaceProductLookupViewData.fetchingAssociatedFields;
            $z4 = $z42;
        }
        int $i0 = $i1 & 16384;
        if ($i0 != 0) {
            Error $r112 = marketplaceProductLookupViewData.associatedFieldsError;
            $r11 = $r112;
        }
        MarketplaceProductLookupViewData $r0 = marketplaceProductLookupViewData.copy($r2, $r3, $r4, $r5, $z0, $z1, $r6, $r7, $z2, $z3, $r8, $r9, $r10, $z4, $r11);
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
    public final boolean component10() {
        boolean z0 = this.uploadingFile;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component11() {
        List r1 = this.location;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component12() {
        Error r1 = this.locationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component13() {
        List r1 = this.associatedFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component14() {
        boolean z0 = this.fetchingAssociatedFields;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component15() {
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
    public final Error component3() {
        Error r1 = this.uploadingError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map component4() {
        Map r1 = this.filePropertyMap;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.lookupLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component6() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map component7() {
        Map r1 = this.customerLookupSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.customerLookupResponseMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component9() {
        boolean z0 = this.fetchingLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceProductLookupViewData copy(ProductField productField, Error error, Error error2, Map map, boolean z, boolean z2, Map map2, String str, boolean z3, boolean z4, List list, Error error3, List list2, boolean z5, Error error4) {
        Log_OC.getArray(map, "filePropertyMap");
        Log_OC.getArray(map2, "customerLookupSummary");
        Log_OC.getArray(str, "customerLookupResponseMessage");
        Log_OC.getArray(list, "location");
        Log_OC.getArray(list2, "associatedFields");
        MarketplaceProductLookupViewData $r0 = new MarketplaceProductLookupViewData(productField, error, error2, map, z, z2, map2, str, z3, z4, list, error3, list2, z5, error4);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof MarketplaceProductLookupViewData;
        if ($z0) {
            MarketplaceProductLookupViewData $r2 = (MarketplaceProductLookupViewData) obj;
            ProductField $r3 = this.productField;
            ProductField $r4 = $r2.productField;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                Error $r5 = this.error;
                Error $r6 = $r2.error;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    Error $r52 = this.uploadingError;
                    Error $r62 = $r2.uploadingError;
                    boolean $z04 = Log_OC.append($r52, $r62);
                    if ($z04) {
                        Map $r7 = this.filePropertyMap;
                        Map $r8 = $r2.filePropertyMap;
                        boolean $z05 = Log_OC.append($r7, $r8);
                        if ($z05) {
                            boolean $z06 = this.lookupLoading;
                            boolean $z1 = $r2.lookupLoading;
                            if ($z06 != $z1) {
                                return false;
                            }
                            boolean $z07 = this.loading;
                            boolean $z12 = $r2.loading;
                            if ($z07 != $z12) {
                                return false;
                            }
                            Map $r72 = this.customerLookupSummary;
                            Map $r82 = $r2.customerLookupSummary;
                            boolean $z08 = Log_OC.append($r72, $r82);
                            if ($z08) {
                                String $r9 = this.customerLookupResponseMessage;
                                String $r10 = $r2.customerLookupResponseMessage;
                                boolean $z09 = Log_OC.append($r9, $r10);
                                if ($z09) {
                                    boolean $z010 = this.fetchingLocation;
                                    boolean $z13 = $r2.fetchingLocation;
                                    if ($z010 != $z13) {
                                        return false;
                                    }
                                    boolean $z011 = this.uploadingFile;
                                    boolean $z14 = $r2.uploadingFile;
                                    if ($z011 != $z14) {
                                        return false;
                                    }
                                    List $r11 = this.location;
                                    List $r12 = $r2.location;
                                    boolean $z012 = Log_OC.append($r11, $r12);
                                    if ($z012) {
                                        Error $r53 = this.locationError;
                                        Error $r63 = $r2.locationError;
                                        boolean $z013 = Log_OC.append($r53, $r63);
                                        if ($z013) {
                                            List $r112 = this.associatedFields;
                                            List $r122 = $r2.associatedFields;
                                            boolean $z014 = Log_OC.append($r112, $r122);
                                            if ($z014) {
                                                boolean $z015 = this.fetchingAssociatedFields;
                                                boolean $z15 = $r2.fetchingAssociatedFields;
                                                if ($z015 != $z15) {
                                                    return false;
                                                }
                                                Error $r54 = this.associatedFieldsError;
                                                Error $r64 = $r2.associatedFieldsError;
                                                boolean $z016 = Log_OC.append($r54, $r64);
                                                return $z016;
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
    public final String getCustomerLookupResponseMessage() {
        String r1 = this.customerLookupResponseMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getCustomerLookupSummary() {
        Map r1 = this.customerLookupSummary;
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
    public final boolean getLookupLoading() {
        boolean z0 = this.lookupLoading;
        return z0;
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
    public final Error getUploadingError() {
        Error r1 = this.uploadingError;
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
        Error $r22 = this.uploadingError;
        int $i22 = $r22 == null ? 0 : $r22.hashCode();
        Map $r3 = this.filePropertyMap;
        int $i23 = $r3.hashCode();
        int $i14 = ((($i13 + $i22) * 31) + $i23) * 31;
        boolean $z0 = this.lookupLoading;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i24 = i;
        int $i15 = ($i14 + $i24) * 31;
        boolean $z02 = this.loading;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i25 = i2;
        Map $r32 = this.customerLookupSummary;
        int $i26 = $r32.hashCode();
        String $r4 = this.customerLookupResponseMessage;
        int $i27 = $r4.hashCode();
        int $i16 = ((((($i15 + $i25) * 31) + $i26) * 31) + $i27) * 31;
        boolean $z03 = this.fetchingLocation;
        int i3 = $z03;
        if ($z03 != 0) {
            i3 = 1;
        }
        int $i28 = i3;
        int $i17 = ($i16 + $i28) * 31;
        boolean $z04 = this.uploadingFile;
        int i4 = $z04;
        if ($z04 != 0) {
            i4 = 1;
        }
        int $i29 = i4;
        List $r5 = this.location;
        int $i210 = $r5.hashCode();
        int $i18 = ((($i17 + $i29) * 31) + $i210) * 31;
        Error $r23 = this.locationError;
        int $i211 = $r23 == null ? 0 : $r23.hashCode();
        List $r52 = this.associatedFields;
        int $i212 = $r52.hashCode();
        int $i19 = ((($i18 + $i211) * 31) + $i212) * 31;
        boolean $z05 = this.fetchingAssociatedFields;
        int $i213 = $z05 ? 1 : $z05 ? 1 : 0;
        int $i110 = ($i19 + $i213) * 31;
        Error $r24 = this.associatedFieldsError;
        int $i0 = $r24 != null ? $r24.hashCode() : 0;
        return $i110 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("MarketplaceProductLookupViewData(productField=");
        ProductField $r3 = this.productField;
        $r2.append($r3);
        $r2.append(", error=");
        Error $r4 = this.error;
        $r2.append($r4);
        $r2.append(", uploadingError=");
        Error $r42 = this.uploadingError;
        $r2.append($r42);
        $r2.append(", filePropertyMap=");
        Map $r5 = this.filePropertyMap;
        $r2.append($r5);
        $r2.append(", lookupLoading=");
        boolean $z0 = this.lookupLoading;
        $r2.append($z0);
        $r2.append(", loading=");
        boolean $z02 = this.loading;
        $r2.append($z02);
        $r2.append(", customerLookupSummary=");
        Map $r52 = this.customerLookupSummary;
        $r2.append($r52);
        $r2.append(", customerLookupResponseMessage=");
        String $r1 = this.customerLookupResponseMessage;
        $r2.append($r1);
        $r2.append(", fetchingLocation=");
        boolean $z03 = this.fetchingLocation;
        $r2.append($z03);
        $r2.append(", uploadingFile=");
        boolean $z04 = this.uploadingFile;
        $r2.append($z04);
        $r2.append(", location=");
        List $r6 = this.location;
        $r2.append($r6);
        $r2.append(", locationError=");
        Error $r43 = this.locationError;
        $r2.append($r43);
        $r2.append(", associatedFields=");
        List $r62 = this.associatedFields;
        $r2.append($r62);
        $r2.append(", fetchingAssociatedFields=");
        boolean $z05 = this.fetchingAssociatedFields;
        $r2.append($z05);
        $r2.append(", associatedFieldsError=");
        Error $r44 = this.associatedFieldsError;
        $r2.append($r44);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
