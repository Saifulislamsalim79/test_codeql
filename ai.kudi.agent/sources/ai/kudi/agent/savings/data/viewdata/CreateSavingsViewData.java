package ai.kudi.agent.savings.data.viewdata;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CreateSavingsViewData.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Duration", "Error", "Initial", "IsValidParams", "ShowProgress", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Initial;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$ShowProgress;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Error;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$IsValidParams;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Duration;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CreateSavingsViewData implements ViewData {

    /* compiled from: CreateSavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Duration;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "planDuration", "", "", "(Ljava/util/List;)V", "getPlanDuration", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Duration extends CreateSavingsViewData {
        private final List<String> planDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Duration(List list) {
            super(null);
            Log_OC.getArray(list, "planDuration");
            this.planDuration = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Duration copy$default(Duration duration, List $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = duration.planDuration;
            }
            Duration $r1 = duration.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component1() {
            List r1 = this.planDuration;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Duration copy(List list) {
            Log_OC.getArray(list, "planDuration");
            Duration $r0 = new Duration(list);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Duration;
            if ($z0) {
                Duration $r2 = (Duration) obj;
                List $r3 = this.planDuration;
                List $r4 = $r2.planDuration;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getPlanDuration() {
            List r1 = this.planDuration;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            List $r1 = this.planDuration;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Duration(planDuration=");
            List $r3 = this.planDuration;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: CreateSavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Error;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "nameError", "", "durationError", "amountError", "startDateError", "lockError", "frequencyError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmountError", "()Ljava/lang/String;", "getDurationError", "getFrequencyError", "getLockError", "getNameError", "getStartDateError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Error extends CreateSavingsViewData {
        private final String amountError;
        private final String durationError;
        private final String frequencyError;
        private final String lockError;
        private final String nameError;
        private final String startDateError;

        public Error() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            this.nameError = str;
            this.durationError = str2;
            this.amountError = str3;
            this.startDateError = str4;
            this.lockError = str5;
            this.frequencyError = str6;
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r4, String $r5, String $r0, String $r1, String $r2, String $r6, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r4 = error.nameError;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r5 = error.durationError;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r0 = error.amountError;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r1 = error.startDateError;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r2 = error.lockError;
            }
            int $i0 = i & 32;
            if ($i0 != 0) {
                $r6 = error.frequencyError;
            }
            Error $r3 = error.copy($r4, $r5, $r0, $r1, $r2, $r6);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.nameError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.durationError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.amountError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.startDateError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.lockError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component6() {
            String r1 = this.frequencyError;
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
                String $r3 = this.nameError;
                String $r4 = $r2.nameError;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.durationError;
                    String $r42 = $r2.durationError;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.amountError;
                        String $r43 = $r2.amountError;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.startDateError;
                            String $r44 = $r2.startDateError;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.lockError;
                                String $r45 = $r2.lockError;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.frequencyError;
                                    String $r46 = $r2.frequencyError;
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
        public final String getAmountError() {
            String r1 = this.amountError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getDurationError() {
            String r1 = this.durationError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getFrequencyError() {
            String r1 = this.frequencyError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getLockError() {
            String r1 = this.lockError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getNameError() {
            String r1 = this.nameError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getStartDateError() {
            String r1 = this.startDateError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.nameError;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.durationError;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.amountError;
            int $i22 = $r13 == null ? 0 : $r13.hashCode();
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.startDateError;
            int $i23 = $r14 == null ? 0 : $r14.hashCode();
            int $i15 = ($i14 + $i23) * 31;
            String $r15 = this.lockError;
            int $i24 = $r15 == null ? 0 : $r15.hashCode();
            int $i16 = ($i15 + $i24) * 31;
            String $r16 = this.frequencyError;
            int $i0 = $r16 != null ? $r16.hashCode() : 0;
            return $i16 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(nameError=");
            String $r1 = this.nameError;
            $r2.append((Object) $r1);
            $r2.append(", durationError=");
            String $r12 = this.durationError;
            $r2.append((Object) $r12);
            $r2.append(", amountError=");
            String $r13 = this.amountError;
            $r2.append((Object) $r13);
            $r2.append(", startDateError=");
            String $r14 = this.startDateError;
            $r2.append((Object) $r14);
            $r2.append(", lockError=");
            String $r15 = this.lockError;
            $r2.append((Object) $r15);
            $r2.append(", frequencyError=");
            String $r16 = this.frequencyError;
            $r2.append((Object) $r16);
            $r2.append(')');
            String $r17 = $r2.toString();
            return $r17;
        }
    }

    /* compiled from: CreateSavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Initial;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "()V", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Initial extends CreateSavingsViewData {
        public static final Initial INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Initial $r0 = new Initial();
            INSTANCE = $r0;
        }

        private Initial() {
            super(null);
        }
    }

    /* compiled from: CreateSavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$IsValidParams;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "savingsModel", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "(Lai/kudi/agent/savings/data/model/CreateSavingsModel;)V", "getSavingsModel", "()Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IsValidParams extends CreateSavingsViewData {
        private final CreateSavingsModel savingsModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IsValidParams(CreateSavingsModel createSavingsModel) {
            super(null);
            Log_OC.getArray(createSavingsModel, "savingsModel");
            this.savingsModel = createSavingsModel;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ IsValidParams copy$default(IsValidParams isValidParams, CreateSavingsModel $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = isValidParams.savingsModel;
            }
            IsValidParams $r1 = isValidParams.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreateSavingsModel component1() {
            CreateSavingsModel r1 = this.savingsModel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final IsValidParams copy(CreateSavingsModel createSavingsModel) {
            Log_OC.getArray(createSavingsModel, "savingsModel");
            IsValidParams $r0 = new IsValidParams(createSavingsModel);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof IsValidParams;
            if ($z0) {
                IsValidParams $r2 = (IsValidParams) obj;
                CreateSavingsModel $r3 = this.savingsModel;
                CreateSavingsModel $r4 = $r2.savingsModel;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreateSavingsModel getSavingsModel() {
            CreateSavingsModel r1 = this.savingsModel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            CreateSavingsModel $r1 = this.savingsModel;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("IsValidParams(savingsModel=");
            CreateSavingsModel $r3 = this.savingsModel;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: CreateSavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$ShowProgress;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "visibility", "", "(Z)V", "getVisibility", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ShowProgress extends CreateSavingsViewData {
        private final boolean visibility;

        public ShowProgress(boolean z) {
            super(null);
            this.visibility = z;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ ShowProgress copy$default(ShowProgress showProgress, boolean $z0, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = showProgress.visibility;
            }
            ShowProgress $r1 = showProgress.copy($z0);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean z0 = this.visibility;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ShowProgress copy(boolean z) {
            ShowProgress $r0 = new ShowProgress(z);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof ShowProgress;
            if ($z0) {
                ShowProgress $r2 = (ShowProgress) obj;
                boolean $z02 = this.visibility;
                boolean $z1 = $r2.visibility;
                return $z02 == $z1;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean getVisibility() {
            boolean z0 = this.visibility;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = this.visibility;
            if ($z0) {
                return 1;
            }
            return $z0 ? 1 : 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("ShowProgress(visibility=");
            boolean $z0 = this.visibility;
            $r2.append($z0);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    private CreateSavingsViewData() {
    }

    public /* synthetic */ CreateSavingsViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
