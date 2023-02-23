package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.useCases.BuzzPendingOutlet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletLinkingBuzzAgentViewModel.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel$OutletLinkingBuzzAgentViewData;", "buzzPendingOutlet", "Lai/kudi/agent/outlet_mgt/useCases/BuzzPendingOutlet;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/useCases/BuzzPendingOutlet;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "", "outletId", "", "action", "Lkotlin/Function0;", "initialData", "OutletLinkingBuzzAgentViewData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletLinkingBuzzAgentViewModel extends BaseViewModel<OutletLinkingBuzzAgentViewData> {
    private final Analytics analytics;
    private final BuzzPendingOutlet buzzPendingOutlet;
    private final FetchCurrentUser fetchCurrentUser;

    /* compiled from: OutletLinkingBuzzAgentViewModel.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel$OutletLinkingBuzzAgentViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "isLoading", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "(ZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OutletLinkingBuzzAgentViewData implements ViewData {
        private final String error;
        private final boolean isLoading;

        public OutletLinkingBuzzAgentViewData() {
            this(false, null, 3, null);
        }

        public OutletLinkingBuzzAgentViewData(boolean z, String str) {
            this.isLoading = z;
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
        public /* synthetic */ OutletLinkingBuzzAgentViewData(boolean r2, java.lang.String r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingBuzzAgentViewModel.OutletLinkingBuzzAgentViewData.<init>(boolean, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ OutletLinkingBuzzAgentViewData copy$default(OutletLinkingBuzzAgentViewData outletLinkingBuzzAgentViewData, boolean $z0, String $r1, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = outletLinkingBuzzAgentViewData.isLoading;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r1 = outletLinkingBuzzAgentViewData.error;
            }
            OutletLinkingBuzzAgentViewData $r0 = outletLinkingBuzzAgentViewData.copy($z0, $r1);
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
        public final String component2() {
            String r1 = this.error;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletLinkingBuzzAgentViewData copy(boolean z, String str) {
            OutletLinkingBuzzAgentViewData $r0 = new OutletLinkingBuzzAgentViewData(z, str);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof OutletLinkingBuzzAgentViewData;
            if ($z0) {
                OutletLinkingBuzzAgentViewData $r2 = (OutletLinkingBuzzAgentViewData) obj;
                boolean $z1 = this.isLoading;
                boolean $z02 = $r2.isLoading;
                if ($z1 != $z02) {
                    return false;
                }
                String $r3 = this.error;
                String $r4 = $r2.error;
                boolean $z03 = Log_OC.append($r3, $r4);
                return $z03;
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
        public int hashCode() {
            boolean $z0 = this.isLoading;
            if ($z0) {
                $z0 = true;
            }
            int $i1 = $z0 ? 1 : 0;
            int $i12 = $i1 * 31;
            String $r1 = this.error;
            int $i0 = $r1 == null ? 0 : $r1.hashCode();
            return $i12 + $i0;
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
            $r2.append("OutletLinkingBuzzAgentViewData(isLoading=");
            boolean $z0 = this.isLoading;
            $r2.append($z0);
            $r2.append(", error=");
            String $r1 = this.error;
            $r2.append((Object) $r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    public OutletLinkingBuzzAgentViewModel(BuzzPendingOutlet buzzPendingOutlet, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(buzzPendingOutlet, "buzzPendingOutlet");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.buzzPendingOutlet = buzzPendingOutlet;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buzzPendingOutlet$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39937buzzPendingOutlet$lambda0(OutletLinkingBuzzAgentViewModel outletLinkingBuzzAgentViewModel, String str, User user) {
        Log_OC.getArray(outletLinkingBuzzAgentViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(user, "it");
        Analytics $r3 = outletLinkingBuzzAgentViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        $r3.onBuzzAgentClicked($r4, str);
        BuzzPendingOutlet $r5 = outletLinkingBuzzAgentViewModel.buzzPendingOutlet;
        String $r42 = user.getSessionId();
        Log_OC.loadImage($r42, "it.sessionId");
        AbstractC11688p $r6 = $r5.execute($r42, str);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buzzPendingOutlet$lambda-1  reason: not valid java name */
    public static final void m39938buzzPendingOutlet$lambda1(OutletLinkingBuzzAgentViewModel outletLinkingBuzzAgentViewModel, InterfaceC11756a interfaceC11756a, Outlet outlet) {
        Log_OC.getArray(outletLinkingBuzzAgentViewModel, "this$0");
        Log_OC.getArray(interfaceC11756a, "$action");
        ViewData $r3 = outletLinkingBuzzAgentViewModel.getState();
        OutletLinkingBuzzAgentViewData $r4 = (OutletLinkingBuzzAgentViewData) $r3;
        outletLinkingBuzzAgentViewModel.publish(OutletLinkingBuzzAgentViewData.copy$default($r4, false, null, 2, null));
        interfaceC11756a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buzzPendingOutlet$lambda-2  reason: not valid java name */
    public static final void m39939buzzPendingOutlet$lambda2(OutletLinkingBuzzAgentViewModel outletLinkingBuzzAgentViewModel, Throwable th) {
        Log_OC.getArray(outletLinkingBuzzAgentViewModel, "this$0");
        ViewData $r2 = outletLinkingBuzzAgentViewModel.getState();
        OutletLinkingBuzzAgentViewData $r3 = (OutletLinkingBuzzAgentViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Couldn't send notification", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        outletLinkingBuzzAgentViewModel.publish($r3.copy(false, $r6));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void buzzPendingOutlet(final String str, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(interfaceC11756a, "action");
        ViewData $r3 = getState();
        OutletLinkingBuzzAgentViewData $r4 = (OutletLinkingBuzzAgentViewData) $r3;
        publish($r4.copy(true, null));
        FetchCurrentUser $r5 = this.fetchCurrentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OutletLinkingBuzzAgentViewModel $r1 = OutletLinkingBuzzAgentViewModel.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = OutletLinkingBuzzAgentViewModel.m39937buzzPendingOutlet$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletLinkingBuzzAgentViewModel $r1 = OutletLinkingBuzzAgentViewModel.this;
                InterfaceC11756a $r2 = interfaceC11756a;
                Outlet $r42 = (Outlet) obj;
                OutletLinkingBuzzAgentViewModel.m39938buzzPendingOutlet$lambda1($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletLinkingBuzzAgentViewModel $r1 = OutletLinkingBuzzAgentViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OutletLinkingBuzzAgentViewModel.m39939buzzPendingOutlet$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r11, "fetchCurrentUser.execute().flatMapObservable {\n            analytics.onBuzzAgentClicked(userPhoneNumber = it.phoneNumber, outletId = outletId)\n            buzzPendingOutlet.execute(it.sessionId, outletId)\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false))\n                action()\n            },\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = parseHttpError2(\"Couldn't send notification\")(it)\n                    )\n                )\n            }\n        )");
        C11280b $r12 = getCompositeDisposable();
        RxExtKt.addTo($r11, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OutletLinkingBuzzAgentViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OutletLinkingBuzzAgentViewData initialData() {
        OutletLinkingBuzzAgentViewData $r1 = new OutletLinkingBuzzAgentViewData(false, null, 3, null);
        return $r1;
    }
}
