package ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.card_withdrawal;

import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.BaseAmountInputViewData;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CardWithdrawalAmountViewData.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/card_withdrawal/CardWithdrawalAmountViewData;", "Lai/kudi/agent/common_screens/amount_input/ui/viewdata/BaseAmountInputViewData;", "showLoader", "", "toastMsg", "", "serviceFee", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "(ZLjava/lang/String;Ljava/lang/String;Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;)V", "getRequest", "()Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "getServiceFee", "()Ljava/lang/String;", "getShowLoader", "()Z", "getToastMsg", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewData */
/* loaded from: classes.dex */
public final class CardWithdrawalAmountViewData extends BaseAmountInputViewData {
    private final WithdrawalRequest request;
    private final String serviceFee;
    private final boolean showLoader;
    private final String toastMsg;

    public CardWithdrawalAmountViewData() {
        this(false, null, null, null, 15, null);
    }

    public CardWithdrawalAmountViewData(boolean z, String str, String str2, WithdrawalRequest withdrawalRequest) {
        this.showLoader = z;
        this.toastMsg = str;
        this.serviceFee = str2;
        this.request = withdrawalRequest;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CardWithdrawalAmountViewData(boolean r2, java.lang.String r3, java.lang.String r4, ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
        /*
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L5
            r2 = 1
        L5:
            r0 = r6 & 2
            if (r0 == 0) goto La
            r3 = 0
        La:
            r0 = r6 & 4
            if (r0 == 0) goto Lf
            r4 = 0
        Lf:
            r6 = r6 & 8
            if (r6 == 0) goto L14
            r5 = 0
        L14:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewData.<init>(boolean, java.lang.String, java.lang.String, ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ CardWithdrawalAmountViewData copy$default(CardWithdrawalAmountViewData cardWithdrawalAmountViewData, boolean $z0, String $r1, String $r2, WithdrawalRequest $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = cardWithdrawalAmountViewData.showLoader;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = cardWithdrawalAmountViewData.toastMsg;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r2 = cardWithdrawalAmountViewData.serviceFee;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r3 = cardWithdrawalAmountViewData.request;
        }
        CardWithdrawalAmountViewData $r0 = cardWithdrawalAmountViewData.copy($z0, $r1, $r2, $r3);
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
    public final String component3() {
        String r1 = this.serviceFee;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WithdrawalRequest component4() {
        WithdrawalRequest r1 = this.request;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CardWithdrawalAmountViewData copy(boolean z, String str, String str2, WithdrawalRequest withdrawalRequest) {
        CardWithdrawalAmountViewData $r0 = new CardWithdrawalAmountViewData(z, str, str2, withdrawalRequest);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof CardWithdrawalAmountViewData;
        if ($z0) {
            CardWithdrawalAmountViewData $r2 = (CardWithdrawalAmountViewData) obj;
            boolean $z02 = this.showLoader;
            boolean $z1 = $r2.showLoader;
            if ($z02 != $z1) {
                return false;
            }
            String $r3 = this.toastMsg;
            String $r4 = $r2.toastMsg;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                String $r32 = this.serviceFee;
                String $r42 = $r2.serviceFee;
                boolean $z04 = Log_OC.append($r32, $r42);
                if ($z04) {
                    WithdrawalRequest $r5 = this.request;
                    WithdrawalRequest $r6 = $r2.request;
                    boolean $z05 = Log_OC.append($r5, $r6);
                    return $z05;
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
    public final WithdrawalRequest getRequest() {
        WithdrawalRequest r1 = this.request;
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
        String $r12 = this.serviceFee;
        int $i22 = $r12 == null ? 0 : $r12.hashCode();
        int $i03 = ($i02 + $i22) * 31;
        WithdrawalRequest $r2 = this.request;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        return $i03 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CardWithdrawalAmountViewData(showLoader=");
        boolean $z0 = this.showLoader;
        $r2.append($z0);
        $r2.append(", toastMsg=");
        String $r1 = this.toastMsg;
        $r2.append((Object) $r1);
        $r2.append(", serviceFee=");
        String $r12 = this.serviceFee;
        $r2.append((Object) $r12);
        $r2.append(", request=");
        WithdrawalRequest $r3 = this.request;
        $r2.append($r3);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }
}
