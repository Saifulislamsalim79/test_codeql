package ai.kudi.agent.register.p021ui.viewmodels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PersonalInfoViewData.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001'BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "successMessage", "", "isFetching", "", "isLoading", "userProfile", "Lai/kudi/agent/users/domain/dto/User;", "location", "", "Lai/kudi/agent/register/data/models/LocationModel;", "isFetchingLocation", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData$Error;", "(Ljava/lang/String;ZZLai/kudi/agent/users/domain/dto/User;Ljava/util/List;ZLai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData$Error;)V", "getError", "()Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData$Error;", "()Z", "getLocation", "()Ljava/util/List;", "getSuccessMessage", "()Ljava/lang/String;", "getUserProfile", "()Lai/kudi/agent/users/domain/dto/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.data.PersonalInfoViewData */
/* loaded from: classes.dex */
public final class PersonalInfoViewData implements ViewData {
    private final Error error;
    private final boolean isFetching;
    private final boolean isFetchingLocation;
    private final boolean isLoading;
    private final List<LocationModel> location;
    private final String successMessage;
    private final User userProfile;

    /* compiled from: PersonalInfoViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData$Error;", "", "residentialAddress", "", "closestLandmark", "stateError", "lgaError", "genderError", "genericError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClosestLandmark", "()Ljava/lang/String;", "getGenderError", "getGenericError", "getLgaError", "getResidentialAddress", "getStateError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.viewmodels.data.PersonalInfoViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String closestLandmark;
        private final String genderError;
        private final String genericError;
        private final String lgaError;
        private final String residentialAddress;
        private final String stateError;

        public Error() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6) {
            this.residentialAddress = str;
            this.closestLandmark = str2;
            this.stateError = str3;
            this.lgaError = str4;
            this.genderError = str5;
            this.genericError = str6;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.p483e0.p485d.DBUtils$1 r9) {
            /*
                r1 = this;
                r0 = r8 & 1
                if (r0 == 0) goto L6
                r2 = 0
                goto L6
            L6:
                r0 = r8 & 2
                if (r0 == 0) goto Lc
                r3 = 0
                goto Lc
            Lc:
                r0 = r8 & 4
                if (r0 == 0) goto L12
                r4 = 0
                goto L12
            L12:
                r0 = r8 & 8
                if (r0 == 0) goto L18
                r5 = 0
                goto L18
            L18:
                r0 = r8 & 16
                if (r0 == 0) goto L1e
                r6 = 0
                goto L1e
            L1e:
                r8 = r8 & 32
                if (r8 == 0) goto L24
                r7 = 0
                goto L24
            L24:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.viewmodels.data.PersonalInfoViewData.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r4, String $r5, String $r0, String $r1, String $r2, String $r6, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r4 = error.residentialAddress;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r5 = error.closestLandmark;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r0 = error.stateError;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r1 = error.lgaError;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r2 = error.genderError;
            }
            int $i0 = i & 32;
            if ($i0 != 0) {
                $r6 = error.genericError;
            }
            Error $r3 = error.copy($r4, $r5, $r0, $r1, $r2, $r6);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.residentialAddress;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.closestLandmark;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.stateError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.lgaError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.genderError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component6() {
            String r1 = this.genericError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6) {
            Error $r0 = new Error(str, str2, str3, str4, str5, str6);
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
                String $r3 = this.residentialAddress;
                String $r4 = $r2.residentialAddress;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.closestLandmark;
                    String $r42 = $r2.closestLandmark;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.stateError;
                        String $r43 = $r2.stateError;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.lgaError;
                            String $r44 = $r2.lgaError;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.genderError;
                                String $r45 = $r2.genderError;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.genericError;
                                    String $r46 = $r2.genericError;
                                    boolean $z07 = Log_OC.append($r36, $r46);
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
                return false;
            }
            return false;
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
        public final String getGenderError() {
            String r1 = this.genderError;
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
        public final String getLgaError() {
            String r1 = this.lgaError;
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
        public final String getStateError() {
            String r1 = this.stateError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.residentialAddress;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.closestLandmark;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.stateError;
            int $i22 = $r13 == null ? 0 : $r13.hashCode();
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.lgaError;
            int $i23 = $r14 == null ? 0 : $r14.hashCode();
            int $i15 = ($i14 + $i23) * 31;
            String $r15 = this.genderError;
            int $i24 = $r15 == null ? 0 : $r15.hashCode();
            int $i16 = ($i15 + $i24) * 31;
            String $r16 = this.genericError;
            int $i0 = $r16 != null ? $r16.hashCode() : 0;
            return $i16 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(residentialAddress=");
            String $r1 = this.residentialAddress;
            $r2.append((Object) $r1);
            $r2.append(", closestLandmark=");
            String $r12 = this.closestLandmark;
            $r2.append((Object) $r12);
            $r2.append(", stateError=");
            String $r13 = this.stateError;
            $r2.append((Object) $r13);
            $r2.append(", lgaError=");
            String $r14 = this.lgaError;
            $r2.append((Object) $r14);
            $r2.append(", genderError=");
            String $r15 = this.genderError;
            $r2.append((Object) $r15);
            $r2.append(", genericError=");
            String $r16 = this.genericError;
            $r2.append((Object) $r16);
            $r2.append(')');
            String $r17 = $r2.toString();
            return $r17;
        }
    }

    public PersonalInfoViewData() {
        this(null, false, false, null, null, false, null, 127, null);
    }

    public PersonalInfoViewData(String str, boolean z, boolean z2, User user, List list, boolean z3, Error error) {
        Log_OC.getArray(str, "successMessage");
        this.successMessage = str;
        this.isFetching = z;
        this.isLoading = z2;
        this.userProfile = user;
        this.location = list;
        this.isFetchingLocation = z3;
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
    public /* synthetic */ PersonalInfoViewData(java.lang.String r11, boolean r12, boolean r13, ai.kudi.agent.users.domain.package_1.User r14, java.util.List r15, boolean r16, ai.kudi.agent.register.p021ui.viewmodels.data.PersonalInfoViewData.Error r17, int r18, kotlin.p483e0.p485d.DBUtils$1 r19) {
        /*
            r10 = this;
            r8 = r18 & 1
            if (r8 == 0) goto L6
            java.lang.String r11 = ""
        L6:
            r8 = r18 & 2
            r9 = 0
            if (r8 == 0) goto Ld
            r12 = 0
            goto Ld
        Ld:
            r8 = r18 & 4
            if (r8 == 0) goto L13
            r13 = 0
            goto L13
        L13:
            r8 = r18 & 8
            if (r8 == 0) goto L19
            r14 = 0
            goto L19
        L19:
            r8 = r18 & 16
            if (r8 == 0) goto L1f
            r15 = 0
            goto L1f
        L1f:
            r8 = r18 & 32
            if (r8 == 0) goto L24
            goto L26
        L24:
            r9 = r16
        L26:
            r18 = r18 & 64
            if (r18 == 0) goto L2d
            r17 = 0
            goto L2d
        L2d:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r9
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.viewmodels.data.PersonalInfoViewData.<init>(java.lang.String, boolean, boolean, ai.kudi.agent.users.domain.package_1.User, java.util.List, boolean, ai.kudi.agent.register.ui.viewmodels.data.PersonalInfoViewData$Error, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ PersonalInfoViewData copy$default(PersonalInfoViewData personalInfoViewData, String $r3, boolean $z2, boolean $z0, User $r0, List $r1, boolean $z1, Error $r4, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r3 = personalInfoViewData.successMessage;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z2 = personalInfoViewData.isFetching;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z0 = personalInfoViewData.isLoading;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r0 = personalInfoViewData.userProfile;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r1 = personalInfoViewData.location;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $z1 = personalInfoViewData.isFetchingLocation;
        }
        int $i0 = i & 64;
        if ($i0 != 0) {
            $r4 = personalInfoViewData.error;
        }
        PersonalInfoViewData $r2 = personalInfoViewData.copy($r3, $z2, $z0, $r0, $r1, $z1, $r4);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.successMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isFetching;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User component4() {
        User r1 = this.userProfile;
        return r1;
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
    public final boolean component6() {
        boolean z0 = this.isFetchingLocation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component7() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PersonalInfoViewData copy(String str, boolean z, boolean z2, User user, List list, boolean z3, Error error) {
        Log_OC.getArray(str, "successMessage");
        PersonalInfoViewData $r0 = new PersonalInfoViewData(str, z, z2, user, list, z3, error);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof PersonalInfoViewData;
        if ($z0) {
            PersonalInfoViewData $r2 = (PersonalInfoViewData) obj;
            String $r3 = this.successMessage;
            String $r4 = $r2.successMessage;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                boolean $z03 = this.isFetching;
                boolean $z1 = $r2.isFetching;
                if ($z03 != $z1) {
                    return false;
                }
                boolean $z04 = this.isLoading;
                boolean $z12 = $r2.isLoading;
                if ($z04 != $z12) {
                    return false;
                }
                User $r5 = this.userProfile;
                User $r6 = $r2.userProfile;
                boolean $z05 = Log_OC.append($r5, $r6);
                if ($z05) {
                    List $r7 = this.location;
                    List $r8 = $r2.location;
                    boolean $z06 = Log_OC.append($r7, $r8);
                    if ($z06) {
                        boolean $z07 = this.isFetchingLocation;
                        boolean $z13 = $r2.isFetchingLocation;
                        if ($z07 != $z13) {
                            return false;
                        }
                        Error $r9 = this.error;
                        Error $r10 = $r2.error;
                        boolean $z08 = Log_OC.append($r9, $r10);
                        return $z08;
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
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.successMessage;
        int $i0 = $r1.hashCode();
        int $i02 = $i0 * 31;
        boolean $z0 = this.isFetching;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i03 = ($i02 + $i1) * 31;
        boolean $z02 = this.isLoading;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i12 = i2;
        int $i13 = ($i03 + $i12) * 31;
        User $r2 = this.userProfile;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i14 = ($i13 + $i2) * 31;
        List $r3 = this.location;
        int $i22 = $r3 == null ? 0 : $r3.hashCode();
        int $i15 = ($i14 + $i22) * 31;
        boolean $z03 = this.isFetchingLocation;
        int $i23 = $z03 ? 1 : $z03 ? 1 : 0;
        int $i16 = ($i15 + $i23) * 31;
        Error $r4 = this.error;
        int $i04 = $r4 != null ? $r4.hashCode() : 0;
        return $i16 + $i04;
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
        $r2.append("PersonalInfoViewData(successMessage=");
        String $r1 = this.successMessage;
        $r2.append($r1);
        $r2.append(", isFetching=");
        boolean $z0 = this.isFetching;
        $r2.append($z0);
        $r2.append(", isLoading=");
        boolean $z02 = this.isLoading;
        $r2.append($z02);
        $r2.append(", userProfile=");
        User $r3 = this.userProfile;
        $r2.append($r3);
        $r2.append(", location=");
        List $r4 = this.location;
        $r2.append($r4);
        $r2.append(", isFetchingLocation=");
        boolean $z03 = this.isFetchingLocation;
        $r2.append($z03);
        $r2.append(", error=");
        Error $r5 = this.error;
        $r2.append($r5);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
