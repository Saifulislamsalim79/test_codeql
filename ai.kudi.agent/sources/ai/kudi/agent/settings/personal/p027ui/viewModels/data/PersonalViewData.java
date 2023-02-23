package ai.kudi.agent.settings.personal.p027ui.viewModels.data;

import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.outlet_mgt.data.OutletParent;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PersonalViewData.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00010Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jt\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isFetching", "", TransactionField.STATUS, "", "isReviewingRequest", "isProfileInComplete", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData$Error;", "isFetchingKycLevel", "kycLevel", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "outletDetails", "Lai/kudi/agent/outlet_mgt/data/OutletParent;", "(ZLjava/lang/String;ZLjava/lang/Boolean;Lai/kudi/agent/core/domain/room_entities/UserProfile;Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData$Error;ZLai/kudi/agent/core/domain/room_entities/KycLevelsModel;Lai/kudi/agent/outlet_mgt/data/OutletParent;)V", "getError", "()Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData$Error;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKycLevel", "()Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "getOutletDetails", "()Lai/kudi/agent/outlet_mgt/data/OutletParent;", "getStatus", "()Ljava/lang/String;", "getUserProfile", "()Lai/kudi/agent/core/domain/room_entities/UserProfile;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;ZLjava/lang/Boolean;Lai/kudi/agent/core/domain/room_entities/UserProfile;Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData$Error;ZLai/kudi/agent/core/domain/room_entities/KycLevelsModel;Lai/kudi/agent/outlet_mgt/data/OutletParent;)Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData;", "equals", "other", "", "hashCode", "", "toString", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.data.PersonalViewData */
/* loaded from: classes.dex */
public final class PersonalViewData implements ViewData {
    private final Error error;
    private final boolean isFetching;
    private final boolean isFetchingKycLevel;
    private final Boolean isProfileInComplete;
    private final boolean isReviewingRequest;
    private final KycLevelsModel kycLevel;
    private final OutletParent outletDetails;
    private final String status;
    private final UserProfile userProfile;

    /* compiled from: PersonalViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData$Error;", "", MetricTracker.Object.MESSAGE, "", "cacheError", "kycLevelFetchError", "parentOutletError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCacheError", "()Ljava/lang/String;", "getKycLevelFetchError", "getMessage", "getParentOutletError", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.data.PersonalViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String cacheError;
        private final String kycLevelFetchError;
        private final String message;
        private final String parentOutletError;

        public Error() {
            this(null, null, null, null, 15, null);
        }

        public Error(String str, String str2, String str3, String str4) {
            this.message = str;
            this.cacheError = str2;
            this.kycLevelFetchError = str3;
            this.parentOutletError = str4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
            /*
                r1 = this;
                r0 = r6 & 1
                if (r0 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r0 = r6 & 2
                if (r0 == 0) goto Lc
                java.lang.String r3 = ""
            Lc:
                r0 = r6 & 4
                if (r0 == 0) goto L12
                java.lang.String r4 = ""
            L12:
                r6 = r6 & 8
                if (r6 == 0) goto L17
                r5 = 0
            L17:
                r1.<init>(r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r1, String $r2, String $r3, String $r4, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = error.message;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = error.cacheError;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r3 = error.kycLevelFetchError;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = error.parentOutletError;
            }
            Error $r0 = error.copy($r1, $r2, $r3, $r4);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.cacheError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.kycLevelFetchError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.parentOutletError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, String str2, String str3, String str4) {
            Error $r0 = new Error(str, str2, str3, str4);
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
                String $r3 = this.message;
                String $r4 = $r2.message;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.cacheError;
                    String $r42 = $r2.cacheError;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.kycLevelFetchError;
                        String $r43 = $r2.kycLevelFetchError;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.parentOutletError;
                            String $r44 = $r2.parentOutletError;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            return $z05;
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
        public final String getCacheError() {
            String r1 = this.cacheError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getKycLevelFetchError() {
            String r1 = this.kycLevelFetchError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getMessage() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getParentOutletError() {
            String r1 = this.parentOutletError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.message;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.cacheError;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.kycLevelFetchError;
            int $i22 = $r13 == null ? 0 : $r13.hashCode();
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.parentOutletError;
            int $i0 = $r14 != null ? $r14.hashCode() : 0;
            return $i14 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(message=");
            String $r1 = this.message;
            $r2.append((Object) $r1);
            $r2.append(", cacheError=");
            String $r12 = this.cacheError;
            $r2.append((Object) $r12);
            $r2.append(", kycLevelFetchError=");
            String $r13 = this.kycLevelFetchError;
            $r2.append((Object) $r13);
            $r2.append(", parentOutletError=");
            String $r14 = this.parentOutletError;
            $r2.append((Object) $r14);
            $r2.append(')');
            String $r15 = $r2.toString();
            return $r15;
        }
    }

    public PersonalViewData(boolean z, String str, boolean z2, Boolean bool, UserProfile userProfile, Error error, boolean z3, KycLevelsModel kycLevelsModel, OutletParent outletParent) {
        this.isFetching = z;
        this.status = str;
        this.isReviewingRequest = z2;
        this.isProfileInComplete = bool;
        this.userProfile = userProfile;
        this.error = error;
        this.isFetchingKycLevel = z3;
        this.kycLevel = kycLevelsModel;
        this.outletDetails = outletParent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PersonalViewData(boolean r2, java.lang.String r3, boolean r4, java.lang.Boolean r5, ai.kudi.agent.core.domain.room_entities.UserProfile r6, ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData.Error r7, boolean r8, ai.kudi.agent.core.domain.room_entities.KycLevelsModel r9, ai.kudi.agent.outlet_mgt.data.OutletParent r10, int r11, kotlin.p483e0.p485d.DBUtils$1 r12) {
        /*
            r1 = this;
            r0 = r11 & 2
            if (r0 == 0) goto L6
            r3 = 0
            goto L6
        L6:
            r0 = r11 & 4
            if (r0 == 0) goto Lc
            r4 = 0
            goto Lc
        Lc:
            r0 = r11 & 8
            if (r0 == 0) goto L12
            r5 = 0
            goto L12
        L12:
            r0 = r11 & 32
            if (r0 == 0) goto L18
            r7 = 0
            goto L18
        L18:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L1e
            r9 = 0
            goto L1e
        L1e:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L24
            r10 = 0
            goto L24
        L24:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData.<init>(boolean, java.lang.String, boolean, java.lang.Boolean, ai.kudi.agent.core.domain.room_entities.UserProfile, ai.kudi.agent.settings.personal.ui.viewModels.data.PersonalViewData$Error, boolean, ai.kudi.agent.core.domain.room_entities.KycLevelsModel, ai.kudi.agent.outlet_mgt.data.OutletParent, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ PersonalViewData copy$default(PersonalViewData personalViewData, boolean $z0, String $r2, boolean $z1, Boolean $r3, UserProfile $r4, Error $r5, boolean $z2, KycLevelsModel $r6, OutletParent $r7, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = personalViewData.isFetching;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = personalViewData.status;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z1 = personalViewData.isReviewingRequest;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r3 = personalViewData.isProfileInComplete;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r4 = personalViewData.userProfile;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r5 = personalViewData.error;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z2 = personalViewData.isFetchingKycLevel;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r6 = personalViewData.kycLevel;
        }
        int $i0 = i & 256;
        if ($i0 != 0) {
            $r7 = personalViewData.outletDetails;
        }
        PersonalViewData $r0 = personalViewData.copy($z0, $r2, $z1, $r3, $r4, $r5, $z2, $r6, $r7);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isFetching;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isReviewingRequest;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component4() {
        Boolean r1 = this.isProfileInComplete;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserProfile component5() {
        UserProfile r1 = this.userProfile;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component6() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component7() {
        boolean z0 = this.isFetchingKycLevel;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KycLevelsModel component8() {
        KycLevelsModel r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletParent component9() {
        OutletParent r1 = this.outletDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PersonalViewData copy(boolean z, String str, boolean z2, Boolean bool, UserProfile userProfile, Error error, boolean z3, KycLevelsModel kycLevelsModel, OutletParent outletParent) {
        PersonalViewData $r0 = new PersonalViewData(z, str, z2, bool, userProfile, error, z3, kycLevelsModel, outletParent);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof PersonalViewData;
        if ($z0) {
            PersonalViewData $r2 = (PersonalViewData) obj;
            boolean $z02 = this.isFetching;
            boolean $z1 = $r2.isFetching;
            if ($z02 != $z1) {
                return false;
            }
            String $r3 = this.status;
            String $r4 = $r2.status;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                boolean $z04 = this.isReviewingRequest;
                boolean $z12 = $r2.isReviewingRequest;
                if ($z04 != $z12) {
                    return false;
                }
                Boolean $r5 = this.isProfileInComplete;
                Boolean $r6 = $r2.isProfileInComplete;
                boolean $z05 = Log_OC.append($r5, $r6);
                if ($z05) {
                    UserProfile $r7 = this.userProfile;
                    UserProfile $r8 = $r2.userProfile;
                    boolean $z06 = Log_OC.append($r7, $r8);
                    if ($z06) {
                        Error $r9 = this.error;
                        Error $r10 = $r2.error;
                        boolean $z07 = Log_OC.append($r9, $r10);
                        if ($z07) {
                            boolean $z08 = this.isFetchingKycLevel;
                            boolean $z13 = $r2.isFetchingKycLevel;
                            if ($z08 != $z13) {
                                return false;
                            }
                            KycLevelsModel $r11 = this.kycLevel;
                            KycLevelsModel $r12 = $r2.kycLevel;
                            boolean $z09 = Log_OC.append($r11, $r12);
                            if ($z09) {
                                OutletParent $r13 = this.outletDetails;
                                OutletParent $r132 = $r2.outletDetails;
                                boolean $z010 = Log_OC.append($r13, $r132);
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
        return false;
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
    public final KycLevelsModel getKycLevel() {
        KycLevelsModel r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletParent getOutletDetails() {
        OutletParent r1 = this.outletDetails;
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
    public final UserProfile getUserProfile() {
        UserProfile r1 = this.userProfile;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isFetching;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        String $r1 = this.status;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        boolean $z02 = this.isReviewingRequest;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i22 = i;
        int $i03 = ($i02 + $i22) * 31;
        Boolean $r2 = this.isProfileInComplete;
        int $i23 = $r2 == null ? 0 : $r2.hashCode();
        int $i04 = ($i03 + $i23) * 31;
        UserProfile $r3 = this.userProfile;
        int $i24 = $r3 == null ? 0 : $r3.hashCode();
        int $i05 = ($i04 + $i24) * 31;
        Error $r4 = this.error;
        int $i25 = $r4 == null ? 0 : $r4.hashCode();
        int $i06 = ($i05 + $i25) * 31;
        boolean $z03 = this.isFetchingKycLevel;
        int $i26 = $z03 ? 1 : $z03 ? 1 : 0;
        int $i07 = ($i06 + $i26) * 31;
        KycLevelsModel $r5 = this.kycLevel;
        int $i27 = $r5 == null ? 0 : $r5.hashCode();
        int $i08 = ($i07 + $i27) * 31;
        OutletParent $r6 = this.outletDetails;
        int $i12 = $r6 != null ? $r6.hashCode() : 0;
        return $i08 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isFetching() {
        boolean z0 = this.isFetching;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isFetchingKycLevel() {
        boolean z0 = this.isFetchingKycLevel;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isProfileInComplete() {
        Boolean r1 = this.isProfileInComplete;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isReviewingRequest() {
        boolean z0 = this.isReviewingRequest;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("PersonalViewData(isFetching=");
        boolean $z0 = this.isFetching;
        $r2.append($z0);
        $r2.append(", status=");
        String $r1 = this.status;
        $r2.append((Object) $r1);
        $r2.append(", isReviewingRequest=");
        boolean $z02 = this.isReviewingRequest;
        $r2.append($z02);
        $r2.append(", isProfileInComplete=");
        Boolean $r3 = this.isProfileInComplete;
        $r2.append($r3);
        $r2.append(", userProfile=");
        UserProfile $r4 = this.userProfile;
        $r2.append($r4);
        $r2.append(", error=");
        Error $r5 = this.error;
        $r2.append($r5);
        $r2.append(", isFetchingKycLevel=");
        boolean $z03 = this.isFetchingKycLevel;
        $r2.append($z03);
        $r2.append(", kycLevel=");
        KycLevelsModel $r6 = this.kycLevel;
        $r2.append($r6);
        $r2.append(", outletDetails=");
        OutletParent $r7 = this.outletDetails;
        $r2.append($r7);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
