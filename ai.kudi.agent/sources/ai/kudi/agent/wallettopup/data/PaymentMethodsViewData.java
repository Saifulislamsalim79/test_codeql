package ai.kudi.agent.wallettopup.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.payments.domain.dto.PaymentMethod;
import ai.kudi.agent.wallettopup.adapters.CashDepositAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PaymentMethodsViewData.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "loading", "", "monnifyDetails", "Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "cards", "", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "cashDepositSteps", "Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter$Item;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData$Error;", "(ZLai/kudi/agent/wallettopup/data/MonnifyDetails;Ljava/util/List;Ljava/util/List;Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData$Error;)V", "getCards", "()Ljava/util/List;", "getCashDepositSteps", "getError", "()Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData$Error;", "getLoading", "()Z", "getMonnifyDetails", "()Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Error", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentMethodsViewData implements ViewData {
    private final List<PaymentMethod> cards;
    private final List<CashDepositAdapter.Item> cashDepositSteps;
    private final Error error;
    private final boolean loading;
    private final MonnifyDetails monnifyDetails;

    /* compiled from: PaymentMethodsViewData.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData$Error;", "", "paymentMethodFetchFailed", "", "amountError", "", "generalError", "(ZLjava/lang/String;Ljava/lang/String;)V", "getAmountError", "()Ljava/lang/String;", "getGeneralError", "getPaymentMethodFetchFailed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Error {
        private final String amountError;
        private final String generalError;
        private final boolean paymentMethodFetchFailed;

        public Error() {
            this(false, null, null, 7, null);
        }

        public Error(boolean z, String str, String str2) {
            this.paymentMethodFetchFailed = z;
            this.amountError = str;
            this.generalError = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(boolean r2, java.lang.String r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
            /*
                r1 = this;
                r0 = r5 & 1
                if (r0 == 0) goto L5
                r2 = 0
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.data.PaymentMethodsViewData.Error.<init>(boolean, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = error.paymentMethodFetchFailed;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = error.amountError;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = error.generalError;
            }
            Error $r0 = error.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean z0 = this.paymentMethodFetchFailed;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.amountError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.generalError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(boolean z, String str, String str2) {
            Error $r0 = new Error(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Error;
            if ($z0) {
                Error $r2 = (Error) obj;
                boolean $z02 = this.paymentMethodFetchFailed;
                boolean $z1 = $r2.paymentMethodFetchFailed;
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = this.amountError;
                String $r4 = $r2.amountError;
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = this.generalError;
                    String $r42 = $r2.generalError;
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
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
        public final String getGeneralError() {
            String r1 = this.generalError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean getPaymentMethodFetchFailed() {
            boolean z0 = this.paymentMethodFetchFailed;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = this.paymentMethodFetchFailed;
            if ($z0) {
                $z0 = true;
            }
            int $i1 = $z0 ? 1 : 0;
            int $i0 = $i1 * 31;
            String $r1 = this.amountError;
            int $i2 = $r1 == null ? 0 : $r1.hashCode();
            int $i02 = ($i0 + $i2) * 31;
            String $r12 = this.generalError;
            int $i12 = $r12 != null ? $r12.hashCode() : 0;
            return $i02 + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(paymentMethodFetchFailed=");
            boolean $z0 = this.paymentMethodFetchFailed;
            $r2.append($z0);
            $r2.append(", amountError=");
            String $r1 = this.amountError;
            $r2.append((Object) $r1);
            $r2.append(", generalError=");
            String $r12 = this.generalError;
            $r2.append((Object) $r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    public PaymentMethodsViewData(boolean z, MonnifyDetails monnifyDetails, List list, List list2, Error error) {
        this.loading = z;
        this.monnifyDetails = monnifyDetails;
        this.cards = list;
        this.cashDepositSteps = list2;
        this.error = error;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ PaymentMethodsViewData copy$default(PaymentMethodsViewData paymentMethodsViewData, boolean $z0, MonnifyDetails $r3, List $r0, List $r1, Error $r4, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = paymentMethodsViewData.loading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = paymentMethodsViewData.monnifyDetails;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r0 = paymentMethodsViewData.cards;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r1 = paymentMethodsViewData.cashDepositSteps;
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $r4 = paymentMethodsViewData.error;
        }
        PaymentMethodsViewData $r2 = paymentMethodsViewData.copy($z0, $r3, $r0, $r1, $r4);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MonnifyDetails component2() {
        MonnifyDetails r1 = this.monnifyDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component3() {
        List r1 = this.cards;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component4() {
        List r1 = this.cashDepositSteps;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error component5() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PaymentMethodsViewData copy(boolean z, MonnifyDetails monnifyDetails, List list, List list2, Error error) {
        PaymentMethodsViewData $r0 = new PaymentMethodsViewData(z, monnifyDetails, list, list2, error);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof PaymentMethodsViewData;
        if ($z0) {
            PaymentMethodsViewData $r2 = (PaymentMethodsViewData) obj;
            boolean $z02 = this.loading;
            boolean $z1 = $r2.loading;
            if ($z02 != $z1) {
                return false;
            }
            MonnifyDetails $r3 = this.monnifyDetails;
            MonnifyDetails $r4 = $r2.monnifyDetails;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                List $r5 = this.cards;
                List $r6 = $r2.cards;
                boolean $z04 = Log_OC.append($r5, $r6);
                if ($z04) {
                    List $r52 = this.cashDepositSteps;
                    List $r62 = $r2.cashDepositSteps;
                    boolean $z05 = Log_OC.append($r52, $r62);
                    if ($z05) {
                        Error $r7 = this.error;
                        Error $r8 = $r2.error;
                        boolean $z06 = Log_OC.append($r7, $r8);
                        return $z06;
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
    public final List getCards() {
        List r1 = this.cards;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getCashDepositSteps() {
        List r1 = this.cashDepositSteps;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Error getError() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getLoading() {
        boolean z0 = this.loading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MonnifyDetails getMonnifyDetails() {
        MonnifyDetails r1 = this.monnifyDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.loading;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        MonnifyDetails $r1 = this.monnifyDetails;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        List $r2 = this.cards;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i03 = ($i02 + $i22) * 31;
        List $r22 = this.cashDepositSteps;
        int $i23 = $r22 == null ? 0 : $r22.hashCode();
        int $i04 = ($i03 + $i23) * 31;
        Error $r3 = this.error;
        int $i12 = $r3 != null ? $r3.hashCode() : 0;
        return $i04 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("PaymentMethodsViewData(loading=");
        boolean $z0 = this.loading;
        $r2.append($z0);
        $r2.append(", monnifyDetails=");
        MonnifyDetails $r3 = this.monnifyDetails;
        $r2.append($r3);
        $r2.append(", cards=");
        List $r4 = this.cards;
        $r2.append($r4);
        $r2.append(", cashDepositSteps=");
        List $r42 = this.cashDepositSteps;
        $r2.append($r42);
        $r2.append(", error=");
        Error $r5 = this.error;
        $r2.append($r5);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
