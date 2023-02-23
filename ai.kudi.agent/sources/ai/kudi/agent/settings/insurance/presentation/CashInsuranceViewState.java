package ai.kudi.agent.settings.insurance.presentation;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.settings.insurance.data.InsuranceError;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CashInsuranceViewState.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewState;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoadingData", "", "insuranceDetails", "Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "errorDetails", "Lai/kudi/agent/settings/insurance/data/InsuranceError;", "(ZLai/kudi/agent/settings/insurance/data/InsuranceDetailModel;Lai/kudi/agent/settings/insurance/data/InsuranceError;)V", "getErrorDetails", "()Lai/kudi/agent/settings/insurance/data/InsuranceError;", "getInsuranceDetails", "()Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CashInsuranceViewState implements ViewData {
    private final InsuranceError errorDetails;
    private final InsuranceDetailModel insuranceDetails;
    private final boolean isLoadingData;

    public CashInsuranceViewState() {
        this(false, null, null, 7, null);
    }

    public CashInsuranceViewState(boolean z, InsuranceDetailModel insuranceDetailModel, InsuranceError insuranceError) {
        this.isLoadingData = z;
        this.insuranceDetails = insuranceDetailModel;
        this.errorDetails = insuranceError;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CashInsuranceViewState(boolean r2, ai.kudi.agent.settings.insurance.data.InsuranceDetailModel r3, ai.kudi.agent.settings.insurance.data.InsuranceError r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto La
            r3 = 0
        La:
            r5 = r5 & 4
            if (r5 == 0) goto Lf
            r4 = 0
        Lf:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.insurance.presentation.CashInsuranceViewState.<init>(boolean, ai.kudi.agent.settings.insurance.data.InsuranceDetailModel, ai.kudi.agent.settings.insurance.data.InsuranceError, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ CashInsuranceViewState copy$default(CashInsuranceViewState cashInsuranceViewState, boolean $z0, InsuranceDetailModel $r1, InsuranceError $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = cashInsuranceViewState.isLoadingData;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = cashInsuranceViewState.insuranceDetails;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = cashInsuranceViewState.errorDetails;
        }
        CashInsuranceViewState $r0 = cashInsuranceViewState.copy($z0, $r1, $r2);
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
    public final InsuranceDetailModel component2() {
        InsuranceDetailModel r1 = this.insuranceDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceError component3() {
        InsuranceError r1 = this.errorDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashInsuranceViewState copy(boolean z, InsuranceDetailModel insuranceDetailModel, InsuranceError insuranceError) {
        CashInsuranceViewState $r0 = new CashInsuranceViewState(z, insuranceDetailModel, insuranceError);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof CashInsuranceViewState;
        if ($z0) {
            CashInsuranceViewState $r2 = (CashInsuranceViewState) obj;
            boolean $z02 = this.isLoadingData;
            boolean $z1 = $r2.isLoadingData;
            if ($z02 != $z1) {
                return false;
            }
            InsuranceDetailModel $r3 = this.insuranceDetails;
            InsuranceDetailModel $r4 = $r2.insuranceDetails;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                InsuranceError $r5 = this.errorDetails;
                InsuranceError $r6 = $r2.errorDetails;
                boolean $z04 = Log_OC.append($r5, $r6);
                return $z04;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceError getErrorDetails() {
        InsuranceError r1 = this.errorDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceDetailModel getInsuranceDetails() {
        InsuranceDetailModel r1 = this.insuranceDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.isLoadingData;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        InsuranceDetailModel $r1 = this.insuranceDetails;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        InsuranceError $r2 = this.errorDetails;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        return $i02 + $i12;
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
        $r2.append("CashInsuranceViewState(isLoadingData=");
        boolean $z0 = this.isLoadingData;
        $r2.append($z0);
        $r2.append(", insuranceDetails=");
        InsuranceDetailModel $r3 = this.insuranceDetails;
        $r2.append($r3);
        $r2.append(", errorDetails=");
        InsuranceError $r4 = this.errorDetails;
        $r2.append($r4);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
