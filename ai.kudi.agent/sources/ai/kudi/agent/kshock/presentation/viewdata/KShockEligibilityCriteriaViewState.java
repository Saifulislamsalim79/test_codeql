package ai.kudi.agent.kshock.presentation.viewdata;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.data.model.KshockEligibilityCriteria;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KShockEligibilityCriteriaViewState.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000e¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/KShockEligibilityCriteriaViewState;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "eligibilityCriteria", "", "Lai/kudi/agent/kshock/data/model/KshockEligibilityCriteria;", "errorMessage", "", "(ZLjava/util/List;Ljava/lang/String;)V", "getEligibilityCriteria", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KShockEligibilityCriteriaViewState implements ViewData {
    private final List<KshockEligibilityCriteria> eligibilityCriteria;
    private final String errorMessage;
    private final boolean isLoading;

    public KShockEligibilityCriteriaViewState() {
        this(false, null, null, 7, null);
    }

    public KShockEligibilityCriteriaViewState(boolean z, List list, String str) {
        Log_OC.getArray(list, "eligibilityCriteria");
        this.isLoading = z;
        this.eligibilityCriteria = list;
        this.errorMessage = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ KShockEligibilityCriteriaViewState(boolean r2, java.util.List r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.presentation.viewdata.KShockEligibilityCriteriaViewState.<init>(boolean, java.util.List, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ KShockEligibilityCriteriaViewState copy$default(KShockEligibilityCriteriaViewState kShockEligibilityCriteriaViewState, boolean $z0, List $r1, String $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = kShockEligibilityCriteriaViewState.isLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = kShockEligibilityCriteriaViewState.eligibilityCriteria;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = kShockEligibilityCriteriaViewState.errorMessage;
        }
        KShockEligibilityCriteriaViewState $r0 = kShockEligibilityCriteriaViewState.copy($z0, $r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component2() {
        List r1 = this.eligibilityCriteria;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.errorMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KShockEligibilityCriteriaViewState copy(boolean z, List list, String str) {
        Log_OC.getArray(list, "eligibilityCriteria");
        KShockEligibilityCriteriaViewState $r0 = new KShockEligibilityCriteriaViewState(z, list, str);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof KShockEligibilityCriteriaViewState;
        if ($z0) {
            KShockEligibilityCriteriaViewState $r2 = (KShockEligibilityCriteriaViewState) obj;
            boolean $z02 = this.isLoading;
            boolean $z1 = $r2.isLoading;
            if ($z02 != $z1) {
                return false;
            }
            List $r3 = this.eligibilityCriteria;
            List $r4 = $r2.eligibilityCriteria;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                String $r5 = this.errorMessage;
                String $r6 = $r2.errorMessage;
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
    public final List getEligibilityCriteria() {
        List r1 = this.eligibilityCriteria;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getErrorMessage() {
        String r1 = this.errorMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.isLoading;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        List $r1 = this.eligibilityCriteria;
        int $i1 = $r1.hashCode();
        int $i02 = (($i0 * 31) + $i1) * 31;
        String $r2 = this.errorMessage;
        int $i12 = $r2 == null ? 0 : $r2.hashCode();
        return $i02 + $i12;
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
        $r2.append("KShockEligibilityCriteriaViewState(isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", eligibilityCriteria=");
        List $r3 = this.eligibilityCriteria;
        $r2.append($r3);
        $r2.append(", errorMessage=");
        String $r1 = this.errorMessage;
        $r2.append((Object) $r1);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
