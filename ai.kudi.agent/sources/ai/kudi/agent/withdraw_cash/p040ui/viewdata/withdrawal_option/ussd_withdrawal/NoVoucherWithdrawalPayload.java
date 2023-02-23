package ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UssdWithdrawalVoucherInputViewData.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "Landroid/os/Parcelable;", "customerPhoneNumber", "", "provider", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", TransactionField.AMOUNT, "", "serviceFee", "response", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response;", "(Ljava/lang/String;Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;ILjava/lang/String;Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response;)V", "getAmount", "()I", "getCustomerPhoneNumber", "()Ljava/lang/String;", "getProvider", "()Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "getResponse", "()Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response;", "getServiceFee", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload */
/* loaded from: classes.dex */
public final class NoVoucherWithdrawalPayload implements Parcelable {
    public static final Parcelable.Creator<NoVoucherWithdrawalPayload> CREATOR;
    private final int amount;
    private final String customerPhoneNumber;
    private final UssdWithdrawalProvider provider;
    private final UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response response;
    private final String serviceFee;

    /* compiled from: UssdWithdrawalVoucherInputViewData.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload$Creator */
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<NoVoucherWithdrawalPayload> {
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
        public final NoVoucherWithdrawalPayload createFromParcel(Parcel parcel) {
            UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response createFromParcel;
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            ClassLoader $r5 = NoVoucherWithdrawalPayload.class.getClassLoader();
            Parcelable $r6 = parcel.readParcelable($r5);
            UssdWithdrawalProvider $r7 = (UssdWithdrawalProvider) $r6;
            int $i0 = parcel.readInt();
            String $r8 = parcel.readString();
            int $i1 = parcel.readInt();
            if ($i1 == 0) {
                createFromParcel = null;
            } else {
                Parcelable.Creator $r10 = UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response.CREATOR;
                createFromParcel = $r10.createFromParcel(parcel);
            }
            UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r11 = createFromParcel;
            NoVoucherWithdrawalPayload $r2 = new NoVoucherWithdrawalPayload($r3, $r7, $i0, $r8, $r11);
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
        public /* bridge */ /* synthetic */ NoVoucherWithdrawalPayload createFromParcel(Parcel parcel) {
            NoVoucherWithdrawalPayload $r1 = createFromParcel(parcel);
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
        public final NoVoucherWithdrawalPayload[] newArray(int i) {
            NoVoucherWithdrawalPayload[] $r1 = new NoVoucherWithdrawalPayload[i];
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
        public /* bridge */ /* synthetic */ NoVoucherWithdrawalPayload[] newArray(int i) {
            NoVoucherWithdrawalPayload[] $r1 = newArray(i);
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

    public NoVoucherWithdrawalPayload(String str, UssdWithdrawalProvider ussdWithdrawalProvider, int i, String str2, UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response response) {
        Log_OC.getArray(str, "customerPhoneNumber");
        Log_OC.getArray(ussdWithdrawalProvider, "provider");
        Log_OC.getArray(str2, "serviceFee");
        this.customerPhoneNumber = str;
        this.provider = ussdWithdrawalProvider;
        this.amount = i;
        this.serviceFee = str2;
        this.response = response;
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
    public /* synthetic */ NoVoucherWithdrawalPayload(java.lang.String r2, ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider r3, int r4, java.lang.String r5, ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response r6, int r7, kotlin.p483e0.p485d.DBUtils$1 r8) {
        /*
            r1 = this;
            r0 = r7 & 4
            if (r0 == 0) goto L6
            r4 = 0
            goto L6
        L6:
            r0 = r7 & 8
            if (r0 == 0) goto Lc
            java.lang.String r5 = ""
        Lc:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r6 = 0
        L11:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload.<init>(java.lang.String, ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider, int, java.lang.String, ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response, int, kotlin.e0.d.DBUtils$1):void");
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
    public static /* synthetic */ NoVoucherWithdrawalPayload copy$default(NoVoucherWithdrawalPayload noVoucherWithdrawalPayload, String $r2, UssdWithdrawalProvider $r3, int $i0, String $r0, UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r4, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r2 = noVoucherWithdrawalPayload.customerPhoneNumber;
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r3 = noVoucherWithdrawalPayload.provider;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $i0 = noVoucherWithdrawalPayload.amount;
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $r0 = noVoucherWithdrawalPayload.serviceFee;
        }
        int $i1 = i & 16;
        if ($i1 != 0) {
            $r4 = noVoucherWithdrawalPayload.response;
        }
        NoVoucherWithdrawalPayload $r1 = noVoucherWithdrawalPayload.copy($r2, $r3, $i0, $r0, $r4);
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
    public final String component1() {
        String r1 = this.customerPhoneNumber;
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
    public final UssdWithdrawalProvider component2() {
        UssdWithdrawalProvider r1 = this.provider;
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
    public final int component3() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component4() {
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
    public final UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response component5() {
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response r1 = this.response;
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
    public final NoVoucherWithdrawalPayload copy(String str, UssdWithdrawalProvider ussdWithdrawalProvider, int i, String str2, UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response response) {
        Log_OC.getArray(str, "customerPhoneNumber");
        Log_OC.getArray(ussdWithdrawalProvider, "provider");
        Log_OC.getArray(str2, "serviceFee");
        NoVoucherWithdrawalPayload $r0 = new NoVoucherWithdrawalPayload(str, ussdWithdrawalProvider, i, str2, response);
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
        boolean $z0 = obj instanceof NoVoucherWithdrawalPayload;
        if ($z0) {
            NoVoucherWithdrawalPayload $r2 = (NoVoucherWithdrawalPayload) obj;
            String $r3 = this.customerPhoneNumber;
            String $r4 = $r2.customerPhoneNumber;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                UssdWithdrawalProvider $r5 = this.provider;
                UssdWithdrawalProvider $r6 = $r2.provider;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    int $i0 = this.amount;
                    int $i1 = $r2.amount;
                    if ($i0 != $i1) {
                        return false;
                    }
                    String $r32 = this.serviceFee;
                    String $r42 = $r2.serviceFee;
                    boolean $z04 = Log_OC.append($r32, $r42);
                    if ($z04) {
                        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r7 = this.response;
                        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r8 = $r2.response;
                        boolean $z05 = Log_OC.append($r7, $r8);
                        return $z05;
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
    public final int getAmount() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCustomerPhoneNumber() {
        String r1 = this.customerPhoneNumber;
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
    public final UssdWithdrawalProvider getProvider() {
        UssdWithdrawalProvider r1 = this.provider;
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
    public final UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response getResponse() {
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response r1 = this.response;
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
    public int hashCode() {
        String $r1 = this.customerPhoneNumber;
        int $i0 = $r1.hashCode();
        UssdWithdrawalProvider $r2 = this.provider;
        int $i1 = $r2.hashCode();
        int $i12 = this.amount;
        String $r12 = this.serviceFee;
        int $i13 = $r12.hashCode();
        int $i02 = (((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31;
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r3 = this.response;
        int $i14 = $r3 == null ? 0 : $r3.hashCode();
        return $i02 + $i14;
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
        $r2.append("NoVoucherWithdrawalPayload(customerPhoneNumber=");
        String $r1 = this.customerPhoneNumber;
        $r2.append($r1);
        $r2.append(", provider=");
        UssdWithdrawalProvider $r3 = this.provider;
        $r2.append($r3);
        $r2.append(", amount=");
        int $i0 = this.amount;
        $r2.append($i0);
        $r2.append(", serviceFee=");
        String $r12 = this.serviceFee;
        $r2.append($r12);
        $r2.append(", response=");
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r4 = this.response;
        $r2.append($r4);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }

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
        String $r2 = this.customerPhoneNumber;
        parcel.writeString($r2);
        UssdWithdrawalProvider $r3 = this.provider;
        parcel.writeParcelable($r3, i);
        int $i1 = this.amount;
        parcel.writeInt($i1);
        String $r22 = this.serviceFee;
        parcel.writeString($r22);
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r4 = this.response;
        if ($r4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        $r4.writeToParcel(parcel, i);
    }
}
