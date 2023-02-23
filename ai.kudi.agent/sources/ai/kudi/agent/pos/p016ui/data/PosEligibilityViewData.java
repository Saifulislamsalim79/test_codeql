package ai.kudi.agent.pos.p016ui.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.pos.data.PosDeviceInfoModel;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryViewState;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PosEligibilityViewData.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00019B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rHÆ\u0003J\u009c\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001fR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006:"}, m10421d2 = {"Lai/kudi/agent/pos/ui/data/PosEligibilityViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "eligibleForLease", "", "eligibleForPaid", "eligibleForReplacement", "eligibleForRepairReplacement", "isLoading", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/pos/ui/data/PosEligibilityViewData$Error;", "customerType", "", "posTypeData", "", "Lai/kudi/agent/pos/data/PosTypeData;", "posDeviceInfo", "Lai/kudi/agent/pos/data/PosDeviceInfoModel;", "trackPosStatus", "posSummaryViewState", "Lai/kudi/agent/pos/ui/widget/PosRequestsSummaryViewState;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLai/kudi/agent/pos/ui/data/PosEligibilityViewData$Error;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lai/kudi/agent/pos/ui/widget/PosRequestsSummaryViewState;)V", "getCustomerType", "()Ljava/lang/String;", "getEligibleForLease", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEligibleForPaid", "getEligibleForRepairReplacement", "getEligibleForReplacement", "getError", "()Lai/kudi/agent/pos/ui/data/PosEligibilityViewData$Error;", "()Z", "getPosDeviceInfo", "()Ljava/util/List;", "getPosSummaryViewState", "()Lai/kudi/agent/pos/ui/widget/PosRequestsSummaryViewState;", "getPosTypeData", "getTrackPosStatus", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLai/kudi/agent/pos/ui/data/PosEligibilityViewData$Error;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lai/kudi/agent/pos/ui/widget/PosRequestsSummaryViewState;)Lai/kudi/agent/pos/ui/data/PosEligibilityViewData;", "equals", "other", "", "hashCode", "", "toString", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.data.PosEligibilityViewData */
/* loaded from: classes.dex */
public final class PosEligibilityViewData implements ViewData {
    private final String customerType;
    private final Boolean eligibleForLease;
    private final Boolean eligibleForPaid;
    private final Boolean eligibleForRepairReplacement;
    private final Boolean eligibleForReplacement;
    private final Error error;
    private final boolean isLoading;
    private final List<PosDeviceInfoModel> posDeviceInfo;
    private final PosRequestsSummaryViewState posSummaryViewState;
    private final List<PosTypeData> posTypeData;
    private final String trackPosStatus;

    /* compiled from: PosEligibilityViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/pos/ui/data/PosEligibilityViewData$Error;", "", MetricTracker.Object.MESSAGE, "", "posSummaryMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPosSummaryMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.data.PosEligibilityViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String message;
        private final String posSummaryMessage;

        public Error() {
            this(null, null, 3, null);
        }

        public Error(String str, String str2) {
            this.message = str;
            this.posSummaryMessage = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r2, java.lang.String r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData.Error.<init>(java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = error.message;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = error.posSummaryMessage;
            }
            Error $r0 = error.copy($r1, $r2);
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
            String r1 = this.posSummaryMessage;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, String str2) {
            Error $r0 = new Error(str, str2);
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
                Error $r3 = (Error) obj;
                String $r4 = this.message;
                String $r1 = $r3.message;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.posSummaryMessage;
                    String $r42 = $r3.posSummaryMessage;
                    boolean $z03 = Log_OC.append($r12, $r42);
                    return $z03;
                }
                return false;
            }
            return false;
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
        public final String getPosSummaryMessage() {
            String r1 = this.posSummaryMessage;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.message;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.posSummaryMessage;
            int $i0 = $r12 != null ? $r12.hashCode() : 0;
            return $i12 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(message=");
            String $r1 = this.message;
            $r2.append((Object) $r1);
            $r2.append(", posSummaryMessage=");
            String $r12 = this.posSummaryMessage;
            $r2.append((Object) $r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    public PosEligibilityViewData() {
        this(null, null, null, null, false, null, null, null, null, null, null, 2047, null);
    }

    public PosEligibilityViewData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z, Error error, String str, List list, List list2, String str2, PosRequestsSummaryViewState posRequestsSummaryViewState) {
        this.eligibleForLease = bool;
        this.eligibleForPaid = bool2;
        this.eligibleForReplacement = bool3;
        this.eligibleForRepairReplacement = bool4;
        this.isLoading = z;
        this.error = error;
        this.customerType = str;
        this.posTypeData = list;
        this.posDeviceInfo = list2;
        this.trackPosStatus = str2;
        this.posSummaryViewState = posRequestsSummaryViewState;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PosEligibilityViewData(java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Boolean r17, java.lang.Boolean r18, boolean r19, ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData.Error r20, java.lang.String r21, java.util.List r22, java.util.List r23, java.lang.String r24, ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryViewState r25, int r26, kotlin.p483e0.p485d.DBUtils$1 r27) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.data.PosEligibilityViewData.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, boolean, ai.kudi.agent.pos.ui.data.PosEligibilityViewData$Error, java.lang.String, java.util.List, java.util.List, java.lang.String, ai.kudi.agent.pos.ui.widget.PosRequestsSummaryViewState, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ PosEligibilityViewData copy$default(PosEligibilityViewData posEligibilityViewData, Boolean $r2, Boolean $r3, Boolean $r4, Boolean $r5, boolean $z0, Error $r6, String $r7, List $r8, List $r9, String $r10, PosRequestsSummaryViewState $r11, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = posEligibilityViewData.eligibleForLease;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = posEligibilityViewData.eligibleForPaid;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r4 = posEligibilityViewData.eligibleForReplacement;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r5 = posEligibilityViewData.eligibleForRepairReplacement;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $z0 = posEligibilityViewData.isLoading;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r6 = posEligibilityViewData.error;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r7 = posEligibilityViewData.customerType;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r8 = posEligibilityViewData.posTypeData;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $r9 = posEligibilityViewData.posDeviceInfo;
        }
        int $i110 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i110 != 0) {
            $r10 = posEligibilityViewData.trackPosStatus;
        }
        int $i0 = i & 1024;
        if ($i0 != 0) {
            $r11 = posEligibilityViewData.posSummaryViewState;
        }
        PosEligibilityViewData $r0 = posEligibilityViewData.copy($r2, $r3, $r4, $r5, $z0, $r6, $r7, $r8, $r9, $r10, $r11);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component1() {
        Boolean r1 = this.eligibleForLease;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.trackPosStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosRequestsSummaryViewState component11() {
        PosRequestsSummaryViewState r1 = this.posSummaryViewState;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component2() {
        Boolean r1 = this.eligibleForPaid;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component3() {
        Boolean r1 = this.eligibleForReplacement;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component4() {
        Boolean r1 = this.eligibleForRepairReplacement;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.isLoading;
        return z0;
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
    public final String component7() {
        String r1 = this.customerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component8() {
        List r1 = this.posTypeData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component9() {
        List r1 = this.posDeviceInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosEligibilityViewData copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z, Error error, String str, List list, List list2, String str2, PosRequestsSummaryViewState posRequestsSummaryViewState) {
        PosEligibilityViewData $r0 = new PosEligibilityViewData(bool, bool2, bool3, bool4, z, error, str, list, list2, str2, posRequestsSummaryViewState);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof PosEligibilityViewData;
        if ($z0) {
            PosEligibilityViewData $r2 = (PosEligibilityViewData) obj;
            Boolean $r3 = this.eligibleForLease;
            Boolean $r4 = $r2.eligibleForLease;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                Boolean $r32 = this.eligibleForPaid;
                Boolean $r42 = $r2.eligibleForPaid;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    Boolean $r33 = this.eligibleForReplacement;
                    Boolean $r43 = $r2.eligibleForReplacement;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        Boolean $r34 = this.eligibleForRepairReplacement;
                        Boolean $r44 = $r2.eligibleForRepairReplacement;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            boolean $z06 = this.isLoading;
                            boolean $z1 = $r2.isLoading;
                            if ($z06 != $z1) {
                                return false;
                            }
                            Error $r5 = this.error;
                            Error $r6 = $r2.error;
                            boolean $z07 = Log_OC.append($r5, $r6);
                            if ($z07) {
                                String $r7 = this.customerType;
                                String $r8 = $r2.customerType;
                                boolean $z08 = Log_OC.append($r7, $r8);
                                if ($z08) {
                                    List $r9 = this.posTypeData;
                                    List $r10 = $r2.posTypeData;
                                    boolean $z09 = Log_OC.append($r9, $r10);
                                    if ($z09) {
                                        List $r92 = this.posDeviceInfo;
                                        List $r102 = $r2.posDeviceInfo;
                                        boolean $z010 = Log_OC.append($r92, $r102);
                                        if ($z010) {
                                            String $r72 = this.trackPosStatus;
                                            String $r82 = $r2.trackPosStatus;
                                            boolean $z011 = Log_OC.append($r72, $r82);
                                            if ($z011) {
                                                PosRequestsSummaryViewState $r11 = this.posSummaryViewState;
                                                PosRequestsSummaryViewState $r12 = $r2.posSummaryViewState;
                                                boolean $z012 = Log_OC.append($r11, $r12);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCustomerType() {
        String r1 = this.customerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getEligibleForLease() {
        Boolean r1 = this.eligibleForLease;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getEligibleForPaid() {
        Boolean r1 = this.eligibleForPaid;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getEligibleForRepairReplacement() {
        Boolean r1 = this.eligibleForRepairReplacement;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getEligibleForReplacement() {
        Boolean r1 = this.eligibleForReplacement;
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
    public final List getPosDeviceInfo() {
        List r1 = this.posDeviceInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosRequestsSummaryViewState getPosSummaryViewState() {
        PosRequestsSummaryViewState r1 = this.posSummaryViewState;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getPosTypeData() {
        List r1 = this.posTypeData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTrackPosStatus() {
        String r1 = this.trackPosStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Boolean $r1 = this.eligibleForLease;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        Boolean $r12 = this.eligibleForPaid;
        int $i2 = $r12 == null ? 0 : $r12.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        Boolean $r13 = this.eligibleForReplacement;
        int $i22 = $r13 == null ? 0 : $r13.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        Boolean $r14 = this.eligibleForRepairReplacement;
        int $i23 = $r14 == null ? 0 : $r14.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        boolean $z0 = this.isLoading;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i24 = i;
        int $i16 = ($i15 + $i24) * 31;
        Error $r2 = this.error;
        int $i25 = $r2 == null ? 0 : $r2.hashCode();
        int $i17 = ($i16 + $i25) * 31;
        String $r3 = this.customerType;
        int $i26 = $r3 == null ? 0 : $r3.hashCode();
        int $i18 = ($i17 + $i26) * 31;
        List $r4 = this.posTypeData;
        int $i27 = $r4 == null ? 0 : $r4.hashCode();
        int $i19 = ($i18 + $i27) * 31;
        List $r42 = this.posDeviceInfo;
        int $i28 = $r42 == null ? 0 : $r42.hashCode();
        int $i110 = ($i19 + $i28) * 31;
        String $r32 = this.trackPosStatus;
        int $i29 = $r32 == null ? 0 : $r32.hashCode();
        int $i111 = ($i110 + $i29) * 31;
        PosRequestsSummaryViewState $r5 = this.posSummaryViewState;
        int $i0 = $r5 != null ? $r5.hashCode() : 0;
        return $i111 + $i0;
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
        $r2.append("PosEligibilityViewData(eligibleForLease=");
        Boolean $r3 = this.eligibleForLease;
        $r2.append($r3);
        $r2.append(", eligibleForPaid=");
        Boolean $r32 = this.eligibleForPaid;
        $r2.append($r32);
        $r2.append(", eligibleForReplacement=");
        Boolean $r33 = this.eligibleForReplacement;
        $r2.append($r33);
        $r2.append(", eligibleForRepairReplacement=");
        Boolean $r34 = this.eligibleForRepairReplacement;
        $r2.append($r34);
        $r2.append(", isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", error=");
        Error $r4 = this.error;
        $r2.append($r4);
        $r2.append(", customerType=");
        String $r1 = this.customerType;
        $r2.append((Object) $r1);
        $r2.append(", posTypeData=");
        List $r5 = this.posTypeData;
        $r2.append($r5);
        $r2.append(", posDeviceInfo=");
        List $r52 = this.posDeviceInfo;
        $r2.append($r52);
        $r2.append(", trackPosStatus=");
        String $r12 = this.trackPosStatus;
        $r2.append((Object) $r12);
        $r2.append(", posSummaryViewState=");
        PosRequestsSummaryViewState $r6 = this.posSummaryViewState;
        $r2.append($r6);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }
}
