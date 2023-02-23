package ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.BaseAmountInputViewData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UssdWithdrawalAmountInputViewData.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputViewData;", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/BaseAmountInputViewData;", "showLoader", "", "toastMsg", "", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "(ZLjava/lang/String;Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;)V", "getPayload", "()Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "getShowLoader", "()Z", "getToastMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewData */
/* loaded from: classes.dex */
public final class UssdWithdrawalAmountInputViewData extends BaseAmountInputViewData {
    private final NoVoucherWithdrawalPayload payload;
    private final boolean showLoader;
    private final String toastMsg;

    public UssdWithdrawalAmountInputViewData() {
        this(false, null, null, 7, null);
    }

    public UssdWithdrawalAmountInputViewData(boolean z, String str, NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        this.showLoader = z;
        this.toastMsg = str;
        this.payload = noVoucherWithdrawalPayload;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UssdWithdrawalAmountInputViewData(boolean r2, java.lang.String r3, ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r2 = 1
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto La
            r3 = 0
        La:
            r5 = r5 & 4
            if (r5 == 0) goto Lf
            r4 = 0
        Lf:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewData.<init>(boolean, java.lang.String, ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ UssdWithdrawalAmountInputViewData copy$default(UssdWithdrawalAmountInputViewData ussdWithdrawalAmountInputViewData, boolean $z0, String $r1, NoVoucherWithdrawalPayload $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = ussdWithdrawalAmountInputViewData.showLoader;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = ussdWithdrawalAmountInputViewData.toastMsg;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = ussdWithdrawalAmountInputViewData.payload;
        }
        UssdWithdrawalAmountInputViewData $r0 = ussdWithdrawalAmountInputViewData.copy($z0, $r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.showLoader;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.toastMsg;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NoVoucherWithdrawalPayload component3() {
        NoVoucherWithdrawalPayload r1 = this.payload;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UssdWithdrawalAmountInputViewData copy(boolean z, String str, NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        UssdWithdrawalAmountInputViewData $r0 = new UssdWithdrawalAmountInputViewData(z, str, noVoucherWithdrawalPayload);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof UssdWithdrawalAmountInputViewData;
        if ($z0) {
            UssdWithdrawalAmountInputViewData $r2 = (UssdWithdrawalAmountInputViewData) obj;
            boolean $z02 = this.showLoader;
            boolean $z1 = $r2.showLoader;
            if ($z02 != $z1) {
                return false;
            }
            String $r3 = this.toastMsg;
            String $r4 = $r2.toastMsg;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                NoVoucherWithdrawalPayload $r5 = this.payload;
                NoVoucherWithdrawalPayload $r6 = $r2.payload;
                boolean $z04 = Log_OC.append($r5, $r6);
                return $z04;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NoVoucherWithdrawalPayload getPayload() {
        NoVoucherWithdrawalPayload r1 = this.payload;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowLoader() {
        boolean z0 = this.showLoader;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getToastMsg() {
        String r1 = this.toastMsg;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.showLoader;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        String $r1 = this.toastMsg;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        NoVoucherWithdrawalPayload $r2 = this.payload;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        return $i02 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("UssdWithdrawalAmountInputViewData(showLoader=");
        boolean $z0 = this.showLoader;
        $r2.append($z0);
        $r2.append(", toastMsg=");
        String $r1 = this.toastMsg;
        $r2.append((Object) $r1);
        $r2.append(", payload=");
        NoVoucherWithdrawalPayload $r3 = this.payload;
        $r2.append($r3);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
