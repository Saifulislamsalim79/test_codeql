package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.OutletDetails;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletDetails;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: ManageOutletViewModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel$ManageOutletViewData;", "fetchOutletDetails", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletDetails;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/useCases/FetchOutletDetails;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "initialData", "onSecuritySectionClicked", "", "onViewAccount", "outletPhoneNumber", "", "onViewProfile", OpsMetricTracker.START, "outletId", "ManageOutletViewData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ManageOutletViewModel extends BaseViewModel<ManageOutletViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchOutletDetails fetchOutletDetails;

    /* compiled from: ManageOutletViewModel.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel$ManageOutletViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", "outletDetails", "Lai/kudi/agent/outlet_mgt/data/OutletDetails;", "outletDetailsError", "", "(ZLai/kudi/agent/outlet_mgt/data/OutletDetails;Ljava/lang/String;)V", "()Z", "getOutletDetails", "()Lai/kudi/agent/outlet_mgt/data/OutletDetails;", "getOutletDetailsError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ManageOutletViewData implements ViewData {
        private final boolean isLoading;
        private final OutletDetails outletDetails;
        private final String outletDetailsError;

        public ManageOutletViewData() {
            this(false, null, null, 7, null);
        }

        public ManageOutletViewData(boolean z, OutletDetails outletDetails, String str) {
            this.isLoading = z;
            this.outletDetails = outletDetails;
            this.outletDetailsError = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ ManageOutletViewData(boolean r2, ai.kudi.agent.outlet_mgt.data.OutletDetails r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel.ManageOutletViewData.<init>(boolean, ai.kudi.agent.outlet_mgt.data.OutletDetails, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ ManageOutletViewData copy$default(ManageOutletViewData manageOutletViewData, boolean $z0, OutletDetails $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = manageOutletViewData.isLoading;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = manageOutletViewData.outletDetails;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = manageOutletViewData.outletDetailsError;
            }
            ManageOutletViewData $r0 = manageOutletViewData.copy($z0, $r1, $r2);
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
        public final OutletDetails component2() {
            OutletDetails r1 = this.outletDetails;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.outletDetailsError;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ManageOutletViewData copy(boolean z, OutletDetails outletDetails, String str) {
            ManageOutletViewData $r0 = new ManageOutletViewData(z, outletDetails, str);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof ManageOutletViewData;
            if ($z0) {
                ManageOutletViewData $r2 = (ManageOutletViewData) obj;
                boolean $z02 = this.isLoading;
                boolean $z1 = $r2.isLoading;
                if ($z02 != $z1) {
                    return false;
                }
                OutletDetails $r3 = this.outletDetails;
                OutletDetails $r4 = $r2.outletDetails;
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r5 = this.outletDetailsError;
                    String $r6 = $r2.outletDetailsError;
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
        public final OutletDetails getOutletDetails() {
            OutletDetails r1 = this.outletDetails;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getOutletDetailsError() {
            String r1 = this.outletDetailsError;
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
            OutletDetails $r1 = this.outletDetails;
            int $i2 = $r1 == null ? 0 : $r1.hashCode();
            int $i02 = ($i0 + $i2) * 31;
            String $r2 = this.outletDetailsError;
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
            $r2.append("ManageOutletViewData(isLoading=");
            boolean $z0 = this.isLoading;
            $r2.append($z0);
            $r2.append(", outletDetails=");
            OutletDetails $r3 = this.outletDetails;
            $r2.append($r3);
            $r2.append(", outletDetailsError=");
            String $r1 = this.outletDetailsError;
            $r2.append((Object) $r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    public ManageOutletViewModel(FetchOutletDetails fetchOutletDetails, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(fetchOutletDetails, "fetchOutletDetails");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchOutletDetails = fetchOutletDetails;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onSecuritySectionClicked$lambda-7  reason: not valid java name */
    public static final void m39927onSecuritySectionClicked$lambda7(ManageOutletViewModel manageOutletViewModel, User user) {
        Log_OC.getArray(manageOutletViewModel, "this$0");
        Analytics $r3 = manageOutletViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onClickOutletSecurity($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSecuritySectionClicked$lambda-8  reason: not valid java name */
    public static final void m39928onSecuritySectionClicked$lambda8(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewAccount$lambda-3  reason: not valid java name */
    public static final void m39929onViewAccount$lambda3(ManageOutletViewModel manageOutletViewModel, String str, User user) {
        Log_OC.getArray(manageOutletViewModel, "this$0");
        Log_OC.getArray(str, "$outletPhoneNumber");
        Analytics $r4 = manageOutletViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onViewOutletAccount($r1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewAccount$lambda-4  reason: not valid java name */
    public static final void m39930onViewAccount$lambda4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewProfile$lambda-5  reason: not valid java name */
    public static final void m39931onViewProfile$lambda5(ManageOutletViewModel manageOutletViewModel, String str, User user) {
        Log_OC.getArray(manageOutletViewModel, "this$0");
        Log_OC.getArray(str, "$outletPhoneNumber");
        Analytics $r4 = manageOutletViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onViewOutletProfile($r1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewProfile$lambda-6  reason: not valid java name */
    public static final void m39932onViewProfile$lambda6(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39933start$lambda0(ManageOutletViewModel manageOutletViewModel, String str, User user) {
        Log_OC.getArray(manageOutletViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(user, "it");
        FetchOutletDetails $r3 = manageOutletViewModel.fetchOutletDetails;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute(str, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m39934start$lambda1(ManageOutletViewModel manageOutletViewModel, OutletDetails outletDetails) {
        Log_OC.getArray(manageOutletViewModel, "this$0");
        ViewData $r2 = manageOutletViewModel.getState();
        ManageOutletViewData $r3 = (ManageOutletViewData) $r2;
        manageOutletViewModel.publish(ManageOutletViewData.copy$default($r3, false, outletDetails, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-2  reason: not valid java name */
    public static final void m39935start$lambda2(ManageOutletViewModel manageOutletViewModel, Throwable th) {
        Log_OC.getArray(manageOutletViewModel, "this$0");
        ViewData $r2 = manageOutletViewModel.getState();
        ManageOutletViewData $r3 = (ManageOutletViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        manageOutletViewModel.publish(ManageOutletViewData.copy$default($r3, false, null, (String) $r5, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ManageOutletViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ManageOutletViewData initialData() {
        ManageOutletViewData $r1 = new ManageOutletViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onSecuritySectionClicked() {
        C11280b $r1 = getCompositeDisposable();
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ManageOutletViewModel $r12 = ManageOutletViewModel.this;
                User $r32 = (User) obj;
                ManageOutletViewModel.m39927onSecuritySectionClicked$lambda7($r12, $r32);
            }
        };
        Function $r5 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        $r1.b($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewAccount(final String str) {
        Log_OC.getArray(str, "outletPhoneNumber");
        C11280b $r2 = getCompositeDisposable();
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.AndFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ManageOutletViewModel $r1 = ManageOutletViewModel.this;
                String $r22 = str;
                User $r42 = (User) obj;
                ManageOutletViewModel.m39929onViewAccount$lambda3($r1, $r22, $r42);
            }
        };
        Token $r6 = Token.FUNCTION;
        FavoritesArrayAdapter $r7 = $r4.s(object, $r6);
        $r2.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewProfile(final String str) {
        Log_OC.getArray(str, "outletPhoneNumber");
        C11280b $r2 = getCompositeDisposable();
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ManageOutletViewModel $r1 = ManageOutletViewModel.this;
                String $r22 = str;
                User $r42 = (User) obj;
                ManageOutletViewModel.m39931onViewProfile$lambda5($r1, $r22, $r42);
            }
        };
        Chunk $r6 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r7 = $r4.s(object, $r6);
        $r2.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(final String str) {
        Log_OC.getArray(str, "outletId");
        ViewData $r2 = getState();
        ManageOutletViewData $r3 = (ManageOutletViewData) $r2;
        publish(ManageOutletViewData.copy$default($r3, true, null, null, 2, null));
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ManageOutletViewModel $r1 = ManageOutletViewModel.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = ManageOutletViewModel.m39933start$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ManageOutletViewModel $r1 = ManageOutletViewModel.this;
                OutletDetails $r32 = (OutletDetails) obj;
                ManageOutletViewModel.m39934start$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ManageOutletViewModel $r1 = ManageOutletViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ManageOutletViewModel.m39935start$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "fetchCurrentUser.execute().flatMapObservable {\n            fetchOutletDetails.execute(outletId = outletId, sessionId = it.sessionId)\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false, outletDetails = it))\n            },\n            {\n                publish(state.copy(isLoading = false, outletDetailsError = parseHttpError2(\n                    \"Something went wrong, please retry\")(it)))\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }
}
