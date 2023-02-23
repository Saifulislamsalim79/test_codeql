package ai.kudi.agent.bills.data;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: Biller.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, m10421d2 = {"Lai/kudi/agent/bills/data/Product;", "Landroid/os/Parcelable;", "id", "", "name", TransactionField.AMOUNT, "", "type", "types", "", "requiresPhone", "billerId", "localId", "availability", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvailability", "()Z", "getBillerId", "()Ljava/lang/String;", "getId", "getLocalId", "getName", "getRequiresPhone", "()I", "getType", "getTypes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Z)Lai/kudi/agent/bills/data/Product;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Product implements Parcelable {
    public static final Parcelable.Creator<Product> CREATOR;
    private final Integer amount;
    private final boolean availability;
    private final String billerId;
    private final String localId;
    private final String name;
    private final int requiresPhone;
    private final String type;
    private final List<String> types;
    private final String value;

    /* compiled from: Biller.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Product> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product createFromParcel(Parcel parcel) {
            Integer $r1;
            Log_OC.getArray(parcel, "parcel");
            String $r4 = parcel.readString();
            String $r5 = parcel.readString();
            int $i0 = parcel.readInt();
            if ($i0 == 0) {
                $r1 = null;
            } else {
                int $i02 = parcel.readInt();
                $r1 = Integer.valueOf($i02);
            }
            String $r6 = parcel.readString();
            ArrayList $r7 = parcel.createStringArrayList();
            int $i03 = parcel.readInt();
            String $r8 = parcel.readString();
            String $r9 = parcel.readString();
            int $i1 = parcel.readInt();
            Product $r3 = new Product($r4, $r5, $r1, $r6, $r7, $i03, $r8, $r9, $i1 != 0);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Product createFromParcel(Parcel parcel) {
            Product $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product[] newArray(int i) {
            Product[] $r1 = new Product[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Product[] newArray(int i) {
            Product[] $r1 = newArray(i);
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

    public Product() {
        this(null, null, null, null, null, 0, null, null, false, 511, null);
    }

    public Product(String str, String str2, Integer num, String str3, List list, int i, String str4, String str5, boolean z) {
        Log_OC.getArray(str, "id");
        Log_OC.getArray(str2, "name");
        Log_OC.getArray(str3, "type");
        Log_OC.getArray(list, "types");
        Log_OC.getArray(str5, "localId");
        this.value = str;
        this.name = str2;
        this.amount = num;
        this.type = str3;
        this.types = list;
        this.requiresPhone = i;
        this.billerId = str4;
        this.localId = str5;
        this.availability = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Product(java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, java.util.List r21, int r22, java.lang.String r23, java.lang.String r24, boolean r25, int r26, kotlin.p483e0.p485d.DBUtils$1 r27) {
        /*
            r16 = this;
            r10 = r26 & 1
            java.lang.String r11 = ""
            if (r10 == 0) goto L9
            java.lang.String r17 = ""
            goto L9
        L9:
            r10 = r26 & 2
            if (r10 == 0) goto L10
            java.lang.String r18 = ""
            goto L10
        L10:
            r10 = r26 & 4
            if (r10 == 0) goto L1a
            r12 = 0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r12)
            goto L1a
        L1a:
            r10 = r26 & 8
            if (r10 == 0) goto L21
            java.lang.String r20 = ""
            goto L21
        L21:
            r10 = r26 & 16
            if (r10 == 0) goto L2a
            java.util.List r21 = kotlin.p557z.C13722p.m3941e()
            goto L2a
        L2a:
            r10 = r26 & 32
            r13 = 1
            if (r10 == 0) goto L32
            r22 = 1
            goto L32
        L32:
            r10 = r26 & 64
            if (r10 == 0) goto L39
            r23 = 0
            goto L39
        L39:
            r0 = r26
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L4c
            java.lang.String r15 = "data"
            r0 = r20
            boolean r14 = kotlin.p483e0.p485d.Log_OC.append(r0, r15)
            if (r14 != 0) goto L4e
            r11 = r17
            goto L4e
        L4c:
            r11 = r24
        L4e:
            r0 = r26
            r0 = r0 & 256(0x100, float:3.59E-43)
            r26 = r0
            if (r26 == 0) goto L57
            goto L59
        L57:
            r13 = r25
        L59:
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r11
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.data.Product.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ Product copy$default(Product product, String $r2, String $r3, Integer $r4, String $r5, List $r6, int $i1, String $r7, String $r8, boolean $z0, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r2 = product.value;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r3 = product.name;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $r4 = product.amount;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $r5 = product.type;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $r6 = product.types;
        }
        int $i26 = i & 32;
        if ($i26 != 0) {
            $i1 = product.requiresPhone;
        }
        int $i27 = i & 64;
        if ($i27 != 0) {
            $r7 = product.billerId;
        }
        int $i28 = i & 128;
        if ($i28 != 0) {
            $r8 = product.localId;
        }
        int $i0 = i & 256;
        if ($i0 != 0) {
            $z0 = product.availability;
        }
        Product $r0 = product.copy($r2, $r3, $r4, $r5, $r6, $i1, $r7, $r8, $z0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.value;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Integer component3() {
        Integer r1 = this.amount;
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
    public final List component5() {
        List r1 = this.types;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component6() {
        int i0 = this.requiresPhone;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.billerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.localId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component9() {
        boolean z0 = this.availability;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Product copy(String str, String str2, Integer num, String str3, List list, int i, String str4, String str5, boolean z) {
        Log_OC.getArray(str, "id");
        Log_OC.getArray(str2, "name");
        Log_OC.getArray(str3, "type");
        Log_OC.getArray(list, "types");
        Log_OC.getArray(str5, "localId");
        Product $r0 = new Product(str, str2, num, str3, list, i, str4, str5, z);
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
        boolean $z0 = obj instanceof Product;
        if ($z0) {
            Product $r2 = (Product) obj;
            String $r3 = this.value;
            String $r4 = $r2.value;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.name;
                String $r42 = $r2.name;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    Integer $r5 = this.amount;
                    Integer $r6 = $r2.amount;
                    boolean $z04 = Log_OC.append($r5, $r6);
                    if ($z04) {
                        String $r33 = this.type;
                        String $r43 = $r2.type;
                        boolean $z05 = Log_OC.append($r33, $r43);
                        if ($z05) {
                            List $r7 = this.types;
                            List $r8 = $r2.types;
                            boolean $z06 = Log_OC.append($r7, $r8);
                            if ($z06) {
                                int $i0 = this.requiresPhone;
                                int $i1 = $r2.requiresPhone;
                                if ($i0 != $i1) {
                                    return false;
                                }
                                String $r34 = this.billerId;
                                String $r44 = $r2.billerId;
                                boolean $z07 = Log_OC.append($r34, $r44);
                                if ($z07) {
                                    String $r35 = this.localId;
                                    String $r45 = $r2.localId;
                                    boolean $z08 = Log_OC.append($r35, $r45);
                                    if ($z08) {
                                        boolean $z09 = this.availability;
                                        boolean $z1 = $r2.availability;
                                        return $z09 == $z1;
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
    public final Integer getAmount() {
        Integer r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getAvailability() {
        boolean z0 = this.availability;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBillerId() {
        String r1 = this.billerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getId() {
        String r1 = this.value;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLocalId() {
        String r1 = this.localId;
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
    public final int getRequiresPhone() {
        int i0 = this.requiresPhone;
        return i0;
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
    public final List getTypes() {
        List r1 = this.types;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.value;
        int $i0 = $r1.hashCode();
        String $r12 = this.name;
        int $i1 = $r12.hashCode();
        int $i12 = (($i0 * 31) + $i1) * 31;
        Integer $r2 = this.amount;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        String $r13 = this.type;
        int $i22 = $r13.hashCode();
        List $r3 = this.types;
        int $i23 = $r3.hashCode();
        int $i24 = this.requiresPhone;
        int $i13 = ((((((($i12 + $i2) * 31) + $i22) * 31) + $i23) * 31) + $i24) * 31;
        String $r14 = this.billerId;
        int $i02 = $r14 != null ? $r14.hashCode() : 0;
        String $r15 = this.localId;
        int $i14 = $r15.hashCode();
        int $i03 = ((($i13 + $i02) * 31) + $i14) * 31;
        boolean $z0 = this.availability;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i15 = i;
        return $i03 + $i15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Product(id=");
        String $r1 = this.value;
        $r2.append($r1);
        $r2.append(", name=");
        String $r12 = this.name;
        $r2.append($r12);
        $r2.append(", amount=");
        Integer $r3 = this.amount;
        $r2.append($r3);
        $r2.append(", type=");
        String $r13 = this.type;
        $r2.append($r13);
        $r2.append(", types=");
        List $r4 = this.types;
        $r2.append($r4);
        $r2.append(", requiresPhone=");
        int $i0 = this.requiresPhone;
        $r2.append($i0);
        $r2.append(", billerId=");
        String $r14 = this.billerId;
        $r2.append((Object) $r14);
        $r2.append(", localId=");
        String $r15 = this.localId;
        $r2.append($r15);
        $r2.append(", availability=");
        boolean $z0 = this.availability;
        $r2.append($z0);
        $r2.append(')');
        String $r16 = $r2.toString();
        return $r16;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int $i0;
        Log_OC.getArray(parcel, "out");
        String $r2 = this.value;
        parcel.writeString($r2);
        String $r22 = this.name;
        parcel.writeString($r22);
        Integer $r3 = this.amount;
        if ($r3 == null) {
            $i0 = 0;
        } else {
            parcel.writeInt(1);
            $i0 = $r3.intValue();
        }
        parcel.writeInt($i0);
        String $r23 = this.type;
        parcel.writeString($r23);
        List $r4 = this.types;
        parcel.writeStringList($r4);
        int $i02 = this.requiresPhone;
        parcel.writeInt($i02);
        String $r24 = this.billerId;
        parcel.writeString($r24);
        String $r25 = this.localId;
        parcel.writeString($r25);
        parcel.writeInt(this.availability ? 1 : 0);
    }
}
