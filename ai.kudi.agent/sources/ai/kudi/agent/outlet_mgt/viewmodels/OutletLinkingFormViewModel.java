package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.OutletLinkingRequest;
import ai.kudi.agent.outlet_mgt.data.OutletLinkingResponse;
import ai.kudi.agent.outlet_mgt.useCases.SubmitLinkingRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletLinkingFormViewModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\"\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0016\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormViewData;", "submitLinkingRequest", "Lai/kudi/agent/outlet_mgt/useCases/SubmitLinkingRequest;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/useCases/SubmitLinkingRequest;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "initialData", "isValidInputParams", "", "phoneNo", "", "pin", "logOutletLinkingFormClicked", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "phoneNumber", TransactionField.STATUS, "OutletLinkingFormError", "OutletLinkingFormViewData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletLinkingFormViewModel extends BaseViewModel<OutletLinkingFormViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final SubmitLinkingRequest submitLinkingRequest;

    /* compiled from: OutletLinkingFormViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormError;", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "phoneNumber", "pin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getPhoneNumber", "getPin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OutletLinkingFormError {
        private final String error;
        private final String name;
        private final String phoneNumber;

        public OutletLinkingFormError() {
            this(null, null, null, 7, null);
        }

        public OutletLinkingFormError(String str, String str2, String str3) {
            this.error = str;
            this.phoneNumber = str2;
            this.name = str3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ OutletLinkingFormError(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel.OutletLinkingFormError.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ OutletLinkingFormError copy$default(OutletLinkingFormError outletLinkingFormError, String $r1, String $r2, String $r3, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = outletLinkingFormError.error;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = outletLinkingFormError.phoneNumber;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = outletLinkingFormError.name;
            }
            OutletLinkingFormError $r0 = outletLinkingFormError.copy($r1, $r2, $r3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.phoneNumber;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.name;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletLinkingFormError copy(String str, String str2, String str3) {
            OutletLinkingFormError $r0 = new OutletLinkingFormError(str, str2, str3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof OutletLinkingFormError;
            if ($z0) {
                OutletLinkingFormError $r2 = (OutletLinkingFormError) obj;
                String $r3 = this.error;
                String $r4 = $r2.error;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.phoneNumber;
                    String $r42 = $r2.phoneNumber;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.name;
                        String $r43 = $r2.name;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        return $z04;
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
        public final String getError() {
            String r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getPhoneNumber() {
            String r1 = this.phoneNumber;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getPin() {
            String r1 = this.name;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.error;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.phoneNumber;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.name;
            int $i0 = $r13 != null ? $r13.hashCode() : 0;
            return $i13 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("OutletLinkingFormError(error=");
            String $r1 = this.error;
            $r2.append((Object) $r1);
            $r2.append(", phoneNumber=");
            String $r12 = this.phoneNumber;
            $r2.append((Object) $r12);
            $r2.append(", pin=");
            String $r13 = this.name;
            $r2.append((Object) $r13);
            $r2.append(')');
            String $r14 = $r2.toString();
            return $r14;
        }
    }

    /* compiled from: OutletLinkingFormViewModel.kt */
    @Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "showLoader", "", "outletLinkingResponse", "Lai/kudi/agent/outlet_mgt/data/OutletLinkingResponse;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormError;", "(ZLai/kudi/agent/outlet_mgt/data/OutletLinkingResponse;Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormError;)V", "getError", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormError;", "getOutletLinkingResponse", "()Lai/kudi/agent/outlet_mgt/data/OutletLinkingResponse;", "getShowLoader", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OutletLinkingFormViewData implements ViewData {
        private final OutletLinkingFormError error;
        private final OutletLinkingResponse outletLinkingResponse;
        private final boolean showLoader;

        public OutletLinkingFormViewData() {
            this(false, null, null, 7, null);
        }

        public OutletLinkingFormViewData(boolean z, OutletLinkingResponse outletLinkingResponse, OutletLinkingFormError outletLinkingFormError) {
            this.showLoader = z;
            this.outletLinkingResponse = outletLinkingResponse;
            this.error = outletLinkingFormError;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ OutletLinkingFormViewData(boolean r2, ai.kudi.agent.outlet_mgt.data.OutletLinkingResponse r3, ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel.OutletLinkingFormError r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel.OutletLinkingFormViewData.<init>(boolean, ai.kudi.agent.outlet_mgt.data.OutletLinkingResponse, ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel$OutletLinkingFormError, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ OutletLinkingFormViewData copy$default(OutletLinkingFormViewData outletLinkingFormViewData, boolean $z0, OutletLinkingResponse $r1, OutletLinkingFormError $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = outletLinkingFormViewData.showLoader;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = outletLinkingFormViewData.outletLinkingResponse;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = outletLinkingFormViewData.error;
            }
            OutletLinkingFormViewData $r0 = outletLinkingFormViewData.copy($z0, $r1, $r2);
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
        public final OutletLinkingResponse component2() {
            OutletLinkingResponse r1 = this.outletLinkingResponse;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletLinkingFormError component3() {
            OutletLinkingFormError r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletLinkingFormViewData copy(boolean z, OutletLinkingResponse outletLinkingResponse, OutletLinkingFormError outletLinkingFormError) {
            OutletLinkingFormViewData $r0 = new OutletLinkingFormViewData(z, outletLinkingResponse, outletLinkingFormError);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof OutletLinkingFormViewData;
            if ($z0) {
                OutletLinkingFormViewData $r2 = (OutletLinkingFormViewData) obj;
                boolean $z02 = this.showLoader;
                boolean $z1 = $r2.showLoader;
                if ($z02 != $z1) {
                    return false;
                }
                OutletLinkingResponse $r3 = this.outletLinkingResponse;
                OutletLinkingResponse $r4 = $r2.outletLinkingResponse;
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    OutletLinkingFormError $r5 = this.error;
                    OutletLinkingFormError $r6 = $r2.error;
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
        public final OutletLinkingFormError getError() {
            OutletLinkingFormError r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletLinkingResponse getOutletLinkingResponse() {
            OutletLinkingResponse r1 = this.outletLinkingResponse;
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
        public int hashCode() {
            boolean $z0 = this.showLoader;
            if ($z0) {
                $z0 = true;
            }
            int $i1 = $z0 ? 1 : 0;
            int $i0 = $i1 * 31;
            OutletLinkingResponse $r1 = this.outletLinkingResponse;
            int $i2 = $r1 == null ? 0 : $r1.hashCode();
            int $i02 = ($i0 + $i2) * 31;
            OutletLinkingFormError $r2 = this.error;
            int $i12 = $r2 != null ? $r2.hashCode() : 0;
            return $i02 + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("OutletLinkingFormViewData(showLoader=");
            boolean $z0 = this.showLoader;
            $r2.append($z0);
            $r2.append(", outletLinkingResponse=");
            OutletLinkingResponse $r3 = this.outletLinkingResponse;
            $r2.append($r3);
            $r2.append(", error=");
            OutletLinkingFormError $r4 = this.error;
            $r2.append($r4);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    public OutletLinkingFormViewModel(SubmitLinkingRequest submitLinkingRequest, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(submitLinkingRequest, "submitLinkingRequest");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        this.submitLinkingRequest = submitLinkingRequest;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isValidInputParams(String str, String str2) {
        boolean $z0;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r3 = getState();
            OutletLinkingFormViewData $r4 = (OutletLinkingFormViewData) $r3;
            OutletLinkingFormError $r5 = new OutletLinkingFormError(null, "Please enter outlet phone number", null, 5, null);
            publish(OutletLinkingFormViewData.copy$default($r4, false, null, $r5, 3, null));
            return false;
        }
        boolean $z02 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z02) {
            ViewData $r32 = getState();
            OutletLinkingFormViewData $r42 = (OutletLinkingFormViewData) $r32;
            OutletLinkingFormError $r52 = new OutletLinkingFormError(null, "Please enter a valid phone number", null, 5, null);
            publish(OutletLinkingFormViewData.copy$default($r42, false, null, $r52, 3, null));
            return false;
        }
        int $i0 = str2.length();
        boolean $z03 = $i0 == 0;
        if (!$z03) {
            int $i02 = str2.length();
            if ($i02 >= 4) {
                return true;
            }
        }
        ViewData $r33 = getState();
        OutletLinkingFormViewData $r43 = (OutletLinkingFormViewData) $r33;
        OutletLinkingFormError $r53 = new OutletLinkingFormError(null, null, "pin too short", 3, null);
        publish(OutletLinkingFormViewData.copy$default($r43, false, null, $r53, 3, null));
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logOutletLinkingFormClicked(User user, String str, boolean z) {
        if (user == null) {
            return;
        }
        Analytics $r2 = this.analytics;
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        $r2.onAddOutletFormClicked($r3, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: submitLinkingRequest$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39941submitLinkingRequest$lambda0(C11812w c11812w, OutletLinkingFormViewModel outletLinkingFormViewModel, String str, String str2, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(outletLinkingFormViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$pin");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        SubmitLinkingRequest $r5 = outletLinkingFormViewModel.submitLinkingRequest;
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "it.sessionId");
        OutletLinkingRequest $r7 = new OutletLinkingRequest(str, str2);
        AbstractC11688p $r8 = $r5.execute($r6, $r7);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLinkingRequest$lambda-1  reason: not valid java name */
    public static final void m39942submitLinkingRequest$lambda1(OutletLinkingFormViewModel outletLinkingFormViewModel, C11812w c11812w, String str, OutletLinkingResponse outletLinkingResponse) {
        Log_OC.getArray(outletLinkingFormViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$phoneNumber");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        outletLinkingFormViewModel.logOutletLinkingFormClicked($r5, str, true);
        ViewData $r6 = outletLinkingFormViewModel.getState();
        OutletLinkingFormViewData $r7 = (OutletLinkingFormViewData) $r6;
        outletLinkingFormViewModel.publish(OutletLinkingFormViewData.copy$default($r7, false, outletLinkingResponse, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLinkingRequest$lambda-2  reason: not valid java name */
    public static final void m39943submitLinkingRequest$lambda2(OutletLinkingFormViewModel outletLinkingFormViewModel, C11812w c11812w, String str, Throwable th) {
        Log_OC.getArray(outletLinkingFormViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$phoneNumber");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        outletLinkingFormViewModel.logOutletLinkingFormClicked($r5, str, false);
        ViewData $r6 = outletLinkingFormViewModel.getState();
        OutletLinkingFormViewData $r7 = (OutletLinkingFormViewData) $r6;
        outletLinkingFormViewModel.publish(OutletLinkingFormViewData.copy$default($r7, false, null, null, 6, null));
        ViewData $r62 = outletLinkingFormViewModel.getState();
        OutletLinkingFormViewData $r72 = (OutletLinkingFormViewData) $r62;
        InterfaceC11767l $r9 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r42 = $r9.invoke(th);
        String $r3 = (String) $r42;
        OutletLinkingFormError $r8 = new OutletLinkingFormError($r3, null, null, 6, null);
        outletLinkingFormViewModel.publish(OutletLinkingFormViewData.copy$default($r72, false, null, $r8, 3, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OutletLinkingFormViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OutletLinkingFormViewData initialData() {
        OutletLinkingFormViewData $r1 = new OutletLinkingFormViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitLinkingRequest(final String str, final String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "pin");
        final C11812w $r3 = new C11812w();
        boolean $z0 = isValidInputParams(str, str2);
        if ($z0) {
            ViewData $r4 = getState();
            OutletLinkingFormViewData $r5 = (OutletLinkingFormViewData) $r4;
            publish(OutletLinkingFormViewData.copy$default($r5, true, null, null, 6, null));
            FetchCurrentUser $r6 = this.currentUser;
            AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
            AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.g
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    C11812w $r1 = C11812w.this;
                    OutletLinkingFormViewModel $r2 = this;
                    String $r32 = str;
                    String $r42 = str2;
                    User $r72 = (User) obj;
                    InterfaceC11692s $r52 = OutletLinkingFormViewModel.m39941submitLinkingRequest$lambda0($r1, $r2, $r32, $r42, $r72);
                    return $r52;
                }
            });
            FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.LayoutManager
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletLinkingFormViewModel $r1 = OutletLinkingFormViewModel.this;
                    C11812w $r2 = $r3;
                    String $r32 = str;
                    OutletLinkingResponse $r52 = (OutletLinkingResponse) obj;
                    OutletLinkingFormViewModel.m39942submitLinkingRequest$lambda1($r1, $r2, $r32, $r52);
                }
            }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.h
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletLinkingFormViewModel $r1 = OutletLinkingFormViewModel.this;
                    C11812w $r2 = $r3;
                    String $r32 = str;
                    Throwable $r52 = (Throwable) obj;
                    OutletLinkingFormViewModel.m39943submitLinkingRequest$lambda2($r1, $r2, $r32, $r52);
                }
            });
            Log_OC.loadImage($r12, "currentUser.execute().flatMapObservable {\n                user = it\n                submitLinkingRequest.execute(it.sessionId, OutletLinkingRequest(phoneNumber, pin))\n            }.subscribe({ outletLinkingResponse ->\n                logOutletLinkingFormClicked(user, phoneNumber, true)\n                publish(\n                    state.copy(\n                        showLoader = false,\n                        outletLinkingResponse = outletLinkingResponse\n                    )\n                )\n            }, {\n                logOutletLinkingFormClicked(user, phoneNumber, false)\n                publish(state.copy(showLoader = false))\n                publish(\n                    state.copy(\n                        error = OutletLinkingFormError(\n                            error = parseHttpError2(\n                                \"Something went wrong, please retry\"\n                            )(it)\n                        )\n                    )\n                )\n            }\n            )");
            C11280b $r13 = getCompositeDisposable();
            RxExtKt.addTo($r12, $r13);
        }
    }
}
