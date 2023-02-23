package ai.kudi.agent.users.data.model;

import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.gson.u.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: WalletActivityModel.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0092\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\"\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u00068"}, m10421d2 = {"Lai/kudi/agent/users/data/model/WalletActivityModel;", "Ljava/io/Serializable;", TransactionField.AMOUNT, "", "currency", "", TransactionField.STATUS, "fees", "paymentMethod", "headerView", "Lai/kudi/agent/users/data/model/HeaderView;", "meta", "Lai/kudi/agent/users/data/model/Meta;", "walletBalance", "transactionKind", "timeUpdated", "walletId", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lai/kudi/agent/users/data/model/HeaderView;Lai/kudi/agent/users/data/model/Meta;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "getFees", "getHeaderView", "()Lai/kudi/agent/users/data/model/HeaderView;", "setHeaderView", "(Lai/kudi/agent/users/data/model/HeaderView;)V", "getMeta", "()Lai/kudi/agent/users/data/model/Meta;", "getPaymentMethod", "getStatus", "getTimeUpdated", "getTransactionKind", "getWalletBalance", "getWalletId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lai/kudi/agent/users/data/model/HeaderView;Lai/kudi/agent/users/data/model/Meta;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/kudi/agent/users/data/model/WalletActivityModel;", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WalletActivityModel implements Serializable {
    private final Double amount;
    private final String currency;
    private final Double fees;
    private HeaderView headerView;
    @c("meta")
    private final Meta meta;
    private final String paymentMethod;
    private final String status;
    @c("time_updated")
    private final String timeUpdated;
    @c("transaction_type")
    private final String transactionKind;
    @c(ConstantsKt.EXTRA_WALLET_BALANCE)
    private final Double walletBalance;
    @c("wallet_id")
    private final String walletId;

    public WalletActivityModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public WalletActivityModel(Double d, String str, String str2, Double d2, String str3, HeaderView headerView, Meta meta, Double d3, String str4, String str5, String str6) {
        this.amount = d;
        this.currency = str;
        this.status = str2;
        this.fees = d2;
        this.paymentMethod = str3;
        this.headerView = headerView;
        this.meta = meta;
        this.walletBalance = d3;
        this.transactionKind = str4;
        this.timeUpdated = str5;
        this.walletId = str6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WalletActivityModel(java.lang.Double r17, java.lang.String r18, java.lang.String r19, java.lang.Double r20, java.lang.String r21, ai.kudi.agent.users.data.model.HeaderView r22, ai.kudi.agent.users.data.model.Meta r23, java.lang.Double r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.p483e0.p485d.DBUtils$1 r29) {
        /*
            r16 = this;
            r12 = r28 & 1
            r13 = 0
            if (r12 == 0) goto L8
            r17 = 0
            goto L8
        L8:
            r12 = r28 & 2
            if (r12 == 0) goto Lf
            java.lang.String r18 = "NGN"
            goto Lf
        Lf:
            r12 = r28 & 4
            if (r12 == 0) goto L16
            r19 = 0
            goto L16
        L16:
            r12 = r28 & 8
            if (r12 == 0) goto L21
            r14 = 0
            java.lang.Double r20 = java.lang.Double.valueOf(r14)
            goto L21
        L21:
            r12 = r28 & 16
            if (r12 == 0) goto L28
            java.lang.String r21 = "Cash"
            goto L28
        L28:
            r12 = r28 & 32
            if (r12 == 0) goto L2f
            r22 = 0
            goto L2f
        L2f:
            r12 = r28 & 64
            if (r12 == 0) goto L36
            r23 = 0
            goto L36
        L36:
            r0 = r28
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L3f
            r24 = 0
            goto L3f
        L3f:
            r0 = r28
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L48
            r25 = 0
            goto L48
        L48:
            r0 = r28
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L51
            r26 = 0
            goto L51
        L51:
            r0 = r28
            r0 = r0 & 1024(0x400, float:1.435E-42)
            r28 = r0
            if (r28 == 0) goto L5a
            goto L5c
        L5a:
            r13 = r27
        L5c:
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.data.model.WalletActivityModel.<init>(java.lang.Double, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, ai.kudi.agent.users.data.model.HeaderView, ai.kudi.agent.users.data.model.Meta, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ WalletActivityModel copy$default(WalletActivityModel walletActivityModel, Double $r2, String $r3, String $r4, Double $r5, String $r6, HeaderView $r7, Meta $r8, Double $r9, String $r10, String $r11, String $r12, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = walletActivityModel.amount;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = walletActivityModel.currency;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r4 = walletActivityModel.status;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r5 = walletActivityModel.fees;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r6 = walletActivityModel.paymentMethod;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r7 = walletActivityModel.headerView;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r8 = walletActivityModel.meta;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $r9 = walletActivityModel.walletBalance;
        }
        int $i19 = i & 256;
        if ($i19 != 0) {
            $r10 = walletActivityModel.transactionKind;
        }
        int $i110 = i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i110 != 0) {
            $r11 = walletActivityModel.timeUpdated;
        }
        int $i0 = i & 1024;
        if ($i0 != 0) {
            $r12 = walletActivityModel.walletId;
        }
        WalletActivityModel $r0 = walletActivityModel.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double component1() {
        Double r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.timeUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component11() {
        String r1 = this.walletId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.currency;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double component4() {
        Double r1 = this.fees;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.paymentMethod;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HeaderView component6() {
        HeaderView r1 = this.headerView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Meta component7() {
        Meta r1 = this.meta;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double component8() {
        Double r1 = this.walletBalance;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.transactionKind;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WalletActivityModel copy(Double d, String str, String str2, Double d2, String str3, HeaderView headerView, Meta meta, Double d3, String str4, String str5, String str6) {
        WalletActivityModel $r0 = new WalletActivityModel(d, str, str2, d2, str3, headerView, meta, d3, str4, str5, str6);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof WalletActivityModel;
        if ($z0) {
            WalletActivityModel $r2 = (WalletActivityModel) obj;
            Double $r3 = this.amount;
            Double $r4 = $r2.amount;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r5 = this.currency;
                String $r6 = $r2.currency;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    String $r52 = this.status;
                    String $r62 = $r2.status;
                    boolean $z04 = Log_OC.append($r52, $r62);
                    if ($z04) {
                        Double $r32 = this.fees;
                        Double $r42 = $r2.fees;
                        boolean $z05 = Log_OC.append($r32, $r42);
                        if ($z05) {
                            String $r53 = this.paymentMethod;
                            String $r63 = $r2.paymentMethod;
                            boolean $z06 = Log_OC.append($r53, $r63);
                            if ($z06) {
                                HeaderView $r7 = this.headerView;
                                HeaderView $r8 = $r2.headerView;
                                boolean $z07 = Log_OC.append($r7, $r8);
                                if ($z07) {
                                    Meta $r9 = this.meta;
                                    Meta $r10 = $r2.meta;
                                    boolean $z08 = Log_OC.append($r9, $r10);
                                    if ($z08) {
                                        Double $r33 = this.walletBalance;
                                        Double $r43 = $r2.walletBalance;
                                        boolean $z09 = Log_OC.append($r33, $r43);
                                        if ($z09) {
                                            String $r54 = this.transactionKind;
                                            String $r64 = $r2.transactionKind;
                                            boolean $z010 = Log_OC.append($r54, $r64);
                                            if ($z010) {
                                                String $r55 = this.timeUpdated;
                                                String $r65 = $r2.timeUpdated;
                                                boolean $z011 = Log_OC.append($r55, $r65);
                                                if ($z011) {
                                                    String $r56 = this.walletId;
                                                    String $r66 = $r2.walletId;
                                                    boolean $z012 = Log_OC.append($r56, $r66);
                                                    return $z012;
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
    public final Double getAmount() {
        Double r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCurrency() {
        String r1 = this.currency;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double getFees() {
        Double r1 = this.fees;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HeaderView getHeaderView() {
        HeaderView r1 = this.headerView;
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
    public final String getPaymentMethod() {
        String r1 = this.paymentMethod;
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
    public final String getTimeUpdated() {
        String r1 = this.timeUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTransactionKind() {
        String r1 = this.transactionKind;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double getWalletBalance() {
        Double r1 = this.walletBalance;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getWalletId() {
        String r1 = this.walletId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        Double $r1 = this.amount;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        String $r2 = this.currency;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        String $r22 = this.status;
        int $i22 = $r22 == null ? 0 : $r22.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        Double $r12 = this.fees;
        int $i23 = $r12 == null ? 0 : $r12.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        String $r23 = this.paymentMethod;
        int $i24 = $r23 == null ? 0 : $r23.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        HeaderView $r3 = this.headerView;
        int $i25 = $r3 == null ? 0 : $r3.hashCode();
        int $i17 = ($i16 + $i25) * 31;
        Meta $r4 = this.meta;
        int $i26 = $r4 == null ? 0 : $r4.hashCode();
        int $i18 = ($i17 + $i26) * 31;
        Double $r13 = this.walletBalance;
        int $i27 = $r13 == null ? 0 : $r13.hashCode();
        int $i19 = ($i18 + $i27) * 31;
        String $r24 = this.transactionKind;
        int $i28 = $r24 == null ? 0 : $r24.hashCode();
        int $i110 = ($i19 + $i28) * 31;
        String $r25 = this.timeUpdated;
        int $i29 = $r25 == null ? 0 : $r25.hashCode();
        int $i111 = ($i110 + $i29) * 31;
        String $r26 = this.walletId;
        int $i0 = $r26 != null ? $r26.hashCode() : 0;
        return $i111 + $i0;
    }

    public final void setHeaderView(HeaderView headerView) {
        this.headerView = headerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("WalletActivityModel(amount=");
        Double $r3 = this.amount;
        $r2.append($r3);
        $r2.append(", currency=");
        String $r1 = this.currency;
        $r2.append((Object) $r1);
        $r2.append(", status=");
        String $r12 = this.status;
        $r2.append((Object) $r12);
        $r2.append(", fees=");
        Double $r32 = this.fees;
        $r2.append($r32);
        $r2.append(", paymentMethod=");
        String $r13 = this.paymentMethod;
        $r2.append((Object) $r13);
        $r2.append(", headerView=");
        HeaderView $r4 = this.headerView;
        $r2.append($r4);
        $r2.append(", meta=");
        Meta $r5 = this.meta;
        $r2.append($r5);
        $r2.append(", walletBalance=");
        Double $r33 = this.walletBalance;
        $r2.append($r33);
        $r2.append(", transactionKind=");
        String $r14 = this.transactionKind;
        $r2.append((Object) $r14);
        $r2.append(", timeUpdated=");
        String $r15 = this.timeUpdated;
        $r2.append((Object) $r15);
        $r2.append(", walletId=");
        String $r16 = this.walletId;
        $r2.append((Object) $r16);
        $r2.append(')');
        String $r17 = $r2.toString();
        return $r17;
    }
}
