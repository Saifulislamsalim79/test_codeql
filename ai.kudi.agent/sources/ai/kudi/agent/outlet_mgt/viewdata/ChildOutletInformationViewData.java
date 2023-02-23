package ai.kudi.agent.outlet_mgt.viewdata;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ChildOutletInformationViewData.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0093\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00101\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00066"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewdata/ChildOutletInformationViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "errorViewId", "", "errorText", "", "openSelector", "", "selectorList", "", "stateText", "lgaText", "toastText", "showLoader", "closeScreen", "outletResponse", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "isOutletDetailsLoading", "outletDetailsError", "(ILjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLai/kudi/agent/outlet_mgt/data/Outlet;ZLjava/lang/String;)V", "getCloseScreen", "()Z", "getErrorText", "()Ljava/lang/String;", "getErrorViewId", "()I", "getLgaText", "getOpenSelector", "getOutletDetailsError", "getOutletResponse", "()Lai/kudi/agent/outlet_mgt/data/Outlet;", "getSelectorList", "()Ljava/util/List;", "getShowLoader", "getStateText", "getToastText", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ChildOutletInformationViewData implements ViewData {
    private final boolean closeScreen;
    private final String errorText;
    private final int errorViewId;
    private final boolean isOutletDetailsLoading;
    private final String lgaText;
    private final boolean openSelector;
    private final String outletDetailsError;
    private final Outlet outletResponse;
    private final List<String> selectorList;
    private final boolean showLoader;
    private final String stateText;
    private final String toastText;

    public ChildOutletInformationViewData() {
        this(0, null, false, null, null, null, null, false, false, null, false, null, 4095, null);
    }

    public ChildOutletInformationViewData(int i, String str, boolean z, List list, String str2, String str3, String str4, boolean z2, boolean z3, Outlet outlet, boolean z4, String str5) {
        Log_OC.getArray(list, "selectorList");
        this.errorViewId = i;
        this.errorText = str;
        this.openSelector = z;
        this.selectorList = list;
        this.stateText = str2;
        this.lgaText = str3;
        this.toastText = str4;
        this.showLoader = z2;
        this.closeScreen = z3;
        this.outletResponse = outlet;
        this.isOutletDetailsLoading = z4;
        this.outletDetailsError = str5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ChildOutletInformationViewData(int r17, java.lang.String r18, boolean r19, java.util.List r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, ai.kudi.agent.outlet_mgt.data.Outlet r26, boolean r27, java.lang.String r28, int r29, kotlin.p483e0.p485d.DBUtils$1 r30) {
        /*
            r16 = this;
            r13 = r29 & 1
            if (r13 == 0) goto L7
            r17 = -1
            goto L7
        L7:
            r13 = r29 & 2
            r14 = 0
            if (r13 == 0) goto Lf
            r18 = 0
            goto Lf
        Lf:
            r13 = r29 & 4
            r15 = 0
            if (r13 == 0) goto L17
            r19 = 0
            goto L17
        L17:
            r13 = r29 & 8
            if (r13 == 0) goto L20
            java.util.List r20 = kotlin.p557z.C13722p.m3941e()
            goto L20
        L20:
            r13 = r29 & 16
            if (r13 == 0) goto L27
            r21 = 0
            goto L27
        L27:
            r13 = r29 & 32
            if (r13 == 0) goto L2e
            r22 = 0
            goto L2e
        L2e:
            r13 = r29 & 64
            if (r13 == 0) goto L35
            r23 = 0
            goto L35
        L35:
            r0 = r29
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L3e
            r24 = 0
            goto L3e
        L3e:
            r0 = r29
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L47
            r25 = 0
            goto L47
        L47:
            r0 = r29
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L50
            r26 = 0
            goto L50
        L50:
            r0 = r29
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L57
            goto L59
        L57:
            r15 = r27
        L59:
            r0 = r29
            r0 = r0 & 2048(0x800, float:2.87E-42)
            r29 = r0
            if (r29 == 0) goto L62
            goto L64
        L62:
            r14 = r28
        L64:
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r15
            r12 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewdata.ChildOutletInformationViewData.<init>(int, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, ai.kudi.agent.outlet_mgt.data.Outlet, boolean, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ ChildOutletInformationViewData copy$default(ChildOutletInformationViewData childOutletInformationViewData, int $i1, String $r2, boolean $z0, List $r3, String $r4, String $r5, String $r6, boolean $z1, boolean $z2, Outlet $r7, boolean $z3, String $r8, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $i1 = childOutletInformationViewData.errorViewId;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r2 = childOutletInformationViewData.errorText;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $z0 = childOutletInformationViewData.openSelector;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $r3 = childOutletInformationViewData.selectorList;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $r4 = childOutletInformationViewData.stateText;
        }
        int $i26 = i & 32;
        if ($i26 != 0) {
            $r5 = childOutletInformationViewData.lgaText;
        }
        int $i27 = i & 64;
        if ($i27 != 0) {
            $r6 = childOutletInformationViewData.toastText;
        }
        int $i28 = i & 128;
        if ($i28 != 0) {
            $z1 = childOutletInformationViewData.showLoader;
        }
        int $i29 = i & 256;
        if ($i29 != 0) {
            $z2 = childOutletInformationViewData.closeScreen;
        }
        int $i210 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i210 != 0) {
            $r7 = childOutletInformationViewData.outletResponse;
        }
        int $i211 = i & 1024;
        if ($i211 != 0) {
            $z3 = childOutletInformationViewData.isOutletDetailsLoading;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_INTRA;
        if ($i0 != 0) {
            $r8 = childOutletInformationViewData.outletDetailsError;
        }
        ChildOutletInformationViewData $r0 = childOutletInformationViewData.copy($i1, $r2, $z0, $r3, $r4, $r5, $r6, $z1, $z2, $r7, $z3, $r8);
        return $r0;
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
    public final Outlet component10() {
        Outlet r1 = this.outletResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component11() {
        boolean z0 = this.isOutletDetailsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component12() {
        String r1 = this.outletDetailsError;
        return r1;
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
    public final boolean component8() {
        boolean z0 = this.showLoader;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component9() {
        boolean z0 = this.closeScreen;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ChildOutletInformationViewData copy(int i, String str, boolean z, List list, String str2, String str3, String str4, boolean z2, boolean z3, Outlet outlet, boolean z4, String str5) {
        Log_OC.getArray(list, "selectorList");
        ChildOutletInformationViewData $r0 = new ChildOutletInformationViewData(i, str, z, list, str2, str3, str4, z2, z3, outlet, z4, str5);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof ChildOutletInformationViewData;
        if ($z0) {
            ChildOutletInformationViewData $r2 = (ChildOutletInformationViewData) obj;
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
                            if ($z07) {
                                boolean $z08 = this.showLoader;
                                boolean $z12 = $r2.showLoader;
                                if ($z08 != $z12) {
                                    return false;
                                }
                                boolean $z09 = this.closeScreen;
                                boolean $z13 = $r2.closeScreen;
                                if ($z09 != $z13) {
                                    return false;
                                }
                                Outlet $r7 = this.outletResponse;
                                Outlet $r8 = $r2.outletResponse;
                                boolean $z010 = Log_OC.append($r7, $r8);
                                if ($z010) {
                                    boolean $z011 = this.isOutletDetailsLoading;
                                    boolean $z14 = $r2.isOutletDetailsLoading;
                                    if ($z011 != $z14) {
                                        return false;
                                    }
                                    String $r35 = this.outletDetailsError;
                                    String $r45 = $r2.outletDetailsError;
                                    boolean $z012 = Log_OC.append($r35, $r45);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getCloseScreen() {
        boolean z0 = this.closeScreen;
        return z0;
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
    public final String getOutletDetailsError() {
        String r1 = this.outletDetailsError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Outlet getOutletResponse() {
        Outlet r1 = this.outletResponse;
        return r1;
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
    public final boolean getShowLoader() {
        boolean z0 = this.showLoader;
        return z0;
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
        int $i26 = $r14 == null ? 0 : $r14.hashCode();
        int $i16 = ($i15 + $i26) * 31;
        boolean $z02 = this.showLoader;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i27 = i2;
        int $i17 = ($i16 + $i27) * 31;
        boolean $z03 = this.closeScreen;
        int i3 = $z03;
        if ($z03 != 0) {
            i3 = 1;
        }
        int $i28 = i3;
        int $i18 = ($i17 + $i28) * 31;
        Outlet $r3 = this.outletResponse;
        int $i29 = $r3 == null ? 0 : $r3.hashCode();
        int $i19 = ($i18 + $i29) * 31;
        boolean $z04 = this.isOutletDetailsLoading;
        int $i210 = $z04 ? 1 : $z04 ? 1 : 0;
        int $i110 = ($i19 + $i210) * 31;
        String $r15 = this.outletDetailsError;
        int $i02 = $r15 != null ? $r15.hashCode() : 0;
        return $i110 + $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isOutletDetailsLoading() {
        boolean z0 = this.isOutletDetailsLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ChildOutletInformationViewData(errorViewId=");
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
        $r2.append(", showLoader=");
        boolean $z02 = this.showLoader;
        $r2.append($z02);
        $r2.append(", closeScreen=");
        boolean $z03 = this.closeScreen;
        $r2.append($z03);
        $r2.append(", outletResponse=");
        Outlet $r4 = this.outletResponse;
        $r2.append($r4);
        $r2.append(", isOutletDetailsLoading=");
        boolean $z04 = this.isOutletDetailsLoading;
        $r2.append($z04);
        $r2.append(", outletDetailsError=");
        String $r15 = this.outletDetailsError;
        $r2.append((Object) $r15);
        $r2.append(')');
        String $r16 = $r2.toString();
        return $r16;
    }
}
