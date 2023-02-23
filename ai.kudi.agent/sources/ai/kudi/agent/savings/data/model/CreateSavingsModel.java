package ai.kudi.agent.savings.data.model;

import ai.kudi.agent.savings.extension.StringExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CreateSavingsModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\u0006\u0010)\u001a\u00020*J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000e¨\u00061"}, m10421d2 = {"Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "Landroid/os/Parcelable;", "goal", "", "frequency", TransactionField.AMOUNT, "startDate", "duration", "lock", "", "pin", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/String;", "getDuration", "getFrequency", "getGoal", "getLock", "()Ljava/lang/Boolean;", "setLock", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "describeContents", "equals", "other", "", "hashCode", "toSavingRequest", "Lai/kudi/agent/savings/data/model/SavingsRequest;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateSavingsModel implements Parcelable {
    public static final Parcelable.Creator<CreateSavingsModel> CREATOR;
    private final String amount;
    private final String duration;
    private final String frequency;
    private final String goal;

    /* renamed from: id */
    private final Integer f1214id;
    private Boolean lock;
    private final String startDate;

    /* compiled from: CreateSavingsModel.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<CreateSavingsModel> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSavingsModel createFromParcel(Parcel parcel) {
            Boolean $r8;
            Integer $r9;
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            String $r4 = parcel.readString();
            String $r5 = parcel.readString();
            String $r6 = parcel.readString();
            String $r7 = parcel.readString();
            int $i0 = parcel.readInt();
            if ($i0 == 0) {
                $r8 = null;
            } else {
                int $i02 = parcel.readInt();
                $r8 = Boolean.valueOf($i02 != 0);
            }
            int $i03 = parcel.readInt();
            if ($i03 == 0) {
                $r9 = null;
            } else {
                int $i04 = parcel.readInt();
                $r9 = Integer.valueOf($i04);
            }
            CreateSavingsModel $r2 = new CreateSavingsModel($r3, $r4, $r5, $r6, $r7, $r8, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CreateSavingsModel createFromParcel(Parcel parcel) {
            CreateSavingsModel $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSavingsModel[] newArray(int i) {
            CreateSavingsModel[] $r1 = new CreateSavingsModel[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CreateSavingsModel[] newArray(int i) {
            CreateSavingsModel[] $r1 = newArray(i);
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

    public CreateSavingsModel(String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num) {
        this.goal = str;
        this.frequency = str2;
        this.amount = str3;
        this.startDate = str4;
        this.duration = str5;
        this.lock = bool;
        this.f1214id = num;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CreateSavingsModel(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Boolean r6, java.lang.Integer r7, int r8, kotlin.p483e0.p485d.DBUtils$1 r9) {
        /*
            r0 = this;
            r8 = r8 & 64
            if (r8 == 0) goto L6
            r7 = 0
            goto L6
        L6:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.data.model.CreateSavingsModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ CreateSavingsModel copy$default(CreateSavingsModel createSavingsModel, String $r5, String $r6, String $r0, String $r1, String $r2, Boolean $r3, Integer $r7, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r5 = createSavingsModel.goal;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r6 = createSavingsModel.frequency;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r0 = createSavingsModel.amount;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r1 = createSavingsModel.startDate;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r2 = createSavingsModel.duration;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r3 = createSavingsModel.lock;
        }
        int $i0 = i & 64;
        if ($i0 != 0) {
            $r7 = createSavingsModel.f1214id;
        }
        CreateSavingsModel $r4 = createSavingsModel.copy($r5, $r6, $r0, $r1, $r2, $r3, $r7);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.goal;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.frequency;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.startDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.duration;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component6() {
        Boolean r1 = this.lock;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Integer component7() {
        Integer r1 = this.f1214id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CreateSavingsModel copy(String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num) {
        CreateSavingsModel $r0 = new CreateSavingsModel(str, str2, str3, str4, str5, bool, num);
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
        boolean $z0 = obj instanceof CreateSavingsModel;
        if ($z0) {
            CreateSavingsModel $r2 = (CreateSavingsModel) obj;
            String $r3 = this.goal;
            String $r4 = $r2.goal;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.frequency;
                String $r42 = $r2.frequency;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.amount;
                    String $r43 = $r2.amount;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        String $r34 = this.startDate;
                        String $r44 = $r2.startDate;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            String $r35 = this.duration;
                            String $r45 = $r2.duration;
                            boolean $z06 = Log_OC.append($r35, $r45);
                            if ($z06) {
                                Boolean $r5 = this.lock;
                                Boolean $r6 = $r2.lock;
                                boolean $z07 = Log_OC.append($r5, $r6);
                                if ($z07) {
                                    Integer $r7 = this.f1214id;
                                    Integer $r8 = $r2.f1214id;
                                    boolean $z08 = Log_OC.append($r7, $r8);
                                    return $z08;
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
    public final String getAmount() {
        String r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDuration() {
        String r1 = this.duration;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getFrequency() {
        String r1 = this.frequency;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getGoal() {
        String r1 = this.goal;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getLock() {
        Boolean r1 = this.lock;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Integer getPin() {
        Integer r1 = this.f1214id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStartDate() {
        String r1 = this.startDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.goal;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        String $r12 = this.frequency;
        int $i2 = $r12 == null ? 0 : $r12.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        String $r13 = this.amount;
        int $i22 = $r13 == null ? 0 : $r13.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        String $r14 = this.startDate;
        int $i23 = $r14 == null ? 0 : $r14.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        String $r15 = this.duration;
        int $i24 = $r15 == null ? 0 : $r15.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        Boolean $r2 = this.lock;
        int $i25 = $r2 == null ? 0 : $r2.hashCode();
        int $i17 = ($i16 + $i25) * 31;
        Integer $r3 = this.f1214id;
        int $i0 = $r3 != null ? $r3.hashCode() : 0;
        return $i17 + $i0;
    }

    public final void setLock(Boolean bool) {
        this.lock = bool;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsRequest toSavingRequest() {
        Integer $r6;
        Integer $r8;
        String $r1 = this.goal;
        String $r2 = this.frequency;
        String $r5 = this.amount;
        if ($r5 == null) {
            $r6 = null;
        } else {
            int $i0 = Integer.parseInt($r5);
            $r6 = Integer.valueOf($i0);
        }
        String $r52 = this.startDate;
        String $r53 = $r52 == null ? null : StringExtKt.reformatDate($r52);
        String $r7 = this.duration;
        if ($r7 == null) {
            $r8 = null;
        } else {
            int $i02 = StringExtKt.formatDuration($r7);
            $r8 = Integer.valueOf($i02);
        }
        Boolean $r9 = this.lock;
        Integer $r4 = this.f1214id;
        SavingsRequest $r3 = new SavingsRequest($r1, $r2, $r6, $r53, $r8, $r9, $r4);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CreateSavingsModel(goal=");
        String $r1 = this.goal;
        $r2.append((Object) $r1);
        $r2.append(", frequency=");
        String $r12 = this.frequency;
        $r2.append((Object) $r12);
        $r2.append(", amount=");
        String $r13 = this.amount;
        $r2.append((Object) $r13);
        $r2.append(", startDate=");
        String $r14 = this.startDate;
        $r2.append((Object) $r14);
        $r2.append(", duration=");
        String $r15 = this.duration;
        $r2.append((Object) $r15);
        $r2.append(", lock=");
        Boolean $r3 = this.lock;
        $r2.append($r3);
        $r2.append(", pin=");
        Integer $r4 = this.f1214id;
        $r2.append($r4);
        $r2.append(')');
        String $r16 = $r2.toString();
        return $r16;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Log_OC.getArray(parcel, "out");
        String $r2 = this.goal;
        parcel.writeString($r2);
        String $r22 = this.frequency;
        parcel.writeString($r22);
        String $r23 = this.amount;
        parcel.writeString($r23);
        String $r24 = this.startDate;
        parcel.writeString($r24);
        String $r25 = this.duration;
        parcel.writeString($r25);
        Boolean $r3 = this.lock;
        if ($r3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt($r3.booleanValue() ? 1 : 0);
        }
        Integer $r4 = this.f1214id;
        if ($r4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        int $i0 = $r4.intValue();
        parcel.writeInt($i0);
    }
}
