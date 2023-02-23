package ai.kudi.agent.p2p.viewmodels;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.users.data.model.LookUpUserRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: P2pNameAndPhoneViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneNoViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isAccountNameLoading", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneNoError;", "lookUpUserRequest", "Lai/kudi/agent/users/data/model/LookUpUserRequest;", "(ZLai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneNoError;Lai/kudi/agent/users/data/model/LookUpUserRequest;)V", "getError", "()Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneNoError;", "()Z", "getLookUpUserRequest", "()Lai/kudi/agent/users/data/model/LookUpUserRequest;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pNameAndPhoneNoViewData implements ViewData {
    private final P2pNameAndPhoneNoError error;
    private final boolean isAccountNameLoading;
    private final LookUpUserRequest lookUpUserRequest;

    public P2pNameAndPhoneNoViewData() {
        this(false, null, null, 7, null);
    }

    public P2pNameAndPhoneNoViewData(boolean z, P2pNameAndPhoneNoError p2pNameAndPhoneNoError, LookUpUserRequest lookUpUserRequest) {
        this.isAccountNameLoading = z;
        this.error = p2pNameAndPhoneNoError;
        this.lookUpUserRequest = lookUpUserRequest;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ P2pNameAndPhoneNoViewData(boolean r2, ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneNoError r3, ai.kudi.agent.users.data.model.LookUpUserRequest r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneNoViewData.<init>(boolean, ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneNoError, ai.kudi.agent.users.data.model.LookUpUserRequest, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ P2pNameAndPhoneNoViewData copy$default(P2pNameAndPhoneNoViewData p2pNameAndPhoneNoViewData, boolean $z0, P2pNameAndPhoneNoError $r1, LookUpUserRequest $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = p2pNameAndPhoneNoViewData.isAccountNameLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = p2pNameAndPhoneNoViewData.error;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = p2pNameAndPhoneNoViewData.lookUpUserRequest;
        }
        P2pNameAndPhoneNoViewData $r0 = p2pNameAndPhoneNoViewData.copy($z0, $r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.isAccountNameLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final P2pNameAndPhoneNoError component2() {
        P2pNameAndPhoneNoError r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LookUpUserRequest component3() {
        LookUpUserRequest r1 = this.lookUpUserRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final P2pNameAndPhoneNoViewData copy(boolean z, P2pNameAndPhoneNoError p2pNameAndPhoneNoError, LookUpUserRequest lookUpUserRequest) {
        P2pNameAndPhoneNoViewData $r0 = new P2pNameAndPhoneNoViewData(z, p2pNameAndPhoneNoError, lookUpUserRequest);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof P2pNameAndPhoneNoViewData;
        if ($z0) {
            P2pNameAndPhoneNoViewData $r2 = (P2pNameAndPhoneNoViewData) obj;
            boolean $z02 = this.isAccountNameLoading;
            boolean $z1 = $r2.isAccountNameLoading;
            if ($z02 != $z1) {
                return false;
            }
            P2pNameAndPhoneNoError $r3 = this.error;
            P2pNameAndPhoneNoError $r4 = $r2.error;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                LookUpUserRequest $r5 = this.lookUpUserRequest;
                LookUpUserRequest $r6 = $r2.lookUpUserRequest;
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
    public final P2pNameAndPhoneNoError getError() {
        P2pNameAndPhoneNoError r1 = this.error;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LookUpUserRequest getLookUpUserRequest() {
        LookUpUserRequest r1 = this.lookUpUserRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.isAccountNameLoading;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        P2pNameAndPhoneNoError $r1 = this.error;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        LookUpUserRequest $r2 = this.lookUpUserRequest;
        int $i12 = $r2 != null ? $r2.hashCode() : 0;
        return $i02 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isAccountNameLoading() {
        boolean z0 = this.isAccountNameLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("P2pNameAndPhoneNoViewData(isAccountNameLoading=");
        boolean $z0 = this.isAccountNameLoading;
        $r2.append($z0);
        $r2.append(", error=");
        P2pNameAndPhoneNoError $r3 = this.error;
        $r2.append($r3);
        $r2.append(", lookUpUserRequest=");
        LookUpUserRequest $r4 = this.lookUpUserRequest;
        $r2.append($r4);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
