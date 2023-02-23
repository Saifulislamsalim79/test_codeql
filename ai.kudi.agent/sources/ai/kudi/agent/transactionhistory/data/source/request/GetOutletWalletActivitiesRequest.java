package ai.kudi.agent.transactionhistory.data.source.request;

import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: GetOutletWalletActivitiesRequest.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/request/GetOutletWalletActivitiesRequest;", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "outletId", "", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "(Lai/kudi/agent/users/domain/dto/User;Ljava/lang/String;Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;)V", "getFetchRequest", "()Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "getOutletId", "()Ljava/lang/String;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetOutletWalletActivitiesRequest {
    private final FetchRequest fetchRequest;
    private final String outletId;
    private final User user;

    public GetOutletWalletActivitiesRequest(User user, String str, FetchRequest fetchRequest) {
        Log_OC.getArray(fetchRequest, "fetchRequest");
        this.user = user;
        this.outletId = str;
        this.fetchRequest = fetchRequest;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ GetOutletWalletActivitiesRequest copy$default(GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest, User $r1, String $r2, FetchRequest $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = getOutletWalletActivitiesRequest.user;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = getOutletWalletActivitiesRequest.outletId;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r3 = getOutletWalletActivitiesRequest.fetchRequest;
        }
        GetOutletWalletActivitiesRequest $r0 = getOutletWalletActivitiesRequest.copy($r1, $r2, $r3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User component1() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.outletId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchRequest component3() {
        FetchRequest r1 = this.fetchRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GetOutletWalletActivitiesRequest copy(User user, String str, FetchRequest fetchRequest) {
        Log_OC.getArray(fetchRequest, "fetchRequest");
        GetOutletWalletActivitiesRequest $r0 = new GetOutletWalletActivitiesRequest(user, str, fetchRequest);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof GetOutletWalletActivitiesRequest;
        if ($z0) {
            GetOutletWalletActivitiesRequest $r2 = (GetOutletWalletActivitiesRequest) obj;
            User $r3 = this.user;
            User $r4 = $r2.user;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r5 = this.outletId;
                String $r6 = $r2.outletId;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    FetchRequest $r7 = this.fetchRequest;
                    FetchRequest $r8 = $r2.fetchRequest;
                    boolean $z04 = Log_OC.append($r7, $r8);
                    return $z04;
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
    public final FetchRequest getFetchRequest() {
        FetchRequest r1 = this.fetchRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getOutletId() {
        String r1 = this.outletId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        User $r2 = this.user;
        int $i1 = $r2 == null ? 0 : $r2.hashCode();
        int $i12 = $i1 * 31;
        String $r1 = this.outletId;
        int $i0 = $r1 != null ? $r1.hashCode() : 0;
        FetchRequest $r3 = this.fetchRequest;
        int $i13 = $r3.hashCode();
        return (($i12 + $i0) * 31) + $i13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("GetOutletWalletActivitiesRequest(user=");
        User $r3 = this.user;
        $r2.append($r3);
        $r2.append(", outletId=");
        String $r1 = this.outletId;
        $r2.append((Object) $r1);
        $r2.append(", fetchRequest=");
        FetchRequest $r4 = this.fetchRequest;
        $r2.append($r4);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
