package ai.kudi.agent.login.setup.viewModels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: NewDeviceVerificationViewData.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/login/setup/viewModels/data/NewDeviceVerificationViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "otpVerificationData", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "(ZLai/kudi/agent/register/domain/dto/OtpVerificationModel;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "getOtpVerificationData", "()Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NewDeviceVerificationViewData implements ViewData {
    private final String error;
    private final boolean isLoading;
    private final OtpVerificationModel otpVerificationData;

    public NewDeviceVerificationViewData() {
        this(false, null, null, 7, null);
    }

    public NewDeviceVerificationViewData(boolean z, OtpVerificationModel otpVerificationModel, String str) {
        this.isLoading = z;
        this.otpVerificationData = otpVerificationModel;
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
    public /* synthetic */ NewDeviceVerificationViewData(boolean r2, ai.kudi.agent.register.domain.wiki.OtpVerificationModel r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.setup.viewModels.data.NewDeviceVerificationViewData.<init>(boolean, ai.kudi.agent.register.domain.wiki.OtpVerificationModel, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ NewDeviceVerificationViewData copy$default(NewDeviceVerificationViewData newDeviceVerificationViewData, boolean $z0, OtpVerificationModel $r1, String $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = newDeviceVerificationViewData.isLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = newDeviceVerificationViewData.otpVerificationData;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = newDeviceVerificationViewData.error;
        }
        NewDeviceVerificationViewData $r0 = newDeviceVerificationViewData.copy($z0, $r1, $r2);
        return $r0;
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
    public final OtpVerificationModel component2() {
        OtpVerificationModel r1 = this.otpVerificationData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NewDeviceVerificationViewData copy(boolean z, OtpVerificationModel otpVerificationModel, String str) {
        NewDeviceVerificationViewData $r0 = new NewDeviceVerificationViewData(z, otpVerificationModel, str);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof NewDeviceVerificationViewData;
        if ($z0) {
            NewDeviceVerificationViewData $r2 = (NewDeviceVerificationViewData) obj;
            boolean $z02 = this.isLoading;
            boolean $z1 = $r2.isLoading;
            if ($z02 != $z1) {
                return false;
            }
            OtpVerificationModel $r3 = this.otpVerificationData;
            OtpVerificationModel $r4 = $r2.otpVerificationData;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                String $r5 = this.error;
                String $r6 = $r2.error;
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
    public final String getError() {
        String r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OtpVerificationModel getOtpVerificationData() {
        OtpVerificationModel r1 = this.otpVerificationData;
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
        OtpVerificationModel $r1 = this.otpVerificationData;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        String $r2 = this.error;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        return $i02 + $i12;
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
        $r2.append("NewDeviceVerificationViewData(isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", otpVerificationData=");
        OtpVerificationModel $r3 = this.otpVerificationData;
        $r2.append($r3);
        $r2.append(", error=");
        String $r1 = this.error;
        $r2.append((Object) $r1);
        $r2.append(')');
        String $r12 = $r2.toString();
        return $r12;
    }
}
