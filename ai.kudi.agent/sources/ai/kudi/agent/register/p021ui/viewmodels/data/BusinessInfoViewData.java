package ai.kudi.agent.register.p021ui.viewmodels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.register.domain.dto.BusinessCategoryData;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: BusinessInfoViewData.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "isBusicategoryLoading", "isFetchingLocation", "successMessage", "", "userProfile", "Lai/kudi/agent/users/domain/dto/User;", "location", "", "Lai/kudi/agent/register/data/models/LocationModel;", "businessCategories", "Lai/kudi/agent/register/domain/dto/BusinessCategoryData;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData$Error;", "(ZZZLjava/lang/String;Lai/kudi/agent/users/domain/dto/User;Ljava/util/List;Ljava/util/List;Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData$Error;)V", "getBusinessCategories", "()Ljava/util/List;", "getError", "()Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData$Error;", "()Z", "getLocation", "getSuccessMessage", "()Ljava/lang/String;", "getUserProfile", "()Lai/kudi/agent/users/domain/dto/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.data.BusinessInfoViewData */
/* loaded from: classes.dex */
public final class BusinessInfoViewData implements ViewData {
    private final List<BusinessCategoryData> businessCategories;
    private final Error error;
    private final boolean isBusicategoryLoading;
    private final boolean isFetchingLocation;
    private final boolean isLoading;
    private final List<LocationModel> location;
    private final String successMessage;
    private final User userProfile;

    /* compiled from: BusinessInfoViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData$Error;", "", "businessNameError", "", "businessAddressError", "cacRegistrationNo", "contactAddressError", "businessStateError", "businessCityError", "businessLgaError", "upgradeError", "genericError", "primaryBusinessError", "areaError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAreaError", "()Ljava/lang/String;", "getBusinessAddressError", "getBusinessCityError", "getBusinessLgaError", "getBusinessNameError", "getBusinessStateError", "getCacRegistrationNo", "getContactAddressError", "getGenericError", "getPrimaryBusinessError", "getUpgradeError", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.viewmodels.data.BusinessInfoViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String areaError;
        private final String businessAddressError;
        private final String businessCityError;
        private final String businessLgaError;
        private final String businessNameError;
        private final String businessStateError;
        private final String cacRegistrationNo;
        private final String contactAddressError;
        private final String genericError;
        private final String primaryBusinessError;
        private final String upgradeError;

        public Error() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.businessNameError = str;
            this.businessAddressError = str2;
            this.cacRegistrationNo = str3;
            this.contactAddressError = str4;
            this.businessStateError = str5;
            this.businessCityError = str6;
            this.businessLgaError = str7;
            this.upgradeError = str8;
            this.genericError = str9;
            this.primaryBusinessError = str10;
            this.areaError = str11;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.p483e0.p485d.DBUtils$1 r27) {
            /*
                r14 = this;
                r12 = r26 & 1
                r13 = 0
                if (r12 == 0) goto L7
                r15 = 0
                goto L7
            L7:
                r12 = r26 & 2
                if (r12 == 0) goto Le
                r16 = 0
                goto Le
            Le:
                r12 = r26 & 4
                if (r12 == 0) goto L15
                r17 = 0
                goto L15
            L15:
                r12 = r26 & 8
                if (r12 == 0) goto L1c
                r18 = 0
                goto L1c
            L1c:
                r12 = r26 & 16
                if (r12 == 0) goto L23
                r19 = 0
                goto L23
            L23:
                r12 = r26 & 32
                if (r12 == 0) goto L2a
                r20 = 0
                goto L2a
            L2a:
                r12 = r26 & 64
                if (r12 == 0) goto L31
                r21 = 0
                goto L31
            L31:
                r0 = r26
                r12 = r0 & 128(0x80, float:1.794E-43)
                if (r12 == 0) goto L3a
                r22 = 0
                goto L3a
            L3a:
                r0 = r26
                r12 = r0 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L43
                r23 = 0
                goto L43
            L43:
                r0 = r26
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L4c
                r24 = 0
                goto L4c
            L4c:
                r0 = r26
                r0 = r0 & 1024(0x400, float:1.435E-42)
                r26 = r0
                if (r26 == 0) goto L55
                goto L57
            L55:
                r13 = r25
            L57:
                r0 = r14
                r1 = r15
                r2 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r2, String $r3, String $r4, String $r5, String $r6, String $r7, String $r8, String $r9, String $r10, String $r11, String $r12, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = error.businessNameError;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = error.businessAddressError;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r4 = error.cacRegistrationNo;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r5 = error.contactAddressError;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r6 = error.businessStateError;
            }
            int $i16 = i & 32;
            if ($i16 != 0) {
                $r7 = error.businessCityError;
            }
            int $i17 = i & 64;
            if ($i17 != 0) {
                $r8 = error.businessLgaError;
            }
            int $i18 = i & 128;
            if ($i18 != 0) {
                $r9 = error.upgradeError;
            }
            int $i19 = i & 256;
            if ($i19 != 0) {
                $r10 = error.genericError;
            }
            int $i110 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            if ($i110 != 0) {
                $r11 = error.primaryBusinessError;
            }
            int $i0 = i & 1024;
            if ($i0 != 0) {
                $r12 = error.areaError;
            }
            Error $r0 = error.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.businessNameError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component10() {
            String r1 = this.primaryBusinessError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component11() {
            String r1 = this.areaError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.businessAddressError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.cacRegistrationNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.contactAddressError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.businessStateError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component6() {
            String r1 = this.businessCityError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component7() {
            String r1 = this.businessLgaError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component8() {
            String r1 = this.upgradeError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component9() {
            String r1 = this.genericError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            Error $r0 = new Error(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Error;
            if ($z0) {
                Error $r2 = (Error) obj;
                String $r3 = this.businessNameError;
                String $r4 = $r2.businessNameError;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.businessAddressError;
                    String $r42 = $r2.businessAddressError;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.cacRegistrationNo;
                        String $r43 = $r2.cacRegistrationNo;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.contactAddressError;
                            String $r44 = $r2.contactAddressError;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.businessStateError;
                                String $r45 = $r2.businessStateError;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.businessCityError;
                                    String $r46 = $r2.businessCityError;
                                    boolean $z07 = Log_OC.append($r36, $r46);
                                    if ($z07) {
                                        String $r37 = this.businessLgaError;
                                        String $r47 = $r2.businessLgaError;
                                        boolean $z08 = Log_OC.append($r37, $r47);
                                        if ($z08) {
                                            String $r38 = this.upgradeError;
                                            String $r48 = $r2.upgradeError;
                                            boolean $z09 = Log_OC.append($r38, $r48);
                                            if ($z09) {
                                                String $r39 = this.genericError;
                                                String $r49 = $r2.genericError;
                                                boolean $z010 = Log_OC.append($r39, $r49);
                                                if ($z010) {
                                                    String $r310 = this.primaryBusinessError;
                                                    String $r410 = $r2.primaryBusinessError;
                                                    boolean $z011 = Log_OC.append($r310, $r410);
                                                    if ($z011) {
                                                        String $r311 = this.areaError;
                                                        String $r411 = $r2.areaError;
                                                        boolean $z012 = Log_OC.append($r311, $r411);
                                                        return $z012;
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
        public final String getAreaError() {
            String r1 = this.areaError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessAddressError() {
            String r1 = this.businessAddressError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessCityError() {
            String r1 = this.businessCityError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessLgaError() {
            String r1 = this.businessLgaError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessNameError() {
            String r1 = this.businessNameError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessStateError() {
            String r1 = this.businessStateError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getCacRegistrationNo() {
            String r1 = this.cacRegistrationNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getContactAddressError() {
            String r1 = this.contactAddressError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getGenericError() {
            String r1 = this.genericError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getPrimaryBusinessError() {
            String r1 = this.primaryBusinessError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getUpgradeError() {
            String r1 = this.upgradeError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.businessNameError;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.businessAddressError;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.cacRegistrationNo;
            int $i22 = $r13 == null ? 0 : $r13.hashCode();
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.contactAddressError;
            int $i23 = $r14 == null ? 0 : $r14.hashCode();
            int $i15 = ($i14 + $i23) * 31;
            String $r15 = this.businessStateError;
            int $i24 = $r15 == null ? 0 : $r15.hashCode();
            int $i16 = ($i15 + $i24) * 31;
            String $r16 = this.businessCityError;
            int $i25 = $r16 == null ? 0 : $r16.hashCode();
            int $i17 = ($i16 + $i25) * 31;
            String $r17 = this.businessLgaError;
            int $i26 = $r17 == null ? 0 : $r17.hashCode();
            int $i18 = ($i17 + $i26) * 31;
            String $r18 = this.upgradeError;
            int $i27 = $r18 == null ? 0 : $r18.hashCode();
            int $i19 = ($i18 + $i27) * 31;
            String $r19 = this.genericError;
            int $i28 = $r19 == null ? 0 : $r19.hashCode();
            int $i110 = ($i19 + $i28) * 31;
            String $r110 = this.primaryBusinessError;
            int $i29 = $r110 == null ? 0 : $r110.hashCode();
            int $i111 = ($i110 + $i29) * 31;
            String $r111 = this.areaError;
            int $i0 = $r111 != null ? $r111.hashCode() : 0;
            return $i111 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(businessNameError=");
            String $r1 = this.businessNameError;
            $r2.append((Object) $r1);
            $r2.append(", businessAddressError=");
            String $r12 = this.businessAddressError;
            $r2.append((Object) $r12);
            $r2.append(", cacRegistrationNo=");
            String $r13 = this.cacRegistrationNo;
            $r2.append((Object) $r13);
            $r2.append(", contactAddressError=");
            String $r14 = this.contactAddressError;
            $r2.append((Object) $r14);
            $r2.append(", businessStateError=");
            String $r15 = this.businessStateError;
            $r2.append((Object) $r15);
            $r2.append(", businessCityError=");
            String $r16 = this.businessCityError;
            $r2.append((Object) $r16);
            $r2.append(", businessLgaError=");
            String $r17 = this.businessLgaError;
            $r2.append((Object) $r17);
            $r2.append(", upgradeError=");
            String $r18 = this.upgradeError;
            $r2.append((Object) $r18);
            $r2.append(", genericError=");
            String $r19 = this.genericError;
            $r2.append((Object) $r19);
            $r2.append(", primaryBusinessError=");
            String $r110 = this.primaryBusinessError;
            $r2.append((Object) $r110);
            $r2.append(", areaError=");
            String $r111 = this.areaError;
            $r2.append((Object) $r111);
            $r2.append(')');
            String $r112 = $r2.toString();
            return $r112;
        }
    }

    public BusinessInfoViewData() {
        this(false, false, false, null, null, null, null, null, 255, null);
    }

    public BusinessInfoViewData(boolean z, boolean z2, boolean z3, String str, User user, List list, List list2, Error error) {
        Log_OC.getArray(str, "successMessage");
        this.isLoading = z;
        this.isBusicategoryLoading = z2;
        this.isFetchingLocation = z3;
        this.successMessage = str;
        this.userProfile = user;
        this.location = list;
        this.businessCategories = list2;
        this.error = error;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BusinessInfoViewData(boolean r13, boolean r14, boolean r15, java.lang.String r16, ai.kudi.agent.users.domain.package_1.User r17, java.util.List r18, java.util.List r19, ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData.Error r20, int r21, kotlin.p483e0.p485d.DBUtils$1 r22) {
        /*
            r12 = this;
            r9 = r21 & 1
            r10 = 0
            if (r9 == 0) goto L7
            r13 = 0
            goto L7
        L7:
            r9 = r21 & 2
            if (r9 == 0) goto Ld
            r14 = 0
            goto Ld
        Ld:
            r9 = r21 & 4
            if (r9 == 0) goto L12
            goto L13
        L12:
            r10 = r15
        L13:
            r9 = r21 & 8
            if (r9 == 0) goto L1a
            java.lang.String r16 = ""
            goto L1a
        L1a:
            r9 = r21 & 16
            r11 = 0
            if (r9 == 0) goto L22
            r17 = 0
            goto L22
        L22:
            r9 = r21 & 32
            if (r9 == 0) goto L29
            r18 = 0
            goto L29
        L29:
            r9 = r21 & 64
            if (r9 == 0) goto L30
            r19 = 0
            goto L30
        L30:
            r0 = r21
            r0 = r0 & 128(0x80, float:1.794E-43)
            r21 = r0
            if (r21 == 0) goto L39
            goto L3b
        L39:
            r11 = r20
        L3b:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData.<init>(boolean, boolean, boolean, java.lang.String, ai.kudi.agent.users.domain.package_1.User, java.util.List, java.util.List, ai.kudi.agent.register.ui.viewmodels.data.BusinessInfoViewData$Error, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ BusinessInfoViewData copy$default(BusinessInfoViewData businessInfoViewData, boolean $z0, boolean $z1, boolean $z2, String $r2, User $r3, List $r4, List $r5, Error $r6, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = businessInfoViewData.isLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z1 = businessInfoViewData.isBusicategoryLoading;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z2 = businessInfoViewData.isFetchingLocation;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r2 = businessInfoViewData.successMessage;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r3 = businessInfoViewData.userProfile;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r4 = businessInfoViewData.location;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r5 = businessInfoViewData.businessCategories;
        }
        int $i0 = i & 128;
        if ($i0 != 0) {
            $r6 = businessInfoViewData.error;
        }
        BusinessInfoViewData $r0 = businessInfoViewData.copy($z0, $z1, $z2, $r2, $r3, $r4, $r5, $r6);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isBusicategoryLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isFetchingLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.successMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User component5() {
        User r1 = this.userProfile;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component6() {
        List r1 = this.location;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component7() {
        List r1 = this.businessCategories;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component8() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BusinessInfoViewData copy(boolean z, boolean z2, boolean z3, String str, User user, List list, List list2, Error error) {
        Log_OC.getArray(str, "successMessage");
        BusinessInfoViewData $r0 = new BusinessInfoViewData(z, z2, z3, str, user, list, list2, error);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof BusinessInfoViewData;
        if ($z0) {
            BusinessInfoViewData $r2 = (BusinessInfoViewData) obj;
            boolean $z02 = this.isLoading;
            boolean $z1 = $r2.isLoading;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isBusicategoryLoading;
            boolean $z12 = $r2.isBusicategoryLoading;
            if ($z03 != $z12) {
                return false;
            }
            boolean $z04 = this.isFetchingLocation;
            boolean $z13 = $r2.isFetchingLocation;
            if ($z04 != $z13) {
                return false;
            }
            String $r3 = this.successMessage;
            String $r4 = $r2.successMessage;
            boolean $z05 = Log_OC.append($r3, $r4);
            if ($z05) {
                User $r5 = this.userProfile;
                User $r6 = $r2.userProfile;
                boolean $z06 = Log_OC.append($r5, $r6);
                if ($z06) {
                    List $r7 = this.location;
                    List $r8 = $r2.location;
                    boolean $z07 = Log_OC.append($r7, $r8);
                    if ($z07) {
                        List $r72 = this.businessCategories;
                        List $r82 = $r2.businessCategories;
                        boolean $z08 = Log_OC.append($r72, $r82);
                        if ($z08) {
                            Error $r9 = this.error;
                            Error $r10 = $r2.error;
                            boolean $z09 = Log_OC.append($r9, $r10);
                            return $z09;
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
    public final List getBusinessCategories() {
        List r1 = this.businessCategories;
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
    public final List getLocation() {
        List r1 = this.location;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSuccessMessage() {
        String r1 = this.successMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUserProfile() {
        User r1 = this.userProfile;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isLoading;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.isBusicategoryLoading;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i03 = ($i02 + $i1) * 31;
        boolean $z03 = this.isFetchingLocation;
        int $i12 = $z03 ? 1 : $z03 ? 1 : 0;
        String $r1 = this.successMessage;
        int $i13 = $r1.hashCode();
        int $i14 = ((($i03 + $i12) * 31) + $i13) * 31;
        User $r2 = this.userProfile;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i15 = ($i14 + $i2) * 31;
        List $r3 = this.location;
        int $i22 = $r3 == null ? 0 : $r3.hashCode();
        int $i16 = ($i15 + $i22) * 31;
        List $r32 = this.businessCategories;
        int $i23 = $r32 == null ? 0 : $r32.hashCode();
        int $i17 = ($i16 + $i23) * 31;
        Error $r4 = this.error;
        int $i04 = $r4 != null ? $r4.hashCode() : 0;
        return $i17 + $i04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isBusicategoryLoading() {
        boolean z0 = this.isBusicategoryLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isFetchingLocation() {
        boolean z0 = this.isFetchingLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoading() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("BusinessInfoViewData(isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", isBusicategoryLoading=");
        boolean $z02 = this.isBusicategoryLoading;
        $r2.append($z02);
        $r2.append(", isFetchingLocation=");
        boolean $z03 = this.isFetchingLocation;
        $r2.append($z03);
        $r2.append(", successMessage=");
        String $r1 = this.successMessage;
        $r2.append($r1);
        $r2.append(", userProfile=");
        User $r3 = this.userProfile;
        $r2.append($r3);
        $r2.append(", location=");
        List $r4 = this.location;
        $r2.append($r4);
        $r2.append(", businessCategories=");
        List $r42 = this.businessCategories;
        $r2.append($r42);
        $r2.append(", error=");
        Error $r5 = this.error;
        $r2.append($r5);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
