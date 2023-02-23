package ai.kudi.agent.kshock.presentation.viewdata;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.kshock.data.model.KShockAvailability;
import ai.kudi.agent.kshock.data.model.KshockEligibility;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: KShockViewData.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "availability", "Lai/kudi/agent/kshock/data/model/KShockAvailability;", "user", "Lai/kudi/agent/users/domain/dto/User;", "kshockEligibility", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "transactionResponse", "Lai/kudi/agent/kshock/data/domain/dto/TransactionResponse;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "(ZLai/kudi/agent/kshock/data/model/KShockAvailability;Lai/kudi/agent/users/domain/dto/User;Lai/kudi/agent/kshock/data/model/KshockEligibility;Lai/kudi/agent/kshock/data/domain/dto/TransactionResponse;Ljava/lang/String;)V", "getAvailability", "()Lai/kudi/agent/kshock/data/model/KShockAvailability;", "getError", "()Ljava/lang/String;", "()Z", "getKshockEligibility", "()Lai/kudi/agent/kshock/data/model/KshockEligibility;", "getTransactionResponse", "()Lai/kudi/agent/kshock/data/domain/dto/TransactionResponse;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KShockViewData implements ViewData {
    private final KShockAvailability availability;
    private final String error;
    private final boolean isLoading;
    private final KshockEligibility kshockEligibility;
    private final TransactionResponse transactionResponse;
    private final User user;

    public KShockViewData() {
        this(false, null, null, null, null, null, 63, null);
    }

    public KShockViewData(boolean z, KShockAvailability kShockAvailability, User user, KshockEligibility kshockEligibility, TransactionResponse transactionResponse, String str) {
        this.isLoading = z;
        this.availability = kShockAvailability;
        this.user = user;
        this.kshockEligibility = kshockEligibility;
        this.transactionResponse = transactionResponse;
        this.error = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ KShockViewData(boolean r10, ai.kudi.agent.kshock.data.model.KShockAvailability r11, ai.kudi.agent.users.domain.package_1.User r12, ai.kudi.agent.kshock.data.model.KshockEligibility r13, ai.kudi.agent.kshock.data.domain.fht.TransactionResponse r14, java.lang.String r15, int r16, kotlin.p483e0.p485d.DBUtils$1 r17) {
        /*
            r9 = this;
            r7 = r16 & 1
            if (r7 == 0) goto L5
            r10 = 0
        L5:
            r7 = r16 & 2
            r8 = 0
            if (r7 == 0) goto Lc
            r11 = 0
            goto Lc
        Lc:
            r7 = r16 & 4
            if (r7 == 0) goto L12
            r12 = 0
            goto L12
        L12:
            r7 = r16 & 8
            if (r7 == 0) goto L18
            r13 = 0
            goto L18
        L18:
            r7 = r16 & 16
            if (r7 == 0) goto L1e
            r14 = 0
            goto L1e
        L1e:
            r16 = r16 & 32
            if (r16 == 0) goto L23
            goto L24
        L23:
            r8 = r15
        L24:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.presentation.viewdata.KShockViewData.<init>(boolean, ai.kudi.agent.kshock.data.model.KShockAvailability, ai.kudi.agent.users.domain.package_1.User, ai.kudi.agent.kshock.data.model.KshockEligibility, ai.kudi.agent.kshock.data.domain.fht.TransactionResponse, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ KShockViewData copy$default(KShockViewData kShockViewData, boolean $z0, KShockAvailability $r4, User $r0, KshockEligibility $r1, TransactionResponse $r2, String $r5, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = kShockViewData.isLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r4 = kShockViewData.availability;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r0 = kShockViewData.user;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r1 = kShockViewData.kshockEligibility;
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r2 = kShockViewData.transactionResponse;
        }
        int $i0 = i & 32;
        if ($i0 != 0) {
            $r5 = kShockViewData.error;
        }
        KShockViewData $r3 = kShockViewData.copy($z0, $r4, $r0, $r1, $r2, $r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KShockAvailability component2() {
        KShockAvailability r1 = this.availability;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User component3() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KshockEligibility component4() {
        KshockEligibility r1 = this.kshockEligibility;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionResponse component5() {
        TransactionResponse r1 = this.transactionResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KShockViewData copy(boolean z, KShockAvailability kShockAvailability, User user, KshockEligibility kshockEligibility, TransactionResponse transactionResponse, String str) {
        KShockViewData $r0 = new KShockViewData(z, kShockAvailability, user, kshockEligibility, transactionResponse, str);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof KShockViewData;
        if ($z0) {
            KShockViewData $r2 = (KShockViewData) obj;
            boolean $z02 = this.isLoading;
            boolean $z1 = $r2.isLoading;
            if ($z02 != $z1) {
                return false;
            }
            KShockAvailability $r3 = this.availability;
            KShockAvailability $r4 = $r2.availability;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                User $r5 = this.user;
                User $r6 = $r2.user;
                boolean $z04 = Log_OC.append($r5, $r6);
                if ($z04) {
                    KshockEligibility $r7 = this.kshockEligibility;
                    KshockEligibility $r8 = $r2.kshockEligibility;
                    boolean $z05 = Log_OC.append($r7, $r8);
                    if ($z05) {
                        TransactionResponse $r9 = this.transactionResponse;
                        TransactionResponse $r10 = $r2.transactionResponse;
                        boolean $z06 = Log_OC.append($r9, $r10);
                        if ($z06) {
                            String $r11 = this.error;
                            String $r12 = $r2.error;
                            boolean $z07 = Log_OC.append($r11, $r12);
                            return $z07;
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
    public final KShockAvailability getAvailability() {
        KShockAvailability r1 = this.availability;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getError() {
        String r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KshockEligibility getKshockEligibility() {
        KshockEligibility r1 = this.kshockEligibility;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionResponse getTransactionResponse() {
        TransactionResponse r1 = this.transactionResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.isLoading;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        KShockAvailability $r1 = this.availability;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        User $r2 = this.user;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i03 = ($i02 + $i22) * 31;
        KshockEligibility $r3 = this.kshockEligibility;
        int $i23 = $r3 == null ? 0 : $r3.hashCode();
        int $i04 = ($i03 + $i23) * 31;
        TransactionResponse $r4 = this.transactionResponse;
        int $i24 = $r4 == null ? 0 : $r4.hashCode();
        int $i05 = ($i04 + $i24) * 31;
        String $r5 = this.error;
        int $i12 = $r5 != null ? $r5.hashCode() : 0;
        return $i05 + $i12;
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
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("KShockViewData(isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", availability=");
        KShockAvailability $r3 = this.availability;
        $r2.append($r3);
        $r2.append(", user=");
        User $r4 = this.user;
        $r2.append($r4);
        $r2.append(", kshockEligibility=");
        KshockEligibility $r5 = this.kshockEligibility;
        $r2.append($r5);
        $r2.append(", transactionResponse=");
        TransactionResponse $r6 = this.transactionResponse;
        $r2.append($r6);
        $r2.append(", error=");
        String $r1 = this.error;
        $r2.append((Object) $r1);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
