package ai.kudi.agent.transfer.domain.usecases;

import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.u.c;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TransferToBankRequest.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\t\u00108\u001a\u00020\u0006HÖ\u0001J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b(\u0010$¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "Landroid/os/Parcelable;", BanksWithMethods.ACCOUNT_NUMBER, "", "bankCode", TransactionField.AMOUNT, "", "sendSMSToRecipient", "", BanksWithMethods.ACCOUNT_NAME, "phoneNumber", "serviceFeeIncluded", "mposPaymentMethod", "Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;", "sendersPhone", "reason", "serviceFee", "meta", "Lai/kudi/agent/bills/domain/dto/Meta;", BanksWithMethods.BANK_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/bills/domain/dto/Meta;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBankCode", "getBankName", "getMeta", "()Lai/kudi/agent/bills/domain/dto/Meta;", "getMposPaymentMethod", "()Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;", "getPhoneNumber", "getReason", "getSendSMSToRecipient", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSendersPhone", "getServiceFee", "getServiceFeeIncluded", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/bills/domain/dto/Meta;Ljava/lang/String;)Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToBankPayload implements Parcelable {
    public static final Parcelable.Creator<TransferToBankPayload> CREATOR;
    private final String accountName;
    private final String accountNumber;
    private final Integer amount;
    private final String bankCode;
    private final String bankName;
    private final Meta meta;
    private final MPOSPaymentMethod mposPaymentMethod;
    private final String phoneNumber;
    private final String reason;
    @c("sendSms")
    private final Boolean sendSMSToRecipient;
    private final String sendersPhone;
    private final String serviceFee;
    private final Boolean serviceFeeIncluded;

    /* compiled from: TransferToBankRequest.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<TransferToBankPayload> {
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
        public final TransferToBankPayload createFromParcel(Parcel parcel) {
            Integer $r5;
            Boolean $r6;
            Boolean $r9;
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            String $r4 = parcel.readString();
            int $i0 = parcel.readInt();
            if ($i0 == 0) {
                $r5 = null;
            } else {
                int $i02 = parcel.readInt();
                $r5 = Integer.valueOf($i02);
            }
            int $i03 = parcel.readInt();
            if ($i03 == 0) {
                $r6 = null;
            } else {
                int $i04 = parcel.readInt();
                $r6 = Boolean.valueOf($i04 != 0);
            }
            String $r7 = parcel.readString();
            String $r8 = parcel.readString();
            int $i05 = parcel.readInt();
            if ($i05 == 0) {
                $r9 = null;
            } else {
                int $i06 = parcel.readInt();
                $r9 = Boolean.valueOf($i06 != 0);
            }
            ClassLoader $r11 = TransferToBankPayload.class.getClassLoader();
            Parcelable $r12 = parcel.readParcelable($r11);
            MPOSPaymentMethod $r13 = (MPOSPaymentMethod) $r12;
            String $r14 = parcel.readString();
            String $r15 = parcel.readString();
            String $r16 = parcel.readString();
            ClassLoader $r112 = TransferToBankPayload.class.getClassLoader();
            Parcelable $r122 = parcel.readParcelable($r112);
            Meta $r17 = (Meta) $r122;
            String $r18 = parcel.readString();
            TransferToBankPayload $r2 = new TransferToBankPayload($r3, $r4, $r5, $r6, $r7, $r8, $r9, $r13, $r14, $r15, $r16, $r17, $r18);
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
        public /* bridge */ /* synthetic */ TransferToBankPayload createFromParcel(Parcel parcel) {
            TransferToBankPayload $r1 = createFromParcel(parcel);
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
        public final TransferToBankPayload[] newArray(int i) {
            TransferToBankPayload[] $r1 = new TransferToBankPayload[i];
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
        public /* bridge */ /* synthetic */ TransferToBankPayload[] newArray(int i) {
            TransferToBankPayload[] $r1 = newArray(i);
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

    public TransferToBankPayload() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public TransferToBankPayload(String str, String str2, Integer num, Boolean bool, String str3, String str4, Boolean bool2, MPOSPaymentMethod mPOSPaymentMethod, String str5, String str6, String str7, Meta meta, String str8) {
        this.accountNumber = str;
        this.bankCode = str2;
        this.amount = num;
        this.sendSMSToRecipient = bool;
        this.accountName = str3;
        this.phoneNumber = str4;
        this.serviceFeeIncluded = bool2;
        this.mposPaymentMethod = mPOSPaymentMethod;
        this.sendersPhone = str5;
        this.reason = str6;
        this.serviceFee = str7;
        this.meta = meta;
        this.bankName = str8;
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
    public /* synthetic */ TransferToBankPayload(java.lang.String r18, java.lang.String r19, java.lang.Integer r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, ai.kudi.agent.bills.domain.wiki.Meta r29, java.lang.String r30, int r31, kotlin.p483e0.p485d.DBUtils$1 r32) {
        /*
            r17 = this;
            r14 = r31 & 1
            r15 = 0
            if (r14 == 0) goto L8
            r18 = 0
            goto L8
        L8:
            r14 = r31 & 2
            if (r14 == 0) goto Lf
            r19 = 0
            goto Lf
        Lf:
            r14 = r31 & 4
            if (r14 == 0) goto L1c
            r16 = 0
            r0 = r16
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            goto L1c
        L1c:
            r14 = r31 & 8
            if (r14 == 0) goto L23
            java.lang.Boolean r21 = java.lang.Boolean.FALSE
            goto L23
        L23:
            r14 = r31 & 16
            if (r14 == 0) goto L2a
            r22 = 0
            goto L2a
        L2a:
            r14 = r31 & 32
            if (r14 == 0) goto L31
            r23 = 0
            goto L31
        L31:
            r14 = r31 & 64
            if (r14 == 0) goto L38
            r24 = 0
            goto L38
        L38:
            r0 = r31
            r14 = r0 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L41
            r25 = 0
            goto L41
        L41:
            r0 = r31
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L4a
            r26 = 0
            goto L4a
        L4a:
            r0 = r31
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L53
            r27 = 0
            goto L53
        L53:
            r0 = r31
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L5c
            r28 = 0
            goto L5c
        L5c:
            r0 = r31
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L65
            r29 = 0
            goto L65
        L65:
            r0 = r31
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            r31 = r0
            if (r31 == 0) goto L6e
            goto L70
        L6e:
            r15 = r30
        L70:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod, java.lang.String, java.lang.String, java.lang.String, ai.kudi.agent.bills.domain.wiki.Meta, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
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
    public static /* synthetic */ TransferToBankPayload copy$default(TransferToBankPayload transferToBankPayload, String $r2, String $r3, Integer $r4, Boolean $r5, String $r6, String $r7, Boolean $r8, MPOSPaymentMethod $r9, String $r10, String $r11, String $r12, Meta $r13, String $r14, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = transferToBankPayload.accountNumber;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = transferToBankPayload.bankCode;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r4 = transferToBankPayload.amount;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r5 = transferToBankPayload.sendSMSToRecipient;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r6 = transferToBankPayload.accountName;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r7 = transferToBankPayload.phoneNumber;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r8 = transferToBankPayload.serviceFeeIncluded;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r9 = transferToBankPayload.mposPaymentMethod;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $r10 = transferToBankPayload.sendersPhone;
        }
        int $i110 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i110 != 0) {
            $r11 = transferToBankPayload.reason;
        }
        int $i111 = i & 1024;
        if ($i111 != 0) {
            $r12 = transferToBankPayload.serviceFee;
        }
        int $i112 = i & IjkMediaMeta.FF_PROFILE_H264_INTRA;
        if ($i112 != 0) {
            $r13 = transferToBankPayload.meta;
        }
        int $i0 = i & 4096;
        if ($i0 != 0) {
            $r14 = transferToBankPayload.bankName;
        }
        TransferToBankPayload $r0 = transferToBankPayload.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r13, $r14);
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
        String r1 = this.accountNumber;
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
        String r1 = this.reason;
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
    public final String component11() {
        String r1 = this.serviceFee;
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
    public final Meta component12() {
        Meta r1 = this.meta;
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
    public final String component13() {
        String r1 = this.bankName;
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
    public final String component2() {
        String r1 = this.bankCode;
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
    public final Integer component3() {
        Integer r1 = this.amount;
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
        Boolean r1 = this.sendSMSToRecipient;
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
    public final String component5() {
        String r1 = this.accountName;
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
    public final String component6() {
        String r1 = this.phoneNumber;
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
    public final Boolean component7() {
        Boolean r1 = this.serviceFeeIncluded;
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
    public final MPOSPaymentMethod component8() {
        MPOSPaymentMethod r1 = this.mposPaymentMethod;
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
    public final String component9() {
        String r1 = this.sendersPhone;
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
    public final TransferToBankPayload copy(String str, String str2, Integer num, Boolean bool, String str3, String str4, Boolean bool2, MPOSPaymentMethod mPOSPaymentMethod, String str5, String str6, String str7, Meta meta, String str8) {
        TransferToBankPayload $r0 = new TransferToBankPayload(str, str2, num, bool, str3, str4, bool2, mPOSPaymentMethod, str5, str6, str7, meta, str8);
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
        boolean $z0 = obj instanceof TransferToBankPayload;
        if ($z0) {
            TransferToBankPayload $r2 = (TransferToBankPayload) obj;
            String $r3 = this.accountNumber;
            String $r4 = $r2.accountNumber;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.bankCode;
                String $r42 = $r2.bankCode;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    Integer $r5 = this.amount;
                    Integer $r6 = $r2.amount;
                    boolean $z04 = Log_OC.append($r5, $r6);
                    if ($z04) {
                        Boolean $r7 = this.sendSMSToRecipient;
                        Boolean $r8 = $r2.sendSMSToRecipient;
                        boolean $z05 = Log_OC.append($r7, $r8);
                        if ($z05) {
                            String $r33 = this.accountName;
                            String $r43 = $r2.accountName;
                            boolean $z06 = Log_OC.append($r33, $r43);
                            if ($z06) {
                                String $r34 = this.phoneNumber;
                                String $r44 = $r2.phoneNumber;
                                boolean $z07 = Log_OC.append($r34, $r44);
                                if ($z07) {
                                    Boolean $r72 = this.serviceFeeIncluded;
                                    Boolean $r82 = $r2.serviceFeeIncluded;
                                    boolean $z08 = Log_OC.append($r72, $r82);
                                    if ($z08) {
                                        MPOSPaymentMethod $r9 = this.mposPaymentMethod;
                                        MPOSPaymentMethod $r10 = $r2.mposPaymentMethod;
                                        boolean $z09 = Log_OC.append($r9, $r10);
                                        if ($z09) {
                                            String $r35 = this.sendersPhone;
                                            String $r45 = $r2.sendersPhone;
                                            boolean $z010 = Log_OC.append($r35, $r45);
                                            if ($z010) {
                                                String $r36 = this.reason;
                                                String $r46 = $r2.reason;
                                                boolean $z011 = Log_OC.append($r36, $r46);
                                                if ($z011) {
                                                    String $r37 = this.serviceFee;
                                                    String $r47 = $r2.serviceFee;
                                                    boolean $z012 = Log_OC.append($r37, $r47);
                                                    if ($z012) {
                                                        Meta $r11 = this.meta;
                                                        Meta $r12 = $r2.meta;
                                                        boolean $z013 = Log_OC.append($r11, $r12);
                                                        if ($z013) {
                                                            String $r38 = this.bankName;
                                                            String $r48 = $r2.bankName;
                                                            boolean $z014 = Log_OC.append($r38, $r48);
                                                            return $z014;
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
    public final String getAccountName() {
        String r1 = this.accountName;
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
    public final String getAccountNumber() {
        String r1 = this.accountNumber;
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
    public final Integer getAmount() {
        Integer r1 = this.amount;
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
    public final String getBankCode() {
        String r1 = this.bankCode;
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
    public final String getBankName() {
        String r1 = this.bankName;
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
    public final Meta getMeta() {
        Meta r1 = this.meta;
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
    public final MPOSPaymentMethod getMposPaymentMethod() {
        MPOSPaymentMethod r1 = this.mposPaymentMethod;
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
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
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
    public final String getReason() {
        String r1 = this.reason;
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
    public final Boolean getSendSMSToRecipient() {
        Boolean r1 = this.sendSMSToRecipient;
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
    public final String getSendersPhone() {
        String r1 = this.sendersPhone;
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
    public final String getServiceFee() {
        String r1 = this.serviceFee;
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
    public final Boolean getServiceFeeIncluded() {
        Boolean r1 = this.serviceFeeIncluded;
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
    public int hashCode() {
        String $r1 = this.accountNumber;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        String $r12 = this.bankCode;
        int $i2 = $r12 == null ? 0 : $r12.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        Integer $r2 = this.amount;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        Boolean $r3 = this.sendSMSToRecipient;
        int $i23 = $r3 == null ? 0 : $r3.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        String $r13 = this.accountName;
        int $i24 = $r13 == null ? 0 : $r13.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        String $r14 = this.phoneNumber;
        int $i25 = $r14 == null ? 0 : $r14.hashCode();
        int $i17 = ($i16 + $i25) * 31;
        Boolean $r32 = this.serviceFeeIncluded;
        int $i26 = $r32 == null ? 0 : $r32.hashCode();
        int $i18 = ($i17 + $i26) * 31;
        MPOSPaymentMethod $r4 = this.mposPaymentMethod;
        int $i27 = $r4 == null ? 0 : $r4.hashCode();
        int $i19 = ($i18 + $i27) * 31;
        String $r15 = this.sendersPhone;
        int $i28 = $r15 == null ? 0 : $r15.hashCode();
        int $i110 = ($i19 + $i28) * 31;
        String $r16 = this.reason;
        int $i29 = $r16 == null ? 0 : $r16.hashCode();
        int $i111 = ($i110 + $i29) * 31;
        String $r17 = this.serviceFee;
        int $i210 = $r17 == null ? 0 : $r17.hashCode();
        int $i112 = ($i111 + $i210) * 31;
        Meta $r5 = this.meta;
        int $i211 = $r5 == null ? 0 : $r5.hashCode();
        int $i113 = ($i112 + $i211) * 31;
        String $r18 = this.bankName;
        int $i0 = $r18 != null ? $r18.hashCode() : 0;
        return $i113 + $i0;
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
        $r2.append("TransferToBankPayload(accountNumber=");
        String $r1 = this.accountNumber;
        $r2.append((Object) $r1);
        $r2.append(", bankCode=");
        String $r12 = this.bankCode;
        $r2.append((Object) $r12);
        $r2.append(", amount=");
        Integer $r3 = this.amount;
        $r2.append($r3);
        $r2.append(", sendSMSToRecipient=");
        Boolean $r4 = this.sendSMSToRecipient;
        $r2.append($r4);
        $r2.append(", accountName=");
        String $r13 = this.accountName;
        $r2.append((Object) $r13);
        $r2.append(", phoneNumber=");
        String $r14 = this.phoneNumber;
        $r2.append((Object) $r14);
        $r2.append(", serviceFeeIncluded=");
        Boolean $r42 = this.serviceFeeIncluded;
        $r2.append($r42);
        $r2.append(", mposPaymentMethod=");
        MPOSPaymentMethod $r5 = this.mposPaymentMethod;
        $r2.append($r5);
        $r2.append(", sendersPhone=");
        String $r15 = this.sendersPhone;
        $r2.append((Object) $r15);
        $r2.append(", reason=");
        String $r16 = this.reason;
        $r2.append((Object) $r16);
        $r2.append(", serviceFee=");
        String $r17 = this.serviceFee;
        $r2.append((Object) $r17);
        $r2.append(", meta=");
        Meta $r6 = this.meta;
        $r2.append($r6);
        $r2.append(", bankName=");
        String $r18 = this.bankName;
        $r2.append((Object) $r18);
        $r2.append(')');
        String $r19 = $r2.toString();
        return $r19;
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
        String $r2 = this.accountNumber;
        parcel.writeString($r2);
        String $r22 = this.bankCode;
        parcel.writeString($r22);
        Integer $r3 = this.amount;
        if ($r3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int $i1 = $r3.intValue();
            parcel.writeInt($i1);
        }
        Boolean $r4 = this.sendSMSToRecipient;
        if ($r4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt($r4.booleanValue() ? 1 : 0);
        }
        String $r23 = this.accountName;
        parcel.writeString($r23);
        String $r24 = this.phoneNumber;
        parcel.writeString($r24);
        Boolean $r42 = this.serviceFeeIncluded;
        if ($r42 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            boolean $z0 = $r42.booleanValue();
            parcel.writeInt($z0 ? 1 : 0);
        }
        MPOSPaymentMethod $r5 = this.mposPaymentMethod;
        parcel.writeParcelable($r5, i);
        String $r25 = this.sendersPhone;
        parcel.writeString($r25);
        String $r26 = this.reason;
        parcel.writeString($r26);
        String $r27 = this.serviceFee;
        parcel.writeString($r27);
        Meta $r6 = this.meta;
        parcel.writeParcelable($r6, i);
        String $r28 = this.bankName;
        parcel.writeString($r28);
    }
}
