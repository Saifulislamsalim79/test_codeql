package ai.kudi.agent.transactionhistory.data.source.request;

import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: GetWalletActivitiesRequest.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/request/GetWalletActivitiesRequest;", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "userId", "", "loadFromCache", "", "(Lai/kudi/agent/users/domain/dto/User;Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;Ljava/lang/String;Z)V", "getFetchRequest", "()Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "getLoadFromCache", "()Z", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetWalletActivitiesRequest {
    private final FetchRequest fetchRequest;
    private final boolean loadFromCache;
    private final User user;
    private final String userId;

    public GetWalletActivitiesRequest(User user, FetchRequest fetchRequest, String str, boolean z) {
        Log_OC.getArray(fetchRequest, "fetchRequest");
        this.user = user;
        this.fetchRequest = fetchRequest;
        this.userId = str;
        this.loadFromCache = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GetWalletActivitiesRequest(ai.kudi.agent.users.domain.package_1.User r2, ai.kudi.agent.transactions.data.repositories.dto.FetchRequest r3, java.lang.String r4, boolean r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
        /*
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r6 & 4
            if (r0 == 0) goto La
            r4 = 0
        La:
            r6 = r6 & 8
            if (r6 == 0) goto Lf
            r5 = 0
        Lf:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest.<init>(ai.kudi.agent.users.domain.package_1.User, ai.kudi.agent.transactions.data.repositories.dto.FetchRequest, java.lang.String, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ GetWalletActivitiesRequest copy$default(GetWalletActivitiesRequest getWalletActivitiesRequest, User $r1, FetchRequest $r2, String $r3, boolean $z0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = getWalletActivitiesRequest.user;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = getWalletActivitiesRequest.fetchRequest;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r3 = getWalletActivitiesRequest.userId;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $z0 = getWalletActivitiesRequest.loadFromCache;
        }
        GetWalletActivitiesRequest $r0 = getWalletActivitiesRequest.copy($r1, $r2, $r3, $z0);
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
    public final FetchRequest component2() {
        FetchRequest r1 = this.fetchRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.userId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component4() {
        boolean z0 = this.loadFromCache;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GetWalletActivitiesRequest copy(User user, FetchRequest fetchRequest, String str, boolean z) {
        Log_OC.getArray(fetchRequest, "fetchRequest");
        GetWalletActivitiesRequest $r0 = new GetWalletActivitiesRequest(user, fetchRequest, str, z);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof GetWalletActivitiesRequest;
        if ($z0) {
            GetWalletActivitiesRequest $r2 = (GetWalletActivitiesRequest) obj;
            User $r3 = this.user;
            User $r4 = $r2.user;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                FetchRequest $r5 = this.fetchRequest;
                FetchRequest $r6 = $r2.fetchRequest;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    String $r7 = this.userId;
                    String $r8 = $r2.userId;
                    boolean $z04 = Log_OC.append($r7, $r8);
                    if ($z04) {
                        boolean $z05 = this.loadFromCache;
                        boolean $z1 = $r2.loadFromCache;
                        return $z05 == $z1;
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
    public final FetchRequest getFetchRequest() {
        FetchRequest r1 = this.fetchRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getLoadFromCache() {
        boolean z0 = this.loadFromCache;
        return z0;
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
    public final String getUserId() {
        String r1 = this.userId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        User $r1 = this.user;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        FetchRequest $r2 = this.fetchRequest;
        int $i2 = $r2.hashCode();
        int $i12 = (($i1 * 31) + $i2) * 31;
        String $r3 = this.userId;
        int $i0 = $r3 != null ? $r3.hashCode() : 0;
        int $i02 = ($i12 + $i0) * 31;
        boolean $z0 = this.loadFromCache;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i13 = i;
        return $i02 + $i13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("GetWalletActivitiesRequest(user=");
        User $r3 = this.user;
        $r2.append($r3);
        $r2.append(", fetchRequest=");
        FetchRequest $r4 = this.fetchRequest;
        $r2.append($r4);
        $r2.append(", userId=");
        String $r1 = this.userId;
        $r2.append((Object) $r1);
        $r2.append(", loadFromCache=");
        boolean $z0 = this.loadFromCache;
        $r2.append($z0);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
