package ai.kudi.agent.core.domain.room_entities;

import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13734v;
/* compiled from: Bank.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/domain/room_entities/Bank;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter$Searchable;", "name", "", "bankCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "getSearchCriteria", "hashCode", "", "toString", "BanksList", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Bank implements DynamicSearchAdapter.Searchable {
    private final String bankCode;
    private final String name;

    /* compiled from: Bank.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/domain/room_entities/Bank$BanksList;", "", "()V", "banks", "", "Lai/kudi/agent/core/domain/room_entities/Bank;", "getBanks", "()Ljava/util/List;", "getBankName", "", "bankNameOrCode", "getListOfBanks", "locateBank", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BanksList {
        private final List<Bank> banks;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public BanksList() {
            List $r1;
            Bank $r3 = new Bank("Access Bank", "044");
            Bank $r32 = new Bank("Access (Diamond) Bank", "063");
            Bank $r33 = new Bank("Citibank Nigeria Limited", "023");
            Bank $r34 = new Bank("Ecobank Nigeria", "050");
            Bank $r35 = new Bank("Enterprise Bank", "084");
            Bank $r36 = new Bank("Fidelity Bank", "070");
            Bank $r37 = new Bank("First Bank of Nigeria", "011");
            Bank $r38 = new Bank("First City Monument Bank", "214");
            Bank $r39 = new Bank("Guaranty Trust Bank", "058");
            Bank $r310 = new Bank("Heritage Bank", "030");
            Bank $r311 = new Bank("Jaiz Bank", "301");
            Bank $r312 = new Bank("Key Stone Bank", "082");
            Bank $r313 = new Bank("Polaris Bank", "076");
            Bank $r314 = new Bank("Providus Bank", "101");
            Bank $r315 = new Bank("Stanbic IBTC Bank", "039");
            Bank $r316 = new Bank("Standard Chartered Bank Nigeria", "068");
            Bank $r317 = new Bank("Sterling Bank Plc", "232");
            Bank $r318 = new Bank("SunTrust Bank Nigeria Limited", "100");
            Bank $r319 = new Bank("Union Bank of Nigeria", "032");
            Bank $r320 = new Bank("United Bank for Africa", "033");
            Bank $r321 = new Bank("Unity Bank", "215");
            Bank $r322 = new Bank("Wema Bank", "035");
            Bank $r323 = new Bank("Zenith Bank", "057");
            Bank $r324 = new Bank("eTranzact", "306");
            Bank $r325 = new Bank("FirstMonie Wallet", "309");
            Bank $r326 = new Bank("Paga", "327");
            Bank $r327 = new Bank("RenMoney Microfinance Bank", "090198");
            Bank $r328 = new Bank("Hackman Microfinance Bank", "90147");
            Bank $r329 = new Bank("Titan Trust Bank", "000025");
            Bank $r330 = new Bank("TAJ Bank", "000026");
            Bank $r331 = new Bank("Globus Bank", "000027");
            Bank $r332 = new Bank("Royal Exchange Microfinance Bank", "90138");
            Bank $r333 = new Bank("Ibile MFB", "090118");
            Bank $r334 = new Bank("PayAttitude Online", "329");
            Bank $r335 = new Bank("Addosser Microfinance Bank", "90160");
            Bank[] $r2 = {$r3, $r32, $r33, $r34, $r35, $r36, $r37, $r38, $r39, $r310, $r311, $r312, $r313, $r314, $r315, $r316, $r317, $r318, $r319, $r320, $r321, $r322, $r323, $r324, $r325, $r326, $r327, $r328, $r329, $r330, $r331, $r332, $r333, $r334, $r335};
            $r1 = C13726r.m3885k($r2);
            this.banks = $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getBankName(String str) {
            int $i0 = locateBank(str);
            if ($i0 != -1) {
                List $r2 = getListOfBanks();
                Object $r3 = $r2.get($i0);
                Bank $r4 = (Bank) $r3;
                String $r1 = $r4.getName();
                return $r1;
            }
            return "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getBanks() {
            List r1 = this.banks;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getListOfBanks() {
            List $r1 = this.banks;
            int $i0 = $r1.size();
            if ($i0 > 1) {
                C13734v.m3854u($r1, new Comparator() { // from class: ai.kudi.agent.core.domain.room_entities.Bank$BanksList$getListOfBanks$$inlined$sortBy$1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int $i02;
                        Bank $r3 = (Bank) obj;
                        String $r4 = $r3.getName();
                        if ($r4 == null) {
                            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            throw $r6;
                        }
                        String $r42 = $r4.toLowerCase();
                        Log_OC.loadImage($r42, "(this as java.lang.String).toLowerCase()");
                        Bank $r32 = (Bank) obj2;
                        String $r5 = $r32.getName();
                        if ($r5 == null) {
                            NullPointerException $r62 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            throw $r62;
                        }
                        String $r52 = $r5.toLowerCase();
                        Log_OC.loadImage($r52, "(this as java.lang.String).toLowerCase()");
                        $i02 = C11703b.m10416a($r42, $r52);
                        return $i02;
                    }
                });
            }
            return this.banks;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int locateBank(String str) {
            List $r2 = getListOfBanks();
            int $i1 = $r2.size() - 1;
            if ($i1 < 0) {
                return -1;
            }
            int $i2 = 0;
            while (true) {
                int $i0 = $i2 + 1;
                Object $r3 = $r2.get($i2);
                Bank $r4 = (Bank) $r3;
                String $r5 = $r4.getName();
                boolean $z0 = Log_OC.append($r5, str);
                if ($z0) {
                    return $i2;
                }
                Object $r32 = $r2.get($i2);
                Bank $r42 = (Bank) $r32;
                String $r52 = $r42.getBankCode();
                boolean $z02 = Log_OC.append($r52, str);
                if ($z02) {
                    return $i2;
                }
                if ($i0 > $i1) {
                    return -1;
                }
                $i2 = $i0;
            }
        }
    }

    public Bank() {
        this(null, null, 3, null);
    }

    public Bank(String str, String str2) {
        Log_OC.getArray(str, "name");
        Log_OC.getArray(str2, "bankCode");
        this.name = str;
        this.bankCode = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Bank(java.lang.String r2, java.lang.String r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            java.lang.String r3 = ""
        Lc:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.room_entities.Bank.<init>(java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ Bank copy$default(Bank bank, String $r1, String $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = bank.name;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = bank.bankCode;
        }
        Bank $r0 = bank.copy($r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.bankCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bank copy(String str, String str2) {
        Log_OC.getArray(str, "name");
        Log_OC.getArray(str2, "bankCode");
        Bank $r0 = new Bank(str, str2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof Bank;
        if ($z0) {
            Bank $r3 = (Bank) obj;
            String $r4 = this.name;
            String $r1 = $r3.name;
            boolean $z02 = Log_OC.append($r4, $r1);
            if ($z02) {
                String $r12 = this.bankCode;
                String $r42 = $r3.bankCode;
                boolean $z03 = Log_OC.append($r12, $r42);
                return $z03;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBankCode() {
        String r1 = this.bankCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getName() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter.Searchable
    public String getSearchCriteria() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.name;
        int $i0 = $r1.hashCode();
        String $r12 = this.bankCode;
        int $i1 = $r12.hashCode();
        return ($i0 * 31) + $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Bank(name=");
        String $r1 = this.name;
        $r2.append($r1);
        $r2.append(", bankCode=");
        String $r12 = this.bankCode;
        $r2.append($r12);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }
}
