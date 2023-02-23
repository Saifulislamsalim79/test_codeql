package ai.kudi.agent.pos.p016ui.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.data.PosResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OrderDetailsViewData.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002*+B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/pos/ui/data/OrderDetailsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isError", "", "isWalletLoading", "", "isLoading", "isMakingPayment", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$Error;", "userAcctStatus", "Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$UserAcctStatus;", "posResponseV2", "Lai/kudi/agent/pos/data/PosResponse;", "newPosPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "(Ljava/lang/String;ZZZLai/kudi/agent/pos/ui/data/OrderDetailsViewData$Error;Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$UserAcctStatus;Lai/kudi/agent/pos/data/PosResponse;Lai/kudi/agent/pos/data/PosPurchaseInfo;)V", "getError", "()Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$Error;", "()Ljava/lang/String;", "()Z", "getNewPosPurchaseInfo", "()Lai/kudi/agent/pos/data/PosPurchaseInfo;", "getPosResponseV2", "()Lai/kudi/agent/pos/data/PosResponse;", "getUserAcctStatus", "()Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$UserAcctStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Error", "UserAcctStatus", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.data.OrderDetailsViewData */
/* loaded from: classes.dex */
public final class OrderDetailsViewData implements ViewData {
    private final Error error;
    private final String isError;
    private final boolean isLoading;
    private final boolean isMakingPayment;
    private final boolean isWalletLoading;
    private final PosPurchaseInfo newPosPurchaseInfo;
    private final PosResponse posResponseV2;
    private final UserAcctStatus userAcctStatus;

    /* compiled from: OrderDetailsViewData.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$Error;", "", "genericError", "", "paymentError", "(Ljava/lang/String;Ljava/lang/String;)V", "getGenericError", "()Ljava/lang/String;", "getPaymentError", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.data.OrderDetailsViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error {
        private final String genericError;
        private final String paymentError;

        public Error() {
            this(null, null, 3, null);
        }

        public Error(String str, String str2) {
            this.genericError = str;
            this.paymentError = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Error(java.lang.String r2, java.lang.String r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
            /*
                r1 = this;
                r0 = r4 & 1
                if (r0 == 0) goto L5
                r2 = 0
            L5:
                r4 = r4 & 2
                if (r4 == 0) goto La
                r3 = 0
            La:
                r1.<init>(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData.Error.<init>(java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = error.genericError;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = error.paymentError;
            }
            Error $r0 = error.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.genericError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.paymentError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, String str2) {
            Error $r0 = new Error(str, str2);
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
                Error $r3 = (Error) obj;
                String $r4 = this.genericError;
                String $r1 = $r3.genericError;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.paymentError;
                    String $r42 = $r3.paymentError;
                    boolean $z03 = Log_OC.append($r12, $r42);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getGenericError() {
            String r1 = this.genericError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getPaymentError() {
            String r1 = this.paymentError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.genericError;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.paymentError;
            int $i0 = $r12 != null ? $r12.hashCode() : 0;
            return $i12 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(genericError=");
            String $r1 = this.genericError;
            $r2.append((Object) $r1);
            $r2.append(", paymentError=");
            String $r12 = this.paymentError;
            $r2.append((Object) $r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    /* compiled from: OrderDetailsViewData.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$UserAcctStatus;", "", "doesUserHaveMoney", "", "walletBalance", "", "(Ljava/lang/Boolean;Ljava/lang/Double;)V", "getDoesUserHaveMoney", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWalletBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;)Lai/kudi/agent/pos/ui/data/OrderDetailsViewData$UserAcctStatus;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.data.OrderDetailsViewData$UserAcctStatus */
    /* loaded from: classes.dex */
    public static final class UserAcctStatus {
        private final Boolean doesUserHaveMoney;
        private final Double walletBalance;

        public UserAcctStatus() {
            this(null, null, 3, null);
        }

        public UserAcctStatus(Boolean bool, Double d) {
            this.doesUserHaveMoney = bool;
            this.walletBalance = d;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ UserAcctStatus(java.lang.Boolean r2, java.lang.Double r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
            /*
                r1 = this;
                r0 = r4 & 1
                if (r0 == 0) goto L5
                r2 = 0
            L5:
                r4 = r4 & 2
                if (r4 == 0) goto La
                r3 = 0
            La:
                r1.<init>(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData.UserAcctStatus.<init>(java.lang.Boolean, java.lang.Double, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ UserAcctStatus copy$default(UserAcctStatus userAcctStatus, Boolean $r1, Double $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = userAcctStatus.doesUserHaveMoney;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = userAcctStatus.walletBalance;
            }
            UserAcctStatus $r0 = userAcctStatus.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Boolean component1() {
            Boolean r1 = this.doesUserHaveMoney;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Double component2() {
            Double r1 = this.walletBalance;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final UserAcctStatus copy(Boolean bool, Double d) {
            UserAcctStatus $r0 = new UserAcctStatus(bool, d);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof UserAcctStatus;
            if ($z0) {
                UserAcctStatus $r3 = (UserAcctStatus) obj;
                Boolean $r4 = this.doesUserHaveMoney;
                Boolean $r1 = $r3.doesUserHaveMoney;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    Double $r5 = this.walletBalance;
                    Double $r6 = $r3.walletBalance;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Boolean getDoesUserHaveMoney() {
            Boolean r1 = this.doesUserHaveMoney;
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
        public int hashCode() {
            Boolean $r2 = this.doesUserHaveMoney;
            int $i1 = $r2 == null ? 0 : $r2.hashCode();
            int $i12 = $i1 * 31;
            Double $r1 = this.walletBalance;
            int $i0 = $r1 != null ? $r1.hashCode() : 0;
            return $i12 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("UserAcctStatus(doesUserHaveMoney=");
            Boolean $r3 = this.doesUserHaveMoney;
            $r2.append($r3);
            $r2.append(", walletBalance=");
            Double $r4 = this.walletBalance;
            $r2.append($r4);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    public OrderDetailsViewData() {
        this(null, false, false, false, null, null, null, null, 255, null);
    }

    public OrderDetailsViewData(String str, boolean z, boolean z2, boolean z3, Error error, UserAcctStatus userAcctStatus, PosResponse posResponse, PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(str, "isError");
        this.isError = str;
        this.isWalletLoading = z;
        this.isLoading = z2;
        this.isMakingPayment = z3;
        this.error = error;
        this.userAcctStatus = userAcctStatus;
        this.posResponseV2 = posResponse;
        this.newPosPurchaseInfo = posPurchaseInfo;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ OrderDetailsViewData(java.lang.String r13, boolean r14, boolean r15, boolean r16, ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData.Error r17, ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData.UserAcctStatus r18, ai.kudi.agent.pos.data.PosResponse r19, ai.kudi.agent.pos.data.PosPurchaseInfo r20, int r21, kotlin.p483e0.p485d.DBUtils$1 r22) {
        /*
            r12 = this;
            r9 = r21 & 1
            if (r9 == 0) goto L7
            java.lang.String r13 = ""
            goto L7
        L7:
            r9 = r21 & 2
            r10 = 0
            if (r9 == 0) goto Le
            r14 = 0
            goto Le
        Le:
            r9 = r21 & 4
            if (r9 == 0) goto L14
            r15 = 0
            goto L14
        L14:
            r9 = r21 & 8
            if (r9 == 0) goto L19
            goto L1b
        L19:
            r10 = r16
        L1b:
            r9 = r21 & 16
            r11 = 0
            if (r9 == 0) goto L23
            r17 = 0
            goto L23
        L23:
            r9 = r21 & 32
            if (r9 == 0) goto L2a
            r18 = 0
            goto L2a
        L2a:
            r9 = r21 & 64
            if (r9 == 0) goto L31
            r19 = 0
            goto L31
        L31:
            r0 = r21
            r0 = r0 & 128(0x80, float:1.794E-43)
            r21 = r0
            if (r21 == 0) goto L3a
            goto L3c
        L3a:
            r11 = r20
        L3c:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData.<init>(java.lang.String, boolean, boolean, boolean, ai.kudi.agent.pos.ui.data.OrderDetailsViewData$Error, ai.kudi.agent.pos.ui.data.OrderDetailsViewData$UserAcctStatus, ai.kudi.agent.pos.data.PosResponse, ai.kudi.agent.pos.data.PosPurchaseInfo, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ OrderDetailsViewData copy$default(OrderDetailsViewData orderDetailsViewData, String $r2, boolean $z0, boolean $z1, boolean $z2, Error $r3, UserAcctStatus $r4, PosResponse $r5, PosPurchaseInfo $r6, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = orderDetailsViewData.isError;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $z0 = orderDetailsViewData.isWalletLoading;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z1 = orderDetailsViewData.isLoading;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $z2 = orderDetailsViewData.isMakingPayment;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r3 = orderDetailsViewData.error;
        }
        int $i16 = i & 32;
        if ($i16 != 0) {
            $r4 = orderDetailsViewData.userAcctStatus;
        }
        int $i17 = i & 64;
        if ($i17 != 0) {
            $r5 = orderDetailsViewData.posResponseV2;
        }
        int $i0 = i & 128;
        if ($i0 != 0) {
            $r6 = orderDetailsViewData.newPosPurchaseInfo;
        }
        OrderDetailsViewData $r0 = orderDetailsViewData.copy($r2, $z0, $z1, $z2, $r3, $r4, $r5, $r6);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.isError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component2() {
        boolean z0 = this.isWalletLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component4() {
        boolean z0 = this.isMakingPayment;
        return z0;
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
    public final UserAcctStatus component6() {
        UserAcctStatus r1 = this.userAcctStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosResponse component7() {
        PosResponse r1 = this.posResponseV2;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosPurchaseInfo component8() {
        PosPurchaseInfo r1 = this.newPosPurchaseInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OrderDetailsViewData copy(String str, boolean z, boolean z2, boolean z3, Error error, UserAcctStatus userAcctStatus, PosResponse posResponse, PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(str, "isError");
        OrderDetailsViewData $r0 = new OrderDetailsViewData(str, z, z2, z3, error, userAcctStatus, posResponse, posPurchaseInfo);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof OrderDetailsViewData;
        if ($z0) {
            OrderDetailsViewData $r2 = (OrderDetailsViewData) obj;
            String $r3 = this.isError;
            String $r4 = $r2.isError;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                boolean $z03 = this.isWalletLoading;
                boolean $z1 = $r2.isWalletLoading;
                if ($z03 != $z1) {
                    return false;
                }
                boolean $z04 = this.isLoading;
                boolean $z12 = $r2.isLoading;
                if ($z04 != $z12) {
                    return false;
                }
                boolean $z05 = this.isMakingPayment;
                boolean $z13 = $r2.isMakingPayment;
                if ($z05 != $z13) {
                    return false;
                }
                Error $r5 = this.error;
                Error $r6 = $r2.error;
                boolean $z06 = Log_OC.append($r5, $r6);
                if ($z06) {
                    UserAcctStatus $r7 = this.userAcctStatus;
                    UserAcctStatus $r8 = $r2.userAcctStatus;
                    boolean $z07 = Log_OC.append($r7, $r8);
                    if ($z07) {
                        PosResponse $r9 = this.posResponseV2;
                        PosResponse $r10 = $r2.posResponseV2;
                        boolean $z08 = Log_OC.append($r9, $r10);
                        if ($z08) {
                            PosPurchaseInfo $r11 = this.newPosPurchaseInfo;
                            PosPurchaseInfo $r12 = $r2.newPosPurchaseInfo;
                            boolean $z09 = Log_OC.append($r11, $r12);
                            return $z09;
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
    public final Error getError() {
        Error r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosPurchaseInfo getNewPosPurchaseInfo() {
        PosPurchaseInfo r1 = this.newPosPurchaseInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosResponse getPosResponseV2() {
        PosResponse r1 = this.posResponseV2;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserAcctStatus getUserAcctStatus() {
        UserAcctStatus r1 = this.userAcctStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.isError;
        int $i0 = $r1.hashCode();
        int $i02 = $i0 * 31;
        boolean $z0 = this.isWalletLoading;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i1 = i;
        int $i03 = ($i02 + $i1) * 31;
        boolean $z02 = this.isLoading;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i12 = i2;
        int $i04 = ($i03 + $i12) * 31;
        boolean $z03 = this.isMakingPayment;
        int $i13 = $z03 ? 1 : $z03 ? 1 : 0;
        int $i14 = ($i04 + $i13) * 31;
        Error $r2 = this.error;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i15 = ($i14 + $i2) * 31;
        UserAcctStatus $r3 = this.userAcctStatus;
        int $i22 = $r3 == null ? 0 : $r3.hashCode();
        int $i16 = ($i15 + $i22) * 31;
        PosResponse $r4 = this.posResponseV2;
        int $i23 = $r4 == null ? 0 : $r4.hashCode();
        int $i17 = ($i16 + $i23) * 31;
        PosPurchaseInfo $r5 = this.newPosPurchaseInfo;
        int $i05 = $r5 != null ? $r5.hashCode() : 0;
        return $i17 + $i05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String isError() {
        String r1 = this.isError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoading() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isMakingPayment() {
        boolean z0 = this.isMakingPayment;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isWalletLoading() {
        boolean z0 = this.isWalletLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("OrderDetailsViewData(isError=");
        String $r1 = this.isError;
        $r2.append($r1);
        $r2.append(", isWalletLoading=");
        boolean $z0 = this.isWalletLoading;
        $r2.append($z0);
        $r2.append(", isLoading=");
        boolean $z02 = this.isLoading;
        $r2.append($z02);
        $r2.append(", isMakingPayment=");
        boolean $z03 = this.isMakingPayment;
        $r2.append($z03);
        $r2.append(", error=");
        Error $r3 = this.error;
        $r2.append($r3);
        $r2.append(", userAcctStatus=");
        UserAcctStatus $r4 = this.userAcctStatus;
        $r2.append($r4);
        $r2.append(", posResponseV2=");
        PosResponse $r5 = this.posResponseV2;
        $r2.append($r5);
        $r2.append(", newPosPurchaseInfo=");
        PosPurchaseInfo $r6 = this.newPosPurchaseInfo;
        $r2.append($r6);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
