package ai.kudi.agent.transfer.viewmodel;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransferToMultipleViewState.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003Js\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewState;", "Lai/kudi/agent/core/mvvm/ViewData;", "recipients", "", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isLoadingAccountDetails", "", "accountNumberError", "", "accountNameError", BanksWithMethods.ACCOUNT_NAME, "bankError", "amountError", "isNextButtonEnabled", "isProcessingPayments", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAccountName", "()Ljava/lang/String;", "getAccountNameError", "getAccountNumberError", "getAmountError", "getBankError", "()Z", "getRecipients", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToMultipleViewState implements ViewData {
    private final String accountName;
    private final String accountNameError;
    private final String accountNumberError;
    private final String amountError;
    private final String bankError;
    private final boolean isLoadingAccountDetails;
    private final boolean isNextButtonEnabled;
    private final boolean isProcessingPayments;
    private final List<TransferToBankPayload> recipients;

    public TransferToMultipleViewState() {
        this(null, false, null, null, null, null, null, false, false, 511, null);
    }

    public TransferToMultipleViewState(List list, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3) {
        Log_OC.getArray(list, "recipients");
        this.recipients = list;
        this.isLoadingAccountDetails = z;
        this.accountNumberError = str;
        this.accountNameError = str2;
        this.accountName = str3;
        this.bankError = str4;
        this.amountError = str5;
        this.isNextButtonEnabled = z2;
        this.isProcessingPayments = z3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TransferToMultipleViewState(java.util.List r14, boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, int r23, kotlin.p483e0.p485d.DBUtils$1 r24) {
        /*
            r13 = this;
            r10 = r23 & 1
            if (r10 == 0) goto L9
            java.util.List r14 = kotlin.p557z.C13722p.m3941e()
            goto L9
        L9:
            r10 = r23 & 2
            r11 = 0
            if (r10 == 0) goto L10
            r15 = 0
            goto L10
        L10:
            r10 = r23 & 4
            r12 = 0
            if (r10 == 0) goto L18
            r16 = 0
            goto L18
        L18:
            r10 = r23 & 8
            if (r10 == 0) goto L1f
            r17 = 0
            goto L1f
        L1f:
            r10 = r23 & 16
            if (r10 == 0) goto L26
            r18 = 0
            goto L26
        L26:
            r10 = r23 & 32
            if (r10 == 0) goto L2d
            r19 = 0
            goto L2d
        L2d:
            r10 = r23 & 64
            if (r10 == 0) goto L32
            goto L34
        L32:
            r12 = r20
        L34:
            r0 = r23
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L3d
            r21 = 0
            goto L3d
        L3d:
            r0 = r23
            r0 = r0 & 256(0x100, float:3.59E-43)
            r23 = r0
            if (r23 == 0) goto L46
            goto L48
        L46:
            r11 = r22
        L48:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r12
            r8 = r21
            r9 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState.<init>(java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ TransferToMultipleViewState copy$default(TransferToMultipleViewState transferToMultipleViewState, List $r2, boolean $z0, String $r3, String $r4, String $r5, String $r6, String $r7, boolean $z1, boolean $z2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = transferToMultipleViewState.recipients;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z0 = transferToMultipleViewState.isLoadingAccountDetails;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r3 = transferToMultipleViewState.accountNumberError;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r4 = transferToMultipleViewState.accountNameError;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r5 = transferToMultipleViewState.accountName;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r6 = transferToMultipleViewState.bankError;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r7 = transferToMultipleViewState.amountError;
        }
        int $i18 = i & 128;
        if ($i18 != 0) {
            $z1 = transferToMultipleViewState.isNextButtonEnabled;
        }
        int $i0 = i & 256;
        if ($i0 != 0) {
            $z2 = transferToMultipleViewState.isProcessingPayments;
        }
        TransferToMultipleViewState $r0 = transferToMultipleViewState.copy($r2, $z0, $r3, $r4, $r5, $r6, $r7, $z1, $z2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component1() {
        List r1 = this.recipients;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isLoadingAccountDetails;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.accountNumberError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.accountNameError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.accountName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.bankError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.amountError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component8() {
        boolean z0 = this.isNextButtonEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component9() {
        boolean z0 = this.isProcessingPayments;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransferToMultipleViewState copy(List list, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3) {
        Log_OC.getArray(list, "recipients");
        TransferToMultipleViewState $r0 = new TransferToMultipleViewState(list, z, str, str2, str3, str4, str5, z2, z3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof TransferToMultipleViewState;
        if ($z0) {
            TransferToMultipleViewState $r2 = (TransferToMultipleViewState) obj;
            List $r3 = this.recipients;
            List $r4 = $r2.recipients;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                boolean $z03 = this.isLoadingAccountDetails;
                boolean $z1 = $r2.isLoadingAccountDetails;
                if ($z03 != $z1) {
                    return false;
                }
                String $r5 = this.accountNumberError;
                String $r6 = $r2.accountNumberError;
                boolean $z04 = Log_OC.append($r5, $r6);
                if ($z04) {
                    String $r52 = this.accountNameError;
                    String $r62 = $r2.accountNameError;
                    boolean $z05 = Log_OC.append($r52, $r62);
                    if ($z05) {
                        String $r53 = this.accountName;
                        String $r63 = $r2.accountName;
                        boolean $z06 = Log_OC.append($r53, $r63);
                        if ($z06) {
                            String $r54 = this.bankError;
                            String $r64 = $r2.bankError;
                            boolean $z07 = Log_OC.append($r54, $r64);
                            if ($z07) {
                                String $r55 = this.amountError;
                                String $r65 = $r2.amountError;
                                boolean $z08 = Log_OC.append($r55, $r65);
                                if ($z08) {
                                    boolean $z09 = this.isNextButtonEnabled;
                                    boolean $z12 = $r2.isNextButtonEnabled;
                                    if ($z09 != $z12) {
                                        return false;
                                    }
                                    boolean $z010 = this.isProcessingPayments;
                                    boolean $z13 = $r2.isProcessingPayments;
                                    return $z010 == $z13;
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
    public final String getAccountNameError() {
        String r1 = this.accountNameError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAccountNumberError() {
        String r1 = this.accountNumberError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAmountError() {
        String r1 = this.amountError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBankError() {
        String r1 = this.bankError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getRecipients() {
        List r1 = this.recipients;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List $r1 = this.recipients;
        int $i0 = $r1.hashCode();
        int $i02 = $i0 * 31;
        boolean $z0 = this.isLoadingAccountDetails;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i12 = ($i02 + $i1) * 31;
        String $r2 = this.accountNumberError;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        String $r22 = this.accountNameError;
        int $i22 = $r22 == null ? 0 : $r22.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        String $r23 = this.accountName;
        int $i23 = $r23 == null ? 0 : $r23.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        String $r24 = this.bankError;
        int $i24 = $r24 == null ? 0 : $r24.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        String $r25 = this.amountError;
        int $i03 = $r25 != null ? $r25.hashCode() : 0;
        int $i04 = ($i16 + $i03) * 31;
        boolean $z02 = this.isNextButtonEnabled;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i17 = i2;
        int $i05 = ($i04 + $i17) * 31;
        boolean $z03 = this.isProcessingPayments;
        int $i18 = $z03 ? 1 : $z03 ? 1 : 0;
        return $i05 + $i18;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoadingAccountDetails() {
        boolean z0 = this.isLoadingAccountDetails;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNextButtonEnabled() {
        boolean z0 = this.isNextButtonEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isProcessingPayments() {
        boolean z0 = this.isProcessingPayments;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("TransferToMultipleViewState(recipients=");
        List $r3 = this.recipients;
        $r2.append($r3);
        $r2.append(", isLoadingAccountDetails=");
        boolean $z0 = this.isLoadingAccountDetails;
        $r2.append($z0);
        $r2.append(", accountNumberError=");
        String $r1 = this.accountNumberError;
        $r2.append((Object) $r1);
        $r2.append(", accountNameError=");
        String $r12 = this.accountNameError;
        $r2.append((Object) $r12);
        $r2.append(", accountName=");
        String $r13 = this.accountName;
        $r2.append((Object) $r13);
        $r2.append(", bankError=");
        String $r14 = this.bankError;
        $r2.append((Object) $r14);
        $r2.append(", amountError=");
        String $r15 = this.amountError;
        $r2.append((Object) $r15);
        $r2.append(", isNextButtonEnabled=");
        boolean $z02 = this.isNextButtonEnabled;
        $r2.append($z02);
        $r2.append(", isProcessingPayments=");
        boolean $z03 = this.isProcessingPayments;
        $r2.append($z03);
        $r2.append(')');
        String $r16 = $r2.toString();
        return $r16;
    }
}
