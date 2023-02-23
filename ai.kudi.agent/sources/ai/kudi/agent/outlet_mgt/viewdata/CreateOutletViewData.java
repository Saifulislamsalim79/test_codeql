package ai.kudi.agent.outlet_mgt.viewdata;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CreateOutletViewData.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewdata/CreateOutletViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "createOutletError", "Lai/kudi/agent/outlet_mgt/viewdata/CreateOutletError;", "stateAndLgaData", "Lai/kudi/agent/outlet_mgt/viewdata/StateAndLgaData;", "userProfileResponse", "Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "(ZLai/kudi/agent/outlet_mgt/viewdata/CreateOutletError;Lai/kudi/agent/outlet_mgt/viewdata/StateAndLgaData;Lai/kudi/agent/settings/domain/dto/UserProfileResponse;)V", "getCreateOutletError", "()Lai/kudi/agent/outlet_mgt/viewdata/CreateOutletError;", "()Z", "getStateAndLgaData", "()Lai/kudi/agent/outlet_mgt/viewdata/StateAndLgaData;", "getUserProfileResponse", "()Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateOutletViewData implements ViewData {
    private final CreateOutletError createOutletError;
    private final boolean isLoading;
    private final StateAndLgaData stateAndLgaData;
    private final UserProfileResponse userProfileResponse;

    public CreateOutletViewData() {
        this(false, null, null, null, 15, null);
    }

    public CreateOutletViewData(boolean z, CreateOutletError createOutletError, StateAndLgaData stateAndLgaData, UserProfileResponse userProfileResponse) {
        this.isLoading = z;
        this.createOutletError = createOutletError;
        this.stateAndLgaData = stateAndLgaData;
        this.userProfileResponse = userProfileResponse;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CreateOutletViewData(boolean r2, ai.kudi.agent.outlet_mgt.viewdata.CreateOutletError r3, ai.kudi.agent.outlet_mgt.viewdata.StateAndLgaData r4, ai.kudi.agent.settings.domain.package_4.UserProfileResponse r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
        /*
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L5
            r2 = 0
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewdata.CreateOutletViewData.<init>(boolean, ai.kudi.agent.outlet_mgt.viewdata.CreateOutletError, ai.kudi.agent.outlet_mgt.viewdata.StateAndLgaData, ai.kudi.agent.settings.domain.package_4.UserProfileResponse, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ CreateOutletViewData copy$default(CreateOutletViewData createOutletViewData, boolean $z0, CreateOutletError $r1, StateAndLgaData $r2, UserProfileResponse $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = createOutletViewData.isLoading;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = createOutletViewData.createOutletError;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r2 = createOutletViewData.stateAndLgaData;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r3 = createOutletViewData.userProfileResponse;
        }
        CreateOutletViewData $r0 = createOutletViewData.copy($z0, $r1, $r2, $r3);
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
    public final CreateOutletError component2() {
        CreateOutletError r1 = this.createOutletError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final StateAndLgaData component3() {
        StateAndLgaData r1 = this.stateAndLgaData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserProfileResponse component4() {
        UserProfileResponse r1 = this.userProfileResponse;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CreateOutletViewData copy(boolean z, CreateOutletError createOutletError, StateAndLgaData stateAndLgaData, UserProfileResponse userProfileResponse) {
        CreateOutletViewData $r0 = new CreateOutletViewData(z, createOutletError, stateAndLgaData, userProfileResponse);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof CreateOutletViewData;
        if ($z0) {
            CreateOutletViewData $r2 = (CreateOutletViewData) obj;
            boolean $z02 = this.isLoading;
            boolean $z1 = $r2.isLoading;
            if ($z02 != $z1) {
                return false;
            }
            CreateOutletError $r3 = this.createOutletError;
            CreateOutletError $r4 = $r2.createOutletError;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                StateAndLgaData $r5 = this.stateAndLgaData;
                StateAndLgaData $r6 = $r2.stateAndLgaData;
                boolean $z04 = Log_OC.append($r5, $r6);
                if ($z04) {
                    UserProfileResponse $r7 = this.userProfileResponse;
                    UserProfileResponse $r8 = $r2.userProfileResponse;
                    boolean $z05 = Log_OC.append($r7, $r8);
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
    public final CreateOutletError getCreateOutletError() {
        CreateOutletError r1 = this.createOutletError;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final StateAndLgaData getStateAndLgaData() {
        StateAndLgaData r1 = this.stateAndLgaData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserProfileResponse getUserProfileResponse() {
        UserProfileResponse r1 = this.userProfileResponse;
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
        CreateOutletError $r1 = this.createOutletError;
        int $i2 = $r1 == null ? 0 : $r1.hashCode();
        int $i02 = ($i0 + $i2) * 31;
        StateAndLgaData $r2 = this.stateAndLgaData;
        int $i22 = $r2 == null ? 0 : $r2.hashCode();
        int $i03 = ($i02 + $i22) * 31;
        UserProfileResponse $r3 = this.userProfileResponse;
        int $i12 = $r3 != null ? $r3.hashCode() : 0;
        return $i03 + $i12;
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
        $r2.append("CreateOutletViewData(isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", createOutletError=");
        CreateOutletError $r3 = this.createOutletError;
        $r2.append($r3);
        $r2.append(", stateAndLgaData=");
        StateAndLgaData $r4 = this.stateAndLgaData;
        $r2.append($r4);
        $r2.append(", userProfileResponse=");
        UserProfileResponse $r5 = this.userProfileResponse;
        $r2.append($r5);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
