package ai.kudi.agent.outlet_mgt.viewdata;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CreateOutletViewData.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewdata/StateAndLgaData;", "", "errorViewId", "", "errorText", "", "openSelector", "", "selectorList", "", "stateText", "lgaText", "toastText", "(ILjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorText", "()Ljava/lang/String;", "getErrorViewId", "()I", "getLgaText", "getOpenSelector", "()Z", "getSelectorList", "()Ljava/util/List;", "getStateText", "getToastText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StateAndLgaData {
    private final String errorText;
    private final int errorViewId;
    private final String lgaText;
    private final boolean openSelector;
    private final List<String> selectorList;
    private final String stateText;
    private final String toastText;

    public StateAndLgaData() {
        this(0, null, false, null, null, null, null, 127, null);
    }

    public StateAndLgaData(int i, String str, boolean z, List list, String str2, String str3, String str4) {
        Log_OC.getArray(list, "selectorList");
        this.errorViewId = i;
        this.errorText = str;
        this.openSelector = z;
        this.selectorList = list;
        this.stateText = str2;
        this.lgaText = str3;
        this.toastText = str4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ StateAndLgaData(int r11, java.lang.String r12, boolean r13, java.util.List r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.p483e0.p485d.DBUtils$1 r19) {
        /*
            r10 = this;
            r8 = r18 & 1
            if (r8 == 0) goto L5
            r11 = -1
        L5:
            r8 = r18 & 2
            r9 = 0
            if (r8 == 0) goto Lc
            r12 = 0
            goto Lc
        Lc:
            r8 = r18 & 4
            if (r8 == 0) goto L12
            r13 = 0
            goto L12
        L12:
            r8 = r18 & 8
            if (r8 == 0) goto L1a
            java.util.List r14 = kotlin.p557z.C13722p.m3941e()
        L1a:
            r8 = r18 & 16
            if (r8 == 0) goto L20
            r15 = 0
            goto L20
        L20:
            r8 = r18 & 32
            if (r8 == 0) goto L27
            r16 = 0
            goto L27
        L27:
            r18 = r18 & 64
            if (r18 == 0) goto L2c
            goto L2e
        L2c:
            r9 = r17
        L2e:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewdata.StateAndLgaData.<init>(int, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ StateAndLgaData copy$default(StateAndLgaData stateAndLgaData, int $i0, String $r4, boolean $z0, List $r0, String $r1, String $r2, String $r5, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $i0 = stateAndLgaData.errorViewId;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r4 = stateAndLgaData.errorText;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $z0 = stateAndLgaData.openSelector;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $r0 = stateAndLgaData.selectorList;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $r1 = stateAndLgaData.stateText;
        }
        int $i26 = i & 32;
        if ($i26 != 0) {
            $r2 = stateAndLgaData.lgaText;
        }
        int $i1 = i & 64;
        if ($i1 != 0) {
            $r5 = stateAndLgaData.toastText;
        }
        StateAndLgaData $r3 = stateAndLgaData.copy($i0, $r4, $z0, $r0, $r1, $r2, $r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component1() {
        int i0 = this.errorViewId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.errorText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.openSelector;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component4() {
        List r1 = this.selectorList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.stateText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.lgaText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.toastText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final StateAndLgaData copy(int i, String str, boolean z, List list, String str2, String str3, String str4) {
        Log_OC.getArray(list, "selectorList");
        StateAndLgaData $r0 = new StateAndLgaData(i, str, z, list, str2, str3, str4);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof StateAndLgaData;
        if ($z0) {
            StateAndLgaData $r2 = (StateAndLgaData) obj;
            int $i0 = this.errorViewId;
            int $i1 = $r2.errorViewId;
            if ($i0 != $i1) {
                return false;
            }
            String $r3 = this.errorText;
            String $r4 = $r2.errorText;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                boolean $z03 = this.openSelector;
                boolean $z1 = $r2.openSelector;
                if ($z03 != $z1) {
                    return false;
                }
                List $r5 = this.selectorList;
                List $r6 = $r2.selectorList;
                boolean $z04 = Log_OC.append($r5, $r6);
                if ($z04) {
                    String $r32 = this.stateText;
                    String $r42 = $r2.stateText;
                    boolean $z05 = Log_OC.append($r32, $r42);
                    if ($z05) {
                        String $r33 = this.lgaText;
                        String $r43 = $r2.lgaText;
                        boolean $z06 = Log_OC.append($r33, $r43);
                        if ($z06) {
                            String $r34 = this.toastText;
                            String $r44 = $r2.toastText;
                            boolean $z07 = Log_OC.append($r34, $r44);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getErrorText() {
        String r1 = this.errorText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getErrorViewId() {
        int i0 = this.errorViewId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLgaText() {
        String r1 = this.lgaText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getOpenSelector() {
        boolean z0 = this.openSelector;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getSelectorList() {
        List r1 = this.selectorList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStateText() {
        String r1 = this.stateText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getToastText() {
        String r1 = this.toastText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int $i0 = this.errorViewId;
        int $i1 = $i0 * 31;
        String $r1 = this.errorText;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = ($i1 + $i2) * 31;
        boolean $z0 = this.openSelector;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i22 = i;
        List $r2 = this.selectorList;
        int $i23 = $r2.hashCode();
        int $i13 = ((($i12 + $i22) * 31) + $i23) * 31;
        String $r12 = this.stateText;
        int $i24 = $r12 == null ? 0 : $r12.hashCode();
        int $i14 = ($i13 + $i24) * 31;
        String $r13 = this.lgaText;
        int $i25 = $r13 == null ? 0 : $r13.hashCode();
        int $i15 = ($i14 + $i25) * 31;
        String $r14 = this.toastText;
        int $i02 = $r14 != null ? $r14.hashCode() : 0;
        return $i15 + $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("StateAndLgaData(errorViewId=");
        int $i0 = this.errorViewId;
        $r2.append($i0);
        $r2.append(", errorText=");
        String $r1 = this.errorText;
        $r2.append((Object) $r1);
        $r2.append(", openSelector=");
        boolean $z0 = this.openSelector;
        $r2.append($z0);
        $r2.append(", selectorList=");
        List $r3 = this.selectorList;
        $r2.append($r3);
        $r2.append(", stateText=");
        String $r12 = this.stateText;
        $r2.append((Object) $r12);
        $r2.append(", lgaText=");
        String $r13 = this.lgaText;
        $r2.append((Object) $r13);
        $r2.append(", toastText=");
        String $r14 = this.toastText;
        $r2.append((Object) $r14);
        $r2.append(')');
        String $r15 = $r2.toString();
        return $r15;
    }
}
