package ai.kudi.agent.users.domain.package_1;

import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TransferRequest.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0010HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0006HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, m10421d2 = {"Lai/kudi/agent/users/domain/dto/TransferRequest;", "Landroid/os/Parcelable;", BanksWithMethods.ACCOUNT_NUMBER, "", "bankCode", TransactionField.AMOUNT, "", BanksWithMethods.ACCOUNT_NAME, "phoneNumber", "serviceFeeIncluded", "", "mposPaymentMethod", "Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;", "sendersPhone", "reason", "meta", "Lai/kudi/agent/bills/domain/dto/Meta;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/bills/domain/dto/Meta;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "getAmount", "()I", "getBankCode", "getMeta", "()Lai/kudi/agent/bills/domain/dto/Meta;", "getMposPaymentMethod", "()Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;", "getPhoneNumber", "getReason", "getSendersPhone", "getServiceFeeIncluded", "()Z", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferRequest implements Parcelable {
    public static final Parcelable.Creator<ai.kudi.agent.users.domain.dto.TransferRequest> CREATOR;
    public static final Companion Companion;
    public static final String PARCEL_NAME = "domain.dto.TransferRequest";
    private final String accountName;
    private final String accountNumber;
    private final int amount;
    private final String bankCode;
    private final Meta meta;
    private final MPOSPaymentMethod mposPaymentMethod;
    private final String phoneNumber;
    private final String reason;
    private final String sendersPhone;
    private final boolean serviceFeeIncluded;

    /* compiled from: TransferRequest.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/users/domain/dto/TransferRequest$Companion;", "", "()V", "PARCEL_NAME", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: TransferRequest.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Creator implements Parcelable.Creator<ai.kudi.agent.users.domain.dto.TransferRequest> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public final ai.kudi.agent.users.domain.dto.TransferRequest createFromParcel(Parcel parcel) {
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            String $r4 = parcel.readString();
            int $i0 = parcel.readInt();
            String $r5 = parcel.readString();
            String $r6 = parcel.readString();
            int $i1 = parcel.readInt();
            boolean z = $i1 != 0;
            ClassLoader $r8 = ai.kudi.agent.users.domain.dto.TransferRequest.class.getClassLoader();
            Parcelable $r9 = parcel.readParcelable($r8);
            MPOSPaymentMethod mPOSPaymentMethod = (MPOSPaymentMethod) $r9;
            String $r11 = parcel.readString();
            String $r12 = parcel.readString();
            ClassLoader $r82 = ai.kudi.agent.users.domain.dto.TransferRequest.class.getClassLoader();
            Parcelable $r92 = parcel.readParcelable($r82);
            Meta $r13 = (Meta) $r92;
            TransferRequest $r2 = new TransferRequest($r3, $r4, $i0, $r5, $r6, z, mPOSPaymentMethod, $r11, $r12, $r13);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ ai.kudi.agent.users.domain.dto.TransferRequest createFromParcel2(Parcel parcel) {
            TransferRequest $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public final ai.kudi.agent.users.domain.dto.TransferRequest[] newArray(int i) {
            TransferRequest[] $r1 = new TransferRequest[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ ai.kudi.agent.users.domain.dto.TransferRequest[] newArray2(int i) {
            TransferRequest[] $r1 = newArray(i);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        Creator $r1 = new Creator();
        CREATOR = $r1;
    }

    public TransferRequest(String str, String str2, int i, String str3, String str4, boolean z, MPOSPaymentMethod mPOSPaymentMethod, String str5, String str6, Meta meta) {
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NUMBER);
        Log_OC.getArray(str2, "bankCode");
        Log_OC.getArray(str3, BanksWithMethods.ACCOUNT_NAME);
        Log_OC.getArray(str4, "phoneNumber");
        Log_OC.getArray(mPOSPaymentMethod, "mposPaymentMethod");
        Log_OC.getArray(str5, "sendersPhone");
        Log_OC.getArray(str6, "reason");
        Log_OC.getArray(meta, "meta");
        this.accountNumber = str;
        this.bankCode = str2;
        this.amount = i;
        this.accountName = str3;
        this.phoneNumber = str4;
        this.serviceFeeIncluded = z;
        this.mposPaymentMethod = mPOSPaymentMethod;
        this.sendersPhone = str5;
        this.reason = str6;
        this.meta = meta;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ TransferRequest copy$default(TransferRequest transferRequest, String $r2, String $r3, int $i1, String $r4, String $r5, boolean $z0, MPOSPaymentMethod $r6, String $r7, String $r8, Meta $r9, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r2 = transferRequest.accountNumber;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r3 = transferRequest.bankCode;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $i1 = transferRequest.amount;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $r4 = transferRequest.accountName;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $r5 = transferRequest.phoneNumber;
        }
        int $i26 = i & 32;
        if ($i26 != 0) {
            $z0 = transferRequest.serviceFeeIncluded;
        }
        int $i27 = i & 64;
        if ($i27 != 0) {
            $r6 = transferRequest.mposPaymentMethod;
        }
        int $i28 = i & 128;
        if ($i28 != 0) {
            $r7 = transferRequest.sendersPhone;
        }
        int $i29 = i & 256;
        if ($i29 != 0) {
            $r8 = transferRequest.reason;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i0 != 0) {
            $r9 = transferRequest.meta;
        }
        TransferRequest $r0 = transferRequest.copy($r2, $r3, $i1, $r4, $r5, $z0, $r6, $r7, $r8, $r9);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.accountNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Meta component10() {
        Meta r1 = this.meta;
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
    public final int component3() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.accountName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component6() {
        boolean z0 = this.serviceFeeIncluded;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MPOSPaymentMethod component7() {
        MPOSPaymentMethod r1 = this.mposPaymentMethod;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.sendersPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.reason;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransferRequest copy(String str, String str2, int i, String str3, String str4, boolean z, MPOSPaymentMethod mPOSPaymentMethod, String str5, String str6, Meta meta) {
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NUMBER);
        Log_OC.getArray(str2, "bankCode");
        Log_OC.getArray(str3, BanksWithMethods.ACCOUNT_NAME);
        Log_OC.getArray(str4, "phoneNumber");
        Log_OC.getArray(mPOSPaymentMethod, "mposPaymentMethod");
        Log_OC.getArray(str5, "sendersPhone");
        Log_OC.getArray(str6, "reason");
        Log_OC.getArray(meta, "meta");
        TransferRequest $r0 = new TransferRequest(str, str2, i, str3, str4, z, mPOSPaymentMethod, str5, str6, meta);
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
        boolean $z0 = obj instanceof TransferRequest;
        if ($z0) {
            TransferRequest $r2 = (TransferRequest) obj;
            String $r3 = this.accountNumber;
            String $r4 = $r2.accountNumber;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.bankCode;
                String $r42 = $r2.bankCode;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    int $i0 = this.amount;
                    int $i1 = $r2.amount;
                    if ($i0 != $i1) {
                        return false;
                    }
                    String $r33 = this.accountName;
                    String $r43 = $r2.accountName;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        String $r34 = this.phoneNumber;
                        String $r44 = $r2.phoneNumber;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            boolean $z06 = this.serviceFeeIncluded;
                            boolean $z1 = $r2.serviceFeeIncluded;
                            if ($z06 != $z1) {
                                return false;
                            }
                            MPOSPaymentMethod $r5 = this.mposPaymentMethod;
                            MPOSPaymentMethod $r6 = $r2.mposPaymentMethod;
                            boolean $z07 = Log_OC.append($r5, $r6);
                            if ($z07) {
                                String $r35 = this.sendersPhone;
                                String $r45 = $r2.sendersPhone;
                                boolean $z08 = Log_OC.append($r35, $r45);
                                if ($z08) {
                                    String $r36 = this.reason;
                                    String $r46 = $r2.reason;
                                    boolean $z09 = Log_OC.append($r36, $r46);
                                    if ($z09) {
                                        Meta $r7 = this.meta;
                                        Meta $r8 = $r2.meta;
                                        boolean $z010 = Log_OC.append($r7, $r8);
                                        return $z010;
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
    public final int getAmount() {
        int i0 = this.amount;
        return i0;
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
    public final Meta getMeta() {
        Meta r1 = this.meta;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MPOSPaymentMethod getMposPaymentMethod() {
        MPOSPaymentMethod r1 = this.mposPaymentMethod;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReason() {
        String r1 = this.reason;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSendersPhone() {
        String r1 = this.sendersPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getServiceFeeIncluded() {
        boolean z0 = this.serviceFeeIncluded;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.accountNumber;
        int $i0 = $r1.hashCode();
        String $r12 = this.bankCode;
        int $i1 = $r12.hashCode();
        int $i12 = this.amount;
        String $r13 = this.accountName;
        int $i13 = $r13.hashCode();
        String $r14 = this.phoneNumber;
        int $i14 = $r14.hashCode();
        int $i02 = (((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31;
        boolean $z0 = this.serviceFeeIncluded;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i15 = i;
        MPOSPaymentMethod $r2 = this.mposPaymentMethod;
        int $i16 = $r2.hashCode();
        String $r15 = this.sendersPhone;
        int $i17 = $r15.hashCode();
        String $r16 = this.reason;
        int $i18 = $r16.hashCode();
        Meta $r3 = this.meta;
        int $i19 = $r3.hashCode();
        return (((((((($i02 + $i15) * 31) + $i16) * 31) + $i17) * 31) + $i18) * 31) + $i19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("TransferRequest(accountNumber=");
        String $r1 = this.accountNumber;
        $r2.append($r1);
        $r2.append(", bankCode=");
        String $r12 = this.bankCode;
        $r2.append($r12);
        $r2.append(", amount=");
        int $i0 = this.amount;
        $r2.append($i0);
        $r2.append(", accountName=");
        String $r13 = this.accountName;
        $r2.append($r13);
        $r2.append(", phoneNumber=");
        String $r14 = this.phoneNumber;
        $r2.append($r14);
        $r2.append(", serviceFeeIncluded=");
        boolean $z0 = this.serviceFeeIncluded;
        $r2.append($z0);
        $r2.append(", mposPaymentMethod=");
        MPOSPaymentMethod $r3 = this.mposPaymentMethod;
        $r2.append($r3);
        $r2.append(", sendersPhone=");
        String $r15 = this.sendersPhone;
        $r2.append($r15);
        $r2.append(", reason=");
        String $r16 = this.reason;
        $r2.append($r16);
        $r2.append(", meta=");
        Meta $r4 = this.meta;
        $r2.append($r4);
        $r2.append(')');
        String $r17 = $r2.toString();
        return $r17;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Log_OC.getArray(parcel, "out");
        String $r2 = this.accountNumber;
        parcel.writeString($r2);
        String $r22 = this.bankCode;
        parcel.writeString($r22);
        int $i1 = this.amount;
        parcel.writeInt($i1);
        String $r23 = this.accountName;
        parcel.writeString($r23);
        String $r24 = this.phoneNumber;
        parcel.writeString($r24);
        parcel.writeInt(this.serviceFeeIncluded ? 1 : 0);
        MPOSPaymentMethod $r3 = this.mposPaymentMethod;
        parcel.writeParcelable($r3, i);
        String $r25 = this.sendersPhone;
        parcel.writeString($r25);
        String $r26 = this.reason;
        parcel.writeString($r26);
        Meta $r4 = this.meta;
        parcel.writeParcelable($r4, i);
    }
}
