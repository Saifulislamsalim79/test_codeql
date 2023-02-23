package ai.kudi.agent.product.airtime_data.data;

import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AirtimePurchaseRequest.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\t\u0010'\u001a\u00020\u001fHÖ\u0001J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00063"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/data/DataPurchase;", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "network", "Lai/kudi/agent/product/airtime_data/data/Networks;", "phoneNumber", "", "serviceFee", "type", "plan", "Lai/kudi/agent/product/airtime_data/data/Plan;", "walletBalance", "", "(Lai/kudi/agent/product/airtime_data/data/Networks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/product/airtime_data/data/Plan;D)V", "getNetwork", "()Lai/kudi/agent/product/airtime_data/data/Networks;", "getPhoneNumber", "()Ljava/lang/String;", "getPlan", "()Lai/kudi/agent/product/airtime_data/data/Plan;", "getServiceFee", "getType", "getWalletBalance", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "getProductId", "getRequestAmount", "getRequestType", "hashCode", "setRequestServiceFee", "toBillerRequest", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "location", "Landroid/location/Location;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DataPurchase implements ProductPurchase {
    public static final Parcelable.Creator<DataPurchase> CREATOR;
    private final Networks network;
    private final String phoneNumber;
    private final Plan plan;
    private final String serviceFee;
    private final String type;
    private final double walletBalance;

    /* compiled from: AirtimePurchaseRequest.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<DataPurchase> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataPurchase createFromParcel(Parcel parcel) {
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
            String $r6 = parcel.readString();
            String $r7 = parcel.readString();
            String $r8 = parcel.readString();
            Parcelable.Creator $r42 = Plan.CREATOR;
            Object $r3 = $r42.createFromParcel(parcel);
            double $d0 = parcel.readDouble();
            DataPurchase $r2 = new DataPurchase($r5, $r6, $r7, $r8, (Plan) $r3, $d0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataPurchase createFromParcel(Parcel parcel) {
            DataPurchase $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataPurchase[] newArray(int i) {
            DataPurchase[] $r1 = new DataPurchase[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataPurchase[] newArray(int i) {
            DataPurchase[] $r1 = newArray(i);
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

    public DataPurchase(Networks networks, String str, String str2, String str3, Plan plan, double d) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "serviceFee");
        Log_OC.getArray(str3, "type");
        Log_OC.getArray(plan, "plan");
        this.network = networks;
        this.phoneNumber = str;
        this.serviceFee = str2;
        this.type = str3;
        this.plan = plan;
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
    public /* synthetic */ DataPurchase(ai.kudi.agent.product.airtime_data.data.Networks r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, ai.kudi.agent.product.airtime_data.data.Plan r20, double r21, int r23, kotlin.p483e0.p485d.DBUtils$1 r24) {
        /*
            r15 = this;
            r8 = r23 & 1
            if (r8 == 0) goto L7
            r16 = 0
            goto L7
        L7:
            r8 = r23 & 4
            if (r8 == 0) goto Le
            java.lang.String r18 = ""
            goto Le
        Le:
            r8 = r23 & 8
            if (r8 == 0) goto L15
            java.lang.String r19 = "data"
            goto L15
        L15:
            r8 = r23 & 16
            if (r8 == 0) goto L2f
            ai.kudi.agent.product.airtime_data.data.Plan r20 = new ai.kudi.agent.product.airtime_data.data.Plan
            r9 = r20
            java.lang.String r10 = "10GB"
            r11 = 2000(0x7d0, float:2.803E-42)
            r12 = 0
            r13 = 4
            r14 = 0
            r0 = r20
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            goto L31
        L2f:
            r9 = r20
        L31:
            r23 = r23 & 32
            if (r23 == 0) goto L38
            r21 = 0
            goto L38
        L38:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r9
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.data.DataPurchase.<init>(ai.kudi.agent.product.airtime_data.data.Networks, java.lang.String, java.lang.String, java.lang.String, ai.kudi.agent.product.airtime_data.data.Plan, double, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ DataPurchase copy$default(DataPurchase dataPurchase, Networks $r4, String $r5, String $r0, String $r1, Plan $r2, double $d0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r4 = dataPurchase.network;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r5 = dataPurchase.phoneNumber;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r0 = dataPurchase.serviceFee;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r1 = dataPurchase.type;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r2 = dataPurchase.plan;
        }
        int $i0 = i & 32;
        if ($i0 != 0) {
            $d0 = dataPurchase.walletBalance;
        }
        DataPurchase $r3 = dataPurchase.copy($r4, $r5, $r0, $r1, $r2, $d0);
        return $r3;
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
    public final String component2() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.serviceFee;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Plan component5() {
        Plan r1 = this.plan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component6() {
        double d0 = this.walletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DataPurchase copy(Networks networks, String str, String str2, String str3, Plan plan, double d) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "serviceFee");
        Log_OC.getArray(str3, "type");
        Log_OC.getArray(plan, "plan");
        DataPurchase $r0 = new DataPurchase(networks, str, str2, str3, plan, d);
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
        boolean $z0 = obj instanceof DataPurchase;
        if ($z0) {
            DataPurchase $r2 = (DataPurchase) obj;
            Networks $r3 = this.network;
            Networks $r4 = $r2.network;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r5 = this.phoneNumber;
                String $r6 = $r2.phoneNumber;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    String $r52 = this.serviceFee;
                    String $r62 = $r2.serviceFee;
                    boolean $z04 = Log_OC.append($r52, $r62);
                    if ($z04) {
                        String $r53 = this.type;
                        String $r63 = $r2.type;
                        boolean $z05 = Log_OC.append($r53, $r63);
                        if ($z05) {
                            Plan $r7 = this.plan;
                            Plan $r8 = $r2.plan;
                            boolean $z06 = Log_OC.append($r7, $r8);
                            if ($z06) {
                                double $d0 = this.walletBalance;
                                Double $r9 = Double.valueOf($d0);
                                double $d02 = $r2.walletBalance;
                                Double $r10 = Double.valueOf($d02);
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
            return false;
        }
        return false;
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
    public final Plan getPlan() {
        Plan r1 = this.plan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public String getProductId() {
        Plan $r2 = this.plan;
        String $r1 = $r2.getProductId();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public int getRequestAmount() {
        Plan $r1 = this.plan;
        int $i0 = $r1.getAmount();
        return $i0;
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
        String $r2 = this.phoneNumber;
        int $i1 = $r2.hashCode();
        String $r22 = this.serviceFee;
        int $i12 = $r22.hashCode();
        String $r23 = this.type;
        int $i13 = $r23.hashCode();
        Plan $r3 = this.plan;
        int $i14 = $r3.hashCode();
        double $d0 = this.walletBalance;
        int $i15 = Tags.append($d0);
        return ((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public DataPurchase setRequestServiceFee(String str) {
        Log_OC.getArray(str, "serviceFee");
        DataPurchase $r0 = copy$default(this, null, null, str, null, null, 0.0d, 59, null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.data.ProductPurchase
    public /* bridge */ /* synthetic */ ProductPurchase setRequestServiceFee(String str) {
        DataPurchase $r0 = setRequestServiceFee(str);
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
        Plan $r10 = this.plan;
        int $i0 = $r10.getAmount();
        BillRequest $r6 = new BillRequest($r32, $r8, $r9, $i0, "", $r2, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("DataPurchase(network=");
        Networks $r3 = this.network;
        $r2.append($r3);
        $r2.append(", phoneNumber=");
        String $r1 = this.phoneNumber;
        $r2.append($r1);
        $r2.append(", serviceFee=");
        String $r12 = this.serviceFee;
        $r2.append($r12);
        $r2.append(", type=");
        String $r13 = this.type;
        $r2.append($r13);
        $r2.append(", plan=");
        Plan $r4 = this.plan;
        $r2.append($r4);
        $r2.append(", walletBalance=");
        double $d0 = this.walletBalance;
        $r2.append($d0);
        $r2.append(')');
        String $r14 = $r2.toString();
        return $r14;
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
        String $r3 = this.phoneNumber;
        parcel.writeString($r3);
        String $r32 = this.serviceFee;
        parcel.writeString($r32);
        String $r33 = this.type;
        parcel.writeString($r33);
        Plan $r4 = this.plan;
        $r4.writeToParcel(parcel, i);
        double $d0 = this.walletBalance;
        parcel.writeDouble($d0);
    }
}
