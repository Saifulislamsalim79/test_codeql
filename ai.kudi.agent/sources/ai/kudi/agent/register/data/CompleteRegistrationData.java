package ai.kudi.agent.register.data;

import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: CompleteRegistrationData.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J~\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\b\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u00064"}, m10421d2 = {"Lai/kudi/agent/register/data/CompleteRegistrationData;", "Landroid/os/Parcelable;", "firstName", "", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "isHq", "isOutlet", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "isOnbardingFlow", "customerType", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLai/kudi/agent/register/domain/dto/RegistrationInfo;ZLjava/lang/String;)V", "getCustomerType", "()Ljava/lang/String;", "getFirstName", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getRegistrationInfo", "()Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "getWalletBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLai/kudi/agent/register/domain/dto/RegistrationInfo;ZLjava/lang/String;)Lai/kudi/agent/register/data/CompleteRegistrationData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CompleteRegistrationData implements Parcelable {
    public static final Parcelable.Creator<CompleteRegistrationData> CREATOR;
    private final String customerType;
    private final String firstName;
    private final Boolean isC2C;
    private final boolean isHq;
    private final Boolean isKCashEnabled;
    private final Boolean isNewUser;
    private final boolean isOnbardingFlow;
    private final boolean isOutlet;
    private final RegistrationInfo registrationInfo;
    private final Double walletBalance;

    /* compiled from: CompleteRegistrationData.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<CompleteRegistrationData> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompleteRegistrationData createFromParcel(Parcel parcel) {
            Double $r5;
            Boolean $r6;
            Boolean $r7;
            Boolean $r8;
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            int $i0 = parcel.readInt();
            ai.kudi.agent.register.domain.dto.RegistrationInfo registrationInfo = null;
            if ($i0 == 0) {
                $r5 = null;
            } else {
                double $d0 = parcel.readDouble();
                $r5 = Double.valueOf($d0);
            }
            int $i02 = parcel.readInt();
            if ($i02 == 0) {
                $r6 = null;
            } else {
                int $i03 = parcel.readInt();
                $r6 = Boolean.valueOf($i03 != 0);
            }
            int $i04 = parcel.readInt();
            if ($i04 == 0) {
                $r7 = null;
            } else {
                int $i05 = parcel.readInt();
                $r7 = Boolean.valueOf($i05 != 0);
            }
            int $i06 = parcel.readInt();
            if ($i06 == 0) {
                $r8 = null;
            } else {
                int $i07 = parcel.readInt();
                $r8 = Boolean.valueOf($i07 != 0);
            }
            int $i08 = parcel.readInt();
            boolean z = $i08 != 0;
            int $i09 = parcel.readInt();
            boolean z2 = $i09 != 0;
            int $i010 = parcel.readInt();
            if ($i010 != 0) {
                Parcelable.Creator $r9 = RegistrationInfo.CREATOR;
                registrationInfo = $r9.createFromParcel(parcel);
            }
            RegistrationInfo $r10 = (RegistrationInfo) registrationInfo;
            int $i011 = parcel.readInt();
            boolean z3 = $i011 != 0;
            String $r11 = parcel.readString();
            CompleteRegistrationData $r2 = new CompleteRegistrationData($r3, $r5, $r6, $r7, $r8, z, z2, $r10, z3, $r11);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CompleteRegistrationData createFromParcel(Parcel parcel) {
            CompleteRegistrationData $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompleteRegistrationData[] newArray(int i) {
            CompleteRegistrationData[] $r1 = new CompleteRegistrationData[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CompleteRegistrationData[] newArray(int i) {
            CompleteRegistrationData[] $r1 = newArray(i);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Creator $r0 = new Creator();
        CREATOR = $r0;
    }

    public CompleteRegistrationData() {
        this(null, null, null, null, null, false, false, null, false, null, 1023, null);
    }

    public CompleteRegistrationData(String str, Double d, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2, RegistrationInfo registrationInfo, boolean z3, String str2) {
        Log_OC.getArray(str2, "customerType");
        this.firstName = str;
        this.walletBalance = d;
        this.isNewUser = bool;
        this.isKCashEnabled = bool2;
        this.isC2C = bool3;
        this.isHq = z;
        this.isOutlet = z2;
        this.registrationInfo = registrationInfo;
        this.isOnbardingFlow = z3;
        this.customerType = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CompleteRegistrationData(java.lang.String r15, java.lang.Double r16, java.lang.Boolean r17, java.lang.Boolean r18, java.lang.Boolean r19, boolean r20, boolean r21, ai.kudi.agent.register.domain.wiki.RegistrationInfo r22, boolean r23, java.lang.String r24, int r25, kotlin.p483e0.p485d.DBUtils$1 r26) {
        /*
            r14 = this;
            r11 = r25 & 1
            r12 = 0
            if (r11 == 0) goto L7
            r15 = 0
            goto L7
        L7:
            r11 = r25 & 2
            if (r11 == 0) goto Le
            r16 = 0
            goto Le
        Le:
            r11 = r25 & 4
            if (r11 == 0) goto L15
            r17 = 0
            goto L15
        L15:
            r11 = r25 & 8
            if (r11 == 0) goto L1c
            r18 = 0
            goto L1c
        L1c:
            r11 = r25 & 16
            if (r11 == 0) goto L23
            r19 = 0
            goto L23
        L23:
            r11 = r25 & 32
            r13 = 0
            if (r11 == 0) goto L2b
            r20 = 0
            goto L2b
        L2b:
            r11 = r25 & 64
            if (r11 == 0) goto L30
            goto L32
        L30:
            r13 = r21
        L32:
            r0 = r25
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L39
            goto L3b
        L39:
            r12 = r22
        L3b:
            r0 = r25
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L44
            r21 = 1
            goto L46
        L44:
            r21 = r23
        L46:
            r0 = r25
            r0 = r0 & 512(0x200, float:7.175E-43)
            r25 = r0
            if (r25 == 0) goto L51
            java.lang.String r24 = "AGENT"
            goto L51
        L51:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r13
            r8 = r12
            r9 = r21
            r10 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.data.CompleteRegistrationData.<init>(java.lang.String, java.lang.Double, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, boolean, boolean, ai.kudi.agent.register.domain.wiki.RegistrationInfo, boolean, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ CompleteRegistrationData copy$default(CompleteRegistrationData completeRegistrationData, String $r2, Double $r3, Boolean $r4, Boolean $r5, Boolean $r6, boolean $z0, boolean $z1, RegistrationInfo $r7, boolean $z2, String $r8, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = completeRegistrationData.firstName;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = completeRegistrationData.walletBalance;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r4 = completeRegistrationData.isNewUser;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r5 = completeRegistrationData.isKCashEnabled;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r6 = completeRegistrationData.isC2C;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $z0 = completeRegistrationData.isHq;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $z1 = completeRegistrationData.isOutlet;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r7 = completeRegistrationData.registrationInfo;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $z2 = completeRegistrationData.isOnbardingFlow;
        }
        int $i0 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i0 != 0) {
            $r8 = completeRegistrationData.customerType;
        }
        CompleteRegistrationData $r0 = completeRegistrationData.copy($r2, $r3, $r4, $r5, $r6, $z0, $z1, $r7, $z2, $r8);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component1() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component10() {
        String r1 = this.customerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Double component2() {
        Double r1 = this.walletBalance;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean component3() {
        Boolean r1 = this.isNewUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean component4() {
        Boolean r1 = this.isKCashEnabled;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean component5() {
        Boolean r1 = this.isC2C;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component6() {
        boolean z0 = this.isHq;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component7() {
        boolean z0 = this.isOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final RegistrationInfo component8() {
        RegistrationInfo r1 = this.registrationInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component9() {
        boolean z0 = this.isOnbardingFlow;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final CompleteRegistrationData copy(String str, Double d, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2, RegistrationInfo registrationInfo, boolean z3, String str2) {
        Log_OC.getArray(str2, "customerType");
        CompleteRegistrationData $r0 = new CompleteRegistrationData(str, d, bool, bool2, bool3, z, z2, registrationInfo, z3, str2);
        return $r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof CompleteRegistrationData;
        if ($z0) {
            CompleteRegistrationData $r2 = (CompleteRegistrationData) obj;
            String $r3 = this.firstName;
            String $r4 = $r2.firstName;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                Double $r5 = this.walletBalance;
                Double $r6 = $r2.walletBalance;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    Boolean $r7 = this.isNewUser;
                    Boolean $r8 = $r2.isNewUser;
                    boolean $z04 = Log_OC.append($r7, $r8);
                    if ($z04) {
                        Boolean $r72 = this.isKCashEnabled;
                        Boolean $r82 = $r2.isKCashEnabled;
                        boolean $z05 = Log_OC.append($r72, $r82);
                        if ($z05) {
                            Boolean $r73 = this.isC2C;
                            Boolean $r83 = $r2.isC2C;
                            boolean $z06 = Log_OC.append($r73, $r83);
                            if ($z06) {
                                boolean $z07 = this.isHq;
                                boolean $z1 = $r2.isHq;
                                if ($z07 != $z1) {
                                    return false;
                                }
                                boolean $z08 = this.isOutlet;
                                boolean $z12 = $r2.isOutlet;
                                if ($z08 != $z12) {
                                    return false;
                                }
                                RegistrationInfo $r9 = this.registrationInfo;
                                RegistrationInfo $r10 = $r2.registrationInfo;
                                boolean $z09 = Log_OC.append($r9, $r10);
                                if ($z09) {
                                    boolean $z010 = this.isOnbardingFlow;
                                    boolean $z13 = $r2.isOnbardingFlow;
                                    if ($z010 != $z13) {
                                        return false;
                                    }
                                    String $r32 = this.customerType;
                                    String $r42 = $r2.customerType;
                                    boolean $z011 = Log_OC.append($r32, $r42);
                                    return $z011;
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
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCustomerType() {
        String r1 = this.customerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getFirstName() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final RegistrationInfo getRegistrationInfo() {
        RegistrationInfo r1 = this.registrationInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Double getWalletBalance() {
        Double r1 = this.walletBalance;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.firstName;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        Double $r2 = this.walletBalance;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        Boolean $r3 = this.isNewUser;
        int $i22 = $r3 == null ? 0 : $r3.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        Boolean $r32 = this.isKCashEnabled;
        int $i23 = $r32 == null ? 0 : $r32.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        Boolean $r33 = this.isC2C;
        int $i24 = $r33 == null ? 0 : $r33.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        boolean $z0 = this.isHq;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i25 = i;
        int $i17 = ($i16 + $i25) * 31;
        boolean $z02 = this.isOutlet;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i26 = i2;
        int $i18 = ($i17 + $i26) * 31;
        RegistrationInfo $r4 = this.registrationInfo;
        int $i0 = $r4 != null ? $r4.hashCode() : 0;
        int $i02 = ($i18 + $i0) * 31;
        boolean $z03 = this.isOnbardingFlow;
        int $i19 = $z03 ? 1 : $z03 ? 1 : 0;
        int $i110 = this.customerType.hashCode();
        return (($i02 + $i19) * 31) + $i110;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean isC2C() {
        Boolean r1 = this.isC2C;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isHq() {
        boolean z0 = this.isHq;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean isKCashEnabled() {
        Boolean r1 = this.isKCashEnabled;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean isNewUser() {
        Boolean r1 = this.isNewUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isOnbardingFlow() {
        boolean z0 = this.isOnbardingFlow;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isOutlet() {
        boolean z0 = this.isOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CompleteRegistrationData(firstName=");
        String $r1 = this.firstName;
        $r2.append((Object) $r1);
        $r2.append(", walletBalance=");
        Double $r3 = this.walletBalance;
        $r2.append($r3);
        $r2.append(", isNewUser=");
        Boolean $r4 = this.isNewUser;
        $r2.append($r4);
        $r2.append(", isKCashEnabled=");
        Boolean $r42 = this.isKCashEnabled;
        $r2.append($r42);
        $r2.append(", isC2C=");
        Boolean $r43 = this.isC2C;
        $r2.append($r43);
        $r2.append(", isHq=");
        boolean $z0 = this.isHq;
        $r2.append($z0);
        $r2.append(", isOutlet=");
        boolean $z02 = this.isOutlet;
        $r2.append($z02);
        $r2.append(", registrationInfo=");
        RegistrationInfo $r5 = this.registrationInfo;
        $r2.append($r5);
        $r2.append(", isOnbardingFlow=");
        boolean $z03 = this.isOnbardingFlow;
        $r2.append($z03);
        $r2.append(", customerType=");
        String $r12 = this.customerType;
        $r2.append($r12);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Log_OC.getArray(parcel, "out");
        String $r2 = this.firstName;
        parcel.writeString($r2);
        Double $r3 = this.walletBalance;
        if ($r3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            double $d0 = $r3.doubleValue();
            parcel.writeDouble($d0);
        }
        Boolean $r4 = this.isNewUser;
        if ($r4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt($r4.booleanValue() ? 1 : 0);
        }
        Boolean $r42 = this.isKCashEnabled;
        if ($r42 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            boolean $z0 = $r42.booleanValue();
            parcel.writeInt($z0 ? 1 : 0);
        }
        Boolean $r43 = this.isC2C;
        if ($r43 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            boolean $z02 = $r43.booleanValue();
            parcel.writeInt($z02 ? 1 : 0);
        }
        boolean $z03 = this.isHq;
        parcel.writeInt($z03 ? 1 : 0);
        boolean $z04 = this.isOutlet;
        parcel.writeInt($z04 ? 1 : 0);
        RegistrationInfo $r5 = this.registrationInfo;
        if ($r5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            $r5.writeToParcel(parcel, i);
        }
        boolean $z05 = this.isOnbardingFlow;
        parcel.writeInt($z05 ? 1 : 0);
        String $r22 = this.customerType;
        parcel.writeString($r22);
    }
}
