package ai.kudi.agent.register.p022v2.p023ui.viewModels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: EmailVerificationViewData.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/data/EmailVerificationViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isSendingOtp", "", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "verificationError", "Lai/kudi/agent/register/v2/ui/viewModels/data/VerificationError;", "(ZLai/kudi/agent/register/domain/dto/OtpVerificationModel;Lai/kudi/agent/register/v2/ui/viewModels/data/VerificationError;)V", "()Z", "getOtpVerificationModel", "()Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "getVerificationError", "()Lai/kudi/agent/register/v2/ui/viewModels/data/VerificationError;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.data.EmailVerificationViewData */
/* loaded from: classes.dex */
public final class EmailVerificationViewData implements ViewData {
    private final boolean isSendingOtp;
    private final OtpVerificationModel otpVerificationModel;
    private final VerificationError verificationError;

    public EmailVerificationViewData() {
        this(false, null, null, 7, null);
    }

    public EmailVerificationViewData(boolean z, OtpVerificationModel otpVerificationModel, VerificationError verificationError) {
        this.isSendingOtp = z;
        this.otpVerificationModel = otpVerificationModel;
        this.verificationError = verificationError;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EmailVerificationViewData(boolean r2, ai.kudi.agent.register.domain.wiki.OtpVerificationModel r3, ai.kudi.agent.register.p022v2.p023ui.viewModels.data.VerificationError r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.viewModels.data.EmailVerificationViewData.<init>(boolean, ai.kudi.agent.register.domain.wiki.OtpVerificationModel, ai.kudi.agent.register.v2.ui.viewModels.data.VerificationError, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ EmailVerificationViewData copy$default(EmailVerificationViewData emailVerificationViewData, boolean $z0, OtpVerificationModel $r1, VerificationError $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = emailVerificationViewData.isSendingOtp;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = emailVerificationViewData.otpVerificationModel;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = emailVerificationViewData.verificationError;
        }
        EmailVerificationViewData $r0 = emailVerificationViewData.copy($z0, $r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isSendingOtp;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OtpVerificationModel component2() {
        OtpVerificationModel r1 = this.otpVerificationModel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VerificationError component3() {
        VerificationError r1 = this.verificationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EmailVerificationViewData copy(boolean z, OtpVerificationModel otpVerificationModel, VerificationError verificationError) {
        EmailVerificationViewData $r0 = new EmailVerificationViewData(z, otpVerificationModel, verificationError);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof EmailVerificationViewData;
        if ($z0) {
            EmailVerificationViewData $r2 = (EmailVerificationViewData) obj;
            boolean $z02 = this.isSendingOtp;
            boolean $z1 = $r2.isSendingOtp;
            if ($z02 != $z1) {
                return false;
            }
            OtpVerificationModel $r3 = this.otpVerificationModel;
            OtpVerificationModel $r4 = $r2.otpVerificationModel;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                VerificationError $r5 = this.verificationError;
                VerificationError $r6 = $r2.verificationError;
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
    public final OtpVerificationModel getOtpVerificationModel() {
        OtpVerificationModel r1 = this.otpVerificationModel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VerificationError getVerificationError() {
        VerificationError r1 = this.verificationError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.isSendingOtp;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        OtpVerificationModel $r1 = this.otpVerificationModel;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        VerificationError $r2 = this.verificationError;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        return $i02 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isSendingOtp() {
        boolean z0 = this.isSendingOtp;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("EmailVerificationViewData(isSendingOtp=");
        boolean $z0 = this.isSendingOtp;
        $r2.append($z0);
        $r2.append(", otpVerificationModel=");
        OtpVerificationModel $r3 = this.otpVerificationModel;
        $r2.append($r3);
        $r2.append(", verificationError=");
        VerificationError $r4 = this.verificationError;
        $r2.append($r4);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
