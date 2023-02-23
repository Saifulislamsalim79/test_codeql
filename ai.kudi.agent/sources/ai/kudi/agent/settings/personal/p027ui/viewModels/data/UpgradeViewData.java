package ai.kudi.agent.settings.personal.p027ui.viewModels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.domain.useCases.UpgradeKycResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: UpgradeViewData.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isUpgrading", "", "upgradeResponse", "Lai/kudi/agent/settings/domain/useCases/UpgradeKycResponse;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData$Error;", "identityNumberType", "", "isNextOfKinPhoneInComplete", "isIdCardNumberEmpty", "isNextOfKinNameEmpty", "isPicUrlEmpty", "(ZLai/kudi/agent/settings/domain/useCases/UpgradeKycResponse;Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData$Error;Ljava/lang/String;ZZZZ)V", "getError", "()Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData$Error;", "getIdentityNumberType", "()Ljava/lang/String;", "()Z", "getUpgradeResponse", "()Lai/kudi/agent/settings/domain/useCases/UpgradeKycResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.data.UpgradeViewData */
/* loaded from: classes.dex */
public final class UpgradeViewData implements ViewData {
    private final Error error;
    private final String identityNumberType;
    private final boolean isIdCardNumberEmpty;
    private final boolean isNextOfKinNameEmpty;
    private final boolean isNextOfKinPhoneInComplete;
    private final boolean isPicUrlEmpty;
    private final boolean isUpgrading;
    private final UpgradeKycResponse upgradeResponse;

    /* compiled from: UpgradeViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData$Error;", "", "nextOfKinPhoneNo", "", "verificationNo", "residentialAddress", "nextOfKinName", "idType", "idNo", "billUrl", "upgradeError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillUrl", "()Ljava/lang/String;", "getIdNo", "getIdType", "getNextOfKinName", "getNextOfKinPhoneNo", "getResidentialAddress", "getUpgradeError", "setUpgradeError", "(Ljava/lang/String;)V", "getVerificationNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.data.UpgradeViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String billUrl;
        private final String idNo;
        private final String idType;
        private final String nextOfKinName;
        private final String nextOfKinPhoneNo;
        private final String residentialAddress;
        private String upgradeError;
        private final String verificationNo;

        public Error() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.nextOfKinPhoneNo = str;
            this.verificationNo = str2;
            this.residentialAddress = str3;
            this.nextOfKinName = str4;
            this.idType = str5;
            this.idNo = str6;
            this.billUrl = str7;
            this.upgradeError = str8;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.p483e0.p485d.DBUtils$1 r21) {
            /*
                r11 = this;
                r9 = r20 & 1
                r10 = 0
                if (r9 == 0) goto L7
                r12 = 0
                goto L7
            L7:
                r9 = r20 & 2
                if (r9 == 0) goto Ld
                r13 = 0
                goto Ld
            Ld:
                r9 = r20 & 4
                if (r9 == 0) goto L13
                r14 = 0
                goto L13
            L13:
                r9 = r20 & 8
                if (r9 == 0) goto L19
                r15 = 0
                goto L19
            L19:
                r9 = r20 & 16
                if (r9 == 0) goto L20
                r16 = 0
                goto L20
            L20:
                r9 = r20 & 32
                if (r9 == 0) goto L27
                r17 = 0
                goto L27
            L27:
                r9 = r20 & 64
                if (r9 == 0) goto L2e
                r18 = 0
                goto L2e
            L2e:
                r0 = r20
                r0 = r0 & 128(0x80, float:1.794E-43)
                r20 = r0
                if (r20 == 0) goto L37
                goto L39
            L37:
                r10 = r19
            L39:
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.data.UpgradeViewData.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r2, String $r3, String $r4, String $r5, String $r6, String $r7, String $r8, String $r9, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = error.nextOfKinPhoneNo;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = error.verificationNo;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r4 = error.residentialAddress;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r5 = error.nextOfKinName;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r6 = error.idType;
            }
            int $i16 = i & 32;
            if ($i16 != 0) {
                $r7 = error.idNo;
            }
            int $i17 = i & 64;
            if ($i17 != 0) {
                $r8 = error.billUrl;
            }
            int $i0 = i & 128;
            if ($i0 != 0) {
                $r9 = error.upgradeError;
            }
            Error $r0 = error.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.nextOfKinPhoneNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.verificationNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.residentialAddress;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.nextOfKinName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.idType;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component6() {
            String r1 = this.idNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component7() {
            String r1 = this.billUrl;
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
        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            Error $r0 = new Error(str, str2, str3, str4, str5, str6, str7, str8);
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
                String $r3 = this.nextOfKinPhoneNo;
                String $r4 = $r2.nextOfKinPhoneNo;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.verificationNo;
                    String $r42 = $r2.verificationNo;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.residentialAddress;
                        String $r43 = $r2.residentialAddress;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.nextOfKinName;
                            String $r44 = $r2.nextOfKinName;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.idType;
                                String $r45 = $r2.idType;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.idNo;
                                    String $r46 = $r2.idNo;
                                    boolean $z07 = Log_OC.append($r36, $r46);
                                    if ($z07) {
                                        String $r37 = this.billUrl;
                                        String $r47 = $r2.billUrl;
                                        boolean $z08 = Log_OC.append($r37, $r47);
                                        if ($z08) {
                                            String $r38 = this.upgradeError;
                                            String $r48 = $r2.upgradeError;
                                            boolean $z09 = Log_OC.append($r38, $r48);
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
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBillUrl() {
            String r1 = this.billUrl;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getIdNo() {
            String r1 = this.idNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getIdType() {
            String r1 = this.idType;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getNextOfKinName() {
            String r1 = this.nextOfKinName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getNextOfKinPhoneNo() {
            String r1 = this.nextOfKinPhoneNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getResidentialAddress() {
            String r1 = this.residentialAddress;
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
        public final String getVerificationNo() {
            String r1 = this.verificationNo;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.nextOfKinPhoneNo;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.verificationNo;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.residentialAddress;
            int $i22 = $r13 == null ? 0 : $r13.hashCode();
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.nextOfKinName;
            int $i23 = $r14 == null ? 0 : $r14.hashCode();
            int $i15 = ($i14 + $i23) * 31;
            String $r15 = this.idType;
            int $i24 = $r15 == null ? 0 : $r15.hashCode();
            int $i16 = ($i15 + $i24) * 31;
            String $r16 = this.idNo;
            int $i25 = $r16 == null ? 0 : $r16.hashCode();
            int $i17 = ($i16 + $i25) * 31;
            String $r17 = this.billUrl;
            int $i26 = $r17 == null ? 0 : $r17.hashCode();
            int $i18 = ($i17 + $i26) * 31;
            String $r18 = this.upgradeError;
            int $i0 = $r18 != null ? $r18.hashCode() : 0;
            return $i18 + $i0;
        }

        public final void setUpgradeError(String str) {
            this.upgradeError = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(nextOfKinPhoneNo=");
            String $r1 = this.nextOfKinPhoneNo;
            $r2.append((Object) $r1);
            $r2.append(", verificationNo=");
            String $r12 = this.verificationNo;
            $r2.append((Object) $r12);
            $r2.append(", residentialAddress=");
            String $r13 = this.residentialAddress;
            $r2.append((Object) $r13);
            $r2.append(", nextOfKinName=");
            String $r14 = this.nextOfKinName;
            $r2.append((Object) $r14);
            $r2.append(", idType=");
            String $r15 = this.idType;
            $r2.append((Object) $r15);
            $r2.append(", idNo=");
            String $r16 = this.idNo;
            $r2.append((Object) $r16);
            $r2.append(", billUrl=");
            String $r17 = this.billUrl;
            $r2.append((Object) $r17);
            $r2.append(", upgradeError=");
            String $r18 = this.upgradeError;
            $r2.append((Object) $r18);
            $r2.append(')');
            String $r19 = $r2.toString();
            return $r19;
        }
    }

    public UpgradeViewData(boolean z, UpgradeKycResponse upgradeKycResponse, Error error, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isUpgrading = z;
        this.upgradeResponse = upgradeKycResponse;
        this.error = error;
        this.identityNumberType = str;
        this.isNextOfKinPhoneInComplete = z2;
        this.isIdCardNumberEmpty = z3;
        this.isNextOfKinNameEmpty = z4;
        this.isPicUrlEmpty = z5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UpgradeViewData(boolean r2, ai.kudi.agent.settings.domain.useCases.UpgradeKycResponse r3, ai.kudi.agent.settings.personal.p027ui.viewModels.data.UpgradeViewData.Error r4, java.lang.String r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.p483e0.p485d.DBUtils$1 r11) {
        /*
            r1 = this;
            r0 = r10 & 4
            if (r0 == 0) goto L6
            r4 = 0
            goto L6
        L6:
            r0 = r10 & 8
            if (r0 == 0) goto Lc
            r5 = 0
            goto Lc
        Lc:
            r0 = r10 & 16
            if (r0 == 0) goto L12
            r6 = 1
            goto L12
        L12:
            r0 = r10 & 32
            if (r0 == 0) goto L18
            r7 = 1
            goto L18
        L18:
            r0 = r10 & 64
            if (r0 == 0) goto L1e
            r8 = 1
            goto L1e
        L1e:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L24
            r9 = 1
            goto L24
        L24:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.data.UpgradeViewData.<init>(boolean, ai.kudi.agent.settings.domain.useCases.UpgradeKycResponse, ai.kudi.agent.settings.personal.ui.viewModels.data.UpgradeViewData$Error, java.lang.String, boolean, boolean, boolean, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ UpgradeViewData copy$default(UpgradeViewData upgradeViewData, boolean $z0, UpgradeKycResponse $r2, Error $r3, String $r4, boolean $z1, boolean $z2, boolean $z3, boolean $z4, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = upgradeViewData.isUpgrading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = upgradeViewData.upgradeResponse;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r3 = upgradeViewData.error;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r4 = upgradeViewData.identityNumberType;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $z1 = upgradeViewData.isNextOfKinPhoneInComplete;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $z2 = upgradeViewData.isIdCardNumberEmpty;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z3 = upgradeViewData.isNextOfKinNameEmpty;
        }
        int $i0 = i & 128;
        if ($i0 != 0) {
            $z4 = upgradeViewData.isPicUrlEmpty;
        }
        UpgradeViewData $r0 = upgradeViewData.copy($z0, $r2, $r3, $r4, $z1, $z2, $z3, $z4);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isUpgrading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UpgradeKycResponse component2() {
        UpgradeKycResponse r1 = this.upgradeResponse;
        return r1;
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
    public final String component4() {
        String r1 = this.identityNumberType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.isNextOfKinPhoneInComplete;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component6() {
        boolean z0 = this.isIdCardNumberEmpty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component7() {
        boolean z0 = this.isNextOfKinNameEmpty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component8() {
        boolean z0 = this.isPicUrlEmpty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UpgradeViewData copy(boolean z, UpgradeKycResponse upgradeKycResponse, Error error, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        UpgradeViewData $r0 = new UpgradeViewData(z, upgradeKycResponse, error, str, z2, z3, z4, z5);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof UpgradeViewData;
        if ($z0) {
            UpgradeViewData $r2 = (UpgradeViewData) obj;
            boolean $z02 = this.isUpgrading;
            boolean $z1 = $r2.isUpgrading;
            if ($z02 != $z1) {
                return false;
            }
            UpgradeKycResponse $r3 = this.upgradeResponse;
            UpgradeKycResponse $r4 = $r2.upgradeResponse;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                Error $r5 = this.error;
                Error $r6 = $r2.error;
                boolean $z04 = Log_OC.append($r5, $r6);
                if ($z04) {
                    String $r7 = this.identityNumberType;
                    String $r8 = $r2.identityNumberType;
                    boolean $z05 = Log_OC.append($r7, $r8);
                    if ($z05) {
                        boolean $z06 = this.isNextOfKinPhoneInComplete;
                        boolean $z12 = $r2.isNextOfKinPhoneInComplete;
                        if ($z06 != $z12) {
                            return false;
                        }
                        boolean $z07 = this.isIdCardNumberEmpty;
                        boolean $z13 = $r2.isIdCardNumberEmpty;
                        if ($z07 != $z13) {
                            return false;
                        }
                        boolean $z08 = this.isNextOfKinNameEmpty;
                        boolean $z14 = $r2.isNextOfKinNameEmpty;
                        if ($z08 != $z14) {
                            return false;
                        }
                        boolean $z09 = this.isPicUrlEmpty;
                        boolean $z15 = $r2.isPicUrlEmpty;
                        return $z09 == $z15;
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
    public final String getIdentityNumberType() {
        String r1 = this.identityNumberType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UpgradeKycResponse getUpgradeResponse() {
        UpgradeKycResponse r1 = this.upgradeResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isUpgrading;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        UpgradeKycResponse $r1 = this.upgradeResponse;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        Error $r2 = this.error;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i03 = ($i02 + $i22) * 31;
        String $r3 = this.identityNumberType;
        int $i12 = $r3 != null ? $r3.hashCode() : 0;
        int $i13 = ($i03 + $i12) * 31;
        boolean $z02 = this.isNextOfKinPhoneInComplete;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i04 = i;
        int $i14 = ($i13 + $i04) * 31;
        boolean $z03 = this.isIdCardNumberEmpty;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i05 = i2;
        int $i15 = ($i14 + $i05) * 31;
        boolean $z04 = this.isNextOfKinNameEmpty;
        int i3 = $z04;
        if ($z04 != 0) {
            i3 = 1;
        }
        int $i06 = i3;
        int $i16 = ($i15 + $i06) * 31;
        boolean $z05 = this.isPicUrlEmpty;
        int $i07 = $z05 ? 1 : $z05 ? 1 : 0;
        return $i16 + $i07;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isIdCardNumberEmpty() {
        boolean z0 = this.isIdCardNumberEmpty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNextOfKinNameEmpty() {
        boolean z0 = this.isNextOfKinNameEmpty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNextOfKinPhoneInComplete() {
        boolean z0 = this.isNextOfKinPhoneInComplete;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isPicUrlEmpty() {
        boolean z0 = this.isPicUrlEmpty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isUpgrading() {
        boolean z0 = this.isUpgrading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("UpgradeViewData(isUpgrading=");
        boolean $z0 = this.isUpgrading;
        $r2.append($z0);
        $r2.append(", upgradeResponse=");
        UpgradeKycResponse $r3 = this.upgradeResponse;
        $r2.append($r3);
        $r2.append(", error=");
        Error $r4 = this.error;
        $r2.append($r4);
        $r2.append(", identityNumberType=");
        String $r1 = this.identityNumberType;
        $r2.append((Object) $r1);
        $r2.append(", isNextOfKinPhoneInComplete=");
        boolean $z02 = this.isNextOfKinPhoneInComplete;
        $r2.append($z02);
        $r2.append(", isIdCardNumberEmpty=");
        boolean $z03 = this.isIdCardNumberEmpty;
        $r2.append($z03);
        $r2.append(", isNextOfKinNameEmpty=");
        boolean $z04 = this.isNextOfKinNameEmpty;
        $r2.append($z04);
        $r2.append(", isPicUrlEmpty=");
        boolean $z05 = this.isPicUrlEmpty;
        $r2.append($z05);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
