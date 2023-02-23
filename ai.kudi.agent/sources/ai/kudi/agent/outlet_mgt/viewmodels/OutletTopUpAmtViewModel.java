package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.useCases.PerformOutletTopUp;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
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
/* compiled from: OutletTopUpAmtViewModel.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016J8\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/viewmodels/OutletTopUpAmtViewModel;", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletTopUpAmtViewData;", "performOutletTopUp", "Lai/kudi/agent/outlet_mgt/useCases/PerformOutletTopUp;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/outlet_mgt/useCases/PerformOutletTopUp;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "initialData", "performTopUp", "", TransactionField.AMOUNT, "", "outletId", "", "onSuccessAction", "Lkotlin/Function0;", "onErrorAction", "Lkotlin/Function1;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletTopUpAmtViewModel extends BaseAmountInputViewModel<OutletTopUpAmtViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final PerformOutletTopUp performOutletTopUp;

    public OutletTopUpAmtViewModel(PerformOutletTopUp performOutletTopUp, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(performOutletTopUp, "performOutletTopUp");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.performOutletTopUp = performOutletTopUp;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performTopUp$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39964performTopUp$lambda0(OutletTopUpAmtViewModel outletTopUpAmtViewModel, String str, int i, User user) {
        Log_OC.getArray(outletTopUpAmtViewModel, "this$0");
        Log_OC.getArray(str, "$outletId");
        Log_OC.getArray(user, "it");
        PerformOutletTopUp $r3 = outletTopUpAmtViewModel.performOutletTopUp;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, str, i);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performTopUp$lambda-1  reason: not valid java name */
    public static final void m39965performTopUp$lambda1(InterfaceC11756a interfaceC11756a, Object obj) {
        Log_OC.getArray(interfaceC11756a, "$onSuccessAction");
        interfaceC11756a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performTopUp$lambda-2  reason: not valid java name */
    public static final void m39966performTopUp$lambda2(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onErrorAction");
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        interfaceC11767l.invoke($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OutletTopUpAmtViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OutletTopUpAmtViewData initialData() {
        OutletTopUpAmtViewData $r1 = new OutletTopUpAmtViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performTopUp(final int i, final String str, final InterfaceC11756a interfaceC11756a, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(interfaceC11756a, "onSuccessAction");
        Log_OC.getArray(interfaceC11767l, "onErrorAction");
        ViewData $r4 = getState();
        OutletTopUpAmtViewData $r5 = (OutletTopUpAmtViewData) $r4;
        publish(OutletTopUpAmtViewData.copy$default($r5, true, null, null, 4, null));
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.SignatureWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OutletTopUpAmtViewModel $r1 = OutletTopUpAmtViewModel.this;
                String $r2 = str;
                int $i0 = i;
                User $r52 = (User) obj;
                InterfaceC11692s $r3 = OutletTopUpAmtViewModel.m39964performTopUp$lambda0($r1, $r2, $i0, $r52);
                return $r3;
            }
        });
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11756a $r2 = InterfaceC11756a.this;
                OutletTopUpAmtViewModel.m39965performTopUp$lambda1($r2, obj);
            }
        }, new Object() { // from class: ai.kudi.agent.outlet_mgt.viewmodels.Composer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                OutletTopUpAmtViewModel.m39966performTopUp$lambda2($r1, $r3);
            }
        });
        Log_OC.loadImage($r12, "fetchCurrentUser.execute().flatMapObservable {\n            performOutletTopUp.execute(\n                sessionId = it.sessionId,\n                outletId = outletId,\n                amount = amount\n            )\n        }.subscribe(\n            {\n                onSuccessAction()\n            },\n            {\n                onErrorAction(parseHttpError2(\"Something went wrong, please retry\")(it))\n            }\n        )");
        C11280b $r13 = getCompositeDisposable();
        RxExtKt.addTo($r12, $r13);
    }
}
