package ai.kudi.agent.wallettopup.data;

import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MonnifyDetails.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "Landroid/os/Parcelable;", MetricTracker.Object.MESSAGE, "", "account", "", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$AccountData;", "banks", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$BankData;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAccount", "()Ljava/util/List;", "getBanks", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AccountData", "BankData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MonnifyDetails implements Parcelable {
    public static final Parcelable.Creator<MonnifyDetails> CREATOR;
    private final List<AccountData> account;
    private final List<BankData> banks;
    private final String message;

    /* compiled from: MonnifyDetails.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/wallettopup/data/MonnifyDetails$AccountData;", "Landroid/os/Parcelable;", BanksWithMethods.ACCOUNT_NAME, "", BanksWithMethods.ACCOUNT_NUMBER, "accountReference", "bankCode", BanksWithMethods.BANK_NAME, "currencyCode", "customerEmail", "provider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "getAccountReference", "getBankCode", "getBankName", "getCurrencyCode", "getCustomerEmail", "getProvider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AccountData implements Parcelable {
        public static final Parcelable.Creator<AccountData> CREATOR;
        private final String accountName;
        private final String accountNumber;
        private final String accountReference;
        private final String bankCode;
        private final String bankName;
        private final String currencyCode;
        private final String customerEmail;
        private final String provider;

        /* compiled from: MonnifyDetails.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<AccountData> {
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountData createFromParcel(Parcel parcel) {
                Log_OC.getArray(parcel, "parcel");
                String $r3 = parcel.readString();
                String $r4 = parcel.readString();
                String $r5 = parcel.readString();
                String $r6 = parcel.readString();
                String $r7 = parcel.readString();
                String $r8 = parcel.readString();
                String $r9 = parcel.readString();
                String $r10 = parcel.readString();
                AccountData $r2 = new AccountData($r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ AccountData createFromParcel(Parcel parcel) {
                AccountData $r1 = createFromParcel(parcel);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountData[] newArray(int i) {
                AccountData[] $r1 = new AccountData[i];
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ AccountData[] newArray(int i) {
                AccountData[] $r1 = newArray(i);
                return $r1;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Creator $r0 = new Creator();
            CREATOR = $r0;
        }

        public AccountData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
            Log_OC.getArray(str2, BanksWithMethods.ACCOUNT_NUMBER);
            Log_OC.getArray(str3, "accountReference");
            Log_OC.getArray(str4, "bankCode");
            Log_OC.getArray(str5, BanksWithMethods.BANK_NAME);
            Log_OC.getArray(str6, "currencyCode");
            Log_OC.getArray(str7, "customerEmail");
            Log_OC.getArray(str8, "provider");
            this.accountName = str;
            this.accountNumber = str2;
            this.accountReference = str3;
            this.bankCode = str4;
            this.bankName = str5;
            this.currencyCode = str6;
            this.customerEmail = str7;
            this.provider = str8;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ AccountData copy$default(AccountData accountData, String $r2, String $r3, String $r4, String $r5, String $r6, String $r7, String $r8, String $r9, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = accountData.accountName;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = accountData.accountNumber;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r4 = accountData.accountReference;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r5 = accountData.bankCode;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r6 = accountData.bankName;
            }
            int $i16 = i & 32;
            if ($i16 != 0) {
                $r7 = accountData.currencyCode;
            }
            int $i17 = i & 64;
            if ($i17 != 0) {
                $r8 = accountData.customerEmail;
            }
            int $i0 = i & 128;
            if ($i0 != 0) {
                $r9 = accountData.provider;
            }
            AccountData $r0 = accountData.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.accountName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.accountNumber;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.accountReference;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.bankCode;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.bankName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component6() {
            String r1 = this.currencyCode;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component7() {
            String r1 = this.customerEmail;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component8() {
            String r1 = this.provider;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AccountData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
            Log_OC.getArray(str2, BanksWithMethods.ACCOUNT_NUMBER);
            Log_OC.getArray(str3, "accountReference");
            Log_OC.getArray(str4, "bankCode");
            Log_OC.getArray(str5, BanksWithMethods.BANK_NAME);
            Log_OC.getArray(str6, "currencyCode");
            Log_OC.getArray(str7, "customerEmail");
            Log_OC.getArray(str8, "provider");
            AccountData $r0 = new AccountData(str, str2, str3, str4, str5, str6, str7, str8);
            return $r0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof AccountData;
            if ($z0) {
                AccountData $r2 = (AccountData) obj;
                String $r3 = this.accountName;
                String $r4 = $r2.accountName;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.accountNumber;
                    String $r42 = $r2.accountNumber;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.accountReference;
                        String $r43 = $r2.accountReference;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.bankCode;
                            String $r44 = $r2.bankCode;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.bankName;
                                String $r45 = $r2.bankName;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.currencyCode;
                                    String $r46 = $r2.currencyCode;
                                    boolean $z07 = Log_OC.append($r36, $r46);
                                    if ($z07) {
                                        String $r37 = this.customerEmail;
                                        String $r47 = $r2.customerEmail;
                                        boolean $z08 = Log_OC.append($r37, $r47);
                                        if ($z08) {
                                            String $r38 = this.provider;
                                            String $r48 = $r2.provider;
                                            boolean $z09 = Log_OC.append($r38, $r48);
                                            return $z09;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
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
        public final String getAccountName() {
            String r1 = this.accountName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getAccountNumber() {
            String r1 = this.accountNumber;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getAccountReference() {
            String r1 = this.accountReference;
            return r1;
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
        public final String getBankName() {
            String r1 = this.bankName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getCurrencyCode() {
            String r1 = this.currencyCode;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getCustomerEmail() {
            String r1 = this.customerEmail;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getProvider() {
            String r1 = this.provider;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.accountName;
            int $i0 = $r1.hashCode();
            String $r12 = this.accountNumber;
            int $i1 = $r12.hashCode();
            String $r13 = this.accountReference;
            int $i12 = $r13.hashCode();
            String $r14 = this.bankCode;
            int $i13 = $r14.hashCode();
            String $r15 = this.bankName;
            int $i14 = $r15.hashCode();
            String $r16 = this.currencyCode;
            int $i15 = $r16.hashCode();
            String $r17 = this.customerEmail;
            int $i16 = $r17.hashCode();
            String $r18 = this.provider;
            int $i17 = $r18.hashCode();
            return ((((((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31) + $i16) * 31) + $i17;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("AccountData(accountName=");
            String $r1 = this.accountName;
            $r2.append($r1);
            $r2.append(", accountNumber=");
            String $r12 = this.accountNumber;
            $r2.append($r12);
            $r2.append(", accountReference=");
            String $r13 = this.accountReference;
            $r2.append($r13);
            $r2.append(", bankCode=");
            String $r14 = this.bankCode;
            $r2.append($r14);
            $r2.append(", bankName=");
            String $r15 = this.bankName;
            $r2.append($r15);
            $r2.append(", currencyCode=");
            String $r16 = this.currencyCode;
            $r2.append($r16);
            $r2.append(", customerEmail=");
            String $r17 = this.customerEmail;
            $r2.append($r17);
            $r2.append(", provider=");
            String $r18 = this.provider;
            $r2.append($r18);
            $r2.append(')');
            String $r19 = $r2.toString();
            return $r19;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "out");
            String $r2 = this.accountName;
            parcel.writeString($r2);
            String $r22 = this.accountNumber;
            parcel.writeString($r22);
            String $r23 = this.accountReference;
            parcel.writeString($r23);
            String $r24 = this.bankCode;
            parcel.writeString($r24);
            String $r25 = this.bankName;
            parcel.writeString($r25);
            String $r26 = this.currencyCode;
            parcel.writeString($r26);
            String $r27 = this.customerEmail;
            parcel.writeString($r27);
            String $r28 = this.provider;
            parcel.writeString($r28);
        }
    }

    /* compiled from: MonnifyDetails.kt */
    @Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/wallettopup/data/MonnifyDetails$BankData;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter$Searchable;", "Landroid/os/Parcelable;", "name", "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "getSearchCriteria", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BankData implements DynamicSearchAdapter.Searchable, Parcelable {
        public static final Parcelable.Creator<BankData> CREATOR;
        private final String code;
        private final String name;

        /* compiled from: MonnifyDetails.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<BankData> {
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankData createFromParcel(Parcel parcel) {
                Log_OC.getArray(parcel, "parcel");
                String $r3 = parcel.readString();
                String $r4 = parcel.readString();
                BankData $r2 = new BankData($r3, $r4);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ BankData createFromParcel(Parcel parcel) {
                BankData $r1 = createFromParcel(parcel);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankData[] newArray(int i) {
                BankData[] $r1 = new BankData[i];
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ BankData[] newArray(int i) {
                BankData[] $r1 = newArray(i);
                return $r1;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Creator $r0 = new Creator();
            CREATOR = $r0;
        }

        public BankData(String str, String str2) {
            Log_OC.getArray(str, "name");
            Log_OC.getArray(str2, "code");
            this.name = str;
            this.code = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ BankData copy$default(BankData bankData, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = bankData.name;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = bankData.code;
            }
            BankData $r0 = bankData.copy($r1, $r2);
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
            String r1 = this.code;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BankData copy(String str, String str2) {
            Log_OC.getArray(str, "name");
            Log_OC.getArray(str2, "code");
            BankData $r0 = new BankData(str, str2);
            return $r0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof BankData;
            if ($z0) {
                BankData $r3 = (BankData) obj;
                String $r4 = this.name;
                String $r1 = $r3.name;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.code;
                    String $r42 = $r3.code;
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
        public final String getCode() {
            String r1 = this.code;
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
            String $r12 = this.code;
            int $i1 = $r12.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("BankData(name=");
            String $r1 = this.name;
            $r2.append($r1);
            $r2.append(", code=");
            String $r12 = this.code;
            $r2.append($r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "out");
            String $r2 = this.name;
            parcel.writeString($r2);
            String $r22 = this.code;
            parcel.writeString($r22);
        }
    }

    /* compiled from: MonnifyDetails.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MonnifyDetails> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonnifyDetails createFromParcel(Parcel parcel) {
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            int $i0 = parcel.readInt();
            ArrayList $r1 = new ArrayList($i0);
            for (int $i2 = 0; $i2 != $i0; $i2++) {
                Parcelable.Creator $r4 = AccountData.CREATOR;
                $r1.add($r4.createFromParcel(parcel));
            }
            int $i02 = parcel.readInt();
            ArrayList $r6 = new ArrayList($i02);
            for (int $i1 = 0; $i1 != $i02; $i1++) {
                Parcelable.Creator $r42 = BankData.CREATOR;
                $r6.add($r42.createFromParcel(parcel));
            }
            MonnifyDetails $r7 = new MonnifyDetails($r3, $r1, $r6);
            return $r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MonnifyDetails createFromParcel(Parcel parcel) {
            MonnifyDetails $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonnifyDetails[] newArray(int i) {
            MonnifyDetails[] $r1 = new MonnifyDetails[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MonnifyDetails[] newArray(int i) {
            MonnifyDetails[] $r1 = newArray(i);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Creator $r0 = new Creator();
        CREATOR = $r0;
    }

    public MonnifyDetails(String str, List list, List list2) {
        Log_OC.getArray(list, "account");
        Log_OC.getArray(list2, "banks");
        this.message = str;
        this.account = list;
        this.banks = list2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ MonnifyDetails copy$default(MonnifyDetails monnifyDetails, String $r1, List $r2, List $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = monnifyDetails.message;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = monnifyDetails.account;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r3 = monnifyDetails.banks;
        }
        MonnifyDetails $r0 = monnifyDetails.copy($r1, $r2, $r3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.message;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component2() {
        List r1 = this.account;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component3() {
        List r1 = this.banks;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MonnifyDetails copy(String str, List list, List list2) {
        Log_OC.getArray(list, "account");
        Log_OC.getArray(list2, "banks");
        MonnifyDetails $r0 = new MonnifyDetails(str, list, list2);
        return $r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof MonnifyDetails;
        if ($z0) {
            MonnifyDetails $r2 = (MonnifyDetails) obj;
            String $r3 = this.message;
            String $r4 = $r2.message;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                List $r5 = this.account;
                List $r6 = $r2.account;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    List $r52 = this.banks;
                    List $r62 = $r2.banks;
                    boolean $z04 = Log_OC.append($r52, $r62);
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
    public final List getAccount() {
        List r1 = this.account;
        return r1;
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
    public final String getMessage() {
        String r1 = this.message;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.message;
        int $i0 = $r1 == null ? 0 : $r1.hashCode();
        List $r2 = this.account;
        int $i1 = $r2.hashCode();
        List $r22 = this.banks;
        int $i12 = $r22.hashCode();
        return ((($i0 * 31) + $i1) * 31) + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("MonnifyDetails(message=");
        String $r1 = this.message;
        $r2.append((Object) $r1);
        $r2.append(", account=");
        List $r3 = this.account;
        $r2.append($r3);
        $r2.append(", banks=");
        List $r32 = this.banks;
        $r2.append($r32);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001b */
    /* JADX WARN: Incorrect condition in loop: B:8:0x003a */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "out"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            java.lang.String r1 = r11.message
            r12.writeString(r1)
            java.util.List<ai.kudi.agent.wallettopup.data.MonnifyDetails$AccountData> r2 = r11.account
            int r3 = r2.size()
            r12.writeInt(r3)
            java.util.Iterator r4 = r2.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L29
            java.lang.Object r6 = r4.next()
            r8 = r6
            ai.kudi.agent.wallettopup.data.MonnifyDetails$AccountData r8 = (ai.kudi.agent.wallettopup.data.MonnifyDetails.AccountData) r8
            r7 = r8
            r7.writeToParcel(r12, r13)
            goto L17
        L29:
            java.util.List<ai.kudi.agent.wallettopup.data.MonnifyDetails$BankData> r2 = r11.banks
            int r3 = r2.size()
            r12.writeInt(r3)
            java.util.Iterator r4 = r2.iterator()
        L36:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r6 = r4.next()
            r10 = r6
            ai.kudi.agent.wallettopup.data.MonnifyDetails$BankData r10 = (ai.kudi.agent.wallettopup.data.MonnifyDetails.BankData) r10
            r9 = r10
            r9.writeToParcel(r12, r13)
            goto L36
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.data.MonnifyDetails.writeToParcel(android.os.Parcel, int):void");
    }
}
