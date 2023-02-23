package ai.kudi.agent.outlet_mgt.data;

import com.google.gson.u.c;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OutletDetails.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/data/OutletDetails;", "", "account", "Lai/kudi/agent/outlet_mgt/data/OutletAccountInfo;", "isOutletInsured", "", "personal", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "(Lai/kudi/agent/outlet_mgt/data/OutletAccountInfo;ZLai/kudi/agent/outlet_mgt/data/Outlet;)V", "getAccount", "()Lai/kudi/agent/outlet_mgt/data/OutletAccountInfo;", "()Z", "getPersonal", "()Lai/kudi/agent/outlet_mgt/data/Outlet;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletDetails {
    private final OutletAccountInfo account;
    private final boolean isOutletInsured;
    @c("personal")
    private final Outlet personal;

    public OutletDetails(OutletAccountInfo outletAccountInfo, boolean z, Outlet outlet) {
        Log_OC.getArray(outletAccountInfo, "account");
        Log_OC.getArray(outlet, "personal");
        this.account = outletAccountInfo;
        this.isOutletInsured = z;
        this.personal = outlet;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ OutletDetails copy$default(OutletDetails outletDetails, OutletAccountInfo $r1, boolean $z0, Outlet $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = outletDetails.account;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z0 = outletDetails.isOutletInsured;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = outletDetails.personal;
        }
        OutletDetails $r0 = outletDetails.copy($r1, $z0, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletAccountInfo component1() {
        OutletAccountInfo r1 = this.account;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isOutletInsured;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Outlet component3() {
        Outlet r1 = this.personal;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletDetails copy(OutletAccountInfo outletAccountInfo, boolean z, Outlet outlet) {
        Log_OC.getArray(outletAccountInfo, "account");
        Log_OC.getArray(outlet, "personal");
        OutletDetails $r0 = new OutletDetails(outletAccountInfo, z, outlet);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof OutletDetails;
        if ($z0) {
            OutletDetails $r2 = (OutletDetails) obj;
            OutletAccountInfo $r3 = this.account;
            OutletAccountInfo $r4 = $r2.account;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                boolean $z03 = this.isOutletInsured;
                boolean $z1 = $r2.isOutletInsured;
                if ($z03 != $z1) {
                    return false;
                }
                Outlet $r5 = this.personal;
                Outlet $r6 = $r2.personal;
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
    public final OutletAccountInfo getAccount() {
        OutletAccountInfo r1 = this.account;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Outlet getPersonal() {
        Outlet r1 = this.personal;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        OutletAccountInfo $r1 = this.account;
        int $i0 = $r1.hashCode();
        int $i02 = $i0 * 31;
        boolean $z0 = this.isOutletInsured;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i1 = i;
        Outlet $r2 = this.personal;
        int $i12 = $r2.hashCode();
        return (($i02 + $i1) * 31) + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isOutletInsured() {
        boolean z0 = this.isOutletInsured;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("OutletDetails(account=");
        OutletAccountInfo $r3 = this.account;
        $r2.append($r3);
        $r2.append(", isOutletInsured=");
        boolean $z0 = this.isOutletInsured;
        $r2.append($z0);
        $r2.append(", personal=");
        Outlet $r4 = this.personal;
        $r2.append($r4);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
