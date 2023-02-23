package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDeclineResponse;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDelinerequest;
import ai.kudi.agent.outlet_mgt.useCases.AcceptOrDeclineLinkingRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
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
/* compiled from: OutletMgtAcceptDeclineVm.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtAcceptDeclineVm;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtAcceptDeclineVd;", "acceptOrDeclineLinkingRequest", "Lai/kudi/agent/outlet_mgt/useCases/AcceptOrDeclineLinkingRequest;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/outlet_mgt/useCases/AcceptOrDeclineLinkingRequest;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "acceptOrDeclineOutletView", "", "pin", "", TransactionField.STATUS, "id", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtAcceptDeclineVm extends BaseViewModel<OutletMgtAcceptDeclineVd> {
    private final AcceptOrDeclineLinkingRequest acceptOrDeclineLinkingRequest;
    private final FetchCurrentUser fetchCurrentUser;

    public OutletMgtAcceptDeclineVm(AcceptOrDeclineLinkingRequest acceptOrDeclineLinkingRequest, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(acceptOrDeclineLinkingRequest, "acceptOrDeclineLinkingRequest");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.acceptOrDeclineLinkingRequest = acceptOrDeclineLinkingRequest;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: acceptOrDeclineOutletView$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39945acceptOrDeclineOutletView$lambda0(OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm, String str, String str2, String str3, User user) {
        Log_OC.getArray(outletMgtAcceptDeclineVm, "this$0");
        Log_OC.getArray(str, "$pin");
        Log_OC.getArray(str2, "$status");
        Log_OC.getArray(str3, "$id");
        Log_OC.getArray(user, "it");
        AcceptOrDeclineLinkingRequest $r5 = outletMgtAcceptDeclineVm.acceptOrDeclineLinkingRequest;
        OutletMgtAcceptDelinerequest $r6 = new OutletMgtAcceptDelinerequest(str, str2);
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r7 = $r5.execute($r6, str3, $r3);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: acceptOrDeclineOutletView$lambda-1  reason: not valid java name */
    public static final void m39946acceptOrDeclineOutletView$lambda1(OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm, OutletMgtAcceptDeclineResponse outletMgtAcceptDeclineResponse) {
        Log_OC.getArray(outletMgtAcceptDeclineVm, "this$0");
        ViewData $r2 = outletMgtAcceptDeclineVm.getState();
        OutletMgtAcceptDeclineVd $r3 = (OutletMgtAcceptDeclineVd) $r2;
        outletMgtAcceptDeclineVm.publish(OutletMgtAcceptDeclineVd.copy$default($r3, false, outletMgtAcceptDeclineResponse, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: acceptOrDeclineOutletView$lambda-2  reason: not valid java name */
    public static final void m39947acceptOrDeclineOutletView$lambda2(OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm, Throwable th) {
        Log_OC.getArray(outletMgtAcceptDeclineVm, "this$0");
        ViewData $r2 = outletMgtAcceptDeclineVm.getState();
        OutletMgtAcceptDeclineVd $r3 = (OutletMgtAcceptDeclineVd) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Couldn't process request", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        outletMgtAcceptDeclineVm.publish(OutletMgtAcceptDeclineVd.copy$default($r3, false, null, (String) $r5, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void acceptOrDeclineOutletView(final String str, final String str2, final String str3) {
        Log_OC.getArray(str, "pin");
        Log_OC.getArray(str2, TransactionField.STATUS);
        Log_OC.getArray(str3, "id");
        ViewData $r4 = getState();
        OutletMgtAcceptDeclineVd $r5 = (OutletMgtAcceptDeclineVd) $r4;
        publish(OutletMgtAcceptDeclineVd.copy$default($r5, true, null, null, 2, null));
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OutletMgtAcceptDeclineVm $r1 = OutletMgtAcceptDeclineVm.this;
                String $r2 = str;
                String $r3 = str2;
                String $r42 = str3;
                User $r72 = (User) obj;
                InterfaceC11692s $r52 = OutletMgtAcceptDeclineVm.m39945acceptOrDeclineOutletView$lambda0($r1, $r2, $r3, $r42, $r72);
                return $r52;
            }
        });
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletMgtAcceptDeclineVm $r1 = OutletMgtAcceptDeclineVm.this;
                OutletMgtAcceptDeclineResponse $r3 = (OutletMgtAcceptDeclineResponse) obj;
                OutletMgtAcceptDeclineVm.m39946acceptOrDeclineOutletView$lambda1($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OutletMgtAcceptDeclineVm $r1 = OutletMgtAcceptDeclineVm.this;
                Throwable $r3 = (Throwable) obj;
                OutletMgtAcceptDeclineVm.m39947acceptOrDeclineOutletView$lambda2($r1, $r3);
            }
        });
        Log_OC.loadImage($r12, "fetchCurrentUser.execute().flatMapObservable {\n            acceptOrDeclineLinkingRequest.execute(\n                OutletMgtAcceptDelinerequest(pin = pin, status = status), id,\n                sessionId = it.sessionId\n            )\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false, outletMgtAcceptDeclineResponse = it))\n            },\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        errorMessage = parseHttpError2(\"Couldn't process request\")(it)\n                    )\n                )\n            }\n        )");
        C11280b $r13 = getCompositeDisposable();
        RxExtKt.addTo($r12, $r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OutletMgtAcceptDeclineVd $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OutletMgtAcceptDeclineVd initialData() {
        OutletMgtAcceptDeclineVd $r1 = new OutletMgtAcceptDeclineVd(false, null, null, 7, null);
        return $r1;
    }
}
