package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.outlet_mgt.data.OutletResetPinResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletSecurityViewModel.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003J\\\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isSuspendingOutlet", "", "isLoading", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/outlet_mgt/viewmodels/SuspendError;", "isOutletSuspended", "isUnsuspendingOutlet", "resetPinResponse", "Lai/kudi/agent/outlet_mgt/data/OutletResetPinResponse;", "outletResetPinError", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinError;", "(ZZLai/kudi/agent/outlet_mgt/viewmodels/SuspendError;Ljava/lang/Boolean;ZLai/kudi/agent/outlet_mgt/data/OutletResetPinResponse;Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinError;)V", "getError", "()Lai/kudi/agent/outlet_mgt/viewmodels/SuspendError;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOutletResetPinError", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinError;", "getResetPinResponse", "()Lai/kudi/agent/outlet_mgt/data/OutletResetPinResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZZLai/kudi/agent/outlet_mgt/viewmodels/SuspendError;Ljava/lang/Boolean;ZLai/kudi/agent/outlet_mgt/data/OutletResetPinResponse;Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinError;)Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewData;", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletSecurityViewData implements ViewData {
    private final SuspendError error;
    private final boolean isLoading;
    private final Boolean isOutletSuspended;
    private final boolean isSuspendingOutlet;
    private final boolean isUnsuspendingOutlet;
    private final OutletResetPinError outletResetPinError;
    private final OutletResetPinResponse resetPinResponse;

    public OutletSecurityViewData() {
        this(false, false, null, null, false, null, null, 127, null);
    }

    public OutletSecurityViewData(boolean z, boolean z2, SuspendError suspendError, Boolean bool, boolean z3, OutletResetPinResponse outletResetPinResponse, OutletResetPinError outletResetPinError) {
        this.isSuspendingOutlet = z;
        this.isLoading = z2;
        this.error = suspendError;
        this.isOutletSuspended = bool;
        this.isUnsuspendingOutlet = z3;
        this.resetPinResponse = outletResetPinResponse;
        this.outletResetPinError = outletResetPinError;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ OutletSecurityViewData(boolean r11, boolean r12, ai.kudi.agent.outlet_mgt.viewmodels.SuspendError r13, java.lang.Boolean r14, boolean r15, ai.kudi.agent.outlet_mgt.data.OutletResetPinResponse r16, ai.kudi.agent.outlet_mgt.viewmodels.OutletResetPinError r17, int r18, kotlin.p483e0.p485d.DBUtils$1 r19) {
        /*
            r10 = this;
            r8 = r18 & 1
            r9 = 0
            if (r8 == 0) goto L7
            r11 = 0
            goto L7
        L7:
            r8 = r18 & 2
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
            if (r8 == 0) goto L1e
            goto L1f
        L1e:
            r9 = r15
        L1f:
            r8 = r18 & 32
            if (r8 == 0) goto L26
            r16 = 0
            goto L26
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
            r5 = r9
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewData.<init>(boolean, boolean, ai.kudi.agent.outlet_mgt.viewmodels.SuspendError, java.lang.Boolean, boolean, ai.kudi.agent.outlet_mgt.data.OutletResetPinResponse, ai.kudi.agent.outlet_mgt.viewmodels.OutletResetPinError, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ OutletSecurityViewData copy$default(OutletSecurityViewData outletSecurityViewData, boolean $z1, boolean $z2, SuspendError $r0, Boolean $r1, boolean $z0, OutletResetPinResponse $r2, OutletResetPinError $r4, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z1 = outletSecurityViewData.isSuspendingOutlet;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z2 = outletSecurityViewData.isLoading;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r0 = outletSecurityViewData.error;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r1 = outletSecurityViewData.isOutletSuspended;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $z0 = outletSecurityViewData.isUnsuspendingOutlet;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r2 = outletSecurityViewData.resetPinResponse;
        }
        int $i0 = i & 64;
        if ($i0 != 0) {
            $r4 = outletSecurityViewData.outletResetPinError;
        }
        OutletSecurityViewData $r3 = outletSecurityViewData.copy($z1, $z2, $r0, $r1, $z0, $r2, $r4);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isSuspendingOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SuspendError component3() {
        SuspendError r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component4() {
        Boolean r1 = this.isOutletSuspended;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.isUnsuspendingOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletResetPinResponse component6() {
        OutletResetPinResponse r1 = this.resetPinResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletResetPinError component7() {
        OutletResetPinError r1 = this.outletResetPinError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletSecurityViewData copy(boolean z, boolean z2, SuspendError suspendError, Boolean bool, boolean z3, OutletResetPinResponse outletResetPinResponse, OutletResetPinError outletResetPinError) {
        OutletSecurityViewData $r0 = new OutletSecurityViewData(z, z2, suspendError, bool, z3, outletResetPinResponse, outletResetPinError);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof OutletSecurityViewData;
        if ($z0) {
            OutletSecurityViewData $r2 = (OutletSecurityViewData) obj;
            boolean $z02 = this.isSuspendingOutlet;
            boolean $z1 = $r2.isSuspendingOutlet;
            if ($z02 != $z1) {
                return false;
            }
            boolean $z03 = this.isLoading;
            boolean $z12 = $r2.isLoading;
            if ($z03 != $z12) {
                return false;
            }
            SuspendError $r3 = this.error;
            SuspendError $r4 = $r2.error;
            boolean $z04 = Log_OC.append($r3, $r4);
            if ($z04) {
                Boolean $r5 = this.isOutletSuspended;
                Boolean $r6 = $r2.isOutletSuspended;
                boolean $z05 = Log_OC.append($r5, $r6);
                if ($z05) {
                    boolean $z06 = this.isUnsuspendingOutlet;
                    boolean $z13 = $r2.isUnsuspendingOutlet;
                    if ($z06 != $z13) {
                        return false;
                    }
                    OutletResetPinResponse $r7 = this.resetPinResponse;
                    OutletResetPinResponse $r8 = $r2.resetPinResponse;
                    boolean $z07 = Log_OC.append($r7, $r8);
                    if ($z07) {
                        OutletResetPinError $r9 = this.outletResetPinError;
                        OutletResetPinError $r10 = $r2.outletResetPinError;
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
    public final SuspendError getError() {
        SuspendError r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletResetPinError getOutletResetPinError() {
        OutletResetPinError r1 = this.outletResetPinError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletResetPinResponse getResetPinResponse() {
        OutletResetPinResponse r1 = this.resetPinResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.isSuspendingOutlet;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i02 = $i0 * 31;
        boolean $z02 = this.isLoading;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i12 = ($i02 + $i1) * 31;
        SuspendError $r1 = this.error;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        Boolean $r2 = this.isOutletSuspended;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        boolean $z03 = this.isUnsuspendingOutlet;
        int $i23 = $z03 ? 1 : $z03 ? 1 : 0;
        int $i15 = ($i14 + $i23) * 31;
        OutletResetPinResponse $r3 = this.resetPinResponse;
        int $i24 = $r3 == null ? 0 : $r3.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        OutletResetPinError $r4 = this.outletResetPinError;
        int $i03 = $r4 != null ? $r4.hashCode() : 0;
        return $i16 + $i03;
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
    public final Boolean isOutletSuspended() {
        Boolean r1 = this.isOutletSuspended;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isSuspendingOutlet() {
        boolean z0 = this.isSuspendingOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isUnsuspendingOutlet() {
        boolean z0 = this.isUnsuspendingOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("OutletSecurityViewData(isSuspendingOutlet=");
        boolean $z0 = this.isSuspendingOutlet;
        $r2.append($z0);
        $r2.append(", isLoading=");
        boolean $z02 = this.isLoading;
        $r2.append($z02);
        $r2.append(", error=");
        SuspendError $r3 = this.error;
        $r2.append($r3);
        $r2.append(", isOutletSuspended=");
        Boolean $r4 = this.isOutletSuspended;
        $r2.append($r4);
        $r2.append(", isUnsuspendingOutlet=");
        boolean $z03 = this.isUnsuspendingOutlet;
        $r2.append($z03);
        $r2.append(", resetPinResponse=");
        OutletResetPinResponse $r5 = this.resetPinResponse;
        $r2.append($r5);
        $r2.append(", outletResetPinError=");
        OutletResetPinError $r6 = this.outletResetPinError;
        $r2.append($r6);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
