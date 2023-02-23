package ai.kudi.agent.settings.personal.p027ui.viewModels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: EditProfileViewData.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isEditingProfile", "", "isFetchinLocation", "location", "", "Lai/kudi/agent/register/data/models/LocationModel;", "successMessage", "", "userProfile", "Lai/kudi/agent/users/domain/dto/User;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData$Error;", "(ZZLjava/util/List;Ljava/lang/String;Lai/kudi/agent/users/domain/dto/User;Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData$Error;)V", "getError", "()Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData$Error;", "()Z", "getLocation", "()Ljava/util/List;", "getSuccessMessage", "()Ljava/lang/String;", "getUserProfile", "()Lai/kudi/agent/users/domain/dto/User;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.data.EditProfileViewData */
/* loaded from: classes.dex */
public final class EditProfileViewData implements ViewData {
    private final Error error;
    private final boolean isEditingProfile;
    private final boolean isFetchinLocation;
    private final List<LocationModel> location;
    private final String successMessage;
    private final User userProfile;

    /* compiled from: EditProfileViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData$Error;", "", "genericMessage", "", "location", "businessAddress", "businessName", "homeAddress", "closestLandmark", SendReceiptToTerminalConfirmationBottomSheet.STATE, "lga", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessAddress", "()Ljava/lang/String;", "getBusinessName", "getClosestLandmark", "getEmail", "getGenericMessage", "getHomeAddress", "getLga", "getLocation", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.data.EditProfileViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String businessAddress;
        private final String businessName;
        private final String closestLandmark;
        private final String email;
        private final String genericMessage;
        private final String homeAddress;

        /* renamed from: id */
        private final String f1449id;
        private final String location;
        private final String state;

        public Error() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.genericMessage = str;
            this.location = str2;
            this.businessAddress = str3;
            this.businessName = str4;
            this.homeAddress = str5;
            this.closestLandmark = str6;
            this.state = str7;
            this.f1449id = str8;
            this.email = str9;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.p483e0.p485d.DBUtils$1 r23) {
            /*
                r12 = this;
                r10 = r22 & 1
                r11 = 0
                if (r10 == 0) goto L7
                r13 = 0
                goto L7
            L7:
                r10 = r22 & 2
                if (r10 == 0) goto Ld
                r14 = 0
                goto Ld
            Ld:
                r10 = r22 & 4
                if (r10 == 0) goto L13
                r15 = 0
                goto L13
            L13:
                r10 = r22 & 8
                if (r10 == 0) goto L1a
                r16 = 0
                goto L1a
            L1a:
                r10 = r22 & 16
                if (r10 == 0) goto L21
                r17 = 0
                goto L21
            L21:
                r10 = r22 & 32
                if (r10 == 0) goto L28
                r18 = 0
                goto L28
            L28:
                r10 = r22 & 64
                if (r10 == 0) goto L2f
                r19 = 0
                goto L2f
            L2f:
                r0 = r22
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L38
                r20 = 0
                goto L38
            L38:
                r0 = r22
                r0 = r0 & 256(0x100, float:3.59E-43)
                r22 = r0
                if (r22 == 0) goto L41
                goto L43
            L41:
                r11 = r21
            L43:
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.data.EditProfileViewData.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r2, String $r3, String $r4, String $r5, String $r6, String $r7, String $r8, String $r9, String $r10, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = error.genericMessage;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = error.location;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r4 = error.businessAddress;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r5 = error.businessName;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r6 = error.homeAddress;
            }
            int $i16 = i & 32;
            if ($i16 != 0) {
                $r7 = error.closestLandmark;
            }
            int $i17 = i & 64;
            if ($i17 != 0) {
                $r8 = error.state;
            }
            int $i18 = i & 128;
            if ($i18 != 0) {
                $r9 = error.f1449id;
            }
            int $i0 = i & 256;
            if ($i0 != 0) {
                $r10 = error.email;
            }
            Error $r0 = error.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.genericMessage;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.location;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.businessAddress;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.businessName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.homeAddress;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component6() {
            String r1 = this.closestLandmark;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component7() {
            String r1 = this.state;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component8() {
            String r1 = this.f1449id;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component9() {
            String r1 = this.email;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            Error $r0 = new Error(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
                String $r3 = this.genericMessage;
                String $r4 = $r2.genericMessage;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.location;
                    String $r42 = $r2.location;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.businessAddress;
                        String $r43 = $r2.businessAddress;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.businessName;
                            String $r44 = $r2.businessName;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.homeAddress;
                                String $r45 = $r2.homeAddress;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.closestLandmark;
                                    String $r46 = $r2.closestLandmark;
                                    boolean $z07 = Log_OC.append($r36, $r46);
                                    if ($z07) {
                                        String $r37 = this.state;
                                        String $r47 = $r2.state;
                                        boolean $z08 = Log_OC.append($r37, $r47);
                                        if ($z08) {
                                            String $r38 = this.f1449id;
                                            String $r48 = $r2.f1449id;
                                            boolean $z09 = Log_OC.append($r38, $r48);
                                            if ($z09) {
                                                String $r39 = this.email;
                                                String $r49 = $r2.email;
                                                boolean $z010 = Log_OC.append($r39, $r49);
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
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessAddress() {
            String r1 = this.businessAddress;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBusinessName() {
            String r1 = this.businessName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getClosestLandmark() {
            String r1 = this.closestLandmark;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getEmail() {
            String r1 = this.email;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getGenericMessage() {
            String r1 = this.genericMessage;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getHomeAddress() {
            String r1 = this.homeAddress;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getLga() {
            String r1 = this.f1449id;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getLocation() {
            String r1 = this.location;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getState() {
            String r1 = this.state;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.genericMessage;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.location;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.businessAddress;
            int $i22 = $r13 == null ? 0 : $r13.hashCode();
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.businessName;
            int $i23 = $r14 == null ? 0 : $r14.hashCode();
            int $i15 = ($i14 + $i23) * 31;
            String $r15 = this.homeAddress;
            int $i24 = $r15 == null ? 0 : $r15.hashCode();
            int $i16 = ($i15 + $i24) * 31;
            String $r16 = this.closestLandmark;
            int $i25 = $r16 == null ? 0 : $r16.hashCode();
            int $i17 = ($i16 + $i25) * 31;
            String $r17 = this.state;
            int $i26 = $r17 == null ? 0 : $r17.hashCode();
            int $i18 = ($i17 + $i26) * 31;
            String $r18 = this.f1449id;
            int $i27 = $r18 == null ? 0 : $r18.hashCode();
            int $i19 = ($i18 + $i27) * 31;
            String $r19 = this.email;
            int $i0 = $r19 != null ? $r19.hashCode() : 0;
            return $i19 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(genericMessage=");
            String $r1 = this.genericMessage;
            $r2.append((Object) $r1);
            $r2.append(", location=");
            String $r12 = this.location;
            $r2.append((Object) $r12);
            $r2.append(", businessAddress=");
            String $r13 = this.businessAddress;
            $r2.append((Object) $r13);
            $r2.append(", businessName=");
            String $r14 = this.businessName;
            $r2.append((Object) $r14);
            $r2.append(", homeAddress=");
            String $r15 = this.homeAddress;
            $r2.append((Object) $r15);
            $r2.append(", closestLandmark=");
            String $r16 = this.closestLandmark;
            $r2.append((Object) $r16);
            $r2.append(", state=");
            String $r17 = this.state;
            $r2.append((Object) $r17);
            $r2.append(", lga=");
            String $r18 = this.f1449id;
            $r2.append((Object) $r18);
            $r2.append(", email=");
            String $r19 = this.email;
            $r2.append((Object) $r19);
            $r2.append(')');
            String $r110 = $r2.toString();
            return $r110;
        }
    }

    public EditProfileViewData(boolean z, boolean z2, List list, String str, User user, Error error) {
        this.isEditingProfile = z;
        this.isFetchinLocation = z2;
        this.location = list;
        this.successMessage = str;
        this.userProfile = user;
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
    public /* synthetic */ EditProfileViewData(boolean r2, boolean r3, java.util.List r4, java.lang.String r5, ai.kudi.agent.users.domain.package_1.User r6, ai.kudi.agent.settings.personal.p027ui.viewModels.data.EditProfileViewData.Error r7, int r8, kotlin.p483e0.p485d.DBUtils$1 r9) {
        /*
            r1 = this;
            r0 = r8 & 16
            if (r0 == 0) goto L6
            r6 = 0
            goto L6
        L6:
            r8 = r8 & 32
            if (r8 == 0) goto Lc
            r7 = 0
            goto Lc
        Lc:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.data.EditProfileViewData.<init>(boolean, boolean, java.util.List, java.lang.String, ai.kudi.agent.users.domain.package_1.User, ai.kudi.agent.settings.personal.ui.viewModels.data.EditProfileViewData$Error, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ EditProfileViewData copy$default(EditProfileViewData editProfileViewData, boolean $z0, boolean $z1, List $r0, String $r1, User $r2, Error $r4, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = editProfileViewData.isEditingProfile;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z1 = editProfileViewData.isFetchinLocation;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r0 = editProfileViewData.location;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r1 = editProfileViewData.successMessage;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r2 = editProfileViewData.userProfile;
        }
        int $i0 = i & 32;
        if ($i0 != 0) {
            $r4 = editProfileViewData.error;
        }
        EditProfileViewData $r3 = editProfileViewData.copy($z0, $z1, $r0, $r1, $r2, $r4);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isEditingProfile;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isFetchinLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component3() {
        List r1 = this.location;
        return r1;
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
    public final Error component6() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EditProfileViewData copy(boolean z, boolean z2, List list, String str, User user, Error error) {
        EditProfileViewData $r0 = new EditProfileViewData(z, z2, list, str, user, error);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof EditProfileViewData;
        if ($z0) {
            EditProfileViewData $r2 = (EditProfileViewData) obj;
            boolean $z02 = this.isEditingProfile;
            boolean $z1 = $r2.isEditingProfile;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isFetchinLocation;
            boolean $z12 = $r2.isFetchinLocation;
            if ($z03 != $z12) {
                return false;
            }
            List $r3 = this.location;
            List $r4 = $r2.location;
            boolean $z04 = Log_OC.append($r3, $r4);
            if ($z04) {
                String $r5 = this.successMessage;
                String $r6 = $r2.successMessage;
                boolean $z05 = Log_OC.append($r5, $r6);
                if ($z05) {
                    User $r7 = this.userProfile;
                    User $r8 = $r2.userProfile;
                    boolean $z06 = Log_OC.append($r7, $r8);
                    if ($z06) {
                        Error $r9 = this.error;
                        Error $r10 = $r2.error;
                        boolean $z07 = Log_OC.append($r9, $r10);
                        return $z07;
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
    public int hashCode() {
        boolean $z0 = this.isEditingProfile;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.isFetchinLocation;
        int $i1 = $z02 ? 1 : $z02 ? 1 : 0;
        int $i12 = ($i02 + $i1) * 31;
        List $r1 = this.location;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        String $r2 = this.successMessage;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        User $r3 = this.userProfile;
        int $i23 = $r3 == null ? 0 : $r3.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        Error $r4 = this.error;
        int $i03 = $r4 != null ? $r4.hashCode() : 0;
        return $i15 + $i03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isEditingProfile() {
        boolean z0 = this.isEditingProfile;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isFetchinLocation() {
        boolean z0 = this.isFetchinLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("EditProfileViewData(isEditingProfile=");
        boolean $z0 = this.isEditingProfile;
        $r2.append($z0);
        $r2.append(", isFetchinLocation=");
        boolean $z02 = this.isFetchinLocation;
        $r2.append($z02);
        $r2.append(", location=");
        List $r3 = this.location;
        $r2.append($r3);
        $r2.append(", successMessage=");
        String $r1 = this.successMessage;
        $r2.append((Object) $r1);
        $r2.append(", userProfile=");
        User $r4 = this.userProfile;
        $r2.append($r4);
        $r2.append(", error=");
        Error $r5 = this.error;
        $r2.append($r5);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
