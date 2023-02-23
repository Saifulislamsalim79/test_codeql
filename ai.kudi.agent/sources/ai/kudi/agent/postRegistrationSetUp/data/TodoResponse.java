package ai.kudi.agent.postRegistrationSetUp.data;

import ai.kudi.agent.login.domain.dto.CashoutAccount;
import ai.kudi.agent.login.domain.wiki.InsuranceStatus;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.users.domain.package_1.Wallet;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TodoResponse.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/data/TodoResponse;", "", "cashoutAccounts", "", "Lai/kudi/agent/login/domain/dto/CashoutAccount;", "insuranceStatus", "Lai/kudi/agent/login/domain/dto/InsuranceStatus;", "isNewUser", "", "kycLevel", "", "showPosPurchase", Method.WALLET, "Lai/kudi/agent/users/domain/dto/Wallet;", "(Ljava/util/List;Lai/kudi/agent/login/domain/dto/InsuranceStatus;ZLjava/lang/String;ZLai/kudi/agent/users/domain/dto/Wallet;)V", "getCashoutAccounts", "()Ljava/util/List;", "getInsuranceStatus", "()Lai/kudi/agent/login/domain/dto/InsuranceStatus;", "()Z", "getKycLevel", "()Ljava/lang/String;", "getShowPosPurchase", "getWallet", "()Lai/kudi/agent/users/domain/dto/Wallet;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TodoResponse {
    private final List<CashoutAccount> cashoutAccounts;
    private final InsuranceStatus insuranceStatus;
    private final boolean isNewUser;
    private final String kycLevel;
    private final boolean showPosPurchase;
    private final Wallet wallet;

    public TodoResponse(List list, InsuranceStatus insuranceStatus, boolean z, String str, boolean z2, Wallet wallet) {
        Log_OC.getArray(list, "cashoutAccounts");
        Log_OC.getArray(str, "kycLevel");
        Log_OC.getArray(wallet, Method.WALLET);
        this.cashoutAccounts = list;
        this.insuranceStatus = insuranceStatus;
        this.isNewUser = z;
        this.kycLevel = str;
        this.showPosPurchase = z2;
        this.wallet = wallet;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TodoResponse(java.util.List r1, ai.kudi.agent.login.domain.wiki.InsuranceStatus r2, boolean r3, java.lang.String r4, boolean r5, ai.kudi.agent.users.domain.package_1.Wallet r6, int r7, kotlin.p483e0.p485d.DBUtils$1 r8) {
        /*
            r0 = this;
            r7 = r7 & 2
            if (r7 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.postRegistrationSetUp.data.TodoResponse.<init>(java.util.List, ai.kudi.agent.login.domain.wiki.InsuranceStatus, boolean, java.lang.String, boolean, ai.kudi.agent.users.domain.package_1.Wallet, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ TodoResponse copy$default(TodoResponse todoResponse, List $r2, InsuranceStatus $r3, boolean $z0, String $r0, boolean $z1, Wallet $r4, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = todoResponse.cashoutAccounts;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = todoResponse.insuranceStatus;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z0 = todoResponse.isNewUser;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r0 = todoResponse.kycLevel;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $z1 = todoResponse.showPosPurchase;
        }
        int $i0 = i & 32;
        if ($i0 != 0) {
            $r4 = todoResponse.wallet;
        }
        TodoResponse $r1 = todoResponse.copy($r2, $r3, $z0, $r0, $z1, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component1() {
        List r1 = this.cashoutAccounts;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceStatus component2() {
        InsuranceStatus r1 = this.insuranceStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.showPosPurchase;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallet component6() {
        Wallet r1 = this.wallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TodoResponse copy(List list, InsuranceStatus insuranceStatus, boolean z, String str, boolean z2, Wallet wallet) {
        Log_OC.getArray(list, "cashoutAccounts");
        Log_OC.getArray(str, "kycLevel");
        Log_OC.getArray(wallet, Method.WALLET);
        TodoResponse $r0 = new TodoResponse(list, insuranceStatus, z, str, z2, wallet);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof TodoResponse;
        if ($z0) {
            TodoResponse $r2 = (TodoResponse) obj;
            List $r3 = this.cashoutAccounts;
            List $r4 = $r2.cashoutAccounts;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                InsuranceStatus $r5 = this.insuranceStatus;
                InsuranceStatus $r6 = $r2.insuranceStatus;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    boolean $z04 = this.isNewUser;
                    boolean $z1 = $r2.isNewUser;
                    if ($z04 != $z1) {
                        return false;
                    }
                    String $r7 = this.kycLevel;
                    String $r8 = $r2.kycLevel;
                    boolean $z05 = Log_OC.append($r7, $r8);
                    if ($z05) {
                        boolean $z06 = this.showPosPurchase;
                        boolean $z12 = $r2.showPosPurchase;
                        if ($z06 != $z12) {
                            return false;
                        }
                        Wallet $r9 = this.wallet;
                        Wallet $r10 = $r2.wallet;
                        boolean $z07 = Log_OC.append($r9, $r10);
                        return $z07;
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
    public final List getCashoutAccounts() {
        List r1 = this.cashoutAccounts;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceStatus getInsuranceStatus() {
        InsuranceStatus r1 = this.insuranceStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getKycLevel() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowPosPurchase() {
        boolean z0 = this.showPosPurchase;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallet getWallet() {
        Wallet r1 = this.wallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List $r1 = this.cashoutAccounts;
        int $i0 = $r1.hashCode();
        int $i02 = $i0 * 31;
        InsuranceStatus $r2 = this.insuranceStatus;
        int $i1 = $r2 == null ? 0 : $r2.hashCode();
        int $i03 = ($i02 + $i1) * 31;
        boolean $z0 = this.isNewUser;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i12 = i;
        String $r3 = this.kycLevel;
        int $i13 = $r3.hashCode();
        int $i04 = ((($i03 + $i12) * 31) + $i13) * 31;
        boolean $z02 = this.showPosPurchase;
        int $i14 = $z02 ? 1 : $z02 ? 1 : 0;
        Wallet $r4 = this.wallet;
        int $i15 = $r4.hashCode();
        return (($i04 + $i14) * 31) + $i15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNewUser() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("TodoResponse(cashoutAccounts=");
        List $r3 = this.cashoutAccounts;
        $r2.append($r3);
        $r2.append(", insuranceStatus=");
        InsuranceStatus $r4 = this.insuranceStatus;
        $r2.append($r4);
        $r2.append(", isNewUser=");
        boolean $z0 = this.isNewUser;
        $r2.append($z0);
        $r2.append(", kycLevel=");
        String $r1 = this.kycLevel;
        $r2.append($r1);
        $r2.append(", showPosPurchase=");
        boolean $z02 = this.showPosPurchase;
        $r2.append($z02);
        $r2.append(", wallet=");
        Wallet $r5 = this.wallet;
        $r2.append($r5);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
