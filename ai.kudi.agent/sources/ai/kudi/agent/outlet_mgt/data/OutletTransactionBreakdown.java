package ai.kudi.agent.outlet_mgt.data;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownDomain;
import com.google.gson.u.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OutletTransactionBreakdown.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/data/OutletTransactionBreakdown;", "", "breakdown", "", "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", "summary", "Lai/kudi/agent/outlet_mgt/data/Summary;", "(Ljava/util/List;Lai/kudi/agent/outlet_mgt/data/Summary;)V", "getBreakdown", "()Ljava/util/List;", "getSummary", "()Lai/kudi/agent/outlet_mgt/data/Summary;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletTransactionBreakdown {
    @c("breakdown")
    private final List<TransactionBreakDownDomain> breakdown;
    @c("summary")
    private final Summary summary;

    public OutletTransactionBreakdown(List list, Summary summary) {
        Log_OC.getArray(list, "breakdown");
        Log_OC.getArray(summary, "summary");
        this.breakdown = list;
        this.summary = summary;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ OutletTransactionBreakdown copy$default(OutletTransactionBreakdown outletTransactionBreakdown, List $r1, Summary $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = outletTransactionBreakdown.breakdown;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = outletTransactionBreakdown.summary;
        }
        OutletTransactionBreakdown $r0 = outletTransactionBreakdown.copy($r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component1() {
        List r1 = this.breakdown;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Summary component2() {
        Summary r1 = this.summary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletTransactionBreakdown copy(List list, Summary summary) {
        Log_OC.getArray(list, "breakdown");
        Log_OC.getArray(summary, "summary");
        OutletTransactionBreakdown $r0 = new OutletTransactionBreakdown(list, summary);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof OutletTransactionBreakdown;
        if ($z0) {
            OutletTransactionBreakdown $r3 = (OutletTransactionBreakdown) obj;
            List $r4 = this.breakdown;
            List $r1 = $r3.breakdown;
            boolean $z02 = Log_OC.append($r4, $r1);
            if ($z02) {
                Summary $r5 = this.summary;
                Summary $r6 = $r3.summary;
                boolean $z03 = Log_OC.append($r5, $r6);
                return $z03;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBreakdown() {
        List r1 = this.breakdown;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Summary getSummary() {
        Summary r1 = this.summary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        List $r1 = this.breakdown;
        int $i0 = $r1.hashCode();
        Summary $r2 = this.summary;
        int $i1 = $r2.hashCode();
        return ($i0 * 31) + $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("OutletTransactionBreakdown(breakdown=");
        List $r3 = this.breakdown;
        $r2.append($r3);
        $r2.append(", summary=");
        Summary $r4 = this.summary;
        $r2.append($r4);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
