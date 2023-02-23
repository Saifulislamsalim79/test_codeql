package ai.kudi.agent.product.airtime_data.data;

import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AirtimePurchaseRequest.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\n\u0010&\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00065"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "network", "Lai/kudi/agent/product/airtime_data/data/Networks;", TransactionField.AMOUNT, "", "phoneNumber", "", "serviceFee", "purchaseType", "type", "walletBalance", "", "(Lai/kudi/agent/product/airtime_data/data/Networks;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getAmount", "()I", "getNetwork", "()Lai/kudi/agent/product/airtime_data/data/Networks;", "getPhoneNumber", "()Ljava/lang/String;", "getPurchaseType", "getServiceFee", "getType", "getWalletBalance", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "getProductId", "getRequestAmount", "getRequestType", "hashCode", "setRequestServiceFee", "toBillerRequest", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "location", "Landroid/location/Location;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AirtimePurchase implements ProductPurchase {
    public static final Parcelable.Creator<AirtimePurchase> CREATOR;
    private final int amount;
    private final Networks network;
    private final String phoneNumber;
    private final String purchaseType;
    private final String serviceFee;
    private final String type;
    private final double walletBalance;

    /* compiled from: AirtimePurchaseRequest.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<AirtimePurchase> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimePurchase createFromParcel(Parcel parcel) {
            Networks createFromParcel;
            Log_OC.getArray(parcel, "parcel");
            int $i0 = parcel.readInt();
            if ($i0 == 0) {
                createFromParcel = null;
            } else {
                Parcelable.Creator $r4 = Networks.CREATOR;
                createFromParcel = $r4.createFromParcel(parcel);
            }
            Networks $r5 = createFromParcel;
            int $i02 = parcel.readInt();
            String $r6 = parcel.readString();
            String $r7 = parcel.readString();
            String $r8 = parcel.readString();
            String $r9 = parcel.readString();
            double $d0 = parcel.readDouble();
            AirtimePurchase $r2 = new AirtimePurchase($r5, $i02, $r6, $r7, $r8, $r9, $d0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AirtimePurchase createFromParcel(Parcel parcel) {
            AirtimePurchase $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimePurchase[] newArray(int i) {
            AirtimePurchase[] $r1 = new AirtimePurchase[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AirtimePurchase[] newArray(int i) {
            AirtimePurchase[] $r1 = newArray(i);
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

    public AirtimePurchase(Networks networks, int i, String str, String str2, String str3, String str4, double d) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "serviceFee");
        Log_OC.getArray(str3, "purchaseType");
        Log_OC.getArray(str4, "type");
        this.network = networks;
        this.amount = i;
        this.phoneNumber = str;
        this.serviceFee = str2;
        this.purchaseType = str3;
        this.type = str4;
        this.walletBalance = d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AirtimePurchase(ai.kudi.agent.product.airtime_data.data.Networks r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, double r9, int r11, kotlin.p483e0.p485d.DBUtils$1 r12) {
        /*
            r2 = this;
            r0 = r11 & 1
            if (r0 == 0) goto L6
            r3 = 0
            goto L6
        L6:
            r0 = r11 & 2
            if (r0 == 0) goto Lc
            r4 = 0
            goto Lc
        Lc:
            r0 = r11 & 8
            if (r0 == 0) goto L13
            java.lang.String r6 = ""
            goto L13
        L13:
            r0 = r11 & 16
            if (r0 == 0) goto L1e
            ai.kudi.agent.product.airtime_data.data.AirtimePurchaseTypes r1 = ai.kudi.agent.product.airtime_data.data.AirtimePurchaseTypes.FIRST_CLASS
            java.lang.String r7 = r1.name()
            goto L1e
        L1e:
            r0 = r11 & 32
            if (r0 == 0) goto L25
            java.lang.String r8 = "topup"
            goto L25
        L25:
            r11 = r11 & 64
            if (r11 == 0) goto L2c
            r9 = 0
            goto L2c
        L2c:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.data.AirtimePurchase.<init>(ai.kudi.agent.product.airtime_data.data.Networks, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AirtimePurchase copy$default(AirtimePurchase airtimePurchase, Networks $r2, int $i1, String $r3, String $r4, String $r5, String $r6, double $d0, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r2 = airtimePurchase.network;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $i1 = airtimePurchase.amount;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $r3 = airtimePurchase.phoneNumber;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $r4 = airtimePurchase.serviceFee;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $r5 = airtimePurchase.purchaseType;
        }
        int $i26 = i & 32;
        if ($i26 != 0) {
            $r6 = airtimePurchase.type;
        }
        int $i0 = i & 64;
        if ($i0 != 0) {
            $d0 = airtimePurchase.walletBalance;
        }
        AirtimePurchase $r0 = airtimePurchase.copy($r2, $i1, $r3, $r4, $r5, $r6, $d0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Networks component1() {
        Networks r1 = this.network;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component2() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.serviceFee;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.purchaseType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component7() {
        double d0 = this.walletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AirtimePurchase copy(Networks networks, int i, String str, String str2, String str3, String str4, double d) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "serviceFee");
        Log_OC.getArray(str3, "purchaseType");
        Log_OC.getArray(str4, "type");
        AirtimePurchase $r0 = new AirtimePurchase(networks, i, str, str2, str3, str4, d);
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
        boolean $z0 = obj instanceof AirtimePurchase;
        if ($z0) {
            AirtimePurchase $r2 = (AirtimePurchase) obj;
            Networks $r3 = this.network;
            Networks $r4 = $r2.network;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                int $i0 = this.amount;
                int $i1 = $r2.amount;
                if ($i0 != $i1) {
                    return false;
                }
                String $r5 = this.phoneNumber;
                String $r6 = $r2.phoneNumber;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    String $r52 = this.serviceFee;
                    String $r62 = $r2.serviceFee;
                    boolean $z04 = Log_OC.append($r52, $r62);
                    if ($z04) {
                        String $r53 = this.purchaseType;
                        String $r63 = $r2.purchaseType;
                        boolean $z05 = Log_OC.append($r53, $r63);
                        if ($z05) {
                            String $r54 = this.type;
                            String $r64 = $r2.type;
                            boolean $z06 = Log_OC.append($r54, $r64);
                            if ($z06) {
                                double $d0 = this.walletBalance;
                                Double $r7 = Double.valueOf($d0);
                                double $d02 = $r2.walletBalance;
                                Double $r8 = Double.valueOf($d02);
                                boolean $z07 = Log_OC.append($r7, $r8);
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
            return false;
        }
        return false;
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
    public final Networks getNetwork() {
        Networks r1 = this.network;
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
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public String getProductId() {
        Networks $r2 = this.network;
        if ($r2 == null) {
            return null;
        }
        String $r1 = $r2.getProductId();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPurchaseType() {
        String r1 = this.purchaseType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public int getRequestAmount() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public String getRequestType() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getServiceFee() {
        String r1 = this.serviceFee;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getType() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getWalletBalance() {
        double d0 = this.walletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        Networks $r1 = this.network;
        int $i0 = $r1 == null ? 0 : $r1.hashCode();
        int $i1 = this.amount;
        String $r2 = this.phoneNumber;
        int $i12 = $r2.hashCode();
        String $r22 = this.serviceFee;
        int $i13 = $r22.hashCode();
        String $r23 = this.purchaseType;
        int $i14 = $r23.hashCode();
        String $r24 = this.type;
        int $i15 = $r24.hashCode();
        double $d0 = this.walletBalance;
        int $i16 = Tags.append($d0);
        return ((((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31) + $i16;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public AirtimePurchase setRequestServiceFee(String str) {
        Log_OC.getArray(str, "serviceFee");
        AirtimePurchase $r0 = copy$default(this, null, 0, null, str, null, null, 0.0d, 119, null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public /* bridge */ /* synthetic */ ProductPurchase setRequestServiceFee(String str) {
        AirtimePurchase $r0 = setRequestServiceFee(str);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public BillRequest toBillerRequest(Location location) {
        Log_OC.getArray(location, "location");
        String $r3 = this.phoneNumber;
        double $d0 = location.getLatitude();
        float $f0 = (float) $d0;
        double $d02 = location.getLongitude();
        float $f1 = (float) $d02;
        Meta $r2 = new Meta($r3, "", "", true, "", $f0, $f1);
        MPOSPaymentMethod.Companion $r4 = MPOSPaymentMethod.Companion;
        MPOSPaymentMethod $r5 = $r4.empty();
        String $r32 = this.phoneNumber;
        Networks $r7 = this.network;
        Log_OC.append($r7);
        String $r8 = $r7.getProductId();
        String $r9 = this.type;
        int $i0 = this.amount;
        BillRequest $r6 = new BillRequest($r32, $r8, $r9, $i0, "", $r2, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("AirtimePurchase(network=");
        Networks $r3 = this.network;
        $r2.append($r3);
        $r2.append(", amount=");
        int $i0 = this.amount;
        $r2.append($i0);
        $r2.append(", phoneNumber=");
        String $r1 = this.phoneNumber;
        $r2.append($r1);
        $r2.append(", serviceFee=");
        String $r12 = this.serviceFee;
        $r2.append($r12);
        $r2.append(", purchaseType=");
        String $r13 = this.purchaseType;
        $r2.append($r13);
        $r2.append(", type=");
        String $r14 = this.type;
        $r2.append($r14);
        $r2.append(", walletBalance=");
        double $d0 = this.walletBalance;
        $r2.append($d0);
        $r2.append(')');
        String $r15 = $r2.toString();
        return $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Log_OC.getArray(parcel, "out");
        Networks $r2 = this.network;
        if ($r2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            $r2.writeToParcel(parcel, i);
        }
        int $i0 = this.amount;
        parcel.writeInt($i0);
        String $r3 = this.phoneNumber;
        parcel.writeString($r3);
        String $r32 = this.serviceFee;
        parcel.writeString($r32);
        String $r33 = this.purchaseType;
        parcel.writeString($r33);
        String $r34 = this.type;
        parcel.writeString($r34);
        double $d0 = this.walletBalance;
        parcel.writeDouble($d0);
    }
}
