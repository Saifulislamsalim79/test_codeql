package ai.kudi.agent.register.domain.wiki;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BvnVerificationRequest.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/register/domain/dto/BvnVerificationResponse;", "", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", MetricTracker.Object.MESSAGE, "", "otpSent", "", TransactionField.STATUS, "(Lai/kudi/agent/settings/domain/dto/UserProfileResponse;Ljava/lang/String;ZZ)V", "getData", "()Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "getMessage", "()Ljava/lang/String;", "getOtpSent", "()Z", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BvnVerificationResponse {
    private final UserProfileResponse data;
    private final String message;
    private final boolean otpSent;
    private final boolean status;

    public BvnVerificationResponse(UserProfileResponse userProfileResponse, String str, boolean z, boolean z2) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        this.data = userProfileResponse;
        this.message = str;
        this.otpSent = z;
        this.status = z2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BvnVerificationResponse(ai.kudi.agent.settings.domain.package_4.UserProfileResponse r1, java.lang.String r2, boolean r3, boolean r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r0 = this;
            r5 = r5 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.domain.wiki.BvnVerificationResponse.<init>(ai.kudi.agent.settings.domain.package_4.UserProfileResponse, java.lang.String, boolean, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ BvnVerificationResponse copy$default(BvnVerificationResponse bvnVerificationResponse, UserProfileResponse $r1, String $r2, boolean $z0, boolean $z1, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = bvnVerificationResponse.data;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = bvnVerificationResponse.message;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z0 = bvnVerificationResponse.otpSent;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $z1 = bvnVerificationResponse.status;
        }
        BvnVerificationResponse $r0 = bvnVerificationResponse.copy($r1, $r2, $z0, $z1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserProfileResponse component1() {
        UserProfileResponse r1 = this.data;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.message;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.otpSent;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component4() {
        boolean z0 = this.status;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BvnVerificationResponse copy(UserProfileResponse userProfileResponse, String str, boolean z, boolean z2) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        BvnVerificationResponse $r0 = new BvnVerificationResponse(userProfileResponse, str, z, z2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof BvnVerificationResponse;
        if ($z0) {
            BvnVerificationResponse $r2 = (BvnVerificationResponse) obj;
            UserProfileResponse $r3 = this.data;
            UserProfileResponse $r4 = $r2.data;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r5 = this.message;
                String $r6 = $r2.message;
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    boolean $z04 = this.otpSent;
                    boolean $z1 = $r2.otpSent;
                    if ($z04 != $z1) {
                        return false;
                    }
                    boolean $z05 = this.status;
                    boolean $z12 = $r2.status;
                    return $z05 == $z12;
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
    public final UserProfileResponse getData() {
        UserProfileResponse r1 = this.data;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getMessage() {
        String r1 = this.message;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getOtpSent() {
        boolean z0 = this.otpSent;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getStatus() {
        boolean z0 = this.status;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        UserProfileResponse $r1 = this.data;
        int $i0 = $r1 == null ? 0 : $r1.hashCode();
        String $r2 = this.message;
        int $i1 = $r2.hashCode();
        int $i02 = (($i0 * 31) + $i1) * 31;
        boolean $z0 = this.otpSent;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i12 = i;
        int $i03 = ($i02 + $i12) * 31;
        boolean $z02 = this.status;
        int $i13 = $z02 ? 1 : $z02 ? 1 : 0;
        return $i03 + $i13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("BvnVerificationResponse(data=");
        UserProfileResponse $r3 = this.data;
        $r2.append($r3);
        $r2.append(", message=");
        String $r1 = this.message;
        $r2.append($r1);
        $r2.append(", otpSent=");
        boolean $z0 = this.otpSent;
        $r2.append($z0);
        $r2.append(", status=");
        boolean $z02 = this.status;
        $r2.append($z02);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
