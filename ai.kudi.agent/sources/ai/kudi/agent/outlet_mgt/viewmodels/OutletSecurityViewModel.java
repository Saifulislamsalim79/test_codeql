package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.data.OutletResetPinResponse;
import ai.kudi.agent.outlet_mgt.useCases.ResetOutletPin;
import ai.kudi.agent.outlet_mgt.useCases.SuspendOutlet;
import ai.kudi.agent.outlet_mgt.useCases.UnsuspendOutlet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
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
/* compiled from: OutletSecurityViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014J&\u0010\t\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\u001c\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ\u001c\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewData;", "suspendOutlet", "Lai/kudi/agent/outlet_mgt/useCases/SuspendOutlet;", "unsuspendOutlet", "Lai/kudi/agent/outlet_mgt/useCases/UnsuspendOutlet;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "resetOutletPin", "Lai/kudi/agent/outlet_mgt/useCases/ResetOutletPin;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/outlet_mgt/useCases/SuspendOutlet;Lai/kudi/agent/outlet_mgt/useCases/UnsuspendOutlet;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/outlet_mgt/useCases/ResetOutletPin;Lai/kudi/agent/core/analytics/Analytics;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "initialData", "isInputParamsValid", "", "oldPin", "", "newPin", "confirmNewPin", "publishOutletSuspensionStatus", "", "outletSuspensionStatus", "outletId", "action", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletSecurityViewModel extends BaseViewModel<OutletSecurityViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final ResetOutletPin resetOutletPin;
    private final SuspendOutlet suspendOutlet;
    private final UnsuspendOutlet unsuspendOutlet;

    public OutletSecurityViewModel(SuspendOutlet suspendOutlet, UnsuspendOutlet unsuspendOutlet, FetchCurrentUser fetchCurrentUser, ResetOutletPin resetOutletPin, Analytics analytics) {
        Log_OC.getArray(suspendOutlet, "suspendOutlet");
        Log_OC.getArray(unsuspendOutlet, "unsuspendOutlet");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(resetOutletPin, "resetOutletPin");
        Log_OC.getArray(analytics, "analytics");
        this.suspendOutlet = suspendOutlet;
        this.unsuspendOutlet = unsuspendOutlet;
        this.fetchCurrentUser = fetchCurrentUser;
        this.resetOutletPin = resetOutletPin;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInputParamsValid(String str, String str2, String str3) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r4 = getState();
            OutletSecurityViewData $r5 = (OutletSecurityViewData) $r4;
            OutletResetPinError $r6 = new OutletResetPinError("Please enter old pin", null, null, null, 14, null);
            publish(OutletSecurityViewData.copy$default($r5, false, false, null, null, false, null, $r6, 63, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r42 = getState();
            OutletSecurityViewData $r52 = (OutletSecurityViewData) $r42;
            OutletResetPinError $r62 = new OutletResetPinError(null, "Please enter old pin", null, null, 13, null);
            publish(OutletSecurityViewData.copy$default($r52, false, false, null, null, false, null, $r62, 63, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r43 = getState();
            OutletSecurityViewData $r53 = (OutletSecurityViewData) $r43;
            OutletResetPinError $r63 = new OutletResetPinError(null, null, null, "Please enter old pin", 7, null);
            publish(OutletSecurityViewData.copy$default($r53, false, false, null, null, false, null, $r63, 63, null));
            return false;
        }
        boolean $z04 = Log_OC.append(str2, str3);
        if ($z04) {
            return true;
        }
        ViewData $r44 = getState();
        OutletSecurityViewData $r54 = (OutletSecurityViewData) $r44;
        OutletResetPinError $r64 = new OutletResetPinError(null, "Both pins must be the same", null, "Both pins must be the same", 5, null);
        publish(OutletSecurityViewData.copy$default($r54, false, false, null, null, false, null, $r64, 63, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetOutletPin$lambda-6  reason: not valid java name */
    public static final InterfaceC11692s m39954resetOutletPin$lambda6(OutletSecurityViewModel outletSecurityViewModel, String str, String str2, String str3, User user) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(str2, "$oldPin");
        Log_OC.getArray(str3, "$newPin");
        Log_OC.getArray(user, "it");
        Analytics $r5 = outletSecurityViewModel.analytics;
        String $r6 = user.getPhoneNumber();
        Log_OC.loadImage($r6, "it.phoneNumber");
        $r5.onClickOutletPinReset($r6);
        ResetOutletPin $r7 = outletSecurityViewModel.resetOutletPin;
        String $r62 = user.getSessionId();
        Log_OC.loadImage($r62, "it.sessionId");
        AbstractC11688p $r8 = $r7.execute(str, $r62, str2, str3);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetOutletPin$lambda-7  reason: not valid java name */
    public static final void m39955resetOutletPin$lambda7(OutletSecurityViewModel outletSecurityViewModel, OutletResetPinResponse outletResetPinResponse) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        ViewData $r2 = outletSecurityViewModel.getState();
        OutletSecurityViewData $r3 = (OutletSecurityViewData) $r2;
        outletSecurityViewModel.publish(OutletSecurityViewData.copy$default($r3, false, false, null, null, false, outletResetPinResponse, null, 93, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetOutletPin$lambda-8  reason: not valid java name */
    public static final void m39956resetOutletPin$lambda8(OutletSecurityViewModel outletSecurityViewModel, Throwable th) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        ViewData $r2 = outletSecurityViewModel.getState();
        OutletSecurityViewData $r3 = (OutletSecurityViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Unable to perform pin reset", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        OutletResetPinError $r4 = new OutletResetPinError(null, null, (String) $r6, null, 11, null);
        outletSecurityViewModel.publish(OutletSecurityViewData.copy$default($r3, false, false, null, null, false, null, $r4, 61, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: suspendOutlet$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39957suspendOutlet$lambda0(C11812w c11812w, OutletSecurityViewModel outletSecurityViewModel, String str, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        SuspendOutlet $r4 = outletSecurityViewModel.suspendOutlet;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.execute($r5, str);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: suspendOutlet$lambda-1  reason: not valid java name */
    public static final void m39958suspendOutlet$lambda1(OutletSecurityViewModel outletSecurityViewModel, InterfaceC11756a interfaceC11756a, C11812w c11812w, Outlet outlet) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        Log_OC.getArray(interfaceC11756a, "$action");
        Log_OC.getArray(c11812w, "$user");
        ViewData $r4 = outletSecurityViewModel.getState();
        OutletSecurityViewData $r5 = (OutletSecurityViewData) $r4;
        outletSecurityViewModel.publish(OutletSecurityViewData.copy$default($r5, false, false, null, null, false, null, null, 126, null));
        interfaceC11756a.invoke();
        Analytics $r6 = outletSecurityViewModel.analytics;
        Object $r7 = c11812w.f26499c;
        Log_OC.append($r7);
        User $r8 = (User) $r7;
        String $r9 = $r8.getPhoneNumber();
        Log_OC.loadImage($r9, "user!!.phoneNumber");
        $r6.onSuspendOutlet($r9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: suspendOutlet$lambda-2  reason: not valid java name */
    public static final void m39959suspendOutlet$lambda2(OutletSecurityViewModel outletSecurityViewModel, C11812w c11812w, Throwable th) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Analytics $r4 = outletSecurityViewModel.analytics;
        Object $r5 = c11812w.f26499c;
        Log_OC.append($r5);
        User $r6 = (User) $r5;
        String $r7 = $r6.getPhoneNumber();
        Log_OC.loadImage($r7, "user!!.phoneNumber");
        $r4.onSuspendOutlet($r7, false);
        ViewData $r8 = outletSecurityViewModel.getState();
        InterfaceC11767l $r10 = KudiErrorParserKt.parseHttpError2$default("Error Suspending Outlet", null, 2, null);
        Log_OC.loadImage(th, "it");
        SuspendError $r2 = new SuspendError((String) $r10.invoke(th), null, 2, null);
        OutletSecurityViewData $r9 = OutletSecurityViewData.copy$default((OutletSecurityViewData) $r8, false, false, $r2, null, false, null, null, 122, null);
        outletSecurityViewModel.publish($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: unsuspendOutlet$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m39960unsuspendOutlet$lambda3(OutletSecurityViewModel outletSecurityViewModel, String str, User user) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(user, "it");
        UnsuspendOutlet $r3 = outletSecurityViewModel.unsuspendOutlet;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, str);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: unsuspendOutlet$lambda-4  reason: not valid java name */
    public static final void m39961unsuspendOutlet$lambda4(OutletSecurityViewModel outletSecurityViewModel, InterfaceC11756a interfaceC11756a, Outlet outlet) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        Log_OC.getArray(interfaceC11756a, "$action");
        ViewData $r3 = outletSecurityViewModel.getState();
        OutletSecurityViewData $r4 = (OutletSecurityViewData) $r3;
        outletSecurityViewModel.publish(OutletSecurityViewData.copy$default($r4, false, false, null, null, false, null, null, 111, null));
        interfaceC11756a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: unsuspendOutlet$lambda-5  reason: not valid java name */
    public static final void m39962unsuspendOutlet$lambda5(OutletSecurityViewModel outletSecurityViewModel, Throwable th) {
        Log_OC.getArray(outletSecurityViewModel, "this$0");
        SuspendError $r1 = new SuspendError(null, "Error Unsuspending Outlet", 1, null);
        ViewData $r3 = outletSecurityViewModel.getState();
        OutletSecurityViewData $r4 = OutletSecurityViewData.copy$default((OutletSecurityViewData) $r3, false, false, $r1, null, false, null, null, 107, null);
        outletSecurityViewModel.publish($r4);
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
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OutletSecurityViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OutletSecurityViewData initialData() {
        OutletSecurityViewData $r1 = new OutletSecurityViewData(false, false, null, null, false, null, null, 127, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishOutletSuspensionStatus(String str) {
        Log_OC.getArray(str, "outletSuspensionStatus");
        STATUS $r2 = STATUS.APPROVED;
        String $r3 = $r2.name();
        boolean $z0 = Log_OC.append(str, $r3);
        if ($z0) {
            ViewData $r4 = getState();
            Boolean $r6 = Boolean.FALSE;
            OutletSecurityViewData $r5 = OutletSecurityViewData.copy$default((OutletSecurityViewData) $r4, false, false, null, $r6, false, null, null, 119, null);
            publish($r5);
            return;
        }
        ViewData $r42 = getState();
        OutletSecurityViewData $r52 = (OutletSecurityViewData) $r42;
        Boolean $r62 = Boolean.TRUE;
        publish(OutletSecurityViewData.copy$default($r52, false, false, null, $r62, false, null, null, 119, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resetOutletPin(final String str, final String str2, final String str3, String str4) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(str2, "oldPin");
        Log_OC.getArray(str3, "newPin");
        Log_OC.getArray(str4, "confirmNewPin");
        boolean $z0 = isInputParamsValid(str2, str3, str4);
        if ($z0) {
            ViewData $r5 = getState();
            OutletSecurityViewData $r6 = (OutletSecurityViewData) $r5;
            publish(OutletSecurityViewData.copy$default($r6, false, true, null, null, false, null, null, 61, null));
            FetchCurrentUser $r7 = this.fetchCurrentUser;
            AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
            AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.MethodWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                    String $r2 = str;
                    String $r3 = str2;
                    String $r4 = str3;
                    User $r72 = (User) obj;
                    InterfaceC11692s $r52 = OutletSecurityViewModel.m39954resetOutletPin$lambda6($r1, $r2, $r3, $r4, $r72);
                    return $r52;
                }
            });
            FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Call
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                    OutletResetPinResponse $r3 = (OutletResetPinResponse) obj;
                    OutletSecurityViewModel.m39955resetOutletPin$lambda7($r1, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.FromMatchesFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    OutletSecurityViewModel.m39956resetOutletPin$lambda8($r1, $r3);
                }
            });
            Log_OC.loadImage($r13, "fetchCurrentUser.execute().flatMapObservable {\n            analytics.onClickOutletPinReset(it.phoneNumber)\n            resetOutletPin.execute(outletId = outletId, sessionId = it.sessionId, oldPin = oldPin, newPin = newPin)\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false, resetPinResponse = it))\n            },\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        outletResetPinError = OutletResetPinError(message = parseHttpError2(\"Unable to perform pin reset\")(it))\n                    )\n                )\n            }\n        )");
            C11280b $r14 = getCompositeDisposable();
            RxExtKt.addTo($r13, $r14);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void suspendOutlet(final String str, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(interfaceC11756a, "action");
        ViewData $r3 = getState();
        OutletSecurityViewData $r4 = (OutletSecurityViewData) $r3;
        publish(OutletSecurityViewData.copy$default($r4, true, false, null, null, false, null, null, 122, null));
        final C11812w $r5 = new C11812w();
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                OutletSecurityViewModel $r2 = this;
                String $r32 = str;
                User $r62 = (User) obj;
                InterfaceC11692s $r42 = OutletSecurityViewModel.m39957suspendOutlet$lambda0($r1, $r2, $r32, $r62);
                return $r42;
            }
        });
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.DynamicTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                InterfaceC11756a $r2 = interfaceC11756a;
                C11812w $r32 = $r5;
                Outlet $r52 = (Outlet) obj;
                OutletSecurityViewModel.m39958suspendOutlet$lambda1($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                C11812w $r2 = $r5;
                Throwable $r42 = (Throwable) obj;
                OutletSecurityViewModel.m39959suspendOutlet$lambda2($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r12, "fetchCurrentUser.execute().flatMapObservable {\n            user = it\n            suspendOutlet.execute(sessionId = it.sessionId, outletId = outletId)\n        }.subscribe(\n            {\n                publish(state.copy(isSuspendingOutlet = false))\n                action()\n                analytics.onSuspendOutlet(user!!.phoneNumber, true)\n            },\n            {\n                analytics.onSuspendOutlet(user!!.phoneNumber, false)\n                publish(state.copy(isSuspendingOutlet = false, error = SuspendError(suspendError = parseHttpError2(\"Error Suspending Outlet\")(it))))\n            }\n        )");
        C11280b $r13 = getCompositeDisposable();
        RxExtKt.addTo($r12, $r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void unsuspendOutlet(final String str, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(interfaceC11756a, "action");
        ViewData $r3 = getState();
        OutletSecurityViewData $r4 = (OutletSecurityViewData) $r3;
        publish(OutletSecurityViewData.copy$default($r4, false, false, null, null, true, null, null, 107, null));
        FetchCurrentUser $r5 = this.fetchCurrentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = OutletSecurityViewModel.m39960unsuspendOutlet$lambda3($r1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.FieldWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                InterfaceC11756a $r2 = interfaceC11756a;
                Outlet $r42 = (Outlet) obj;
                OutletSecurityViewModel.m39961unsuspendOutlet$lambda4($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletSecurityViewModel $r1 = OutletSecurityViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OutletSecurityViewModel.m39962unsuspendOutlet$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r11, "fetchCurrentUser.execute().flatMapObservable {\n            unsuspendOutlet.execute(sessionId = it.sessionId, outletId = outletId)\n        }.subscribe(\n            {\n                publish(state.copy(isUnsuspendingOutlet = false))\n                action()\n            },\n            {\n                publish(state.copy(isUnsuspendingOutlet = false, error = SuspendError(unsuspendError = \"Error Unsuspending Outlet\")))\n            }\n        )");
        C11280b $r12 = getCompositeDisposable();
        RxExtKt.addTo($r11, $r12);
    }
}
