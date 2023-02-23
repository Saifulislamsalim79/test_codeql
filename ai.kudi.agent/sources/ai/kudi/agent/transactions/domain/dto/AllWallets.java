package ai.kudi.agent.transactions.domain.dto;

import ai.kudi.agent.users.domain.package_1.Wallet;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AllWallets.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/dto/AllWallets;", "", "primaryWallet", "Lai/kudi/agent/users/domain/dto/Wallet;", "commissionWallets", "", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "(Lai/kudi/agent/users/domain/dto/Wallet;Ljava/util/List;)V", "getCommissionWallets", "()Ljava/util/List;", "getPrimaryWallet", "()Lai/kudi/agent/users/domain/dto/Wallet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AllWallets {
    private final List<CommissionWallet> commissionWallets;
    private final Wallet primaryWallet;

    public AllWallets(Wallet wallet, List list) {
        Log_OC.getArray(wallet, "primaryWallet");
        Log_OC.getArray(list, "commissionWallets");
        this.primaryWallet = wallet;
        this.commissionWallets = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AllWallets copy$default(AllWallets allWallets, Wallet $r1, List $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = allWallets.primaryWallet;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = allWallets.commissionWallets;
        }
        AllWallets $r0 = allWallets.copy($r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallet component1() {
        Wallet r1 = this.primaryWallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component2() {
        List r1 = this.commissionWallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AllWallets copy(Wallet wallet, List list) {
        Log_OC.getArray(wallet, "primaryWallet");
        Log_OC.getArray(list, "commissionWallets");
        AllWallets $r0 = new AllWallets(wallet, list);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof AllWallets;
        if ($z0) {
            AllWallets $r3 = (AllWallets) obj;
            Wallet $r4 = this.primaryWallet;
            Wallet $r1 = $r3.primaryWallet;
            boolean $z02 = Log_OC.append($r4, $r1);
            if ($z02) {
                List $r5 = this.commissionWallets;
                List $r6 = $r3.commissionWallets;
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
    public final List getCommissionWallets() {
        List r1 = this.commissionWallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallet getPrimaryWallet() {
        Wallet r1 = this.primaryWallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        Wallet $r1 = this.primaryWallet;
        int $i0 = $r1.hashCode();
        List $r2 = this.commissionWallets;
        int $i1 = $r2.hashCode();
        return ($i0 * 31) + $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("AllWallets(primaryWallet=");
        Wallet $r3 = this.primaryWallet;
        $r2.append($r3);
        $r2.append(", commissionWallets=");
        List $r4 = this.commissionWallets;
        $r2.append($r4);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
