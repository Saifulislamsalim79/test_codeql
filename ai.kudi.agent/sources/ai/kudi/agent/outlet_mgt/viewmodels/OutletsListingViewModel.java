package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletForHq;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletsListingViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J \u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletsListingViewData;", "fetchOutletForHq", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletForHq;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/useCases/FetchOutletForHq;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "outletStatusMap", "", "", "getOutletStatusMap", "()Ljava/util/Map;", "page", "", "shouldLoadNext", "", "addOutletClicked", "", "initialData", "loadNext", TransactionField.STATUS, "isLoading", "isNextLoading", "logOnFilterClicked", "user", "Lai/kudi/agent/users/domain/dto/User;", "statusBoolean", "newOutletClicked", "outletType", "onOutletItemSelected", "outletId", "OutletListingError", "OutletsListingViewData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletsListingViewModel extends BaseViewModel<OutletsListingViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchOutletForHq fetchOutletForHq;
    private final Map<String, String> outletStatusMap;
    private int page;
    private boolean shouldLoadNext;

    /* compiled from: OutletsListingViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletListingError;", "", MetricTracker.Object.MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OutletListingError {
        private final String message;

        public OutletListingError() {
            this(null, 1, null);
        }

        public OutletListingError(String str) {
            this.message = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ OutletListingError(java.lang.String r1, int r2, kotlin.p483e0.p485d.DBUtils$1 r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L5
                r1 = 0
            L5:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel.OutletListingError.<init>(java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ OutletListingError copy$default(OutletListingError outletListingError, String $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = outletListingError.message;
            }
            OutletListingError $r1 = outletListingError.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletListingError copy(String str) {
            OutletListingError $r0 = new OutletListingError(str);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof OutletListingError;
            if ($z0) {
                OutletListingError $r2 = (OutletListingError) obj;
                String $r3 = this.message;
                String $r4 = $r2.message;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
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
        public int hashCode() {
            String $r1 = this.message;
            if ($r1 == null) {
                return 0;
            }
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("OutletListingError(message=");
            String $r1 = this.message;
            $r2.append((Object) $r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    /* compiled from: OutletsListingViewModel.kt */
    @Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletsListingViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "isNextLoading", "outletListingResponse", "", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "isOnPaginated", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletListingError;", "(ZZLjava/util/List;ZLai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletListingError;)V", "getError", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletListingError;", "()Z", "getOutletListingResponse", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OutletsListingViewData implements ViewData {
        private final OutletListingError error;
        private final boolean isLoading;
        private final boolean isNextLoading;
        private final boolean isOnPaginated;
        private final List<Outlet> outletListingResponse;

        public OutletsListingViewData() {
            this(false, false, null, false, null, 31, null);
        }

        public OutletsListingViewData(boolean z, boolean z2, List list, boolean z3, OutletListingError outletListingError) {
            this.isLoading = z;
            this.isNextLoading = z2;
            this.outletListingResponse = list;
            this.isOnPaginated = z3;
            this.error = outletListingError;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ OutletsListingViewData(boolean r9, boolean r10, java.util.List r11, boolean r12, ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel.OutletListingError r13, int r14, kotlin.p483e0.p485d.DBUtils$1 r15) {
            /*
                r8 = this;
                r6 = r14 & 1
                r7 = 0
                if (r6 == 0) goto L7
                r9 = 0
                goto L7
            L7:
                r6 = r14 & 2
                if (r6 == 0) goto Ld
                r10 = 0
                goto Ld
            Ld:
                r6 = r14 & 4
                if (r6 == 0) goto L13
                r11 = 0
                goto L13
            L13:
                r6 = r14 & 8
                if (r6 == 0) goto L18
                goto L19
            L18:
                r7 = r12
            L19:
                r14 = r14 & 16
                if (r14 == 0) goto L1f
                r13 = 0
                goto L1f
            L1f:
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r7
                r5 = r13
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel.OutletsListingViewData.<init>(boolean, boolean, java.util.List, boolean, ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel$OutletListingError, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ OutletsListingViewData copy$default(OutletsListingViewData outletsListingViewData, boolean $z1, boolean $z2, List $r0, boolean $z0, OutletListingError $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z1 = outletsListingViewData.isLoading;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $z2 = outletsListingViewData.isNextLoading;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r0 = outletsListingViewData.outletListingResponse;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $z0 = outletsListingViewData.isOnPaginated;
            }
            int $i0 = i & 16;
            if ($i0 != 0) {
                $r2 = outletsListingViewData.error;
            }
            OutletsListingViewData $r1 = outletsListingViewData.copy($z1, $z2, $r0, $z0, $r2);
            return $r1;
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
        public final boolean component2() {
            boolean z0 = this.isNextLoading;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component3() {
            List r1 = this.outletListingResponse;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component4() {
            boolean z0 = this.isOnPaginated;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletListingError component5() {
            OutletListingError r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletsListingViewData copy(boolean z, boolean z2, List list, boolean z3, OutletListingError outletListingError) {
            OutletsListingViewData $r0 = new OutletsListingViewData(z, z2, list, z3, outletListingError);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof OutletsListingViewData;
            if ($z0) {
                OutletsListingViewData $r2 = (OutletsListingViewData) obj;
                boolean $z02 = this.isLoading;
                boolean $z1 = $r2.isLoading;
                if ($z02 != $z1) {
                    return false;
                }
                boolean $z03 = this.isNextLoading;
                boolean $z12 = $r2.isNextLoading;
                if ($z03 != $z12) {
                    return false;
                }
                List $r3 = this.outletListingResponse;
                List $r4 = $r2.outletListingResponse;
                boolean $z04 = Log_OC.append($r3, $r4);
                if ($z04) {
                    boolean $z05 = this.isOnPaginated;
                    boolean $z13 = $r2.isOnPaginated;
                    if ($z05 != $z13) {
                        return false;
                    }
                    OutletListingError $r5 = this.error;
                    OutletListingError $r6 = $r2.error;
                    boolean $z06 = Log_OC.append($r5, $r6);
                    return $z06;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletListingError getError() {
            OutletListingError r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getOutletListingResponse() {
            List r1 = this.outletListingResponse;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            boolean $z0 = this.isLoading;
            if ($z0) {
                $z0 = true;
            }
            int $i0 = $z0 ? 1 : 0;
            int $i02 = $i0 * 31;
            boolean $z02 = this.isNextLoading;
            int i = $z02;
            if ($z02 != 0) {
                i = 1;
            }
            int $i1 = i;
            int $i12 = ($i02 + $i1) * 31;
            List $r1 = this.outletListingResponse;
            int $i2 = $r1 == null ? 0 : $r1.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            boolean $z03 = this.isOnPaginated;
            int $i22 = $z03 ? 1 : $z03 ? 1 : 0;
            int $i14 = ($i13 + $i22) * 31;
            OutletListingError $r2 = this.error;
            int $i03 = $r2 != null ? $r2.hashCode() : 0;
            return $i14 + $i03;
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
        public final boolean isNextLoading() {
            boolean z0 = this.isNextLoading;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean isOnPaginated() {
            boolean z0 = this.isOnPaginated;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("OutletsListingViewData(isLoading=");
            boolean $z0 = this.isLoading;
            $r2.append($z0);
            $r2.append(", isNextLoading=");
            boolean $z02 = this.isNextLoading;
            $r2.append($z02);
            $r2.append(", outletListingResponse=");
            List $r3 = this.outletListingResponse;
            $r2.append($r3);
            $r2.append(", isOnPaginated=");
            boolean $z03 = this.isOnPaginated;
            $r2.append($z03);
            $r2.append(", error=");
            OutletListingError $r4 = this.error;
            $r2.append($r4);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletsListingViewModel(FetchOutletForHq fetchOutletForHq, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Map $r9;
        Log_OC.getArray(fetchOutletForHq, "fetchOutletForHq");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchOutletForHq = fetchOutletForHq;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.shouldLoadNext = true;
        C13287o[] $r4 = new C13287o[4];
        C13287o $r5 = C13664u.m4227a("All Outlets", "ALL");
        $r4[0] = $r5;
        STATUS $r6 = STATUS.APPROVED;
        String $r7 = $r6.name();
        if ($r7 == null) {
            NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r10;
        }
        Locale $r8 = Locale.ROOT;
        String $r72 = $r7.toLowerCase($r8);
        Log_OC.loadImage($r72, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        C13287o $r52 = C13664u.m4227a("Approved Outlets", $r72);
        $r4[1] = $r52;
        STATUS $r62 = STATUS.PENDING;
        String $r73 = $r62.name();
        if ($r73 == null) {
            NullPointerException $r102 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r102;
        }
        Locale $r82 = Locale.ROOT;
        String $r74 = $r73.toLowerCase($r82);
        Log_OC.loadImage($r74, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        C13287o $r53 = C13664u.m4227a("Pending Linking", $r74);
        $r4[2] = $r53;
        STATUS $r63 = STATUS.SUSPENDED;
        String $r75 = $r63.name();
        if ($r75 == null) {
            NullPointerException $r103 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r103;
        }
        Locale $r83 = Locale.ROOT;
        String $r76 = $r75.toLowerCase($r83);
        Log_OC.loadImage($r76, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        C13287o $r54 = C13664u.m4227a("Suspended Outlets", $r76);
        $r4[3] = $r54;
        $r9 = C13727r0.m3878n($r4);
        this.outletStatusMap = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addOutletClicked$lambda-3 */
    public static final void m39968addOutletClicked$lambda3(OutletsListingViewModel outletsListingViewModel, User user) {
        Log_OC.getArray(outletsListingViewModel, "this$0");
        Analytics $r3 = outletsListingViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onAddOutletClicked($r0, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void loadNext$default(OutletsListingViewModel outletsListingViewModel, String $r2, boolean z, boolean z2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "";
        }
        outletsListingViewModel.loadNext($r2, z, z2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: loadNext$lambda-0 */
    public static final InterfaceC11692s m39970loadNext$lambda0(C11812w c11812w, OutletsListingViewModel outletsListingViewModel, String str, User user) {
        Map $r7;
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(outletsListingViewModel, "this$0");
        Log_OC.getArray(str, "$status");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        int $i0 = outletsListingViewModel.page;
        String $r5 = String.valueOf($i0);
        C13287o $r6 = C13664u.m4227a("page", $r5);
        C13287o $r62 = C13664u.m4227a("size", "15");
        String $r2 = str.toUpperCase();
        Log_OC.loadImage($r2, "(this as java.lang.String).toUpperCase()");
        C13287o $r63 = C13664u.m4227a(TransactionField.STATUS, $r2);
        C13287o[] $r4 = {$r6, $r62, $r63};
        $r7 = C13727r0.m3878n($r4);
        FetchOutletForHq $r8 = outletsListingViewModel.fetchOutletForHq;
        String $r22 = user.getSessionId();
        Log_OC.loadImage($r22, "it.sessionId");
        AbstractC11688p $r9 = $r8.execute($r7, $r22);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-1 */
    public static final void m39971loadNext$lambda1(OutletsListingViewModel outletsListingViewModel, String str, C11812w c11812w, C11812w c11812w2, boolean z, List list) {
        Log_OC.getArray(outletsListingViewModel, "this$0");
        Log_OC.getArray(str, "$status");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(c11812w2, "$outlets");
        Object $r5 = c11812w.f26499c;
        User $r6 = (User) $r5;
        outletsListingViewModel.logOnFilterClicked(str, $r6, true);
        Object $r52 = c11812w2.f26499c;
        List $r7 = (List) $r52;
        boolean $z1 = $r7.isEmpty();
        if ($z1 && z) {
            outletsListingViewModel.shouldLoadNext = false;
        }
        Object $r53 = c11812w2.f26499c;
        List $r72 = (List) $r53;
        Log_OC.loadImage(list, "response");
        $r72.addAll(list);
        int $i0 = outletsListingViewModel.page;
        outletsListingViewModel.page = $i0 + 1;
        ViewData $r8 = outletsListingViewModel.getState();
        OutletsListingViewData $r9 = (OutletsListingViewData) $r8;
        Object $r54 = c11812w2.f26499c;
        List $r2 = (List) $r54;
        outletsListingViewModel.publish(OutletsListingViewData.copy$default($r9, false, false, $r2, false, null, 24, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-2 */
    public static final void m39972loadNext$lambda2(OutletsListingViewModel outletsListingViewModel, String str, C11812w c11812w, Throwable th) {
        Log_OC.getArray(outletsListingViewModel, "this$0");
        Log_OC.getArray(str, "$status");
        Log_OC.getArray(c11812w, "$user");
        Object $r5 = c11812w.f26499c;
        User $r6 = (User) $r5;
        outletsListingViewModel.logOnFilterClicked(str, $r6, false);
        ViewData $r7 = outletsListingViewModel.getState();
        OutletsListingViewData $r8 = (OutletsListingViewData) $r7;
        InterfaceC11767l $r9 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please refresh", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r52 = $r9.invoke(th);
        String $r3 = (String) $r52;
        OutletListingError $r2 = new OutletListingError($r3);
        outletsListingViewModel.publish(OutletsListingViewData.copy$default($r8, false, false, null, false, $r2, 12, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logOnFilterClicked(String str, User user, boolean z) {
        boolean $z1;
        int $i0 = this.page;
        if ($i0 == 0) {
            $z1 = C13276s.m5440u(str);
            if (!(!$z1) || user == null) {
                return;
            }
            Analytics $r3 = this.analytics;
            String $r1 = user.getPhoneNumber();
            Log_OC.loadImage($r1, "it.phoneNumber");
            $r3.onOutletFilterClicked($r1, z);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: newOutletClicked$lambda-5 */
    public static final void m39973newOutletClicked$lambda5(OutletsListingViewModel outletsListingViewModel, String str, User user) {
        Log_OC.getArray(outletsListingViewModel, "this$0");
        Log_OC.getArray(str, "$outletType");
        Analytics $r4 = outletsListingViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onOutletTypeClicked($r1, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onOutletItemSelected$lambda-7 */
    public static final void m39975onOutletItemSelected$lambda7(OutletsListingViewModel outletsListingViewModel, String str, User user) {
        Log_OC.getArray(outletsListingViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Analytics $r4 = outletsListingViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onSelectOutletItem($r1, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addOutletClicked() {
        C11280b $r1 = getCompositeDisposable();
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletsListingViewModel $r12 = OutletsListingViewModel.this;
                User $r32 = (User) obj;
                OutletsListingViewModel.m39968addOutletClicked$lambda3($r12, $r32);
            }
        };
        HttpStatus $r5 = HttpStatus.SYNCHRONIZED;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        $r1.b($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getOutletStatusMap() {
        Map r1 = this.outletStatusMap;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OutletsListingViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OutletsListingViewData initialData() {
        OutletsListingViewData $r1 = new OutletsListingViewData(false, false, null, false, null, 31, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [T, java.util.ArrayList] */
    public final void loadNext(final String str, boolean z, final boolean z2) {
        Log_OC.getArray(str, TransactionField.STATUS);
        boolean $z2 = this.shouldLoadNext;
        if ($z2) {
            ViewData $r3 = getState();
            OutletsListingViewData $r4 = (OutletsListingViewData) $r3;
            publish(OutletsListingViewData.copy$default($r4, z, z2, null, false, null, 12, null));
            final C11812w $r2 = new C11812w();
            final C11812w r17 = new C11812w();
            ViewData $r32 = getState();
            OutletsListingViewData $r42 = (OutletsListingViewData) $r32;
            List $r6 = $r42.getOutletListingResponse();
            ArrayList m3823D0 = $r6 == null ? null : C13742z.m3823D0($r6);
            if (m3823D0 == null) {
                m3823D0 = $r8;
                ArrayList $r8 = new ArrayList();
            }
            r17.f26499c = m3823D0;
            if (z) {
                this.page = 0;
                r17.f26499c = new ArrayList();
            }
            ViewData $r33 = getState();
            OutletsListingViewData $r43 = (OutletsListingViewData) $r33;
            int $i0 = this.page;
            publish(OutletsListingViewData.copy$default($r43, false, false, null, $i0 != 0, null, 23, null));
            FetchCurrentUser $r9 = this.fetchCurrentUser;
            AbstractC11696w $r10 = FetchCurrentUser.execute$default($r9, null, null, 3, null);
            AbstractC11688p $r12 = $r10.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    C11812w $r1 = C11812w.this;
                    OutletsListingViewModel $r22 = this;
                    String $r34 = str;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r44 = OutletsListingViewModel.m39970loadNext$lambda0($r1, $r22, $r34, $r62);
                    return $r44;
                }
            });
            FavoritesArrayAdapter $r15 = $r12.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.a
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletsListingViewModel $r22 = OutletsListingViewModel.this;
                    String $r34 = str;
                    C11812w $r44 = $r2;
                    C11812w $r5 = r17;
                    boolean $z0 = z2;
                    List $r62 = (List) obj;
                    OutletsListingViewModel.m39971loadNext$lambda1($r22, $r34, $r44, $r5, $z0, $r62);
                }
            }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Cubic
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletsListingViewModel $r1 = OutletsListingViewModel.this;
                    String $r22 = str;
                    C11812w $r34 = $r2;
                    Throwable $r5 = (Throwable) obj;
                    OutletsListingViewModel.m39972loadNext$lambda2($r1, $r22, $r34, $r5);
                }
            });
            Log_OC.loadImage($r15, "fetchCurrentUser.execute().flatMapObservable {\n            user = it\n            val queryParams = mapOf(\n                \"page\" to page.toString(),\n                \"size\" to \"15\", \"status\" to status.toUpperCase()\n            )\n            fetchOutletForHq.execute(queryParams, it.sessionId)\n        }.subscribe(\n            { response ->\n                logOnFilterClicked(status, user, true)\n                if (outlets.isEmpty() && isNextLoading) shouldLoadNext = false\n                outlets.addAll(response)\n                page++\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        isNextLoading = false,\n                        outletListingResponse = outlets\n                    )\n                )\n            },\n            {\n                logOnFilterClicked(status, user, false)\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        isNextLoading = false,\n                        error = OutletListingError(\n                            parseHttpError2(\"Something went wrong, please refresh\")(it)\n                        )\n                    )\n                )\n            }\n        )");
            C11280b $r16 = getCompositeDisposable();
            RxExtKt.addTo($r15, $r16);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void newOutletClicked(final String str) {
        Log_OC.getArray(str, "outletType");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.PlotStatistics
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletsListingViewModel $r1 = OutletsListingViewModel.this;
                String $r22 = str;
                User $r4 = (User) obj;
                OutletsListingViewModel.m39973newOutletClicked$lambda5($r1, $r22, $r4);
            }
        };
        Namespace $r5 = Namespace.XML_NAMESPACE;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onOutletTypeClicked(\n                    it.phoneNumber,\n                    outletType\n                )\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOutletItemSelected(final String str) {
        Log_OC.getArray(str, "outletId");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletsListingViewModel $r1 = OutletsListingViewModel.this;
                String $r22 = str;
                User $r4 = (User) obj;
                OutletsListingViewModel.m39975onOutletItemSelected$lambda7($r1, $r22, $r4);
            }
        };
        Subscription $r5 = Subscription.subscribed;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onSelectOutletItem(it.phoneNumber, outletId)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }
}
