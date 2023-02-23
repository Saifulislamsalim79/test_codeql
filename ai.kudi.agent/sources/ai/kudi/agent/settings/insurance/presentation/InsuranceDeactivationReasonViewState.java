package ai.kudi.agent.settings.insurance.presentation;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: InsuranceDeactivationReasonViewState.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewState;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoadingData", "", "reasons", "", "Lai/kudi/agent/settings/insurance/data/InsuranceDeactivationReasonUiModel;", "shouldShowReasonTextField", "(ZLjava/util/List;Z)V", "()Z", "getReasons", "()Ljava/util/List;", "getShouldShowReasonTextField", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class InsuranceDeactivationReasonViewState implements ViewData {
    private final boolean isLoadingData;
    private final List<InsuranceDeactivationReasonUiModel> reasons;
    private final boolean shouldShowReasonTextField;

    public InsuranceDeactivationReasonViewState() {
        this(false, null, false, 7, null);
    }

    public InsuranceDeactivationReasonViewState(boolean z, List list, boolean z2) {
        Log_OC.getArray(list, "reasons");
        this.isLoadingData = z;
        this.reasons = list;
        this.shouldShowReasonTextField = z2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InsuranceDeactivationReasonViewState(boolean r2, java.util.List r3, boolean r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto Ld
            java.util.List r3 = kotlin.p557z.C13722p.m3941e()
        Ld:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            r4 = 0
        L12:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState.<init>(boolean, java.util.List, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ InsuranceDeactivationReasonViewState copy$default(InsuranceDeactivationReasonViewState insuranceDeactivationReasonViewState, boolean $z0, List $r1, boolean $z1, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = insuranceDeactivationReasonViewState.isLoadingData;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = insuranceDeactivationReasonViewState.reasons;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z1 = insuranceDeactivationReasonViewState.shouldShowReasonTextField;
        }
        InsuranceDeactivationReasonViewState $r0 = insuranceDeactivationReasonViewState.copy($z0, $r1, $z1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isLoadingData;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component2() {
        List r1 = this.reasons;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.shouldShowReasonTextField;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceDeactivationReasonViewState copy(boolean z, List list, boolean z2) {
        Log_OC.getArray(list, "reasons");
        InsuranceDeactivationReasonViewState $r0 = new InsuranceDeactivationReasonViewState(z, list, z2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof InsuranceDeactivationReasonViewState;
        if ($z0) {
            InsuranceDeactivationReasonViewState $r2 = (InsuranceDeactivationReasonViewState) obj;
            boolean $z02 = this.isLoadingData;
            boolean $z1 = $r2.isLoadingData;
            if ($z02 != $z1) {
                return false;
            }
            List $r3 = this.reasons;
            List $r4 = $r2.reasons;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                boolean $z04 = this.shouldShowReasonTextField;
                boolean $z12 = $r2.shouldShowReasonTextField;
                return $z04 == $z12;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getReasons() {
        List r1 = this.reasons;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShouldShowReasonTextField() {
        boolean z0 = this.shouldShowReasonTextField;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.isLoadingData;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        int $i1 = $i0 * 31;
        List $r1 = this.reasons;
        int $i02 = $r1.hashCode();
        int $i03 = ($i1 + $i02) * 31;
        boolean $z02 = this.shouldShowReasonTextField;
        int $i12 = $z02 ? 1 : $z02 ? 1 : 0;
        return $i03 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoadingData() {
        boolean z0 = this.isLoadingData;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("InsuranceDeactivationReasonViewState(isLoadingData=");
        boolean $z0 = this.isLoadingData;
        $r2.append($z0);
        $r2.append(", reasons=");
        List $r3 = this.reasons;
        $r2.append($r3);
        $r2.append(", shouldShowReasonTextField=");
        boolean $z02 = this.shouldShowReasonTextField;
        $r2.append($z02);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
