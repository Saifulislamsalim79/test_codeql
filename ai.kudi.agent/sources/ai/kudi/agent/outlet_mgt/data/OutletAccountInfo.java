package ai.kudi.agent.outlet_mgt.data;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: OutletDetails.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003Já\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001J\u0013\u0010E\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020DHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0019\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020DHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006O"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/data/OutletAccountInfo;", "Landroid/os/Parcelable;", "terminalId", "", "serialNumber", "acquiringBank", "activationCards", "", "agentId", "damaged", "", "dateAssigned", "dateCreated", "dateReceived", "dateUpdated", "hasStampDuty", "lastTransactionDate", "lastTransactionRef", "merchantName", "ownership", "ptsp", TransactionField.STATUS, "tags", "terminalType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAcquiringBank", "()Ljava/lang/String;", "getActivationCards", "()Ljava/util/List;", "getAgentId", "getDamaged", "()Z", "getDateAssigned", "getDateCreated", "getDateReceived", "getDateUpdated", "getHasStampDuty", "getLastTransactionDate", "getLastTransactionRef", "getMerchantName", "getOwnership", "getPtsp", "getSerialNumber", "getStatus", "getTags", "getTerminalId", "getTerminalType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletAccountInfo implements Parcelable {
    public static final Parcelable.Creator<OutletAccountInfo> CREATOR;
    private final String acquiringBank;
    private final List<String> activationCards;
    private final String agentId;
    private final boolean damaged;
    private final String dateAssigned;
    private final String dateCreated;
    private final String dateReceived;
    private final String dateUpdated;
    private final boolean hasStampDuty;
    private final String lastTransactionDate;
    private final String lastTransactionRef;
    private final String merchantName;
    private final String ownership;
    private final String ptsp;
    private final String serialNumber;
    private final String status;
    private final List<String> tags;
    private final String terminalId;
    private final String terminalType;

    /* compiled from: OutletDetails.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OutletAccountInfo> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OutletAccountInfo createFromParcel(Parcel parcel) {
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            String $r4 = parcel.readString();
            String $r5 = parcel.readString();
            ArrayList $r6 = parcel.createStringArrayList();
            String $r7 = parcel.readString();
            int $i0 = parcel.readInt();
            boolean z = $i0 != 0;
            String $r8 = parcel.readString();
            String $r9 = parcel.readString();
            String $r10 = parcel.readString();
            String $r11 = parcel.readString();
            int $i02 = parcel.readInt();
            boolean z2 = $i02 != 0;
            String $r12 = parcel.readString();
            String $r13 = parcel.readString();
            String $r14 = parcel.readString();
            String $r15 = parcel.readString();
            String $r16 = parcel.readString();
            String $r17 = parcel.readString();
            ArrayList $r18 = parcel.createStringArrayList();
            String $r19 = parcel.readString();
            OutletAccountInfo $r2 = new OutletAccountInfo($r3, $r4, $r5, $r6, $r7, z, $r8, $r9, $r10, $r11, z2, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OutletAccountInfo createFromParcel(Parcel parcel) {
            OutletAccountInfo $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OutletAccountInfo[] newArray(int i) {
            OutletAccountInfo[] $r1 = new OutletAccountInfo[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OutletAccountInfo[] newArray(int i) {
            OutletAccountInfo[] $r1 = newArray(i);
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

    public OutletAccountInfo(String str, String str2, String str3, List list, String str4, boolean z, String str5, String str6, String str7, String str8, boolean z2, String str9, String str10, String str11, String str12, String str13, String str14, List list2, String str15) {
        Log_OC.getArray(str, "terminalId");
        Log_OC.getArray(str2, "serialNumber");
        Log_OC.getArray(str3, "acquiringBank");
        Log_OC.getArray(list, "activationCards");
        Log_OC.getArray(str4, "agentId");
        Log_OC.getArray(str12, "ownership");
        Log_OC.getArray(str13, "ptsp");
        Log_OC.getArray(str14, TransactionField.STATUS);
        Log_OC.getArray(list2, "tags");
        Log_OC.getArray(str15, "terminalType");
        this.terminalId = str;
        this.serialNumber = str2;
        this.acquiringBank = str3;
        this.activationCards = list;
        this.agentId = str4;
        this.damaged = z;
        this.dateAssigned = str5;
        this.dateCreated = str6;
        this.dateReceived = str7;
        this.dateUpdated = str8;
        this.hasStampDuty = z2;
        this.lastTransactionDate = str9;
        this.lastTransactionRef = str10;
        this.merchantName = str11;
        this.ownership = str12;
        this.ptsp = str13;
        this.status = str14;
        this.tags = list2;
        this.terminalType = str15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ OutletAccountInfo(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.util.List r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, java.lang.String r22, int r23, kotlin.p483e0.p485d.DBUtils$1 r24) {
        /*
            r3 = this;
            r1 = r23 & 64
            if (r1 == 0) goto L6
            r10 = 0
            goto L6
        L6:
            r0 = r23
            r1 = r0 & 128(0x80, float:1.794E-43)
            r23 = r0
            if (r1 == 0) goto L10
            r11 = 0
            goto L10
        L10:
            r0 = r23
            r1 = r0 & 256(0x100, float:3.59E-43)
            r23 = r0
            if (r1 == 0) goto L1a
            r12 = 0
            goto L1a
        L1a:
            r0 = r23
            r1 = r0 & 512(0x200, float:7.175E-43)
            r23 = r0
            if (r1 == 0) goto L24
            r13 = 0
            goto L24
        L24:
            r0 = r23
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r23 = r0
            if (r1 == 0) goto L2e
            r14 = 0
            goto L2e
        L2e:
            r0 = r23
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r23 = r0
            if (r1 == 0) goto L38
            r15 = 0
            goto L38
        L38:
            r0 = r23
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r23 = r0
            if (r1 == 0) goto L43
            r16 = 0
            goto L43
        L43:
            r0 = r23
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r23 = r0
            if (r1 == 0) goto L4e
            r17 = 0
            goto L4e
        L4e:
            r2 = 131072(0x20000, float:1.83671E-40)
            r0 = r23
            r0 = r0 & r2
            r23 = r0
            if (r23 == 0) goto L5d
            java.util.List r21 = kotlin.p557z.C13722p.m3941e()
            goto L5d
        L5d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.data.OutletAccountInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ OutletAccountInfo copy$default(OutletAccountInfo outletAccountInfo, String $r2, String $r3, String $r4, List $r5, String $r6, boolean $z0, String $r7, String $r8, String $r9, String $r10, boolean $z1, String $r11, String $r12, String $r13, String $r14, String $r15, String $r16, List $r17, String $r18, int $i1, Object obj) {
        if (($i1 & 1) != 0) {
            $r2 = outletAccountInfo.terminalId;
        }
        if (($i1 & 2) != 0) {
            $r3 = outletAccountInfo.serialNumber;
        }
        if (($i1 & 4) != 0) {
            $r4 = outletAccountInfo.acquiringBank;
        }
        if (($i1 & 8) != 0) {
            $r5 = outletAccountInfo.activationCards;
        }
        if (($i1 & 16) != 0) {
            $r6 = outletAccountInfo.agentId;
        }
        if (($i1 & 32) != 0) {
            $z0 = outletAccountInfo.damaged;
        }
        if (($i1 & 64) != 0) {
            $r7 = outletAccountInfo.dateAssigned;
        }
        if (($i1 & 128) != 0) {
            $r8 = outletAccountInfo.dateCreated;
        }
        if (($i1 & 256) != 0) {
            $r9 = outletAccountInfo.dateReceived;
        }
        if (($i1 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $r10 = outletAccountInfo.dateUpdated;
        }
        if (($i1 & 1024) != 0) {
            $z1 = outletAccountInfo.hasStampDuty;
        }
        if (($i1 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $r11 = outletAccountInfo.lastTransactionDate;
        }
        if (($i1 & 4096) != 0) {
            String $r122 = outletAccountInfo.lastTransactionRef;
            $r12 = $r122;
        }
        if (($i1 & 8192) != 0) {
            String $r132 = outletAccountInfo.merchantName;
            $r13 = $r132;
        }
        if (($i1 & 16384) != 0) {
            String $r142 = outletAccountInfo.ownership;
            $r14 = $r142;
        }
        if (($i1 & 32768) != 0) {
            String $r152 = outletAccountInfo.ptsp;
            $r15 = $r152;
        }
        if (($i1 & 65536) != 0) {
            String $r162 = outletAccountInfo.status;
            $r16 = $r162;
        }
        if (($i1 & 131072) != 0) {
            $r17 = outletAccountInfo.tags;
        }
        int $i0 = $i1 & 262144;
        if ($i0 != 0) {
            String $r182 = outletAccountInfo.terminalType;
            $r18 = $r182;
        }
        OutletAccountInfo $r0 = outletAccountInfo.copy($r2, $r3, $r4, $r5, $r6, $z0, $r7, $r8, $r9, $r10, $z1, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.dateUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component11() {
        boolean z0 = this.hasStampDuty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component12() {
        String r1 = this.lastTransactionDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component13() {
        String r1 = this.lastTransactionRef;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component14() {
        String r1 = this.merchantName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component15() {
        String r1 = this.ownership;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component16() {
        String r1 = this.ptsp;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component17() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component18() {
        List r1 = this.tags;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component19() {
        String r1 = this.terminalType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.serialNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.acquiringBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component4() {
        List r1 = this.activationCards;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.agentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component6() {
        boolean z0 = this.damaged;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.dateAssigned;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.dateCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.dateReceived;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletAccountInfo copy(String str, String str2, String str3, List list, String str4, boolean z, String str5, String str6, String str7, String str8, boolean z2, String str9, String str10, String str11, String str12, String str13, String str14, List list2, String str15) {
        Log_OC.getArray(str, "terminalId");
        Log_OC.getArray(str2, "serialNumber");
        Log_OC.getArray(str3, "acquiringBank");
        Log_OC.getArray(list, "activationCards");
        Log_OC.getArray(str4, "agentId");
        Log_OC.getArray(str12, "ownership");
        Log_OC.getArray(str13, "ptsp");
        Log_OC.getArray(str14, TransactionField.STATUS);
        Log_OC.getArray(list2, "tags");
        Log_OC.getArray(str15, "terminalType");
        OutletAccountInfo $r0 = new OutletAccountInfo(str, str2, str3, list, str4, z, str5, str6, str7, str8, z2, str9, str10, str11, str12, str13, str14, list2, str15);
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
        boolean $z0 = obj instanceof OutletAccountInfo;
        if ($z0) {
            OutletAccountInfo $r2 = (OutletAccountInfo) obj;
            String $r3 = this.terminalId;
            String $r4 = $r2.terminalId;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.serialNumber;
                String $r42 = $r2.serialNumber;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.acquiringBank;
                    String $r43 = $r2.acquiringBank;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        List $r5 = this.activationCards;
                        List $r6 = $r2.activationCards;
                        boolean $z05 = Log_OC.append($r5, $r6);
                        if ($z05) {
                            String $r34 = this.agentId;
                            String $r44 = $r2.agentId;
                            boolean $z06 = Log_OC.append($r34, $r44);
                            if ($z06) {
                                boolean $z07 = this.damaged;
                                boolean $z1 = $r2.damaged;
                                if ($z07 != $z1) {
                                    return false;
                                }
                                String $r35 = this.dateAssigned;
                                String $r45 = $r2.dateAssigned;
                                boolean $z08 = Log_OC.append($r35, $r45);
                                if ($z08) {
                                    String $r36 = this.dateCreated;
                                    String $r46 = $r2.dateCreated;
                                    boolean $z09 = Log_OC.append($r36, $r46);
                                    if ($z09) {
                                        String $r37 = this.dateReceived;
                                        String $r47 = $r2.dateReceived;
                                        boolean $z010 = Log_OC.append($r37, $r47);
                                        if ($z010) {
                                            String $r38 = this.dateUpdated;
                                            String $r48 = $r2.dateUpdated;
                                            boolean $z011 = Log_OC.append($r38, $r48);
                                            if ($z011) {
                                                boolean $z012 = this.hasStampDuty;
                                                boolean $z12 = $r2.hasStampDuty;
                                                if ($z012 != $z12) {
                                                    return false;
                                                }
                                                String $r39 = this.lastTransactionDate;
                                                String $r49 = $r2.lastTransactionDate;
                                                boolean $z013 = Log_OC.append($r39, $r49);
                                                if ($z013) {
                                                    String $r310 = this.lastTransactionRef;
                                                    String $r410 = $r2.lastTransactionRef;
                                                    boolean $z014 = Log_OC.append($r310, $r410);
                                                    if ($z014) {
                                                        String $r311 = this.merchantName;
                                                        String $r411 = $r2.merchantName;
                                                        boolean $z015 = Log_OC.append($r311, $r411);
                                                        if ($z015) {
                                                            String $r312 = this.ownership;
                                                            String $r412 = $r2.ownership;
                                                            boolean $z016 = Log_OC.append($r312, $r412);
                                                            if ($z016) {
                                                                String $r313 = this.ptsp;
                                                                String $r413 = $r2.ptsp;
                                                                boolean $z017 = Log_OC.append($r313, $r413);
                                                                if ($z017) {
                                                                    String $r314 = this.status;
                                                                    String $r414 = $r2.status;
                                                                    boolean $z018 = Log_OC.append($r314, $r414);
                                                                    if ($z018) {
                                                                        List $r52 = this.tags;
                                                                        List $r62 = $r2.tags;
                                                                        boolean $z019 = Log_OC.append($r52, $r62);
                                                                        if ($z019) {
                                                                            String $r315 = this.terminalType;
                                                                            String $r415 = $r2.terminalType;
                                                                            boolean $z020 = Log_OC.append($r315, $r415);
                                                                            return $z020;
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
    public final String getAcquiringBank() {
        String r1 = this.acquiringBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getActivationCards() {
        List r1 = this.activationCards;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentId() {
        String r1 = this.agentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getDamaged() {
        boolean z0 = this.damaged;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDateAssigned() {
        String r1 = this.dateAssigned;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDateCreated() {
        String r1 = this.dateCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDateReceived() {
        String r1 = this.dateReceived;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDateUpdated() {
        String r1 = this.dateUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getHasStampDuty() {
        boolean z0 = this.hasStampDuty;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLastTransactionDate() {
        String r1 = this.lastTransactionDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLastTransactionRef() {
        String r1 = this.lastTransactionRef;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getMerchantName() {
        String r1 = this.merchantName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getOwnership() {
        String r1 = this.ownership;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPtsp() {
        String r1 = this.ptsp;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSerialNumber() {
        String r1 = this.serialNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatus() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getTags() {
        List r1 = this.tags;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTerminalId() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTerminalType() {
        String r1 = this.terminalType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.terminalId;
        int $i0 = $r1.hashCode();
        String $r12 = this.serialNumber;
        int $i1 = $r12.hashCode();
        String $r13 = this.acquiringBank;
        int $i12 = $r13.hashCode();
        List $r2 = this.activationCards;
        int $i13 = $r2.hashCode();
        String $r14 = this.agentId;
        int $i14 = $r14.hashCode();
        int $i02 = (((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31;
        boolean $z0 = this.damaged;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i15 = i;
        int $i16 = ($i02 + $i15) * 31;
        String $r15 = this.dateAssigned;
        int $i2 = $r15 == null ? 0 : $r15.hashCode();
        int $i17 = ($i16 + $i2) * 31;
        String $r16 = this.dateCreated;
        int $i22 = $r16 == null ? 0 : $r16.hashCode();
        int $i18 = ($i17 + $i22) * 31;
        String $r17 = this.dateReceived;
        int $i23 = $r17 == null ? 0 : $r17.hashCode();
        int $i19 = ($i18 + $i23) * 31;
        String $r18 = this.dateUpdated;
        int $i24 = $r18 == null ? 0 : $r18.hashCode();
        int $i110 = ($i19 + $i24) * 31;
        boolean $z02 = this.hasStampDuty;
        int $i25 = $z02 ? 1 : $z02 ? 1 : 0;
        int $i111 = ($i110 + $i25) * 31;
        String $r19 = this.lastTransactionDate;
        int $i26 = $r19 == null ? 0 : $r19.hashCode();
        int $i112 = ($i111 + $i26) * 31;
        String $r110 = this.lastTransactionRef;
        int $i27 = $r110 == null ? 0 : $r110.hashCode();
        int $i113 = ($i112 + $i27) * 31;
        String $r111 = this.merchantName;
        int $i03 = $r111 != null ? $r111.hashCode() : 0;
        String $r112 = this.ownership;
        int $i114 = $r112.hashCode();
        String $r113 = this.ptsp;
        int $i115 = $r113.hashCode();
        String $r114 = this.status;
        int $i116 = $r114.hashCode();
        List $r22 = this.tags;
        int $i117 = $r22.hashCode();
        String $r115 = this.terminalType;
        int $i118 = $r115.hashCode();
        return (((((((((($i113 + $i03) * 31) + $i114) * 31) + $i115) * 31) + $i116) * 31) + $i117) * 31) + $i118;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("OutletAccountInfo(terminalId=");
        String $r1 = this.terminalId;
        $r2.append($r1);
        $r2.append(", serialNumber=");
        String $r12 = this.serialNumber;
        $r2.append($r12);
        $r2.append(", acquiringBank=");
        String $r13 = this.acquiringBank;
        $r2.append($r13);
        $r2.append(", activationCards=");
        List $r3 = this.activationCards;
        $r2.append($r3);
        $r2.append(", agentId=");
        String $r14 = this.agentId;
        $r2.append($r14);
        $r2.append(", damaged=");
        boolean $z0 = this.damaged;
        $r2.append($z0);
        $r2.append(", dateAssigned=");
        String $r15 = this.dateAssigned;
        $r2.append((Object) $r15);
        $r2.append(", dateCreated=");
        String $r16 = this.dateCreated;
        $r2.append((Object) $r16);
        $r2.append(", dateReceived=");
        String $r17 = this.dateReceived;
        $r2.append((Object) $r17);
        $r2.append(", dateUpdated=");
        String $r18 = this.dateUpdated;
        $r2.append((Object) $r18);
        $r2.append(", hasStampDuty=");
        boolean $z02 = this.hasStampDuty;
        $r2.append($z02);
        $r2.append(", lastTransactionDate=");
        String $r19 = this.lastTransactionDate;
        $r2.append((Object) $r19);
        $r2.append(", lastTransactionRef=");
        String $r110 = this.lastTransactionRef;
        $r2.append((Object) $r110);
        $r2.append(", merchantName=");
        String $r111 = this.merchantName;
        $r2.append((Object) $r111);
        $r2.append(", ownership=");
        String $r112 = this.ownership;
        $r2.append($r112);
        $r2.append(", ptsp=");
        String $r113 = this.ptsp;
        $r2.append($r113);
        $r2.append(", status=");
        String $r114 = this.status;
        $r2.append($r114);
        $r2.append(", tags=");
        List $r32 = this.tags;
        $r2.append($r32);
        $r2.append(", terminalType=");
        String $r115 = this.terminalType;
        $r2.append($r115);
        $r2.append(')');
        String $r116 = $r2.toString();
        return $r116;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Log_OC.getArray(parcel, "out");
        String $r2 = this.terminalId;
        parcel.writeString($r2);
        String $r22 = this.serialNumber;
        parcel.writeString($r22);
        String $r23 = this.acquiringBank;
        parcel.writeString($r23);
        List $r3 = this.activationCards;
        parcel.writeStringList($r3);
        String $r24 = this.agentId;
        parcel.writeString($r24);
        parcel.writeInt(this.damaged ? 1 : 0);
        String $r25 = this.dateAssigned;
        parcel.writeString($r25);
        String $r26 = this.dateCreated;
        parcel.writeString($r26);
        String $r27 = this.dateReceived;
        parcel.writeString($r27);
        String $r28 = this.dateUpdated;
        parcel.writeString($r28);
        boolean $z0 = this.hasStampDuty;
        parcel.writeInt($z0 ? 1 : 0);
        String $r29 = this.lastTransactionDate;
        parcel.writeString($r29);
        String $r210 = this.lastTransactionRef;
        parcel.writeString($r210);
        String $r211 = this.merchantName;
        parcel.writeString($r211);
        String $r212 = this.ownership;
        parcel.writeString($r212);
        String $r213 = this.ptsp;
        parcel.writeString($r213);
        String $r214 = this.status;
        parcel.writeString($r214);
        List $r32 = this.tags;
        parcel.writeStringList($r32);
        String $r215 = this.terminalType;
        parcel.writeString($r215);
    }
}
