package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.model.RenewSavingRequest;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RenewSaving.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/savings/usecase/RenewSaving;", "", "service", "Lai/kudi/agent/savings/data/api/SavingsApi;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/savings/data/api/SavingsApi;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "continuePlan", "Lio/reactivex/Observable;", "Lai/kudi/agent/savings/data/model/SavingResponse;", "renewSavingRequest", "Lai/kudi/agent/savings/data/model/RenewSavingRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RenewSaving {
    private final FetchCurrentUser currentUser;
    private final RxSchedulers rxSchedulers;
    private final SavingsApi service;

    public RenewSaving(SavingsApi savingsApi, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        Log_OC.getArray(savingsApi, "service");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.service = savingsApi;
        this.currentUser = fetchCurrentUser;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: continuePlan$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40576continuePlan$lambda0(RenewSaving renewSaving, RenewSavingRequest renewSavingRequest, User user) {
        Log_OC.getArray(renewSaving, "this$0");
        Log_OC.getArray(renewSavingRequest, "$renewSavingRequest");
        Log_OC.getArray(user, "it");
        SavingsApi $r3 = renewSaving.service;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.renewSavings($r4, renewSavingRequest);
        RxSchedulers $r6 = renewSaving.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        return $r5.h0($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: continuePlan$lambda-1  reason: not valid java name */
    public static final SavingResponse m40577continuePlan$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        SavingResponse $r2 = (SavingResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p continuePlan(final RenewSavingRequest renewSavingRequest) {
        Log_OC.getArray(renewSavingRequest, "renewSavingRequest");
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.usecase.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RenewSaving $r1 = RenewSaving.this;
                RenewSavingRequest $r22 = renewSavingRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = RenewSaving.m40576continuePlan$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        Token $r6 = Token.BOOL;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        AbstractC11688p $r53 = $r52.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        p425j.p444e.Item $r82 = $r72.main();
        AbstractC11688p $r54 = $r53.R($r82);
        Log_OC.loadImage($r54, "currentUser.execute().flatMapObservable {\n            service.renewSavings(it.sessionId, renewSavingRequest).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r54;
    }
}
